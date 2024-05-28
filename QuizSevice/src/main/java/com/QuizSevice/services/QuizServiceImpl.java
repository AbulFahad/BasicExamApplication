package com.QuizSevice.services;

import com.QuizSevice.entities.Quiz;
import com.QuizSevice.repositories.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizServices{

    private QuizRepository quizRepository;

    public QuizServiceImpl(QuizRepository quizRepository){
        this.quizRepository = quizRepository;
    }

    @Override
    public void addQuiz(Quiz quiz) {
        quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> getAllQuiz() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz getQuiz(Long id) {
        return quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz id is not valid"));
    }
}
