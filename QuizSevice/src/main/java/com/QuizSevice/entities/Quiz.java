package com.QuizSevice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.naming.Name;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Quiz {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="QuizID")
    private Long quizId;
    @Column(name="QuizName")
    private String quizName;


}
