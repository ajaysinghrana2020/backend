package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.model.UserRole;

import java.util.Set;

public interface UserService {
    public User createUser(User user, Set<UserRole> userRoles);
}
