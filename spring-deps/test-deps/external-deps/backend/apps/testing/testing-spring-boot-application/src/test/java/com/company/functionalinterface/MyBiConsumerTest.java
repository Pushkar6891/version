package com.company.functionalinterface;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.company.entity.Employee;
import com.company.helper.HelperUtility;

class MyBiConsumerTest {

	private MyBiConsumer obj;
	private List<Employee> employees;

	@BeforeEach
	void setUp() {
		obj = new MyBiConsumer();
		employees = new HelperUtility().getEmployeesUnderTest();
	}

	@Test
	void test_invokeGreetEmployee() {
		obj.invokeGreetEmployee(employees.get(0), true);
		obj.invokeGreetEmployee(employees.get(1), false);
		obj.invokeGreetEmployee(employees.get(2), true);
		obj.invokeGreetEmployee(employees.get(3), true);
		obj.invokeGreetEmployee(employees.get(4), false);
	}

}
