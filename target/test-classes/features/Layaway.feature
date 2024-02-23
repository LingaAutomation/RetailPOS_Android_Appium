@Layaway @Reg
Feature: Layaway


  Scenario Outline: Verify able to view Error message if Layaway option is clicked without selecting any items
    Given Login with the valid credentials
    Then Select the Layaway option without selecting any items
    Then Error message should be displayed shown <Message> for with out any item
    And Click the Logoff button

    Examples:
      | Message                       |
      | You have no items for Layaway |

  Scenario: Verify able to view Add customer screen if customer is not attached if Layaway is selected
    Given Login with the valid credentials
    Then Place Standard retail item in retail order screen with exclusive or item tax  without attaching customer
    Then Click the Layaway option in retail order screen
    Then Page will redirect to Add customer screen
    And Click the close button of add customer popup and void the retail items
    And Click the Logoff button

  Scenario Outline: Verify able to view Enter Deposit Amount screen
    Given Login with the valid credentials
    Then Add the customer and the Customer Number is <CustomerNum>
    Then Place Variant retail item in retail order screen with exclusive or item tax
    When Click on Layaway option in retail order screen
    And Enter Deposit Amount screen will appear
    And Click the close button of enter deposit amount popup and void the retail items
    And Click the Logoff button

    Examples:
      | CustomerNum |
      | 123456      |

  Scenario Outline: Verify if Get Deposit button is clicked without selecting Suggested or Minimum percentage amount
    Given Login with the valid credentials
    Then Add the customer and the Customer Number is <CustomerNum>
    Then Place Standard retail item in retail order screen with exclusive or item tax
    And Calculate the exclusive tax and values
    Then Get the total amount from the order screen
    And Click on Layaway option in retail order screen
    And Enter Deposit Amount screen will appear
    And User can view Due Balance, Suggested Deposit percentage and minimum deposit percentage
    And Calculate the Correct Values are displayed or not in the enter deposit amount popup then values are <Suggested_Deposit> and <Minimum_Deposit>
    Then Click on Get Deposit button without selecting Suggested or Minimum percentage amount
    When <Msg> popup along with Done will appear
    And Click the close button of enter deposit amount popup and void the retail items
    And Click the Logoff button

    Examples:
      | CustomerNum | Msg                                                                      | Suggested_Deposit | Minimum_Deposit |
      | 123456      | Kindly make suggested deposit or minimum deposit to proceed with Layaway | 6                 | 4               |

  Scenario Outline: Verify able to view Suggested deposit amount in number pad in Enter Deposit Amount screen
    Given Login with the valid credentials
    Then Add the customer and the Customer Number is <CustomerNum>
    Then Place Variant retail item in retail order screen with inclusive tax
    And Calculate the inclusive tax and values
    When Click on Layaway option in retail order screen
    And Enter Deposit Amount screen will appear
    And User can view Due Balance, Suggested Deposit percentage and minimum deposit percentage
    Then Click on Suggested Deposit button
    Then Suggested deposit amount will be populated in number pad in Enter Deposit Amount screen
    And Click the close button of enter deposit amount popup and void the retail items
    And Click the Logoff button

    Examples:
      | CustomerNum |
      | 123456      |

  Scenario Outline: Verify able to view Minimum deposit amount in number pad in Enter Deposit Amount screen
    Given Login with the valid credentials
    Then Add the customer and the Customer Number is <CustomerNum>
    Then Place Variant retail item in retail order screen with inclusive tax
    And Calculate the inclusive tax and values
    When Click on Layaway option in retail order screen
    And Enter Deposit Amount screen will appear
    And User can view Due Balance, Suggested Deposit percentage and minimum deposit percentage
    Then Click on Minimum Deposit button
    Then Minimum deposit amount will be populated in number pad in Enter Deposit Amount screen
    And Click the close button of enter deposit amount popup and void the retail items
    And Click the Logoff button

    Examples:
      | CustomerNum |
      | 123456      |

#  Scenario Outline: Verify able to view selected percentage amount in Payment Page
#    Given Login with the valid credentials
#    Then Add the customer and the Customer Number is <CustomerNum>
#    Then Place Variant retail item in retail order screen with inclusive tax
#    And Calculate the inclusive tax and values
#    Then Get the total amount from the order screen
#    When Click on Layaway option in retail order screen
#    And Enter Deposit Amount screen will appear
#    And User can view Due Balance, Suggested Deposit percentage and minimum deposit percentage
#    Then Click on Minimum or Suggested Deposit button
#    And User can view the Due Balance and total amount is same or not
#    Then Selected deposit amount either Suggested or Minimum deposit amount will be populated in number pad in Enter Deposit Amount screen
#    And Click on Get Deposit button
#    Then User can view Balance Due amount which was selected in Enter Deposit Screen
#    Then Complete the Payments using Cash method
#    And Click the Logoff button
#
#    Examples:
#      | CustomerNum |
#      | 123456      |
#
#  Scenario Outline: Verify able to select the payment method to pay the deposit amount
#    Given Login with the valid credentials
#    Then Add the customer and the Customer Number is <CustomerNum>
#    Then Place Variant retail item in retail order screen with check tax
#    And Calculate the check based tax and values
#    Then Get the total amount from the order screen
#    When Click on Layaway option in retail order screen
#    And Enter Deposit Amount screen will appear
#    And User can view Due Balance, Suggested Deposit percentage and minimum deposit percentage
#    Then Click on Minimum or Suggested Deposit button
#    Then Selected deposit amount either Suggested or Minimum deposit amount will be populated in number pad in Enter Deposit Amount screen
#    And Click on Get Deposit button
#    Then User can view Balance Due amount which was selected in Enter Deposit Screen
#    And Select the payment method to pay the deposit amount
#    And Click the Logoff button
#
#    Examples:
#      | CustomerNum |
#      | 123456      |
#
#  Scenario Outline: Verify able to view the Layaway receipt in Layaway sale history tab
#    Given Login with the valid credentials
#    Then Add the customer and the Customer Number is <CustomerNum>
#    Then Place Kit Assembly retail item in retail order screen with exclusive or item tax
#    And Calculate the exclusive tax and values
#    Then Get the total amount from the order screen
#    And Click on Layaway option in retail order screen
#    And Enter Deposit Amount screen will appear
#    And User can view Due Balance, Suggested Deposit percentage and minimum deposit percentage
#    Then Click on Minimum or Suggested Deposit button
#    Then Selected deposit amount either Suggested or Minimum deposit amount will be populated in number pad in Enter Deposit Amount screen
#    And Click on Get Deposit button
#    Then User can view Balance Due amount which was selected in Enter Deposit Screen
#    And Select the cash payment method to pay the deposit amount
#    And Click on Send to Layaway option
#    Then Layaway receipt will be moved to Layaways tab in Sale History screen with retail button click
#    And Click the Logoff button
#
#    Examples:
#      | CustomerNum |
#      | 123456      |
#
#  Scenario Outline: Verify able to view the error message if user enters different amount than suggested or minimum amount in payment page
#    Given Login with the valid credentials
#    Then Add the customer and the Customer Number is <CustomerNum>
#    Then Place Kit Assembly item in retail order screen with inclusive tax
#    Then Calculate the inclusive tax and values
#    Then Get the total amount from the order screen
#    And Click on Layaway option in retail order screen
#    And Enter Deposit Amount screen will appear
#    And User can view Due Balance, Suggested Deposit percentage and minimum deposit percentage
#    Then Click on Minimum or Suggested Deposit button
#    Then Selected deposit amount either Suggested or Minimum deposit amount will be populated in number pad in Enter Deposit Amount screen
#    And Click on Get Deposit button
#    Then User can view Balance Due amount which was selected in Enter Deposit Screen
#    And Enter different amount than suggested or minimum amount in payment page
##    Then Displays “You have to make payment for minimum suggested amount value or minimum amount value to proceed with layaway.”
#    Then Error message should be displayed and the message is <Msg>
#    And Complete the Check using Cash and Submit
#    And Click the Logoff button
#
#    Examples:
#      | CustomerNum | Msg        |
#      | 123456      | Please pay |
#
#  Scenario Outline:Verify able to open the check at any time to pay the remaining amount
#    Given Login with the valid credentials
#    Then Add the customer and the Customer Number is <CustomerNum>
#    Then Place Standard retail item in retail order screen with exclusive or item tax
#    And Get the Check number from the retail screen
#    Then Get the total amount from the order screen
#    And Click on Layaway option in retail order screen
#    And Enter Deposit Amount screen will appear
#    And User can view Due Balance, Suggested Deposit percentage and minimum deposit percentage
#    Then Click on Minimum or Suggested Deposit button
#    Then Selected deposit amount either Suggested or Minimum deposit amount will be populated in number pad in Enter Deposit Amount screen
#    And Click on Get Deposit button
#    Then User can view Balance Due amount which was selected in Enter Deposit Screen
#    And Select the cash payment method to pay the deposit amount
#    And Click on Send to Layaway option
#    Then Layaway receipt will be moved to Layaways tab in Sale History screen
#    Then Select that Layaway check and click on Open check
#    And Selected check will get displayed in retail Order screen
#    Then Complete the payment using fast cash button
#    And Click the Logoff button
#
#    Examples:
#      | CustomerNum |
#      | 123456      |
#
#  Scenario Outline: Verify if user clicks on submit button without paying full due amount
#    Given Login with the valid credentials
#    Then Add the customer and the Customer Number is <CustomerNum>
#    Then Place Standard retail item in retail order screen with exclusive or item tax
#    And Get the Check number from the retail screen
#    Then Get the total amount from the order screen
#    And Click on Layaway option in retail order screen
#    And Enter Deposit Amount screen will appear
#    And User can view Due Balance, Suggested Deposit percentage and minimum deposit percentage
#    Then Click on Minimum or Suggested Deposit button
#    Then Selected deposit amount either Suggested or Minimum deposit amount will be populated in number pad in Enter Deposit Amount screen
#    And Click on Get Deposit button
#    Then User can view Balance Due amount which was selected in Enter Deposit Screen
#    And Select the cash payment method to pay the deposit amount
#    And Click on Send to Layaway option
#    Then Layaway receipt will be moved to Layaways tab in Sale History screen
#    Then Select that Layaway check and click on Open check
#    And Selected check will get displayed in retail Order screen
#    When Select the Payment button from the bottom
#    And Payment screen with paid amount will be displayed
#    Then Click on Submit button without paying full due amount
##    Then Error message should be shown “Please pay remaining amount value($8.80)“
#    Then Error message should be displayed and the message is <Msg>
#    And Complete the Check using Cash and Submit
#    And Click the Logoff button
#
#    Examples:
#      | CustomerNum | Msg        |
#      | 123456      | Please pay |
#
#  Scenario Outline: Verify able to view Layaway checks after 30 days
#    Given Login with the valid credentials
#    Then Add the customer and the Customer Number is <CustomerNum>
#    Then Place Standard retail item in retail order screen with exclusive or item tax
#    And Get the Check number from the retail screen
#    Then Get the total amount from the order screen
#    And Click on Layaway option in retail order screen
#    And Enter Deposit Amount screen will appear
#    And User can view Due Balance, Suggested Deposit percentage and minimum deposit percentage
#    Then Click on Minimum or Suggested Deposit button
#    Then Selected deposit amount either Suggested or Minimum deposit amount will be populated in number pad in Enter Deposit Amount screen
#    And Click on Get Deposit button
#    Then User can view Balance Due amount which was selected in Enter Deposit Screen
#    And Select the cash payment method to pay the deposit amount
#    And Click on Send to Layaway option
#    Then Layaway receipt will be moved to Layaways tab in Sale History screen
#    Then Select that Layaway check and click on Open check
#    And Selected check will get displayed in retail Order screen
#    When Select the Payment button from the bottom
#    And Payment screen with paid amount will be displayed
#    Then Enter partial amount and click on Back button
#    And Select Finish button
#    Then Layaway receipt will be moved to Layaways tab in Sale History screen with retail button click
#    And Click the Logoff button
#
#    Examples:
#      | CustomerNum |
#      | 123456      |
#
#  Scenario Outline: Verify able to close the Layaway checks
#    Given Login with the valid credentials
#    Then Add the customer and the Customer Number is <CustomerNum>
#    Then Place Standard retail item in retail order screen with exclusive or item tax
#    And Get the Check number from the retail screen
#    Then Get the total amount from the order screen
#    And Click on Layaway option in retail order screen
#    And Enter Deposit Amount screen will appear
#    And User can view Due Balance, Suggested Deposit percentage and minimum deposit percentage
#    Then Click on Minimum or Suggested Deposit button
#    Then Selected deposit amount either Suggested or Minimum deposit amount will be populated in number pad in Enter Deposit Amount screen
#    And Click on Get Deposit button
#    Then User can view Balance Due amount which was selected in Enter Deposit Screen
#    And Select the cash payment method to pay the deposit amount
#    And Click on Send to Layaway option
#    Then Layaway receipt will be moved to Layaways tab in Sale History screen
#    Then Select that Layaway check and click on Open check
#    And Selected check will get displayed in retail Order screen
#    When Select the Payment button from the bottom
#    And Payment screen with paid amount will be displayed
#    Then Enter full amount and click on Submit button
#    And Check will get closed and able to view in closed sale history tab
#    And Click the Logoff button
#
#    Examples:
#      | CustomerNum |
#      | 123456      |
#
#  Scenario Outline: Verify able to view the receipt in closed tab after completing full payment for layaway check
#    Given Login with the valid credentials
#    Then Add the customer and the Customer Number is <CustomerNum>
#    Then Place Standard retail item in retail order screen with exclusive or item tax
#    Then Get the total amount from the order screen
#    And Get the Check number from the retail screen
#    And Click on Layaway option in retail order screen
#    And Enter Deposit Amount screen will appear
#    And User can view Due Balance, Suggested Deposit percentage and minimum deposit percentage
#    Then Click on Minimum or Suggested Deposit button
#    Then Selected deposit amount either Suggested or Minimum deposit amount will be populated in number pad in Enter Deposit Amount screen
#    And Click on Get Deposit button
#    Then User can view Balance Due amount which was selected in Enter Deposit Screen
#    And Select the cash payment method to pay the deposit amount
#    And Click on Send to Layaway option
#    Then Layaway receipt will be moved to Layaways tab in Sale History screen
#    Then Select that Layaway check and click on Open check
#    And Selected check will get displayed in retail Order screen
#    When Select the Payment button from the bottom
#    And Payment screen with paid amount will be displayed
#    Then Enter full amount and click on Submit button
#    And Check will get closed and able to view in closed sale history tab
##    Then View the summary details in closed tab receipt
#    And Click the Logoff button
#
#    Examples:
#      | CustomerNum |
#      | 123456      |
#
#
#  Scenario Outline:Verify if Pay Check button is clicked from Layaway sale history tab
#    Given Login with the valid credentials
#    Then Add the customer and the Customer Number is <CustomerNum>
#    Then Place Standard retail item in retail order screen with exclusive or item tax
#    And Get the Check number from the retail screen
#    Then Get the total amount from the order screen
#    And Click on Layaway option in retail order screen
#    And Enter Deposit Amount screen will appear
#    And User can view Due Balance, Suggested Deposit percentage and minimum deposit percentage
#    Then Click on Minimum or Suggested Deposit button
#    Then Selected deposit amount either Suggested or Minimum deposit amount will be populated in number pad in Enter Deposit Amount screen
#    And Click on Get Deposit button
#    Then User can view Balance Due amount which was selected in Enter Deposit Screen
#    And Select the cash payment method to pay the deposit amount
#    And Click on Send to Layaway option
#    Then Layaway receipt will be moved to Layaways tab in Sale History screen
#    And Select that Layaway check and Click on Pay Check button
#    Then Payment Method screen will get displayed with configured payments and  Paid deposit
#    When Enter full amount and click on Submit button
#    And Check will get closed and able to view in closed sale history tab
#    And Click the Logoff button
#
#    Examples:
#      | CustomerNum |
#      | 123456      |
#
#  Scenario Outline:Verify if Back button is clicked from Payment Method Screen
#    Given Login with the valid credentials
#    Then Add the customer and the Customer Number is <CustomerNum>
#    Then Place Standard retail item in retail order screen with exclusive or item tax
#    And Get the Check number from the retail screen
#    Then Get the total amount from the order screen
#    And Click on Layaway option in retail order screen
#    And Enter Deposit Amount screen will appear
#    And User can view Due Balance, Suggested Deposit percentage and minimum deposit percentage
#    Then Click on Minimum or Suggested Deposit button
#    Then Selected deposit amount either Suggested or Minimum deposit amount will be populated in number pad in Enter Deposit Amount screen
#    And Click on Get Deposit button
#    Then User can view Balance Due amount which was selected in Enter Deposit Screen
#    And Select the cash payment method to pay the deposit amount
#    And Click on Send to Layaway option
#    Then Layaway receipt will be moved to Layaways tab in Sale History screen
#    And Select that Layaway check and Click on Pay Check button
#    Then Payment Method screen will get displayed with configured payments and  Paid deposit
#    And Displays Delete, Adjust and Back button in Payment Method screen
#    And Select Back button
#    Then Page will remains in retail order screen with placed Standard retail item
#    And Select Finish button
#    Then Layaway receipt will be moved to Layaways tab in Sale History screen with retail button click
#    And Click the Logoff button
#
#    Examples:
#      | CustomerNum |
#      | 123456      |
#
#  Scenario Outline:Verify if Delete button is clicked from Payment Method Screen
#    Given Login with the valid credentials
#    Then Add the customer and the Customer Number is <CustomerNum>
#    Then Place Standard retail item in retail order screen with exclusive or item tax
#    And Get the Check number from the retail screen
#    Then Get the total amount from the order screen
#    And Click on Layaway option in retail order screen
#    And Enter Deposit Amount screen will appear
#    And User can view Due Balance, Suggested Deposit percentage and minimum deposit percentage
#    Then Click on Minimum or Suggested Deposit button
#    Then Selected deposit amount either Suggested or Minimum deposit amount will be populated in number pad in Enter Deposit Amount screen
#    And Click on Get Deposit button
#    Then User can view Balance Due amount which was selected in Enter Deposit Screen
#    And Select the cash payment method to pay the deposit amount
#    And Click on Send to Layaway option
#    Then Layaway receipt will be moved to Layaways tab in Sale History screen
#    And Select that Layaway check and Click on Pay Check button
#    Then Payment Method screen will get displayed with configured payments and  Paid deposit
#    And Displays Delete, Adjust and Back button in Payment Method screen
#    And Select Delete button without selecting any payment
##    When Select a payment and try again! along with Done option will appear
#    Then Error message should be displayed and the message is <Msg>
#    When Enter full amount and click on Submit button
#    And Check will get closed and able to view in closed sale history tab
#    And Click the Logoff button
#
#
#    Examples:
#      | CustomerNum | Msg                             |
#      | 123456      | Select a payment and try again! |
#
#  Scenario Outline:Verify if Adjust button is clicked from Payment Method Screen
#    Given Login with the valid credentials
#    Then Add the customer and the Customer Number is <CustomerNum>
#    Then Place Standard retail item in retail order screen with exclusive or item tax
#    And Get the Check number from the retail screen
#    Then Get the total amount from the order screen
#    And Click on Layaway option in retail order screen
#    And Enter Deposit Amount screen will appear
#    And User can view Due Balance, Suggested Deposit percentage and minimum deposit percentage
#    Then Click on Minimum or Suggested Deposit button
#    Then Selected deposit amount either Suggested or Minimum deposit amount will be populated in number pad in Enter Deposit Amount screen
#    And Click on Get Deposit button
#    Then User can view Balance Due amount which was selected in Enter Deposit Screen
#    And Select the cash payment method to pay the deposit amount
#    And Click on Send to Layaway option
#    Then Layaway receipt will be moved to Layaways tab in Sale History screen
#    And Select that Layaway check and Click on Pay Check button
#    Then Payment Method screen will get displayed with configured payments and  Paid deposit
#    And Displays Delete, Adjust and Back button in Payment Method screen
#    And Select Adjust button without selecting any payment
##    When Select a payment and try again! along with Done option will appear
#    Then Error message should be displayed and the message is <Msg>
#    When Enter full amount and click on Submit button
#    And Check will get closed and able to view in closed sale history tab
#    And Click the Logoff button
#
#    Examples:
#      | CustomerNum | Msg                             |
#      | 123456      | Select a payment and try again! |
#
#  Scenario Outline:Verify if close symbol is clicked from retail order Screen after check is selected from layaway sale history tab
#    Given Login with the valid credentials
#    Then Add the customer and the Customer Number is <CustomerNum>
#    Then Place Standard retail item in retail order screen with exclusive or item tax
#    And Get the Check number from the retail screen
#    Then Get the total amount from the order screen
#    And Click on Layaway option in retail order screen
#    And Enter Deposit Amount screen will appear
#    And User can view Due Balance, Suggested Deposit percentage and minimum deposit percentage
#    Then Click on Minimum or Suggested Deposit button
#    Then Selected deposit amount either Suggested or Minimum deposit amount will be populated in number pad in Enter Deposit Amount screen
#    And Click on Get Deposit button
#    Then User can view Balance Due amount which was selected in Enter Deposit Screen
#    And Select the cash payment method to pay the deposit amount
#    And Click on Send to Layaway option
#    Then Layaway receipt will be moved to Layaways tab in Sale History screen
#    And Select that Layaway check and Click on Pay Check button
#    Then Payment Method screen will get displayed with configured payments and  Paid deposit
#    And Displays Delete, Adjust and Back button in Payment Method screen
#    And Select Back button
#    Then Click on close symbol for that placed retail item
##    And Displays "Can't delete the ordered retail item" along with Done option will appear
#    Then Error message should be displayed and the message is <Msg>
#    And Select Finish button
#    Then Layaway receipt will be moved to Layaways tab in Sale History screen with retail button click
#    And Click the Logoff button
#
#    Examples:
#      | CustomerNum | Msg                            |
#      | 123456      | delete the ordered retail item |
#
#  Scenario Outline:Verify if void option is clicked from retail order Screen after check is selected from layaway sale history tab
#    Given Login with the valid credentials
#    Then Add the customer and the Customer Number is <CustomerNum>
#    Then Place Standard retail item in retail order screen with exclusive or item tax
#    And Get the Check number from the retail screen
#    Then Get the total amount from the order screen
#    And Click on Layaway option in retail order screen
#    And Enter Deposit Amount screen will appear
#    And User can view Due Balance, Suggested Deposit percentage and minimum deposit percentage
#    Then Click on Minimum or Suggested Deposit button
#    Then Selected deposit amount either Suggested or Minimum deposit amount will be populated in number pad in Enter Deposit Amount screen
#    And Click on Get Deposit button
#    Then User can view Balance Due amount which was selected in Enter Deposit Screen
#    And Select the cash payment method to pay the deposit amount
#    And Click on Send to Layaway option
#    Then Layaway receipt will be moved to Layaways tab in Sale History screen
#    And Select that Layaway check and Click on Pay Check button
#    Then Payment Method screen will get displayed with configured payments and  Paid deposit
#    And Displays Delete, Adjust and Back button in Payment Method screen
#    And Select Back button
#    Then Click on void option for that placed retail item
##    When Page will navigate to Payment Method Screen
##    Then Displays "Payment(s) made on this Check, Can you return this to Lavy L" along with Done option will appear
#    Then Error message should be display and the message is <Msg>
#    And Select Back button
#    And Select Finish button
#    Then Layaway receipt will be moved to Layaways tab in Sale History screen with retail button click
#    And Click the Logoff button
#
#    Examples:
#      | CustomerNum | Msg                                                   |
#      | 123456      | Payment(s) made on this Check, Can you return this to |
#
#  Scenario Outline:Verify able to go back to retail order screen from Payment Method screen after deleting the Suggested or Minimum Deposit
#    Given Login with the valid credentials
#    Then Add the customer and the Customer Number is <CustomerNum>
#    Then Place Kit Assembly retail item in retail order screen with exclusive or item tax
#    And Get the Check number from the retail screen
#    Then Get the total amount from the order screen
#    And Click on Layaway option in retail order screen
#    And Enter Deposit Amount screen will appear
#    And User can view Due Balance, Suggested Deposit percentage and minimum deposit percentage
#    Then Click on Minimum or Suggested Deposit button
#    Then Selected deposit amount either Suggested or Minimum deposit amount will be populated in number pad in Enter Deposit Amount screen
#    And Click on Get Deposit button
#    Then User can view Balance Due amount which was selected in Enter Deposit Screen
#    And Select the cash payment method to pay the deposit amount
##    And Delete the paid amount from payment method screen
##    Then Should not allows to delete the deposit amount from payment method screen
#    And Click on Send to Layaway option
#    Then Layaway receipt will be moved to Layaways tab in Sale History screen with retail button click
#    And Click the Logoff button
#
#    Examples:
#      | CustomerNum |
#      | 123456      |
#
#  Scenario Outline: Verify able to exempt Tax after the check is Layaway
#    Given Login with the valid credentials
#    Then Add the customer and the Customer Number is <CustomerNum>
#    Then Place Kit Assembly retail item in retail order screen with exclusive or item tax
#    And Get the Check number from the retail screen
#    Then Get the total amount from the order screen
#    And Click on Layaway option in retail order screen
#    And Enter Deposit Amount screen will appear
#    And User can view Due Balance, Suggested Deposit percentage and minimum deposit percentage
#    Then Click on Minimum or Suggested Deposit button
#    Then Selected deposit amount either Suggested or Minimum deposit amount will be populated in number pad in Enter Deposit Amount screen
#    And Click on Get Deposit button
#    Then User can view Balance Due amount which was selected in Enter Deposit Screen
##    And Select the payment method to pay the deposit amount
##    When User pays the deposit amount
##    Then Click on Layaway
##    And Receipt will be displayed in Layaway sale history tab
##    When User select that Layaway Receipt and select Open Receipt
##    Then Receipt will get displayed in retail order screen
##    And Click on option button at the bottom to select Tax Exempt option
##    Then "Tax Exempt cannot be applied for payment made check" pop up along with Done button should get displayed
#    And Select the cash payment method to pay the deposit amount
#    And Click on Send to Layaway option
#    Then Layaway receipt will be moved to Layaways tab in Sale History screen
#    Then Select that Layaway check and click on Open check
#    And Selected check will get displayed in retail Order screen
#    Then Click the Option from the retail screen
#    And Select the Tax Exempt option from the given options
#    Then Error message should be display and the message is <Msg>
#    And Select Finish button
#    Then Layaway receipt will be moved to Layaways tab in Sale History screen with retail button click
#    And Click the Logoff button
#
#    Examples:
#      | CustomerNum | Msg                                                 |
#      | 123456      | Tax Exempt cannot be applied for payment made check |
#
#    Scenario Outline: Verify able to apply discount for the Layaway Receipt
#      Given Login with the valid credentials
#      Then Add the customer and the Customer Number is <CustomerNum>
#      Then Place Standard retail item in retail order screen with exclusive or item tax
##      Then Place Kit Assembly retail item in retail order screen with exclusive or item tax
#      And Get the Check number from the retail screen
#      Then Get the total amount from the order screen
#      And Click on Layaway option in retail order screen
#      And Enter Deposit Amount screen will appear
#      And User can view Due Balance, Suggested Deposit percentage and minimum deposit percentage
#      Then Click on Minimum or Suggested Deposit button
#      Then Selected deposit amount either Suggested or Minimum deposit amount will be populated in number pad in Enter Deposit Amount screen
#      And Click on Get Deposit button
#      Then User can view Balance Due amount which was selected in Enter Deposit Screen
##      And Select the payment method to pay the deposit amount
##      When User pays the deposit amount
##      Then Click on Layaway
##      And Receipt will be displayed in Layaway sale history tab
##      When User select that Layaway Receipt and select Open Receipt
##      Then Receipt will get displayed in retail order screen
##      And Click on option button at the bottom to select Discount option or select directly from custom button
##      Then Apply Item  based discount
##      When Discount will get applied in the retail order screen
##      Then Select the payment and pay the remaining amount
##      And Click on Submit button
##      Then Receipt will get closed and displayed in closed tab
#      And Select the cash payment method to pay the deposit amount
#      And Click on Send to Layaway option
#      Then Layaway receipt will be moved to Layaways tab in Sale History screen
#      Then Select that Layaway check and click on Open check
#      And Selected check will get displayed in retail Order screen
#      Then Click the Option from the retail screen
#      And Click the Discount Option from the given options
#      And Click the <Discount_Name> after tax - item based tax
#      And Calculate the Item Based Discount for the <Discount> percentage with After Tax
#      And Complete the Payments using Cash method
#      And Check will get closed and able to view in closed sale history tab
#      And Click the Logoff button
#
#      Examples:
#        | CustomerNum | Discount | Discount_Name |
#        | 123456      | 5        | IBD1          |