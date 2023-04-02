package com.company.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTester {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));

        System.out.println("For Loop");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        System.out.println("Enhanced For Loop");
        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("Java 8 ForEach");
        colors.forEach(System.out::println);

        // Immutable List
        List<String> cities = List.of("Delhi", "Goa");
        // cities.add("Pune");

        System.out.println("Java 8 ForEach");
        cities.forEach(System.out::println);
    }
}
