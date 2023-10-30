@MENTUTOR
Feature: Admin Home
  @AdminHome
  @Positive-case
  Scenario: Home button validation on home admin
    Given User open the website mentutor
    When User input "admin1.mentutor@gmail.com" as a email "Admin123$" as a password
    Then User click OK on login successful
    Then User click button home admin
    And User already on home page admin

  @AdminHome
  @Positive-case
  Scenario: Dropdown button validation on home admin
    Given User open the website mentutor
    When User input "admin1.mentutor@gmail.com" as a email "Admin123$" as a password
    Then User click OK on login successful
    And User already on home page admin
    Then User click button dropdown admin
    And User see dropdown admin button edit and delete

  @AdminHome
  @Positive-case
  Scenario: Edit button validation on home admin
    Given User open the website mentutor
    When User input "admin1.mentutor@gmail.com" as a email "Admin123$" as a password
    Then User click OK on login successful
    Then User click button dropdown admin
    And User see dropdown admin button edit and delete
    Then User click button edit on home admin
    And User see popup edit user

  @AdminHome
  @Positive-case
  Scenario: Submit button validation on popup edit user on home admin
    Given User open the website mentutor
    When User input "admin1.mentutor@gmail.com" as a email "Admin123$" as a password
    Then User click OK on login successful
    Then User click button dropdown admin
    Then User click button edit on home admin
    When User input "Bhakti UGP" as a name "bhaktii@gmail.com" as an email
    Then User click button submit on popup edit user admin
    Then User click OK on success updated admin

  @AdminHome
  @Negative-case
  Scenario: Submit button validation on popup edit user is blank on home admin
    Given User open the website mentutor
    When User input "admin1.mentutor@gmail.com" as a email "Admin123$" as a password
    Then User click OK on login successful
    Then User click button dropdown admin
    Then User click button edit on home admin
    When User input "" as a name "" as an email "" as a password
    Then User click button submit on popup edit user admin
    Then User click OK on succes updated admin