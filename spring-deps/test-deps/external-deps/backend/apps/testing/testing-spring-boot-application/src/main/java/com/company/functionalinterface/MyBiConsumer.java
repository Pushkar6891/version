package com.company.functionalinterface;

import java.util.function.BiConsumer;

import com.company.entity.Employee;

public class MyBiConsumer {

	private BiConsumer<Employee, Boolean> greetEmployee = (employee, showPhoneNumber) -> System.out
			.println("Hello " + employee.getFirstName() + " thanks for registering with your phone : "
					+ (showPhoneNumber ? employee.getPhone() : "****************"));

	public void invokeGreetEmployee(Employee employee, Boolean showPhoneNumber) {
		greetEmployee.accept(employee, showPhoneNumber);
	}
}
