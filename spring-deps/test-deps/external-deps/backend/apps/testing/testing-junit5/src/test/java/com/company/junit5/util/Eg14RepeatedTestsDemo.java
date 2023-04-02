package com.company.junit5.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class Eg14RepeatedTestsDemo {

	private static final Logger logger = Logger.getLogger(Eg14RepeatedTestsDemo.class.getName());

	@BeforeEach
	void beforeEach(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		int curRepetition = repetitionInfo.getCurrentRepetition();
		int totalRepetitions = repetitionInfo.getTotalRepetitions();
		String methodName = testInfo.getTestMethod().get().getName();
		logger.info(String.format("Now about to execute repetition %d of %d for %s", curRepetition, totalRepetitions,
				methodName));
	}

	@RepeatedTest(5)
	void repeatedTest() {
		// Testing code Logic goes here
	}

	@RepeatedTest(10)
	void repeatedTestWithRepetitionInfo(RepetitionInfo repetitionInfo) {
		assertEquals(10, repetitionInfo.getTotalRepetitions());
	}

	@RepeatedTest(value = 1, name = "{displayName} {currentRepetition}/{totalRepetitions}")
	@DisplayName("RepeatTest")
	void customDisplayName(TestInfo testInfo) {
		assertEquals("RepeatTest 1/1", testInfo.getDisplayName());
	}

	@RepeatedTest(value = 1, name = RepeatedTest.LONG_DISPLAY_NAME)
	@DisplayName("RepeatedTestWithLongDisplayName")
	void customTestNameWithLongDisplayName(TestInfo testInfo) {
		assertEquals("RepeatedTestWithLongDisplayName :: repetition 1 of 1", testInfo.getDisplayName());
	}

	@RepeatedTest(value = 6, name = "Wiederholung {currentRepetition} von {totalRepetitions}")
	void repeatedTestInGerman() {
		// Testing code Logic goes here
	}

}