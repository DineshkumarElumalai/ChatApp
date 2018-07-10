package com.freshworks.chatapp.service;

import com.freshworks.chatapp.model.Doctors;
import com.freshworks.chatapp.model.LoginResponse;

import java.util.List;
import java.util.Map;

public interface DashBoardService {
    public Map<String,String> createNewDoctor(Doctors doctors);
    public Map<String,String> deleteByEmailId(String email);
}
