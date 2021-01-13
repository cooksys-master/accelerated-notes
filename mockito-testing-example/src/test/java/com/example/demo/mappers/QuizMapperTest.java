package com.example.demo.mappers;

import com.example.demo.entities.Quiz;
import com.example.demo.models.QuizDto;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class QuizMapperTest {

    private static final Long QUIZ_ID = 1L;
    private static final String QUIZ_NAME = "Test Quiz";

    private static Quiz emptyQuizFixture;
    private static QuizDto emptyQuizDtoFixture;
    private static Quiz idOnlyQuizFixture;
    private static QuizDto idOnlyQuizDtoFixture;
    private static Quiz nameOnlyQuizFixture;
    private static QuizDto nameOnlyQuizDtoFixture;
    private static Quiz fullQuizFixture;
    private static QuizDto fullQuizDtoFixture;

    @Autowired
    private QuizMapper quizMapperUnderTest;

    @BeforeAll
    public static void createQuizAndQuizDtoFixtures() {
        emptyQuizFixture = createQuizFixture();
        emptyQuizDtoFixture = createQuizDtoFixture();
        idOnlyQuizFixture = createQuizFixture(QUIZ_ID);
        idOnlyQuizDtoFixture = createQuizDtoFixture(QUIZ_ID);
        nameOnlyQuizFixture = createQuizFixture(QUIZ_NAME);
        nameOnlyQuizDtoFixture = createQuizDtoFixture(QUIZ_NAME);
        fullQuizFixture = createQuizFixture(QUIZ_ID, QUIZ_NAME);
        fullQuizDtoFixture = createQuizDtoFixture(QUIZ_ID, QUIZ_NAME);
    }

    @Test
    public void testFromQuizDtoToQuiz() {
        assertEquals(emptyQuizFixture, quizMapperUnderTest.fromQuizDtoToQuiz(emptyQuizDtoFixture));
        assertEquals(idOnlyQuizFixture, quizMapperUnderTest.fromQuizDtoToQuiz(idOnlyQuizDtoFixture));
        assertEquals(nameOnlyQuizFixture, quizMapperUnderTest.fromQuizDtoToQuiz(nameOnlyQuizDtoFixture));
        assertEquals(fullQuizFixture, quizMapperUnderTest.fromQuizDtoToQuiz(fullQuizDtoFixture));
        assertNull(quizMapperUnderTest.fromQuizDtoToQuiz(null));
    }

    @Test
    public void testFromQuizToQuizDto() {
        assertEquals(emptyQuizDtoFixture, quizMapperUnderTest.fromQuizToQuizDto(emptyQuizFixture));
        assertEquals(idOnlyQuizDtoFixture, quizMapperUnderTest.fromQuizToQuizDto(idOnlyQuizFixture));
        assertEquals(nameOnlyQuizDtoFixture, quizMapperUnderTest.fromQuizToQuizDto(nameOnlyQuizFixture));
        assertEquals(fullQuizDtoFixture, quizMapperUnderTest.fromQuizToQuizDto(fullQuizFixture));
        assertNull(quizMapperUnderTest.fromQuizToQuizDto(null));
    }

    private static Quiz createQuizFixture() {
        return createQuizFixture(null, null);
    }

    private static Quiz createQuizFixture(Long id) {
        return createQuizFixture(id, null);
    }

    private static Quiz createQuizFixture(String name) {
        return createQuizFixture(null, name);
    }

    private static Quiz createQuizFixture(Long id, String name) {
        Quiz result = new Quiz();
        result.setId(id);
        result.setName(name);
        return result;
    }

    private static QuizDto createQuizDtoFixture() {
        return createQuizDtoFixture(null, null);
    }

    private static QuizDto createQuizDtoFixture(Long id) {
        return createQuizDtoFixture(id, null);
    }

    private static QuizDto createQuizDtoFixture(String name) {
        return createQuizDtoFixture(null, name);
    }

    private static QuizDto createQuizDtoFixture(Long id, String name) {
        QuizDto result = new QuizDto();
        result.setId(id);
        result.setName(name);
        return result;
    }
}
