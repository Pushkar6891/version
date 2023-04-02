package com.company.app.springbootapptest.stepDefinition;

import org.springframework.test.context.ContextConfiguration;

import com.company.app.springbootapptest.runner.CucumberIntegrationTestSuiteRunner;

@ContextConfiguration(classes = CucumberIntegrationTestSuiteRunner.class)
public class BaseConfiguration {

}
