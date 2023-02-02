package com.adviters.leavedays.service.impl;

import com.adviters.leavedays.repository.UserRepository;
import com.adviters.leavedays.service.UserService;
import com.adviters.leavedays.service.mapper.UserMapper;
import com.adviters.leavedays.service.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.getAll().stream().map(UserMapper::toDTO).collect(Collectors.toList());
    }
}
