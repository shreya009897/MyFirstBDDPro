Feature: Login
Background:Comman all step
When user open Url "https://practicetestautomation.com/practice-test-login/"

Scenario : Successful Login with valid input with data driven testing
Given user launch chrome browser
And user enter username "student" and password as "Password123"
And click on submit_button
Then Page title should be "Logged In Successfully | Practice Test Automation"
And close browser

Scenario : Successful Logout
Given user launch chrome browser
And user enter username "student" and password as "Password123"
And click on submit_button
Then Page title should be "Logged In Successfully | Practice Test Automation"
When User click on logout button
And close browser
