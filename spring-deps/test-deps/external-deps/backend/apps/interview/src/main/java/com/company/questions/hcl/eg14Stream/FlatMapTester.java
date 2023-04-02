package com.company.questions.hcl.eg14Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapTester {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(7, 19, 11);
        List<Integer> divisibleBy8 = Arrays.asList(8, 16, 32);
        List<Integer> result = Stream.of(primes, divisibleBy8).flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println(result);
    }
}
