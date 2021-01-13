package com.example.demo.mappers;

import com.example.demo.entities.Quiz;
import com.example.demo.models.QuizDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface QuizMapper {

    QuizDto fromQuizToQuizDto(Quiz quiz);

    Quiz fromQuizDtoToQuiz(QuizDto quizDto);

}
