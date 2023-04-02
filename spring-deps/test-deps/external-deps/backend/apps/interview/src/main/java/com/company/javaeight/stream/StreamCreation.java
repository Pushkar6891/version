package com.company.javaeight.stream;

import java.util.Arrays;
import java.util.List;

public class StreamCreation {
    public static void main(String[] args) {
        List<String> metros = Arrays.asList("Delhi", "Mumbai", "Chennai", "Kolkata");
        metros.stream().forEach(System.out::println);
    }
}
