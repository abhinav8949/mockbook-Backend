package com.mocktest.controller.authcontroller;

import com.mocktest.model.auth.JwtRequest;
import com.mocktest.model.auth.JwtResponse;
import com.mocktest.model.user.Role;
import com.mocktest.model.user.User;
import com.mocktest.model.user.UserRole;
import com.mocktest.security.JwtHelper;
import com.mocktest.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.HashSet;
import java.util.Set;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private AuthenticationManager manager;
    @Autowired
    private JwtHelper helper;
    @Autowired
    private UserService userService;
    private Logger logger = LoggerFactory.getLogger(AuthController.class);
    @Operation(summary = "Login credential to get token", description = "Login with valid email and password then get Bearer Token.")
    @PostMapping("/login")
    public ResponseEntity<JwtResponse> login(@RequestBody JwtRequest request) {

        this.doAuthenticate(request.getEmail(), request.getPassword());
        UserDetails userDetails = userDetailsService.loadUserByUsername(request.getEmail());
        System.out.println(userDetails);
        String token = this.helper.generateToken(userDetails);
        System.out.println("Token: "+token);
        JwtResponse response = JwtResponse.builder()
                .token(token)
                .username(userDetails.getUsername()).build();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    private void doAuthenticate(String email, String password) {

        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(email, password);
        try {
            manager.authenticate(authentication);
        } catch (BadCredentialsException e) {
            e.printStackTrace();
            throw new BadCredentialsException(" Invalid Username or Password  !!");
        }
    }

    @ExceptionHandler(BadCredentialsException.class)
    public String exceptionHandler() {
        return "Credentials Invalid !!";
    }
    @Operation(summary = "SignUp user.", description = "SignUp with valid details.")
    @PostMapping("/create")
    public User saveNewUser(@RequestBody User user) throws Exception {

        Set<UserRole> userRoleSet=new HashSet<>();

        Role role=new Role();
        role.setId(44L);
        role.setRoleName("ROLE_NORMAL");

        UserRole userRole=new UserRole();
        userRole.setRole(role);
        userRole.setUser(user);

        userRoleSet.add(userRole);

        return this.userService.createUser(user, userRoleSet);
    }
    @Operation(summary = "Get Current User in sessions")
    @GetMapping("/current-user")
    public User getLoggedUser(Principal principal){
        return (User) this.userDetailsService.loadUserByUsername(principal.getName());
    }
    @Operation(summary = "AUTH Testing-API")
    @GetMapping("/testing")
    public String testing(){
        return "This is JWT-auth testing, works nice...!";
    }

}
