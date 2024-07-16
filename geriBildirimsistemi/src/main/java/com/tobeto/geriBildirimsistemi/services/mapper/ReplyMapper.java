package com.tobeto.geriBildirimsistemi.services.mapper;

import com.tobeto.geriBildirimsistemi.entities.Reply;
import com.tobeto.geriBildirimsistemi.services.dtos.requests.reply.AddReplyRequest;
import com.tobeto.geriBildirimsistemi.services.dtos.requests.reply.UpdateReplyRequest;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.reply.AddReplyResponse;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.reply.UpdateReplyResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReplyMapper {

    ReplyMapper INSTANCE = Mappers.getMapper(ReplyMapper.class);

    Reply addReplyRequestToReply(AddReplyRequest request);

    AddReplyResponse replyToAddReplyResponse(Reply reply);
    @Mapping(target = "user.id",source = "userId")
    @Mapping(target = "feedback.id",source = "feedbackId")
    Reply updateReplyRequestToReply(UpdateReplyRequest request);
    @Mapping(target = "userId",source = "user.id")
    UpdateReplyResponse replyToUpdateReplyResponse(Reply reply);
}
