@MENTUTOR
Feature: Admin Input Member
  @AdminHome
  @Positive-case
  Scenario: Input member button validation on input member admin
    Given User open the website mentutor
    When User input "admin1.mentutor@gmail.com" as a email "Admin123$" as a password
    Then User click OK on login successful
    Then User click button input member admin
    And User already on input member page admin

  @AdminHome
  @Positive-case
  Scenario: Name field validation on input member admin
    Given User open the website mentutor
    When User input "admin1.mentutor@gmail.com" as a email "Admin123$" as a password
    Then User click OK on login successful
    Then User click button input member admin
    And User already on input member page admin
    Then User click field name on input member admin
    When User input "Jose Sendang" as a name

  @AdminHome
  @Positive-case
  Scenario: Email field validation on input member admin
    Given User open the website mentutor
    When User input "admin1.mentutor@gmail.com" as a email "Admin123$" as a password
    Then User click OK on login successful
    Then User click button input member admin
    And User already on input member page admin
    Then User click field email on input member admin
    When User input "mentutor@gmail.com" as an email

  @AdminHome
  @Positive-case
  Scenario: Password field validation on input member admin
    Given User open the website mentutor
    When User input "admin1.mentutor@gmail.com" as a email "Admin123$" as a password
    Then User click OK on login successful
    Then User click button input member admin
    And User already on input member page admin
    Then User click field password on input member admin
    When User input "123123" as a password

  @AdminHome
  @Positive-case
  Scenario: Dropdown role field validation on input member admin
    Given User open the website mentutor
    When User input "admin1.mentutor@gmail.com" as a email "Admin123$" as a password
    Then User click OK on login successful
    Then User click button input member admin
    And User already on input member page admin
    Then User click button dropdown role admin
    And User see others role on button Mentor and Mentee

  @AdminHome
  @Positive-case
  Scenario: Dropdown class field validation when name and email field filed on input member admin
    Given User open the website mentutor
    When User input "admin1.mentutor@gmail.com" as a email "Admin123$" as a password
    Then User click OK on login successful
    Then User click button input member admin
    And User already on input member page admin
    When User input "Member Auto001" as a name "member001@gmail.com" as a email
    Then User click button dropdown class admin
    And User see list of class on dropdown class