package com.social_signin.springsocial.controller;

import com.social_signin.springsocial.exception.ResourceNotFoundException;
import com.social_signin.springsocial.model.User;
import com.social_signin.springsocial.repository.UserRepository;
import com.social_signin.springsocial.security.CurrentUser;
import com.social_signin.springsocial.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('User')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
}
