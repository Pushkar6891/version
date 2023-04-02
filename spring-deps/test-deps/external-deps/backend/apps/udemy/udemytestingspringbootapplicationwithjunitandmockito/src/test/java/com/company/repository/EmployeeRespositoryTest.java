package com.company.repository;

import com.company.entity.Employee;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

//@DataJpaTest
@SpringBootTest
@Transactional
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    private Employee employee_mark;
    private Employee employee_steve;

    @BeforeEach
    public void setUp() {
        employee_mark = Employee.builder()
                .firstName("Mark")
                .lastName("Wood")
                .email("markwood@gmail.com")
                .build();
        employee_steve = Employee.builder()
                .firstName("Steve")
                .lastName("Waugh")
                .email("stevewaugh@gmail.com")
                .build();
    }

    @Test
    @DisplayName("JUnit 5 test for save employee operation")
    void givenEmployeeObject_whenSave_thenReturnSavedEmployee() {
        Employee savedEmployee = employeeRepository.save(employee_mark);
        Assertions.assertThat(savedEmployee).isNotNull();
        Assertions.assertThat(savedEmployee.getId()).isGreaterThan(0);
    }

    @Test
    @DisplayName("JUnit 5 test for get all employee operation")
    void givenEmployees_whenFindAll_thenReturnEmployeesList() {
        employeeRepository.save(employee_mark);
        employeeRepository.save(employee_steve);
        List<Employee> employees = employeeRepository.findAll();
        Assertions.assertThat(employees).isNotNull();
        Assertions.assertThat(employees.size()).isEqualTo(2);
    }

    @Test
    @DisplayName("JUnit 5 test for get employee by id operation")
    void givenEmployeeObject_whenFindById_thenReturnEmployeeObject() {
        employeeRepository.save(employee_mark);
        Employee employeeFromDb = employeeRepository.findById(employee_mark.getId()).get();
        Assertions.assertThat(employeeFromDb).isNotNull();
    }

    @Test
    @DisplayName("JUnit 5 test for get employee by email operation")
    void givenEmployeeObject_whenFindByEmail_thenReturnEmployeeObject() {
        employeeRepository.save(employee_mark);
        Employee employeeFromDb = employeeRepository.findByEmail(employee_mark.getEmail()).get();
        Assertions.assertThat(employeeFromDb).isNotNull();
        Assertions.assertThat(employeeFromDb.getEmail()).isEqualTo(employee_mark.getEmail());
    }

    @Test
    @DisplayName("JUnit 5 test for update employee operation")
    void givenEmployeeObject_whenUpdateEmployee_thenReturnUpdatedEmployeeObject() {
        employeeRepository.save(employee_mark);
        Employee employeeFromDb = employeeRepository.findById(employee_mark.getId()).get();
        employeeFromDb.setEmail("woodmark@gmail.com");
        Employee updatedEmployee = employeeRepository.save(employeeFromDb);
        Assertions.assertThat(updatedEmployee.getEmail()).isEqualTo("woodmark@gmail.com");
    }

    @Test
    @DisplayName("JUnit 5 test for delete employee operation")
    void givenEmployeeObject_whenDelete_thenDeleteEmployeeObject() {
        employeeRepository.save(employee_mark);
        employeeRepository.delete(employee_mark);
        Optional<Employee> employeeOptional = employeeRepository.findById(employee_mark.getId());
        Assertions.assertThat(employeeOptional).isEmpty();
    }

    @Test
    @DisplayName("JUnit 5 test for custom query using JPQL with index parameters")
    void givenFirstNameAndLastName_whenFindByJPQLWithIndexParams_thenReturnEmployeeObject() {
        employeeRepository.save(employee_mark);
        Employee employeeFromDb = employeeRepository.findByJPQLWithIndexParams("Mark", "Wood");
        Assertions.assertThat(employeeFromDb).isNotNull();
        Assertions.assertThat(employeeFromDb.getFirstName()).isEqualTo("Mark");
        Assertions.assertThat(employeeFromDb.getLastName()).isEqualTo("Wood");
    }

    @Test
    @DisplayName("JUnit 5 test for custom query using JPQL with named parameters")
    void givenFirstNameAndLastName_whenFindByJPQLWithNamedParams_thenReturnEmployeeObject() {
        employeeRepository.save(employee_mark);
        Employee employeeFromDb = employeeRepository.findByJPQLWithNamedParams("Mark", "Wood");
        Assertions.assertThat(employeeFromDb).isNotNull();
        Assertions.assertThat(employeeFromDb.getFirstName()).isEqualTo("Mark");
        Assertions.assertThat(employeeFromDb.getLastName()).isEqualTo("Wood");
    }

    @Test
    @DisplayName("JUnit 5 test for custom query using Native SQL with index parameters")
    void givenFirstNameAndLastName_whenFindByNativeSQLWithIndexParams_thenReturnEmployeeObject() {
        employeeRepository.save(employee_mark);
        Employee employeeFromDb = employeeRepository.findByNativeSQLWithIndexParams("Mark", "Wood");
        Assertions.assertThat(employeeFromDb).isNotNull();
        Assertions.assertThat(employeeFromDb.getFirstName()).isEqualTo("Mark");
        Assertions.assertThat(employeeFromDb.getLastName()).isEqualTo("Wood");
    }

    @Test
    @DisplayName("JUnit 5 test for custom query using Native SQL with named parameters")
    void givenFirstNameAndLastName_whenFindByNativeSQLWithNamedParams_thenReturnEmployeeObject() {
        employeeRepository.save(employee_mark);
        Employee employeeFromDb = employeeRepository.findByNativeSQLWithNamedParams("Mark", "Wood");
        Assertions.assertThat(employeeFromDb).isNotNull();
        Assertions.assertThat(employeeFromDb.getFirstName()).isEqualTo("Mark");
        Assertions.assertThat(employeeFromDb.getLastName()).isEqualTo("Wood");
    }

}