package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SumCalculatorTests {

    SumCalculator calc;

    //Given
    @BeforeEach
    public void init() {
     calc = new SumCalculator();
    }

    @Test
    public void testThatSumsFor1WorksCorrectly() {
        //When
        int actual = calc.sum(1);

        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
        System.out.println("test for sum(1) passed");
    }

    @Test
    public void testThatSumsFor3WorksCorrectly() {
        //When
        int actual = calc.sum(3);

        //Then
        int expected = 6;
        Assertions.assertEquals(expected, actual);
        System.out.println("test for sum(3) passed");
    }

    @Test
    public void testThatSumsForZeroWorksCorrectly() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calc.sum(-3);
        });
        System.out.println("test for sum(0) passed. Exception is thrown.");
    }
}
