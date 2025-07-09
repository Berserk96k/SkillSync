package com.skillsync.controller;

import com.skillsync.model.User;
import com.skillsync.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/save")
    public User createUser(@RequestBody User user) {
    	System.out.println("🔥 createUser endpoint HIT");

        return userRepository.save(user);
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
