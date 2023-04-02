package com.company.controller;

import com.company.entity.Employee;
import com.company.helper.HelperUtility;
import com.company.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.HttpServerErrorException.InternalServerError;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = EmployeeController.class)
class pmcEmployeeControllerTest {

	@Autowired
	protected ObjectMapper objectMapper;

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private EmployeeService service;

	private Employee employee;
	private List<Employee> employees;
	private HelperUtility helperUtility;

	@BeforeEach
	void setUp() {
		helperUtility = new HelperUtility();
		employee = helperUtility.getEmployeeUnderTest();
		employees = helperUtility.getEmployeesUnderTest();
	}

	@Test
	void test_createEmployee() throws Exception {
		when(service.createEmployee(employee)).thenReturn(employee);
		mockMvc.perform(post("/employees/employee")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(employee)))
				.andExpect(status().isCreated());
	}
	
	@Test
	void test_createEmployee_internal_server_error() throws Exception {
		when(service.createEmployee(any(Employee.class))).thenThrow(InternalServerError.class);
		mockMvc.perform(post("/employees/employee")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(employee)))
				.andExpect(status().isInternalServerError());
		verify(service,times(1)).createEmployee(any(Employee.class));
	}
	
	@Test
	void test_createEmployees() throws Exception {
		when(service.createEmployees(employees)).thenReturn(employees);
		mockMvc.perform(post("/employees")
				.contentType(MediaType.APPLICATION_JSON)
	            .content(objectMapper.writeValueAsBytes(employees)))
				.andExpect(status().isOk());
		verify(service,times(1)).createEmployees(anyList());
	}

	@Test
	void test_findAllEmployees() throws Exception {
		when(service.findAll()).thenReturn(employees);
		mockMvc.perform(get("/employees")).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()", is(employees.size())));
		verify(service,atLeastOnce()).findAll();
	}

	@Test
	void test_findAllEmployeesByDepartment() throws Exception {
		List<Employee> employees = new LinkedList<>();
		employees.add(employee);
		when(service.findByDepartment(anyString())).thenReturn(employees);
		mockMvc.perform(get("/employees").param("department", "HR")).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()", is(employees.size())));
		verify(service,atLeastOnce()).findByDepartment(anyString());
	}

	@Test
	void test_findAllEmployeesByEmail() throws Exception {
		List<Employee> employees = new LinkedList<>();
		employees.add(employee);
		when(service.findByEmail(anyString())).thenReturn(employees);
		mockMvc.perform(get("/employees").param("email", "pushkar.chauhan@yahoo.com")).andExpect(status().isOk())
				.andExpect(jsonPath("$.size()", is(employees.size())));
		verify(service,atLeastOnce()).findByEmail(anyString());
	}

	@Test
	void test_findAllEmployees_emptyList() throws Exception {
		List<Employee> employees = new LinkedList<>();
		when(service.findByEmail(anyString())).thenReturn(employees);
		mockMvc.perform(get("/employees")).andExpect(status().isNoContent());
		verify(service,times(0)).findByEmail(anyString());
	}

	@Test
	void test_findAllEmployees_exception() throws Exception {
		when(service.findAll()).thenThrow(new RuntimeException("Unexpected Exception"));
		mockMvc.perform(get("/employees")).andExpect(status().isInternalServerError());
		verify(service,atLeastOnce()).findAll();
	}

	@Test
	void test_findById() throws Exception {
		when(service.findById(employee.getId())).thenReturn(Optional.of(employee));
		mockMvc.perform(get("/employees/{id}", employee.getId()))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.firstName", is(employee.getFirstName())))
				.andExpect(jsonPath("$.lastName", is(employee.getLastName())))
				.andExpect(jsonPath("$.email", is(employee.getEmail())))
				.andExpect(jsonPath("$.salary", is(employee.getSalary())))
				.andExpect(jsonPath("$.department", is(employee.getDepartment())))
				.andExpect(jsonPath("$.address.pincode", is(employee.getAddress().getPincode())))
				.andExpect(jsonPath("$.address.city", is(employee.getAddress().getCity())))
				.andExpect(jsonPath("$.address.state", is(employee.getAddress().getState())))
				.andExpect(jsonPath("$.address.country", is(employee.getAddress().getCountry())));
		verify(service,atLeastOnce()).findById(anyLong());
	}

	@Test
	void test_findById_exception() throws Exception {
		when(service.findById(employee.getId())).thenReturn(Optional.empty());
		mockMvc.perform(get("/employees/{id}", employee.getId())).andExpect(status().isNotFound());
		verify(service,atLeastOnce()).findById(anyLong());
	}
	
	@Test
	void test_updateEmployee() throws Exception {
		when(service.findById(employee.getId())).thenReturn(Optional.of(employee));
		mockMvc.perform(put("/employees/{id}", employee.getId())
			      .content(objectMapper.writeValueAsString(employee))
			      .contentType(MediaType.APPLICATION_JSON)
			      .accept(MediaType.APPLICATION_JSON))
			      .andExpect(status().isOk());
		verify(service,atLeastOnce()).findById(anyLong());
	}
	
	@Test
	void test_updateEmployee_exception() throws Exception {
		when(service.findById(employee.getId())).thenReturn(Optional.empty());
		mockMvc.perform(put("/employees/{id}", employee.getId())
			      .content(objectMapper.writeValueAsString(employee))
			      .contentType(MediaType.APPLICATION_JSON)
			      .accept(MediaType.APPLICATION_JSON))
			      .andExpect(status().isNotFound());
		verify(service,atLeastOnce()).findById(anyLong());
	}
	
	
	@Test
	void test_deleteById() throws Exception {
		doNothing().when(service).deleteById(employee.getId());
		mockMvc.perform(delete("/employees/{id}", employee.getId()))
					.andExpect(status().isNoContent());
		verify(service,atLeastOnce()).deleteById(anyLong());
	}
	
	@Test
	void test_deleteById_internal_server_error() throws Exception {
		doThrow(InternalServerError.class).when(service).deleteById(employee.getId());
		mockMvc.perform(delete("/employees/{id}", employee.getId()))
						.andExpect(status().isInternalServerError());
		verify(service,atLeastOnce()).deleteById(anyLong());
	}
	
	@Test
	void test_delete() throws Exception {
		doNothing().when(service).deleteByEmail(anyString());
		mockMvc.perform(delete("/employees", employee.getId())
					.param("email", "pushkar.chauhan@yahoo.com"))
					.andExpect(status().isNoContent());
		verify(service,atLeastOnce()).deleteByEmail(anyString());
	}
	
	@Test
	void test_deleteAll() throws Exception {
		doNothing().when(service).deleteAll();
		mockMvc.perform(delete("/employees", employee.getId()))
					.andExpect(status().isNoContent());
		verify(service,atLeastOnce()).deleteAll();
	}
	
	@Test
	void test_deleteAll_internal_server_error() throws Exception {
		doThrow(InternalServerError.class).when(service).deleteAll();
		mockMvc.perform(delete("/employees", employee.getId()))
						.andExpect(status().isInternalServerError());
		verify(service,times(1)).deleteAll();
	} 

}
