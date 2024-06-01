package com.QuizSevice.services;

import com.QuizSevice.entities.Quiz;
import org.springframework.stereotype.Service;

import java.util.List;

public interface QuizServices {

    //add quiz
    public void addQuiz(Quiz quiz);

    //get all quiz;
    public List<Quiz> getAllQuiz();

    //get quiz by ID
    public Quiz getQuizById(Long id);

    public void deleteQuizById(Long id);
}
