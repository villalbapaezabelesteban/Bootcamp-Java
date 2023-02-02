package com.adviters.leavedays.repository.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserEntity {

    private String name;
    private String lastname;
    private String mail;
    private Integer phone;
    private String role;
    private LocalDate birthDate;

}
