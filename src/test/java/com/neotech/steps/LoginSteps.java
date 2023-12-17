package com.neotech.steps;

import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {
//	LoginPageElements login;
//	DashboardPageElements dashboard;

//@Given("I navigate to the HRM website")
//public void i_navigate_to_the_hrm_website() throws InterruptedException {
//	//setUp();
//	//login = new LoginPageElements();
//	//dashboard = new DashboardPageElements();
//   
//}

@When("i enter a valid username")
public void i_enter_a_valid_username() {
	sendText(login.username, ConfigsReader.getProperty("username"));
}

@When("i enter a valid password")
public void i_enter_a_valid_password() {
	sendText(login.password, ConfigsReader.getProperty("password"));
}

@When("i click on the login button")
public void i_click_on_the_login_button() {
	click(login.loginButton);
}

@Then("i validate that i m login")
public void i_validate_that_i_m_login() {
	String expected = "Jacqueline White";
	String actual = dashboard.accountName.getText();
	
	if(actual.equals(expected))
	{
		System.out.println("Test Passed");
	}
	else
	{
		System.out.println("Test failed");
	}

}

//@Then("i will quit the browser")
//public void i_will_quit_the_browser() {
//   tearDown();
//}


}
