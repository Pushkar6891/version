package com.company.javafunctionalprogramming;

import java.util.function.BiFunction;

public class Eg04BiFunction {
    private static BiFunction<Integer, Integer, Integer> incrementByOneAndMultipleBiFunction;

    public static void main(String[] args) {
        Eg04BiFunction obj = new Eg04BiFunction();

        BiFunction<Integer, Integer, Integer> incrementByOneAndMultipleBiFunction = (numberToincrementByOne, numberToMultiplyBy) -> (numberToincrementByOne + 1) * numberToMultiplyBy;

        System.out.println(obj.incrementByOneAndMultiple(4, 100));
        System.out.println(incrementByOneAndMultipleBiFunction.apply(4, 100));
    }

    // Normal Way : Imperative
    public int incrementByOneAndMultiple(int number, int numTomultiplyBy) {
        return (number + 1) * numTomultiplyBy;
    }

}
