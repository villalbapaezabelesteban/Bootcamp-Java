package com.adviters.leavedays.repository.impl;

import com.adviters.leavedays.repository.UserRepository;
import com.adviters.leavedays.repository.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public List<UserEntity> getAll() {
        List<UserEntity> result = new ArrayList<>();
        UserEntity entity1 = new UserEntity();
        UserEntity entity2 = new UserEntity();
        UserEntity entity3 = new UserEntity();

        entity1.setName("Name 1");
        entity1.setLastname("Lastname 1");
        entity1.setMail("mail.1@adviters.com");
        entity1.setPhone(123456789);
        entity1.setRole("ROLE 1");
        entity1.setBirthDate(LocalDate.now());

        entity2.setName("Name 2");
        entity2.setLastname("Lastname 2");
        entity2.setMail("mail.2@adviters.com");
        entity2.setPhone(123456789);
        entity2.setRole("ROLE 2");
        entity2.setBirthDate(LocalDate.now());

        entity3.setName("Name 3");
        entity3.setLastname("Lastname 3");
        entity3.setMail("mail.3@adviters.com");
        entity3.setPhone(123456789);
        entity3.setRole("ROLE 3");
        entity3.setBirthDate(LocalDate.now());

        result.add(entity1);
        result.add(entity2);
        result.add(entity3);

        return result;
    }
}
