@Variant_Item   @Reg
Feature: Android - Retail POS - Variant Item

  Scenario: Order the Variant Item and complete the payment with Cash
    Given Login with the valid credentials
    Then Order the Variant item from the retail Screen
    And Complete the payment using cash button
    And Click the Logoff button

  Scenario Outline: Order the Variant Item and complete the payment with Gift Card
    Given Login with the valid credentials
    Then Order the Variant item from the retail Screen
    And Complete the payment using gift card button and the card number is <CardNumber>
    And Click the Logoff button
    Examples:
      | CardNumber |
      | 1234       |

  Scenario: Order the Variant Item and complete the payment with Side CC
    Given Login with the valid credentials
    Then Order the Variant item from the retail Screen
    And Complete the payment using Side CC button
    And Click the Logoff button

  Scenario: Order the Variant Item and complete the payment with Others
    Given Login with the valid credentials
    Then Order the Variant item from the retail Screen
    And Complete the payment using Others button
    And Click the Logoff button

  Scenario Outline: Order the Variant Item and complete the payment with HA Payment
    Given Login with the valid credentials
    Then Order the Variant item from the retail Screen
    And Complete the payment using HA Payment button and the card number is <CardNumber>
    And Click the Logoff button
    Examples:
      | CardNumber |
      | 150        |

  Scenario: Order the Variant Item and complete the payment with Fast Cash
    Given Login with the valid credentials
    Then Order the Variant item from the retail Screen
    And Complete the payment using fast cash button
    And Click the Logoff button

  Scenario Outline: Order the Variant Item and complete the payment with Fast Cash with customer
    Given Login with the valid credentials
    Then Order the Variant item from the retail Screen
    Then Add the customer and the Customer Number is <CustomerNumber>
    And Complete the payment using fast cash button
    And Click the Logoff button
    Examples:
      | CustomerNumber |
      | 123456         |

  Scenario: Verify the quantity if user selects any number from notepad in order screen
    Given Login with the valid credentials
    Then Order the Variant from the retail Screen Single item
    And verify the quantity of the menu item
    And Complete the payment using fast cash button
    And Click the Logoff button

  Scenario: Verify able to view the closed check after completing the sale
    Given Login with the valid credentials
    Then Order the Variant item from the retail Screen
    And Get the Check number from the retail screen
    And Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
    Then Verify the Closed Check from the Sale history screen
    And Click the Logoff button

  Scenario: Verify able to order the variant item with exclusive or item tax
    Given Login with the valid credentials
    Then Place Variant retail item in retail order screen with exclusive or item tax
    And Complete the payment using fast cash button
    And Click the Logoff button

  Scenario: Verify able to order the variant item with quantity based tax
    Given Login with the valid credentials
    Then Order the Multiple Variant item for the quantity based tax
    And Complete the payment using fast cash button
    And Click the Logoff button

  Scenario: Verify able to order the variant item with check based tax
    Given Login with the valid credentials
    Then Order the Multiple Variant item for the check based tax
    And Complete the payment using fast cash button
    And Click the Logoff button

  Scenario: Verify able to order the variant item with tax on item based tax
    Given Login with the valid credentials
    Then Order the Multiple Variant item for the tax on Item tax
    And Complete the payment using fast cash button
    And Click the Logoff button

  Scenario: Verify able to order the variant item with inclusive and exclusive tax
    Given Login with the valid credentials
    Then Place the Multiple retail Variant item with Exclusive tax and Inclusive tax
    And Complete the payment using fast cash button
    And Click the Logoff button

Scenario: Verify the ordered variant item should be displayed with the SKU Code
  Given Login with the valid credentials
  And Order the Variant item from the retail Screen
  Then Get the SKU code from the retail screen
  And Validate the SKU code
  Then Complete the payment using fast cash button
  And Click the Logoff button

  Scenario: Verify the visibility of variant code in ordering screen
    Given Login with the valid credentials
    And Order the Variant item from the retail Screen
    Then Get the Variant code from the retail screen
    And Validate the Variant code
    Then Complete the payment using fast cash button
    And Click the Logoff button

    Scenario Outline: Verify able to view the voided check only in void check stats
      Given Login with the valid credentials
      Then Page will navigate to the retail order screen
      When Add the customer and the Customer Number is <CustomerNum>
      Then Place the Multiple retail Variant item with Exclusive tax
      And Get the Check number from the retail screen
      Then Complete the payment using fast cash button
      And Click the sale history
      Then Screen will navigate to Receipt-Check Status screen
      When select the required check
      Then Click the Reopen Check button
      And Click the Payment option
      Then Select the Paid amount from the Payment screen
      And Click the Delete button from the Payment screen
      And Select Back button
      Then Click on void option for that placed retail item
      When Void Sale Screen with Select or type your void reason, Free Text box and it should allow fifty characters
      And Cancel and Void button with close symbol at the top is shown
      Then Click on void button by selecting or typing the void reason with the popup <Msg> should display
      And Click the sale history
      When Select void tab from sale history screen
      When verify the required check
      Then Select Parked tab from sale history screen
      When verify the required checks
      Then Select Refunded tab from sale history screen
      When verify the required checks
      Then Select Exchanged tab from sale history screen
      When verify the required checks
      Then Select Layaways tab from sale history screen
      When verify the required checks
      And Click the retail button
      Then Click the Logoff button
      Examples:
        | CustomerNum | Msg            |
        | 123456      | Sale is voided |