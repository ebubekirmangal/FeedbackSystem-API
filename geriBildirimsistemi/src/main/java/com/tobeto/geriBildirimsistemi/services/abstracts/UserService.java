package com.tobeto.geriBildirimsistemi.services.abstracts;

import com.tobeto.geriBildirimsistemi.services.dtos.requests.user.LoginUserRequest;
import com.tobeto.geriBildirimsistemi.services.dtos.requests.user.RegisterUserRequest;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.user.LoginUserResponse;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.user.RegisterUserResponse;

public interface UserService {

    RegisterUserResponse register(RegisterUserRequest request);

    LoginUserResponse login(LoginUserRequest request);
}
