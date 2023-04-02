package com.company.controller;

import com.company.entity.Employee;
import com.company.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
public class EmployeeController {

	private final EmployeeService service;

	public EmployeeController(final EmployeeService employeeService) {
		this.service = employeeService;
	}

	@PostMapping("/employees")
	public List<Employee> createEmployees(@RequestBody List<Employee> employees) {
		return service.createEmployees(employees);
	}

	@PostMapping("/employees/employee")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
		try {
			Employee createdEmployee = service.createEmployee(employee);
			return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> find(@RequestParam(required = false) String department,
			@RequestParam(required = false) String email) {
		try {
			List<Employee> employees = new ArrayList<>();
			if (Objects.isNull(department) && Objects.isNull(email)) {
		//		service.findAll().forEach(employees::add);
				employees.addAll(service.findAll());
			} else if (Objects.nonNull(department)) {
		//		service.findByDepartment(department).forEach(employees::add);
				employees.addAll(service.findByDepartment(department));
			} else {
		//		service.findByEmail(email).forEach(employees::add);
				employees.addAll(service.findByEmail(email));
			}

			if (employees.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			} else {
				return new ResponseEntity<>(employees, HttpStatus.OK);
			}

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> findById(@PathVariable long id) {
		Optional<Employee> optionalEmployee = service.findById(id);
		/*
		if (optionalEmployee.isPresent()) {
			return new ResponseEntity<>(optionalEmployee.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		*/
		return optionalEmployee.map(employee -> new ResponseEntity<>(employee, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee employee) {
		Optional<Employee> optionalEmployee = service.findById(id);
		if (optionalEmployee.isPresent()) {
			Employee existingEmployee = optionalEmployee.get();
			existingEmployee.setActive(employee.isActive());
			existingEmployee.setAddress(employee.getAddress());
			existingEmployee.setDepartment(employee.getDepartment());
			existingEmployee.setDob(employee.getDob());
			existingEmployee.setEmail(employee.getEmail());
			existingEmployee.setFirstName(employee.getFirstName());
			existingEmployee.setGender(employee.getGender());
			existingEmployee.setId(employee.getId());
			existingEmployee.setLastName(employee.getLastName());
			existingEmployee.setSalary(employee.getSalary());
			return new ResponseEntity<>(service.updateEmployee(existingEmployee), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Employee> deleteById(@PathVariable long id) {
		try {
			service.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/employees")
	public ResponseEntity<Employee> delete(@RequestParam(required = false) String email) {
		try {
			if (Objects.nonNull(email))
				service.deleteByEmail(email);
			else
				service.deleteAll();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
