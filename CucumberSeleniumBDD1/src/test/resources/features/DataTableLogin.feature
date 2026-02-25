Feature: Login using Data Table

Scenario: Login with multiple data
  Given I open the browser
  When I open the SauceDemo website
  And I enter username and password
    | username      | password      |
    | standard_user | secret_sauce  |
  Then I close the browser