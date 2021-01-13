package com.example.demo.controllers;


import com.example.demo.models.QuizDto;
import com.example.demo.services.QuizService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class QuizControllerTest {

    @InjectMocks
    private QuizController quizControllerUnderTest;
    @Mock
    private QuizService mockQuizService;

    @BeforeEach
    public void before() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllQuizzes() {
        quizControllerUnderTest.getAllQuizzes();
        verify(mockQuizService).getAllQuizzes();
    }

    @Test
    public void testCreateQuiz() {
        QuizDto quizDtoToCreate = new QuizDto();
        quizDtoToCreate.setName("Test Quiz");
        quizControllerUnderTest.createQuiz(quizDtoToCreate);
        verify(mockQuizService).createQuiz(quizDtoToCreate);
    }
}
