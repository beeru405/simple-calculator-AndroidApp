package com.example.calculatorapp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        int result = MainActivity.add(5, 3);
        assertEquals(8, result);
    }
}
