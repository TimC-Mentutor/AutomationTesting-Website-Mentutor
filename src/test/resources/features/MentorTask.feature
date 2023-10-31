@MENTUTOR
@MENTOR
@MENTORTASK
@MentorTask
Feature:Mentor task
  Scenario:Task button fungsionality on task mentor
    Given User open the website mentutor
    When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
    Then User click OK on login successful
    Then User click button task mentor
    And User already on task page mentor

  Scenario:Elipsis button validation on task mentor
    Given User open the website mentutor
    When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
    Then User click OK on login successful
    Then User click button task mentor
    And User already on task page mentor
    Then User click button elipsis on task mentor
    And User see button edit and delete

  Scenario:add button validation on task mentor
    Given User open the website mentutor
    When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
    Then User click OK on login successful
    Then User click button task mentor
    And User already on task page mentor
    When User input "Tugas" as a title "Pertemuan 1" as a description "2023-11-14" as a due date "MentorTask.docx" as a attachment "MentorTaskPeta.png" as a images
    Then User click button add on task mentor
    Then User click OK on task created

  Scenario:Input valid title,description,due date,attachment,Images
    Given User open the website mentutor
    When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
    Then User click OK on login successful
    Then User click button task mentor
    And User already on task page mentor
    When User input "Tugas" as a title "Pertemuan 1" as a description "2023-11-14" as a due date "MentorTask.docx" as a attachment "MentorTaskPeta.png" as a images

  Scenario:Add task without input title,description,due date,attachment,Images
    Given User open the website mentutor
    When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
    Then User click OK on login successful
    Then User click button task mentor
    And User already on task page mentor
    Then User click button add on task mentor
    Then User see error message

  Scenario:input string on due date field
    Given User open the website mentutor
    When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
    Then User click OK on login successful
    Then User click button task mentor
    And User already on task page mentor
    When User input "Tugas" as a title "Pertemuan 1" as a description "2023-Desember-14" as a due date "MentorTask.docx" as a attachment "MentorTaskPeta.png" as a images
    Then User click button add on task mentor
    Then User see error message on field due date

  Scenario:Add task without input Images
    Given User open the website mentutor
    When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
    Then User click OK on login successful
    Then User click button task mentor
    And User already on task page mentor
    When User input "Tugas" as a title "Pertemuan 1" as a description "2023-11-14" as a due date "MentorTask.docx" as a attachment "" as a images
    Then User click button add on task mentor
    Then User click OK on task created

#  Scenario:edit task with Input valid title,description,due date,attachment,Images
#    Given User open the website mentutor
#    When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
#    Then User click OK on login successful
#    Then User click button task mentor
#    And User already on task page mentor
#    Then User click button elipsis on task mentor
#    Then User click button edit
#    When User input "Tugas" as a title "Pertemuan 1" as a description "2023-11-14" as a due date "MentorTask.docx" as a attachment "MentorTaskPeta.png" as a images on edit task
#    Then User click button submit
#    Then User click OK on success update



