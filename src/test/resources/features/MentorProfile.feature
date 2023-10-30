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

  Scenario:Input valid name,email and password
    Given User open the website mentutor
    When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
    Then User click OK on login successful
    Then User click button profile mentor
    And User already on profile page mentor
    Then User click button symbol pencil
    And User already on edit profile
    When User input "Aamanda" as a name "amanda@gmail.com" as a email "Amanda1234*" as a password "MentorProfile.png" as a profile

  Scenario:Verify button submit working
    Given User open the website mentutor
    When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
    Then User click OK on login successful
    Then User click button profile mentor
    And User already on profile page mentor
    Then User click button symbol pencil
    And User already on edit profile
    When User input "Aamanda" as a name "amanda@gmail.com" as a email "Amanda1234*" as a password "MentorProfile.png" as a profile
    Then User click button submit edit profile

  Scenario:Input with invalid email
    Given User open the website mentutor
    When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
    Then User click OK on login successful
    Then User click button profile mentor
    And User already on profile page mentor
    Then User click button symbol pencil
    And User already on edit profile
    When User input "Aamanda" as a name "amanda@gmail,com" as a email "Amanda1234*" as a password "MentorProfile.png" as a profile
    Then User click button submit edit profile

  Scenario:Update profile without input name,email,password
    Given User open the website mentutor
    When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
    Then User click OK on login successful
    Then User click button profile mentor
    And User already on profile page mentor
    Then User click button symbol pencil
    And User already on edit profile
    Then User click button submit edit profile





