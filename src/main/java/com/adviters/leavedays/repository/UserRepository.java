package com.adviters.leavedays.repository;

import com.adviters.leavedays.repository.entity.UserEntity;

import java.util.List;

public interface UserRepository {

    public List<UserEntity> getAll();
}
