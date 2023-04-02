package com.company.controller;

// Unit Test for Controller

import com.company.entity.Employee;
import com.company.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;
import java.util.Optional;

@WebMvcTest
class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeService employeeService;

    @Autowired
    private ObjectMapper objectMapper;

    private Employee employee_mark;
    private Employee employee_steve;
    private Employee employee_mark_updated;

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
        employee_mark_updated = Employee.builder()
                .id(1L)
                .firstName("Mark_updated")
                .lastName("Wood")
                .email("mark@gmail.com")
                .build();
    }

    @Test
    void givenEmployeeObject_whenCreateEmployee_thenReturnSavedEmployee() throws Exception {
        BDDMockito.given(employeeService.saveEmployee(ArgumentMatchers.any(Employee.class))).willAnswer((invocationOnMock -> invocationOnMock.getArgument(0)));
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
        List<Employee> employees = List.of(employee_mark, employee_steve);
        BDDMockito.given(employeeService.getAllEmployees()).willReturn(employees);
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/api/employees"));
        resultActions.andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.size()", CoreMatchers.is(employees.size())));
    }

    @Test
    void givenEmployeeId_whenGetEmployeeById_thenReturnEmployeeObject() throws Exception {
        BDDMockito.given(employeeService.getEmployeeById(employee_mark.getId())).willReturn(Optional.of(employee_mark));
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/api/employees/{id}", employee_mark.getId()));
        resultActions.andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.firstName", CoreMatchers.is(employee_mark.getFirstName())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.lastName", CoreMatchers.is(employee_mark.getLastName())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.email", CoreMatchers.is(employee_mark.getEmail())));
        BDDMockito.verify(employeeService, BDDMockito.times(1)).getEmployeeById(employee_mark.getId());
    }

    @Test
    void givenEmployeeId_whenGetEmployeeById_thenReturnEmpty() throws Exception {
        BDDMockito.given(employeeService.getEmployeeById(employee_mark.getId())).willReturn(Optional.empty());
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/api/employees/{id}", employee_mark.getId()));
        resultActions.andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isNotFound());
        BDDMockito.verify(employeeService, BDDMockito.times(1)).getEmployeeById(employee_mark.getId());
    }

    @Test
    void givenUpdatedEmployee_whenUpdateEmployee_thenReturnUpdatedEmployeeObject() throws Exception {
        BDDMockito.given(employeeService.getEmployeeById(employee_mark.getId())).willReturn(Optional.of(employee_mark));
        BDDMockito.given(employeeService.updateEmployee(ArgumentMatchers.any(Employee.class))).willAnswer((invocationOnMock -> invocationOnMock.getArgument(0)));
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.put("/api/employees/{id}", employee_mark.getId())
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(employee_mark_updated)));
        resultActions.andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.firstName", CoreMatchers.is(employee_mark_updated.getFirstName())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.lastName", CoreMatchers.is(employee_mark_updated.getLastName())))
                .andExpect(MockMvcResultMatchers.jsonPath("$.email", CoreMatchers.is(employee_mark_updated.getEmail())));
        BDDMockito.verify(employeeService, BDDMockito.times(1)).getEmployeeById(employee_mark.getId());
        BDDMockito.verify(employeeService, BDDMockito.times(1)).updateEmployee(ArgumentMatchers.any(Employee.class));
    }

    @Test
    void givenUpdatedEmployee_whenUpdateEmployee_thenReturn404() throws Exception {
        BDDMockito.given(employeeService.getEmployeeById(employee_mark.getId())).willReturn(Optional.empty());
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.put("/api/employees/{id}", employee_mark.getId())
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(employee_mark_updated)));
        resultActions.andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isNotFound());
        BDDMockito.verify(employeeService, BDDMockito.times(1)).getEmployeeById(employee_mark.getId());
    }

    @Test
    void givenEmployeeId_whenDeleteEmployee_thenReturn200() throws Exception {
        BDDMockito.willDoNothing().given(employeeService).deleteEmployeeById(employee_mark.getId());
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.delete("/api/employees/{id}", employee_mark.getId()));
        resultActions.andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk());
        BDDMockito.verify(employeeService, BDDMockito.times(1)).deleteEmployeeById(employee_mark.getId());
    }
}
