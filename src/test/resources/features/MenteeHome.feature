@MENTUTOR
@MENTEEHOME
  Feature: Mentee Home
    Scenario: home button functionality
      Given User open the website mentutor
      When User input "mentee.menteemtk@gmail.com" as a email "Mentee123$" as a password
      Then User click OK on login successful
      And User Click on Mentee home button
      And User already on home page mentee

    Scenario: Mentee Task button
      Given User open the website mentutor
      When User input "mentee.menteemtk@gmail.com" as a email "Mentee123$" as a password
      Then User click OK on login successful
      And User Click on Mentee Submit task button

    Scenario: Mentee Logout Button
      Given User open the website mentutor
      When User input "mentee.menteemtk@gmail.com" as a email "Mentee123$" as a password
      Then User click OK on login successful
      And User click on mentee logout button
      And User Should see a confirmation pop up

    Scenario: Mentee Profile Icon Button
      Given User open the website mentutor
      When User input "mentee.menteemtk@gmail.com" as a email "Mentee123$" as a password
      Then User click OK on login successful
      And User Click on mentee profile icon
      And User already on profile page
