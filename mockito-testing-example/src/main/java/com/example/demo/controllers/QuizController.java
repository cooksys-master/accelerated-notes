package com.example.demo.controllers;

import com.example.demo.models.QuizDto;
import com.example.demo.services.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("quiz")
public class QuizController {

    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping
    public Set<QuizDto> getAllQuizzes() {
        return quizService.getAllQuizzes();
    }

    @PostMapping
    public QuizDto createQuiz(@RequestBody QuizDto quizDto) {
        return quizService.createQuiz(quizDto);
    }
}
