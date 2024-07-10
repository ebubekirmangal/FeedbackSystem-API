package com.tobeto.geriBildirimsistemi.services.concretes;

import com.tobeto.geriBildirimsistemi.entities.User;
import com.tobeto.geriBildirimsistemi.repositories.UserRepository;
import com.tobeto.geriBildirimsistemi.services.abstracts.UserService;
import com.tobeto.geriBildirimsistemi.services.dtos.requests.user.LoginUserRequest;
import com.tobeto.geriBildirimsistemi.services.dtos.requests.user.RegisterUserRequest;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.user.LoginUserResponse;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.user.RegisterUserResponse;
import com.tobeto.geriBildirimsistemi.services.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public RegisterUserResponse register(RegisterUserRequest request) {
        Optional<User> existingUser = userRepository.findByEmail(request.getEmail());

        if(existingUser.isPresent()){
            throw new RuntimeException("Bu hesapla zaten giriş yapılmış.");
        }

        User newUser = UserMapper.INSTANCE.registerUserRequestToUser(request);
        return UserMapper.INSTANCE.userToRegisterUserResponse(userRepository.save(newUser));
    }

    @Override
    public LoginUserResponse login(LoginUserRequest request) {
        Optional<User> user = userRepository.findByEmail(request.getEmail());

        if(user.isPresent() && user.get().getPassword().equals(request.getPassword())) {
            System.out.println("Sisteme giriş yapıldı");
            // Giriş başarılı ise, LoginUserResponse döndür.
            return UserMapper.INSTANCE.userToLoginUserResponse(user.get());
        } else {
            throw new RuntimeException("Geçersiz email veya şifre.");
        }
    }
}
