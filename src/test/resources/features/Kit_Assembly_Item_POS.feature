@KitAssembly_Item
Feature: Android - Retail POS - Variant Item

  Scenario: Order the Kit Assembly Item and complete the payment with Cash
    Given Login with the valid credentials
    Then Order the Kit Assembly item from the retail Screen
    And Complete the payment using cash button
    And Click the Logoff button

  Scenario Outline: Order the Kit Assembly Item and complete the payment with Gift Card
    Given Login with the valid credentials
    Then Order the Kit Assembly item from the retail Screen
    And Complete the payment using gift card button and the card number is <CardNumber>
    And Click the Logoff button
    Examples:
      | CardNumber |
      | 1234       |

  Scenario: Order the Kit Assembly Item and complete the payment with Side CC
    Given Login with the valid credentials
    Then Order the Kit Assembly item from the retail Screen
    And Complete the payment using Side CC button
    And Click the Logoff button

  Scenario: Order the Kit Assembly Item and complete the payment with Others
    Given Login with the valid credentials
    Then Order the Kit Assembly item from the retail Screen
    And Complete the payment using Others button
    And Click the Logoff button

  Scenario Outline: Order the Kit Assembly Item and complete the payment with HA Payment
    Given Login with the valid credentials
    Then Order the Kit Assembly item from the retail Screen
    And Complete the payment using HA Payment button and the card number is <CardNumber>
    And Click the Logoff button
    Examples:
      | CardNumber |
      | 150        |

  Scenario: Order the Kit Assembly Item and complete the payment with Fast Cash
    Given Login with the valid credentials
    Then Order the Kit Assembly item from the retail Screen
    And Complete the payment using fast cash button
    And Click the Logoff button

  Scenario: Verify the quantity if user selects any number from notepad in order screen
    Given Login with the valid credentials
    Then Order the Kit Assembly from the retail Screen Single item
    And verify the quantity of the menu item
    And Complete the payment using fast cash button
    And Click the Logoff button

  Scenario: Verify able to view the closed check after completing the sale
    Given Login with the valid credentials
    Then Order the Kit Assembly item from the retail Screen
    And Get the Check number from the retail screen
    And Complete the payment using fast cash button
    Then Verify the Closed Check from the Sale history screen
    And Click the Logoff button