package com.company.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.company.model.User;
import com.company.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(controllers = UserController.class)
@TestMethodOrder(value = OrderAnnotation.class)
class UserControllerTest {

	@Autowired
	protected ObjectMapper objectMapper;

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private UserService service;

	@Test
	void testSaveUser() throws Exception {
		User user = new User(376, "Danile", 31, "USA");
		when(service.addUser(user)).thenReturn(user);
		mockMvc.perform(
				post("/save").contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsBytes(user)))
				.andExpect(status().isOk());
	}

	@Test
	void test_findAllEmployees() throws Exception {
		List<User> users = Stream.of(new User(376, "Danile", 31, "USA"), new User(958, "Huy", 35, "UK"))
				.collect(Collectors.toList());
		when(service.getUsers()).thenReturn(users);
		mockMvc.perform(get("/getUsers")).andExpect(status().isOk()).andExpect(jsonPath("$.size()", is(users.size())));
	}

	@Test
	void test_findUserByAddress() throws Exception {
		String address = "Bangalore";
		List<User> users = Stream.of(new User(376, "Danile", 31, "Bangalore")).collect(Collectors.toList());
		when(service.getUserbyAddress(address)).thenReturn(users);
		mockMvc.perform(get("/getUserByAddress/{address}", address)).andExpect(status().isOk());
	}

	@Test
	void test_deleteById() throws Exception {
		doNothing().when(service).deleteById(1);
		mockMvc.perform(delete("/user/{id}", 1)).andExpect(status().isOk());
	}

}
