package com.example.apsauga2.controller;

import com.example.apsauga2.model.Authority;
import com.example.apsauga2.model.User;
import com.example.apsauga2.repository.AuthorityRepository;
import com.example.apsauga2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegisterController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthorityRepository authorityRepository;

    @GetMapping("/")
    public String index() {
        return "Hello, welcome!";
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/register")
    public User doRegister(@RequestBody User user) {
        //password encryption
        //move to service layer
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        Authority authority = new Authority();
        authority.setAuthority("USER");
        authority.setUser(user);
        user.setAuthority(authority);

        return userRepository.save(user);
    }
}
