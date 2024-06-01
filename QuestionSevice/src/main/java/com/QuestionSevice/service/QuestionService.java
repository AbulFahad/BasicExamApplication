package com.QuestionSevice.service;

import com.QuestionSevice.entity.Question;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionService {
    public List<Question> getAllQuestions();
    public Question getQuestionById(Long questionId);
    public Question addQuestion(Question question);
    public void deleteQuiestionById(Long id);
}
