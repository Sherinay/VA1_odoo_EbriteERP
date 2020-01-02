

Feature: Users should be able to login
  @driver
  Scenario: Positive login


  Given the user is on the login page
  Given first and second messages is displayed
  When the users enters the login information
  Then the user should be able to login


  Scenario: Negative login
    Given the user is on the login page
    Given first and second messages is displayed
    When the users enters the login information
    Then the user should not be able to login