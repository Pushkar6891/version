package com.company.controller;

import com.company.entity.Employee;
import com.company.repository.EmployeeRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class EmployeeControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @BeforeEach
    void setup() {
        employeeRepository.deleteAll();
    }

    @Test
    void givenEmployeeObject_whenCreateEmployee_thenReturnSavedEmployee() throws Exception {
        Employee employee_mark = Employee.builder()
                .id(1L)
                .firstName("Mark")
                .lastName("Wood")
                .email("markwood@gmail.com")
                .build();
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.post("/api/employees")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(employee_mark)));
        resultActions.andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.jsonPath("$.firstName", CoreMatchers.is(employee_mark.getFirstName())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.lastName", CoreMatchers.is(employee_mark.getLastName())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.email", CoreMatchers.is(employee_mark.getEmail())));
    }

    @Test
    void givenListOfEmployees_whenGetAllEmployees_thenReturnListOfEmployees() throws Exception {
        Employee employee_mark = Employee.builder()
                .id(1L)
                .firstName("Mark")
                .lastName("Wood")
                .email("markwood@gmail.com")
                .build();
        Employee employee_steve = Employee.builder()
                .firstName("Steve")
                .lastName("Waugh")
                .email("stevewaugh@gmail.com")
                .build();
        List<Employee> employees = List.of(employee_mark, employee_steve);
        employeeRepository.saveAll(employees);
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/api/employees"));
        resultActions.andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.size()", CoreMatchers.is(employees.size())));
    }

    @Test
    void givenEmployeeId_whenGetEmployeeById_thenReturnEmployeeObject() throws Exception {
        Employee employee_mark = Employee.builder()
                .firstName("Mark")
                .lastName("Wood")
                .email("markwood@gmail.com")
                .build();
        employeeRepository.save(employee_mark);
        ResultActions response = mockMvc.perform(MockMvcRequestBuilders.get("/api/employees/{id}", employee_mark.getId()));
        response.andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.jsonPath("$.firstName", CoreMatchers.is(employee_mark.getFirstName())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.lastName", CoreMatchers.is(employee_mark.getLastName())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.email", CoreMatchers.is(employee_mark.getEmail())));
    }

    @Test
    void givenEmployeeId_whenGetEmployeeById_thenReturnEmpty() throws Exception {
        long employeeId = 1L;
        Employee employee_mark = Employee.builder()
                .firstName("Mark")
                .lastName("Wood")
                .email("markwood@gmail.com")
                .build();
        employeeRepository.save(employee_mark);
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/api/employees/{id}", employeeId));
        resultActions.andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }

    @Test
    void givenUpdatedEmployee_whenUpdateEmployee_thenReturnUpdatedEmployeeObject() throws Exception {
        Employee employee_mark = Employee.builder()
                .firstName("Mark")
                .lastName("Wood")
                .email("markwood@gmail.com")
                .build();
        employeeRepository.save(employee_mark);
        Employee employee_mark_updated = Employee.builder()
                .id(1L)
                .firstName("Mark_updated")
                .lastName("Wood")
                .email("mark@gmail.com")
                .build();
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.put("/api/employees/{id}", employee_mark.getId())
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(employee_mark_updated)));
        resultActions.andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.firstName", CoreMatchers.is(employee_mark_updated.getFirstName())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.lastName", CoreMatchers.is(employee_mark_updated.getLastName())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.email", CoreMatchers.is(employee_mark_updated.getEmail())));
    }

    @Test
    void givenUpdatedEmployee_whenUpdateEmployee_thenReturn404() throws Exception {
        long employeeId = 1L;
        Employee employee_mark = Employee.builder()
                .firstName("Mark")
                .lastName("Wood")
                .email("markwood@gmail.com")
                .build();
        employeeRepository.save(employee_mark);
        Employee employee_mark_updated = Employee.builder()
                .firstName("Mark_updated")
                .lastName("Wood")
                .email("mark@gmail.com")
                .build();
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.put("/api/employees/{id}", employeeId)
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(employee_mark_updated)));
        resultActions.andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }

    @Test
    void givenEmployeeId_whenDeleteEmployee_thenReturn200() throws Exception {
        long employeeId = 1L;
        Employee employee_mark = Employee.builder()
                .firstName("Mark")
                .lastName("Wood")
                .email("markwood@gmail.com")
                .build();
        employeeRepository.save(employee_mark);
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.delete("/api/employees/{id}", employeeId));
        resultActions.andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}