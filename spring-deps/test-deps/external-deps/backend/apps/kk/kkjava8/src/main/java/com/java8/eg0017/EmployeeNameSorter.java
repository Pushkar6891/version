package com.java8.eg0017;

import java.util.Comparator;

public class EmployeeNameSorter implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}

}
