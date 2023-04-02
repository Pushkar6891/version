package com.company.junit4.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LoginServiceTest {

	@InjectMocks
	private LoginService loginService;

	@Mock
	private LoginRepository loginRepository;

	private UserForm userForm = new UserForm("foo", "bar");

	/*
	@Test
	public void testServiceLoginOk() {
		when(loginRepository.login(any(UserForm.class))).thenReturn(true);
		assertTrue(loginService.login(userForm));

		verify(loginRepository, atLeast(1)).login(userForm);
		verifyNoMoreInteractions(loginRepository);
	}

	@Test
	public void testServiceLoginBad() {
		when(loginRepository.login(any(UserForm.class))).thenReturn(false);
		assertFalse(loginService.login(userForm));

		verify(loginRepository, times(1)).login(userForm);
		verifyNoMoreInteractions(loginRepository);
	}

	@Test(expected = LoginException.class)
	public void testServiceLoginTwice() {
		when(loginRepository.login(userForm)).thenReturn(true);
		loginService.login(userForm);
		loginService.login(userForm);
	}
	 */

	@Test
	public void testGreet(){


	}

}