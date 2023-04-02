package com.ashokit.junit4.calculator;

import org.junit.*;

// avoid using _ for method name
// public class
// public method
public class CalculatorTest {

    private static Calculator calculator;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass()");
    }

    @Before
    public void setup(){
        System.out.println("setup()");
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        System.out.println("testAdd()");
        int actual = calculator.add(10, 20);
        int expected = 30;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        System.out.println("testMultiply()");
        int actual = calculator.multiply(10, 20);
        int expected = 200;
        Assert.assertEquals(expected, actual);
    }

    @After
    public void tearDown(){
        System.out.println("tearDown()");
        calculator = null;
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("tearDown()");
    }
}