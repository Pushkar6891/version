package com.company.javafunctionalprogramming;

import com.company.Person;

import java.util.function.BiConsumer;

public class Eg06BiConsumer {
    public static void main(String[] args) {
        Eg06BiConsumer obj = new Eg06BiConsumer();

        BiConsumer<Person, Boolean> greetPerson = (person, showGender) -> System.out.println("Thank you! " + person.getName() + " you are a " + (showGender ? person.getGender() : "RATHER NOT SAY"));
        Person person = new Person("Pushkar", Gender.MALE);
        obj.greet(person);

        // Functional Interface
        greetPerson.accept(person, false);
    }

    // Normal Declarative Way : void function
    public void greet(Person person) {
        System.out.println("Thank you! " + person.getName() + " you are a " + person.getGender());
    }
}
