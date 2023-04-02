package com.company.javafunctionalprogramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Eg12Lambdas {
    public static void main(String[] args) {
        Function<String, String> uppercaseName = name -> name.toUpperCase();
        Function<String, String> lowercaseName = String::toLowerCase;
        Function<String, String> upperCaseName = name -> {
            // Lambda Body
            if (name.isBlank()) {
                throw new IllegalArgumentException("");
            }
            return name.toUpperCase();
        };
        BiFunction<String, Integer, String> upperCaseBiFunction = (name, age) -> {
            // Lambda Body
            if (name.isBlank()) {
                throw new IllegalArgumentException("");
            }

            System.out.println(name + " " + age);
            return name.toUpperCase();
        };
        String myUpperCaseName = upperCaseBiFunction.apply("Pushkar", 30);
        System.out.println(myUpperCaseName);


    }
}
