package com.neotech.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	@Given("I navigated to google")
	public void i_navigated_to_google() {
		System.out.println("ı go to google page");
	  
	}

	@When("I type something in the search box")
	public void i_type_something_in_the_search_box() {
		System.out.println("ı search for pupy images");
	
	}

	@When("I click on the search button")
	public void i_click_on_the_search_button() {
		System.out.println("click on search ");
	   
	}

	@Then("I can see the result of my search")
	public void i_can_see_the_result_of_my_search() {
		System.out.println("validate that result are showing");
	  
	}

	@Then("I can count the number of the result")
	public void i_can_count_the_number_of_the_result() {
		System.out.println("count the number of the result");
	 
	}


}
