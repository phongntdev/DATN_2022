package com.example.huhacha.mapper;

import com.example.huhacha.DTO.UserDto;
import com.example.huhacha.entitis.User;

//@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<UserDto, User> {
}