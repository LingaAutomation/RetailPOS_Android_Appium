@Standard_Item   @Reg
Feature: Android - Retail POS - Standard Item

  @initial
  Scenario: Login with Retail POS
#    Given Sign In with the valid credentials
    Then Check the Back Office button is available or not in the pin screen
    Then Check the Operation button is available or not in the pin screen
    Then Check the Clock In button is available or not in the pin screen
    Then Check the Clock Out button is available or not in the pin screen
    Then Check the Sync button is available or not in the pin screen
    Then Check the Sync Receipts button is available or not in the pin screen
    Then Check the Devices button is available or not in the pin screen
    Then Check the Low Stock Items button is available or not in the pin screen
    Then Check the Sign Out button is available or not in the pin screen
    And Login with the valid credentials
    And Click the Logoff button

    @initial
  Scenario: Verify the Retail POS Screen Elements
      Given Login with the valid credentials
    And Check the Void button is available or not in the Retail Screen
    And Check the Sale History button is available or not in the Retail Screen
    And Check the Park Sale button is available or not in the Retail Screen
    And Check the Retrieve Sale button is available or not in the Retail Screen
    And Check the Option button is available or not in the Retail Screen
    And Check the Print button is available or not in the Retail Screen
    And Check the Discount button is available or not in the Retail Screen
    And Check the Layaway button is available or not in the Retail Screen
    And Check the Cash button is available or not in the Retail Screen
    And Check the Payment button is available or not in the Retail Screen
    And Check the Log Off button is available or not in the Retail Screen
    And Check the Operation button is available or not in the Retail Screen
    And Check the More Category button is available or not in the Retail Screen
    And Check the Item Column is available or not in the Retail Screen
    And Check the Variant Column is available or not in the Retail Screen
    And Check the SKU Code Column is available or not in the Retail Screen
    And Check the Quantity Column is available or not in the Retail Screen
    And Check the Price Column is available or not in the Retail Screen
    And Check the Discount Column is available or not in the Retail Screen
    And Check the Total Column is available or not in the Retail Screen
    And Check the Subtotal option is available or not in the Retail Screen
    And Check the Tax option is available or not in the Retail Screen
    And Check the Total option is available or not in the Retail Screen
    And Check the Paid Amount option is available or not in the Retail Screen
    And Check the Balance Amount option is available or not in the Retail Screen
    And Check the Add Customer button is available or not in the Retail Screen
    And Check the Search Customer button is available or not in the Retail Screen
    And Check the Search Option is available or not in the Retail Screen
    And Check the Check Number is available or not in the Retail Screen
    And Check the Numpad button is available or not in the Retail Screen
    And Click the Logoff button

  Scenario: Order the Standard Item and complete the payment with Cash
    Given Login with the valid credentials
    Then Order the Standard Item from the retail Screen
    And Complete the payment using fast cash button
    And Click the Logoff button

  Scenario Outline: Order the Standard Item and complete the payment with Gift Card
    Given Login with the valid credentials
    Then Order the Standard Item from the retail Screen
    And Complete the payment using gift card button and the card number is <CardNumber>
    And Click the Logoff button
    Examples:
      | CardNumber |
      | 1234       |

  Scenario: Order the Standard Item and complete the payment with Side CC
    Given Login with the valid credentials
    Then Order the Standard Item from the retail Screen
    And Complete the payment using Side CC button
    And Click the Logoff button

  Scenario: Order the Standard Item and complete the payment with Others
    Given Login with the valid credentials
    Then Order the Standard Item from the retail Screen
    And Complete the payment using Others button
    And Click the Logoff button

  Scenario Outline: Order the Standard Item and complete the payment with HA Payment
    Given Login with the valid credentials
    Then Order the Standard Item from the retail Screen
    And Complete the payment using HA Payment button and the card number is <CardNumber>
    And Click the Logoff button
    Examples:
      | CardNumber |
      | 150        |

  Scenario: Order the Standard Item and complete the payment with Fast Cash
    Given Login with the valid credentials
    Then Order the Standard Item from the retail Screen
    And Complete the payment using fast cash button
    And Click the Logoff button

  Scenario: Verify the quantity if user selects any number from notepad in order screen
    Given Login with the valid credentials
    Then Order the Standard Item from the retail Screen Single item
    And verify the quantity of the menu item
    And Complete the payment using fast cash button
    And Click the Logoff button

  Scenario: Verify price value is applied correctly if open item is placed in POS - without price
    Given Login with the valid credentials
    Then Order the Open Item from the retail screen without price
    And Void the Ordered items from the Retail Screen
    And Click the Logoff button

  Scenario: Verify price value is applied correctly if open item is placed in POS - with price
    Given Login with the valid credentials
    Then Order the Open Item from the retail screen with price
    And Void the Ordered items from the Retail Screen
    And Click the Logoff button

  Scenario: Verify able to view the closed check after completing the sale
    Given Login with the valid credentials
    Then Order the Standard Item from the retail Screen
    And Get the Check number from the retail screen
    And Complete the payment using fast cash button
    Then Verify the Closed Check from the Sale history screen
    And Click the Logoff button

  Scenario: Verify all the values in the retail screen after order the Standard Item
    Given Login with the valid credentials
    Then Order the Standard Item from the retail Screen
    And Verify all the subtotal, tax and total in the retail screen
    And Complete the payment using fast cash button
    And Click the Logoff button

  Scenario Outline: Verify the menu item price with the markup percentage
    Given Login with the valid credentials
    Then Order the standard item which have the markup percentage and the item is <Item>
    And Verify the menu item price in the retail screen and actual price is <Price> and the markup percentage is <Percentage>
    Then Complete the payment using fast cash button
    And Click the Logoff button

    Examples:
      | Item            | Percentage | Price |
      | Standard Item 1 | 50         | 20    |

#  Scenario: Verify all the values in the retail screen after order the Standard Item
#    Given Login with the valid credentials
#    And Click the sale history
#    Then Select the <Date>
#    And Select the First Check from the List
#    Then Click the Reopen Check button

