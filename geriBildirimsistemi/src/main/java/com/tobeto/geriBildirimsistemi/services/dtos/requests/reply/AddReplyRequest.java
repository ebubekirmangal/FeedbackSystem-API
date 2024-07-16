package com.tobeto.geriBildirimsistemi.services.dtos.requests.reply;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddReplyRequest {

    private int userId;

    private String title;

    private String content;
}
