package com.company.javafunctionalprogramming;

import com.company.Person;

import java.util.LinkedList;
import java.util.List;

public class Eg01ImperativeAndDeclarativeApproach {
    public static void main(String[] args) {

        Eg01ImperativeAndDeclarativeApproach obj = new Eg01ImperativeAndDeclarativeApproach();
        List<Person> people = List.of(new Person("Sachin", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.FEMALE)
        );

        // Using Imperative Approach
        obj.usingImperativeApproach(people);

        System.out.println(" ");

        // Using Declarative Approach
        obj.usingDeclarativeApproach(people);

    }

    public void usingImperativeApproach(List<Person> people) {
        List<Person> females = new LinkedList<>();

        for (Person person : people) {
            if (Gender.FEMALE.equals(person.getGender())) {
                females.add(person);
            }
        }

        for (Person person : females) {
            System.out.println(person);
        }
    }

    public void usingDeclarativeApproach(List<Person> people) {
        people.stream()
                .filter(person -> Gender.FEMALE.equals(person.getGender()))
           //   .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
