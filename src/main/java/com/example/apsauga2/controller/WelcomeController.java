package com.example.apsauga2.controller;

import com.example.apsauga2.model.User;
import com.example.apsauga2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class WelcomeController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/welcome")
    public String welcome(Principal principal) { //principal is available when user is logged in.
        String name = principal.getName();
        User user = userRepository.findByUsername(name);


        return "Welcome, " + user.getUsername() + ", you are authorized!" +
                " Your posts will be created by YOUR ID - " + user.getId() +
                " You have assigned user role - " + user.getAuthority().getAuthority() +
                " history - ";
    }

    @GetMapping("/cart")
    public String cart() {
        return "Cart is visible for non authenticated users!";
    }

    @GetMapping("/admin")
        public String admin() {
        return "Visible only for ADMIN!";
    }
}
