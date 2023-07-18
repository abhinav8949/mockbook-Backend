package com.mocktest;

import com.mocktest.model.user.Role;
import com.mocktest.model.user.User;
import com.mocktest.model.user.UserRole;
import com.mocktest.service.UserService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class MocktestBackendApplication implements CommandLineRunner {
	@Autowired
	private UserService userService;
	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(MocktestBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("App running on port: 8182.....");

//		try{
//			User user = new User();
//
//			user.setFname("Mockbook");
//			user.setLname("Team2");
//			user.setEmail("******@gmail.com");
//			user.setPassword(passwordEncoder.encode("12345"));
//			user.setPhone("657765577");
//
//			Role role1=new Role();
//			role1.setId(2L);
//			role1.setRoleName("admin");
//
//			Set<UserRole> userRoleSet=new HashSet<>();
//			UserRole userRole=new UserRole();
//			userRole.setRole(role1);
//			userRole.setUser(user);
//
//			userRoleSet.add(userRole);
//
//			User user1 = this.userService.createUser(user, userRoleSet);
//			System.out.println(user1.getUsername());
//
//		}catch (Exception e){
//			e.printStackTrace();
//		}
	}
}
