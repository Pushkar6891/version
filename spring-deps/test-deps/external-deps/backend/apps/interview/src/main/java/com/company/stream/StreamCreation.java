package com.company.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};
        Stream<Integer> integerStream = Stream.of(numbers);
        integerStream.forEach(System.out::println);

        System.out.println();

        IntStream intStream = Arrays.stream(new int[]{1, 2, 3});
        intStream.forEach(System.out::println);

        System.out.println();

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        Stream<Integer> stream = list.stream().filter(x -> x % 2 == 0);
        stream.forEach(System.out::println);

        System.out.println();

        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(System.out::println);

        System.out.println();

        Stream<String> buildStream = Stream.<String>builder().add("A").add("B").build();
        buildStream.forEach(System.out::println);

        System.out.println();

    }
}
