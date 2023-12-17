
@DataTest

Feature: Scenario with DataTable


  Scenario: Add Employe with DataTable
    When I login to the HRMS
    And I want to add Employeee
      | FirstName | MiddleName | LastNamle |
      | Emre      | Cinar      | abbak     |
      | Cınar     | Boss       | cink      |
      | Onder     | Yentar     | Ali       |
      
    Then I validate employee is added
