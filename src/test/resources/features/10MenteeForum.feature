@MENTUTOR
@MENTEEFORUM
  Feature: Mentee Forum

    Scenario: Verify the forum field is enabled
      Given User open the website mentutor
      When User input "mentee.menteemtk@gmail.com" as a email "Mentee123$" as a password
      Then User click OK on login successful
      And User click on mentee forum page
      And Input "Ini Forum Alfian" in the forum field

    Scenario: Input Special Character on forum mentee field
      Given User open the website mentutor
      When User input "mentee.menteemtk@gmail.com" as a email "Mentee123$" as a password
      Then User click OK on login successful
      And User click on mentee forum page
      And Input "@@$$$%%%!!!**" in the forum field

    Scenario: Click send with less than 5 character
      Given User open the website mentutor
      When User input "mentee.menteemtk@gmail.com" as a email "Mentee123$" as a password
      Then User click OK on login successful
      And User click on mentee forum page
      And Input "coba" in the forum field
      And Click Send button on mentee forum
      And there should be a pop up in the mentee forum page

    Scenario: Send with no data and Images file
      Given User open the website mentutor
      When User input "mentee.menteemtk@gmail.com" as a email "Mentee123$" as a password
      Then User click OK on login successful
      And User click on mentee forum page
      And Click Send button on mentee forum


    Scenario: Send with valid data and valid image as attachment
      Given User open the website mentutor
      When User input "mentee.menteemtk@gmail.com" as a email "Mentee123$" as a password
      Then User click OK on login successful
      And User click on mentee forum page
      And Input "Ini Forum Alfian" in the forum field
      And User upload images with "MenteeForumImages.png" as image file
      And Click Send button on mentee forum

    Scenario: Send with valid data with no image as attachment
      Given User open the website mentutor
      When User input "mentee.menteemtk@gmail.com" as a email "Mentee123$" as a password
      Then User click OK on login successful
      And User click on mentee forum page
      And Input "Ini Forum Alfian" in the forum field
      And Click Send button on mentee forum

    Scenario: Verify comment field is enabled
      Given User open the website mentutor
      When User input "mentee.menteemtk@gmail.com" as a email "Mentee123$" as a password
      Then User click OK on login successful
      And User click on mentee forum page
      And User input "saya juga bingung" in the comment field

    Scenario: Click Send on comment with less than 5 character
      Given User open the website mentutor
      When User input "mentee.menteemtk@gmail.com" as a email "Mentee123$" as a password
      Then User click OK on login successful
      And User click on mentee forum page
      And User input "coba" in the comment field
      And Send Comment in comment forum mentee
      And there should be a pop up in the mentee forum page

