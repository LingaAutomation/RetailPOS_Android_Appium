
Feature: Sale History

  #Closed - 28
  #Void - 23
  #Parked - 25
  #Refund - 30
  #Exchange - 21
  #Layaways - 23

  Scenario Outline: Verify if no closed receipts is found in closed sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Closed tab is selected by default
    When <Msg> message should be displayed when there is no checks available in Closed Tab
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | Msg                |
      | No Closed Receipts |

  Scenario Outline: Verify if no Void receipts is found in Void sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select void tab from sale history screen
    When <Msg> message should be displayed when there is no checks available in Void Tab
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | Msg              |
      | No Void Receipts |

  Scenario Outline: Verify if no Parked receipts is found in Parked sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Parked tab from sale history screen
    When <Message> message should be displayed when there is no checks available
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | Message            |
      | No Parked Receipts |

  Scenario Outline: Verify if no Refunded receipts is found in Refunded sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Refunded tab from sale history screen
    When <Message> message should be displayed when there is no checks available in the Refunded tab
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | Message              |
      | No Refunded Receipts |

  Scenario Outline: Verify if no Exchanged receipts is found in Refunded sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    When Click the sale history
#    Then Screen will navigate to Check Status screen
    Then Select Exchanged tab from sale history screen
    When <Message> should be displayed in empty Exchanged tab
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | Message               |
      | No Exchanged Receipts |

  Scenario Outline: Verify if no Layaways receipts is found in Refunded sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    Then Select Layaways tab from sale history screen
    When <Message> message should be displayed when there is no checks available in LayAways tab
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | Message             |
      | No Layaway Receipts |

  #1
  Scenario: Verify able to select sale history button from retail order screen at the bottom
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen below All Orders
    And Click the retail button
    And Click the Logoff button

    #2
  Scenario: Verify by default closed tab is selected if sale history button is selected from retail order screen at the bottom
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Closed tab is selected by default
    And Fields such as Search Date and Receipt No is present parallel at the right end
    And Click the retail button
    And Click the Logoff button
#3
  Scenario: Verify the buttons present at the bottom of Closed tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Closed tab is selected by default
    And Buttons such as Re-Open Receipt, Return, Re-Print Receipt and Operation is present at the bottom
    And Click the retail button
    And Click the Logoff button
#4
  Scenario:Verify the fields displayed at the bottom of Closed tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Closed tab is selected by default
    And Fields such as Receipt Total, Customer, Average Duration and Average Amount is present at the bottom
    And Click the retail button
    And Click the Logoff button
#5
  Scenario: Verify the columns displayed in Closed Receipt Status tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Closed tab is selected by default
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
    And Click the retail button
    And Click the Logoff button
#6
  Scenario Outline: Verify the Customer column if customer is attached for that closed receipt in closed tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    When Add the customer and the Customer Number is <CustomerNum>
    Then Get the Customer Name from the retail screen
    And Get the Check number from the retail screen
#    And click the Refund all button
    Then Order the Standard Item from the retail Screen
    And Complete the payment using cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Closed tab is selected by default
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
    Then View the Customer column in which customer name is displayed
    And Click the retail button
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |
#7
  Scenario: Verify the Customer column in closed tab if customer is not attached
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Place the Multiple retail standard item with Inclusive tax
    And Get the Check number from the retail screen
    Then Complete the payment using Others button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Closed tab is selected by default
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
    Then View the Customer column for that closed Receipt in which customer is displayed as Walkin
    And Click the retail button
    And Click the Logoff button
#8
  Scenario: Verify the Receipt No Column in closed sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Place the Multiple retail Variant item with Inclusive tax
    And Get the Check number from the retail screen
    Then Complete the payment using Side CC button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
    And Verify the Closed Check from the Sale history screen
    And Click the retail button
    And Click the Logoff button
#9
  Scenario:Verify the Date Column in closed sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Get the current date
    And Place the Multiple retail Variant item with Exclusive tax
    And Get the Check number from the retail screen
    Then Complete the payment using cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
    And Date Column is displayed in which dd-MMM-yyyy format is shown
    And Click the retail button
    And Click the Logoff button
#10
  Scenario: Verify the Time Column in closed sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Get the current time
    Then Get the current date and time
    And Place the Multiple retail Variant item with Inclusive tax
    And Get the Check number from the retail screen
#    Then Place the Multiple retail KitAssembly item with Inclusive tax
    Then Complete the payment using cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
    And Time Column is displayed in which twenty four HH:mm format is shown
    And Click the retail button
    And Click the Logoff button
#11
  Scenario: Verify the Cashier Column in closed sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Order the Variant item from the retail Screen
    And Get the Check number from the retail screen
#    Then Order the Kit Assembly item from the retail Screen
    Then Complete the payment using Others button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
    And Cashier Column is displayed in which user name is shown below
    And Click the retail button
    And Click the Logoff button
#12
  Scenario Outline: Verify the Total Column in closed sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Order the Multiple Variant item for the tax on Item tax
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Complete the payment using gift card button and the card number is <CardNumber>
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
    And Total Column is displayed in which total amount of that closed receipt is shown below
    And Click the retail button
    And Click the Logoff button
    Examples:
      | CardNumber |
      | 1234       |
#13
  Scenario: Verify able to view the receipt from closed tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Closed tab is selected by default
    And Select the closed receipt and click the receipt button displayed near Total Value
    When Digital receipt with Store Details, Order summary, Tax Summary and Grand Total
    Then Click the Back Arrow button from the receipt screen
    And Click the retail button
    And Click the Logoff button
#14
  Scenario: Verify the Store Details fields if Receipt is clicked from Closed tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Closed tab is selected by default
    And Select the closed receipt and click the receipt button displayed near Total Value
    When Digital receipt with Store Details, Order summary, Tax Summary and Grand Total
    When View the Store Details fields at the top such as back navigation symbol, Store Name and Customer at first row
    And Displays Table-No, Receipt No, Server and Date with Time
    Then Click the Back Arrow button from the receipt screen
    And Click the retail button
    And Click the Logoff button
#15
  Scenario: Verify the fields under Order Summary if Receipt symbol is clicked from Closed tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    Then Get the menu items,total and quantity from the retail screen
    And Get the Total amount
    And Get the Subtotal amount
    And Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Closed tab is selected by default
    And Select the closed receipt and click the receipt button displayed near Total Value
    When Digital receipt with Store Details, Order summary, Tax Summary and Grand Total
    When View the fields under Order Summary such as placed retail items with quantity and price value in vertical order
    Then Shows Subtotal with value and Total with value below the retail items in order summary
    Then Click the Back Arrow button from the receipt screen
    And Click the retail button
    And Click the Logoff button

#16
  Scenario: Verify the fields under Tax Summary if Receipt symbol is clicked from Closed tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Order the Standard Item from the retail Screen - with service charge
    Then Get the Check number from the retail screen
    And Get the Tax, Discount,Gratuity and service charge
    And Get the Total amount
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Closed tab is selected by default
    And Select the closed receipt and click the receipt button displayed near Total Value
    When Digital receipt with Store Details, Order summary, Tax Summary and Grand Total
    When View the fields under Tax Summary such as Total Tax, Gratuity, Discount, Service Charge with Values for all fields in vertical order
    Then Shows Grand Total with value and Total with value below the Tax summary at the bottom
    Then Click the Back Arrow button from the receipt screen
    And Click the retail button
    And Click the Logoff button
#17
  Scenario: Verify the barcode symbol at the bottom if Receipt is clicked from Closed tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Closed tab is selected by default
    And Select the closed receipt and click the receipt button displayed near Total Value
    When Digital receipt with Store Details, Order summary, Tax Summary and Grand Total
    When View the barcode symbol at the bottom if Receipt with Node number, hifen symbol,ddmmyy and ReceiptNumber
    Then Click the Back Arrow button from the receipt screen
    And Click the retail button
    And Click the Logoff button
#18
  Scenario: Verify the Notes displayed at the end if Receipt is clicked from closed sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Closed tab is selected by default
    And Select the closed receipt and click the receipt button displayed near Total Value
    When Digital receipt with Store Details, Order summary, Tax Summary and Grand Total
    Then View the Notes displayed - Have a nice day, Visit us again
    Then Click the Back Arrow button from the receipt screen
    And Click the retail button
    And Click the Logoff button
#19
#  Scenario Outline: Verify if no closed receipts is found in closed sale history tab
#    Given Login with the valid credentials
#    Then Page will navigate to the retail order screen
#    And Click the sale history
#    Then Screen will navigate to Receipt-Check Status screen
#    When Closed tab is selected by default
#    When <Msg> message should be displayed when there is no checks available in Closed Tab
#    Then Click the retail button
#    And Click the Logoff button
#    Examples:
#      | Msg                |
#      | No Closed Receipts |

#20
  Scenario: Verify if Search Date field is selected from closed sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Closed tab is selected by default
    And Select the Search Date in which Calendar symbol is shown
    When Calendar is displayed with Month, Days and Date view
    And Select the Search Date in which Calendar symbol is shown
    And Click the retail button
    And Click the Logoff button
#21
  Scenario: Verify the data's displayed in Search Date Calendar from closed sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Closed tab is selected by default
#    And Select the Search Date
#    When Calendar symbol is clicked
#    Then Calendar view will get displayed
    And Select the Search Date in which Calendar symbol is shown
    When Calendar is displayed with Month, Days and Date view
    When User can view Month along with current year dropdown, Backward and Forward navigation arrow
    Then Days of week should be displayed in next line of the Month and Year as S M T W T F S
    And View the current month with available number of days
    And Select the Search Date in which Calendar symbol is shown
    And Click the retail button
    And Click the Logoff button
#22
  Scenario: Verify the enabled days if calendar is clicked from search date from closed sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Closed tab is selected by default
#    And Select the Search Date
#    When Calendar symbol is clicked
#    Then Calendar view will get displayed
    And Select the Search Date in which Calendar symbol is shown
    When Calendar is displayed with Month, Days and Date view
    When User can view Month along with current year dropdown, Backward and Forward navigation arrow
    Then Days of week should be displayed in next line of the Month and Year as S M T W T F S
    And View the current month with available number of days
    When Dates are shown as enabled till current date
    And Remaining dates are shown disabled
    And Select the Search Date in which Calendar symbol is shown
    Then Click the retail button
    And Click the retail button
    And Click the Logoff button
#23
  Scenario: Verify able to search the Receipt in Receipt No field from closed sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Order the Standard Item from the retail Screen
    And Get the Check number from the retail screen
    And Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Closed tab is selected by default
    And Select the Receipt No field
    When Enter single digit numerical value
    Then Displays result based on the search in Receipt No
    And Click the retail button
    And Click the Logoff button
#24
  Scenario: Verify able to enter alphabets in Receipt No field from closed sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Order the Standard Item from the retail Screen
    And Get the Check number from the retail screen
    And Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Closed tab is selected by default
    And Select the Receipt No field
    When Enter the alphabetic values in Receipt No field
    Then But no result will be displayed
    And Click the retail button
    And Click the Logoff button
#25
  Scenario Outline: Verify if Re-Open Receipt button is clicked from closed sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Order the Standard Item from the retail Screen
    And Get the Check number from the retail screen
    Then Get the menu items,total and quantity from the retail screen
    And Get the Total amount
    Then Get the Paid amount
    And Get the Balance amount
    Then Get the Subtotal amount
    And Get the Tax, Discount,Gratuity and service charge
    And Complete the payment using gift card button and the card number is <CardNumber>
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
#    And Select that closed receipt and click on Re-Open Receipt button
    And select the required check
    Then Click the Reopen Check button
    When Retail order screen will get displayed with placed Standard retail item without any changes
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    And Click the Payment option
    Then Click on Submit button from payment method screen
    And Click the Logoff button

    Examples:
      | CardNumber |
      | 1234       |
#26
  Scenario: Verify if Return button is clicked
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    Then Place Standard retail item which includes both Item and Check tax
    Then Order the Standard Item from the retail Screen
    And Get the Check number from the retail screen
    Then Get the menu items,total and quantity from the retail screen
    And Get the Total amount
    Then Get the Paid amount
    And Get the Balance amount
    Then Get the Subtotal amount
    And Get the Tax, Discount,Gratuity and service charge
    And Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
#        And select the required check
    And click the return button
    And click the return button
    When Retail order screen will get displayed with placed Standard retail item without any changes
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    When Cancel, Refund Items, Refund All and Exchange button is shown at the bottom
    And Click the cancel button
    And Click the retail button
    And Click the Logoff button
#27
  Scenario: Verify able to view Re-Print Receipt button in closed sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    Then Place Standard retail item which includes both Item and Check tax
#    And Complete the payment using Cash
    Then Order the Standard Item from the retail Screen
    And Get the Check number from the retail screen
    And Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And Select that closed receipt and view Re-Print Receipt button
    And Click the retail button
    And Click the Logoff button
#28
  Scenario:Verify if Operation button is clicked in closed sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Order the Standard Item from the retail Screen
    And Get the Check number from the retail screen
    And Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And Click on Operation button
    When Fields under operation will be displayed such as POS, Till Management, Print labels, Process Offline
    And Continued with Hardware Settings, POS Settings, Close Day, Sync Back Office and Upgrade To New Version
    Then Click the POS option
    And Click the Logoff button

#Void Sale history Screen
#1
  Scenario: Verify able to view Void tab in sale history screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Closed tab is selected by default along with Void, Parked, Refunded, Exchanged and Layaways
    Then View the Void tab in sale history screen
    And Click the retail button
    And Click the Logoff button
#2
  Scenario: Verify the buttons present at the bottom of Void tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select void tab from sale history screen
    Then View the buttons shown below such as Re-Print Receipt and Operation button
    And Click the retail button
    And Click the Logoff button
#3
  Scenario: Verify the fields displayed at the bottom of Void tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select void tab from sale history screen
    And Fields such as Receipt Total, Customer, Average Duration and Average Amount is present at the bottom based on the receipts
    And Click the retail button
    And Click the Logoff button
#4
  Scenario: Verify the columns displayed in Void sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select void tab from sale history screen
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
    And Click the retail button
    And Click the Logoff button
#5
  Scenario Outline: Verify able to void the closed receipt
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
    When select the required check
    And Click the retail button
    And Click the Logoff button

    Examples:
      | CustomerNum | Msg            |
      | 123456      | Sale is voided |

#6
  Scenario Outline: Verify the Customer column in Void tab if customer is not attached
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    Then Place Variant retail item with item tax, Gratuity and complete the payment using cash
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
    When select the required check
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
#    Then Select receipt from void tab in which customer is not attached
    Then View the Customer column for that Void Receipt in which customer is displayed as Walkin
    And Click the retail button
    And Click the Logoff button
    Examples:
      | Msg            |
      | Sale is voided |

#7
  Scenario Outline: Verify the Customer column if customer is attached for that Void receipt in Void tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    When Attach Customer in retail order screen
    When Add the customer and the Customer Number is <CustomerNum>
    Then Get the Customer Name from the retail screen
#    Then Place Variant retail item with item tax, item service charge and complete the payment using cash
    And Order the Standard Item from the retail Screen - with service charge
    Then Get the Check number from the retail screen
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
#    When select the required check
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
#    Then Select receipt in which customer is attached from Void tab
#    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total is shown under Void Tab
    Then View the Customer column in which customer name is displayed
    And Click the retail button
    And Click the Logoff button
    Examples:
      | CustomerNum | Msg            |
      | 123456      | Sale is voided |
#8
  Scenario Outline: Verify the Receipt No Column in Void sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Order the Multiple Standard item for the tax on Item tax
    And Get the Check number from the retail screen
    Then Complete the payment using fast cash button
#    Then Place Kit/Assembly retail item with item tax and complete the payment using cash
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
    When select the required check
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
    Then Verify the void check in the void tab
    And Click the retail button
    And Click the Logoff button
    Examples:
      | Msg            |
      | Sale is voided |
#9
  Scenario Outline: Verify the Date Column in Void sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    Then Place Kit/Assembly retail item with item tax and item service charge and complete the payment using cash
    And Order the Standard Item from the retail Screen - with service charge
    Then Get the Check number from the retail screen
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
    When select the required check
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
    And Date Column is displayed in which dd-MMM-yyyy format is shown
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | Msg            |
      | Sale is voided |
#10
  Scenario Outline: Verify the Time Column in Void sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    Then Place Variant retail item with item tax with item service charge and complete the payment using cash
    And Get the current time
    And Get the current date and time
    Then Order the Standard Item from the retail Screen - with service charge
    Then Get the Check number from the retail screen
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
    When select the required check
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
    And Time Column is displayed in which twenty four HH:mm format is shown
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | Msg            |
      | Sale is voided |
#11
  Scenario Outline: Verify the Cashier Column in Void sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    Then Place Variant retail item with inclusive tax and discount and complete the payment using cash
    Then Place the Multiple retail Variant item with Inclusive tax
    Then Click the Option from the retail screen
    And Click the Discount Option from the given options
    And Click the <Discount_Name> after tax - item based tax
    And Calculate the Item Based Discount for the <Discount> percentage with After Tax
    Then Get the Check number from the retail screen
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
    When select the required check
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
    And Cashier Column is displayed in which user name is shown below
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | Msg            | Discount_Name | Discount |
      | Sale is voided | IBD1          | 5        |
#12
  Scenario Outline: Verify the Total Column in Void sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    Then Place Variant retail item with item and check tax with discount and complete the payment using cash
    Then Order the Multiple Variant item for the check based tax
    Then Click the Option from the retail screen
    And Click the Discount Option from the given options
    And Click the <Discount_Name> after tax - item based tax
    And Calculate the Item Based Discount for the <Discount> percentage with After Tax
    Then Get the Check number from the retail screen
    Then Get the Total amount
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
    When select the required check
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
    And Total Column is displayed in which total amount of that void receipt is shown below
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | Msg            | Discount_Name | Discount |
      | Sale is voided | IBD1          | 5        |
#13
#  Scenario Outline: Verify if no Void receipts is found in Void sale history tab
#    Given Login with the valid credentials
#    Then Page will navigate to the retail order screen
#    And Click the sale history
#    Then Screen will navigate to Receipt-Check Status screen
#    When Select void tab from sale history screen
#    When <Msg> message should be displayed when there is no checks available in Void Tab
#    Then Click the retail button
#    And Click the Logoff button
#    Examples:
#      | Msg              |
#      | No Void Receipts |
#14
  Scenario Outline: Verify the Store Details fields if Receipt is clicked from Void sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    Then Place Kit/Assembly retail item with item and check tax with discount and complete the payment using cash
    Then Order the Single Variant item for the check based tax
    Then Click the Option from the retail screen
    And Click the Discount Option from the given options
    And Click the <Discount_Name> after tax - item based tax
    And Calculate the Item Based Discount for the <Discount> percentage with After Tax
    Then Get the Check number from the retail screen
    Then Get the Total amount
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
    When select the required check
    And Click the receipt button displayed near Total Value
    When Digital receipt with Store Details, Order summary, Tax Summary and Grand Total
    When View the Store Details fields at the top such as back navigation symbol, Store Name and Customer at first row
    And Displays Table-No, Receipt No, Server and Date with Time
    Then Click the Back Arrow button from the receipt screen
    And Click the retail button
    And Click the Logoff button
    Examples:
      | Msg            | Discount_Name | Discount |
      | Sale is voided | IBD1          | 5        |
#15
  Scenario Outline: Verify the fields under Order Summary if Receipt symbol is clicked from Void tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Order the Multiple Standard item for the check based tax
#    Then Place Standard retail item with item and check tax with discount and complete the payment using cash
    Then Click the Option from the retail screen
    And Click the Discount Option from the given options
    And Click the <Discount_Name> after tax - item based tax
    And Calculate the Item Based Discount for the <Discount> percentage with After Tax
    Then Get the Check number from the retail screen
    Then Get the menu items,total and quantity from the retail screen
    And Get the Total amount
    And Get the Subtotal amount
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
    When select the required check
    And Click the receipt button displayed near Total Value
    When Digital receipt with Store Details, Order summary, Tax Summary and Grand Total
    When View the fields under Order Summary such as placed retail items with quantity and price value in vertical order in Void tab
    Then Shows Subtotal with value and Total with value below the retail items in order summary
    Then Click the Back Arrow button from the receipt screen
    And Click the retail button
    And Click the Logoff button
    Examples:
      | Msg            | Discount_Name | Discount |
      | Sale is voided | IBD1          | 5        |
#16
  Scenario Outline: Verify the fields under Order Summary if Receipt symbol is clicked from Void tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    Then Place Standard retail item with item and with discount and complete the payment using cash
    Then Order the Multiple Standard item for the tax on Item tax
    Then Click the Option from the retail screen
    And Click the Discount Option from the given options
    And Click the <Discount_Name> after tax - item based tax
    And Calculate the Item Based Discount for the <Discount> percentage with After Tax
    Then Get the Check number from the retail screen
    Then Get the menu items,total and quantity from the retail screen
    And Get the Total amount
    And Get the Subtotal amount
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
    When select the required check
    And Click the receipt button displayed near Total Value
    When Digital receipt with Store Details, Order summary, Tax Summary and Grand Total
    When View the fields under Order Summary such as placed retail items with quantity and price value in vertical order in Void tab
    Then Shows Subtotal with value and Total with value below the retail items in order summary
    Then Click the Back Arrow button from the receipt screen
    And Click the retail button
    And Click the Logoff button
    Examples:
      | Msg            | Discount_Name | Discount |
      | Sale is voided | IBD1          | 5        |
#17
  Scenario Outline: Verify the fields under Tax Summary if Receipt symbol is clicked from Void tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    Then Place Standard retail item with check tax, Gratuity with discount and complete the payment using cash
    Then Order the Multiple Standard item for the tax on Item tax
    Then Click the Option from the retail screen
    And Click the Discount Option from the given options
    And Click the <Discount_Name> after tax - item based tax
    And Calculate the Item Based Discount for the <Discount> percentage with After Tax
    Then Get the Check number from the retail screen
    Then Get the menu items,total and quantity from the retail screen
    And Get the Total amount
    And Get the Subtotal amount
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
    When select the required check
    And Click the receipt button displayed near Total Value
    When Digital receipt with Store Details, Order summary, Tax Summary and Grand Total
    When View the fields under Tax Summary such as Total Tax, Gratuity, Discount, Service Charge with Values for all fields in vertical order
    Then Shows Grand Total with value and Total with value below the Tax summary at the bottom
    Then Click the Back Arrow button from the receipt screen
    And Click the retail button
    And Click the Logoff button
    Examples:
      | Msg            | Discount_Name | Discount |
      | Sale is voided | IBD1          | 5        |
#18
  Scenario Outline: Verify the barcode symbol at the bottom if Receipt is clicked from Void tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    Then Place Kit/Assembly retail item with item and check tax with discount and complete the payment using cash
    And Order the Multiple Standard item for the check based tax
    Then Click the Option from the retail screen
    And Click the Discount Option from the given options
    And Click the <Discount_Name> after tax - item based tax
    And Calculate the Item Based Discount for the <Discount> percentage with After Tax
    Then Get the Check number from the retail screen
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
    When select the required check
    And Click the receipt button displayed near Total Value
    When Digital receipt with Store Details, Order summary, Tax Summary and Grand Total
    When View the barcode symbol at the bottom if Receipt with Node number, hifen symbol,ddmmyy and ReceiptNumber
    Then Click the Back Arrow button from the receipt screen
    And Click the retail button
    And Click the Logoff button
    Examples:
      | Msg            | Discount_Name | Discount |
      | Sale is voided | IBD1          | 5        |
#19
  Scenario Outline: Verify the Notes displayed at the end if Receipt is clicked from Void sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    Then Place Variant retail item with item, Tax on item tax with discount and complete the payment using cash
    Then Order the Multiple Variant item for the tax on Item tax
    Then Click the Option from the retail screen
    And Click the Discount Option from the given options
    And Click the <Discount_Name> after tax - item based tax
    And Calculate the Item Based Discount for the <Discount> percentage with After Tax
    Then Get the Check number from the retail screen
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
    When select the required check
    And Click the receipt button displayed near Total Value
    When Digital receipt with Store Details, Order summary, Tax Summary and Grand Total
    Then View the Notes displayed - Have a nice day, Visit us again
    Then Click the Back Arrow button from the receipt screen
    And Click the retail button
    And Click the Logoff button
    Examples:
      | Msg            | Discount_Name | Discount |
      | Sale is voided | IBD1          | 5        |
#20
  Scenario Outline: Verify able to search the Receipt in Receipt No field from Void sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    Then Place Kit/Assembly retail item with item with discount and complete the payment using cash
    Then Place the Multiple retail Variant item with Exclusive tax
    Then Click the Option from the retail screen
    And Click the Discount Option from the given options
    And Click the <Discount_Name> after tax - item based tax
    And Calculate the Item Based Discount for the <Discount> percentage with After Tax
    Then Get the Check number from the retail screen
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
    When select the required check
    And Select the Receipt No field
    When Enter single digit numerical value
    Then Displays result based on the search in Receipt No
    And Click the retail button
    And Click the Logoff button
    Examples:
      | Msg            | Discount_Name | Discount |
      | Sale is voided | IBD1          | 5        |
#21
  Scenario Outline: Verify able to enter alphabets in Receipt No field from Void sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    Then Place Variant retail item with item and check tax with tax exempt and complete the payment using cash
    Then Order the Multiple Variant item for the check based tax
    And Complete the payment using fast cash button
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
#    Then Select that voided receipt from Void tab
    And Select the Receipt No field
    When Enter the alphabetic values in Receipt No field
    And Click the retail button
    And Click the Logoff button
    Examples:
      | Msg            |
      | Sale is voided |
#22
  Scenario Outline: Verify able to view Re-Print Receipt button in Void sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    Then Place Variant retail item with check tax with discount and complete the payment using cash
    Then Order the Multiple Variant item for the check based tax
    Then Click the Option from the retail screen
    And Click the Discount Option from the given options
    And Click the <Discount_Name> after tax - item based tax
    And Calculate the Item Based Discount for the <Discount> percentage with After Tax
    Then Get the Check number from the retail screen
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
    When select the required check
    And View Re-Print Receipt button
    And Click the retail button
    And Click the Logoff button
    Examples:
      | Msg            | Discount_Name | Discount |
      | Sale is voided | IBD1          | 5        |
#23
  Scenario Outline:Verify if Operation button is clicked in Void sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    Then Place Standard retail item with item tax, Gratuity with discount and complete the payment using cash
    And Order the Standard Item from the retail Screen
    Then Click the Option from the retail screen
    And Click the Discount Option from the given options
    And Click the <Discount_Name> after tax - item based tax
    And Calculate the Item Based Discount for the <Discount> percentage with After Tax
    Then Get the Check number from the retail screen
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
    When select the required check
    And Click on Operation button
    When Fields under operation will be displayed such as POS, Till Management, Print labels, Process Offline
    And Continued with Hardware Settings, POS Settings, Close Day, Sync Back Office and Upgrade To New Version
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | Msg            | Discount_Name | Discount |
      | Sale is voided | IBD1          | 5        |

    #Parked Sale history Screen
#1
  Scenario: Verify able to view Parked tab in sale history screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Closed tab is selected by default along with Void, Parked, Refunded, Exchanged and Layaways
    Then View Parked tab
    And Click the Logoff button
#2
  Scenario: Verify the buttons present at the bottom of Void tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Parked tab from sale history screen
    Then View the buttons shown below such as Pay Receipt and Open Receipt button
    And Click the Logoff button
#3
  Scenario: Verify the fields displayed at the bottom of Parked tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Parked tab from sale history screen
    And Fields such as Receipt Total and Average Amount is present at the bottom based on the receipts
    And Click the Logoff button
#4
  Scenario: Verify the columns displayed in Parked sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Parked tab from sale history screen
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
    And Click the Logoff button
#5
  Scenario:Verify able to view the Park Sale option in retail order screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Check the Park Sale button is available or not in the Retail Screen
#    Then Park Sale option is shown near Sale History option
    And Click the Logoff button
#6
  Scenario:Verify able to view Park Sale screen if Park Sale option is clicked from retail order screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Order the Standard Item from the retail Screen
    And Click the park button in ordering screen
    And verify popup title park sale
    Then Click the cancel button
    And Void the Ordered items from the Retail Screen
    And Click the Logoff button
#7
  Scenario:Verify the buttons and description in Park Sale screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Order the Standard Item from the retail Screen
    And Click the park button in ordering screen
    And verify popup title park sale
    And verify popup content as Please specify the reason to park sale
    And Verify popup in reason in watermark
    And Verify popup Cancel button placed left corner
    And Verify popup Park button placed right corner
    Then Click the cancel button
    And Void the Ordered items from the Retail Screen
    And Click the Logoff button
#8
  Scenario Outline:Verify if Park Sale button is clicked without adding retail items in retail order screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the park button in ordering screen
    Then <Msg> along with Done button will appear
    And Click the Logoff button
    Examples:
      | Msg                                   |
      | You have to order before parking Sale |
#9
  Scenario Outline:Verify if Park button is clicked without entering any reason
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Order the Standard Item from the retail Screen
    And Click the park button in ordering screen
    And verify popup title park sale
    And verify popup content as Please specify the reason to park sale
    And Verify popup in reason in watermark
    And Verify popup Cancel button placed left corner
    And Verify popup Park button placed right corner
    When Park button is clicked
    Then <Msg> along with Done button will appear
    Then Click the cancel button
    And Void the Ordered items from the Retail Screen
    And Click the Logoff button
    Examples:
      | Msg                            |
      | Please enter reason to proceed |
#10
  Scenario Outline:Verify able to view pop up if a sale is Parked in retail order screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    Then Place Kit/Assembly retail item with item tax
    Then Order the Standard Item from the retail Screen
    And Click the park button in ordering screen
    And verify popup title park sale
    And verify popup content as Please specify the reason to park sale
    And Verify popup in reason in watermark
    And Verify popup Cancel button placed left corner
    And Verify popup Park button placed right corner
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And  Click the Logoff button
    Examples:
      | Message        |
      | Sale is parked |
#11
  Scenario Outline:Verify able to view receipt in Parked tab sale history screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Order the Standard Item from the retail Screen and Inclusive tax
    Then Get the Check number from the retail screen
    And Click the park button in ordering screen
    And verify popup title park sale
    And verify popup content as Please specify the reason to park sale
    And Verify popup in reason in watermark
    And Verify popup Cancel button placed left corner
    And Verify popup Park button placed right corner
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Parked tab from sale history screen
    And select the required check
    Then Verify the Parked check in the parked tab
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | Message        |
      | Sale is parked |
#12
  Scenario Outline:Verify if Pay Receipt button is clicked in Parked tab sale history screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Order the Variant item from the retail Screen
    Then Get the Check number from the retail screen
    And Click the park button in ordering screen
    And verify popup title park sale
    And verify popup content as Please specify the reason to park sale
    And Verify popup in reason in watermark
    And Verify popup Cancel button placed left corner
    And Verify popup Park button placed right corner
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Parked tab from sale history screen
    And select the required check
    And Click on Pay receipt button in Parked sale history screen
    When Payment screen will get displayed with configured payment methods
    Then Select any payment method to complete the payment
    And Click on Submit button from payment method screen
    And Click the Logoff button
    Examples:
      | Message        |
      | Sale is parked |
#13
  Scenario Outline:Verify if Open Receipt button is clicked in Parked tab sale history screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Place the Multiple retail Variant item with Inclusive tax
    Then Get the Check number from the retail screen
    Then Get the menu items,total and quantity from the retail screen
    And Click the park button in ordering screen
    And verify popup title park sale
    And verify popup content as Please specify the reason to park sale
    And Verify popup in reason in watermark
    And Verify popup Cancel button placed left corner
    And Verify popup Park button placed right corner
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Parked tab from sale history screen
    And select the required check
    And Click on Open Receipt button in Parked sale history screen
    Then Able to view Parked items in retail order screen
    Then Complete the payment using fast cash button
    And Click the Logoff button
    Examples:
      | Message        |
      | Sale is parked |
#14
  Scenario Outline: Verify the Customer column in Parked tab if customer is not attached
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    Then Place Kit/Assembly retail item with item tax
    Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Click the park button in ordering screen
    And verify popup title park sale
    And verify popup content as Please specify the reason to park sale
    And Verify popup in reason in watermark
    And Verify popup Cancel button placed left corner
    And Verify popup Park button placed right corner
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Parked tab from sale history screen
    And select the required check
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
    When View the customer column which displays Customer as Walkin
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | Message        |
      | Sale is parked |
#15
  Scenario Outline: Verify the Customer column if customer is attached for that Parked receipt in Parked sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    Then Place Kit/Assembly retail item with inclusive tax
    And Add the customer and the Customer Number is <CustomerNum>
    Then Get the Customer Name from the retail screen
    Then Place the Multiple retail Variant item with Inclusive tax
    Then Get the Check number from the retail screen
    And Click the park button in ordering screen
    And verify popup title park sale
    And verify popup content as Please specify the reason to park sale
    And Verify popup in reason in watermark
    And Verify popup Cancel button placed left corner
    And Verify popup Park button placed right corner
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Parked tab from sale history screen
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
    Then View the Customer column in which customer name is displayed
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | Message        | CustomerNum |
      | Sale is parked | 123456      |
#16
  Scenario Outline: Verify the Receipt No Column in Parked sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    Then Place Kit/Assembly retail item with item tax and item service charge
    Then Order the Standard Item from the retail Screen - with service charge
    Then Get the Check number from the retail screen
    And Click the park button in ordering screen
    And verify popup title park sale
    And verify popup content as Please specify the reason to park sale
    And Verify popup in reason in watermark
    And Verify popup Cancel button placed left corner
    And Verify popup Park button placed right corner
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Parked tab from sale history screen
    And select the required check
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
    And Able to view the Receipt No under Receipt No column in Parked sale history tab
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | Message        |
      | Sale is parked |
#17
  Scenario Outline: Verify the Date Column in Parked sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Add the customer and the Customer Number is <CustomerNum>
#    Then Place Kit/Assembly retail item with item tax and gratuity with item discount
    Then Order the Standard Item from the retail Screen
    Then Click the Option from the retail screen
    And Click the Discount Option from the given options
    And Click the <Discount_Name> after tax - item based tax
    And Calculate the Item Based Discount for the <Discount> percentage with After Tax
    Then Get the Check number from the retail screen
    And Click the park button in ordering screen
    And verify popup title park sale
    And verify popup content as Please specify the reason to park sale
    And Verify popup in reason in watermark
    And Verify popup Cancel button placed left corner
    And Verify popup Park button placed right corner
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Parked tab from sale history screen
    And select the required check
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
    And Date Column is displayed in which dd-MMM-yyyy format is shown
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | CustomerNum | Discount_Name | Discount | Message        |
      | 123456      | IBD1          | 5        | Sale is parked |
#18
  Scenario Outline: Verify the Time Column in Parked sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    Then Place Variant retail item with item tax and gratuity with item discount
    And Get the current time
    Then Get the current date and time
    Then Place the Multiple retail Variant item with Exclusive tax
    Then Click the Option from the retail screen
    And Click the Discount Option from the given options
    And Click the <Discount_Name> after tax - item based tax
    And Calculate the Item Based Discount for the <Discount> percentage with After Tax
    Then Get the Check number from the retail screen
    And Click the park button in ordering screen
    And verify popup title park sale
    And verify popup content as Please specify the reason to park sale
    And Verify popup in reason in watermark
    And Verify popup Cancel button placed left corner
    And Verify popup Park button placed right corner
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Parked tab from sale history screen
    And select the required check
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
    And Time Column is displayed in which twenty four HH:mm format is shown
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | Discount_Name | Discount | Message        |
      | IBD1          | 5        | Sale is parked |
#19
  Scenario Outline: Verify the Cashier Column in Parked sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    Then Place Standard retail item with check tax and gratuity along with item discount
    Then Order the Multiple Standard item for the check based tax
    Then Click the Option from the retail screen
    And Click the Discount Option from the given options
    And Click the <Discount_Name> after tax - item based tax
    And Calculate the Item Based Discount for the <Discount> percentage with After Tax
    Then Get the Check number from the retail screen
    And Click the park button in ordering screen
    And verify popup title park sale
    And verify popup content as Please specify the reason to park sale
    And Verify popup in reason in watermark
    And Verify popup Cancel button placed left corner
    And Verify popup Park button placed right corner
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Parked tab from sale history screen
    And select the required check
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
    And Cashier Column is displayed in which user name is shown below
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | Discount_Name | Discount | Message        |
      | IBD1          | 5        | Sale is parked |
#20
  Scenario Outline: Verify the Total Column in Parked sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    Then Place Standard retail item with item tax in which tax is exempted with discount
    And Order the Standard Item from the retail Screen
    Then Click the Option from the retail screen
    And Select the Tax Exempt option from the given options
    Then Click the Option from the retail screen
    And Click the Discount Option from the given options
    And Click the <Discount_Name> after tax - item based tax
    And Calculate the Item Based Discount for the <Discount> percentage with After Tax
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Click the park button in ordering screen
    And verify popup title park sale
    And verify popup content as Please specify the reason to park sale
    And Verify popup in reason in watermark
    And Verify popup Cancel button placed left corner
    And Verify popup Park button placed right corner
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Parked tab from sale history screen
    And select the required check
    And Columns such as Customer, Receipt No, Date, Time, Cashier, Total
    And Total Column is displayed in which total amount of that Parked receipt is shown below
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | Discount_Name | Discount | Message        |
      | IBD1          | 5        | Sale is parked |
#21
#  Scenario Outline: Verify if no Parked receipts is found in Parked sale history tab
#    Given Login with the valid credentials
#    Then Page will navigate to the retail order screen
#    And Click the sale history
#    Then Screen will navigate to Receipt-Check Status screen
#    When Select Parked tab from sale history screen
#    When <Message> message should be displayed when there is no checks available
#    Then Click the retail button
#    And Click the Logoff button
#    Examples:
#      | Message        |
#      | No Parked Receipts |
#22
  Scenario Outline: Verify able to search the Receipt in Receipt No field from Parked sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    Then Place Variant retail item with item tax in which tax is exempted with discount
    And Order the Variant item from the retail Screen
    Then Click the Option from the retail screen
    And Select the Tax Exempt option from the given options
    Then Click the Option from the retail screen
    And Click the Discount Option from the given options
    And Click the <Discount_Name> after tax - item based tax
    And Calculate the Item Based Discount for the <Discount> percentage with After Tax
    Then Get the Check number from the retail screen
    Then Get the Check number from the retail screen
    And Click the park button in ordering screen
    And verify popup title park sale
    And verify popup content as Please specify the reason to park sale
    And Verify popup in reason in watermark
    And Verify popup Cancel button placed left corner
    And Verify popup Park button placed right corner
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Parked tab from sale history screen
    And Select the Receipt No field
    When Enter single digit numerical value
    Then Displays result based on the search in Receipt No
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | Discount_Name | Discount | Message        |
      | IBD1          | 5        | Sale is parked |
#23
  Scenario Outline: Verify able to enter alphabets in Receipt No field from Parked sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Order the Multiple Variant item for the tax on Item tax
    Then Get the Check number from the retail screen
    And Click the park button in ordering screen
    And verify popup title park sale
    And verify popup content as Please specify the reason to park sale
    And Verify popup in reason in watermark
    And Verify popup Cancel button placed left corner
    And Verify popup Park button placed right corner
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Parked tab from sale history screen
    And Select the Receipt No field
    When Enter the alphabetic values in Receipt No field
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | Message        |
      | Sale is parked |
 #24
  Scenario Outline: Verify able to enter more than 50 characters in Park sale reason box in Park Sale screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And verify popup title park sale
    And verify popup content as Please specify the reason to park sale
    And Verify popup in reason in watermark
    And Verify popup Cancel button placed left corner
    And Verify popup Park button placed right corner
    And Enter the reason more than fifty characters
    Then Error message should be firing in popup <Error_Message>
    And  Click the cancel button
    And Void the Ordered items from the Retail Screen
    And  Click the Logoff button
    Examples:
      | Error_Message                             |
      | You can not enter more than 50 characters |
#25
  Scenario Outline: Verify able to cancel the placed retail item after opening the check from parked sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Order the Multiple Variant item for the tax on Item tax
    Then Get the Check number from the retail screen
    Then Get the menu items,total and quantity from the retail screen
    And Click the park button in ordering screen
    And verify popup title park sale
    And verify popup content as Please specify the reason to park sale
    And Verify popup in reason in watermark
    And Verify popup Cancel button placed left corner
    And Verify popup Park button placed right corner
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Parked tab from sale history screen
    And select the required check
    And Click on Open Receipt button in Parked sale history screen
    Then Able to view Parked items in retail order screen
    Then Click on all the close symbols near the total
    And The same receipt should be displayed
    And Click the Logoff button
    Examples:
      | Message        |
      | Sale is parked |

    #Refunded sale history Screen
#1
  Scenario: Verify able to view Refunded tab in sale history screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Closed tab is selected by default along with Void, Parked, Refunded, Exchanged and Layaways
    Then View Refunded tab
    Then Click the retail button
    And Click the Logoff button
#2
  Scenario: Verify the buttons present at the bottom of Refunded tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Refunded tab from sale history screen
    Then View the buttons shown below such as Re-Open Check and Print Receipt button
    Then Click the retail button
    And Click the Logoff button
#3
  Scenario: Verify the fields displayed at the bottom of Refunded tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Refunded tab from sale history screen
    And Fields such as Check Total and Average Amount is present at the bottom based on the receipts which displays the values
    Then Click the retail button
    And Click the Logoff button
#4
  Scenario: Verify the columns displayed in Refunded sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Refunded tab from sale history screen
    And Columns such as Customer, Receipt No, Transaction Time, Reasons, Total, Refund Total, Refund Type, Cashier
    Then Click the retail button
    And Click the Logoff button
#5
#  Scenario Outline: Verify if no Refunded receipts is found in Refunded sale history tab
#    Given Login with the valid credentials
#    Then Page will navigate to the retail order screen
#    And Click the sale history
#    Then Screen will navigate to Receipt-Check Status screen
#    When Select Refunded tab from sale history screen
#    When <Message> message should be displayed when there is no checks available in the Refunded tab
#    Then Click the retail button
#    And Click the Logoff button
#    Examples:
#      | Message              |
#      | No Refunded Receipts |

#6
  Scenario: Verify if Search Date field is selected from Refunded sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Refunded tab from sale history screen
    And Select the Search Date in which Calendar symbol is shown
    When Calendar is displayed with Month, Days and Date view
    Then Click the retail button
    Then Click the retail button
    And Click the Logoff button
#7
  Scenario: Verify the data's displayed in Search Date Calendar from Refunded sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Refunded tab from sale history screen
#    And Select the Search Date
#    When Calendar symbol is clicked
#    Then Calendar view will get displayed
    And Select the Search Date in which Calendar symbol is shown
    When Calendar is displayed with Month, Days and Date view
    When User can view Month along with current year dropdown, Backward and Forward navigation arrow
    Then Days of week should be displayed in next line of the Month and Year as S M T W T F S
    And View the current month with available number of days
    Then Click the retail button
    Then Click the retail button
    And Click the Logoff button
#8
  Scenario: Verify the enabled days if calendar is clicked from search date from Refunded sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Refunded tab from sale history screen
#    And Select the Search Date
#    When Calendar symbol is clicked
#    Then Calendar view will get displayed
    And Select the Search Date in which Calendar symbol is shown
    When Calendar is displayed with Month, Days and Date view
    When User can view Month along with current year dropdown, Backward and Forward navigation arrow
    Then Days of week should be displayed in next line of the Month and Year as S M T W T F S
    And View the current month with available number of days
    When Dates are shown as enabled till current date
    And Remaining dates are shown disabled
    Then Click the retail button
    Then Click the retail button
    And Click the Logoff button
#9
  Scenario: Verify able to search the Receipt in Receipt No field from Refunded sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Refunded tab from sale history screen
    And Select the Receipt No field
    When Enter single digit numerical value
    Then Displays result based on the search in Receipt No
    Then Click the retail button
    And Click the Logoff button
#10
  Scenario: Verify able to enter alphabets in Receipt No field from Refunded sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Refunded tab from sale history screen
    And Select the Receipt No field
    When Enter the alphabetic values in Receipt No field
    Then Click the retail button
    And Click the Logoff button
#11
  Scenario: Verify able to view Refunded Receipt in Refunded sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#        Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    Then Order the Multiple Standard item for the tax on Item tax
    Then Get the Check number from the retail screen
    And Get the menu items,total and quantity from the retail screen
    And Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then Verify the check number in the retail screen while doing refund
    And Verify the retail items in the retail screen while doing refund
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    And click the Refund all button
    And Refund screen should be displayed
    Then Add the refund reason
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tab
#    And Able to view Refund screen with Refund completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
#    Then Click Done button and the screen will remain in the Refunded tab in which Refunded Receipt is displayed
    And Click the retail button
    And Click the Logoff button
#12
  Scenario: Verify Customer column with no customer attached in Refunded receipt displayed in Refunded sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    Then Place Variant retail item with item tax and complete the payment using side cc
    Then Place the Multiple retail Variant item with Exclusive tax
    Then Get the Check number from the retail screen
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using Side CC button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then Verify the check number in the retail screen while doing refund
    And Verify the retail items in the retail screen while doing refund
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    And click the Refund all button
    And Refund screen should be displayed
    Then Add the refund reason
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tab
#    And Able to view Refund screen with Refund completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
#    Then Click Done button and the screen will remain in the Refunded tab in which Refunded Receipt is displayed
    And Columns such as Customer, Receipt No, Transaction Time, Reasons, Total, Refund Total, Refund Type, Cashier
    When View the customer column which displays Customer as Walkin
    Then Click the retail button
    And Click the Logoff button
#13
  Scenario Outline: Verify Customer column with customer attached in Refunded receipt displayed in Refunded sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Add the customer and the Customer Number is <CustomerNum>
    Then Get the Customer Name from the retail screen
#    Then Place Standard retail item with check tax and complete the payment using gift card
    Then Order the Multiple Standard item for the check based tax
    Then Get the Check number from the retail screen
    And Get the menu items,total and quantity from the retail screen
    And Complete the payment using gift card button and the card number is <CardNumber>
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then Verify the check number in the retail screen while doing refund
    And Verify the retail items in the retail screen while doing refund
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    And click the Refund all button
    And Refund screen should be displayed
    Then Add the refund reason
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tab
#    And Able to view Refund screen with Refund completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
#    Then Click Done button and the screen will remain in the Refunded tab in which Refunded Receipt is displayed
    And Columns such as Customer, Receipt No, Transaction Time, Reasons, Total, Refund Total, Refund Type, Cashier
    Then View the Customer column in which customer name is displayed
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | CustomerNum | CardNumber |
      | 123456      | 1234       |
#14
  Scenario: Verify Receipt No column in Refunded sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#        Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then Verify the check number in the retail screen while doing refund
    And Verify the retail items in the retail screen while doing refund
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    And click the Refund all button
    And Refund screen should be displayed
    Then Add the refund reason
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tab
#    And Able to view Refund screen with Refund completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
#    Then Click Done button and the screen will remain in the Refunded tab in which Refunded Receipt is displayed
    And Columns such as Customer, Receipt No, Transaction Time, Reasons, Total, Refund Total, Refund Type, Cashier
#    When Select that receipt and view the Receipt No column in which Receipt Number of Refunded receipt is displayed
    Then Click the retail button
    And Click the Logoff button
#15
  Scenario: Verify Transaction Time column in Refunded sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#        Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    Then Order the Multiple Standard item for the tax on Item tax
    Then Get the Check number from the retail screen
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then Verify the check number in the retail screen while doing refund
    And Verify the retail items in the retail screen while doing refund
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    And click the Refund all button
    And Refund screen should be displayed
    Then Add the refund reason
    And Get the current date and time
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tab
#    And Able to view Refund screen with Refund completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
#    Then Click Done button and the screen will remain in the Refunded tab in which Refunded Receipt is displayed
    And Columns such as Customer, Receipt No, Transaction Time, Reasons, Total, Refund Total, Refund Type, Cashier
#    When Select that receipt and view the Transaction Time column in which Transaction Time of Refunded receipt is displayed
    And Shows Date-Month-Year Hr:Min AM format in the Transaction Time Column
    Then Click the retail button
    And Click the Logoff button
#16
  Scenario: Verify Reasons column in Refunded sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#        Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    Then Order the Multiple Standard item for the tax on Item tax
    Then Get the Check number from the retail screen
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then Verify the check number in the retail screen while doing refund
    And Verify the retail items in the retail screen while doing refund
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    And click the Refund all button
    And Refund screen should be displayed
    Then Add the refund reason
    Then Get the reason from the refund reason text box
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tab
#    And Able to view Refund screen with Refund completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
#    Then Click Done button and the screen will remain in the Refunded tab in which Refunded Receipt is displayed
    And Columns such as Customer, Receipt No, Transaction Time, Reasons, Total, Refund Total, Refund Type, Cashier
    When Select that receipt and view the Reasons column in which Reason selected in Refund screen will appear
    Then Click the retail button
    And Click the Logoff button
#17
  Scenario: Verify Total column in Refunded sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#        Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then Verify the check number in the retail screen while doing refund
    And Verify the retail items in the retail screen while doing refund
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    And click the Refund all button
    And Refund screen should be displayed
    Then Add the refund reason
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tab
#    And Able to view Refund screen with Refund completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
#    Then Click Done button and the screen will remain in the Refunded tab in which Refunded Receipt is displayed
    And Columns such as Customer, Receipt No, Transaction Time, Reasons, Total, Refund Total, Refund Type, Cashier
    When Select that receipt and view the Total column in which Total amount of refunded items in Refund screen will appear
    Then Click the retail button
    And Click the Logoff button
#18
  Scenario: Verify Refund Total column in Refunded sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#        Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then Verify the check number in the retail screen while doing refund
    And Verify the retail items in the retail screen while doing refund
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    And click the Refund all button
    And Refund screen should be displayed
    Then Add the refund reason
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tab
#    And Able to view Refund screen with Refund completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
#    Then Click Done button and the screen will remain in the Refunded tab in which Refunded Receipt is displayed
    And Columns such as Customer, Receipt No, Transaction Time, Reasons, Total, Refund Total, Refund Type, Cashier
    When Select that receipt and view the Refund Total column in which Total amount refunded in Refund screen will appear
    Then Click the retail button
    And Click the Logoff button
#19
  Scenario: Verify Refund Type column in Refunded sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#        Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then Verify the check number in the retail screen while doing refund
    And Verify the retail items in the retail screen while doing refund
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    And click the Refund all button
    And Refund screen should be displayed
    Then Add the refund reason
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tab
#    And Able to view Refund screen with Refund completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
#    Then Click Done button and the screen will remain in the Refunded tab in which Refunded Receipt is displayed
    And Columns such as Customer, Receipt No, Transaction Time, Reasons, Total, Refund Total, Refund Type, Cashier
    When Select that receipt and view the Refund Type column in which Full Refund is shown
    Then Click the retail button
    And Click the Logoff button
#20
  Scenario: Verify Cashier column in Refunded sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#        Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then Verify the check number in the retail screen while doing refund
    And Verify the retail items in the retail screen while doing refund
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    And click the Refund all button
    And Refund screen should be displayed
    Then Add the refund reason
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tab
#    And Able to view Refund screen with Refund completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
#    Then Click Done button and the screen will remain in the Refunded tab in which Refunded Receipt is displayed
    And Columns such as Customer, Receipt No, Transaction Time, Reasons, Total, Refund Total, Refund Type, Cashier
    When Cashier Column is displayed in which user name is shown below
    Then Click the retail button
    And Click the Logoff button
#21
  Scenario: Verify able to view the digital receipt from Refunded sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#        Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then Verify the check number in the retail screen while doing refund
    And Verify the retail items in the retail screen while doing refund
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    And click the Refund all button
    And Refund screen should be displayed
    Then Add the refund reason
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tab
#    And Able to view Refund screen with Refund completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
#    Then Click Done button and the screen will remain in the Refunded tab in which Refunded Receipt is displayed
    And Columns such as Customer, Receipt No, Transaction Time, Reasons, Total, Refund Total, Refund Type, Cashier
    When Select that digital receipt near the Cashier column
    And Click the Back Arrow button from the receipt screen
    Then Click the retail button
    And Click the Logoff button
#22
  Scenario: Verify the Store Details fields if Receipt is clicked from Refunded tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#        Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then Verify the check number in the retail screen while doing refund
    And Verify the retail items in the retail screen while doing refund
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    And click the Refund all button
    And Refund screen should be displayed
    Then Add the refund reason
    And Get the current date and time
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tab
#    And Able to view Refund screen with Refund completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
#    Then Click Done button and the screen will remain in the Refunded tab in which Refunded Receipt is displayed
    And Columns such as Customer, Receipt No, Transaction Time, Reasons, Total, Refund Total, Refund Type, Cashier
    When Select that digital receipt near the Cashier column
    When Digital receipt with Store Details, Refund summary and Grand Total
    When View the Store Details fields at the top such as back navigation symbol, Store Name and Customer at first row
    And Displays Status, Receipt No, Server and Date with Time
    And Click the Back Arrow button from the receipt screen
    Then Click the retail button
    And Click the Logoff button
#23
  Scenario: Verify the fields under Refund Summary if Receipt symbol is clicked from Closed tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#        Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the Subtotal amount
    Then Get the Tax amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then Verify the check number in the retail screen while doing refund
    And Verify the retail items in the retail screen while doing refund
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    And click the Refund all button
    And Refund screen should be displayed
    Then Add the refund reason
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tab
#    And Able to view Refund screen with Refund completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
#    Then Click Done button and the screen will remain in the Refunded tab in which Refunded Receipt is displayed
    And Columns such as Customer, Receipt No, Transaction Time, Reasons, Total, Refund Total, Refund Type, Cashier
    When Select that digital receipt near the Cashier column
    When Digital receipt with Store Details, Refund summary and Grand Total
    When View the fields under Refund Summary such as placed retail items with quantity and price value in vertical order
    Then Shows Subtotal with value and Tax with value below the retail items in Refund summary
    And Click the Back Arrow button from the receipt screen
    Then Click the retail button
    And Click the Logoff button
#24
  Scenario: Verify minus symbol is shown infront of Refund quantity and Refund Total, Subtotal and Tax in Refund Summary of digital receipt
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#        Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the Subtotal amount
    Then Get the Tax amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then Verify the check number in the retail screen while doing refund
    And Verify the retail items in the retail screen while doing refund
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    And click the Refund all button
    And Refund screen should be displayed
    Then Add the refund reason
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tab
#    And Able to view Refund screen with Refund completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
#    Then Click Done button and the screen will remain in the Refunded tab in which Refunded Receipt is displayed
    And Columns such as Customer, Receipt No, Transaction Time, Reasons, Total, Refund Total, Refund Type, Cashier
    When Select that digital receipt near the Cashier column
    When Digital receipt with Store Details, Refund summary and Grand Total
    When View the fields under Refund Summary such as placed retail items with quantity and price value in vertical order
    Then Shows Subtotal with value and Tax with value below the retail items in Refund summary with minus symbol inFront of mentioned fields
    And Click the Back Arrow button from the receipt screen
    Then Click the retail button
    And Click the Logoff button
#25
  Scenario: Verify the description under refunded item inRefund summary if digital receipt is selected from Refunded tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#        Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then Verify the check number in the retail screen while doing refund
    And Verify the retail items in the retail screen while doing refund
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    And click the Refund all button
    And Refund screen should be displayed
    Then Add the refund reason
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tab
#    And Able to view Refund screen with Refund completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
#    Then Click Done button and the screen will remain in the Refunded tab in which Refunded Receipt is displayed
    And Columns such as Customer, Receipt No, Transaction Time, Reasons, Total, Refund Total, Refund Type, Cashier
    When Select that digital receipt near the Cashier column
    When Digital receipt with Store Details, Refund summary and Grand Total
    When View the fields under Refund Summary such as placed retail items with quantity and price value in vertical order
    And Shows This Sale is refunded text below the refunded retail item
    And Click the Back Arrow button from the receipt screen
    Then Click the retail button
    And Click the Logoff button
#26
  Scenario: Verify the barcode symbol at the bottom if Receipt is clicked from Closed tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#        Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then Verify the check number in the retail screen while doing refund
    And Verify the retail items in the retail screen while doing refund
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    And click the Refund all button
    And Refund screen should be displayed
    Then Add the refund reason
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tab
#    And Able to view Refund screen with Refund completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
#    Then Click Done button and the screen will remain in the Refunded tab in which Refunded Receipt is displayed
    And Columns such as Customer, Receipt No, Transaction Time, Reasons, Total, Refund Total, Refund Type, Cashier
    When Select that digital receipt near the Cashier column
    When Digital receipt with Store Details, Refund summary and Grand Total with minus symbol in front of total value
    When View the barcode symbol at the bottom if Receipt with Node number, hifen symbol,ddmmyy and ReceiptNumber
    And Click the Back Arrow button from the receipt screen
    Then Click the retail button
    And Click the Logoff button
#27
  Scenario: Verify the Notes displayed at the end if Receipt is clicked from closed sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#        Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then Verify the check number in the retail screen while doing refund
    And Verify the retail items in the retail screen while doing refund
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    And click the Refund all button
    And Refund screen should be displayed
    Then Add the refund reason
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tab
#    And Able to view Refund screen with Refund completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
#    Then Click Done button and the screen will remain in the Refunded tab in which Refunded Receipt is displayed
    And Columns such as Customer, Receipt No, Transaction Time, Reasons, Total, Refund Total, Refund Type, Cashier
    When Select that digital receipt near the Cashier column
    When Digital receipt with Store Details, Refund summary and Grand Total
    Then View the Notes displayed - Have a nice day, Visit us again
    And Click the Back Arrow button from the receipt screen
    Then Click the retail button
    And Click the Logoff button
#28
  Scenario: Verify if Re-Open Receipt button is clicked from Refunded sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#        Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then Verify the check number in the retail screen while doing refund
    And Verify the retail items in the retail screen while doing refund
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    And click the Refund all button
    And Refund screen should be displayed
    Then Add the refund reason
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tab
#    And Able to view Refund screen with Refund completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
#    Then Click Done button and the screen will remain in the Refunded tab in which Refunded Receipt is displayed
    Then Click the Reopen Check button
    When Retail order screen will get displayed with placed Standard retail item without any changes
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    When Page will navigate to retail order screen which displays greyed out refunded retail item
    When Cancel, Refund Items, Refund All and Exchange button is shown at the bottom
    And Click the cancel button
    Then Click the retail button
    Then Click the Logoff button
#29
  Scenario: Verify if Cancel button is clicked after Re-Open Receipt button is clicked from Refunded sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#        Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then Verify the check number in the retail screen while doing refund
    And Verify the retail items in the retail screen while doing refund
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    And click the Refund all button
    And Refund screen should be displayed
    Then Add the refund reason
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tab
#    And Able to view Refund screen with Refund completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
#    Then Click Done button and the screen will remain in the Refunded tab in which Refunded Receipt is displayed
    Then Click the Reopen Check button
    When Retail order screen will get displayed with placed Standard retail item without any changes
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    When Page will navigate to retail order screen which displays greyed out refunded retail item
    When Cancel, Refund Items, Refund All and Exchange button is shown at the bottom
    And Click the cancel button
    Then Click the retail button
    Then Click the Logoff button
#30
  Scenario: Verify able to view Print Receipt button from Refunded sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#        Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    Then Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then Verify the check number in the retail screen while doing refund
    And Verify the retail items in the retail screen while doing refund
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    And click the Refund all button
    And Refund screen should be displayed
    Then Add the refund reason
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tab
#    And Able to view Refund screen with Refund completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
#    Then Click Done button and the screen will remain in the Refunded tab in which Refunded Receipt is displayed
    And View Re-Print Receipt button
    And Click the Back Arrow button from the receipt screen
    Then Click the retail button
    Then Click the Logoff button

     # Exchanged sale history Screen
#1
  Scenario: Verify able to view Exchanged tab in sale history screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Closed tab is selected by default along with Void, Parked, Refunded, Exchanged and Layaways
    Then View Exchanged tab
    Then Click the retail button
    And Click the Logoff button
#2
  Scenario: Verify the buttons present at the bottom of Exchanged tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Exchanged tab from sale history screen
    Then View the buttons shown below such as Re-Open Check, Re-Print Receipt and Operation button
    Then Click the retail button
    And Click the Logoff button
#3
  Scenario: Verify the fields displayed at the bottom of Exchanged tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Exchanged tab from sale history screen
    And Fields such as Check Total and Average Amount is present at the bottom based on the receipts which displays the values
    Then Click the retail button
    And Click the Logoff button
#4
  Scenario: Verify the columns displayed in Exchanged sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Exchanged tab from sale history screen
    And Columns such as Customer, Receipt No, Transaction Time, Reasons, Server and Total
    Then Click the retail button
    And Click the Logoff button
#5
#  Scenario Outline: Verify if no Exchanged receipts is found in Refunded sale history tab
#    Given Login with the valid credentials
#    Then Page will navigate to the retail order screen
#    When Click the sale history
##    Then Screen will navigate to Check Status screen
#    Then Select Exchanged tab from sale history screen
#    When <Message> should be displayed in empty Exchanged tab
#    Then Click the retail button
#    And Click the Logoff button
#    Examples:
#      | Message              |
#      | No Exchanged Receipts |
#6
  Scenario: Verify if Search Date field is selected from Exchanged sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Exchanged tab from sale history screen
    And Select the Search Date in which Calendar symbol is shown
    When Calendar is displayed with Month, Days and Date view
    Then Click the retail button
    Then Click the retail button
    And Click the Logoff button
#7
  Scenario: Verify the data's displayed in Search Date Calendar from Exchanged sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Exchanged tab from sale history screen
#    And Select the Search Date
#    When Calendar symbol is clicked
#    Then Calendar view will get displayed
    And Select the Search Date in which Calendar symbol is shown
    When Calendar is displayed with Month, Days and Date view
    When User can view Month along with current year dropdown, Backward and Forward navigation arrow
    Then Days of week should be displayed in next line of the Month and Year as S M T W T F S
    And View the current month with available number of days
    Then Click the retail button
    Then Click the retail button
    And Click the Logoff button
#8
  Scenario: Verify the enabled days if calendar is clicked from search date from Exchanged sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Exchanged tab from sale history screen
#    And Select the Search Date
#    When Calendar symbol is clicked
#    Then Calendar view will get displayed
    And Select the Search Date in which Calendar symbol is shown
    When Calendar is displayed with Month, Days and Date view
    When User can view Month along with current year dropdown, Backward and Forward navigation arrow
    Then Days of week should be displayed in next line of the Month and Year as S M T W T F S
    And View the current month with available number of days
    When Dates are shown as enabled till current date
    And Remaining dates are shown disabled
    Then Click the retail button
    Then Click the retail button
    And Click the Logoff button
#9
  Scenario: Verify able to search the Receipt in Receipt No field from Exchanged sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Exchanged tab from sale history screen
    And Select the Receipt No field
    When Enter single digit numerical value
    Then Displays result based on the search in Receipt No
    Then Click the retail button
    And Click the Logoff button
#10
  Scenario: Verify able to enter alphabets in Receipt No field from Exchanged sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Exchanged tab from sale history screen
    And Select the Receipt No field
    When Enter the alphabetic values in Receipt No field
    Then Click the retail button
    And Click the Logoff button
#11
  Scenario: Verify able to view Exchanged Receipt in Exchanged sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Order the Standard Item from the retail Screen
    And Get the first menu item
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then New Receipt number in Retail order screen will get displayed
    And Placed retail items should be displayed without any changes
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    When Select any retail item and click on Exchange
    And New Receipt number in Retail order screen will get displayed after Click the Exchange button
    And Placed with the selected retail item in the Retail Screen
    Then Get the Check number from the retail screen
    And Get the Subtotal amount
    And Get the Total amount
    Then Get the Tax amount
    When Add any Standard or variant or Kit Assembly items to Exchange
    And Subtotal, Tax, Total and Balance Amount will get changed based on the added retail item
    Then Click on Exchange button
    Then Able to view Exchange Screen with Exchange Reasons, Exchange Amount, Customer and Pay By options
    And select or enter the reason
    And Click the payment type as Cash
    And Able to view Exchange screen with Exchange completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
    Then Click the Done button in Exchange popup
    Then Click the retail button
    And Click the Logoff button
#12
  Scenario Outline: Verify the Customer column in Exchanged sale history tab if Customer is attached for that Exchanged Receipt
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Add the customer and the Customer Number is <CustomerNum>
    And Get the Customer Name from the retail screen
    Then Order the Standard Item from the retail Screen
    And Get the first menu item
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then New Receipt number in Retail order screen will get displayed
    And Placed retail items should be displayed without any changes
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    When Select any retail item and click on Exchange
    And New Receipt number in Retail order screen will get displayed after Click the Exchange button
    And Placed with the selected retail item in the Retail Screen
    Then Get the Check number from the retail screen
    And Get the Subtotal amount
    And Get the Total amount
    Then Get the Tax amount
    When Add any Standard or variant or Kit Assembly items to Exchange
    And Subtotal, Tax, Total and Balance Amount will get changed based on the added retail item
    Then Click on Exchange button
    Then Able to view Exchange Screen with Exchange Reasons, Exchange Amount, Customer and Pay By options
    And select or enter the reason
    And Click the payment type as Cash
    And Able to view Exchange screen with Exchange completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
    Then Click the Done button in Exchange popup
    And verify the Exchange check is available in Exchange tab in sale history
    Then View the Customer column in which customer name is displayed
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |
#13
  Scenario: Verify the Customer column in Exchanged sale history tab if Customer is not attached for that Exchanged Receipt
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Order the Standard Item from the retail Screen
    And Get the first menu item
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then New Receipt number in Retail order screen will get displayed
    And Placed retail items should be displayed without any changes
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    When Select any retail item and click on Exchange
    And New Receipt number in Retail order screen will get displayed after Click the Exchange button
    And Placed with the selected retail item in the Retail Screen
    Then Get the Check number from the retail screen
    And Get the Subtotal amount
    And Get the Total amount
    Then Get the Tax amount
    When Add any Standard or variant or Kit Assembly items to Exchange
    And Subtotal, Tax, Total and Balance Amount will get changed based on the added retail item
    Then Click on Exchange button
    Then Able to view Exchange Screen with Exchange Reasons, Exchange Amount, Customer and Pay By options
    And select or enter the reason
    And Click the payment type as Cash
    And Able to view Exchange screen with Exchange completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
    Then Click the Done button in Exchange popup
    And verify the Exchange check is available in Exchange tab in sale history
    Then View the customer column which displays Customer as Walkin
    Then Click the retail button
    And Click the Logoff button
#14
  Scenario: Verify the Receipt No column in Exchanged sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Order the Standard Item from the retail Screen
    And Get the first menu item
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then New Receipt number in Retail order screen will get displayed
    And Placed retail items should be displayed without any changes
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    When Select any retail item and click on Exchange
    And New Receipt number in Retail order screen will get displayed after Click the Exchange button
    And Placed with the selected retail item in the Retail Screen
    Then Get the Check number from the retail screen
    And Get the Subtotal amount
    And Get the Total amount
    Then Get the Tax amount
    When Add any Standard or variant or Kit Assembly items to Exchange
    And Subtotal, Tax, Total and Balance Amount will get changed based on the added retail item
    Then Click on Exchange button
    Then Able to view Exchange Screen with Exchange Reasons, Exchange Amount, Customer and Pay By options
    And select or enter the reason
    And Click the payment type as Cash
    And Able to view Exchange screen with Exchange completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
    Then Click the Done button in Exchange popup
    And verify the Exchange check is available in Exchange tab in sale history
#    Then View the Receipt No column in which Receipt number is displayed in Exchanged sale history tab
    Then Click the retail button
    And Click the Logoff button
#15
  Scenario: Verify the Transaction Time column in Exchanged sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Order the Standard Item from the retail Screen
    And Get the first menu item
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then New Receipt number in Retail order screen will get displayed
    And Placed retail items should be displayed without any changes
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    When Select any retail item and click on Exchange
    Then Get the current time
    And New Receipt number in Retail order screen will get displayed after Click the Exchange button
    And Placed with the selected retail item in the Retail Screen
    Then Get the Check number from the retail screen
    And Get the Subtotal amount
    And Get the Total amount
    Then Get the Tax amount
    When Add any Standard or variant or Kit Assembly items to Exchange
    And Subtotal, Tax, Total and Balance Amount will get changed based on the added retail item
    Then Click on Exchange button
    Then Able to view Exchange Screen with Exchange Reasons, Exchange Amount, Customer and Pay By options
    And select or enter the reason
    And Click the payment type as Cash
    And Able to view Exchange screen with Exchange completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
    Then Click the Done button in Exchange popup
    And verify the Exchange check is available in Exchange tab in sale history
    Then Time Column is displayed in which twenty four HH:mm format is shown
    Then Click the retail button
    And Click the Logoff button
#16
  Scenario: Verify the Reasons column in Exchanged sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Order the Standard Item from the retail Screen
    And Get the first menu item
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then New Receipt number in Retail order screen will get displayed
    And Placed retail items should be displayed without any changes
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    When Select any retail item and click on Exchange
    And New Receipt number in Retail order screen will get displayed after Click the Exchange button
    And Placed with the selected retail item in the Retail Screen
    Then Get the Check number from the retail screen
    And Get the Subtotal amount
    And Get the Total amount
    Then Get the Tax amount
    When Add any Standard or variant or Kit Assembly items to Exchange
    And Subtotal, Tax, Total and Balance Amount will get changed based on the added retail item
    Then Click on Exchange button
    Then Able to view Exchange Screen with Exchange Reasons, Exchange Amount, Customer and Pay By options
    And select or enter the reason
    Then Get the reason from the Exchange Reason Text box
    And Click the payment type as Cash
    And Able to view Exchange screen with Exchange completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
    Then Click the Done button in Exchange popup
    And verify the Exchange check is available in Exchange tab in sale history
    Then View the Reasons is displayed in Exchanged sale history tab
    Then Click the retail button
    And Click the Logoff button
#17
  Scenario: Verify the Server column in Exchanged sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Order the Standard Item from the retail Screen
    And Get the first menu item
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then New Receipt number in Retail order screen will get displayed
    And Placed retail items should be displayed without any changes
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    When Select any retail item and click on Exchange
    And New Receipt number in Retail order screen will get displayed after Click the Exchange button
    And Placed with the selected retail item in the Retail Screen
    Then Get the Check number from the retail screen
    And Get the Subtotal amount
    And Get the Total amount
    Then Get the Tax amount
    When Add any Standard or variant or Kit Assembly items to Exchange
    And Subtotal, Tax, Total and Balance Amount will get changed based on the added retail item
    Then Click on Exchange button
    Then Able to view Exchange Screen with Exchange Reasons, Exchange Amount, Customer and Pay By options
    And select or enter the reason
    And Click the payment type as Cash
    And Able to view Exchange screen with Exchange completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
    Then Click the Done button in Exchange popup
    And verify the Exchange check is available in Exchange tab in sale history
    Then View the Server column in which name of the server or user is displayed in Exchanged sale history tab
    Then Click the retail button
    And Click the Logoff button
#18
  Scenario: Verify the Receipt Total column in Exchanged sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Order the Standard Item from the retail Screen
    And Get the first menu item
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then New Receipt number in Retail order screen will get displayed
    And Placed retail items should be displayed without any changes
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    When Select any retail item and click on Exchange
    And New Receipt number in Retail order screen will get displayed after Click the Exchange button
    And Placed with the selected retail item in the Retail Screen
    Then Get the Check number from the retail screen
    And Get the Subtotal amount
    And Get the Total amount
    Then Get the Tax amount
    When Add any Standard or variant or Kit Assembly items to Exchange
    And Subtotal, Tax, Total and Balance Amount will get changed based on the added retail item
    Then Click on Exchange button
    Then Able to view Exchange Screen with Exchange Reasons, Exchange Amount, Customer and Pay By options
    And select or enter the reason
    And Click the payment type as Cash
    And Able to view Exchange screen with Exchange completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
    Then Click the Done button in Exchange popup
    And verify the Exchange check is available in Exchange tab in sale history
    Then View the Receipt Total column in which Total of the Exchanged Receipt is displayed in Exchanged sale history tab
    Then Click the retail button
    And Click the Logoff button
#19
  Scenario Outline: Verify if Re-Open Receipt button is clicked without selecting the receipt from Exchanged sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Order the Standard Item from the retail Screen
    And Get the first menu item
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then New Receipt number in Retail order screen will get displayed
    And Placed retail items should be displayed without any changes
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    When Select any retail item and click on Exchange
    And New Receipt number in Retail order screen will get displayed after Click the Exchange button
    And Placed with the selected retail item in the Retail Screen
    Then Get the Check number from the retail screen
    And Get the Subtotal amount
    And Get the Total amount
    Then Get the Tax amount
    When Add any Standard or variant or Kit Assembly items to Exchange
    And Subtotal, Tax, Total and Balance Amount will get changed based on the added retail item
    Then Click on Exchange button
    Then Able to view Exchange Screen with Exchange Reasons, Exchange Amount, Customer and Pay By options
    And select or enter the reason
    And Click the payment type as Cash
    And Able to view Exchange screen with Exchange completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
    Then Click the Done button in Exchange popup
    And verify the Exchange check is available in Exchange tab in sale history
#    Then Select the Re-Open Receipt button without selecting the receipt from Exchanged sale history tab
    Then Click the Reopen Check button
    Then Alert popup message is displaying <Alert_Message>
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | Alert_Message                  |
      | Select the Receipt and Re-Open |
#20
  Scenario: Verify if Re-Open Receipt button is clicked by selecting the receipt from Exchanged sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Order the Standard Item from the retail Screen
    And Get the first menu item
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then New Receipt number in Retail order screen will get displayed
    And Placed retail items should be displayed without any changes
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    When Select any retail item and click on Exchange
    And New Receipt number in Retail order screen will get displayed after Click the Exchange button
    And Placed with the selected retail item in the Retail Screen

    Then Get the Check number from the retail screen
    And Get the Subtotal amount
    And Get the Total amount
    Then Get the Tax amount
    When Add any Standard or variant or Kit Assembly items to Exchange
    And Subtotal, Tax, Total and Balance Amount will get changed based on the added retail item
    And Get the menu items from the retail screen
    Then Click on Exchange button
    Then Able to view Exchange Screen with Exchange Reasons, Exchange Amount, Customer and Pay By options
    And select or enter the reason
    And Click the payment type as Cash
    And Able to view Exchange screen with Exchange completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
    Then Click the Done button in Exchange popup
    And verify the Exchange check is available in Exchange tab in sale history
    Then Click the Reopen Check button
    When Exchanged retail item will be displayed in retail order screen in greyed out manner
    Then Click the retail button
    And Click the Logoff button
#21
  Scenario: Verify able to view the Re-Print Receipt button from Exchanged sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Order the Standard Item from the retail Screen
    And Get the first menu item
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the menu items,total and quantity from the retail screen
    Then Complete the payment using fast cash button
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    And select the required check
    And click the return button
    Then New Receipt number in Retail order screen will get displayed
    And Placed retail items should be displayed without any changes
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    Then Shows buttons such as Cancel, Refund Items, Refund All and Exchange
    When Select any retail item and click on Exchange
    And New Receipt number in Retail order screen will get displayed after Click the Exchange button
    And Placed with the selected retail item in the Retail Screen
    Then Get the Check number from the retail screen
    And Get the Subtotal amount
    And Get the Total amount
    Then Get the Tax amount
    When Add any Standard or variant or Kit Assembly items to Exchange
    And Subtotal, Tax, Total and Balance Amount will get changed based on the added retail item
    Then Click on Exchange button
    Then Able to view Exchange Screen with Exchange Reasons, Exchange Amount, Customer and Pay By options
    And select or enter the reason
    And Click the payment type as Cash
    And Able to view Exchange screen with Exchange completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button
    Then Click the Done button in Exchange popup
    And verify the Exchange check is available in Exchange tab in sale history
    Then Able to view the Re-Print Receipt button from Exchanged sale history tab
    Then Click the retail button
    And Click the Logoff button



  # Layaway sale history Screen
#1
  Scenario: Verify able to view Layaways tab in sale history screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Closed tab is selected by default along with Void, Parked, Refunded, Exchanged and Layaways
    Then View Layaways tab
    Then Click the retail button
    And Click the Logoff button
#2
  Scenario: Verify the buttons present at the bottom of Layaways in sale history screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Layaways tab from sale history screen
    Then View the buttons shown below such as Pay Check, Open Check and Operation button
    Then Click the retail button
    And Click the Logoff button
#3
  Scenario: Verify the fields displayed at the bottom of Layaways in sale history screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Layaways tab from sale history screen
    And Fields such as Check Total, Customer, Average Duration and Average Amount is present at the bottom based on the receipts which displays the values
    Then Click the retail button
    And Click the Logoff button
#4
  Scenario: Verify the columns displayed in Layaways sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Layaways tab from sale history screen
    And Columns such as Customer, Receipt No, Transaction Date, Time, Cashier and Receipt Total
    Then Click the retail button
    And Click the Logoff button
#5
#  Scenario Outline: Verify if no Layaways receipts is found in Refunded sale history tab
#    Given Login with the valid credentials
#    Then Page will navigate to the retail order screen
#    And Click the sale history
#    Then Screen will navigate to Receipt-Check Status screen
#    Then Select Layaways tab from sale history screen
#    When <Message> message should be displayed when there is no checks available in LayAways tab
#    Then Click the retail button
#    And Click the Logoff button
#    Examples:
#      | Message        |
#      | No Layaway Receipts |
#6
  Scenario: Verify able to search the Receipt in Receipt No field from Layaways sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Layaways tab from sale history screen
    And Select the Receipt No field
    When Enter single digit numerical value
    Then Displays result based on the search in Receipt No
    Then Click the retail button
    And Click the Logoff button
#7
  Scenario: Verify able to enter alphabets in Receipt No field from Layaways sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the sale history
    Then Screen will navigate to Receipt-Check Status screen
    When Select Layaways tab from sale history screen
    And Select the Receipt No field
    When Enter the alphabetic values in Receipt No field
    Then Click the retail button
    And Click the Logoff button
#8
  Scenario Outline: Verify able to view receipts in Layaways sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    When Customer should get attached in retail order screen by selecting Add Customer button
#    Then Page will get navigate to Customer Profile Screen
#    When Existing or new customer is selected by adding Phone number or By Name
#    Then Customer will get attached in retail order screen
    And Add the customer and the Customer Number is <CustomerNum>
    Then Order the Standard Item from the retail Screen
    And Order the Variant item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    Then Click on Layaway option present at the custom options in retail order screen
    When Enter Deposit Amount Screen will appear
    Then Select Suggested deposit button or Minimum deposit button
    And Respective values will get populated in Enter Deposit Amount number pad
    Then Click on Get Deposit button
#    Then Able to view Payments screen with Balance Due and configured Payment types
#    When Any payment method is selected
#    Then Suggested or Minimum deposit will get paid through selected payment method
    Then User can view Balance Due amount which was selected in Enter Deposit Screen
    And Select the cash payment method to pay the deposit amount
    Then Click on Send to Layaway option
    And Able to view the receipts in Layaways sale history tab
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |
#9
  Scenario Outline: Verify the Customer column in Layaways sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    When Customer should get attached in retail order screen by selecting Add Customer button
#    Then Page will get navigate to Customer Profile Screen
#    When Existing or new customer is selected by adding Phone number or By Name
#    Then Customer will get attached in retail order screen
    And Add the customer and the Customer Number is <CustomerNum>
    Then Order the Standard Item from the retail Screen
    And Order the Variant item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    Then Click on Layaway option present at the custom options in retail order screen
    When Enter Deposit Amount Screen will appear
    Then Select Suggested deposit button or Minimum deposit button
    And Respective values will get populated in Enter Deposit Amount number pad
    Then Click on Get Deposit button
#    Then Able to view Payments screen with Balance Due and configured Payment types
#    When Any payment method is selected
#    Then Suggested or Minimum deposit will get paid through selected payment method
    Then User can view Balance Due amount which was selected in Enter Deposit Screen
    And Select the cash payment method to pay the deposit amount
    Then Click on Send to Layaway option
    And Able to view the receipts in Layaways sale history tab
    Then View the Customer column in which customer name is displayed
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |
#10
  Scenario Outline: Verify the Receipt No column in Layaways sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    When Customer should get attached in retail order screen by selecting Add Customer button
#    Then Page will get navigate to Customer Profile Screen
#    When Existing or new customer is selected by adding Phone number or By Name
#    Then Customer will get attached in retail order screen
    And Add the customer and the Customer Number is <CustomerNum>
    Then Order the Standard Item from the retail Screen
    And Order the Variant item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    Then Click on Layaway option present at the custom options in retail order screen
    When Enter Deposit Amount Screen will appear
    Then Select Suggested deposit button or Minimum deposit button
    And Respective values will get populated in Enter Deposit Amount number pad
    Then Click on Get Deposit button
#    Then Able to view Payments screen with Balance Due and configured Payment types
#    When Any payment method is selected
#    Then Suggested or Minimum deposit will get paid through selected payment method
    Then User can view Balance Due amount which was selected in Enter Deposit Screen
    And Select the cash payment method to pay the deposit amount
    Then Click on Send to Layaway option
    And Able to view the receipts in Layaways sale history tab
#    Then View the Receipt No column in which Receipt number is displayed in Layaway sale history tab
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |
#11
  Scenario Outline: Verify the Transaction Date column in Layaways sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    When Customer should get attached in retail order screen by selecting Add Customer button
#    Then Page will get navigate to Customer Profile Screen
#    When Existing or new customer is selected by adding Phone number or By Name
#    Then Customer will get attached in retail order screen
    And Add the customer and the Customer Number is <CustomerNum>
    And Get the current date
    Then Order the Standard Item from the retail Screen
    And Order the Variant item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    Then Click on Layaway option present at the custom options in retail order screen
    When Enter Deposit Amount Screen will appear
    Then Select Suggested deposit button or Minimum deposit button
    And Respective values will get populated in Enter Deposit Amount number pad
    Then Click on Get Deposit button
#    Then Able to view Payments screen with Balance Due and configured Payment types
#    When Any payment method is selected
#    Then Suggested or Minimum deposit will get paid through selected payment method
    Then User can view Balance Due amount which was selected in Enter Deposit Screen
    And Select the cash payment method to pay the deposit amount
    Then Click on Send to Layaway option
    And Able to view the receipts in Layaways sale history tab
#    Then View the Transaction Date column in which date receipt is Layawayed is displayed in Layaway sale history tab in dd-mm-yyyy(08-Jan-2024) format
    Then Date Column is displayed in which dd-MMM-yyyy format is shown
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |
#12
  Scenario Outline: Verify the Time column in Layaways sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    When Customer should get attached in retail order screen by selecting Add Customer button
#    Then Page will get navigate to Customer Profile Screen
#    When Existing or new customer is selected by adding Phone number or By Name
#    Then Customer will get attached in retail order screen
    And Add the customer and the Customer Number is <CustomerNum>
    Then Order the Standard Item from the retail Screen
    And Order the Variant item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    And Get the current time
    Then Click on Layaway option present at the custom options in retail order screen
    When Enter Deposit Amount Screen will appear
    Then Select Suggested deposit button or Minimum deposit button
    And Respective values will get populated in Enter Deposit Amount number pad
    Then Click on Get Deposit button
#    Then Able to view Payments screen with Balance Due and configured Payment types
#    When Any payment method is selected
#    Then Suggested or Minimum deposit will get paid through selected payment method
    Then User can view Balance Due amount which was selected in Enter Deposit Screen
    And Select the cash payment method to pay the deposit amount
    Then Click on Send to Layaway option
    And Able to view the receipts in Layaways sale history tab
    Then Time Column is displayed in which twenty four HH:mm format is shown
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |
#13
  Scenario Outline: Verify the Cashier column in Layaways sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    When Customer should get attached in retail order screen by selecting Add Customer button
#    Then Page will get navigate to Customer Profile Screen
#    When Existing or new customer is selected by adding Phone number or By Name
#    Then Customer will get attached in retail order screen
    And Add the customer and the Customer Number is <CustomerNum>
    Then Order the Standard Item from the retail Screen
    And Order the Variant item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    Then Click on Layaway option present at the custom options in retail order screen
    When Enter Deposit Amount Screen will appear
    Then Select Suggested deposit button or Minimum deposit button
    And Respective values will get populated in Enter Deposit Amount number pad
    Then Click on Get Deposit button
#    Then Able to view Payments screen with Balance Due and configured Payment types
#    When Any payment method is selected
#    Then Suggested or Minimum deposit will get paid through selected payment method
    Then User can view Balance Due amount which was selected in Enter Deposit Screen
    And Select the cash payment method to pay the deposit amount
    Then Click on Send to Layaway option
    And Able to view the receipts in Layaways sale history tab
    Then Cashier Column is displayed in which user name is shown below
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |
#14
  Scenario Outline: Verify the Receipt Total column in Layaways sale history tab
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    When Customer should get attached in retail order screen by selecting Add Customer button
#    Then Page will get navigate to Customer Profile Screen
#    When Existing or new customer is selected by adding Phone number or By Name
#    Then Customer will get attached in retail order screen
    And Add the customer and the Customer Number is <CustomerNum>
    Then Order the Standard Item from the retail Screen
    And Order the Variant item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    Then Click on Layaway option present at the custom options in retail order screen
    When Enter Deposit Amount Screen will appear
    Then Select Suggested deposit button or Minimum deposit button
    And Respective values will get populated in Enter Deposit Amount number pad
    Then Click on Get Deposit button
#    Then Able to view Payments screen with Balance Due and configured Payment types
#    When Any payment method is selected
#    Then Suggested or Minimum deposit will get paid through selected payment method
    Then User can view Balance Due amount which was selected in Enter Deposit Screen
    And Select the cash payment method to pay the deposit amount
    Then Click on Send to Layaway option
    And Able to view the receipts in Layaways sale history tab
    Then View the Receipt Total column in which Total of the Layaway Receipt is displayed in Layaway sale history tab
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |
#15
  Scenario Outline: Verify if Pay Check button is clicked from the Layaway sale history tab without selecting the Layaway receipt
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    When Customer should get attached in retail order screen by selecting Add Customer button
#    Then Page will get navigate to Customer Profile Screen
#    When Existing or new customer is selected by adding Phone number or By Name
#    Then Customer will get attached in retail order screen
    And Add the customer and the Customer Number is <CustomerNum>
    Then Order the Standard Item from the retail Screen
    And Order the Variant item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    Then Click on Layaway option present at the custom options in retail order screen
    When Enter Deposit Amount Screen will appear
    Then Select Suggested deposit button or Minimum deposit button
    And Respective values will get populated in Enter Deposit Amount number pad
    Then Click on Get Deposit button
#    Then Able to view Payments screen with Balance Due and configured Payment types
#    When Any payment method is selected
#    Then Suggested or Minimum deposit will get paid through selected payment method
    Then User can view Balance Due amount which was selected in Enter Deposit Screen
    And Select the cash payment method to pay the deposit amount
    Then Click on Send to Layaway option
    And Able to view the receipts in Layaways tab
    Then Click on Pay Check Button without selecting that Layaway receipt
    Then Alert popup message is displaying <Alert_Message>
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | CustomerNum | Alert_Message               |
      | 123456      | Select the Receipt and Open |
#16
  Scenario Outline: Verify if Pay Check button is clicked from the Layaway sale history tab by selecting the Layaway receipt in Offline mode
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    When Customer should get attached in retail order screen by selecting Add Customer button
#    Then Page will get navigate to Customer Profile Screen
#    When Existing or new customer is selected by adding Phone number or By Name
#    Then Customer will get attached in retail order screen
    And Add the customer and the Customer Number is <CustomerNum>
    Then Order the Standard Item from the retail Screen
    And Order the Variant item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    Then Click on Layaway option present at the custom options in retail order screen
    When Enter Deposit Amount Screen will appear
    Then Select Suggested deposit button or Minimum deposit button
    And Respective values will get populated in Enter Deposit Amount number pad
    Then Click on Get Deposit button
#    Then Able to view Payments screen with Balance Due and configured Payment types
#    When Any payment method is selected
#    Then Suggested or Minimum deposit will get paid through selected payment method
    Then User can view Balance Due amount which was selected in Enter Deposit Screen
    And Select the cash payment method to pay the deposit amount
    Then Click on Send to Layaway option
    And Able to view the receipts in Layaways sale history tab
#    Then Click on Pay Check Button by selecting that Layaway receipt in Offline mode
#    Then "You are in offline, the items you add to this system will not sync to other systems, are you sure you want to continue?" withYes or No Pop up will get displayed
#    When Yes is Selected
#    Then Page will navigate to retail order screen with placed retail items along with Finish button
#    When No is selected
#    Then Screen will remains same in Layaway screen
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |
#17
  Scenario Outline: Verify if Pay Check button is clicked from the Layaway sale history tab by selecting the Layaway receipt
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    When Customer should get attached in retail order screen by selecting Add Customer button
#    Then Page will get navigate to Customer Profile Screen
#    When Existing or new customer is selected by adding Phone number or By Name
#    Then Customer will get attached in retail order screen
    And Add the customer and the Customer Number is <CustomerNum>
    Then Order the Standard Item from the retail Screen
    And Order the Variant item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    Then Click on Layaway option present at the custom options in retail order screen
    When Enter Deposit Amount Screen will appear
    Then Select Suggested deposit button or Minimum deposit button
    And Respective values will get populated in Enter Deposit Amount number pad
    Then Click on Get Deposit button
#    Then Able to view Payments screen with Balance Due and configured Payment types
#    When Any payment method is selected
#    Then Suggested or Minimum deposit will get paid through selected payment method
    Then User can view Balance Due amount which was selected in Enter Deposit Screen
    And Select the cash payment method to pay the deposit amount
    Then Click on Send to Layaway option
    And Able to view the receipts in Layaways sale history tab
    Then Click on Pay Check Button by selecting that Layaway receipt
#    Then Payment screen with paid amount and balance due will get displayed
    And Select Back button
    And Get the Balance amount
    Then Click on Payment option in retail order screen
    Then Payment screen with paid amount and balance due will appear
    Then Select the payment method to pay the full balance due
    And Click on Submit button from payment method screen
    Then Receipt will get displayed in closed sale history tab
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |
#18
  Scenario Outline: Verify if Open Check button is clicked from the Layaway sale history tab without selecting the Layaway receipt
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    When Customer should get attached in retail order screen by selecting Add Customer button
#    Then Page will get navigate to Customer Profile Screen
#    When Existing or new customer is selected by adding Phone number or By Name
#    Then Customer will get attached in retail order screen
    And Add the customer and the Customer Number is <CustomerNum>
    Then Order the Standard Item from the retail Screen
    And Order the Variant item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    Then Click on Layaway option present at the custom options in retail order screen
    When Enter Deposit Amount Screen will appear
    Then Select Suggested deposit button or Minimum deposit button
    And Respective values will get populated in Enter Deposit Amount number pad
    Then Click on Get Deposit button
#    Then Able to view Payments screen with Balance Due and configured Payment types
#    When Any payment method is selected
#    Then Suggested or Minimum deposit will get paid through selected payment method
    Then User can view Balance Due amount which was selected in Enter Deposit Screen
    And Select the cash payment method to pay the deposit amount
    Then Click on Send to Layaway option
    And Able to view the receipts in Layaways tab
    Then Click on Open Check Button without selecting that Layaway receipt
    Then Alert popup message is displaying <Alert_Message>
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | CustomerNum | Alert_Message               |
      | 123456      | Select the Receipt and Open |
#19
  Scenario Outline: Verify if Open Check button is clicked from the Layaway sale history tab by selecting the Layaway receipt in Offline mode
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    When Customer should get attached in retail order screen by selecting Add Customer button
#    Then Page will get navigate to Customer Profile Screen
#    When Existing or new customer is selected by adding Phone number or By Name
#    Then Customer will get attached in retail order screen
    And Add the customer and the Customer Number is <CustomerNum>
    Then Order the Standard Item from the retail Screen
    And Order the Variant item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    Then Click on Layaway option present at the custom options in retail order screen
    When Enter Deposit Amount Screen will appear
    Then Select Suggested deposit button or Minimum deposit button
    And Respective values will get populated in Enter Deposit Amount number pad
    Then Click on Get Deposit button
#    Then Able to view Payments screen with Balance Due and configured Payment types
#    When Any payment method is selected
#    Then Suggested or Minimum deposit will get paid through selected payment method
    Then User can view Balance Due amount which was selected in Enter Deposit Screen
    And Select the cash payment method to pay the deposit amount
    Then Click on Send to Layaway option
    And Able to view the receipts in Layaways sale history tab
#    Then Click on Open Check Button by selecting that Layaway receipt in Offline mode
#    Then "You are in offline, the items you add to this system will not sync to other systems, are you sure you want to continue?" withYes or No Pop up will get displayed
#    When Yes is Selected
#    Then Page will navigate to retail order screen with placed retail items along with Finish button
#    When No is selected
#    Then Screen will remains same in Layaway screen
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |
#20
  Scenario Outline: Verify if Open Check button is clicked from the Layaway sale history tab by selecting the Layaway receipt
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    When Customer should get attached in retail order screen by selecting Add Customer button
#    Then Page will get navigate to Customer Profile Screen
#    When Existing or new customer is selected by adding Phone number or By Name
#    Then Customer will get attached in retail order screen
    And Add the customer and the Customer Number is <CustomerNum>
    Then Order the Standard Item from the retail Screen
    And Order the Variant item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the menu items,total and quantity from the retail screen
    And Get the Total amount
    Then Click on Layaway option present at the custom options in retail order screen
    When Enter Deposit Amount Screen will appear
    Then Select Suggested deposit button or Minimum deposit button
    And Respective values will get populated in Enter Deposit Amount number pad
    Then Click on Get Deposit button
#    Then Able to view Payments screen with Balance Due and configured Payment types
#    When Any payment method is selected
#    Then Suggested or Minimum deposit will get paid through selected payment method
    Then User can view Balance Due amount which was selected in Enter Deposit Screen
    And Select the cash payment method to pay the deposit amount
    Then Click on Send to Layaway option
    And Able to view the receipts in Layaways sale history tab
    Then Click on Open Check Button by selecting that Layaway receipt
    Then Page will navigate to retail order screen with placed retail items along with Finish button
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |
#21
  Scenario Outline: Verify if Finish option is selected in retail order screen after the Layaway receipt is opened
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    When Customer should get attached in retail order screen by selecting Add Customer button
#    Then Page will get navigate to Customer Profile Screen
#    When Existing or new customer is selected by adding Phone number or By Name
#    Then Customer will get attached in retail order screen
    And Add the customer and the Customer Number is <CustomerNum>
    Then Order the Standard Item from the retail Screen
    And Order the Variant item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    Then Click on Layaway option present at the custom options in retail order screen
    When Enter Deposit Amount Screen will appear
    Then Select Suggested deposit button or Minimum deposit button
    And Respective values will get populated in Enter Deposit Amount number pad
    Then Click on Get Deposit button
#    Then Able to view Payments screen with Balance Due and configured Payment types
#    When Any payment method is selected
#    Then Suggested or Minimum deposit will get paid through selected payment method
    Then User can view Balance Due amount which was selected in Enter Deposit Screen
    And Select the cash payment method to pay the deposit amount
    Then Click on Send to Layaway option
    And Able to view the receipts in Layaways sale history tab
    Then Click on Open Check Button by selecting that Layaway receipt
    Then Page will navigate to retail order screen with placed retail items along with Finish button
    Then Click on Finish option in retail order screen
    Then Receipt will be displayed in Layaway sale history tab
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |
#22
  Scenario Outline: Verify if Payment option is selected in retail order screen after the Layaway receipt is opened
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    When Customer should get attached in retail order screen by selecting Add Customer button
#    Then Page will get navigate to Customer Profile Screen
#    When Existing or new customer is selected by adding Phone number or By Name
#    Then Customer will get attached in retail order screen
    And Add the customer and the Customer Number is <CustomerNum>
    Then Order the Standard Item from the retail Screen
    And Order the Variant item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    Then Click on Layaway option present at the custom options in retail order screen
    When Enter Deposit Amount Screen will appear
    Then Select Suggested deposit button or Minimum deposit button
    And Respective values will get populated in Enter Deposit Amount number pad
    Then Click on Get Deposit button
#    Then Able to view Payments screen with Balance Due and configured Payment types
#    When Any payment method is selected
#    Then Suggested or Minimum deposit will get paid through selected payment method
    Then User can view Balance Due amount which was selected in Enter Deposit Screen
    And Select the cash payment method to pay the deposit amount
    Then Click on Send to Layaway option
    And Able to view the receipts in Layaways sale history tab
    Then Click on Open Check Button by selecting that Layaway receipt
    Then Page will navigate to retail order screen with placed retail items along with Finish button
    And Get the Balance amount
    Then Click on Payment option in retail order screen
    Then Payment screen with paid amount and balance due will appear
    Then Select the payment method to pay the full balance due
    And Click on Submit button from payment method screen
    Then Receipt will get displayed in closed sale history tab
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |
#23
  Scenario Outline: Verify the maximum number of days in which user can view the Layaway receipts
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
#    When Customer should get attached in retail order screen by selecting Add Customer button
#    Then Page will get navigate to Customer Profile Screen
#    When Existing or new customer is selected by adding Phone number or By Name
#    Then Customer will get attached in retail order screen
    And Add the customer and the Customer Number is <CustomerNum>
    Then Order the Standard Item from the retail Screen
    And Order the Variant item from the retail Screen
    Then Get the Check number from the retail screen
    And Get the Total amount
    Then Click on Layaway option present at the custom options in retail order screen
    When Enter Deposit Amount Screen will appear
    Then Select Suggested deposit button or Minimum deposit button
    And Respective values will get populated in Enter Deposit Amount number pad
    Then Click on Get Deposit button
#    Then Able to view Payments screen with Balance Due and configured Payment types
#    When Any payment method is selected
#    Then Suggested or Minimum deposit will get paid through selected payment method
    Then User can view Balance Due amount which was selected in Enter Deposit Screen
    And Select the cash payment method to pay the deposit amount
    Then Click on Send to Layaway option
#    And Able to view the Layaway Receipts with maximum of 30 days in Layaway sale history tab
    And Able to view the receipts in Layaways sale history tab
    Then Click the retail button
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |