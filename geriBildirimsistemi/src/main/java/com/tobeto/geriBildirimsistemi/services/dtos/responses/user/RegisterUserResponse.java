package com.tobeto.geriBildirimsistemi.services.dtos.responses.user;


import com.tobeto.geriBildirimsistemi.entities.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterUserResponse {

    private int id;

    private String email;

    private String password;

    private Role role;
}
