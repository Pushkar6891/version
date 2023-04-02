package com.company.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	Employee findByEmail(String email);
	Employee findByFirstNameAndEmail(String firstName, String email);
	List<Employee> findByDepartment(String department);
	Iterable<Employee> findByIsActive(boolean isActive);
	void deleteByEmail(String email);
}
