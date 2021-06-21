package com.example.data1.domain.dto;

import com.example.data1.domain.constant.UserStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
public class UserDto extends BaseDto {
    private String id;
    private String username;
    private String password;
    private Integer balance;
    private UserStatus status;
//    private Set<RoleDto> roles = new HashSet<>();
}