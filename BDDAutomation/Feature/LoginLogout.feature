Feature: Register a Non registered user will come on application and perform activities

Scenario: Registered comes to application, Login and Logout
Given  User is on login page
When   User enters username
And    User enters password
And    User click on Signin button
Then   User should be loggedin
When   User Clicks on Logout button
Then   User should be Loggedout


Scenario: Non Register user comes to application, Register and Login Logout
Given  User is on Registration page
When   User enter username
And    User enters email address
And    User enters Password
And    User enters confirm password
And    User enters date of birth
And    User enters phone number
And    User enters address
And    User click on Home address type
And    User select gender
And    User select Country
And    User select State
And    User select City
And    User enters zip code
And    User click on agree checkbox
And    User click on Signup button
Then   User account should be created


