package com.javatechie.spring.jsonDocs.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.spring.jsonDocs.api.dao.EmployeeRepository;
import com.javatechie.spring.jsonDocs.api.model.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;

	public String saveEmployee(Employee employee) {
		repository.save(employee);
		return "new employee added with id :" + employee.getId();
	}

	public Employee getEmployee(int id) {
		return repository.findById(id).get();
	}

	public List<Employee> deleteEmployee(int id) {
		repository.deleteById(id);
		return repository.findAll();
	}

}
