package com.company.testing.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.company.testing.utils.EmailIdValidator;

class EmailIdValidatorTest {

	private EmailIdValidator underTest;
	
	@BeforeEach
	void setUp() {
		underTest = new EmailIdValidator();
	}

	@ParameterizedTest
	@CsvSource({ 
		"abc@gmail.com,true", 
		"123@gmail.com, true", 
		"abc123@gmail.com, true",
		"!@#$%^&*@gmail.com, false",
	})
	void itShouldValidateEmail(String emailAddress, boolean expected) {
		// When
		boolean isValid = underTest.test(emailAddress);
		// Then
		assertThat(isValid).isEqualTo(expected);
	}
}
