package com.QuestionSevice.service;

import com.QuestionSevice.entity.Question;
import com.QuestionSevice.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService{

    private QuestionRepository questionRepository;

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
    public Question addQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public void deleteQuiestionById(Long id) {
        questionRepository.deleteById(id);
    }
}
