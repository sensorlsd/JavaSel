Feature: Open and Login into account
  Existing user should be able to login to account using correct credentials

  Scenario: Login intro account with correct credentials
    Given User navigate to stackoverflow website
    And User click the login button
    And User enters a valid username
    And User enters a valid password
    When User clicks on the login button
    Then User should be takes to the successful login page

