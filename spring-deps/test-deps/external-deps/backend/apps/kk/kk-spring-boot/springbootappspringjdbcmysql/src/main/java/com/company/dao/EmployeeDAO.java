package com.company.dao;

import com.company.model.Employee;

public interface EmployeeDAO {
	void createEmployee(Employee employee);
	Employee getEmployeeById(Integer employeeId);
	void updateEmployeeEmailById(Integer employeeId, String newEmail);
	void deleteEmployeeById(Integer employeeId);
}
