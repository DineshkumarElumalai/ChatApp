package com.freshworks.chatapp.controller;

import com.freshworks.chatapp.model.LoginResponse;
import com.freshworks.chatapp.model.Users;
import com.freshworks.chatapp.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired LoginService loginService;


    @PostMapping()
    public LoginResponse login(@Valid @RequestBody Users user) {
        return  loginService.login(user.getEmail(),user.getPassword());

    }


}
