package com.company;

public class Calculator {

    private final CalculatorService calculatorService;

    public Calculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public double perform(double a, double b) {
        return calculatorService.sum(a, b) * a;
    }
}
