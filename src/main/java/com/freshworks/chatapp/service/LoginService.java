package com.freshworks.chatapp.service;

import com.freshworks.chatapp.model.LoginResponse;
import com.freshworks.chatapp.model.Users;

public interface LoginService {
    public LoginResponse login(String username, String password);

}
