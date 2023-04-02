package com.company.number;

public class FibonacciTester {
    public static void main(String[] args) {
        FibonacciTester obj = new FibonacciTester();
        System.out.println(obj.fibonacci(10));
    }

    public static long fibonacci(long number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
