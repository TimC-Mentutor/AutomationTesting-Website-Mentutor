@MENTUTOR
Feature: Admin Input Member
  @AdminInputMember
  @Positive-case @Test1
  Scenario: Input member button validation on input member admin
    Given User open the website mentutor
    When User input "admin1.mentutor@gmail.com" as a email "Admin123$" as a password
    Then User click OK on login successful
    Then User click button input member admin
    And User already on input member page admin

  @AdminInputMember
  @Positive-case
  Scenario: Name field validation on input member admin
    Given User open the website mentutor
    When User input "admin1.mentutor@gmail.com" as a email "Admin123$" as a password
    Then User click OK on login successful
    Then User click button input member admin
    And User already on input member page admin
    Then User click field name on input member admin
    When User input "Jose Sendang" as a name

  @AdminInputMember
  @Positive-case
  Scenario: Email field validation on input member admin
    Given User open the website mentutor
    When User input "admin1.mentutor@gmail.com" as a email "Admin123$" as a password
    Then User click OK on login successful
    Then User click button input member admin
    And User already on input member page admin
    Then User click field email on input member admin
    When User input "mentutor@gmail.com" as an email

  @AdminInputMember
  @Positive-case
  Scenario: Password field validation on input member admin
    Given User open the website mentutor
    When User input "admin1.mentutor@gmail.com" as a email "Admin123$" as a password
    Then User click OK on login successful
    Then User click button input member admin
    And User already on input member page admin
    Then User click field password on input member admin
    When User input "123123" as a password

  @AdminInputMember
  @Positive-case
  Scenario: Dropdown role field validation on input member admin
    Given User open the website mentutor
    When User input "admin1.mentutor@gmail.com" as a email "Admin123$" as a password
    Then User click OK on login successful
    Then User click button input member admin
    And User already on input member page admin
    Then User click button dropdown role admin
    And User see others role on button Mentor and Mentee

  @AdminInputMember
  @Positive-case
  Scenario: Dropdown class field validation when name and email field filed on input member admin
    Given User open the website mentutor
    When User input "admin1.mentutor@gmail.com" as a email "Admin123$" as a password
    Then User click OK on login successful
    Then User click button input member admin
    And User already on input member page admin
    When User input "Member Auto001" as a name "member001@gmail.com" as a email
    Then User click button dropdown class on input member admin
    And User see list of class on dropdown class on input member

  @AdminInputMember
  @Negative-case
  Scenario: Dropdown class field validation when name and email field blank on input member admin
    Given User open the website mentutor
    When User input "admin1.mentutor@gmail.com" as a email "Admin123$" as a password
    Then User click OK on login successful
    Then User click button input member admin
    And User already on input member page admin
    When User input blank "" as a name "" as a email
    Then User click button dropdown class on input member admin
    And User see list of class on dropdown class on input member

  @AdminInputMember
  @Positive-case
  Scenario: Add button validation on input member admin
    Given User open the website mentutor
    When User input "admin1.mentutor@gmail.com" as a email "Admin123$" as a password
    Then User click OK on login successful
    Then User click button input member admin
    And User already on input member page admin
    When User input "Member Auto" as a name "member001@gmail.com" as a email "Member123$" as a password
    Then User click button dropdown role on input member admin
    Then User click existed data on dropdown role input member
    Then User click button dropdown class on input member admin
    Then User click existed data on dropdown class input member
    Then User click button add on input member admin
    Then User click OK on register success popup