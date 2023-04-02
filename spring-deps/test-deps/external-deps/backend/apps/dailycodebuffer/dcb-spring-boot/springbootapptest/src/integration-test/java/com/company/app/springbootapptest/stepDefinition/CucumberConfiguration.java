package com.company.app.springbootapptest.stepDefinition;

import org.springframework.test.context.ContextConfiguration;

import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;

@ContextConfiguration
@CucumberContextConfiguration
public class CucumberConfiguration {

	@Before
	public void setup_cucumber_context() {

	}
}
