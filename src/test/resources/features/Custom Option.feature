@Custom_Option  @Reg

Feature: Custom_option

#1
  Scenario: Verify able to view the option field in custom button
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Able to view the option field
    And Click the Logoff button
#2
  Scenario: Verify able to click the option field in custom button
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the option field at the bottom of custom options
    Then Receipt option screen will appear
    And Click the cancel button
    And Click the Logoff button
#3
  Scenario: Verify the options present in Receipt option screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the option field at the bottom of custom options
    Then Receipt option screen will appear
    Then Shows Tax Exempt, Discount, Open Item, Gift Card, Search Item, Open Cash Drawer, Service Exempt, Void, Apply Credit, EBT Balance and Cancel option
    And Click the cancel button
    And Click the Logoff button
#4
  Scenario: Verify if Tax Exempt options is clicked from Receipt option screen by placing retail item in order screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    When Order the Standard Item from the retail Screen
    Then Verify the Tax availability from retail screen
    And Click the option field at the bottom of custom options
    Then Receipt option screen will appear
    Then Shows Tax Exempt, Discount, Open Item, Gift Card, Search Item, Open Cash Drawer, Service Exempt, Void, Apply Credit, EBT Balance and Cancel option
    When Tax Exempt option is clicked
    And Tax column will get removed from the left order summary
    Then Complete the payment using fast cash button
    And Click the Logoff button
#5
  Scenario: Verify if Tax Exempt options is clicked from Receipt option screen for which tax exempt is applied for retail item in order screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    When Order the Standard Item from the retail Screen
    Then Verify the Tax availability from retail screen
    And Click the option field at the bottom of custom options
    Then Receipt option screen will appear
    Then Shows Tax Exempt, Discount, Open Item, Gift Card, Search Item, Open Cash Drawer, Service Exempt, Void, Apply Credit, EBT Balance and Cancel option
    When Tax Exempt option is clicked
    And Tax column will get removed from the left order summary
    And Click the option field at the bottom of custom options
    Then Receipt option screen will appear
    Then Again click Tax Exempt option
    And Complete the payment using fast cash button
    And Click the Logoff button
#6
  Scenario: Verify if Tax Exempt options is clicked from Receipt option screen without placing retail item in order screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Verify the Tax availability from retail screen
    And Click the option field at the bottom of custom options
    Then Receipt option screen will appear
    Then Shows Tax Exempt, Discount, Open Item, Gift Card, Search Item, Open Cash Drawer, Service Exempt, Void, Apply Credit, EBT Balance and Cancel option
    When Tax Exempt option is clicked
    And Tax column will get removed from the left order summary
    And Click the Logoff button
#7
  Scenario: Verify if Discount options is clicked from Receipt option screen without placing retail item in order screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the option field at the bottom of custom options
    Then Receipt option screen will appear
    Then Shows Tax Exempt, Discount, Open Item, Gift Card, Search Item, Open Cash Drawer, Service Exempt, Void, Apply Credit, EBT Balance and Cancel option
    When Discount option is clicked
    Then Empty Discount screen will appear
    And Click the cancel button
    And Click the Logoff button
#8
  Scenario Outline: Verify if Discount options is clicked from Receipt option screen by placing retail item in order screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    When Order the Standard Item from the retail Screen and Inclusive tax
    And Click the option field at the bottom of custom options
    Then Receipt option screen will appear
    Then Shows Tax Exempt, Discount, Open Item, Gift Card, Search Item, Open Cash Drawer, Service Exempt, Void, Apply Credit, EBT Balance and Cancel option
    When Discount option is clicked
    Then Discount screen with <Discount_Name> configured in BO will appear
    When <Discount_Name> shown in discount screen is clicked
    Then Click the cancel button
    Then Selected discount will get applied in order summary based on configured percentage in BO for applied <Discount>
    And Complete the payment using fast cash button
    And Click the Logoff button
    Examples:
      | Discount_Name | Discount |
      | IBD1          | 5        |
#9
  Scenario Outline: Verify if Discount options is clicked from Receipt option screen for which Discount is applied for retail item in order screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    When Order the Standard Item from the retail Screen and Inclusive tax
    And Click the option field at the bottom of custom options
    Then Receipt option screen will appear
    Then Shows Tax Exempt, Discount, Open Item, Gift Card, Search Item, Open Cash Drawer, Service Exempt, Void, Apply Credit, EBT Balance and Cancel option
    When Discount option is clicked
    Then Discount screen with <Discount_Name> configured in BO will appear
    When <Discount_Name> shown in discount screen is clicked
    Then Click the cancel button
    Then Selected discount will get applied in order summary based on configured percentage in BO for applied <Discount>
    And Click the option field at the bottom of custom options
    Then Receipt option screen will appear
    When Discount option is clicked
    Then Discount screen with <Discount_Name> configured in BO will appear
    When <Discount_Name> shown in discount screen is clicked
    Then Click the cancel button
    Then Applied Item Discount will get removed from left order summary
    And Complete the payment using fast cash button
    And Click the Logoff button
    Examples:
      | Discount_Name | Discount |
      | IBD1          | 5        |

#10
  Scenario Outline: Verify if filters in Discount screen if Discount is clicked from options
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    When Order the Multiple Standard item for the check based tax
    And Click the option field at the bottom of custom options
    Then Receipt option screen will appear
    Then Shows Tax Exempt, Discount, Open Item, Gift Card, Search Item, Open Cash Drawer, Service Exempt, Void, Apply Credit, EBT Balance and Cancel option
    When Discount option is clicked
    Then Discount screen with <Discount_Name> configured in BO will appear
    Then Click on the filter symbol present in Discount Screen
    ##########   Item and Check discounts are in a single tag in android, so as of now we are just verify the Item and Check discount availability
    When Check boxes are shown as selected by default for Item Discount and Check Discount
    And Click the cancel button
    Then Click the cancel button
    And Complete the payment using fast cash button
    And Click the Logoff button
    Examples:
      | Discount_Name |
      | CBD       |

#11
  Scenario Outline: Verify the fields in Discount screen if Discount is clicked from options
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    When Order the Multiple Standard item for the check based tax
    And Click the option field at the bottom of custom options
    Then Receipt option screen will appear
    Then Shows Tax Exempt, Discount, Open Item, Gift Card, Search Item, Open Cash Drawer, Service Exempt, Void, Apply Credit, EBT Balance and Cancel option
    When Discount option is clicked
    Then Discount screen with <Discount_Name> configured in BO will appear
    When Search box with symbol , filter and Cancel option
    Then Click the cancel button
    And Complete the payment using fast cash button
    And Click the Logoff button
    Examples:
      | Discount_Name |
      | CBD       |
#12
  Scenario: Verify if Open Item is selected from custom options
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the option field at the bottom of custom options
    Then Receipt option screen will appear
    Then Shows Tax Exempt, Discount, Open Item, Gift Card, Search Item, Open Cash Drawer, Service Exempt, Void, Apply Credit, EBT Balance and Cancel option
    When Open Item option is clicked
    Then Open Item screen will appear with Item Name, Price, Tax along with input box including Cancel and Done
    And Click the cancel button
    And Click the Logoff button
#13
  Scenario: Verify able to place Open Item in retail order screen by selecting Open Item from options
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the option field at the bottom of custom options
    Then Receipt option screen will appear
    Then Shows Tax Exempt, Discount, Open Item, Gift Card, Search Item, Open Cash Drawer, Service Exempt, Void, Apply Credit, EBT Balance and Cancel option
    When Open Item option is clicked
    Then Open Item screen will appear with Item Name, Price, Tax along with input box including Cancel and Done
    When Enter Open Item Name in Item Name input box
    Then Enter Price for that Open Item in Price input box
    Then Select the Tax displayed in Tax field
    And Click the done button
    When Open Item will get placed in retail order screen with the given data
    And Void the Ordered items from the Retail Screen
    And Click the Logoff button
#14
  Scenario: Verify able to close the sale after placing Open Item in retail order screen by selecting Open Item from options
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the option field at the bottom of custom options
    Then Receipt option screen will appear
    Then Shows Tax Exempt, Discount, Open Item, Gift Card, Search Item, Open Cash Drawer, Service Exempt, Void, Apply Credit, EBT Balance and Cancel option
    When Open Item option is clicked
    Then Open Item screen will appear with Item Name, Price, Tax along with input box including Cancel and Done
    When Enter Open Item Name in Item Name input box
    Then Enter Price for that Open Item in Price input box
    Then Select the Tax displayed in Tax field
    And Click the done button
    When Open Item will get placed in retail order screen with the given data
    Then Complete the payment using fast cash button
    And Click the Logoff button

#25
  Scenario: Verify if Search Item option is selected from custom options
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the option field at the bottom of custom options
    Then Receipt option screen will appear
    Then Shows Tax Exempt, Discount, Open Item, Gift Card, Search Item, Open Cash Drawer, Service Exempt, Void, Apply Credit, EBT Balance and Cancel option
    When Search Item option is clicked
    Then Cursor will pointed in search field
    When User can search the retail item by using SKU code and Retail Item Name
    Then Complete the payment using fast cash button
    And Click the Logoff button
#26
  Scenario: Verify able to view Open Cash Drawer option from custom options
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the option field at the bottom of custom options
    Then Receipt option screen will appear
    Then Shows Tax Exempt, Discount, Open Item, Gift Card, Search Item, Open Cash Drawer, Service Exempt, Void, Apply Credit, EBT Balance and Cancel option
    When Able to view Open Cash Drawer option
    And Click the cancel button
    And Click the Logoff button
#38
  Scenario: Verify able to view Print option from custom options
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the option field at the bottom of custom options
    Then Receipt option screen will appear
    Then Shows Tax Exempt, Discount, Open Item, Gift Card, Search Item, Open Cash Drawer, Service Exempt, Void, Apply Credit, EBT Balance and Cancel option
    When Able to view Print option
    And Click the cancel button
    And Click the Logoff button
#39
  Scenario: Verify able to view Apply Store Credit from custom options
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the option field at the bottom of custom options
    Then Receipt option screen will appear
    Then Shows Tax Exempt, Discount, Open Item, Gift Card, Search Item, Open Cash Drawer, Service Exempt, Void, Apply Credit, EBT Balance and Cancel option
    When Able to view Apply Store Credit option
    And Click the cancel button
    And Click the Logoff button
#40
  Scenario Outline: Verify if Apply Store Credit field is selected from custom options without placing any item in retail order screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Click the option field at the bottom of custom options
    Then Receipt option screen will appear
    Then Shows Tax Exempt, Discount, Open Item, Gift Card, Search Item, Open Cash Drawer, Service Exempt, Void, Apply Credit, EBT Balance and Cancel option
    When Click Apply Store Credit option without customer then the <Msg> is displayed
#    Then Displays "Please attach customer to apply store credits" pop up will appear in retail order screen
    And Click the Logoff button
    Examples:
      | Msg            |
      | Please attach customer to apply store credits |
#41
  Scenario Outline: Verify if Apply Store Credit field is selected from custom options by placing item in retail order screen without customer
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Order the Standard Item from the retail Screen
    And Click the option field at the bottom of custom options
    Then Receipt option screen will appear
    Then Shows Tax Exempt, Discount, Open Item, Gift Card, Search Item, Open Cash Drawer, Service Exempt, Void, Apply Credit, EBT Balance and Cancel option
    When Click Apply Store Credit option without customer then the <Msg> is displayed
    And Complete the payment using fast cash button
    And Click the Logoff button
    Examples:
      | Msg            |
      | Please attach customer to apply store credits |
#42
  Scenario Outline: Verify if Apply Store Credit field is selected from custom options by placing item in retail order screen by attaching customer with no store credits
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Add the customer and the Customer Number is <CustomerNum>
    When Order the Standard Item from the retail Screen
    And Click the option field at the bottom of custom options
    Then Receipt option screen will appear
    Then Shows Tax Exempt, Discount, Open Item, Gift Card, Search Item, Open Cash Drawer, Service Exempt, Void, Apply Credit, EBT Balance and Cancel option
    When Click Apply Store Credit option without customer then the <Msg> is displayed
    And Complete the payment using fast cash button
    And Click the Logoff button
    Examples:
      | CustomerNum | Msg            |
      | 123456      | Store Credits Unavailable |

#43
  Scenario Outline: Verify able to add Store Credit by selecting Apply Store Credit from customer Profile Screen if customer with no store credits is attached
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    Then Add the customer and the Customer Number is <CustomerNum>
    When Order the Variant item from the retail Screen
    And Click the option field at the bottom of custom options
    Then Receipt option screen will appear
    Then Shows Tax Exempt, Discount, Open Item, Gift Card, Search Item, Open Cash Drawer, Service Exempt, Void, Apply Credit, EBT Balance and Cancel option
    When Click Apply Store Credit option without customer then the <Msg> is displayed
    And Click the Attached Customer
    Then Customer Profile screen is open to add the new customer details
    Then Select +Add Credit option under Store Credit Balance
    When ADD STORE CREDIT screen with number pad will be displayed then Enter the amount
    Then Click Save and page will navigate to retail order screen by attached customer with store credit
    And Click the option field at the bottom of custom options
    Then Receipt option screen will appear
    Then Shows Tax Exempt, Discount, Open Item, Gift Card, Search Item, Open Cash Drawer, Service Exempt, Void, Apply Credit, EBT Balance and Cancel option
    When Click Apply Store Credit option
    Then Verify the Apply Store Credit and enter the amount
    And Click the Apply Credit button then the <MsgNew> is displayed
    And Click the Attached Customer
    Then Customer Profile screen is open to add the new customer details
    Then Click the Edit button of Add Credit option in customer profile screen
    And Clear the amount in the Store credit
    Then Click Save and page will navigate to retail order screen by attached customer with store credit
    And Complete the payment using fast cash button
    And Click the Logoff button

    Examples:
      | CustomerNum | Msg                       | MsgNew               |
      | 123456      | Store Credits Unavailable | Store Credit Applied |