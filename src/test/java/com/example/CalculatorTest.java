package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testAddingTwoNumbers() {
        Assertions.assertEquals(13, calculator.add(7, 6));
    }
}
