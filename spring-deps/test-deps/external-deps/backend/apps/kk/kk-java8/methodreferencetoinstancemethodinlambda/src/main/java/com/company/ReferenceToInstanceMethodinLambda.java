package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ReferenceToInstanceMethodinLambda {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Bean", 27));
		persons.add(new Person("Sean", 21));
		persons.add(new Person("Martin", 45));
		persons.add(new Person("Frank", 27));

		List<String> personNames = ReferenceToInstanceMethodinLambda.getPersonsName(persons, Person::getName);
		personNames.forEach(System.out::println);
	}

	private static List<String> getPersonsName(List<Person> persons, Function<Person, String> f) {
		List<String> results = new ArrayList<>();
		persons.forEach(n -> results.add(f.apply(n)));
		return results;
	}

}
