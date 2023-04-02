package com.company.utility;

import java.util.Optional;

public class OptionalUtility {

	public Object optional_1() {
		Object value = Optional.ofNullable(null).orElse("default value");
		return value;
	}

	public Object optional_2() {
		Object value = Optional.ofNullable("Some Value").orElse("default value");
		return value;
	}

	public void optional_3(String email, String firstName, String lastName) {
		Optional.ofNullable(email).ifPresent((emailAddress) -> System.out
				.println("Sending email to " + firstName + " " + lastName + " at " + emailAddress));
	}

	public void optional_4(String email, String firstName, String lastName) {
		Optional.ofNullable(email).ifPresent(emailAddress -> System.out
				.println("Sending email to " + firstName + " " + lastName + " at " + emailAddress));
	}

}
