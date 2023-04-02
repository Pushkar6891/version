package com.company.junit4;

import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

import com.company.junit4.LoginService;

public class LoginServiceTest {
	@Test
	public void authenticateSuccessTest() {
		LoginService login = new LoginService();
		assertTrue("authenticate failed", login.authenticate("demo", "demo"));
	}

	@Test
	public void authenticateFailTest() {
		LoginService login = new LoginService();
		assertFalse("authenticate failed", login.authenticate("demo1", "demo"));
	}
}
