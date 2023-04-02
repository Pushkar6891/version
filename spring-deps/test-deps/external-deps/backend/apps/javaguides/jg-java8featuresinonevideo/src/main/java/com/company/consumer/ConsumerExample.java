package com.company.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer1 = (s) -> System.out.println(s);
        consumer1.accept("Hello World!!");

        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("Hello World!!");
    }
}
