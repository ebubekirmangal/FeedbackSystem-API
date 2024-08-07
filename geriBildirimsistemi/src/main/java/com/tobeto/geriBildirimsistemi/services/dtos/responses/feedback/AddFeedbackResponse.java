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
public class AddFeedbackResponse {

    private int id;

    private int userId;

    private LocalDateTime sentTime;

    private boolean isTransactionDone;
}
