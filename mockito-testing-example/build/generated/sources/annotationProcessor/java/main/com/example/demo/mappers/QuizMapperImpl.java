package com.example.demo.mappers;

import com.example.demo.entities.Quiz;
import com.example.demo.models.QuizDto;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-13T09:19:37-0600",
    comments = "version: 1.4.1.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-6.7.1.jar, environment: Java 14.0.1 (Oracle Corporation)"
)
@Component
public class QuizMapperImpl implements QuizMapper {

    @Override
    public QuizDto fromQuizToQuizDto(Quiz quiz) {
        if ( quiz == null ) {
            return null;
        }

        QuizDto quizDto = new QuizDto();

        quizDto.setId( quiz.getId() );
        quizDto.setName( quiz.getName() );

        return quizDto;
    }

    @Override
    public Quiz fromQuizDtoToQuiz(QuizDto quizDto) {
        if ( quizDto == null ) {
            return null;
        }

        Quiz quiz = new Quiz();

        quiz.setId( quizDto.getId() );
        quiz.setName( quizDto.getName() );

        return quiz;
    }
}
