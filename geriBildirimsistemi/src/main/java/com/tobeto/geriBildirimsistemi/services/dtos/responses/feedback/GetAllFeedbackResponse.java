package com.tobeto.geriBildirimsistemi.services.dtos.responses.feedback;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetAllFeedbackResponse {

    private int id;

    private String email;

    private String title;

    private String content;

    private LocalDateTime sentTime;

    private boolean transactionDone;
}
