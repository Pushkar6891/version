package com.company.javafunctionalprogramming;

import java.util.function.Function;

public class Eg03Function {
    public static void main(String[] args) {
        Eg03Function obj = new Eg03Function();
        Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
        Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;
        System.out.println(incrementByOneFunction.apply(23));
        System.out.println(incrementByOneFunction.andThen(multiplyByTenFunction).apply(10));
    }
}
