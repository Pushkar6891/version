package com.rest.app.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        assertEquals(20, calculator.multiply(4, 5));
        assertEquals(25, calculator.multiply(5, 5));
    }

    @Test
    public void shouldMultiplyTwoNumbers_failure() {
        assertNotEquals(10, calculator.multiply(5, 5));
    }

    @Test
    public void shouldDivideTwoNumbers() {
        assertEquals(4, calculator.divide(8, 2));
    }

    @Test
    @Disabled
    public void shouldDivideTwoNumbers_failure() {
        assertNotEquals(0, calculator.divide(8, 0));
    }
}