package com.cooksys.quizapi.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.quizapi.models.QuizDto;
import com.cooksys.quizapi.services.QuizService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("quiz")
@AllArgsConstructor
public class QuizController {

	private QuizService quizService;

	@PostMapping
	public QuizDto createQuiz(@RequestBody QuizDto quizDto) {
		return quizService.createQuiz(quizDto);
	}

}
