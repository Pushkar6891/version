package com.company.junit4;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.company.junit4.User;
import com.company.junit4.UserService;

public class UserServiceTest {
	private User user;
	private UserService userService = new UserService();
	
	@Before
	public void setup(){
		user = new User(100, "ramesh");
	}
	
	@Test
	public void userServiceTest(){
		userService.createUser(user);
		List<User> users = userService.getUsers();
		assertEquals(1, users.size());
		userService.deleteUser(user);
		users = userService.getUsers();
		assertEquals(0, users.size());
	}
	
}
