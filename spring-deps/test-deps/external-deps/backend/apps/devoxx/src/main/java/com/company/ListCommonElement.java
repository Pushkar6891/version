package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListCommonElement {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list2 = Arrays.asList(2, 3, 5, 7, 13, 17);

        list1.stream()
                .distinct()
                .filter(list2::contains)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
