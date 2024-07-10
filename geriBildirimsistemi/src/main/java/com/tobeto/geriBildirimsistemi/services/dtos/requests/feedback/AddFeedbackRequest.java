package com.tobeto.geriBildirimsistemi.services.dtos.requests.feedback;

import com.tobeto.geriBildirimsistemi.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddFeedbackRequest {

    private int userId;

    private String title;

    private String content;
}
