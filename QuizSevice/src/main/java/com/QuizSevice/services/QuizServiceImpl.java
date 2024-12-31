package com.QuizSevice.services;

import com.QuizSevice.AppRestTemplate;
import com.QuizSevice.entities.Question;
import com.QuizSevice.entities.Quiz;
import com.QuizSevice.repositories.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class QuizServiceImpl implements QuizServices{

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    AppRestTemplate appRestTemplate;

    public static final String otherServiceUrl = "http://localhost:8082/question";
    @Override
    public void addQuiz(Quiz quiz) {
        quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> getAllQuiz() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz getQuizById(Long id) {
        String endPointUrl = otherServiceUrl+"/quiz/"+id;
        Question[] questionArray = appRestTemplate.restTemplate().getForObject(endPointUrl, Question[].class);
        List<Question> questionsOfThisQuiz = questionArray!=null ? Arrays.asList(questionArray) : List.of();
        Quiz quiz = quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz with ID: "+id+" is not found"));
        quiz.setQuestions(questionsOfThisQuiz);
        return quiz;
    }
    @Override
    public void deleteQuizById(Long id) {
        quizRepository.deleteById(id);
    }
}
