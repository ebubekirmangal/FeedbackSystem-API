package com.tobeto.geriBildirimsistemi.controllers;

import com.tobeto.geriBildirimsistemi.services.abstracts.UserService;
import com.tobeto.geriBildirimsistemi.services.dtos.requests.user.LoginUserRequest;
import com.tobeto.geriBildirimsistemi.services.dtos.requests.user.RegisterUserRequest;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.user.LoginUserResponse;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.user.RegisterUserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UsersController {

    private final UserService userService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public RegisterUserResponse register(RegisterUserRequest request){
        return userService.register(request);
    }

    @PostMapping("/login")
    public LoginUserResponse login(LoginUserRequest request){
        return userService.login(request);
    }
}
