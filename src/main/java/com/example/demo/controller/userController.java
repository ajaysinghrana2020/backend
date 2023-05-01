package com.example.demo.controller;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.model.UserRole;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController()
@RequestMapping("/user")
public class userController {
    @Autowired
    private UserService userService;
    @PostMapping("/")
    public User createUser(@RequestBody User user){
        Set<UserRole> roles=new HashSet<>();

        Role role =new Role();
        role.setRoleId(2L);
        role.setRoleName("Normal");

        UserRole userRole= new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);
        roles.add(userRole);

        return this.userService.createUser(user,roles);


    }
}
