@Checkout
  Feature: Checkout Functionality
    As a user i want to checkout a product

    Scenario: Checkout with added item
      Given Already login on website sauce demo
      And User Sorting product by "Price (low to high)"
      And Already adding two item to cart
      And Already on cart page
      When User Remove one item
      And Click checkout button
      And Redirect to checkout page
      And User input "Humam" as firstName "Zaky" as lastName and 54321 as zipPostalCode
      And Click continue button
      And Display checkout information
      And Click finish button
      Then Click back home button

    Scenario: Checkout without added item
      Given Already login on website sauce demo
      When Already on cart page
      Then Checkout button should not appear
