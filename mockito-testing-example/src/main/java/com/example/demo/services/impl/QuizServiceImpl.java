package com.example.demo.services.impl;

import com.example.demo.entities.Quiz;
import com.example.demo.mappers.QuizMapper;
import com.example.demo.models.QuizDto;
import com.example.demo.repositories.QuizRepository;
import com.example.demo.services.QuizService;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class QuizServiceImpl implements QuizService {

    private final QuizRepository quizRepository;
    private final QuizMapper quizMapper;

    public QuizServiceImpl(QuizRepository quizRepository, QuizMapper quizMapper) {
        this.quizRepository = quizRepository;
        this.quizMapper = quizMapper;
    }

    @Override
    public Set<QuizDto> getAllQuizzes() {
        return quizRepository
                .findAll()
                .stream()
                .map(quizMapper::fromQuizToQuizDto)
                .collect(Collectors.toSet());
    }

    @Override
    public QuizDto createQuiz(QuizDto quizDto) {
        Quiz quizToSave = quizMapper.fromQuizDtoToQuiz(quizDto);
        Quiz savedQuiz = quizRepository.saveAndFlush(quizToSave);
        QuizDto result = quizMapper.fromQuizToQuizDto(savedQuiz);
        return result;
    }

}
