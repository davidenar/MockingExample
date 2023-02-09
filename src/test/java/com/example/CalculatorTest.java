package com.example;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;

public class CalculatorTest {
    private Calculator calculator = new Calculator();


    @Test
    public void testAddingAllElementsInList() {
        Assertions.assertEquals(20, calculator.add(Lists.list(5,5,5,5)));
    }

    @Test
    public void testAddingElementsInEmptyListShouldReturnZero() {
        Assertions.assertEquals(0, calculator.add(new ArrayList<Integer>()));
    }

    @Test
    public void testAddingElementsFromNullShouldThrowException() {
        Assertions.assertThrows(RuntimeException.class, () -> calculator.add(null));
    }
}
