package com.cooksys.quizapi.mappers;

import org.mapstruct.Mapper;

import com.cooksys.quizapi.entities.Quiz;
import com.cooksys.quizapi.models.QuizDto;

@Mapper(componentModel = "spring")
public interface QuizMapper {
	
	Quiz dtoToEntity(QuizDto quizDto);
	
	QuizDto entityToDto(Quiz quiz);

}
