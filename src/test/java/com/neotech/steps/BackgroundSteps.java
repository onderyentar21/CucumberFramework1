package com.neotech.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundSteps {
    @Given("precondition1")
    public void precondition1() {

        System.out.println("Running precondition 1");
    }

    @Given("precondition2")
    public void precondition2() {
        System.out.println("Running precondition 2");

    }

    @When("Test nr1")
    public void test_nr1() {
        System.out.println("running test 1");

    }
    @When("Test nr1 firstNAme is {string} and lastName {string}")
    public void test_nr1_first_n_ame_is_and_last_name(String firstName, String lastName) {
       System.out.println("Running Test nr1 with firstName : "+firstName+"lastaname: "+lastName);
    }

    @When("Test nr2")
    public void test_nr2() {
        System.out.println("running test 2");

    }

    @When("Test nr3")
    public void test_nr3() {
        System.out.println("running test 3");

    }

    @Then("Validation nr1")
    public void validation_nr1() {
        System.out.println("running validaition nr 1");

    }

    @Then("Validation nr2")
    public void validation_nr2() {
        System.out.println("running validaition nr 2");

    }

    @When("Test nr4")
    public void test_nr4() {
        System.out.println("running test 4");

    }

    @When("Test nr5")
    public void test_nr5() {
        System.out.println("running test 5");

    }

    @When("Test nr6")
    public void test_nr6() {
        System.out.println("running test 6");

    }

    @Then("Validation nr3")
    public void validation_nr3() {
        System.out.println("running validaition nr 3");

    }

    @Then("Validation nr4")
    public void validation_nr4() {
        System.out.println("running validaition nr 4");
    }


}
