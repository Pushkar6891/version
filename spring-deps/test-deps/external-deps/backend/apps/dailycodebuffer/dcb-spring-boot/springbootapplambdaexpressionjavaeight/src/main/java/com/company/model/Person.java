package com.company.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    private String name;
    private int age;
    private String emailAddress;
    private Sex gender;

    public void printPerson() {
        System.out.println(this.toString());
    }

    public static List<Person> generateDefaultList() {
        List<Person> persons = new LinkedList<>();
        persons.add(new Person("Pushkar", 26, "pushkar@gmail.com", Sex.MALE));
        persons.add(new Person("Amit", 20, "amit@gmail.com", Sex.MALE));
        persons.add(new Person("Pooja", 30, "pooja@gmail.com", Sex.FEMALE));
        return persons;
    }
}
