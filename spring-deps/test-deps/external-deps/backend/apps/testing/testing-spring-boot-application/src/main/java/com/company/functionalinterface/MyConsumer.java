package com.company.functionalinterface;

import java.util.function.Consumer;

import com.company.entity.Employee;

public class MyConsumer {

	private Consumer<Employee> greetEmployee = employee -> System.out.println("Hello " + employee.getFirstName());

	public void invokeGreetEmployee(Employee employee) {
		greetEmployee.accept(employee);
	}
}
