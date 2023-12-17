package com.neotech.steps;

import com.neotech.pages.LoginPageElements;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FailLogin extends CommonMethods {
	//LoginPageElements login;

	//@Given("I navigated to the HRM website")
	//public void i_navigated_to_the_hrm_website() throws InterruptedException {
		//setUp();
	//	login = new LoginPageElements();
		//Given'a bir nebi cunstractır diyebiliriz. 
	  
	//}

	@When("I enter a valid username")
	public void i_enter_a_valid_username() {
		sendText(login.username, ConfigsReader.getProperty("username"));
	
	}

	@When("I enter an invalid password")
	public void i_enter_an_invalid_password() {
		sendText(login.username, "sasfdsada");
	   
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		click(login.loginButton);
	    
	}

	@Then("I validate that Invalid Credentials is displayed")
	public void i_validate_that_invalid_credentials_is_displayed() {
		if(login.blankPasswordMessage.isEnabled()) {
			System.out.println("Test PAssed!!");
		}else {
			System.out.println("Test Failed!!!");
		}
	   
		
	}

//	@Then("I will quit the browser")
//	public void i_will_quit_the_browser() {
//		tearDown();
//	   
//	}

}
