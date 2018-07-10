package com.freshworks.chatapp.service.impl;

import com.freshworks.chatapp.model.LoginResponse;
import com.freshworks.chatapp.model.Users;
import com.freshworks.chatapp.repository.UserRepository;
import com.freshworks.chatapp.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginImpl implements LoginService {

    @Autowired
    UserRepository userRepository;

    @Override
    public LoginResponse login(String email, String password) {

        Users users = userRepository.findByEmailId(email);
        LoginResponse loginResponse;
        if(users.getPassword().equals(password)){
             loginResponse = new LoginResponse("loggedin",users.getFirstName()+users.getLastName(),users.getRole());
        }else{
            loginResponse = new LoginResponse("incorrect");
        }

        return loginResponse;
    }
}
