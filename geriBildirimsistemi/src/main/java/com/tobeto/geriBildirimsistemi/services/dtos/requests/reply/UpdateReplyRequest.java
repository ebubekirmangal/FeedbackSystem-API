package com.tobeto.geriBildirimsistemi.services.dtos.requests.reply;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateReplyRequest {

    private int id;

    private int userId;

    private int feedbackId;

    private String title;

    private String content;
}