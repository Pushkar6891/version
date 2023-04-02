package com.company.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.company.entity.Address;
import com.company.entity.Employee;
import com.company.entity.Gender;
import com.company.helper.HelperUtility;

@DataJpaTest
@Rollback(false)
@TestMethodOrder(value = OrderAnnotation.class)
class EmployeeRepositoryTest {

	@Autowired
	private EmployeeRepository repository;

	private Employee employee;
	private HelperUtility helperUtility;

	@BeforeEach
	void setUp() {
		helperUtility = new HelperUtility();
		employee = helperUtility.getEmployeeUnderTest();
	}

	@Test
	@Order(value = 1)
	void testSaveNewEmployee() {
		repository.save(employee);
		Employee existingEmployee = repository.findById(1L).get();
		assertThat(existingEmployee.getAddress().getCountry()).isEqualTo("India");
	}

	@Test
	@Order(value = 2)
	void testFindByName() {
		Employee employee = repository.findByEmail("pushkar.chauhan@yahoo.com");
		assertThat(employee.getId()).isEqualTo(1);
		assertThat(employee.getAddress().getCity()).isEqualTo("Bangalore");
	}

	@Test
	@Order(value = 3)
	void testFindByNameAndEmail() {
		Employee employee = repository.findByFirstNameAndEmail("Pushkar", "pushkar.chauhan@yahoo.com");
		assertThat(employee.getFirstName()).isEqualTo("Pushkar");
		assertThat(employee.getEmail()).isEqualTo("pushkar.chauhan@yahoo.com");
		assertThat(employee.getId()).isEqualTo(1);
		assertThat(employee.getAddress().getCity()).isEqualTo("Bangalore");
	}

	@Test
	@Order(value = 4)
	void testFindAll() {
		List<Employee> employees = repository.findAll();
		assertThat(employees).size().isGreaterThan(0);
		assertThat(employees).size().isEqualTo(1);
	}

	@Test
	@Order(value = 5)
	void testUpdateEmployee() {
		Employee existingEmployee = repository.findByEmail("pushkar.chauhan@yahoo.com");
		existingEmployee.setSalary(2000.0);
		existingEmployee.setAddress(new Address("500089", "Hyderabad", "Telangana", "India"));
		repository.save(existingEmployee);
		Employee updatedEmployee = repository.findById(1L).get();
		assertThat(updatedEmployee.getFirstName()).isEqualTo("Pushkar");
		assertThat(updatedEmployee.getSalary()).isEqualTo(2000.0);
		assertThat(updatedEmployee.getAddress().getPincode()).isEqualTo(String.valueOf(500089));
		assertThat(updatedEmployee.getAddress().getCity()).isEqualTo("Hyderabad");
		assertThat(updatedEmployee.getAddress().getState()).isEqualTo("Telangana");
		assertThat(updatedEmployee.getAddress().getCountry()).isEqualTo("India");
		assertThat(updatedEmployee.getGender()).isEqualTo(Gender.MALE);
	}

	@Test
	@Order(value = 6)
	void testDeleteById() {
		Employee existingEmployee = repository.findById(1L).get();
		repository.deleteById(Long.valueOf(existingEmployee.getId()));
		Employee deletedEmployee = repository.findByEmail("pushkar.chauhan@yahoo.com");
		assertThat(deletedEmployee).isNull();
	}

	@Test
	@Order(value = 7)
	void testDeleteByName() {
		repository.deleteByEmail("pushkar.chauhan@yahoo.com");
	}

	@Test
	@Order(value = 8)
	void testDeleteAll() {
		repository.deleteAll();
	}

}
