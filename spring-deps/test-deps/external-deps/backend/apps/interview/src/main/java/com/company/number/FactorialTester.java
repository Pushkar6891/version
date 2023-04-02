package com.company.number;

public class FactorialTester {
    public static void main(String[] args) {
        FactorialTester obj = new FactorialTester();
        System.out.println(obj.findFactorial(6));
    }

    private int findFactorial(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * findFactorial(n - 1);
        }
    }
}
