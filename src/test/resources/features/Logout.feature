@Logout
  Feature: Logout Functionality
    As a user i want to logout from website

    Scenario: Logout Successfully
      Given Already login on website sauce demo
      And Already on homepage
      When Click side navbar icon
      And Click Logout
      Then Should be on Login Page