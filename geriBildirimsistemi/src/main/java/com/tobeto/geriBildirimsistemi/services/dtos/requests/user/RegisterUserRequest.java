package com.tobeto.geriBildirimsistemi.services.dtos.requests.user;

import com.tobeto.geriBildirimsistemi.entities.enums.Role;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterUserRequest {

    @NotBlank(message = "E-Posta boş olamaz")
    private String email;

    @NotBlank(message = "Şifre boş olamaz")
    private String password;

    @NotBlank(message = "Rol boş olamaz")
    private Role role;
}
