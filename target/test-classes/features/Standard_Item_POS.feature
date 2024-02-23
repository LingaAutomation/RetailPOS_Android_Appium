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
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
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

  Scenario: Verify able to sync the Android device to the back office
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    Then Click the Sync Back Office option from the List Of options
    And Click the Logoff button

  Scenario: Verify all the values in the retail screen after order the Standard Item
    Given Login with the valid credentials
    Then Order the Standard Item from the retail Screen
    And Get the menu items,total and quantity from the retail screen
    Then Delete first item from the ordered list
    And Verify the retail item, quantity and total changes in Retail POS screen
    Then Complete the payment using fast cash button
    And Click the Logoff button

#  Scenario Outline: Verify able to view the SKU code if customer repeat order is placed
#    Given Login with the valid credentials
#    And Add the customer and the Customer Number is <CustomerNum>
#    Then Click the Attached Customer
#    And Select the options from the previous order
#    Then Click the Repeat Order button
#    And Verify the SKU Code for all the listed item
#    And Complete the payment using fast cash button
#    Then Click the Logoff button
#    Examples:
#      | CustomerNum |
#      | 123456      |
#
#  Scenario: Verify the quantity if user selects any number from notepad in order screen
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen Single item
#    And verify the quantity of the menu item
#    Then Get the Quantity and should be more than one
#    And verify the quantity of the menu item
#    Then Quantity should change up to increased quantity
#    And Complete the payment using fast cash button
#    And Click the Logoff button

#  Scenario: Verify if item discount is allowed for reopen check
#    Given Login with the valid credentials
#    Then Page will navigate to the retail order screen
#    Then Order the Standard Item from the retail Screen
#    And Get the Check number from the retail screen
#    Then Get the menu items,total and quantity from the retail screen
#    And Get the Subtotal amount
#    And Get the Tax amount
#    Then Get the Total amount
#    And Get the Paid amount
#    Then Get the Balance amount
#    And Get the Tax, Discount,Gratuity and service charge
#    And Complete the payment using fast cash button
#    And Click the sale history
#    Then Screen will navigate to Receipt-Check Status screen
#    And select the required check
#    Then Click the Reopen Check button
#    When Retail order screen will get displayed with placed Standard retail item without any changes
#    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
#    And Click the Discount Option from the given options
#    Then Click the "IBD_AT_AMT" discount and warning "Paid amount exceeds the sale amount" should be displayed
#    And Click the cancel button
#    And Click the Payment option
#    Then Select the Paid amount from the Payment screen
#    Then Click the Delete button from the Payment screen
#    And Click the Back button from the Payment Screen
#    And Click the Discount Option from the given options
#    Then Click the "IBD_AT_AMT" discount
#    And Complete the payment using fast cash button
#    And Click the Logoff button
#
#  Scenario: Verify the options in Till Management - Till screen
#    Given Login with the valid credentials
#    Then Page will navigate to the retail order screen
#    And Able to view the Operation button
#    When Click the Settings icon from the Retail Screen
#    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
#    When Click the Operation button
#    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
#    And Click the Till Management option
#    Then Check the Till Management screen is displayed or not
#    And Check the Till option is displayed or not and it should selected by default
#    And Check the Set Till option is displayed or not and it should selected by default
#    Then Check the Active Till option is displayed or not
#    And Check the Held Till option is displayed or not
#    Then Check the Closed Till option is displayed or not
#    Then Check the Cash Drop option is displayed or not
#    And Click the Reports option and it should be selected
#    Then Click the Cashier Out button
#    And Check the Yes and No button should be displayed
#    And Click the No button
#    Then Click the Menu option
#    And Click the POS option
#    Then Click the Logoff button

  Scenario: Verify if number is selected from number pad, Please select any one menu item pop up appears
    Given Login with the valid credentials
    And verify the quantity of the menu item
    Then "Please select any one item." pop up will appear
    And Click the Logoff button
