package com.tobeto.geriBildirimsistemi.services.dtos.requests.user;

import com.tobeto.geriBildirimsistemi.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterUserRequest {

    private String email;

    private String password;

    private Role role;
}
