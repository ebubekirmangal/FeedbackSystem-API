package com.tobeto.geriBildirimsistemi.repositories;

import com.tobeto.geriBildirimsistemi.entities.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReplyRepository extends JpaRepository<Reply,Integer> {

    Optional<Reply> findByFeedbackId(int feedbackId);
}
