package com.company.codingquestions.codingques003;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrenceTester {
    public static void main(String[] args) {
        CountOccurrenceTester obj = new CountOccurrenceTester();
        String sentence = "Apple Macbook pro is far better than Apple Macbook Air";
        obj.printCountOfWordsInString(sentence);
    }

    private void printCountOfWordsInString(String sentence) {
        long start = System.currentTimeMillis();
        String[] words = sentence.split(" ");
        Arrays.stream(words)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " " + v));
        long end = System.currentTimeMillis();
        System.out.println("Total time : " + (end - start));
    }

}
