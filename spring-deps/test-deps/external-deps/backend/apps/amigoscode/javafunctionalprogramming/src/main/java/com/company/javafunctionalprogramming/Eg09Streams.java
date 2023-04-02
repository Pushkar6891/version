package com.company.javafunctionalprogramming;

import com.company.Person;

import java.util.List;
import java.util.stream.Collectors;

public class Eg09Streams {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Sachin", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.FEMALE),
                new Person("Bob", Gender.PREFER_NOT_TO_SAY)
        );

        persons.stream()
                .map(Person::getGender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println();

        persons.stream()
                .map(Person::getName)
                .mapToInt(String::length)
                .forEach(System.out::println);

        System.out.println();

        boolean containsAllFemales = persons.stream()
                .allMatch(person -> Gender.FEMALE.equals(person.getGender()));

        System.out.println(containsAllFemales);

        System.out.println();

        boolean containsAtleastOneFemale = persons.stream()
                .anyMatch(person -> Gender.FEMALE.equals(person.getGender()));

        System.out.println(containsAtleastOneFemale);

        System.out.println();

        boolean shouldBeNoneWhoHasOtherGender = persons.stream()
                .noneMatch(person -> Gender.PREFER_NOT_TO_SAY.equals(person.getGender()));

        System.out.println(shouldBeNoneWhoHasOtherGender);
    }
}
