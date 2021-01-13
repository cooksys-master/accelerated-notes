package com.example.demo.services;

import com.example.demo.entities.Quiz;
import com.example.demo.models.QuizDto;

import java.util.Set;

public interface QuizService {

    Set<QuizDto> getAllQuizzes();

    QuizDto createQuiz(QuizDto quizDto);

}
