package com.company.javaoptionals;

import java.util.Optional;

public class OptionalTester {
    public static void main(String[] args) {
        System.out.println(Optional.empty());
        System.out.println(Optional.empty().isPresent());
        System.out.println(Optional.empty().isEmpty());

        System.out.println(Optional.of("hello"));
        System.out.println(Optional.of("hello").orElse("world"));
      //System.out.println(Optional.of(null).orElse("world"));

        System.out.println(Optional.ofNullable(null).orElse("world"));
        System.out.println(Optional.ofNullable("hello")
                .map(String::toUpperCase)
                .orElseGet(() -> {
                    return "world";
                }));

        System.out.println(Optional.ofNullable("hello")
                .map(String::toUpperCase)
                .orElseThrow(IllegalStateException::new));

        Optional.ofNullable("hello").ifPresent(System.out::println);
        Optional.ofNullable("hello").ifPresentOrElse(System.out::println, () -> System.out.println("world"));
        Optional.ofNullable(null).ifPresentOrElse(System.out::println, () -> System.out.println("world"));
    }
}
