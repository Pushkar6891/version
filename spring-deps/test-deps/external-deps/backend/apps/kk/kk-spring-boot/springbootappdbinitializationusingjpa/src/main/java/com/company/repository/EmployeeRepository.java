package com.company.repository;

import org.springframework.data.repository.CrudRepository;

import com.company.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
