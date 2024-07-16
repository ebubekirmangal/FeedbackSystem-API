package com.tobeto.geriBildirimsistemi.services.mapper;

import com.tobeto.geriBildirimsistemi.entities.User;
import com.tobeto.geriBildirimsistemi.services.dtos.requests.user.RegisterUserRequest;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.user.LoginUserResponse;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.user.RegisterUserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    @Mapping(target = "role",source = "role")
    User registerUserRequestToUser(RegisterUserRequest request);

    RegisterUserResponse userToRegisterUserResponse(User user);

    LoginUserResponse userToLoginUserResponse(User user);
}
