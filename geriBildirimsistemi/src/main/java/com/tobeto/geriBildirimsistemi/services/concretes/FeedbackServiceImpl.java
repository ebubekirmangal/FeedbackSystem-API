package com.tobeto.geriBildirimsistemi.services.concretes;

import com.tobeto.geriBildirimsistemi.entities.Feedback;
import com.tobeto.geriBildirimsistemi.repositories.FeedbackRepository;
import com.tobeto.geriBildirimsistemi.services.abstracts.FeedbackService;
import com.tobeto.geriBildirimsistemi.services.dtos.requests.feedback.AddFeedbackRequest;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.feedback.AddFeedbackResponse;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.feedback.GetAllFeedbackResponse;
import com.tobeto.geriBildirimsistemi.services.mapper.FeedbackMapper;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FeedbackServiceImpl implements FeedbackService {

    private final FeedbackRepository feedbackRepository;

    @Override
    public AddFeedbackResponse create(AddFeedbackRequest request) {
        Feedback newFeedback = FeedbackMapper.INSTANCE.addFeedbackRequestToFeedback(request);
        newFeedback.setSentTime(LocalDateTime.now());
        return FeedbackMapper.INSTANCE.feedbackToAddFeedbackResponse(feedbackRepository.save(newFeedback));
    }

    @Override
    public List<GetAllFeedbackResponse> getAllFeedbackByDate() {
        List<Feedback> filteredFeedback = feedbackRepository.findAllByOrderBySentTimeDesc();
        return filteredFeedback.stream()
                .map(FeedbackMapper.INSTANCE::feedbackToGetAllFeedbackResponse)
                .collect(Collectors.toList());
    }
}
