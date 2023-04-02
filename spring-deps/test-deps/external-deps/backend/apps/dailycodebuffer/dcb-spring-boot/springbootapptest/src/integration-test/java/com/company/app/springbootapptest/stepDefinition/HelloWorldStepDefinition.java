package com.company.app.springbootapptest.stepDefinition;

import com.company.app.springbootapptest.service.MessageService;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java8.En;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class HelloWorldStepDefinition extends BaseConfiguration implements En {

    private String name = "";
    private String expected = "";
    private String actual = "";

    private MessageService messageService = new MessageService();
    private DataTable dataTable;

    @Given("user passes a name")
    public void user_passes_a_name(Map<String,String> mandatoryArgs, DataTable dataTable) {
        this.name = mandatoryArgs.get("name");
    }

    @When("sayHello method of HelloWorld.java is called")
    public void sayHello_method_of_HelloWorld_is_called() {
        actual = messageService.getSubscriptionMessage(name);
    }

    @Then("it should return greeting message")
    public void it_should_return_greeting_message() {
        expected = "Hello " + name + ", Thanks for the subscription!";
        assertEquals(expected, actual);
    }

}