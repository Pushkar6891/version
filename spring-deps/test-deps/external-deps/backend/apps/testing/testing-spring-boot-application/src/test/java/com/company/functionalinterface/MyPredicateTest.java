package com.company.functionalinterface;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.company.entity.Employee;
import com.company.helper.HelperUtility;

class MyPredicateTest {

	private MyPredicate obj;
	private List<Employee> employees;

	@BeforeEach
	void setUp() {
		obj = new MyPredicate();
		employees = new HelperUtility().getEmployeesUnderTest();
	}

	@Test
	void test_invokeisPhoneNumberValidPredicate() {
		assertThat(true).isEqualTo(obj.invokeIsPhoneNumberValidAndIndianPredicate(employees.get(0).getPhone()));
		assertThat(false).isEqualTo(obj.invokeIsPhoneNumberValidAndIndianPredicate(employees.get(1).getPhone()));
		assertThat(false).isEqualTo(obj.invokeIsPhoneNumberValidAndIndianPredicate(employees.get(2).getPhone()));
		assertThat(false).isEqualTo(obj.invokeIsPhoneNumberValidAndIndianPredicate(employees.get(3).getPhone()));
		assertThat(false).isEqualTo(obj.invokeIsPhoneNumberValidAndIndianPredicate(employees.get(4).getPhone()));
	}
	
	@Test
	void test_invokeIsPhoneNumberValidAndIndianPredicateAndcontainsNumber9() {
		assertThat(true).isEqualTo(obj.invokeIsPhoneNumberValidAndIndianPredicateAndcontainsNumber9(employees.get(0).getPhone()));
		assertThat(false).isEqualTo(obj.invokeIsPhoneNumberValidAndIndianPredicateAndcontainsNumber9(employees.get(1).getPhone()));
		assertThat(false).isEqualTo(obj.invokeIsPhoneNumberValidAndIndianPredicateAndcontainsNumber9(employees.get(2).getPhone()));
		assertThat(false).isEqualTo(obj.invokeIsPhoneNumberValidAndIndianPredicateAndcontainsNumber9(employees.get(3).getPhone()));
		assertThat(false).isEqualTo(obj.invokeIsPhoneNumberValidAndIndianPredicateAndcontainsNumber9(employees.get(4).getPhone()));
	}
	
	@Test
	void test_invokeIsPhoneNumberValidAndIndianPredicateOrcontainsNumber9() {
		assertThat(true).isEqualTo(obj.invokeIsPhoneNumberValidAndIndianPredicateOrcontainsNumber9(employees.get(0).getPhone()));
		assertThat(false).isEqualTo(obj.invokeIsPhoneNumberValidAndIndianPredicateOrcontainsNumber9(employees.get(1).getPhone()));
		assertThat(false).isEqualTo(obj.invokeIsPhoneNumberValidAndIndianPredicateOrcontainsNumber9(employees.get(2).getPhone()));
		assertThat(true).isEqualTo(obj.invokeIsPhoneNumberValidAndIndianPredicateOrcontainsNumber9(employees.get(3).getPhone()));
		assertThat(false).isEqualTo(obj.invokeIsPhoneNumberValidAndIndianPredicateOrcontainsNumber9(employees.get(4).getPhone()));
	}

}
