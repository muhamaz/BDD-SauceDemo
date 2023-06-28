@Checkout
  Feature: Checkout Functionality
    As a user i want to checkout a product

  Scenario: Checkout with added item
    Given Already login on website sauce demo
    And Already adding item to cart
    And Already on cart page
    When Click checkout button
    And Redirect to checkout page
    And User input "Humam" as firstName "Zaky" as lastName and 54321 as zipPostalCode
    And Click continue button
    And Display checkout information
    And Click finish button
    Then Click back home button