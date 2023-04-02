package com.company.junit5.util;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Eg16CustomizingDisplayNamesInParameterizedTest {

	@DisplayName("Display name of fruit container")
	@ParameterizedTest(name = "{index} => the rank of ''{0}'' is {1}")
	// @ParameterizedTest(name = "{arguments}")
	@CsvSource({ "apple, 1", "banana, 2", "'lemon, lime', 3" })
	void testWithCustomDisplayNames(String fruitName, int fruitRank) {
		assertTrue(!fruitName.isEmpty());
		assertTrue(fruitRank > 0);
	}
}