package com.company.mockito.test_doubles.dummy;

import com.company.mockito.test_doubles.dummy.EmailService;

public class DummyEmailService implements EmailService {
	@Override
	public void sendEmail(String message) {
		throw new AssertionError("Method not implemented !!!");
	}
}
