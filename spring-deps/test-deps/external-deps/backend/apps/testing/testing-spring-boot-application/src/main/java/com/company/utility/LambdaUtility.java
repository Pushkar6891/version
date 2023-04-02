package com.company.utility;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaUtility {

	Function<String, String> convertToUpperCaseFunction = value -> value.toUpperCase();
	BiFunction<String, Integer, String> convertToUpperCaseBiFunction = (name, age) -> name.toUpperCase();

	public String invokeConvertToUpperCaseFunction(String value) {
		return convertToUpperCaseFunction.apply(value);
	}

	public String invokeConvertToUpperCaseBiFunction(String name, Integer age) {
		return convertToUpperCaseBiFunction.apply(name, age);
	}

}
