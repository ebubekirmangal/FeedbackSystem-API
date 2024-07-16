package com.tobeto.geriBildirimsistemi.services.mapper;

import com.tobeto.geriBildirimsistemi.entities.Feedback;
import com.tobeto.geriBildirimsistemi.services.dtos.requests.feedback.AddFeedbackRequest;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.feedback.AddFeedbackResponse;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.feedback.GetAllFeedbackResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FeedbackMapper {

    FeedbackMapper INSTANCE = Mappers.getMapper(FeedbackMapper.class);

    @Mapping(target = "user.id",source = "userId")
    Feedback addFeedbackRequestToFeedback(AddFeedbackRequest request);

    @Mapping(target = "userId",source = "user.id")
    AddFeedbackResponse feedbackToAddFeedbackResponse(Feedback feedback);

    @Mapping(target = "email",source = "user.email")
    @Mapping(target = "transactionDone",source = "reply.transactionDone")
    GetAllFeedbackResponse feedbackToGetAllFeedbackResponse(Feedback feedback);
}
