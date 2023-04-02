package com.company.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.company.entities.Employee;

@Repository
public class EmployeeRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void createEmployee(Employee employee) {
		String SQL = "insert into  employee_table(email, employee_name, salary) values(?,?,?)";
		jdbcTemplate.update(SQL, employee.getEmail(), employee.getEmployeeName(), employee.getSalary());
	}
}
