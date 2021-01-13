package com.example.demo.entities;

import com.example.demo.models.QuizDto;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuizTest {

    private static final Long QUIZ_ID = 1L;
    private static final String QUIZ_NAME = "Test Quiz";

    private static Quiz quizUnderTest;

    @BeforeAll
    public static void createQuizFixture() {
        quizUnderTest = new Quiz();
    }

    @Test
    public void testGetAndSetId() {
        quizUnderTest.setId(QUIZ_ID);
        assertEquals(QUIZ_ID, quizUnderTest.getId());
    }

    @Test
    public void testGetAndSetName() {
        quizUnderTest.setName(QUIZ_NAME);
        assertEquals(QUIZ_NAME, quizUnderTest.getName());
    }

    @Test
    public void testEquals() {
        Quiz quiz1 = new Quiz();
        quiz1.setId(QUIZ_ID);
        quiz1.setName(QUIZ_NAME);

        Quiz quiz2 = new Quiz();
        quiz2.setId(QUIZ_ID);
        quiz2.setName(QUIZ_NAME);

        Quiz quiz3 = new Quiz();
        quiz3.setId(2L);
        quiz3.setName("Different Quiz");

        assertEquals(quiz2, quiz1);
        assertNotEquals(null, quiz1);
        assertNotEquals(new Quiz(), quiz1);
        assertNotEquals(quiz3, quiz1);
    }
}
