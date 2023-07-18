package com.mocktest.service.impl;

import com.mocktest.model.user.User;
import com.mocktest.model.user.UserRole;
import com.mocktest.repository.RoleRepository;
import com.mocktest.repository.UserRepository;
import com.mocktest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User createUser(User user, Set<UserRole> userRoleSet) {
        System.out.println(userRoleSet);

        User checking=this.userRepository.findByEmail(user.getEmail());

        if (checking != null){
            System.out.println("user already present...");
            throw new RuntimeException("user email already present!!!");
        }else {
            for (UserRole x:userRoleSet){
                roleRepository.save(x.getRole());
            }
            user.getUserRoles().addAll(userRoleSet);
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            user.setCnfpassword(passwordEncoder.encode(user.getCnfpassword()));
            checking=this.userRepository.save(user);
            System.out.println(checking);
            System.out.println("user inserted success...");
        }
        return checking;
    }

    @Override
    public List<User> getUsers() {
        return this.userRepository.findAll();
    }

}
