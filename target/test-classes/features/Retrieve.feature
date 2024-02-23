@Retrieve
Feature:  Retrieve

  Scenario Outline: Retrieve button
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the single retail standard item with Inclusive tax
    And  Click the Retrieve button
    Then Alert popup message is displaying <Alert_Message>
    Then Void the Ordered items from the Retail Screen
    And  Click the Logoff button

    Examples:
      | CustomerNum | Alert_Message                     |
      | 123456      | Please close your sale to proceed |


  Scenario Outline: Retrieve button "No Parked Receipts Found" message appear
    Given Login with the valid credentials
    And   Click the Retrieve button with out any parked sale is available
    And   Retrieve popup is open with the <Message>
    And Click the cancel button
    And  Click the Logoff button

     Examples:
       | Message                  |
       | No Parked Receipts Found |


  Scenario Outline: Retrieve button "No Parked Receipts Found" message appear
    Given Login with the valid credentials
    And   Click the Retrieve button with out any parked sale is available
    And   Retrieve popup is open with the <Message>
    Then Verify the title in the popup <Popup_title>
    Then Verify the search is available
    Then Verify the cancel button in left button corner
#    Then Verify the parked sales are listed in popup
    And Click the cancel button
    And  Click the Logoff button

    Examples:
      | Message                  | Popup_title |
      | No Parked Receipts Found |Parked Sales |


  Scenario Outline: In Retrieve search the receipt number
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the single retail standard item with Inclusive tax
    Then Get the Check number from the retail screen
    Then Get the Customer Name from the retail screen
    And Click the park button in ordering screen
    And Enter the reason and click the park button
    And Sale is parked message is displaying <Message>
    And click the retrieve sale button
    And select the same check
    Then In that check will be reopen in ordering screen
    And The message is appear <Retrieve_message>
    And Complete the payment using fast cash button
      And  Click the Logoff button

      Examples:
        | CustomerNum | Message        | Retrieve_message          | 
        | 123456      | Sale is parked | Parked sales is retrieved | 


  Scenario Outline: retail retail standard item with Inclusive tax Retrieve check
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    Then Get the Check number from the retail screen
    Then Get the Customer Name from the retail screen
    And Place the single retail standard item with Inclusive tax
    And Click the park button in ordering screen
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And click the retrieve sale button
    And select the same check
    Then In that check will be reopen in ordering screen
    And The message is appear <Retrieve_message>
    And Complete the payment using fast cash button
    And  Click the Logoff button

    Examples:
      | CustomerNum | Message        | Retrieve_message          | 
      | 123456      | Sale is parked | Parked sales is retrieved | 

  Scenario Outline: retail Variant item with Inclusive tax Retrieve check
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    Then Get the Check number from the retail screen
    Then Get the Customer Name from the retail screen
    And Place the single retail Variant item with Inclusive tax
    And Click the park button in ordering screen
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And click the retrieve sale button
    And select the same check
    Then In that check will be reopen in ordering screen
    And The message is appear <Retrieve_message>
    And Complete the payment using fast cash button
    And  Click the Logoff button

    Examples:
      | CustomerNum | Message        | Retrieve_message          | 
      | 123456      | Sale is parked | Parked sales is retrieved | 


  Scenario Outline: retail Variant item with Exclusive tax Retrieve check
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    Then Get the Check number from the retail screen
    Then Get the Customer Name from the retail screen
    And Place the single retail Variant item with Exclusive tax
    And Click the park button in ordering screen
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And click the retrieve sale button
    And select the same check
    Then In that check will be reopen in ordering screen
    And The message is appear <Retrieve_message>
    And Complete the payment using fast cash button
    And  Click the Logoff button

    Examples:
      | CustomerNum | Message        | Retrieve_message          | 
      | 123456      | Sale is parked | Parked sales is retrieved | 

  Scenario Outline: retail retail standard item Exclusive tax Retrieve check
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    Then Get the Check number from the retail screen
    Then Get the Customer Name from the retail screen
    And Place the single retail standard item with Exclusive tax
    And Click the park button in ordering screen
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And click the retrieve sale button
    And select the same check
    Then In that check will be reopen in ordering screen
    And The message is appear <Retrieve_message>
    And Complete the payment using fast cash button
    And  Click the Logoff button

    Examples:
      | CustomerNum | Message        | Retrieve_message          | 
      | 123456      | Sale is parked | Parked sales is retrieved | 

  Scenario Outline: Multiple retail retail standard item Exclusive tax Retrieve check
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Order the Standard Item from the retail Screen
    Then Get the Check number from the retail screen
    Then Get the Customer Name from the retail screen
    And Click the park button in ordering screen
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And click the retrieve sale button
    And select the same check
    Then In that check will be reopen in ordering screen
    And The message is appear <Retrieve_message>
    And Complete the payment using fast cash button
    And  Click the Logoff button

    Examples:
      | CustomerNum | Message        | Retrieve_message          | 
      | 123456      | Sale is parked | Parked sales is retrieved | 

  Scenario Outline: Multiple retail retail standard item Inclusive tax Retrieve check
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the Multiple retail standard item with Inclusive tax
    Then Get the Check number from the retail screen
    Then Get the Customer Name from the retail screen
    And Click the park button in ordering screen
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And click the retrieve sale button
    And select the same check
    Then In that check will be reopen in ordering screen
    And The message is appear <Retrieve_message>
    And Complete the payment using fast cash button
    And  Click the Logoff button

    Examples:
      | CustomerNum | Message        | Retrieve_message          | 
      | 123456      | Sale is parked | Parked sales is retrieved | 

  Scenario Outline: Multiple retail Variant item with Exclusive tax Retrieve check
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the Multiple retail Variant item with Exclusive tax
    Then Get the Check number from the retail screen
    Then Get the Customer Name from the retail screen
    And Click the park button in ordering screen
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And click the retrieve sale button
    And select the same check
    Then In that check will be reopen in ordering screen
    And The message is appear <Retrieve_message>
    And Complete the payment using fast cash button
    And  Click the Logoff button

    Examples:
      | CustomerNum | Message        | Retrieve_message          | 
      | 123456      | Sale is parked | Parked sales is retrieved | 

  Scenario Outline: Multiple retail Variant item with Inclusive tax Retrieve check
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the Multiple retail Variant item with Inclusive tax
    Then Get the Check number from the retail screen
    Then Get the Customer Name from the retail screen
    And Click the park button in ordering screen
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And click the retrieve sale button
    And select the same check
    Then In that check will be reopen in ordering screen
    And The message is appear <Retrieve_message>
    And Complete the payment using fast cash button
    And  Click the Logoff button

    Examples:
      | CustomerNum | Message        | Retrieve_message          | 
      | 123456      | Sale is parked | Parked sales is retrieved | 

  Scenario Outline: Multiple retail Variant and Multiple standard item with Exclusive tax Retrieve check
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the Multiple retail Variant item with Exclusive tax
    Then Get the Check number from the retail screen
    Then Get the Customer Name from the retail screen
    And Click the park button in ordering screen
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And click the retrieve sale button
    And select the same check
    Then In that check will be reopen in ordering screen
    And The message is appear <Retrieve_message>
    And Complete the payment using fast cash button
    And  Click the Logoff button

    Examples:
      | CustomerNum | Message        | Retrieve_message          | 
      | 123456      | Sale is parked | Parked sales is retrieved | 

  Scenario Outline: Multiple retail Variant and Multiple standard item with Inclusive tax Retrieve check
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the Multiple retail Variant item with Inclusive tax
    Then Get the Check number from the retail screen
    Then Get the Customer Name from the retail screen
    And Click the park button in ordering screen
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And click the retrieve sale button
    And select the same check
    Then In that check will be reopen in ordering screen
    And The message is appear <Retrieve_message>
    And Complete the payment using fast cash button
    And  Click the Logoff button

    Examples:
      | CustomerNum | Message        | Retrieve_message          | 
      | 123456      | Sale is parked | Parked sales is retrieved | 

    Scenario Outline: Multiple retail Variant item with Inclusive tax and Exclusive tax Retrieve check
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the Multiple retail Variant item with Inclusive tax and Exclusive tax
      Then Get the Check number from the retail screen
      Then Get the Customer Name from the retail screen
    And Click the park button in ordering screen
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
      And click the retrieve sale button
      And select the same check
      Then In that check will be reopen in ordering screen
    And The message is appear <Retrieve_message>
      And Complete the payment using fast cash button
    And  Click the Logoff button

      Examples:
        | CustomerNum | Message        | Retrieve_message          | 
        | 123456      | Sale is parked | Parked sales is retrieved | 

  Scenario Outline: Multiple retail standard item with Inclusive tax and Exclusive tax Retrieve check
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the Multiple retail standard item with Inclusive tax and Exclusive tax
    Then Get the Check number from the retail screen
    Then Get the Customer Name from the retail screen
    And Click the park button in ordering screen
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And click the retrieve sale button
    And select the same check
    Then In that check will be reopen in ordering screen
    And The message is appear <Retrieve_message>
    And Complete the payment using fast cash button
    And  Click the Logoff button

    Examples:
      | CustomerNum | Message        | Retrieve_message          | 
      | 123456      | Sale is parked | Parked sales is retrieved | 

  Scenario Outline: single retail standard item with Inclusive tax and Exclusive tax Retrieve check
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the single retail standard item with Inclusive tax and Exclusive tax
    Then Get the Check number from the retail screen
    Then Get the Customer Name from the retail screen
    And Click the park button in ordering screen
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And click the retrieve sale button
    And select the same check
    Then In that check will be reopen in ordering screen
    And The message is appear <Retrieve_message>
    And Complete the payment using fast cash button
    And  Click the Logoff button

    Examples:
      | CustomerNum | Message        | Retrieve_message          | 
      | 123456      | Sale is parked | Parked sales is retrieved | 

  Scenario Outline: single retail Variant item with Inclusive tax and Exclusive tax Retrieve check
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the single retail Variant item with Inclusive tax and Exclusive tax
    Then Get the Check number from the retail screen
    Then Get the Customer Name from the retail screen
    And Click the park button in ordering screen
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And click the retrieve sale button
    And select the same check
    Then In that check will be reopen in ordering screen
    And The message is appear <Retrieve_message>
    And Complete the payment using fast cash button
    And  Click the Logoff button

    Examples:
      | CustomerNum | Message        | Retrieve_message          | 
      | 123456      | Sale is parked | Parked sales is retrieved | 
    
  Scenario Outline: single retail Variant item and Multiple standard item  with Inclusive tax and Exclusive tax Retrieve check
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the single retail Variant item and Multiple standard item  with Inclusive tax and Exclusive tax
    Then Get the Check number from the retail screen
    Then Get the Customer Name from the retail screen
    And Click the park button in ordering screen
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And click the retrieve sale button
    And select the same check
    Then In that check will be reopen in ordering screen
    And The message is appear <Retrieve_message>
    And Complete the payment using fast cash button
    And  Click the Logoff button

    Examples:
      | CustomerNum | Message        | Retrieve_message          | 
      | 123456      | Sale is parked | Parked sales is retrieved | 

  Scenario Outline: single retail standard item and Multiple Variant item  with Inclusive tax and Exclusive tax Retrieve check
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the single retail standard item and Multiple Variant item  with Inclusive tax and Exclusive tax
    Then Get the Check number from the retail screen
    Then Get the Customer Name from the retail screen
    And Click the park button in ordering screen
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Message>
    And click the retrieve sale button
    And select the same check
    Then In that check will be reopen in ordering screen
    And The message is appear <Retrieve_message>
    And Complete the payment using fast cash button
    And  Click the Logoff button

    Examples:
      | CustomerNum | Message        | Retrieve_message          | 
      | 123456      | Sale is parked | Parked sales is retrieved | 