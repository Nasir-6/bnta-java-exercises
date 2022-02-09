package com.mfin.javaExercises.week1.fri.java_fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {

    @Test
    void canCompareHigherWithLower() {
        // Given
        Exercise1 underTest = new Exercise1();
        int num1 = 3;
        int num2 = 2;

        //When
        String actual = underTest.compare(num1, num2);
        //Then

    }
}