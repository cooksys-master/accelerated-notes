package com.cooksys.quizapi.services.impl;

import org.springframework.stereotype.Service;

import com.cooksys.quizapi.mappers.QuizMapper;
import com.cooksys.quizapi.models.QuizDto;
import com.cooksys.quizapi.repositories.QuizRepository;
import com.cooksys.quizapi.services.QuizService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class QuizServiceImpl implements QuizService {

	private QuizRepository quizRepository;
	private QuizMapper quizMapper;

	@Override
	public QuizDto createQuiz(QuizDto quizDto) {
//		Quiz quizToSave = quizMapper.dtoToEntity(quizDto);
//		Quiz savedQuiz = quizRepository.saveAndFlush(quizToSave);
//		return quizMapper.entityToDto(savedQuiz);
		return quizMapper.entityToDto(quizRepository.saveAndFlush(quizMapper.dtoToEntity(quizDto)));
	}

}
