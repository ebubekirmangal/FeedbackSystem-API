package com.tobeto.geriBildirimsistemi.services.dtos.responses.reply;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateReplyResponse {

    private int userId;

    private String title;

    private String content;

}
