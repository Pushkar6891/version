package com.company.app.springbootapptest.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/integration-test/resources/features", 
				 glue = "com.company.app.springbootapptest.stepDefinition", 
				 plugin = { "pretty",
						 	"html:reports/cucumber-reports/cucumber.html",
			                "json:reports/cucumber-reports/cucumber.json"}, 
				 tags = "not @ignore")
public class CucumberIntegrationTestSuiteRunner {

}