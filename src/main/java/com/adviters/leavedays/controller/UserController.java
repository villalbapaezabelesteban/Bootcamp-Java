package com.adviters.leavedays.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {

    @GetMapping
    public List<String> getAllUsers() {
        List<String> result = new ArrayList<>();
        result.add("User 1");
        result.add("User 2");
        result.add("User 3");
        return result;
    }
}