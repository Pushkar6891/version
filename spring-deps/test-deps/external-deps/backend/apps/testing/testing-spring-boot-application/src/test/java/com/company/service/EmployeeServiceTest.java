package com.company.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyIterable;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.company.entity.Employee;
import com.company.helper.HelperUtility;
import com.company.repository.EmployeeRepository;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

	@Mock
	private EmployeeRepository repository;
	private EmployeeService service;
	private Employee employee;
	private List<Employee> employees;

	private HelperUtility helperUtility;

	@BeforeEach
	void setUp() {
		service = new EmployeeService(repository);
		helperUtility = new HelperUtility();
		employee = helperUtility.getEmployeeUnderTest();
		employees = helperUtility.getEmployeesUnderTest();
	}

	@Test
	void testCreateEmployee() {
		// given
		// when
		service.createEmployee(employee);
		// then
		ArgumentCaptor<Employee> employeeArgumentCaptor = ArgumentCaptor.forClass(Employee.class);
		verify(repository).save(employeeArgumentCaptor.capture());
		Employee capturedEmployee = employeeArgumentCaptor.getValue();
		assertThat(capturedEmployee).isEqualTo(employee);
	}

	@Test
	void testCreateEmployees() {
		// given
		// when
		service.createEmployees(employees);
		// then
		verify(repository).saveAll(anyIterable());
	}

	@Test
	void test_findAll() {
		// when
		service.findAll();
		// then
		verify(repository).findAll();
	}

	@Test
	void test_findById() {
		// given
		// when
		when(repository.findById(anyLong())).thenReturn(Optional.of(employee));
		service.findById(1);
		// then
		verify(repository).findById(anyLong());
	}

	@Test
	void test_findByEmail() {
		// given
		// when
		service.findByEmail(employee.getEmail());
		// then
		verify(repository).findByEmail(anyString());
	}

	@Test
	void test_findByDepartment() {
		// given
		// when
		service.findByDepartment(employee.getDepartment());
		// then
		verify(repository).findByDepartment(anyString());
	}

	@Test
	void test_updateEmployee() {
		// given
		// when
		service.updateEmployee(employee);
		// then
		verify(repository).save(any());

	}

	@Test
	void test_deleteById() {
		// when
		service.deleteById(1L);
		// then
		verify(repository).deleteById(anyLong());
	}

	@Test
	void test_deleteByEmail() {
		// when
		service.deleteByEmail("pushkar.chauhan@yahoo.com");
		// then
		verify(repository).deleteByEmail(anyString());
	}

	@Test
	void test_deleteAll() {
		// when
		service.deleteAll();
		// then
		verify(repository).deleteAll();
	}

}
