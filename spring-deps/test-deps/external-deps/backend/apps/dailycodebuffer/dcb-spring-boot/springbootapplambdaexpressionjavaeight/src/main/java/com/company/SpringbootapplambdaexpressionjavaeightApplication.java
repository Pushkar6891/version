package com.company;

import com.company.model.Person;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.function.Predicate;

@SpringBootApplication
public class SpringbootapplambdaexpressionjavaeightApplication {

    static class CheckPersonEligibleForSelectiveSearch implements CheckPerson {

        @Override
        public boolean test(Person person) {
            return person.getGender() == Person.Sex.MALE && person.getAge() >= 18 && person.getAge() <= 25;
        }
    }

    public static void main(String[] args) {
        List<Person> persons = Person.generateDefaultList();
        System.out.println("\n Get Person with age > 20");
        printPersonOlderThan(persons, 20);
        System.out.println("\n Get Person between age 20 and 21");
        printPersonWithinAgeRange(persons, 20, 21);
        System.out.println("\n Get Person with criteria");
        printPerson(persons, new CheckPersonEligibleForSelectiveSearch());
        System.out.println("\n Get Person with anonymous class");
        printPerson(persons, new CheckPerson() {

            @Override
            public boolean test(Person person) {
                return person.getGender() == Person.Sex.MALE && person.getAge() >= 18 && person.getAge() <= 25;
            }
        });
        System.out.println("\n Get Person with lambda");
        printPerson(persons, person -> person.getGender() == Person.Sex.MALE && person.getAge() >= 18 && person.getAge() <= 25);
        System.out.println("\n Get Person with lambda and predicate");
        printPersonWithPredicate(persons, person -> person.getGender() == Person.Sex.MALE && person.getAge() >= 18 && person.getAge() <= 25);
        System.out.println("\n Get Person with streams");
        persons.stream()
                .filter(person -> person.getGender() == Person.Sex.MALE && person.getAge() >= 18 && person.getAge() <= 25)
                .forEach(System.out::println);
    }

    public static void printPersonOlderThan(List<Person> persons, int age) {
        for (Person person : persons) {
            if (person.getAge() >= age) {
                person.printPerson();
            }
        }
    }

    public static void printPersonWithinAgeRange(List<Person> persons, int low, int high) {
        for (Person person : persons) {
            if (low <= person.getAge() && person.getAge() >= high) {
                person.printPerson();
            }
        }
    }

    public static void printPerson(List<Person> persons, CheckPerson checkPerson) {
        for (Person person : persons) {
            if (checkPerson.test(person)) {
                person.printPerson();
            }
        }
    }

    public static void printPersonWithPredicate(List<Person> persons, Predicate<Person> predicate) {
        for (Person person : persons) {
            if (predicate.test(person)) {
                person.printPerson();
            }
        }
    }

}
