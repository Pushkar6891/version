package com.company.javafunctionalprogramming;

import com.company.Person;

import java.util.function.Consumer;

public class Eg05Consumer {
    public static void main(String[] args) {
        Eg05Consumer obj = new Eg05Consumer();

        Consumer<Person> greetPerson = person -> System.out.println("Thank you! " + person.getName() + " you are a " + person.getGender());
        Person person = new Person("Pushkar", Gender.MALE);
        obj.greet(person);

        // Functional Interface
        greetPerson.accept(person);

    }

    // Normal Declarative Way : void function
    public void greet(Person person) {
        System.out.println("Thank you! " + person.getName() + " you are a " + person.getGender());
    }
}
