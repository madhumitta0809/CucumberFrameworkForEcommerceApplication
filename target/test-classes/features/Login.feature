Feature:Login functionality
Scenario:Login with valid credentials
Given User has navigated to Login page
When user has entered valid email address "amotooricap1@gmail.com" in email field
And user has entered valid password "12345" in the password field
And user clicks on login button
Then User should get successfully logged in

Scenario: Login with Invalid credentials
Given User has navigated to Login page
When user has entered  Invalid email address in email field
And user has entered  Invalid password "123456" in the password field
And user clicks on login button
Then User should get email/password not matching warning message


Scenario: Login with valid email and Invalid password
Given User has navigated to Login page
When user has entered valid email address "amotooricap1@gmail.com" in email field
And user has entered  Invalid password "123456" in the password field
And user clicks on login button
Then User should get email/password not matching warning message


Scenario: Login with Invalid email and valid password
Given User has navigated to Login page
When user has entered  Invalid email address in email field
And user has entered valid password "12345" in the password field
And user clicks on login button
Then User should get email/password not matching warning message


Scenario: Login without providing  credentials
Given User has navigated to Login page
When user has not entered anything in email field
And user has not entered anything in the password field
And  user clicks on login button
Then User should get email/password not matching warning message