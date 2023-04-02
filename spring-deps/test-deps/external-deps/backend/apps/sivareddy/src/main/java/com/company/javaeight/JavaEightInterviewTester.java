package com.company.javaeight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaEightInterviewTester {
    public static void main(String[] args) {
        // Stream(Lazy) vs Collection(Eager)
        // Stream are functional in nature it does not modify source

        // Stream Creation
        System.out.println("Stream.of");
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        integerStream.forEach(System.out::println);
        System.out.println("\nStream Printing");
        List<String> names = List.of("Rahul Verma", "Raj Kumar", "Raja");
        names.stream().forEach(System.out::println);
        System.out.println("\nStream Filtering");
        List<String> filteredList = names.stream().filter(e -> e.contains("Raj")).collect(Collectors.toList());
        filteredList.stream().forEach(System.out::println);
        System.out.println("\nStream Asc Sorting");
        List<String> ascSortedList = names.stream().sorted().collect(Collectors.toList());
        ascSortedList.stream().forEach(System.out::println);
        System.out.println("\nStream Desc Sorting");
        List<String> descSortedList = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        descSortedList.stream().forEach(System.out::println);
        System.out.println("\nStream anyMatch");
        boolean anyMatch = names.stream().anyMatch(e -> e.startsWith("R") && e.length() > 5);
        System.out.println(anyMatch);
        System.out.println("\nStream allMatch");
        boolean allMatch = names.stream().allMatch(e -> e.startsWith("R") && e.length() > 5);
        System.out.println(allMatch);
        System.out.println("\nStream noneMatch");
        boolean noneMatch = names.stream().noneMatch(e -> e.startsWith("R") && e.length() > 5);
        System.out.println(noneMatch);
        System.out.println("\nStream findFirst");
        String findFirst = names.stream().filter(e -> e.startsWith("R") && e.length() > 5).findFirst().get();
        System.out.println(findFirst);
        System.out.println("\nStream ParallelStream");
        names.parallelStream().forEach(System.out::println);
        System.out.println("\nStream Unbounded Elements");
        Stream.generate(new Random()::nextInt).limit(5).forEach(System.out::println);
        System.out.println("\nStream iterate");
        Stream.iterate(5, n -> n + 10).limit(3).forEach(System.out::println);
        System.out.println("\nStream Map");
        names.stream().map(String::valueOf).forEach(System.out::println);

        // Optional
        System.out.println("\nOptional of");
        Optional<String> ofOptional = Optional.of("Pushkar");
        System.out.println(ofOptional.isPresent());
        System.out.println(ofOptional.isEmpty());
        System.out.println(ofOptional.get());

        System.out.println("\nOptional ofNullable");
        Optional<Object> ofNullable = Optional.ofNullable(null);
        System.out.println(ofNullable.orElse("Chauhan"));

        // Functional Interface
        System.out.println("\nFunctional Interface Runnable");
        Runnable runnable = () -> System.out.println("run() invoked");
        Thread runnableThread = new Thread(runnable);
        runnableThread.start();

        // Lambda Expression
        // Method Reference
        // DateTime API
        System.out.println("\nDate Time API");
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
    }
}
// https://www.youtube.com/watch?v=XeYJRR1G0Wk