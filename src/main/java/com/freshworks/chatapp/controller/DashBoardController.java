package com.freshworks.chatapp.controller;

import com.freshworks.chatapp.model.Doctors;
import com.freshworks.chatapp.model.Users;
import com.freshworks.chatapp.service.DashBoardService;
import com.freshworks.chatapp.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/dashboard")

public class DashBoardController {
    @Autowired
    DashBoardService dashBoardService;

    @PostMapping("/admin-createnew")
    public Map<String,String> createNewDoctor(@Valid @RequestBody Doctors doctors){
        return dashBoardService.createNewDoctor(doctors);
    }

    @PostMapping("/admin-deleteUser")
    public Map<String,String> deleteDoctor(@Valid @RequestBody Doctors doctors){
        return dashBoardService.deleteByEmailId(doctors.getEmail());
    }

    @PostMapping("/patient")
    public String patientDashBoard(){
        return  null;
    }
    @PostMapping("/doctor")
    public String doctorDashBoard(){
        return  null;
    }

}
