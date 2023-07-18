package com.mocktest.controller.usercontroller;

import com.mocktest.model.user.User;
import com.mocktest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:4200/")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserDetailsService userDetailsService;
    @GetMapping("/")
    public List<User> getAllUser(){
        return userService.getUsers();
    }

}
