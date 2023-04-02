package com.company.list.linkedlist;

import com.company.queue.Gender;
import com.company.queue.Person;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTester {
    public static void main(String[] args) {

        LinkedListTester obj = new LinkedListTester();
        LinkedList<Person> linkedList = new LinkedList<>();
        List<Person> persons = obj.getPersons();
        for (Person person : persons) {
            linkedList.add(person);
        }

        ListIterator<Person> personListIterator = linkedList.listIterator();
        System.out.println("Asc");
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }

        System.out.println("Reverse");
        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
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
