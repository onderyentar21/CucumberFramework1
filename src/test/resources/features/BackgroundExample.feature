@Background
  Feature: Background Example


    Background:
      Given precondition1
      And precondition2

# this mean just we do inside testNG same think like groeub we do 

@Smoke @Spring5 

    Scenario: Example1 
      When Test nr1 firstNAme is "onder" and lastName "yentar"
      And Test nr2
      And Test nr3
      Then Validation nr1
      And Validation nr2




    Scenario: Example2
      When Test nr4
      And Test nr5
      And Test nr6
      Then Validation nr3
      And Validation nr4
