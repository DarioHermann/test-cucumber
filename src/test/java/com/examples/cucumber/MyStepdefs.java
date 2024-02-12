package com.examples.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStepdefs {
    private Main main;

    @Given("I am starting the program")
    public void startingTheProgram() {
        main = new Main();
    }

    @Then("I get the hello world message")
    public void iGetTheHelloWorldMessage() {
        assertEquals("Hello World!", main.sayHelloWorld());
    }

    @Then("I get the wrong message")
    public void iGetTheWrongMessage() {
        assertEquals("This is wrong", main.sayThisIsWrong());
    }
}