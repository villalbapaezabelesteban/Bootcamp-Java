package com.adviters.leavedays.service.impl;

import com.adviters.leavedays.repository.UserRepository;
import com.adviters.leavedays.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<String> getAllUsers() {
        return userRepository.getAll();
    }
}
