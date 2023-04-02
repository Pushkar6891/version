package com.company.functionalinterface;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.company.entity.Employee;
import com.company.helper.HelperUtility;

class MyConsumerTest {

	private MyConsumer obj;
	private Employee employee;

	@BeforeEach
	void setUp() {
		obj = new MyConsumer();
		employee = new HelperUtility().getEmployeeUnderTest();
	}

	@Test
	void test_invokeGreetEmployee() {
		obj.invokeGreetEmployee(employee);
	}

}
