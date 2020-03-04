Feature: Create Account Validation

Scenario: Verify create account functionality
Given user launch browser
When user enter url
And user click on signin link
And user enter email address
Then user should see account page


Scenario: Verify create account functionality by clicking create account
Given user launch browser
When user enter url
And user click on signin link
And user enter email address
And user click on create account button
Then user should see create account page


Scenario: Verify create account functionality by entering data into create account page
Given user launch browser
When user enter url
And user click on signin link
And user enter email address
And user click on create account button
And user enter first name
And user enter last name
And user enter password
And user select date of birth

Then user should see created account page
