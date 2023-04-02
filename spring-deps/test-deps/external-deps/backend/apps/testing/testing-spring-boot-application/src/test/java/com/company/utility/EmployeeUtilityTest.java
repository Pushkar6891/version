package com.company.utility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.company.entity.Employee;
import com.company.entity.Gender;
import com.company.helper.HelperUtility;

public class EmployeeUtilityTest {

	private HelperUtility obj;

	@BeforeEach
	void setUp() {
		obj = new HelperUtility();
	}

	@Test
	void countNumberOfFemaleEmployees() {
		List<Employee> employees = obj.getEmployeesUnderTest();
		List<Employee> femaleEmployees = employees.stream()
				.filter(employee -> employee.getGender().equals(Gender.FEMALE))
				.collect(Collectors.toList());
		assertEquals(1, femaleEmployees.size());
	}
}
