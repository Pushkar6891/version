package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTester {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.forEach(System.out::println);

        System.out.println();
        numbers.stream().map(Integer::valueOf).forEach(System.out::println);

        System.out.println();
        numbers.stream().map(n -> String.valueOf(n)).map(String::toString).forEach(System.out::println);

        System.out.println();
        Integer sum1 = numbers.stream().reduce(0, (total, n) -> Integer.sum(total, n));
        Integer sum2 = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum1 + " " + sum2);

        System.out.println();
        String reduce1 = numbers.stream()
                                .map(String::valueOf)
                                .reduce("", (carry, str) -> carry.concat(str));
        String reduce2 = numbers.stream()
                                .map(String::valueOf)
                                .reduce("", String::concat);
        System.out.println(reduce1 + " " + reduce2);

        System.out.println();
        Integer sumResultEvenNumbers1 = numbers.stream()
                                                .filter(n -> n % 2 == 0)
                                                .map(n -> n * 2)
                                                .reduce(0, Integer::sum);
        Integer sumResultEvenNumbers2 = numbers.stream()
                                                .filter(n -> n % 2 == 0)
                                                .mapToInt(n -> n * 2)
                                                .sum();
        System.out.println(sumResultEvenNumbers1 + " " + sumResultEvenNumbers2);

        System.out.println();
        List<Integer> doubleOfEvenList = numbers.stream()
                                        .filter(n -> n % 2 == 0)
                                        .map(n -> n * 2)
                                        .collect(Collectors.toList());
        doubleOfEvenList.forEach(System.out::println);

        System.out.println();
        Set<Integer> doubleOfEvenSet = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toSet());
        doubleOfEvenSet.forEach(System.out::println);

        System.out.println();

        Optional<Integer> number = numbers.stream()
                .filter(StreamTester::isEven)
                .filter(StreamTester::isGreaterThan2)
                .map(StreamTester::doubleIt)
                .findFirst();

        System.out.println(number.get());

        System.out.println();

        Stream<Integer> infiniteStream = Stream.iterate(100, n -> n + 1);
        System.out.println(infiniteStream.findAny());

        System.out.println();
        int sum = Stream.iterate(1, n -> n + 1)
                .filter(n -> n % 2 == 0)
                .filter(n -> Math.sqrt(n) > 1)
                .mapToInt(n -> n * 2)
                .limit(1)
                .sum();
        System.out.println(sum);

    }

    public static boolean isEven(int n){
        return n % 2 == 0;
    }

    public static boolean isGreaterThan2(int n){
        return n > 2;
    }

    public static int doubleIt(int n){
        return n * 2;
    }
}
