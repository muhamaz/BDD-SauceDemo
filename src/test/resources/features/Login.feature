@Login
  Feature: Login Functionality
    As a user i want to login on website sauce demo

    Scenario: Login Successfully
      Given Already on login page
      When User input "standard_user" as userName and input "secret_sauce" as password
      And Click login button
      Then Redirect to homepage

    Scenario Outline: Login Unsuccessfully
      Given Already on login page
      When User input "<userName>" as userName and input "<password>" as password
      And Click login button
      Then Error message "<message>" should appear
      Examples:
        | userName      | password     | message                                                                   |
        | lalala        | lululu       | Epic sadface: Username and password do not match any user in this service |
        | standard_user |              | Epic sadface: Password is required                                        |
        |               | secret_sauce | Epic sadface: Username is required                                        |
        |               |              | Epic sadface: Username is required                                        |