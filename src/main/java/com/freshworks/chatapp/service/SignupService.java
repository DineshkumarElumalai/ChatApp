package com.freshworks.chatapp.service;

import com.freshworks.chatapp.model.LoginResponse;
import com.freshworks.chatapp.model.Users;

public interface SignupService {
    public LoginResponse signup(Users user);
}
