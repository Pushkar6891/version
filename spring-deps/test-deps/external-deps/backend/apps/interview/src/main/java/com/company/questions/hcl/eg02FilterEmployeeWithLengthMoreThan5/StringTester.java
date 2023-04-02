package com.company.questions.hcl.eg02FilterEmployeeWithLengthMoreThan5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringTester {
    public static void main(String[] args) {
        String[] arr = new String[]{"Delhi", "Mumbai", "Chennai", "Goa"};
        List<String> list = Arrays.stream(arr).collect(Collectors.toList());
        list.stream().filter(x -> x.length() > 5).forEach(System.out::println);
    }
}
