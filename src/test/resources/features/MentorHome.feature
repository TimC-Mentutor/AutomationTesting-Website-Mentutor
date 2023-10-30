Feature:Mentor Home

# -------------HOME MENTOR-----------
Scenario:Home Button Validation
  Given User open the website mentutor
  When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
  Then User click OK on login successful
  Then User already on home page mentor
  When User click button home mentor
  Then User already on home page mentor

Scenario:View all task" Button Validation
  Given User open the website mentutor
  When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
  Then User click OK on login successful
  Then User already on home page mentor
  When User click button view all task
  Then User already on task page mentor

Scenario:Title Button Validation
Given User open the website mentutor
When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
Then User click OK on login successful
Then User already on home page mentor
When User click button title
Then User already on detail task page mentor

Scenario:Attachment Button Validation
Given User open the website mentutor
When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
Then User click OK on login successful
Then User already on home page mentor
When User click button attachment
Then button attachment can be click

Scenario:See the Submitted Task by Mentees button Validation
Given User open the website mentutor
When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
Then User click OK on login successful
Then User already on home page mentor
When User click button See the Submitted Task by Mentees
Then User already on detail task page mentor


