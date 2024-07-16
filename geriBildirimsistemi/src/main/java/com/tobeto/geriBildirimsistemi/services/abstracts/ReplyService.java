package com.tobeto.geriBildirimsistemi.services.abstracts;

import com.tobeto.geriBildirimsistemi.services.dtos.requests.reply.AddReplyRequest;
import com.tobeto.geriBildirimsistemi.services.dtos.requests.reply.UpdateReplyRequest;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.reply.AddReplyResponse;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.reply.GetByFeedbackIdForReply;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.reply.UpdateReplyResponse;

public interface ReplyService {

    AddReplyResponse create(AddReplyRequest request);

    UpdateReplyResponse update(UpdateReplyRequest request);

    GetByFeedbackIdForReply getReplyByFeedbackId(int feedbackId);
}
