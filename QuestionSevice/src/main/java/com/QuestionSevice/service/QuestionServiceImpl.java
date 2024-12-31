package com.QuestionSevice.service;

import com.QuestionSevice.entity.Question;
import com.QuestionSevice.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService{

    private final QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository){
        this.questionRepository=questionRepository;
    }
    @Override
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public Question getQuestionById(Long questionId) {
        return questionRepository.findById(questionId).orElseThrow(() -> new RuntimeException("Not a valid question ID"));
    }

    @Override
    public void addQuestion(Question question) {
        questionRepository.save(question);
    }

    @Override
    public void deleteQuestionById(Long id) {
        questionRepository.deleteById(id);
    }

    @Override
    public List<Question> getAllQuestionByQuizId(Long id) {
        return questionRepository.findByQuizId(id);
    }
}
