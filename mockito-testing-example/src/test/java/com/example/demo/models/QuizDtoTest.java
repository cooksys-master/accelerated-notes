package com.example.demo.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuizDtoTest {

    private static final Long QUIZ_ID = 1L;
    private static final String QUIZ_NAME = "Test Quiz";
    private static QuizDto quizDtoUnderTest;

    @BeforeAll
    public static void createQuizDtoFixture() {
        quizDtoUnderTest = new QuizDto();
    }

    @Test
    public void testGetAndSetId() {
        quizDtoUnderTest.setId(QUIZ_ID);
        assertEquals(QUIZ_ID, quizDtoUnderTest.getId());
    }

    @Test
    public void testGetAndSetName() {
        quizDtoUnderTest.setName(QUIZ_NAME);
        assertEquals(QUIZ_NAME, quizDtoUnderTest.getName());
    }

    @Test
    public void testEquals() {
        QuizDto quizDto1 = new QuizDto();
        quizDto1.setId(QUIZ_ID);
        quizDto1.setName(QUIZ_NAME);

        QuizDto quizDto2 = new QuizDto();
        quizDto2.setId(QUIZ_ID);
        quizDto2.setName(QUIZ_NAME);

        QuizDto quizDto3 = new QuizDto();
        quizDto3.setId(2L);
        quizDto3.setName("Different Quiz");

        assertEquals(quizDto2, quizDto1);
        assertNotEquals(null, quizDto1);
        assertNotEquals(new QuizDto(), quizDto1);
        assertNotEquals(quizDto3, quizDto1);
    }
}
