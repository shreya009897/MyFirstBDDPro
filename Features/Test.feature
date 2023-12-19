Feature: Login

Scenario Outline: Successful Login with valid input with data driven testing
Given user launch chrome browser
When user open Url "https://practicetestautomation.com/practice-test-login/"
And user enter username "<username>" and password as "<Password>"
And click on submit_button
Then Page title should be "Logged In Successfully | Practice Test Automation"
When user click on logout_button
And close browser

Examples:
|username|Password|
|student|Password123|