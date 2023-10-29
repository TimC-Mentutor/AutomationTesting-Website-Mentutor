@MentorProfile
Feature:Mentor task

  Scenario:Verify the button pofile is working
    Given User open the website mentutor
    When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
    Then User click OK on login successful
    Then User click button profile mentor
    And User already on profile page mentor

  Scenario:Verify the Symbol pencil is working
    Given User open the website mentutor
    When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
    Then User click OK on login successful
    Then User click button profile mentor
    And User already on profile page mentor
    Then User click button symbol pencil
    And User already on edit profile


