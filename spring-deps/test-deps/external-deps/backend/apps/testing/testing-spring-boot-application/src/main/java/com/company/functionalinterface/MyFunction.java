package com.company.functionalinterface;

import java.util.function.Function;

public class MyFunction {
	private Function<Integer, Integer> incrementByOneFunction = n -> n + 1;
	private Function<Integer, Integer> multiplByTenFunction = n -> n * 10;
	private Function<Integer, Integer> addByNandThenMultiplyByNFunction = incrementByOneFunction
			.andThen(multiplByTenFunction);

	public Integer invokeIncrementByOneFunction(int n) {
		return incrementByOneFunction.apply(n);
	}

	public Integer invokeMultiplByTenFunction(int n) {
		return multiplByTenFunction.apply(n);
	}

	public Integer invokeAddByNandThenMultiplyByNFunction(int n) {
		return addByNandThenMultiplyByNFunction.apply(n);
	}
}
