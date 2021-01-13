package com.example.demo.services.impl;

import com.example.demo.entities.Quiz;
import com.example.demo.mappers.QuizMapper;
import com.example.demo.models.QuizDto;
import com.example.demo.repositories.QuizRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class QuizServiceImplTest {

    @InjectMocks
    private QuizServiceImpl quizServiceUnderTest;
    @Mock
    private QuizRepository mockQuizRepository;
    @Mock
    private QuizMapper mockQuizMapper;

    @BeforeEach
    public void beforeEach() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllQuizzes() {
        QuizDto quizDtoFixture = new QuizDto();
        List<Quiz> quizListFixture = new ArrayList<>();
        quizListFixture.add(new Quiz());

        when(mockQuizRepository.findAll()).thenReturn(quizListFixture);
        when(mockQuizMapper.fromQuizToQuizDto(any(Quiz.class))).thenReturn(quizDtoFixture);

        Set<QuizDto> actualResult = quizServiceUnderTest.getAllQuizzes();

        verify(mockQuizRepository).findAll();
        verify(mockQuizMapper, times(quizListFixture.size())).fromQuizToQuizDto(any(Quiz.class));

        assertEquals(quizListFixture.size(), actualResult.size());
    }

    @Test
    public void testCreateQuiz() {
        QuizDto quizDtoFixture = new QuizDto();
        Quiz quizFixture = new Quiz();

        when(mockQuizMapper.fromQuizDtoToQuiz(quizDtoFixture)).thenReturn(quizFixture);
        when(mockQuizMapper.fromQuizToQuizDto(quizFixture)).thenReturn(quizDtoFixture);
        when(mockQuizRepository.saveAndFlush(quizFixture)).thenReturn(quizFixture);

        quizServiceUnderTest.createQuiz(quizDtoFixture);

        verify(mockQuizMapper).fromQuizDtoToQuiz(quizDtoFixture);
        verify(mockQuizRepository).saveAndFlush(quizFixture);
        verify(mockQuizMapper).fromQuizToQuizDto(quizFixture);
    }
}
