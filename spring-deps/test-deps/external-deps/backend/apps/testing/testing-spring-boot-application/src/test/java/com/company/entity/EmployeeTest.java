package com.company.entity;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.company.entity.Employee.EmployeeBuilder;
import com.company.helper.HelperUtility;

class EmployeeTest {

	private HelperUtility helperUtility;
	private List<Employee> employees;
	private Employee obj1;
	private Employee obj2;

	@BeforeEach
	void setUp() {
		helperUtility = new HelperUtility();
		employees = helperUtility.getEmployeesUnderTest();
		obj1 = employees.get(0);
		obj2 = employees.get(1);
	}

//	@Test
//	void test_equals() {
//		assertThat(employees).isNotNull();
//		assertThat(employees).isNotEmpty();
//		assertThat(obj1.getId()).isEqualTo(1);
//		assertNotEquals(obj1, obj2);
//		assertThat(obj1).isNotEqualTo(obj2);
//	}
//
//	@Test
//	void test_hashcode() {
//		assertNotNull(obj1.hashCode());
//		assertNotNull(obj2.hashCode());
//		assertFalse(obj1.equals(obj2));
//		assertFalse(obj1.equals(null));
//		assertFalse(obj2.equals(null));
//		assertThat(obj1).isInstanceOf(Employee.class);
//		assertThat(obj2).isInstanceOf(Employee.class);
//	}
//
//	@Test
//	void test_canEqual() {
//		assertTrue(obj1.canEqual(obj2));
//	}

	@Test
	void test_obj() {
		assertNotNull(obj1);
		assertNotNull(obj2);
	}

	@Test
	void test_builder() {
		EmployeeBuilder employeeBuilder1 = Employee.builder();
		EmployeeBuilder employeeBuilder2 = Employee.builder();
		assertNotNull(employeeBuilder1.toString());
		assertNotNull(employeeBuilder2.toString());
	}

	@Test
	void test_toString() {
		assertNotNull(obj1.toString());
		assertNotNull(obj2.toString());
	}

}
