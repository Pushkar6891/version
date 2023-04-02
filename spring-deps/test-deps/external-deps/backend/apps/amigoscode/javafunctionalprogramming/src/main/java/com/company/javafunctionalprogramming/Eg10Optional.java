package com.company.javafunctionalprogramming;

import java.util.Optional;

public class Eg10Optional {
    public static void main(String[] args) {
        Object value1 = Optional.ofNullable(null)
                .orElseGet(() -> "default value");
        System.out.println(value1);

        Object value2 = Optional.ofNullable("Hello")
                .orElseGet(() -> "default value");
        System.out.println(value2);

        Object value3 = Optional.ofNullable("Hello")
                .orElseThrow(() -> new IllegalStateException("Illegal State Exception"));
        System.out.println(value3);

        Optional.ofNullable("pushkarchauhan91@gmail.com")
                .ifPresentOrElse((email) -> {
                            System.out.println("Sending email to " + email);
                        },
                        () -> {
                            System.out.println("Invalid Email");
                        });
    }
}
