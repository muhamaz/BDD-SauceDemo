@Checkout
  Feature: Checkout Functionality
    As a user i want to checkout a product

    Scenario: Checkout with added item
      Given Already login on website sauce demo
      And User Sorting product by "Price (low to high)"
      And Already adding two item "onesie" and "allthethings" to cart
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
      And Already on homepage
      When Click cart icon
      Then Checkout button should not appear

    Scenario: Verify Cancel Button on Checkout Form can Redirect to Cart Page
      Given Already login on website sauce demo
      And User Sorting product by "Price (low to high)"
      And Already adding two item "onesie" and "allthethings" to cart
      And Already on cart page
      When Click checkout button
      And Click cancel button
      Then Should be on Cart Page

