package com.company.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Stream<String> ofStream = Stream.of("a", "b", "c");
        ofStream.forEach(System.out::println);

        System.out.println();

        List<String> fruits = Arrays.asList("Apple", "Mango", "Kiwi");
        fruits.stream().forEach(System.out::println);

        System.out.println();

        Set<Integer> scores = Set.of(9,6,4);
        scores.stream().forEach(System.out::println);

        System.out.println();

        Set<String> fruitSet = new HashSet<>(fruits);
        fruitSet.stream().forEach(System.out::println);

        System.out.println();

        String[] metro = {"Delhi","Mumbai","Chennai"};
        Arrays.stream(metro).forEach(System.out::println);

        System.out.println();

    }
}
