package com.tobeto.geriBildirimsistemi.controllers;

import com.tobeto.geriBildirimsistemi.services.abstracts.ReplyService;
import com.tobeto.geriBildirimsistemi.services.dtos.requests.reply.AddReplyRequest;
import com.tobeto.geriBildirimsistemi.services.dtos.requests.reply.UpdateReplyRequest;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.reply.AddReplyResponse;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.reply.GetByFeedbackIdForReply;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.reply.UpdateReplyResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/replies")
@RequiredArgsConstructor
public class RepliesController {

    private final ReplyService replyService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public AddReplyResponse create(@RequestBody AddReplyRequest request){
        return replyService.create(request);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public UpdateReplyResponse update(@RequestBody UpdateReplyRequest request){
        return replyService.update(request);
    }

    @GetMapping("/getByFeedback/{feedbackId}")
    public GetByFeedbackIdForReply getReplyByFeedbackId(@PathVariable int feedbackId) {
        return replyService.getReplyByFeedbackId(feedbackId);
    }
}
