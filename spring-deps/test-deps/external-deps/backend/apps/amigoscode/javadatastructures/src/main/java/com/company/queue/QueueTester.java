package com.company.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueTester {
    public static void main(String[] args) {
        QueueTester obj = new QueueTester();
        Queue<Person> supermarket = new LinkedList<>();
        List<Person> persons = obj.getPersons();
        for (Person person : persons) {
            supermarket.add(person);
        }
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
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
