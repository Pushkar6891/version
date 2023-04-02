package com.company.number;

import java.util.stream.IntStream;

// https://www.youtube.com/watch?v=Ee5t_EGjv0A
public class PrimeNumberTester {

    public static void main(String[] args) {
        PrimeNumberTester obj = new PrimeNumberTester();
        System.out.println(obj.isPrime(1));
        System.out.println(obj.isPrime(2));
        System.out.println(obj.isPrime(3));
        System.out.println(obj.isPrime(4));
    }

    public boolean isPrime(final int number) {
        return number > 1 && IntStream.range(2, number)
                                      .noneMatch(divisor -> number % divisor == 0);
    }
}