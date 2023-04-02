package com.company.methodreference;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceExample {

    public static void main(String[] args) {
        MethodReferenceExample obj = new MethodReferenceExample();
        obj.methodReferenceToStaticMethod1();
        System.out.println();
        obj.methodReferenceToStaticMethod2();
        System.out.println();
        obj.methodReferenceToAnInstanceMethodOfAnObject();
        System.out.println();
        obj.methodReferenceToAnInstanceMethodOfAnArbitraryObject1();
        System.out.println();
        obj.methodReferenceToAnInstanceMethodOfAnArbitraryObject2();
        System.out.println();
        obj.methodReferenceToConstructor();
    }

    private void methodReferenceToStaticMethod1() {
//        Function<Integer, Double> function = (n) -> Math.sqrt(n);
//        System.out.println(function.apply(16));

        Function<Integer, Double> function = Math::sqrt;
        System.out.println(function.apply(16));
    }

    private void methodReferenceToStaticMethod2() {
        BiFunction<Integer, Integer, Integer> biFunction = MethodReferenceExample::add;
        System.out.println(biFunction.apply(10, 20));
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private void methodReferenceToAnInstanceMethodOfAnObject() {
//        Printable printable1 = (message) -> new MethodReferenceExample().display(message);
//        printable1.print("Hello World");

        Printable printable2 = new MethodReferenceExample()::display;
        printable2.print("Hello World");
    }

    private void display(String message) {
        System.out.println(message.toUpperCase());
    }

    interface Printable {
        void print(String message);
    }

    private void methodReferenceToAnInstanceMethodOfAnArbitraryObject1() {
//        Function<String,String> function1 = (str) -> str.toUpperCase();
//        System.out.println(function1.apply("Pushkar"));

        Function<String, String> function2 = String::toUpperCase;
        System.out.println(function2.apply("Pushkar"));
    }

    private void methodReferenceToAnInstanceMethodOfAnArbitraryObject2() {
        String[] names = {"Rahul Tewatia", "Rahul Dravid", "rachit"};

//        Arrays.sort(names,(e1,e2)->e1.compareTo(e2));

//        Arrays.sort(names, Comparator.naturalOrder());

//        Arrays.sort(names, String::compareTo);
//        Rahul Dravid Rahul Tewatia rachit

        Arrays.sort(names, String::compareToIgnoreCase);
//        rachit Rahul Dravid Rahul Tewatia

        Arrays.stream(names).forEach(System.out::println);
    }

    private void methodReferenceToConstructor() {
        List<String> temperatures = List.of("25", "30", "25", "20", "-1");

        Function<List<String>, Set<String>> function1 = (temparatures) -> new HashSet<>(temperatures);
        System.out.println(function1.apply(temperatures));

        Function<List<String>, Set<String>> function2 = HashSet::new;
        System.out.println(function2.apply(temperatures));
    }
}
