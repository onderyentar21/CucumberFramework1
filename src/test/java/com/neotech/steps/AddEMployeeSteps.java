package com.neotech.steps;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEMployeeSteps extends CommonMethods {
	

	@Given("user is logged in with valid credentials")
	public void user_is_logged_in_with_valid_credentials() {
		login.adminLogin();
	    
	}
//	@Given("user navigates to AddEmployee page")
//	public void user_navigates_to_add_employee_page() {
//		click(dashboard.PIM);
//		wait(2);
//		click(dashboard.addEmployeeLink);
//		wait(2);
//	 
//	}
//	@When("user enters employee first name and last name")
//	public void user_enters_employee_first_name_and_last_name() {
//		sendText(addEmp.firstName, "icardi");
//		sendText(addEmp.lastName, "king");
//	    
//	}
//	@When("user selects a location")
//	public void user_selects_a_location() {
//		selectDropdown(addEmp.location, 2);
//
//	}
//	@When("user clicks on save button")
//	public void user_clicks_on_save_button() {
//		click(addEmp.saveButton);
//		wait(2);
//
//	}
////	@Then("validate that employee is added successfully")
////	public void validate_that_employee_is_added_successfully() {
////		waitForVisibility(personDetail.personalDetailForm);
////		if (personDetail.employeeId.isDisplayed()) {
////			System.out.println("Test Paased");
////			
////		}else {
////			System.out.println("Test Failed!!!");
////		}
//////		String expeckt ="icardi king";
//////		String actual = personDetail.employeName.getText();
//////		
////		Assert.assertEquals("The employe name is not match"+expeckt, actual);
	@Given("user navigates to AddEmployee page")
	public void user_navigates_to_add_employee_page() {
		click(dashboard.PIM);
		click(dashboard.addEmployeeLink);
	}

	// Hard-coded step
	@When("user enters employee first name and last name")
	public void user_enters_employee_first_name_and_last_name() {
		sendText(addEmp.firstName, "Lionel");
		sendText(addEmp.lastName, "Messi");
	}

	// Parameterized step
	@When("user enters employee first name {string} and last name {string}")
	public void user_enters_employee_first_name_and_last_name(String firstName, String lastName) {
		sendText(addEmp.firstName, firstName);
		sendText(addEmp.lastName, lastName);
	}

	@When("user selects a location")
	public void user_selects_a_location() {
		selectDropdown(addEmp.location, "New York Sales Office");
	}

	@When("user clicks on save button")
	public void user_clicks_on_save_button() {
		wait(1);
		click(addEmp.saveButton);
	}

	// Hard-coded Validation
//	@Then("validate that employee is added successfully")
//	public void validate_that_employee_is_added_successfully() {
//		waitForVisibility(personDetail.personalDetailForm);
//
//		String expected = "Lionel Messi";
//		String actual = personDetail.employeeName.getText();
//
//		// Please make sure you import the Assert class under org.junit package
//		Assert.assertEquals("The employee name DOES NOT match!", expected, actual);
//	}

	// Parameterized Validation
	@Then("validate that employee {string} is added successfully")
	public void validate_that_employee_is_added_successfully(String expectedName) {
		waitForVisibility(personDetail.personalDetailForm);

		String actualName = personDetail.employeeName.getText();

		// Please make sure you import the Assert class under org.junit package
		Assert.assertEquals("The employee name DOES NOT match!", expectedName, actualName);
	}

	@When("user clicks on Create Login Details")
	public void user_clicks_on_create_login_details() {
		jsClick(addEmp.loginDetailsToggle);
	}

	@When("user provides credentials")
	public void user_provides_credentials() {
		sendText(addEmp.username, "MarioIcardi");
		sendText(addEmp.password, "Wanda@123");
		sendText(addEmp.confirmPassword, "Wanda@123");
	}

	// Homework for Hard working students
	// Do the step above with parameterized username and password

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
	public void validate_that_and_is_added_successfully(String firstName, String lastName) {
		waitForVisibility(personDetail.personalDetailForm);

		String expectedName = firstName + " " + lastName;
		String actualName = personDetail.employeeName.getText();

		// Please make sure you import the Assert class under org.junit package
		Assert.assertEquals("The employee name DOES NOT match!", expectedName, actualName);
	}

	// ----------------@UsingDataTable----------------

	@When("user enters employee details and clicks on save and validates it is added")
	public void user_enters_employee_details(DataTable table) {
		// System.out.println(table);

		// asLists() method returns a List for every row (including the header)
		// System.out.println(table.asLists());

		// asMaps() method returns a List of Maps for every data row
		// (NOT including the header)
		// System.out.println(table.asMaps());

		List<Map<String, String>> employeeList = table.asMaps();

		for (Map<String, String> employee : employeeList) {
			System.out.println(employee);

			String fName = employee.get("FirstName");
			String mName = employee.get("MiddleName");
			String lName = employee.get("LastName");

			sendText(addEmp.firstName, fName);
			sendText(addEmp.middleName, mName);
			sendText(addEmp.lastName, lName);

			selectDropdown(addEmp.location, "France Regional HQ");
			wait(1);

			click(addEmp.saveButton);

			waitForVisibility(personDetail.personalDetailForm);

			// Validation
			String expectedName = fName + " " + lName;
			String actualName = personDetail.employeeName.getText();

			Assert.assertEquals("The employee name DOES NOT match!", expectedName, actualName);

			// Before the next iteration
			// We need to go to Add Employee page again
			wait(1);
			click(dashboard.addEmployeeLink);
		}

	}
	@Then("I am able to modify Employee Details {string}, {string}, {string}, {string}, {string}")
	public void i_am_able_to_modify_employee_details(String driverLicense, String expirationDate, String smoker,
			String gender, String nationality) {

		waitForVisibility(personDetail.personalDetailForm);

		sendText(personDetail.licenseNo, driverLicense);

		if (smoker.equals("Yes")) {
			click(personDetail.smokerCheck);
		}
		wait(2);

		// 1st way
		click(personDetail.genderInput);
//		click(driver.findElement(By.xpath("//span[text()='" + gender + "']")));
		// 2nd way
		List<WebElement> genderOptions = personDetail.genderOptions;
		clickOnElement(genderOptions, gender);

		wait(2);

		click(personDetail.nationalityInput);

		List<WebElement> nationalityOptions = personDetail.nationalityOptions;
		clickOnElement(nationalityOptions, nationality);

		wait(2);

	}

	public void clickOnElement(List<WebElement> list, String value) {
		wait(1);
		for (WebElement option : list) {
			if (option.getText().equals(value)) {
				click(option);
			
				break;
			}
		}
		
	}
	
	 

	@Then("I click on Personal Details Save")
	public void i_click_on_personal_details_save() {

	}

	
	}







