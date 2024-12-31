package com.QuizSevice.services;

import com.QuizSevice.entities.Quiz;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuizServices {

    //add quiz
    void addQuiz(Quiz quiz);

    //get all quiz;
    List<Quiz> getAllQuiz();

    //get quiz by ID
     Quiz getQuizById(Long id);

    void deleteQuizById(Long id);


}
