package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassroomTest {
    Classroom classroom;

    @BeforeEach
    void setUp() {
        classroom = new Classroom();
    }

    @Test
    @DisplayName("It should find the maximum result")
    void testGetMaximumResult() {
        assertEquals(100, classroom.getMaximumResult(), "Finding the maximum result should work");
    }

    @Test
    @DisplayName("It should find the minimum result")
    void testGetMinimumResult() {
        assertEquals(20, classroom.getMinimumResult(), "Finding the maximum result should work");
    }

    @Test
    @DisplayName("It should find the number of students")
    void testGetNumberOfStudents() {
        assertEquals(17, classroom.getNumberOfStudents(), "Finding the number of students should work");
    }

    @Test
    @DisplayName("It should find the most frequent result")
    void testGetMostFrequentResult() {
        assertEquals(90, classroom.getMostFrequentResult(), "Finding the most frequent result should work");
    }

    @Test
    @DisplayName("It should find the mean of results")
    void testFindMeanOfResults() {
        assertEquals(74.05882352941177, classroom.findMeanOfResults(), "Finding the mean result should work");
    }
}
