Feature: Operations_POS

  Scenario: Verify the visibility when user click the operation button
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    Then Click the Settings icon from the Retail Screen
    And Click the Logoff button

    Scenario: Verify the options availability in the Operation When user clicks the Operation
      Given Login with the valid credentials
      Then Page will navigate to the retail order screen
      And Able to view the Operation button
      When Click the Settings icon from the Retail Screen
      Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
      When Click the Operation button
      Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
      And Click the POS option
      Then Click the Logoff button

  Scenario: Verify the retail screen is displayed or not when click the POS option from the Operation options
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    When Click the Operation button
    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
    And Click the POS option
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
    Then Click the Logoff button

  Scenario: Verify the options in Till Management - Till screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    When Click the Operation button
    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
    And Click the Till Management option
    Then Check the Till Management screen is displayed or not
    And Check the Till option is displayed or not and it should selected by default
    And Check the Set Till option is displayed or not and it should selected by default
    Then Check the Active Till option is displayed or not
    And Check the Held Till option is displayed or not
    Then Check the Closed Till option is displayed or not
    Then Check the Cash Drop option is displayed or not
    And Check the Pay In option is displayed or not
    Then Check the Pay Out option is displayed or not
    And Check the Open Cash Drawer option is displayed or not
    Then Check the Reports option is displayed or not
    And Check the OPEN TILL option is displayed or not
    Then Check the Numpad option is displayed or not
    And Check the Continue option is displayed or not
    Then Check the Open By option is displayed or not
    And Check the Global Till option is displayed or not
    Then Check the Other Total option is displayed or not
    And Check the Total option is displayed or not
    Then Click the Menu option
    And Click the POS option
    Then Click the Logoff button

  Scenario: Verify the options in Till Management - Active Till
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    When Click the Operation button
    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
    And Click the Till Management option
    Then Check the Till Management screen is displayed or not
    And Check the Till option is displayed or not and it should selected by default
    And Click the Active Till option
    And Check the Active Till option is displayed or not and it should selected
    Then Check the Date&Time Column option is displayed or not
    And Check the Till Name Column option is displayed or not
    Then Check the User Column option is displayed or not
    And Check the Device Column option is displayed or not
    Then Check the Till Balance Column option is displayed or not
    And Check the Hold Till option is displayed or not
    And Check the Close Till option is displayed or not
    Then Click the Menu option
    And Click the POS option
    Then Click the Logoff button

  Scenario: Verify the options in Till Management - Held Till
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    When Click the Operation button
    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
    And Click the Till Management option
    Then Check the Till Management screen is displayed or not
    And Check the Till option is displayed or not and it should selected by default
    And Click the Held Till option
    And Check the Held Till option is displayed or not and it should selected
    Then Check the Date&Time Column option is displayed or not
    And Check the Till Name Column option is displayed or not
    Then Check the User Column option is displayed or not
    And Check the Device Column option is displayed or not
    Then Check the Till Balance Column option is displayed or not
    And Check the Close Till option is displayed or not
    Then Click the Menu option
    And Click the POS option
    Then Click the Logoff button

  Scenario: Verify the options in Till Management - Closed Till
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    When Click the Operation button
    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
    And Click the Till Management option
    Then Check the Till Management screen is displayed or not
    And Check the Till option is displayed or not and it should selected by default
    And Click the Closed Till option
    And Check the Closed Till option is displayed or not and it should selected
    Then Check the Date&Time Column option is displayed or not
    And Check the Till Name Column option is displayed or not
    Then Check the User Column option is displayed or not
    And Check the Device Column option is displayed or not
    Then Check the Till Balance Column option is displayed or not
    And Check the Adjust Till option is displayed or not
    Then Click the Menu option
    And Click the POS option
    Then Click the Logoff button

  Scenario: Verify the options in Till Management - Cash Drop
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    When Click the Operation button
    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
    And Click the Till Management option
    Then Check the Till Management screen is displayed or not
    And Click the Cash Drop option and it should be selected
    Then Check the Numpad option is displayed or not
    And Check the Continue option is displayed or not
    Then Click the Menu option
    And Click the POS option
    Then Click the Logoff button

  Scenario: Verify the options in Till Management - Pay In screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    When Click the Operation button
    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
    And Click the Till Management option
    Then Check the Till Management screen is displayed or not
    And Click the Pay In option and it should be selected
    And Check the Paid By option is displayed or not
    Then Check the Numpad option is displayed or not
    And Check the Continue option is displayed or not
    Then Click the Menu option
    And Click the POS option
    Then Click the Logoff button

  Scenario: Verify the options in Till Management - Pay Out screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    When Click the Operation button
    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
    And Click the Till Management option
    Then Check the Till Management screen is displayed or not
    And Click the Pay Out option and it should be selected
    And Check the Paid To option is displayed or not
    Then Check the Numpad option is displayed or not
    And Check the Continue option is displayed or not
    Then Click the Menu option
    And Click the POS option
    Then Click the Logoff button

  Scenario: Verify the options in Till Management - Open Cash Drawer screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    When Click the Operation button
    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
    And Click the Till Management option
    Then Check the Till Management screen is displayed or not
    And Click the Open Cash Drawer option and it should be selected
    And Check the Open Cash Drawer button is displayed or not
    Then Click the Menu option
    And Click the POS option
    Then Click the Logoff button

  Scenario: Verify the options in Till Management - Open Cash Drawer screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    When Click the Operation button
    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
    And Click the Till Management option
    Then Check the Till Management screen is displayed or not
    And Click the Open Cash Drawer option and it should be selected
    And Check the Open Cash Drawer button is displayed or not
    Then Click the Menu option
    And Click the POS option
    Then Click the Logoff button

  Scenario: Verify the options in Till Management - Reports screen
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    When Click the Operation button
    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
    And Click the Till Management option
    Then Check the Till Management screen is displayed or not
    And Click the Reports option and it should be selected
    And Check the Total Net Sale is displayed or not
    Then Check the Gross Sale is displayed or not
    And Check the New Customers is displayed or not
    Then Check the Net Void is displayed or not
    And Check the Details is displayed or not
    And Check the User button is displayed or not
    And Check the From Date is displayed or not
    And Check the To Date is displayed or not
    And Check the Cover Count is displayed or not
    And Check the Sales is displayed or not
    And Check the Gross Sales is displayed or not
    And Check the Net Sales is displayed or not
    And Check the Non-Taxable Net Sales is displayed or not
    And Check the Grand Sales is displayed or not
    And Check the Gross Receipt is displayed or not
    And Check the Gross Void is displayed or not
    And Check the Net Void is displayed or not
    And Check the Payment Summary is displayed or not
    And Check the Credit Card is displayed or not
    And Check the Side CC is displayed or not
    And Check the Other Payment is displayed or not
    And Check the Total is displayed or not
    And Check the Summary is displayed or not
    And Check the Print button is displayed or not
    And Check the Cashier Out button is displayed or not
    And Check the Close Day button is displayed or not
    Then Click the Menu option
    And Click the POS option
    Then Click the Logoff button

  Scenario: Verify user able to create the open till with zero balance
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    When Click the Operation button
    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
    And Click the Till Management option
    Then Check the Till Management screen is displayed or not
    And Check the Till option is displayed or not and it should selected by default
    And Check the Set Till option is displayed or not and it should selected by default
    When Click the continue button
    Then Application should navigate to the Active Till screen with the created till
    And Select the till from the Active Till
    Then Click the Close Till button
    And Check the "Do you want to close the till" popup and click the yes button
    Then Click the continue button
    And Click the Submit button
    Then Application should navigate to the Closed Till screen with the closed till
    Then Click the Menu option
    And Click the POS option
    Then Click the Logoff button

  Scenario: Verify user able to create the open till with zero balance and add menu item
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    When Click the Operation button
    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
    And Click the Till Management option
    Then Check the Till Management screen is displayed or not
    And Check the Till option is displayed or not and it should selected by default
    And Check the Set Till option is displayed or not and it should selected by default
    When Click the continue button
    Then Application should navigate to the Active Till screen with the created till
    And Click the Menu option
    And Click the POS option
    Then Order the Standard Item from the retail Screen
    And Complete the payment using fast cash button
    Then Click the Settings icon from the Retail Screen
    And Click the Operation button
    Then Click the Till Management option
    And Verify the Till amount should be update in the Active Till screen
    And Select the till from the Active Till
    Then Click the Close Till button
    And Check the "Do you want to close the till" popup and click the yes button
    And Enter the Required amount
    Then Click the continue button
    And Click the Submit button
    Then Application should navigate to the Closed Till screen with the closed till
    Then Click the Menu option
    And Click the POS option
    Then Click the Logoff button

  Scenario: Verify user able to create the open till with some balance
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    When Click the Operation button
    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
    And Click the Till Management option
    Then Check the Till Management screen is displayed or not
    And Check the Till option is displayed or not and it should selected by default
    And Check the Set Till option is displayed or not and it should selected by default
    Then Enter the Required amount
    When Click the continue button
    Then Application should navigate to the Active Till screen with the created till
    And Select the till from the Active Till
    Then Click the Close Till button
    And Check the "Do you want to close the till" popup and click the yes button
    And Enter the same amount what user entered while create the till
    Then Click the continue button
    And Click the Submit button
    Then Application should navigate to the Closed Till screen with the closed till
    Then Click the Menu option
    And Click the POS option
    Then Click the Logoff button

  Scenario: Verify user able to create the open till with some balance and add menu item
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    When Click the Operation button
    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
    And Click the Till Management option
    Then Check the Till Management screen is displayed or not
    And Check the Till option is displayed or not and it should selected by default
    And Check the Set Till option is displayed or not and it should selected by default
    Then Enter the Required amount
    When Click the continue button
    Then Application should navigate to the Active Till screen with the created till
    And Click the Menu option
    And Click the POS option
    Then Order the Standard Item from the retail Screen
    And Complete the payment using fast cash button
    Then Click the Settings icon from the Retail Screen
    And Click the Operation button
    Then Click the Till Management option
    And Verify the Till amount should be update in the Active Till screen
    And Select the till from the Active Till
    Then Click the Close Till button
    And Check the "Do you want to close the till" popup and click the yes button
    And Enter the Required amount
    Then Click the continue button
    And Click the Submit button
    Then Application should navigate to the Closed Till screen with the closed till
    Then Click the Menu option
    And Click the POS option
    Then Click the Logoff button

  Scenario: Verify user able to set the till while user have the active till
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    When Click the Operation button
    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
    And Click the Till Management option
    Then Check the Till Management screen is displayed or not
    And Check the Till option is displayed or not and it should selected by default
    And Check the Set Till option is displayed or not and it should selected by default
    When Click the continue button
    Then Application should navigate to the Active Till screen with the created till
    Then Click the Set Till button the "Already Have an Active Till" message is displayed or not
    And Select the till from the Active Till
    Then Click the Close Till button
    And Check the "Do you want to close the till" popup and click the yes button
    Then Click the continue button
    And Click the Submit button
    Then Application should navigate to the Closed Till screen with the closed till
    Then Click the Menu option
    And Click the POS option
    Then Click the Logoff button

  Scenario: Verify the error message when user click the Close till without selecting the till
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    When Click the Operation button
    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
    And Click the Till Management option
    Then Check the Till Management screen is displayed or not
    And Check the Till option is displayed or not and it should selected by default
    And Check the Set Till option is displayed or not and it should selected by default
    When Click the continue button
    Then Application should navigate to the Active Till screen with the created till
    Then Click the Close Till button the "Select till to proceed" message is displayed or not
    And Click the Hold Till button the "Select till to proceed" message is displayed or not
    And Select the till from the Active Till
    Then Click the Close Till button
    And Check the "Do you want to close the till" popup and click the yes button
    Then Click the continue button
    And Click the Submit button
    Then Application should navigate to the Closed Till screen with the closed till
    Then Click the Menu option
    And Click the POS option
    Then Click the Logoff button

    Scenario: Verify the Hold till
      Given Login with the valid credentials
      Then Page will navigate to the retail order screen
      And Able to view the Operation button
      When Click the Settings icon from the Retail Screen
      Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
      When Click the Operation button
      Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
      And Click the Till Management option
      Then Check the Till Management screen is displayed or not
      And Check the Till option is displayed or not and it should selected by default
      And Check the Set Till option is displayed or not and it should selected by default
      Then Enter the Required amount
      And Click the continue button
      Then Application should navigate to the Active Till screen with the created till
      And Select the till from the Active Till
      Then Click the Hold till button
      And Check the "Do you want to hold this till" popup and click the yes button
      Then Application should navigate to the Held Till screen with the created till
      And Select the till from the Held Till
      Then Click the Close Till button
      And Check the "Do you want to close the till" popup and click the yes button
      And Enter the same amount what user entered while create the till
      Then Click the continue button
      And Click the Submit button
      Then Application should navigate to the Closed Till screen with the closed till
      Then Click the Menu option
      And Click the POS option
      Then Click the Logoff button

  Scenario: Verify user try to create the cash drop with out the active till
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    When Click the Operation button
    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
    And Click the Till Management option
    Then Check the Till Management screen is displayed or not
    And Check the Till option is displayed or not and it should selected by default
    And Check the Set Till option is displayed or not and it should selected by default
    Then Click the Cash Drop option and it should be selected
    Then Enter the Required amount
    And Click the continue button
    Then "Till not found" pop up will appear
    Then Click the Menu option
    And Click the POS option
    Then Click the Logoff button

  Scenario: Verify user try to cash drop by zero
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    When Click the Operation button
    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
    And Click the Till Management option
    Then Check the Till Management screen is displayed or not
    And Check the Till option is displayed or not and it should selected by default
    And Check the Set Till option is displayed or not and it should selected by default
    Then Click the Cash Drop option and it should be selected
    Then Enter the Required amount
    And Click the continue button and "Please enter the amount" message is displayed or not
    Then Click the Menu option
    And Click the POS option
    Then Click the Logoff button

  Scenario: Verify the Cash drop by the limited amount
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    When Click the Operation button
    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
    And Click the Till Management option
    Then Check the Till Management screen is displayed or not
    And Check the Till option is displayed or not and it should selected by default
    And Check the Set Till option is displayed or not and it should selected by default
    Then Enter the Required amount as Thousand
    And Click the continue button
    Then Application should navigate to the Active Till screen with the created till
    Then Click the Cash Drop option and it should be selected
    Then Enter the Required amount as hundred
    And Click the continue button and "Cash Drop Performed Successfully" message is displayed or not
    And Click the Till Option
    Then The till amount should reduced as nine hundred
    And Select the till from the Active Till
    Then Click the Close Till button
    And Check the "Do you want to close the till" popup and click the yes button
    Then Click the continue button
    And Click the Submit button
    Then Application should navigate to the Closed Till screen with the closed till
    Then Click the Menu option
    And Click the POS option
    Then Click the Logoff button

  Scenario: Verify the Cash drop by the exceeded amount
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    When Click the Operation button
    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
    And Click the Till Management option
    Then Check the Till Management screen is displayed or not
    And Check the Till option is displayed or not and it should selected by default
    And Check the Set Till option is displayed or not and it should selected by default
    Then Enter the Required amount as Thousand
    And Click the continue button
    Then Application should navigate to the Active Till screen with the created till
    Then Click the Cash Drop option and it should be selected
    Then Enter the Required amount as thousand and hundred
    And "Insufficient amount entered" pop up will appear
    Then Enter the Required amount as hundred
    And Click the continue button and "Cash Drop Performed Successfully" message is displayed or not
    And Click the Till Option
    Then The till amount should reduced as nine hundred
    And Select the till from the Active Till
    Then Click the Close Till button
    And Check the "Do you want to close the till" popup and click the yes button
    Then Click the continue button
    And Click the Submit button
    Then Application should navigate to the Closed Till screen with the closed till
    Then Click the Menu option
    And Click the POS option
    Then Click the Logoff button

  Scenario: Verify the Pay In amount in the till amount
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    When Click the Operation button
    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
    And Click the Till Management option
    Then Check the Till Management screen is displayed or not
    And Check the Till option is displayed or not and it should selected by default
    And Check the Set Till option is displayed or not and it should selected by default
    Then Enter the Required amount as Thousand
    And Click the continue button
    Then Application should navigate to the Active Till screen with the created till
    Then Click the Pay In option and it should be selected
    And Enter the paid by text
    Then Enter the Required amount as hundred
    And Click the continue button
    Then Select the Reason from the list
    And Click the Add button and "Paid In Performed Successfully" message is displayed or not
    And Click the Till Option
    Then The till amount should shows as "1100.00"
    And Select the till from the Active Till
    Then Click the Close Till button
    And Check the "Do you want to close the till" popup and click the yes button
    Then Click the continue button
    And Click the Submit button
    Then Application should navigate to the Closed Till screen with the closed till
    Then Click the Menu option
    And Click the POS option
    Then Click the Logoff button

  Scenario: Verify the Pay In with out amount and Paid By
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    When Click the Operation button
    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
    And Click the Till Management option
    Then Check the Till Management screen is displayed or not
    And Check the Till option is displayed or not and it should selected by default
    And Check the Set Till option is displayed or not and it should selected by default
    Then Click the Pay In option and it should be selected
    And Click the continue button and "Please enter the amount" message is displayed or not
    Then Enter the Required amount
    And Click the continue button
    Then "Enter the Paid From" pop up will appear
    Then Click the Menu option
    And Click the POS option
    Then Click the Logoff button

  Scenario: Verify the Pay Out amount in the till amount
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    When Click the Operation button
    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
    And Click the Till Management option
    Then Check the Till Management screen is displayed or not
    And Check the Till option is displayed or not and it should selected by default
    And Check the Set Till option is displayed or not and it should selected by default
    Then Enter the Required amount as Thousand
    And Click the continue button
    Then Application should navigate to the Active Till screen with the created till
    Then Click the Pay Out option and it should be selected
    And Enter the paid to text
    Then Enter the Required amount as hundred
    And Click the continue button
    Then Select the Reason from the list
    And Click the Add button and "Paid Out Performed Successfully" message is displayed or not
    And Click the Till Option
    Then The till amount should shows as "900.00"
    And Select the till from the Active Till
    Then Click the Close Till button
    And Check the "Do you want to close the till" popup and click the yes button
    Then Click the continue button
    And Click the Submit button
    Then Application should navigate to the Closed Till screen with the closed till
    Then Click the Menu option
    And Click the POS option
    Then Click the Logoff button

  Scenario: Verify the Pay Out with out amount and Paid To
    Given Login with the valid credentials
    Then Page will navigate to the retail order screen
    And Able to view the Operation button
    When Click the Settings icon from the Retail Screen
    Then View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options
    When Click the Operation button
    Then View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office
    And Click the Till Management option
    Then Check the Till Management screen is displayed or not
    And Check the Till option is displayed or not and it should selected by default
    And Check the Set Till option is displayed or not and it should selected by default
    Then Click the Pay In option and it should be selected
    And Click the continue button and "Please enter the amount" message is displayed or not
    Then Enter the Required amount
    And Click the continue button
    Then "Enter the Paid To" pop up will appear
    Then Click the Menu option
    And Click the POS option
    Then Click the Logoff button