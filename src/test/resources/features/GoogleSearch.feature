Feature: Searching in google


  Scenario: search by typing

Given I navigated to google 
When  I type something in the search box
And I click on the search button
Then I can see the result of my search
And I can count the number of the result
