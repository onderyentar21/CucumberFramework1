

@Outline
Feature: Scenario Outline Example

  Scenario Outline: 
    When Login with "<username>" and "<password>"
    And Click on tje login button
    Then validate that "<username>" is displayed
    And we want to say Bye "<fullname>"

    Examples: 
      | username | password | fullname     |
      | onder    | Y1234    | Onder Yentar |
      | mahir    | O32455   | Mahir Yentar |
      | ergin    | r32454   | Ergin Yentar |
