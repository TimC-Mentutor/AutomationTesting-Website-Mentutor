@Admin
Feature: Admin Home
  As a user i want to login mentutor website as admin

  @HomeButtonVerify
  Scenario: Login as admin
    Given User open the website mentutor
    When User input "admin1.mentutor@gmail.com" as a email "Admin123$" as a password
    Then User click OK on login successful


