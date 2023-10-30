@MENTUTOR
@MENTEEPROFILE
  Feature: Mentee Profile
    Scenario: Verify pencil button is working
      Given User open the website mentutor
      When User input "mentee.menteemtk@gmail.com" as a email "Mentee123$" as a password
      Then User click OK on login successful
      And User already on a Mentee profile page
      And User click on a pencil button
      And There should be an editor screen

    Scenario: Name field validation
      Given User open the website mentutor
      When User input "mentee.menteemtk@gmail.com" as a email "Mentee123$" as a password
      Then User click OK on login successful
      And User already on a Mentee profile page
      And User click on a pencil button
      And User input "Alfian Septy Chandra" as a name on a name field

    Scenario: email field validation
      Given User open the website mentutor
      When User input "mentee.menteemtk@gmail.com" as a email "Mentee123$" as a password
      Then User click OK on login successful
      And User already on a Mentee profile page
      And User click on a pencil button
      And User Input "mentee.menteemtk@gmail.com" as an email on email field

    Scenario: Password field validation
      Given User open the website mentutor
      When User input "mentee.menteemtk@gmail.com" as a email "Mentee123$" as a password
      Then User click OK on login successful
      And User already on a Mentee profile page
      And User click on a pencil button
      And User input "Mentee123$" as a password on a password field

    Scenario: Upload button Functionality
      Given User open the website mentutor
      When User input "mentee.menteemtk@gmail.com" as a email "Mentee123$" as a password
      Then User click OK on login successful
      And User already on a Mentee profile page
      And User click on a pencil button
      And User click on an upload button and choose "MenteeProfilePicture.png" as an image

    Scenario:  Submit with all data filled
      Given User open the website mentutor
      When User input "mentee.menteemtk@gmail.com" as a email "Mentee123$" as a password
      Then User click OK on login successful
      And User already on a Mentee profile page
      And User click on a pencil button
      And User input "Alfian Septy Chandra" as a name on a name field
      And User Input "mentee.menteemtk@gmail.com" as an email on email field
      And User input "Mentee123$" as a password on a password field
      And User click on submit button on mentee profile screen

    Scenario:  Submit with all data filled
      Given User open the website mentutor
      When User input "mentee.menteemtk@gmail.com" as a email "Mentee123$" as a password
      Then User click OK on login successful
      And User already on a Mentee profile page
      And User click on a pencil button
      And User Input "mentee.menteemtk@gmail.com" as an email on email field
      And User input "Mentee123$" as a password on a password field
      And User click on submit button on mentee profile screen


