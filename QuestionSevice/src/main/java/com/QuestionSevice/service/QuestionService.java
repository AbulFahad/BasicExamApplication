package com.QuestionSevice.service;

import com.QuestionSevice.entity.Question;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionService {
    public List<Question> getAllQuestions();
    public Question getQuestionById(Long questionId);
    public void addQuestion(Question question);
    public void deleteQuestionById(Long id);
}
