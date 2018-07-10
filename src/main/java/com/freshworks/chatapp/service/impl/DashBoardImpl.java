package com.freshworks.chatapp.service.impl;

import com.freshworks.chatapp.model.Doctors;
import com.freshworks.chatapp.model.LoginResponse;
import com.freshworks.chatapp.repository.DoctorRepository;
import com.freshworks.chatapp.service.DashBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DashBoardImpl implements DashBoardService {
    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public Map<String,String> createNewDoctor(Doctors doctors) {
        HashMap<String, String> hm = new HashMap<>();
        try {
            doctorRepository.save(doctors);
            hm.put("message", "successfully added");
        }catch (Exception e){
            hm.put("message", "something error. Try again later");
        }
        return hm;
    }

    @Override
    public Map<String, String> deleteByEmailId(String email) {
        HashMap<String, String> hm = new HashMap<>();

        try{
        doctorRepository.deleteByEmailId(email);
            System.out.println(doctorRepository.deleteByEmailId(email));
            hm.put("message","successfully removed");
        }catch (Exception e){
            hm.put("message","something error. Try again later");
        }
//        System.out.println(String.valueOf(doctors));

        return hm;
    }
}
