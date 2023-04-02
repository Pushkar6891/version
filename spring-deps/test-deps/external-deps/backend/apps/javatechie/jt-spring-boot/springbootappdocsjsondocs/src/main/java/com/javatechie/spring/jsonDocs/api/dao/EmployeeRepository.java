package com.javatechie.spring.jsonDocs.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.spring.jsonDocs.api.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
