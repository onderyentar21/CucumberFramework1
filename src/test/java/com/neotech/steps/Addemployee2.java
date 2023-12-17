package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Addemployee2 extends CommonMethods {

	@When("user clicks on Create Login Details")
	public void user_clicks_on_create_login_details() {
		jsClick(addEmp.loginDetailsToggle);
		wait(1);

	}

	@When("user provides credentials")
	public void user_provides_credentials() {
		sendText(addEmp.username, "sneijder!!!21");
		sendText(addEmp.password, "drogba213.3");
		sendText(addEmp.confirmPassword, "drogba213.3");
		jsClick(addEmp.saveButton);

	}

	@Then("validate that employee is added successfully")
	public void validate_that_employee_is_added_successfully() {
		waitForVisibility(personDetail.personalDetailForm);
		if (personDetail.employeeId.isDisplayed()) {
			System.out.println("Test Paased");

		} else {
			System.out.println("Test Failed!!!");
		}

	}
	

	//cucumber kendisinin döngüsü var cucumber bittiği yerde loop başlar.
	// ve bunun Scenario outline ile yapıyoruz.
	@When("user enters employee {string}, {string} and {string}")
	public void user_enters_employee_and(String first, String middle, String last) {
	sendText(addEmp.firstName, first);
	sendText(addEmp.middleName, middle);
	sendText(addEmp.lastName, last);
	}
	@When("user selects a location {string}")
	public void user_selects_a_location(String location) {
		selectDropdown(addEmp.location, location);
	  
	}
	@Then("validate that {string} and {string} is added successfully")
	public void validate_that_and_is_added_successfully(String FirstName, String LastName) {
		waitForVisibility(personDetail.personalDetailForm);
		String execktName = FirstName+" "+LastName;
		String actuealName = personDetail.employeeName.getText();
		
		sendText(dashboard.accountName, getFormattedDate(11,11,1999));
		

		//sendText(getFormattedDate(0, 0, 0), actuealName);
		
		
		if (execktName.equals(actuealName)) {
			System.out.println("Test Passed!!");
			
		}
		else {
			System.out.println("Test Failed");
		}
		
	  
	}




}
