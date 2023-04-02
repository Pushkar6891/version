package com.company.stream;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// https://www.youtube.com/watch?v=t1-YZ6bF-g0&t=256
public class StreamTester {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        StreamTester obj = new StreamTester();
        obj.intStream();
        System.out.println();
        obj.intStreamSkipFirst5Elements();
        System.out.println();
        obj.intStreamSumOfTop10NaturalNumbers();
        System.out.println();
        obj.findFirstElementPostAscSorting();
        System.out.println();
        obj.findFirstElementPostDescSorting();
        System.out.println();
        obj.streamFromStringArrayFilterSortPrint();
        System.out.println();
        obj.streamFromIntegerArrayAverageOfSquareOfNumbers();
        System.out.println();
        obj.streamFromListFilterPrint();
        System.out.println();
        obj.reductionSum();
        System.out.println();
        obj.reductionSummaryStatistics();
    }

    private void reductionSummaryStatistics() {
        IntSummaryStatistics intSummaryStatistics = IntStream.of(3, 2, 7).summaryStatistics();
        System.out.println(intSummaryStatistics);
    }

    private void reductionSum() {
//      Double sum = Stream.of(3.14, 2.31).reduce(0.0, (Double a, Double b) -> a + b);
        Double sum = Stream.of(3.14, 2.31).reduce(0.0, Double::sum);
        System.out.println(sum);
    }

    private void streamFromListFilterPrint() {
        List<String> list = new ArrayList<>(Arrays.asList("Delhi", "Bangkok", "Mumbai", "Bangalore", "Chennai", "Kolkata", "Hyderabad", "Indore", "Bhopal"));
        list.stream().map(String::toLowerCase).filter(x -> x.startsWith("b")).forEach(System.out::println);
    }

    private void streamFromIntegerArrayAverageOfSquareOfNumbers() {
        int[] nums = {2, 6, 4, 8, 10};
        Arrays.stream(nums).map(n -> n * n).average().ifPresent(System.out::println);
    }

    private void streamFromStringArrayFilterSortPrint() {
        String[] arr = {"Delhi", "Mumbai", "Bangalore", "Chennai", "Kolkata", "Hyderabad", "Indore", "Bhopal"};
        Stream.of(arr).filter(x -> x.startsWith("B")).sorted().forEach(System.out::println);
    }

    private void findFirstElementPostDescSorting() {
//      Stream.of("Delhi", "Mumbai", "Bangalore").sorted(Comparator.reverseOrder()).findFirst().ifPresent(System.out::println);
//      Stream.of("Delhi", "Mumbai", "Bangalore").min(Comparator.reverseOrder()).ifPresent(System.out::println);
        Stream.of("Delhi", "Mumbai", "Bangalore").max(Comparator.naturalOrder()).ifPresent(System.out::println);
    }

    private void findFirstElementPostAscSorting() {
        Stream.of("Delhi", "Mumbai", "Bangalore").sorted().findFirst().ifPresent(System.out::println);
    }

    private void intStreamSumOfTop10NaturalNumbers() {
        int sum = IntStream.range(1, 11).sum();
        System.out.println(sum);
    }

    private void intStreamSkipFirst5Elements() {
        IntStream.range(1, 10).skip(5).forEach(System.out::println);
    }

    private void intStream() {
        IntStream.range(1, 10).forEach(System.out::println);
    }
}
