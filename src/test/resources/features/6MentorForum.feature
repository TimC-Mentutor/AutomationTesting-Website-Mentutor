@MENTUTOR
@MENTOR
@MENTORFORUM
Feature:MentorForum

Scenario:Verify the button forum is working on forum mentor
  Given User open the website mentutor
  When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
  Then User click OK on login successful
  Then User click button forum mentor
  And User already on forum page mentor

Scenario:Verify comment forum mentor
  Given User open the website mentutor
  When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
  Then User click OK on login successful
  Then User click button forum mentor
  And User already on forum page mentor
  Then User click field comment on forum mentor page
  When User can input comment "good job"

Scenario:Verify the paper plane is working on forum mentor
  Given User open the website mentutor
  When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
  Then User click OK on login successful
  Then User click button forum mentor
  And User already on forum page mentor
  Then User click field comment on forum mentor page
  When User can input comment "good job"
  Then User click button paper plane on forum mentor

Scenario:Verify button Load More Comments is working on forum mentor
  Given User open the website mentutor
  When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
  Then User click OK on login successful
  Then User click button forum mentor
  And User already on forum page mentor
  Then User click button Load More Comments on forum mentor

Scenario:Verify button hide is working on forum mentor
  Given User open the website mentutor
  When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
  Then User click OK on login successful
  Then User click button forum mentor
  And User already on forum page mentor
  Then User click field comment on forum mentor page
  When User can input comment "good job"
  Then User click button paper plane on forum mentor
  And User see comment on forum mentor
  Then User click button Load More Comments on forum mentor
  Then User click button hide on forum mentor

Scenario:input comment less than 5 string
  Given User open the website mentutor
  When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
  Then User click OK on login successful
  Then User click button forum mentor
  And User already on forum page mentor
  Then User click field comment on forum mentor page
  When User can input comment "nice"
  Then User click button paper plane on forum mentor

Scenario:input comment integer on field comment
  Given User open the website mentutor
  When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
  Then User click OK on login successful
  Then User click button forum mentor
  And User already on forum page mentor
  Then User click field comment on forum mentor page
  When User can input comment "123456"
  Then User click button paper plane on forum mentor

Scenario:send comment without input comment
  Given User open the website mentutor
  When User input "amanda@gmail.com" as a email "Amanda1234*" as a password
  Then User click OK on login successful
  Then User click button forum mentor
  And User already on forum page mentor
  Then User click field comment on forum mentor page
  When User can input comment ""
  Then User click button paper plane on forum mentor
