package com.company.service;

import com.company.entity.Employee;
import com.company.exception.ResourceNotFoundException;
import com.company.repository.EmployeeRepository;
import com.company.service.impl.EmployeeServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;
    @InjectMocks
    private EmployeeServiceImpl employeeServiceImpl;
    private Employee employee_mark;
    private Employee employee_steve;

    @BeforeEach
    void setup() {
        employee_mark = Employee.builder()
                .id(1L)
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
    @DisplayName("JUnit 5 test for save employee method")
    void givenEmployeeObject_whenSaveEmployee_thenReturnEmployeeObject() {
        BDDMockito.given(employeeRepository.findByEmail(employee_mark.getEmail())).willReturn(Optional.empty());
        BDDMockito.given(employeeRepository.save(employee_mark)).willReturn(employee_mark);
        Employee employeeFromDb = employeeServiceImpl.saveEmployee(employee_mark);
        Assertions.assertThat(employeeFromDb).isNotNull();
        BDDMockito.then(employeeRepository).should().findByEmail(employee_mark.getEmail());
        BDDMockito.then(employeeRepository).should().save(employee_mark);
        BDDMockito.verify(employeeRepository, BDDMockito.times(1)).findByEmail(employee_mark.getEmail());
        BDDMockito.verify(employeeRepository, BDDMockito.times(1)).save(employee_mark);
    }

    @Test
    @DisplayName("JUnit 5 test for save employee method throws exception")
    void givenExistingEmail_whenSaveEmployee_thenThrowException() {
        BDDMockito.given(employeeRepository.findByEmail(employee_mark.getEmail())).willReturn(Optional.of(employee_mark));
        org.junit.jupiter.api.Assertions.assertThrows(ResourceNotFoundException.class, () -> {
            employeeServiceImpl.saveEmployee(employee_mark);
        });
        BDDMockito.verify(employeeRepository, BDDMockito.never()).save(BDDMockito.any(Employee.class));
    }

    @Test
    @DisplayName("JUnit 5 test for get all employees method")
    void givenEmployeeList_whenGetAllEmployees_thenReturnEmployeesList() {
        BDDMockito.given(employeeRepository.findAll()).willReturn(List.of(employee_mark, employee_steve));
        List<Employee> employees = employeeServiceImpl.getAllEmployees();
        Assertions.assertThat(employees).isNotNull();
        Assertions.assertThat(employees.size()).isEqualTo(2);
        BDDMockito.verify(employeeRepository, BDDMockito.times(1)).findAll();
    }

    @Test
    @DisplayName("JUnit 5 test for get all employees method should return empty list")
    void givenEmptyEmployeeList_whenGetAllEmployees_thenReturnEmptyEmployeesList() {
        BDDMockito.given(employeeRepository.findAll()).willReturn(Collections.emptyList());
        List<Employee> employees = employeeServiceImpl.getAllEmployees();
        Assertions.assertThat(employees).isEmpty();
        Assertions.assertThat(employees.size()).isEqualTo(0);
        BDDMockito.verify(employeeRepository, BDDMockito.times(1)).findAll();
    }

    @Test
    @DisplayName("JUnit 5 test for get employee by id method")
    void givenEmployeeId_whenGetEmployeeById_thenReturnEmployeeObject() {
        BDDMockito.given(employeeRepository.findById(employee_mark.getId())).willReturn(Optional.of(employee_mark));
        Employee employeeFromDb = employeeServiceImpl.getEmployeeById(employee_mark.getId()).get();
        Assertions.assertThat(employeeFromDb).isNotNull();
        BDDMockito.verify(employeeRepository, BDDMockito.times(1)).findById(employee_mark.getId());
    }

    @Test
    @DisplayName("JUnit 5 test for update employee method")
    void givenEmployeeObject_whenUpdateEmployee_thenReturnUpdatedEmployee() {
        BDDMockito.given(employeeRepository.save(BDDMockito.any(Employee.class))).willReturn(employee_mark);
        employee_mark.setEmail("mark@gmail.com");
        employee_mark.setLastName("smith");
        Employee employeeFromDb = employeeServiceImpl.updateEmployee(employee_mark);
        Assertions.assertThat(employeeFromDb).isNotNull();
        Assertions.assertThat(employeeFromDb.getEmail()).isEqualTo("mark@gmail.com");
        Assertions.assertThat(employeeFromDb.getLastName()).isEqualTo("smith");
        BDDMockito.verify(employeeRepository, BDDMockito.times(1)).save(BDDMockito.any(Employee.class));
    }

    @Test
    @DisplayName("JUnit 5 test for delete employee method")
    void givenEmployeeId_whenDeleteEmployeeById_thenReturnNothing() {
        BDDMockito.willDoNothing().given(employeeRepository).deleteById(employee_mark.getId());
        employeeServiceImpl.deleteEmployeeById(employee_mark.getId());
        BDDMockito.verify(employeeRepository, BDDMockito.times(1)).deleteById(employee_mark.getId());
    }
}
