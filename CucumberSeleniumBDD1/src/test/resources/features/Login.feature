Feature: Login functionality Run Debug |
Scenario: Successful login with valid credentials Run | Debug | Profile
Given I launch the browser
When I open the login page
And I enter valid username and password
And I click on login button
Then I should see the home page