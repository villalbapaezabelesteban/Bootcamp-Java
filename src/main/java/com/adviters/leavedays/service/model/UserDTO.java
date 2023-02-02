package com.adviters.leavedays.service.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserDTO {

    private String name;
    private String lastname;
    private String mail;
    private Integer phone;
    private String role;
    private LocalDate birthDate;
}
