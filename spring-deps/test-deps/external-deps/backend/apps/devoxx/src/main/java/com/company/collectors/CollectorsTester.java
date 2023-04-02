package com.company.collectors;

import com.company.Person;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsTester {
    public static void main(String[] args) {
        CollectorsTester obj = new CollectorsTester();
        obj.test1();
        System.out.println();
        obj.test2();
        System.out.println();
        obj.test3();
        System.out.println();
        obj.test4();
        System.out.println();
        obj.test5();
        System.out.println();
        obj.test6();
        System.out.println();
        obj.test7();
        System.out.println();
        obj.test8();
        System.out.println();
        obj.test9();
        System.out.println();
        obj.test10();
        System.out.println();
        obj.test11();
        System.out.println();
        obj.test12();
        System.out.println();
        obj.test13();
    }

    private void test1() {
        getAllPersons().stream().map(Person::getName).forEach(System.out::println);
    }

    private void test2() {
        Integer sum = getAllPersons().stream().map(Person::getAge).reduce(0, Integer::sum);
        System.out.println(sum);
    }

    private void test3() {
        Integer sum = getAllPersons().stream().mapToInt(Person::getAge).sum();
        System.out.println(sum);
    }

    private void test4() {
        getAllPersons().stream()
                .filter(person -> person.getAge() > 30)
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toUnmodifiableList())
                .forEach(System.out::println);
    }

    private void test5() {
        getAllPersons().stream()
                .filter(person -> person.getAge() > 30)
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toUnmodifiableSet())
                .forEach(System.out::println);
    }

    private void test6() {
        getAllPersons().stream()
                .collect(Collectors.toUnmodifiableMap(Person::getName, Person::getAge))
                .forEach((k, v) -> System.out.println(k + " " + v));
    }

    private void test7() {
        String csv = getAllPersons().stream()
                .filter(person -> person.getAge() > 30)
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println("Comma Separated List : " + csv);
    }

    private void test8() {
        getAllPersons().stream()
                .collect(Collectors.partitioningBy(person -> person.getAge() % 2 == 0))
                .forEach((k, v) -> System.out.println(k + " " + v));
    }

    private void test9() {
        getAllPersons().stream()
                .collect(Collectors.groupingBy(Person::getName, Collectors.mapping(Person::getAge, Collectors.toUnmodifiableList())))
                .forEach((k, v) -> System.out.println(k + " " + v));
    }

    private void test10() {
        getAllPersons().stream()
                .collect(Collectors.groupingBy(Person::getName, Collectors.collectingAndThen(Collectors.counting(), Long::intValue)))
                .forEach((k, v) -> System.out.println(k + " " + v));
    }

    private void test11() {
        String name = getAllPersons().stream()
                .collect(
                        Collectors.collectingAndThen(
                                Collectors.maxBy(
                                        Comparator.comparing(Person::getAge)), person -> person.map(Person::getName).orElse("")
                        )
                );
        System.out.println(name);
    }

    private void test12() {
        getAllPersons().stream()
                .collect(
                        Collectors.groupingBy(
                                Person::getAge, Collectors.mapping(
                                        Person::getName, Collectors.filtering(
                                                name -> name.length() > 4, Collectors.toUnmodifiableList()
                                        )
                                )
                        )
                ).forEach((k, v) -> System.out.println(k + " " + v));
    }

    private void test13() {
        getAllPersons().stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName,Comparator.reverseOrder()))
                .forEach(System.out::println);
    }

    private List<Person> getAllPersons() {
        return List.of(
                new Person("Sachin", 50),
                new Person("Ganguly", 96),
                new Person("Sehwag", 10),
                new Person("Rahul", 20),
                new Person("Kohli", 59),
                new Person("Dhoni", 56),
                new Person("Rohit", 90),
                new Person("Ashwin", 80),
                new Person("Bhajji", 60),
                new Person("Bumrah", 20),
                new Person("Nehra", 30)
        );
    }
}
