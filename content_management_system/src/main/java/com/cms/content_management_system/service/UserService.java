package com.cms.content_management_system.service;

import com.cms.content_management_system.entity.User;
import com.cms.content_management_system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Integer uId) {
        return userRepository.findById(uId).orElse(null);
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void deleteUserById(Integer uId) {
        userRepository.deleteById(uId);
    }
}