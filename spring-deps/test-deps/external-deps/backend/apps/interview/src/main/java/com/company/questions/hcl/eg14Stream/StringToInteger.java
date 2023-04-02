package com.company.questions.hcl.eg14Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToInteger {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "7");
        List<Integer> listOfInteger = list.stream().map(Integer::valueOf).collect(Collectors.toList());
        List<String> listOfString = listOfInteger.stream().map(String::valueOf).collect(Collectors.toList());
        System.out.println(listOfString);
    }
}
