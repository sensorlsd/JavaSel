Feature: Open Web Driver University page and open ContactUS page.
  Fill all required fields contact with support team

  Background:
    Given User navigate to general page of the WebDriverUniversity
    When User click the Login button
    And User fill name field
    And User fill password field


  Scenario: Make contact with support group from Contact Us page
    And User enter a "valid" name
    When User click on the login button
    Then User should be presented with a successful validation alert

  Scenario: User fill all required field and click reset brn
    And User enter a "invalid" name
    When User click on the login button
    Then User should be presented with a unsuccessful validation alert

