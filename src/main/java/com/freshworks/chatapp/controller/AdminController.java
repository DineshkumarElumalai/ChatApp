package com.freshworks.chatapp.controller;

import com.freshworks.chatapp.model.Doctors;
import com.freshworks.chatapp.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired DashBoardController dashBoardController;

    @PostMapping("/create-doctor")
    public String createDoctor(@Valid @RequestBody Doctors doctors) {
        return null;
    }
    @PostMapping("/delete-doctor")
    public String deleteDoctor(@Valid @RequestBody Doctors doctors) {
        return null;
    }
}
