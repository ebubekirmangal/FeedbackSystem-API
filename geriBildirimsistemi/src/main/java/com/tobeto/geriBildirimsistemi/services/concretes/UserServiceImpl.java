package com.tobeto.geriBildirimsistemi.services.concretes;

import com.tobeto.geriBildirimsistemi.repositories.UserRepository;
import com.tobeto.geriBildirimsistemi.services.abstracts.UserService;
import com.tobeto.geriBildirimsistemi.services.dtos.requests.user.LoginUserRequest;
import com.tobeto.geriBildirimsistemi.services.dtos.requests.user.RegisterUserRequest;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.user.LoginUserResponse;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.user.RegisterUserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public RegisterUserResponse register(RegisterUserRequest request) {
        return null;
    }

    @Override
    public LoginUserResponse login(LoginUserRequest request) {
        return null;
    }
}
