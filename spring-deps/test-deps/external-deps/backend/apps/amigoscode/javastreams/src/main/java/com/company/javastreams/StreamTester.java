package com.company.javastreams;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTester {
    public static void main(String[] args) {
        StreamTester obj = new StreamTester();
        List<Person> persons = obj.getPersons();

        obj.testFilterUsingImperativeApproach(persons);
        System.out.println();
        obj.testSortUsingImperativeApproach(persons);
        System.out.println();
        obj.testAllMatchUsingImperativeApproach(persons);
        System.out.println();
        obj.testAnyMatchUsingImperativeApproach(persons);
        System.out.println();
        obj.testNoneMatchUsingImperativeApproach(persons);
        System.out.println();
        obj.testMinUsingImperativeApproach(persons);
        System.out.println();
        obj.testMaxUsingImperativeApproach(persons);
        System.out.println();
        obj.testGroupUsingImperativeApproach(persons);
        System.out.println();

        obj.testFilter(persons);
        System.out.println();
        obj.testSort(persons);
        System.out.println();
        obj.testAllMatch(persons);
        System.out.println();
        obj.testAnyMatch(persons);
        System.out.println();
        obj.testNoneMatch(persons);
        System.out.println();
        obj.testMin(persons);
        System.out.println();
        obj.testMax(persons);
        System.out.println();
        obj.testGroup(persons);
        System.out.println();
        obj.getOldestFemale(persons);
        System.out.println();
    }

    private void testFilterUsingImperativeApproach(List<Person> persons) {
        List<Person> females = new LinkedList<>();

        for (Person person : persons) {
            if (Gender.FEMALE.equals(person.getGender())) {
                females.add(person);
            }
        }
        females.forEach(System.out::println);
    }

    private void testSortUsingImperativeApproach(List<Person> persons) {

    }

    private void testAllMatchUsingImperativeApproach(List<Person> persons) {

    }

    private void testAnyMatchUsingImperativeApproach(List<Person> persons) {

    }

    private void testNoneMatchUsingImperativeApproach(List<Person> persons) {

    }

    private void testMinUsingImperativeApproach(List<Person> persons) {

    }

    private void testMaxUsingImperativeApproach(List<Person> persons) {

    }

    private void testGroupUsingImperativeApproach(List<Person> persons) {

    }

    private void testFilter(List<Person> persons) {
        List<Person> females = persons.stream()
                .filter(person -> Gender.FEMALE.equals(person.getGender()))
                .collect(Collectors.toList());
        females.forEach(System.out::println);
    }

    private void testSort(List<Person> persons) {
        persons.stream()
                .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender).reversed())
                .collect(Collectors.toList());
    }

    private void testAllMatch(List<Person> persons) {
        boolean allMatch = persons.stream()
                .allMatch(person -> person.getAge() > 5);
        System.out.println(allMatch);
    }

    private void testAnyMatch(List<Person> persons) {
        boolean anyMatch = persons.stream()
                .anyMatch(person -> person.getAge() > 100);
        System.out.println(anyMatch);
    }

    private void testNoneMatch(List<Person> persons) {
        boolean noneMatch = persons.stream()
                .noneMatch(person -> "Arjun Kapoor".equals(person.getName()));
        System.out.println(noneMatch);
    }

    private void testMin(List<Person> persons) {
        persons.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresentOrElse((value) -> System.out.println("Min Value : " + value),
                        () -> System.out.println("Value is empty"));
    }

    private void testMax(List<Person> persons) {
        persons.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresentOrElse((value) -> System.out.println("Max Value : " + value),
                        () -> System.out.println("Value is empty"));
    }

    private void testGroup(List<Person> persons) {
        persons.stream()
                .collect(Collectors.groupingBy(Person::getGender))
                .forEach((gender, person) -> {
                    System.out.println(gender);
                    person.forEach(System.out::println);
                    System.out.println();
                });
    }

    private void getOldestFemale(List<Person> persons) {
        persons.stream()
                .filter(person -> Gender.FEMALE.equals(person.getGender()))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName)
                .ifPresentOrElse((value) -> System.out.println("Oldest Female : " + value),
                        () -> System.out.println("Value is empty"));

    }

    private List<Person> getPersons() {
        return List.of(
                new Person("James Bond", 20, Gender.MALE),
                new Person("Madhuri Dixit", 40, Gender.FEMALE),
                new Person("Mithali Raj", 26, Gender.FEMALE),
                new Person("Virat Kohli", 28, Gender.MALE),
                new Person("Arjun Kapoor", 80, Gender.MALE),
                new Person("Lata Mangeshkar", 90, Gender.FEMALE),
                new Person("Ajay Jadeja", 29, Gender.MALE),
                new Person("Shekhar Kapoor", 79, Gender.MALE)
        );
    }
}
