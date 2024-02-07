Feature:  Customer Profile

 Scenario: customer Profile button in ordering screen

  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  Then Add customer popup is open
  And Verify the Add customer title is available in popup
  And verify By Name or Email search bar available in popup
  And verify ByMobile search available in popup
  Then Click the close button
  And Click the Logoff button

 Scenario: Verify the customer Profile

  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  And Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And verify the Search bar is available
  And Verify the First Name field
  And Verify the Last Name field
  And Verify the Customer identification number field
  And Validate the Email id field
  And Verify the Birthday field
  And Verify the Mobile numbers field
  And Verify the Nationality field
  And Verify the Address field
  And Verify the Note field
  And Verify the Tax Exempt toggle
  And Verify the Profile picture
  And Verify the Add credit button
  And Verify the Google Map
  And Verify the Previous Orders
  And Verify Customer plan button
  And Verify Display Order Button
  And Verify Repeat Order button
  And Verify the Save button
  And Verify the Cancel button
  Then Click the retail button
  And Click the Logoff button



 Scenario Outline: Alert  message validation for First Name

  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  And Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And verify the Search bar is available

  And Enter the First Name
  And Click the save button in customer profile window
  Then Alert message popup is fire <Alert_Message>
  And Click the Done button in popup

  And Enter the Last Name
  And Click the save button in customer profile window
  Then Alert message popup is fire <Alert_Message>
  And Click the Done button in popup

  And Enter the Customer identification number
  And Click the save button in customer profile window
  Then Alert message popup is fire <Alert_Message>
  And Click the Done button in popup

  And Enter the Email id
  And Click the save button in customer profile window
  Then Alert message popup is fire <Alert_Message>
  And Click the Done button in popup

  And Enter the Birthday
  And Click the save button in customer profile window
  Then Alert message popup is fire <Alert_Message>
  And Click the Done button in popup

  And Enter the Mobile number
  And Click the save button in customer profile window
  Then Alert message popup is fire <Alert_Message>
  And Click the Done button in popup

  And Enter the Nationality
  And Click the save button in customer profile window
  Then Alert message popup is fire <Alert_Message>
  And Click the Done button in popup

  And Enter the Address
  And Click the save button in customer profile window
  Then Alert message popup is fire <Alert_Message>
  And Click the Done button in popup

  And Click the save button in customer profile window
  Then Click the retail button
  And Click the Logoff button



  Examples:
   | First Name | Last Name | Customer identification number | Email id         | Birthday   | Mobile numbers | Nationality | Address                | Note          | Address Line 1     | Address Line 2 | City  | State    | Zip Code | Country       | Gate Code | Alert_Message                          |
   | Satish     | Kumar     | 1234567                        | Sathish@mail.com | 09/01/2005 | 9797665601     | Hindu       | Avadi, chennai, 600005 | customer note | 3076 Wildrose Lane | Oklahoma       | Tulsa | Oklahoma | 74120    | United States | 89977     | Please fill in all the required fields |


 Scenario Outline: customer Profile button in ordering screen
  #verify the user able to save the new customer

  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  And Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Given Mobile number is added in mobile field
  And Enter the <First Name> and <Last Name>
  And Enter the <Customer identification number>
  And Enter valida <Email id> and <Birthday>
  And Add Mobile number pad is open
  And Enter the valid Mobile number and click coutinue button
  Then Select the Mobile number and click the edit button
  And The number pad is open with Mobile numbers
  And Edit the Mobile number and click the coutinue button
  Then Select the Mobile number and click the delete button
  Then Add one or more <Mobile numbers>
  And Add one or more <Address>
  And Add <Nationality> and <Note>
  And Click the save button in customer profile window
  Then Click the retail button
  And Click the Logoff button


  Examples:
   | First Name |Last Name | Customer identification number | Email id | Birthday | Mobile numbers| Nationality | Address | Note |
   | Satish | Kumar        | 1234567                        | Sathish@mail.com|  09/01/2005| 9797665601 |Hindu | Avadi, chennai, 600005 |  customer note |


 Scenario Outline: Add the another one Mobile number
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  And Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Add one or more <Mobile numbers1>
  And Click add button number pad is open
  And Enter the new customer <Mobile numbers>
  And Click the coutinue the Mobile numbers is added

  And Add one or more <Mobile numbers2>
  And Click add button number pad is open
  And Enter the new customer <Mobile numbers>
  And Click the coutinue the Mobile numbers is added

  And Click the save button in customer profile window
  Then Click the retail button
  And Click the Logoff button

  Examples:
   | First Name |Last Name | Customer identification number | Email id | Birthday | Mobile numbers1 | Nationality | Address | Note |  Mobile numbers2|
   | Satish | Kumar        | 1234567                        | Sathish@mail.com|  09/01/2005| 9797665601 |Hindu | Avadi, chennai, 600005 |  customer note | 09797665601|


 Scenario Outline: Edit the Mobile number

  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
    And Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details

  And Select the <Mobile numbers1>
  And Click Edit button number pad is open with mobile number
  And Edit the mobile number
  And Click the coutinue the Mobile numbers is Edited

  And Select the <Mobile numbers2>
  And Click Edit button number pad is open with mobile number
  And Edit the mobile number
  And Click the coutinue the Mobile numbers is Edited

  And Click the save button in customer profile window
  Then Click the retail button
  And Click the Logoff button

  Examples:
   | First Name |Last Name | Customer identification number | Email id | Birthday | Mobile numbers1 | Nationality | Address | Note |  Mobile numbers2|
   | Satish | Kumar        | 1234567                        | Sathish@mail.com|  09/01/2005| 9797665601 |Hindu | Avadi, chennai, 600005 |  customer note | 09797665601|

 Scenario Outline: Edit the Mobile number

  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
    And Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details

  And Select the <Mobile numbers1>
  And Click Delete button
  And mobile number deleted


  And Select the <Mobile numbers2>
  And Click Delete button
  And mobile number deleted

  And Click the save button in customer profile window
  Then Click the retail button
  And Click the Logoff button

  Examples:
   | First Name |Last Name | Customer identification number | Email id | Birthday | Mobile numbers1 | Nationality | Address | Note |  Mobile numbers2|
   | Satish | Kumar        | 1234567                        | Sathish@mail.com|  09/01/2005| 9797665601 |Hindu | Avadi, chennai, 600005 |  customer note | 09797665601|


 Scenario Outline: Add Address
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
    And Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details

  And Add one or more <Address>
  Then Address search box is open
  And Search the area name and select the address in dropdown
  And Click the Enter Address button the Add Address popup is open
  And Enter the <Address Line 1>
  And Enter the <Address Line 2>
  And Enter the <City> and <State>
  And Enter the <Zip Code> and <Country>
  And Enter the <Gate Code>
  And CLick the Save button
  And Click the save button in customer profile window
  Then Click the retail button
  And Click the Logoff button

  Examples:
   | First Name |Last Name | Customer identification number | Email id | Birthday | Mobile numbers| Nationality | Address | Note | Address Line 1 | Address Line 2 |City | State | Zip Code | Country | Gate Code |
   | Satish | Kumar        | 1234567                        | Sathish@mail.com|  09/01/2005| 9797665601 |Hindu | Avadi, chennai, 600005 |  customer note | 3076 Wildrose Lane | Oklahoma | Tulsa|Oklahoma|74120|United States| 89977|


 Scenario Outline: Use the cancel in Address
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
    And Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details

  And Add one or more <Address>
  Then Address search box is open
  And Search the area name and select the address in dropdown
  And Click the Enter Address button the Add Address popup is open
  And Enter the <Address Line 1>
  And Enter the <Address Line 2>
  And Enter the <City> and <State>
  And Enter the <Zip Code> and <Country>
  And Enter the <Gate Code>
  And CLick the Save button

  And Click the Cancel button in Add Address popup
  And Click the save button in customer profile window
  Then Click the retail button
  And Click the Logoff button

  Examples:
   | First Name |Last Name | Customer identification number | Email id | Birthday | Mobile numbers| Nationality | Address | Note | Address Line 1 | Address Line 2 |City | State | Zip Code | Country | Gate Code |
   | Satish | Kumar        | 1234567                        | Sathish@mail.com|  09/01/2005| 9797665601 |Hindu | Avadi, chennai, 600005 |  customer note | 3076 Wildrose Lane | Oklahoma | Tulsa|Oklahoma|74120|United States| 89977|

 Scenario Outline: Edit  in Address
  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
    And Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  Then Select the existing <Address> in customer profile
  And Click the edit button
  And Add Address popup is open with existing address
  And Edit the Address
  And Click the Save button


  And Click the Cancel button in Add Address popup
  And Click the save button in customer profile window
  Then Click the retail button
  And Click the Logoff button

  Examples:
   | First Name |Last Name | Customer identification number | Email id | Birthday | Mobile numbers| Nationality | Address | Note | Address Line 1 | Address Line 2 |City | State | Zip Code | Country | Gate Code |
   | Satish | Kumar        | 1234567                        | Sathish@mail.com|  09/01/2005| 9797665601 |Hindu | Avadi, chennai, 600005 |  customer note | 3076 Wildrose Lane | Oklahoma | Tulsa|Oklahoma|74120|United States| 89977|

 Scenario Outline: Enable Tax Exempt

  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
    And Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Enable the <Tax Exempt>
  And Click the save button in customer profile window
  Then Click the retail button
  And Click the Logoff button



  Examples:
   | First Name |Last Name | Customer identification number | Email id | Birthday | Mobile numbers| Nationality | Address | Note | Tax Exempt |
   | Satish | Kumar        | 1234567                        | Sathish@mail.com|  09/01/2005| 9797665601 |Hindu | Avadi, chennai, 600005 |  customer note | Enable |


 Scenario Outline: Disable Tax Exempt

  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
    And Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Enable the <Tax Exempt>
  And Click the save button in customer profile window
  Then Click the retail button
  And Click the Logoff button



  Examples:
   | First Name |Last Name | Customer identification number | Email id | Birthday | Mobile numbers| Nationality | Address | Note | Tax Exempt |
   | Satish | Kumar        | 1234567                        | Sathish@mail.com|  09/01/2005| 9797665601 |Hindu | Avadi, chennai, 600005 |  customer note | Disable |

 Scenario Outline: Loyalty

  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  And Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Click the Loyalty button in customer Profile screen
  Then Loyalty balance popup is open
  And CLick the cancel button
  And  Loyalty balance popup is closed
  And Click the save button in customer profile window
  Then Click the retail button
  And Click the Logoff button




  Examples:
   | First Name |Last Name | Customer identification number | Email id | Birthday | Mobile numbers| Nationality | Address | Note | Tax Exempt |
   | Satish | Kumar        | 1234567                        | Sathish@mail.com|  09/01/2005| 9797665601 |Hindu | Avadi, chennai, 600005 |  customer note | Disable |

 Scenario Outline: Customer Plan

  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  And Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Click the Customer Plan button in customer Profile screen
  Then Verify the <Account Type>
  Then Customer <Name1>
  Then Verify <Balance>
  Then Verify <Card Number>
  Then Verify <Recharge>
  Then Verify <Limit>
  And Enable the Limit toggle
  Then Verify <Max Limit>
  And Enable the Max Limit toggle
  Then Verify the <Limit Period>
  And Select the options in drop down
  Then Verify the toggle  <Allow Credit>
  And Click the save button in customer Account window
  Then Click the retail button
  And Click the Logoff button




  Examples:
   | First Name |Last Name | Customer identification number | Email id | Birthday | Mobile numbers| Nationality | Address | Note | Tax Exempt |Name1| Account Type| Card Number| Recharge |
   | Satish | Kumar        | 1234567                        | Sathish@mail.com|  09/01/2005| 9797665601 |Hindu | Avadi, chennai, 600005 |  customer note | Disable |Sathish| House Account| 1111 1111 1111 1111 | 100.00|


 Scenario Outline: Error validation in Customer Plan

  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  And Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Click the Customer Plan button in customer Profile screen
  Then Verify the <Account Type>
  And Click the save button in customer Account window

  Then Enter the card number <Card Number>
  And Click the save button in customer Account window
  And Erro message is open <Error Message1>
  And Click the Done button in popup



  Then Customer <Name1>
  Then Enter <Balance>

  Then Enter recharge amount <Recharge>
  Then Verify <Limit>
  And Enable the Limit toggle
  Then Verify <Max Limit>
  And Enable the Max Limit toggle

  Then Verify the <Limit Period>
  And Select the options in drop down
  Then Verify the toggle  <Allow Credit>
  And Enable the toggle <Allow Credit>
  And Click the save button in customer Account window
  Then Click the retail button
  And Click the Logoff button




  Examples:
   | First Name |Last Name | Customer identification number | Email id | Birthday | Mobile numbers| Nationality | Address | Note | Tax Exempt |Name1| Account Type| Card Number| Recharge |Error Message1|
   | Satish | Kumar        | 1234567                        | Sathish@mail.com|  09/01/2005| 9797665601 |Hindu | Avadi, chennai, 600005 |  customer note | Disable |Sathish| House Account| 1111 1111 1111 1111 | 100.00|Enter the Card Number|

 Scenario Outline: Display Order

  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  And Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Click the Customer Plan button in customer Profile screen
  And Click the Display Order  button
  Then Error message is firing <Error Message>
  And Select any one order in Previous Orders  list
  And Order digital recepit is displaying
  And Click the back arrow
  And Back to customer Profile screen
  Then Click the retail button
  And Click the Logoff button


  Examples:
   |Error Message|
   |Please select any previous order|

 Scenario Outline: Repeat Order

  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  And Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Click the Customer Plan button in customer Profile screen
  And Click the Repeat Order  button
  Then Error message is firing <Error Message>
  And Select any one order in Repeat Orders  list
  And Order screen is displayed with Previous ordered items With customer name
  And CLick the payment
  And Select the cash in Payment method and click the submit button
  And And close the order
  Then Click the retail button
  And Click the Logoff button


  Examples:
   |Error Message|
   |Please select any previous order|

 Scenario: STORE CREDIT

  Given Login with the valid credentials
  And Click the Add customer button in ordering screen
  And Add the customer Mobile number
  And click the Add customer
  Then Customer Profile screen is open to add the new customer details
  And Click the Store Credit button in customer Profile screen
  And Store Credit popup is order
  And Enter the Amount and click the Add Credit button
  And Click the edit button
  And Enter the amount and click the countine button
  Then Click the retail button
  And Click the Logoff button





