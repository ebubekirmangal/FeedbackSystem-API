package com.tobeto.geriBildirimsistemi.controllers;

import com.tobeto.geriBildirimsistemi.services.abstracts.FeedbackService;
import com.tobeto.geriBildirimsistemi.services.dtos.requests.feedback.AddFeedbackRequest;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.feedback.AddFeedbackResponse;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.feedback.GetAllFeedbackResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/feedbacks")
@RequiredArgsConstructor
public class FeedbacksController {

    private final FeedbackService feedbackService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public AddFeedbackResponse create(AddFeedbackRequest request){
        return feedbackService.create(request);
    }

    @GetMapping("/getAllFeedbackByDate")
    public List<GetAllFeedbackResponse> getAllFeedbackByDate(){
        return feedbackService.getAllFeedbackByDate();
    }
}
