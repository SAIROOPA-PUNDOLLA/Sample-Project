package com.example.Sample.project.Services;


import com.example.Sample.project.Models.User;
import com.example.Sample.project.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public static String addUser(User user) {
        return null;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void createUser(User user) {
        userRepository.save(user);
    }

    public User saveUsername(User username) {
        return null;
    }

    public User save(User user) {
        return null;
    }
}


