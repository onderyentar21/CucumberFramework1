
  @Login
  Feature: Login Failed
  
  @smoke
  Scenario: Invalid Password
   # Given I navigated to the HRM website
    When I enter a valid username
    And I enter an invalid password
    And I click on the login button
    Then I validate that Invalid Credentials is displayed
  #  And I will quit the browser
