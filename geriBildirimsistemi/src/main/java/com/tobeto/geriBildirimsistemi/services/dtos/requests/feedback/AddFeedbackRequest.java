package com.tobeto.geriBildirimsistemi.services.dtos.requests.feedback;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddFeedbackRequest {

    @NotBlank(message = "user id forma dahil edilmedi.")
    private int userId;

    @NotBlank(message = "Geri bildirim başlığı boş bırakılamaz.")
    private String title;

    @NotBlank(message = "Geri bildirim içeriği boş bırakılamaz.")
    private String content;
}
