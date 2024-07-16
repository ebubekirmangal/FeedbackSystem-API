package com.tobeto.geriBildirimsistemi.services.concretes;

import com.tobeto.geriBildirimsistemi.entities.Feedback;
import com.tobeto.geriBildirimsistemi.entities.Reply;
import com.tobeto.geriBildirimsistemi.repositories.ReplyRepository;
import com.tobeto.geriBildirimsistemi.services.abstracts.ReplyService;
import com.tobeto.geriBildirimsistemi.services.dtos.requests.reply.AddReplyRequest;
import com.tobeto.geriBildirimsistemi.services.dtos.requests.reply.UpdateReplyRequest;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.reply.AddReplyResponse;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.reply.GetByFeedbackIdForReply;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.reply.UpdateReplyResponse;
import com.tobeto.geriBildirimsistemi.services.mapper.ReplyMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService {

    private final ReplyRepository replyRepository;

    private final FeedbackServiceImpl feedbackService;

    @Override
    public AddReplyResponse create(AddReplyRequest request) {
        Reply newReply = ReplyMapper.INSTANCE.addReplyRequestToReply(request);
        newReply.setTransactionDone(true);
        newReply.setSentTime(LocalDateTime.now());
        return ReplyMapper.INSTANCE.replyToAddReplyResponse(replyRepository.save(newReply));
    }

    public UpdateReplyResponse update(UpdateReplyRequest request) {
        // Var olan feedback'i feedbackService üzerinden bul
        Feedback feedback = feedbackService.getFeedbackById(request.getFeedbackId());
        Optional<Reply> optionalReply = replyRepository.findByFeedbackId(request.getFeedbackId());

        // Reply var mı kontrol et
        if (optionalReply.isEmpty()) {
            throw new RuntimeException("Reply not found for feedback id: " + request.getFeedbackId());
        }

        Reply reply = optionalReply.get();

        // Reply güncelle
        reply.setTitle(request.getTitle());
        reply.setContent(request.getContent());
        reply.setTransactionDone(true); // Doğru yazım: setTransactionalDone

        // Reply'i kaydet
        replyRepository.save(reply);

        // Feedback güncelle (eğer gerekiyorsa)
        // feedback.set... (gereken güncellemeleri yapın)

        // Entity'leri kaydetmeye gerek yok, çünkü reply zaten managed bir entity

        // Response dön
        return ReplyMapper.INSTANCE.replyToUpdateReplyResponse(reply);
    }
    public GetByFeedbackIdForReply getReplyByFeedbackId(int feedbackId) {
        Optional<Reply> reply = replyRepository.findByFeedbackId(feedbackId);
        if (!reply.isPresent()){
            throw new RuntimeException("reply not found");
        }
        GetByFeedbackIdForReply result = new GetByFeedbackIdForReply();
        result.setTitle(reply.get().getTitle());
        result.setContent(reply.get().getContent());
        result.setTransactionalDone(reply.get().isTransactionDone());
        return result;
    }
}
