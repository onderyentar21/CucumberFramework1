
@Login
Feature: Login Functionality

@smoke
  Scenario: valid login
   # Given I navigate to the HRM website
    When i enter a valid username
    And i enter a valid password
    And i click on the login button
    Then i validate that i m login
  #  And i will quit the browser
    
