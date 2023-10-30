@MENTUTOR
@MENTEETASK
  Feature: Mentee Task

    Scenario: Mentee "Submit your task" button validation on a valid task
      Given User open the website mentutor
      When User input "mentee.menteemtk@gmail.com" as a email "Mentee123$" as a password
      Then User click OK on login successful
      And User click on mentee task button
      And User already on task page
      And User click on mentee submit your task button on task page
      And There should be a pop up

    Scenario: "Upload" button validation on task feature
      Given User open the website mentutor
      When User input "mentee.menteemtk@gmail.com" as a email "Mentee123$" as a password
      Then User click OK on login successful
      And User click on mentee task button
      And User already on task page
      And User click on mentee submit your task button on the right task page
      And User click on upload button "MenteeTask.pdf" as file

    Scenario: Submit button with valid data
      Given User open the website mentutor
      When User input "mentee.menteemtk@gmail.com" as a email "Mentee123$" as a password
      Then User click OK on login successful
      And User click on mentee task button
      And User already on task page
      And User click on mentee submit your task button on the right task page
      And User click on upload button "MenteeTask.pdf" as file
      And User click on Submit button on Task mentee feature
      And User should see pop up as validation

    Scenario: Submit button with no data
      Given User open the website mentutor
      When User input "mentee.menteemtk@gmail.com" as a email "Mentee123$" as a password
      Then User click OK on login successful
      And User click on mentee task button
      And User already on task page
      And User click on mentee submit your task button on the right task page
      And User click on Submit button on Task mentee feature
      And User should see pop up as validation



