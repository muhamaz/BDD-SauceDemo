@Cart
  Feature: Cart Functionality
    As a user i want to add product to cart

    Scenario: Adding product to cart
      Given Already login on website sauce demo
      And Already on homepage
      When Click add to cart button
      And Click cart icon
      Then The added product should be displayed

    Scenario: Removing Product
      Given Already login on website sauce demo
      And Already on homepage
      When Click add to cart button
      And Click cart icon
      And Click remove on product item
      Then Product item should be removed