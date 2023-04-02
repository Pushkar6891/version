package com.company.immutability;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tester {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                         .filter(n -> n % 2 == 0)
                         .mapToInt(n -> n * 2)
                         .sum();
        System.out.println(sum);

        List<Integer> numbersSum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());
        numbersSum.forEach(System.out::println);

    }
}
