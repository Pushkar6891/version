package com.company;

public class CalculatorService implements ICalculator {

    @Override
    public double sum(double a, double b) {
        return a + b;
    }
}