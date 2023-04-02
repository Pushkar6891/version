package com.company.testing.utils;

import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIdValidator implements Predicate<String> {

	private Pattern regexPattern;
	private Matcher regMatcher;

	@Override
	public boolean test(String emailAddress) {
		regexPattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
		regMatcher = regexPattern.matcher(emailAddress);
		return ((!emailAddress.isEmpty()) && (emailAddress != null) && (regMatcher.matches()));
	}

}
