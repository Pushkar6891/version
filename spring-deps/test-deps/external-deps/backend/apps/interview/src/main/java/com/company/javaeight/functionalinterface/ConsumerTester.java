package com.company.javaeight.functionalinterface;

import java.util.function.Consumer;

public class ConsumerTester {
    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
        consumer.accept("Pushkar Chauhan");


    }
}
