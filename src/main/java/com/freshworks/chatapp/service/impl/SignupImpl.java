package com.freshworks.chatapp.service.impl;

import com.freshworks.chatapp.model.LoginResponse;
import com.freshworks.chatapp.model.Users;
import com.freshworks.chatapp.repository.UserRepository;
import com.freshworks.chatapp.service.LoginService;
import com.freshworks.chatapp.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupImpl implements SignupService {

    @Autowired UserRepository userRepository;
    @Override
    public LoginResponse signup(Users user) {
        userRepository.save(user);
        return new LoginResponse("successfully signed up");
    }
}
