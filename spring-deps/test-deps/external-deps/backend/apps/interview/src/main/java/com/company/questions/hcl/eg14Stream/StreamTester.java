package com.company.questions.hcl.eg14Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTester {
    public static void main(String[] args) {
        IntStream stream = Arrays.stream(new int[]{9, 8, 2, 6, 3});

        // stream.forEach(System.out::println);
        System.out.println();
        // Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        stream.filter(n->n>5).forEach(System.out::println);
    }
}
