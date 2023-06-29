@Filter
  Feature: Filter Functionality
    As a user i want to sorting a product list

    Scenario Outline: Sorting product
      Given Already login on website sauce demo
      And Already on homepage
      When User Sorting product by "<label>"
      Then Product is sorted "<textPrice>" and "<textName>"
      Examples:
        | label               | textPrice | textName                          |
        | Name (A to Z)       | $29.99    | Sauce Labs Backpack               |
        | Name (Z to A)       | $15.99    | Test.allTheThings() T-Shirt (Red) |
        | Price (high to low) | $49.99    | Sauce Labs Fleece Jacket          |
        | Price (low to high) | $7.99     | Sauce Labs Onesie                 |

