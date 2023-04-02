package com.company.junit5.util;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.EnumSet;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.EnumSource.Mode;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * ParameterizedTest JUnit tests Example
 * 
 * @author KK JavaTutorials
 *
 */
public class Eg15ParameterizedTest {

	/**
	 * Test with @ValueSource as Sources of Arguments
	 * 
	 * @param inputText
	 */
	@ParameterizedTest
	@ValueSource(strings = { "madam", "radar", "dad" })
	void palindromesTest(String inputText) {

		// assertTrue(MyUtils.isPalindrome(inputText));
		// assertTrue(()->MyUtils.isPalindrome(inputText));
		// assertTrue(MyUtils.isPalindrome(inputText), "Not Palindrome");
		// assertTrue(MyUtils.isPalindrome(inputText), ()->"Not Palindrome");
		// assertTrue(()->MyUtils.isPalindrome(inputText), "Not Palindrome");
		assertTrue(() -> MyUtils.isPalindrome(inputText), () -> "Not Palindrome");
	}

	/**
	 * Test with @NullSource, @EmptySource and @ValueSource as Sources of Arguments
	 * 
	 * @param inputText
	 */
	@ParameterizedTest
	@NullSource
	@EmptySource
	@ValueSource(strings = { " ", "   ", "\t", "\n" })
	void nullEmptyAndBlankStringsTest(String inputText) {
		assertTrue(inputText == null || inputText.trim().isEmpty());
	}

	/**
	 * Test with @NullAndEmptySource and @ValueSource as Sources of Arguments
	 * 
	 * @param inputText
	 */
	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = { " ", "   ", "\t", "\n" })
	void nullAndEmptySourceStringsTest(String inputText) {
		assertTrue(inputText == null || inputText.trim().isEmpty());
	}

	/**
	 * Test with @EnumSource as Sources of Arguments
	 * 
	 * @param temporalUnit
	 */
	@ParameterizedTest
	@EnumSource(value = ChronoUnit.class)
	void testWithEnumSource(TemporalUnit temporalUnit) {
		assertNotNull(temporalUnit);
	}

	/**
	 * Test with @EnumSource as Sources of Arguments
	 * 
	 * @param temporalUnit
	 */
	@ParameterizedTest
	@EnumSource
	void testWithEnumSourceWithAutoDetection(ChronoUnit chronoUnit) {
		assertNotNull(chronoUnit);
	}

	/**
	 * Test with @EnumSource as Sources of Arguments
	 * 
	 * @param chronoUnit
	 */
	@ParameterizedTest
	@EnumSource(names = { "WEEKS", "DAYS", })
	void testWithEnumSourceInclude(ChronoUnit chronoUnit) {
		assertTrue(EnumSet.of(ChronoUnit.WEEKS, ChronoUnit.DAYS).contains(chronoUnit));
	}

	@ParameterizedTest
	@EnumSource(mode = Mode.EXCLUDE, names = { "ERAS", "FOREVER", "CENTURIES" })
	void testWithEnumSourceExclude(ChronoUnit chronoUnit) {
		assertFalse(EnumSet.of(ChronoUnit.ERAS, ChronoUnit.FOREVER, ChronoUnit.CENTURIES).contains(chronoUnit));
	}

	@ParameterizedTest
	@EnumSource(mode = Mode.MATCH_ALL, names = "^.*DAYS$")
	void testWithEnumSourceRegex(ChronoUnit chronoUnit) {
		assertTrue(chronoUnit.name().endsWith("DAYS"));
	}

	/**
	 * Test with Custom enum as Sources of Arguments
	 * 
	 * @param names
	 */
	@ParameterizedTest
	@EnumSource(NAMES.class)
	void testWithMyCustomEnumNames(NAMES names) {
		assertTrue(names.toString().length() == 2);
	}

	/**
	 * Test with @MethodSource as Sources of Arguments
	 * 
	 * @param fruitName
	 */
	@ParameterizedTest
	@MethodSource("fruitNameProvider")
	void testWithExplicitLocalMethodSource(String fruitName) {
		assertNotNull(fruitName);
	}

	private static Stream<String> fruitNameProvider() {
		return Stream.of("apple", "banana", "Orange");
	}

	/**
	 * ParameterizedTest with internal source method
	 * 
	 * @param fruitName
	 */
	@ParameterizedTest
	@MethodSource
	void testWithDefaultLocalMethodSource(String fruitName) {
		assertNotNull(fruitName);
	}

	private static Stream<String> testWithDefaultLocalMethodSource() {
		return Stream.of("apple", "banana");
	}

	/**
	 * ParameterizedTest with external source method
	 * 
	 * @param fruitName
	 */
	@ParameterizedTest
	@MethodSource("com.company.junit5.util.SourceProviders#friutMethodSource")
	void testWithExternalMethodSource(String fruitName) {
		assertNotNull(fruitName);
	}

	/**
	 * ParameterizedTest for range of numbers
	 * 
	 * @param argument
	 */
	@ParameterizedTest
	@MethodSource("numberRange")
	void testWithRangeMethodSource(int argument) {
		assertNotEquals(9, argument);
	}

	static IntStream numberRange() {
		return IntStream.range(0, 15).skip(10);
	}

	/**
	 * Test with @CsvSource as Sources of Arguments
	 * 
	 * @param fruitName
	 * @param fruitRank
	 */
	@ParameterizedTest
	@CsvSource({ "Ananas,         1", "Grapes,        2", "'lemon, lime', 0xF1" })
	void testWithCsvSource(String fruitName, int fruitRank) {
		assertNotNull(fruitName);
		assertNotEquals(0, fruitRank);
	}

	/**
	 * Test with @CsvFileSource as Sources of Argument
	 * 
	 * @param country
	 * @param reference
	 */
	@ParameterizedTest
	@CsvFileSource(resources = "/myfile.csv", numLinesToSkip = 1)
	void testWithCsvFileSource(String country, int reference) {
		assertNotNull(country);
		assertNotEquals(0, reference);
	}

	@ParameterizedTest
	@ArgumentsSource(MyArgumentsProviderImpl.class)
	void testWithArgumentsSource(String argument) {
		assertNotNull(argument);
	}

	public static class MyArgumentsProviderImpl implements ArgumentsProvider {

		@Override
		public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
			return Stream.of("apple", "Grapes").map(Arguments::of);
		}
	}
}