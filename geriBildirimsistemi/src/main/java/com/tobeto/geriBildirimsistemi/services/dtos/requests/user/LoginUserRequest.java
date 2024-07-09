package com.tobeto.geriBildirimsistemi.services.dtos.requests.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginUserRequest {

    private String email;

    private String password;
}
