package com.adviters.leavedays.repository.impl;

import com.adviters.leavedays.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public List<String> getAll() {
        List<String> result = new ArrayList<>();
        result.add("User Repository 1");
        result.add("User Repository 2");
        result.add("User Repository 3");
        return result;
    }
}
