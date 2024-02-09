package com.examples.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MyStepdefs {
    private Main main;

    @Given("I am starting the program")
    public void startingTheProgram() {
        main = new Main();
    }

    @When("I get the hello world message")
    public void iGetTheHelloWorldMessage() {
        assertEquals("Hello World!", main.sayHelloWorld());
    }
}