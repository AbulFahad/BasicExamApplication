package com.QuestionSevice.service;

import com.QuestionSevice.entity.Question;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionService {
    List<Question> getAllQuestions();
    Question getQuestionById(Long questionId);
    void addQuestion(Question question);
    void deleteQuestionById(Long id);

    List<Question> getAllQuestionByQuizId(Long id);
}
