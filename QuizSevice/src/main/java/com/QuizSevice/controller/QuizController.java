package com.QuizSevice.controller;

import com.QuizSevice.entities.Quiz;
import com.QuizSevice.services.QuizServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private QuizServices quizServices;

    public QuizController(QuizServices quizServices){
        this.quizServices=quizServices;

    }

    @PostMapping
    public void addQuiz(@RequestBody Quiz quiz){
        quizServices.addQuiz(quiz);
    }

    @GetMapping
    public List<Quiz> getAllQuiz(){
        return quizServices.getAllQuiz();
    }

    @GetMapping("/{id}")
    public Quiz getQuizById(@PathVariable Long id){
        return quizServices.getQuizById(id);
    }

    @DeleteMapping("/delete/{id}")
    private void deleteQuizById(@PathVariable Long id){
        quizServices.deleteQuizById(id);
    }
}
