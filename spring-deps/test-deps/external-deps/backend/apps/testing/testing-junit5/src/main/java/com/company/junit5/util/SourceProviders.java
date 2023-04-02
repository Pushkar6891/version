package com.company.junit5.util;

import java.util.stream.Stream;

public class SourceProviders {

	public static Stream<String> friutMethodSource() {
		return Stream.of("apple", "banana");
	}
}