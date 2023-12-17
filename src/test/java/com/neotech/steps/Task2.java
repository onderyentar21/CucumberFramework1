package com.neotech.steps;

import org.junit.Assert;

import com.neotech.pages.PersonDetailPageElelemnts;
import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Task2 extends CommonMethods {
	

	@When("user enters employee first name {string} and last name {string}")
	public void user_enters_employee_first_name_and_last_name(String firstname, String lastname) {
	    sendText(addEmp.firstName, firstname);
	    sendText(addEmp.lastName, lastname);
	    addEmp.employeeId.clear();
	    
	    
	}
	@Then("validate that employee {string} is added successfully")
	public void validate_that_employee_is_added_successfully(String username) {
		//Assert.assertEquals("Name is Not match",personDetail.employeeName.getText(), username);
		waitForVisibility(personDetail.personalDetailForm);
		String expeckt =username;
		String actual =personDetail.employeeName.getText();
		Assert.assertEquals("Name is Not Match..",expeckt, actual);
		
	    
	}




}
