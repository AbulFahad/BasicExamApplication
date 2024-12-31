package com.QuestionSevice.controller;

import com.QuestionSevice.entity.Question;
import com.QuestionSevice.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    private final QuestionService questionService;

    public QuestionController(QuestionService questionService){
        this.questionService=questionService;
    }

    @PostMapping
    public void addQuestion(@RequestBody Question question){
        questionService.addQuestion(question);
    }

    @GetMapping
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("/quiz/{id}")
    public List<Question> getQuestionsByQuizId(@PathVariable Long id){
        return questionService.getAllQuestionByQuizId(id);
    }
    @GetMapping("/{id}")
    public Question getQuestionById(@PathVariable("id") Long questionId){
        return questionService.getQuestionById(questionId);
    }

    @DeleteMapping("/{id}")
    private void deleteQuestionById(@PathVariable Long id){
        questionService.deleteQuestionById(id);
    }
}
