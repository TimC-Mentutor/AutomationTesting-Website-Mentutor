@MENTUTOR
@Admin
Feature: Admin Input Class
  @AdminInputClass
  @Positive-case
  Scenario: Input class button validation on input class admin
    Given User open the website mentutor
    When User input "admin1.mentutor@gmail.com" as a email "Admin123$" as a password
    Then User click OK on login successful
    Then User click button input class admin
    And User already on input class page admin

  @AdminInputClass
  @Positive-case
  Scenario: Input class name field validation on input class admin
    Given User open the website mentutor
    When User input "admin1.mentutor@gmail.com" as a email "Admin123$" as a password
    Then User click OK on login successful
    Then User click button input class admin
    And User already on input class page admin
    Then User click on field input class name admin

  @AdminInputClass
  @Positive-case
  Scenario: Add button validation on input class admin
    Given User open the website mentutor
    When User input "admin1.mentutor@gmail.com" as a email "Admin123$" as a password
    Then User click OK on login successful
    Then User click button input class admin
    And User already on input class page admin
    Then User click on field input class name admin
    When User input "Elektronik" as a class name

    Then User click OK on input class succes created

  @AdminInputClass
  @Negative-case
  Scenario: Add button validation is blank on input class admin
    Given User open the website mentutor
    When User input "admin1.mentutor@gmail.com" as a email "Admin123$" as a password
    Then User click OK on login successful
    Then User click button input class admin
    And User already on input class page admin
    Then User click on field input class name admin
    When User input "" as a class name
    Then User click button add on input class admin
    Then User see error message bottom field class name

  @AdminInputClass
  @Positive-case
  Scenario: Dropdown button validation on input class admin
    Given User open the website mentutor
    When User input "admin1.mentutor@gmail.com" as a email "Admin123$" as a password
    Then User click OK on login successful
    Then User click button input class admin
    And User already on input class page admin
    And User see table class on input class admin
    Then User click button dropdown input class admin
    And User see dropdown input class admin button edit and delete
