@KitAssembly_Item  @Reg
Feature: Kit Assembly - future file

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
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
    Then Verify the Closed Check from the Sale history screen
    And Click the Logoff button

  Scenario: Order the Kit Assembly Item and complete the payment with Fast Cash - Quantity Based Tax
    Given Login with the valid credentials
    Then Order the Multiple Kit Assembly item for the quantity based tax
    And Complete the payment using fast cash button
    And Click the Logoff button

  Scenario: Order the Kit Assembly Item and complete the payment with Fast Cash - Inclusive Tax
    Given Login with the valid credentials
    Then Place the Multiple retail KitAssembly item with Inclusive tax
    And Complete the payment using fast cash button
    And Click the Logoff button

  Scenario: Order the Kit Assembly Item and complete the payment with Fast Cash - Exclusive and Inclusive Tax
    Given Login with the valid credentials
    Then Place the Multiple retail KitAssembly item with Exclusive tax and Inclusive tax
    And Complete the payment using fast cash button
    And Click the Logoff button

  Scenario: Order the Kit Assembly Item and complete the payment with Fast Cash - Tax on Item Tax
    Given Login with the valid credentials
    Then Order the Multiple Kit Assembly item for the tax on Item tax
    And Complete the payment using fast cash button
    And Click the Logoff button

  Scenario: Order the Kit Assembly Item and complete the payment with Fast Cash - Check Based Tax
    Given Login with the valid credentials
    Then Order the Multiple Kit Assembly item for the check based tax
    And Complete the payment using fast cash button
    And Click the Logoff button
@err
  Scenario: Verify able to change the variant by clicking change variant
    Given Login with the valid credentials
    Then Order the Kit Assembly item from the retail Screen
    And Click the Change Variant option
    Then Change the required Variants option
    And Complete the payment using fast cash button
    And Click the Logoff button

  Scenario: Verify able to view the retail items if closed check is reopened
    Given Login with the valid credentials
    Then Order the Kit Assembly item from the retail Screen
    And Get the Check number from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    And select the required check
    Then Click the retail button
    And Click the Logoff button

    Scenario Outline: Verify the Change Variant option if sub attributes of variant item is selected in BO
      Given Login with the valid credentials
      Then Order the given retail item <Retail_Item> from the Kit Assembly
      And Get the Change Variant option from the retail screen
      Then Click all the Change Variant options and click done
      And Verify all the Change variant options are available or not in the retail screen
      And Complete the payment using fast cash button
      And Click the Logoff button
      Examples:
        | Retail_Item          |
        | Kit Accessible Item5 |

