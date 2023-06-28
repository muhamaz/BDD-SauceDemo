@Login
  Feature: Login Functionality
    As a user i want to login on website sauce demo

  Scenario: Login Successfully
    Given Already on login page
    When User input "standard_user" as userName and input "secret_sauce" as password
    And Click login button
    Then Redirect to homepage
