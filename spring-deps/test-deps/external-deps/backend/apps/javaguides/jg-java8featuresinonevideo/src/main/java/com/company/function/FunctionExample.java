package com.company.function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> function1 = (s) -> s.length();
        System.out.println(function1.apply("Pushkar"));

        Function<String, Integer> function2 = String::length;
        System.out.println(function2.apply("Pushkar"));
    }

}
