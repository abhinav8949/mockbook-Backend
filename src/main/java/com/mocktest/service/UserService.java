package com.mocktest.service;

import com.mocktest.model.user.User;
import com.mocktest.model.user.UserRole;

import java.util.List;
import java.util.Set;

public interface UserService {

    User createUser(User user, Set<UserRole> userRoleSet) throws Exception;
    List<User> getUsers();
}
