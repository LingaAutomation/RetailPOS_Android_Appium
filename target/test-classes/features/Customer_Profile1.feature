@Customer_Profile @Reg
Feature:  Customer Profile Screen

 Scenario: Verify able to Add Customer and Search Customer from retail screen
  Given Login with the valid credentials
  And Check the Add Customer button is available or not in the Retail Screen
  And Check the Search Customer button is available or not in the Retail Screen
  Then Click the Logoff button

  Scenario: Verify the fields present in the Add customer screen
   Given Login with the valid credentials
   And Click the Add customer button in ordering screen
   Then Add customer popup is open
   And verify By Name or Email search bar available in popup
   And verify By Mobile search available in popup
   Then verify the Search bar is available
   And verify the Numpad is available or not
   Then verify the add customer is present or not with out enter any number or name
   And Click the close button
   Then Click the Logoff button


   Scenario: Verify the error message when user enter less than 6 characters
    Given Login with the valid credentials
    And Click the Add customer button in ordering screen
    Then Add customer popup is open
    And Enter the number less than six digits
    Then Click the close button
    And Click the Logoff button

    Scenario: Verify the Entered mobile number is available or not in the Customer Profile Screen
     Given Login with the valid credentials
     And Click the Add customer button in ordering screen
     Then Add customer popup is open
     When Add the customer Mobile number
     And Get the mobile number
     Then Customer Profile screen is open to add the new customer details
     Then click the Add customer
     And Verify the added mobile number is available or not in the Customer profile screen
     Then Click the close button of customer profile
     And Click the Logoff button

 Scenario: Verify the user able to edit the Entered mobile number in the Customer Profile Screen
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  When Add the customer Mobile number
  And Get the mobile number
  Then click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Enter the First Name
  Then Get the name from the First Name field
  And Verify the added mobile number is available or not in the Customer profile screen
  Then Click the Edit button of existing mobile number
  And Update the mobile number
  Then Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Verify the remove customer button in the retail screen
  Then Click the remove customer button
  And Click the Logoff button

   Scenario: Verify the fields in Add Customer Profile Screen
    Given Login with the valid credentials
    And Click the Add customer button in ordering screen
    Then Add customer popup is open
    When Add the customer Mobile number
    And click the Add customer
    Then Customer Profile screen is open to add the new customer details
    And verify the Search bar is available
    Then Verify the First Name field
    And Verify the Last Name field
    Then Verify the Cancel button
    And Verify the Save button
    Then Verify Repeat Order button
    And Verify Display Order Button
    Then Verify Customer plan button
    And Verify the Previous Orders
    Then Verify the Google Map
    And Verify the Add credit button
    Then Verify the Profile picture
    And Verify the Tax Exempt toggle
    Then Verify the Note field
    And Verify the Address field
    Then Verify the Nationality field
    And Verify the Mobile numbers field
    Then Verify the Birthday field
    And Validate the Email id field
    Then Verify the Customer identification number field
    And Click the close button of customer profile
    Then Click the Logoff button

 Scenario Outline: Verify the attached customer is displayed or not in Retail Screen
  Given Login with the valid credentials
  Then Enter the customer number "12345678"
  And Click the close button
  Then Add the customer and the Customer Number is <CustomerNumber>
  Then Verify the added customer is displayed in ordering screen of existing customer
  And Verify the remove customer button in the retail screen
  Then Click the remove customer button
  Then Click the Logoff button
  Examples:
   | CustomerNumber |
   | 123456         |

 Scenario: Verify the alert below the search box while entering the name
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  And Click the By Name or Email option
  Then Enter the single character and verify the error message
  And Click the close button
  Then Click the Logoff button

 Scenario: Verify the customer name by searching the customer from the customer profile screen
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  And Click the By Name or Email option
  Then Enter the single character and verify the error message
  And Click the Add customer button
  And Customer Profile screen is open to add the new customer details
  Then Search the existing customer name "HA_Acc 1"
  And Click the close button of customer profile
  Then Click the Logoff button

 Scenario: Verify if minimum Phone number is entered in customer Profile
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  And Click the By Name or Email option
  Then Enter the name
  And Click the Add customer button
  And Customer Profile screen is open to add the new customer details
  Then Click the add button of mobile number
  And Enter the Required number less than four digits error message should be displayed
  Then Click the close button of customer profile
  And Click the Logoff button

 Scenario: Verify the customer mobile number by searching the customer from the customer profile screen
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  And Click the By Name or Email option
  Then Enter the name
  And Click the Add customer button
  Then Search the existing customer mobile number "123456"
  And Click the close button of customer profile
  Then Click the Logoff button

 Scenario: Verify the Existing customer available or not - By using Name
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  And Click the By Name or Email option
  Then Enter and select the previous customer name "HA_Acc 1"
  And Click the Attached Customer
  Then Get the name from the First Name field
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Verify the remove customer button in the retail screen
  Then Click the remove customer button
  Then Click the Logoff button

 Scenario: Verify the Existing customer available or not - By using email
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  And Click the By Name or Email option
  Then Enter and select the previous customer email "test1@mail.com"
  And Click the Attached Customer
  Then Get the name from the First Name field
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Verify the remove customer button in the retail screen
  Then Click the remove customer button
  Then Click the Logoff button

  # Unable to get the watermark text from the Add Customer Search screen
#  Scenario: Verify the watermark inside the search box
#   Given Login with the valid credentials
#   And Click the Add customer button in ordering screen
#   Then Add customer popup is open
#   And Click the By Name or Email option
#   Then Verify the search bar with watermark "Search the customer By Name/Email"
#   And Click the close button
#   Then Click the Logoff button

 Scenario: Verify the able to save with first name
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  When Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Enter the First Name
  Then Get the name from the First Name field
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Verify the remove customer button in the retail screen
  Then Click the remove customer button
  Then Click the Logoff button

 Scenario: Verify the able to save with first name - By Using Name/Email
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  And Click the By Name or Email option
  When Enter the name
  And verify the add customer is present or not with out enter any number or name
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  Then Get the name from the First Name field
  And Click the add button of mobile number
  Then Enter the Required number
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Verify the remove customer button in the retail screen
  Then Click the remove customer button
  Then Click the Logoff button

 Scenario: Verify the able to save with edited first name - By Using Name/Email
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  And Click the By Name or Email option
  When Enter the name
  And verify the add customer is present or not with out enter any number or name
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Edit the First name
  Then Get the name from the First Name field
  And Click the add button of mobile number
  Then Enter the Required number
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Verify the remove customer button in the retail screen
  Then Click the remove customer button
  Then Click the Logoff button

 Scenario: Verify the validation message - without mobile number
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  And Click the By Name or Email option
  When Enter the name
  And verify the add customer is present or not with out enter any number or name
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  Then Get the name from the First Name field
  And Click the save button in customer profile window
  And "Please fill in all the required fields" pop up will appear
  Then Click the close button of customer profile
  Then Click the Logoff button

 Scenario: Verify if the searched customer is not found in By Name/Email field
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  And Click the By Name or Email option
  When Enter the name
  Then No Results search result should be found
  And verify the add customer is present or not with out enter any number or name
  And Click the close button
  Then Click the Logoff button

 Scenario: Verify if the searched customer is not found in By Phone field
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  When Add the customer Mobile number
  Then No Results search result should be found
  And verify the add customer is present or not with out enter any number or name
  And Click the close button
  Then Click the Logoff button

 Scenario: Verify the able to save with first and last name
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  When Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Enter the First Name
  And Enter the Last Name
  Then Get the name from the First and Last Name field
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Verify the remove customer button in the retail screen
  Then Click the remove customer button
  Then Click the Logoff button

 Scenario: Verify the able to save with customer id
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  When Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Enter the First Name
  And Enter the Customer identification number
  Then Get the name from the First Name field
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Verify the remove customer button in the retail screen
  Then Click the remove customer button
  Then Click the Logoff button

 Scenario: Verify the able to save with email id
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  When Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Enter the First Name
  And Enter the Email id
  Then Get the name from the First Name field
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Verify the remove customer button in the retail screen
  Then Click the remove customer button
  Then Click the Logoff button


 Scenario: Verify the able to save with email id
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  When Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Enter the First Name
  And Enter the Email id
  Then Get the name from the First Name field
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Verify the remove customer button in the retail screen
  Then Click the remove customer button
  Then Click the Logoff button

 Scenario: Verify the able to save with birth day
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  When Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Enter the First Name
  And Select the birth day
  Then Get the name from the First Name field
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Verify the remove customer button in the retail screen
  Then Click the remove customer button
  Then Click the Logoff button

 Scenario: Verify the able to save with another one mobile number
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  When Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Enter the First Name
  And Add another one mobile number
  Then Get the name from the First Name field
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Verify the remove customer button in the retail screen
  Then Click the remove customer button
  Then Click the Logoff button

 Scenario: Verify the able to save and edit the mobile number
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  When Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Enter the First Name
  Then Get the name from the First Name field
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Click the Attached Customer
  Then Customer Profile screen is open to add the new customer details
  And Click the Edit button of existing mobile number
  Then Updates the mobile number
  And Click the save button in customer profile window
  Then Click the Logoff button

 Scenario: Verify the able to save with another one mobile number and delete the same number
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  When Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Enter the First Name
  And Add another one mobile number
  Then Get the name from the First Name field
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Click the Attached Customer
  Then Customer Profile screen is open to add the new customer details
  And Click the Delete button of existing mobile number
  And Click the save button in customer profile window
  Then Click the Logoff button

 Scenario: Verify the able to save with Notes
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  When Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Enter the First Name
  And Enter the Notes
  Then Get the name from the First Name field
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Verify the remove customer button in the retail screen
  Then Click the remove customer button
  Then Click the Logoff button

 Scenario: Verify the able to save with Address
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  When Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Enter the First Name
  And Click the add button under the address field
  Then Click the Enter Address button
  And Enter Add Address details
  Then Click the save button in Add Address
  Then Get the name from the First Name field
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Verify the remove customer button in the retail screen
  Then Click the remove customer button
  Then Click the Logoff button

 Scenario: Verify the able to save with enable Tax Exempt option
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  When Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Enter the First Name
  And Enable the Tax Exempt
  Then Get the name from the First Name field
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Check the Tax option is available or not in the Retail Screen after enabling the Tax Exempt
  And Verify the remove customer button in the retail screen
  Then Click the remove customer button
  Then Click the Logoff button

 Scenario: Verify the able to save with enable Tax Exempt option - Order with the standard item
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  When Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Enter the First Name
  And Enable the Tax Exempt
  Then Get the name from the First Name field
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Check the Tax option is available or not in the Retail Screen after enabling the Tax Exempt
  Then Order the Standard Item from the retail Screen
  And Check the Tax option is available or not in the Retail Screen after enabling the Tax Exempt
  And Complete the payment using fast cash button
  Then Click the Logoff button

 Scenario: Verify the able to save with enable Tax Exempt option - Order with the variant item
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  When Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Enter the First Name
  And Enable the Tax Exempt
  Then Get the name from the First Name field
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Check the Tax option is available or not in the Retail Screen after enabling the Tax Exempt
  Then Order the Variant item from the retail Screen
  And Check the Tax option is available or not in the Retail Screen after enabling the Tax Exempt
  And Complete the payment using fast cash button
  Then Click the Logoff button

 Scenario: Verify the able to save with enable Tax Exempt option - Order with the Kit Assembly item
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  When Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Enter the First Name
  And Enable the Tax Exempt
  Then Get the name from the First Name field
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Check the Tax option is available or not in the Retail Screen after enabling the Tax Exempt
  Then Order the Kit Assembly item from the retail Screen
  And Check the Tax option is available or not in the Retail Screen after enabling the Tax Exempt
  And Complete the payment using fast cash button
  Then Click the Logoff button

 Scenario: Verify the able to save with enable Tax Exempt option - Order with the standard and Variant item
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  When Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Enter the First Name
  And Enable the Tax Exempt
  Then Get the name from the First Name field
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Check the Tax option is available or not in the Retail Screen after enabling the Tax Exempt
  Then Order the Standard Item from the retail Screen
  And Order the Variant item from the retail Screen
  And Check the Tax option is available or not in the Retail Screen after enabling the Tax Exempt
  And Complete the payment using fast cash button
  Then Click the Logoff button

 Scenario: Verify the able to save with enable Tax Exempt option - Order with the standard and Kit Assembly item
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  When Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Enter the First Name
  And Enable the Tax Exempt
  Then Get the name from the First Name field
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Check the Tax option is available or not in the Retail Screen after enabling the Tax Exempt
  Then Order the Standard Item from the retail Screen
  And Order the Kit Assembly item from the retail Screen
  And Check the Tax option is available or not in the Retail Screen after enabling the Tax Exempt
  And Complete the payment using fast cash button
  Then Click the Logoff button

 Scenario: Verify the able to save with enable Tax Exempt option - Order with the Variant and Kit Assembly item
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  When Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Enter the First Name
  And Enable the Tax Exempt
  Then Get the name from the First Name field
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Check the Tax option is available or not in the Retail Screen after enabling the Tax Exempt
  Then Order the Variant item from the retail Screen
  And Order the Kit Assembly item from the retail Screen
  And Check the Tax option is available or not in the Retail Screen after enabling the Tax Exempt
  And Complete the payment using fast cash button
  Then Click the Logoff button


 Scenario Outline: Verify the able to save with Store Credit  - existing customer
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  And Add the customer and the Customer Number is <CustomerNumber>
  And Click the Attached Customer
  Then Customer Profile screen is open to add the new customer details
  And Click the Add Credit button
  Then Enter the Required amount in Add Credit popup and get the amount
  Then Get the name from the First Name field
  And Verify the entered credit amount
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Verify the remove customer button in the retail screen
  Then Click the remove customer button
  Then Click the Logoff button
  Examples:
   | CustomerNumber |
   | 123456       |

 Scenario Outline: Verify the able to save with edit Store Credit  - existing customer
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  And Add the customer and the Customer Number is <CustomerNumber>
  And Click the Attached Customer
  Then Customer Profile screen is open to add the new customer details
  And Click the Edit button of Credit option in customer profile screen
  Then Enter the Required amount in Add Credit popup and get the amount of edit
  Then Get the name from the First Name field
  And Verify the entered credit amount
  And Click the Edit button of Credit option in customer profile screen
  Then Clear the Add Credit value
  And Verify the cleared value of Add credit
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Verify the remove customer button in the retail screen
  Then Click the remove customer button
  Then Click the Logoff button
  Examples:
   | CustomerNumber |
   | 123456       |

 Scenario Outline: Verify the able to save with Store Credit  - existing customer with sale of standard item
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  And Add the customer and the Customer Number is <CustomerNumber>
  And Click the Attached Customer
  Then Customer Profile screen is open to add the new customer details
  And Click the Add Credit button
  Then Enter the amount in Add Credit popup and get the amount
  Then Get the name from the First Name field
  And Verify the entered credit amount
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Verify the remove customer button in the retail screen
  Then Order the Standard Item from the retail Screen
  And Click the option field at the bottom of custom options
  And Click Apply Store Credit option
  Then Verify the Apply Store Credit and enter the amount
  And Click the Apply Credit button then the "Store Credit Applied" is displayed
  Then Complete the payment using fast cash button
  And Add the customer and the Customer Number is <CustomerNumber>
  And Click the Attached Customer
  Then Customer Profile screen is open to add the new customer details
  And Verify the remaining value of Add credit
  And Click the Edit button of Credit option in customer profile screen
  Then Clear the Add Credit value
  And Verify the cleared value of Add credit
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Verify the remove customer button in the retail screen
  Then Click the remove customer button
  Then Click the Logoff button
  Examples:
   | CustomerNumber |
   | 123456       |

 Scenario Outline: Verify the able to save with Store Credit  - existing customer with sale of variant item
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  And Add the customer and the Customer Number is <CustomerNumber>
  And Click the Attached Customer
  Then Customer Profile screen is open to add the new customer details
  And Click the Add Credit button
  Then Enter the amount in Add Credit popup and get the amount
  Then Get the name from the First Name field
  And Verify the entered credit amount
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Verify the remove customer button in the retail screen
  Then Order the Variant item from the retail Screen
  And Click the option field at the bottom of custom options
  And Click Apply Store Credit option
  Then Verify the Apply Store Credit and enter the amount
  And Click the Apply Credit button then the "Store Credit Applied" is displayed
  Then Complete the payment using fast cash button
  And Add the customer and the Customer Number is <CustomerNumber>
  And Click the Attached Customer
  Then Customer Profile screen is open to add the new customer details
  And Verify the remaining value of Add credit
  And Click the Edit button of Credit option in customer profile screen
  Then Clear the Add Credit value
  And Verify the cleared value of Add credit
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Verify the remove customer button in the retail screen
  Then Click the remove customer button
  Then Click the Logoff button
  Examples:
   | CustomerNumber |
   | 123456       |

 Scenario Outline: Verify the able to save with Store Credit  - existing customer with sale of kit assembly item
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  And Add the customer and the Customer Number is <CustomerNumber>
  And Click the Attached Customer
  Then Customer Profile screen is open to add the new customer details
  And Click the Add Credit button
  Then Enter the amount in Add Credit popup and get the amount
  Then Get the name from the First Name field
  And Verify the entered credit amount
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Verify the remove customer button in the retail screen
  Then Order the Kit Assembly item from the retail Screen
  And Click the option field at the bottom of custom options
  And Click Apply Store Credit option
  Then Verify the Apply Store Credit and enter the amount
  And Click the Apply Credit button then the "Store Credit Applied" is displayed
  Then Complete the payment using fast cash button
  And Add the customer and the Customer Number is <CustomerNumber>
  And Click the Attached Customer
  Then Customer Profile screen is open to add the new customer details
  And Verify the remaining value of Add credit
  And Click the Edit button of Credit option in customer profile screen
  Then Clear the Add Credit value
  And Verify the cleared value of Add credit
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Verify the remove customer button in the retail screen
  Then Click the remove customer button
  Then Click the Logoff button
  Examples:
   | CustomerNumber |
   | 123456       |

 Scenario: Verify the able to update the Customer Plan - with out Limit and Max Limit
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  When Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Enter the First Name
  Then Get the name from the First Name field
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Click the Attached Customer
  Then Click the Customer Plan button
  Then Click the save button of customer plan
  And "Enter the Card Number" pop up will appear
  And Enter the wrong Card number
  Then Click the save button of customer plan
  And "Please enter the valid Numbers" pop up will appear
  Then Enter the Card number
  Then Enter the Required amount in Recharge
  And Click the save button of customer plan
  Then Click the Logoff button

 Scenario: Verify the able to update the Customer Plan - with Limit and Max Limit
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  When Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Enter the First Name
  Then Get the name from the First Name field
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Click the Attached Customer
  Then Click the Customer Plan button
  Then Enter the Card number
  Then Enter the Required amount in Recharge
  And Click the Amount box of Limit
  And "Please Enable the Limit Switch" pop up will appear
  Then Click the Amount box of Max Limit
  And "Please Enable the MaxLimit Switch" pop up will appear
  And Enable the Limit Toggle
  Then Enter the Required amount in Limit
  And Enable the Maximum Limit Toggle
  And Enter the Required amount in Max Limit
  Then Select the Limited Period
  And Enable the Allow Credit
  And Click the save button of customer plan
  Then Click the Logoff button

 Scenario Outline: Verify the able to Display the order
  Given Login with the valid credentials
  And Add the customer and the Customer Number is <CustomerNumber>
  Then Order the Standard Item from the retail Screen
  And Complete the payment using fast cash button
  And Add the customer and the Customer Number is <CustomerNumber>
  Then Click the Attached Customer
  And Select the any one previous order
  Then Click the Display Order button
  And Click the Back Arrow button from the display order receipt screen
  Then Click the save button in customer profile window
  And Click the Logoff button
  Examples:
   | CustomerNumber |
   | 123456       |

 Scenario Outline: Verify the able to Display the order - with out selecting the previous order
  Given Login with the valid credentials
  And Add the customer and the Customer Number is <CustomerNumber>
  Then Order the Standard Item from the retail Screen
  And Complete the payment using fast cash button
  And Add the customer and the Customer Number is <CustomerNumber>
  Then Click the Attached Customer
  Then Click the Display Order button
  Then "Please select any previous order" pop up will appear
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Verify the remove customer button in the retail screen
  Then Click the remove customer button
  Then Click the Logoff button
  Examples:
   | CustomerNumber |
   | 123456       |

 Scenario Outline: Verify the able to Repeat the order
  Given Login with the valid credentials
  And Add the customer and the Customer Number is <CustomerNumber>
  Then Order the Standard Item from the retail Screen
  Then Get the menu items,total and quantity from the retail screen
  And Complete the payment using fast cash button
  And Add the customer and the Customer Number is <CustomerNumber>
  Then Click the Attached Customer
  And Select the any one previous order
  Then Click the Repeat Order button
  Then Verify the Previously ordered item
  And Complete the payment using fast cash button
  And Click the Logoff button
  Examples:
   | CustomerNumber |
   | 123456       |

 Scenario Outline: Verify the able to Repeat the order - without choosing the previous order
  Given Login with the valid credentials
  And Add the customer and the Customer Number is <CustomerNumber>
  Then Order the Standard Item from the retail Screen
  Then Get the menu items,total and quantity from the retail screen
  And Complete the payment using fast cash button
  And Add the customer and the Customer Number is <CustomerNumber>
  Then Click the Attached Customer
  Then Click the Repeat Order button
  Then "Please select any previous order" pop up will appear
  And Click the save button in customer profile window
  Then Verify the added customer is displayed in ordering screen
  And Verify the remove customer button in the retail screen
  Then Click the remove customer button
  Then Click the Logoff button
  Examples:
   | CustomerNumber |
   | 123456       |
