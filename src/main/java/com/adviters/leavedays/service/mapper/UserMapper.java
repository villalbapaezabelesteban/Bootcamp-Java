package com.adviters.leavedays.service.mapper;

import com.adviters.leavedays.repository.entity.UserEntity;
import com.adviters.leavedays.service.model.UserDTO;

public final class UserMapper {

    public static UserDTO toDTO(UserEntity entity) {
        UserDTO dto = new UserDTO();

        dto.setName(entity.getName());
        dto.setLastname(entity.getLastname());
        dto.setMail(entity.getMail());
        dto.setPhone(entity.getPhone());
        dto.setRole(entity.getRole());
        dto.setBirthDate(entity.getBirthDate());

        return dto;
    }
}
