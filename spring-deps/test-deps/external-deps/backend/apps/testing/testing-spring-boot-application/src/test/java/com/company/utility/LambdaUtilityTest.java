package com.company.utility;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.company.entity.Employee;
import com.company.helper.HelperUtility;

class LambdaUtilityTest {

	private LambdaUtility obj;
	private Employee employee;

	@BeforeEach
	void setUp() {
		obj = new LambdaUtility();
		employee = new HelperUtility().getEmployeeUnderTest();
	}

	@Test
	void test_invokeConvertToUpperCaseFunction() {
		assertThat("PUSHKAR").isEqualTo(obj.invokeConvertToUpperCaseFunction(employee.getFirstName()));
	}

	@Test
	void test_invokeConvertToUpperCaseBiFunction_positive() {
		assertThat("PUSHKAR").isEqualTo(obj.invokeConvertToUpperCaseBiFunction("Pushkar", 30));
	}

}
