package com.example.data1.domain.service;

import com.example.data1.domain.dto.UserDto;
import com.example.data1.domain.model.UserModel;
import com.example.data1.domain.repository.UserRepository;
import com.example.data1.domain.service.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.terasoluna.gfw.common.exception.ResourceNotFoundException;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserDto getUser(final String username) {
        return userRepository
                .findByUsername(username)
                .map(userMapper::toUserDto)
                .orElseGet(() -> {
                    log.warn("User not found. Username {}", username);
                    throw new ResourceNotFoundException("User not found. Username: " + username);
                });
    }
    public UserModel getUserById(final String userId) {
        return userRepository
                .findById(userId)
                .orElseGet(() -> {
                    log.warn("User not found. Username {}", userId);
                    throw new ResourceNotFoundException("User not found. Username: " + userId);
                });
    }
}