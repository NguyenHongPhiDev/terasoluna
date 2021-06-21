package com.example.data1.domain.service.mapper;

import com.example.data1.domain.dto.UserDto;
import com.example.data1.domain.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

public interface UserMapper {
    UserDto toUserDto(final UserModel userModel);
}
