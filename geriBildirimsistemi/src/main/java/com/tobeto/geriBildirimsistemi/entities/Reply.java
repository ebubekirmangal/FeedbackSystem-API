package com.tobeto.geriBildirimsistemi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "replies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST) // veya CascadeType.ALL
    @JoinColumn(name = "feedback_id", unique = true)
    private Feedback feedback;

    private String title;

    private String content;

    private LocalDateTime sentTime;

    private boolean transactionDone;
}
