package com.company.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.entity.Employee;
import com.company.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {

	private EmployeeRepository repository;

	@Autowired
	public EmployeeService(final EmployeeRepository employeeRepository) {
		this.repository = employeeRepository;
	}

	public Employee createEmployee(Employee employee) {
		return repository.save(employee);
	}

	public List<Employee> createEmployees(List<Employee> employees) {
		return repository.saveAll(employees);
	}
	
	public List<Employee> findAll() {
		return repository.findAll();
	}

	public Optional<Employee> findById(long id) {
		return repository.findById(id);
	}

	public List<Employee> findByEmail(String email) {
		Employee employee = repository.findByEmail(email);
		List<Employee> employees = new LinkedList<>();
		employees.add(employee);
		return employees;
	}

	public List<Employee> findByDepartment(String department) {
		return repository.findByDepartment(department);
	}

	public Employee updateEmployee(Employee employee) {
		return repository.save(employee);
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	public void deleteByEmail(String email) {
		repository.deleteByEmail(email);
	}

	public void deleteAll() {
		repository.deleteAll();
	}

}
