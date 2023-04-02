package com.company.junit5.ashokit.junit5.calculator;

import com.company.junit5.ashokit.junit5.calculator.Calculator;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    void beforeAll() {
        System.out.println("beforeAll()");
    }

    @BeforeEach
    void setUp() {
        System.out.println("setUp()");
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        System.out.println("testAdd()");
        int actual = calculator.add(10, 20);
        int expected = 30;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMultiply() {
        System.out.println("testMultiply()");
        int actual = calculator.multiply(10, 20);
        int expected = 200;
        Assertions.assertEquals(expected, actual);
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown()");
        calculator = null;
    }

    @AfterAll
    void afterAll() {
        System.out.println("afterAll()");
    }
}