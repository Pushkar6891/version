package com.employee.controllers;

import com.employee.entities.Employee;
import com.employee.repos.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

	private final EmployeeRepository repository;

	public EmployeeController(EmployeeRepository repository) {
		this.repository = repository;
	}

	@RequestMapping(value = "/employees/", method = RequestMethod.GET)
	public List<Employee> selectAllEmployees() {
		LOGGER.info("Finding All Employees");
		return repository.findAll();
	}

	@RequestMapping(value = "/employees/{id}/", method = RequestMethod.GET)
	public Employee selectAnEmployee(@PathVariable("id") int id) {
		LOGGER.info("Finding Emplloyee by id: " + id);
		Optional<Employee> optionalEmployee = repository.findById(id);
		if (optionalEmployee.isPresent()) {
			return optionalEmployee.get();
		} else {
			LOGGER.info("Employee with id: " + id + " absent");
			return null;
		}
	}

	@RequestMapping(value = "/employees/", method = RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee employee) {
		LOGGER.info("Employee Created");
		return repository.save(employee);
	}

	@RequestMapping(value = "/employees/", method = RequestMethod.PUT)
	public Employee updateEmployee(@RequestBody Employee employee) {
		LOGGER.info("Employee Updated");
		return repository.save(employee);
	}

	@RequestMapping(value = "/employees/{id}/", method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable("id") int id) {
		LOGGER.info("Employee with id: " + id + " deleted");
		repository.deleteById(id);
	}

}
