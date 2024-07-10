package com.tobeto.geriBildirimsistemi.services.abstracts;

import com.tobeto.geriBildirimsistemi.services.dtos.requests.feedback.AddFeedbackRequest;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.feedback.AddFeedbackResponse;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.feedback.GetAllFeedbackResponse;

import java.util.List;

public interface FeedbackService {

    AddFeedbackResponse create(AddFeedbackRequest request);

    List<GetAllFeedbackResponse> getAllFeedbackByDate();
}
