package com.company.functionalinterface;

import java.util.function.Predicate;

public class MyPredicate {

	private Predicate<String> isPhoneNumberValidAndIndianPredicate = (phoneNumber) -> phoneNumber.startsWith("+91")
			&& phoneNumber.length() == 13;
	private Predicate<String> containsNumber9 = (phoneNumber) -> phoneNumber.contains("9");
	private Predicate<String> isPhoneNumberValidAndIndianPredicateAndcontainsNumber9 = isPhoneNumberValidAndIndianPredicate
			.and(containsNumber9);
	private Predicate<String> isPhoneNumberValidAndIndianPredicateOrcontainsNumber9 = isPhoneNumberValidAndIndianPredicate
			.or(containsNumber9);

	public boolean invokeIsPhoneNumberValidAndIndianPredicate(String phoneNumber) {
		return isPhoneNumberValidAndIndianPredicate.test(phoneNumber);
	}

	public boolean invokeIsPhoneNumberValidAndIndianPredicateAndcontainsNumber9(String phoneNumber) {
		return isPhoneNumberValidAndIndianPredicateAndcontainsNumber9.test(phoneNumber);
	}

	public boolean invokeIsPhoneNumberValidAndIndianPredicateOrcontainsNumber9(String phoneNumber) {
		return isPhoneNumberValidAndIndianPredicateOrcontainsNumber9.test(phoneNumber);
	}
}
