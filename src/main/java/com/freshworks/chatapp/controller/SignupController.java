package com.freshworks.chatapp.controller;

import com.freshworks.chatapp.model.LoginResponse;
import com.freshworks.chatapp.model.Users;
import com.freshworks.chatapp.service.LoginService;
import com.freshworks.chatapp.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/signup")
public class SignupController {
    @Autowired SignupService signupService;

    @PostMapping()
    public LoginResponse login(@Valid @RequestBody Users user) {
        System.out.println(user.getFirstName());
        return  signupService.signup(user);

    }}
