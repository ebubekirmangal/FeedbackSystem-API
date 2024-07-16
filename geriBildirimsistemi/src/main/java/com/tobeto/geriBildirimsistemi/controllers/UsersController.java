package com.tobeto.geriBildirimsistemi.controllers;

import com.tobeto.geriBildirimsistemi.services.abstracts.UserService;
import com.tobeto.geriBildirimsistemi.services.dtos.requests.user.LoginUserRequest;
import com.tobeto.geriBildirimsistemi.services.dtos.requests.user.RegisterUserRequest;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.user.LoginUserResponse;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.user.RegisterUserResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UsersController {

    private final UserService userService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public RegisterUserResponse register(@RequestBody @Valid RegisterUserRequest request){
        return userService.register(request);
    }

    @PostMapping("/login")
    public LoginUserResponse login(@RequestBody @Valid LoginUserRequest request){
        return userService.login(request);
    }
}
