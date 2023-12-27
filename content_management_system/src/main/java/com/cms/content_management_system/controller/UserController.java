package com.cms.content_management_system.controller;

import com.cms.content_management_system.entity.User;
import com.cms.content_management_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/{uId}")
    public User getUserById(@PathVariable Integer uId) {
        return userService.getUserById(uId);
    }
    @PostMapping
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }
    @DeleteMapping("/{uId}")
    public void deleteUser(@PathVariable Integer uId) {
        userService.deleteUserById(uId);
    }

}
