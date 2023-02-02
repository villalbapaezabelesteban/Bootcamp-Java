package com.adviters.leavedays.service.impl;

import com.adviters.leavedays.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<String> getAllUsers() {
        List<String> result = new ArrayList<>();
        result.add("User 1");
        result.add("User 2");
        result.add("User 3");
        return result;
    }
}
