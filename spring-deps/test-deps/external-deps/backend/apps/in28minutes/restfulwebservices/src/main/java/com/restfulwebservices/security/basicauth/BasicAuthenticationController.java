package com.restfulwebservices.security.basicauth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restfulwebservices.model.AuthenticationBean;

@RestController
@CrossOrigin(origins = "*")
public class BasicAuthenticationController {

	@GetMapping(path = "/basicauth")
	public AuthenticationBean getHelloBean() {
		return new AuthenticationBean("You are authenticated!");
	}

}