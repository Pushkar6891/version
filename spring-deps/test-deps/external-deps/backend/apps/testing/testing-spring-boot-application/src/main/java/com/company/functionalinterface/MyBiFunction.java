package com.company.functionalinterface;

import java.util.function.BiFunction;

public class MyBiFunction {
	
	private BiFunction<Integer, Integer, Integer> incrementBy1AndMultiplyByYBiFunction = (numberToIncrementByX,
			numberToMultiplyByY) -> (numberToIncrementByX + 1) * numberToMultiplyByY;

	public Integer invokeIncrementBy1AndMultiplyByYBiFunction(int x, int y) {
		return incrementBy1AndMultiplyByYBiFunction.apply(x, y);
	}
}
