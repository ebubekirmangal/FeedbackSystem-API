package com.tobeto.geriBildirimsistemi.repositories;

import com.tobeto.geriBildirimsistemi.entities.Feedback;
import com.tobeto.geriBildirimsistemi.services.dtos.responses.feedback.GetAllFeedbackResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback,Integer> {

    List<Feedback> findAllByOrderBySentTimeDesc();
}
