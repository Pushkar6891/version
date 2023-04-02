package com.java8.eg0028;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Tester2 {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
		integers.forEach(throwingConsumerWrapper(i -> writeToFile(i)));
	}

	private static Object writeToFile(Integer i) {
		return null;
	}

	private static <T> Consumer<T> throwingConsumerWrapper(ThrowingConsumer<T, Exception> throwingConsumer) {

		return i -> {
			try {
				throwingConsumer.accept(i);
			} catch (Exception ex) {
				throw new RuntimeException(ex);
			}
		};
	}
}