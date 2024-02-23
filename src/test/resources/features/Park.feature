@Park  @Reg
Feature:  Park


  Scenario Outline: single retail standard item with Inclusive tax
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the single retail standard item with Inclusive tax
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
      | CustomerNum | Message        |
      | 123456     | Sale is parked |

  Scenario Outline: Multiple retail standard item with Inclusive tax
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the Multiple retail standard item with Inclusive tax
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
      | CustomerNum | Message        |
      | 123456     | Sale is parked |

  Scenario Outline: Verify the parked sales are present in closed checks
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Order the Standard Item from the retail Screen
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
    Then verify the required checks
    Then Click the retail button
    And  Click the Logoff button

    Examples:
      | CustomerNum | Message        |
      | 123456     | Sale is parked |

  Scenario Outline: single retail Variant item with Inclusive tax
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the single retail Variant item with Inclusive tax
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
      | CustomerNum | Message        |
      | 123456     | Sale is parked |

  Scenario Outline:  Multiple retail Variant item with Inclusive tax
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the Multiple retail Variant item with Inclusive tax
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
      | CustomerNum | Message        |
      | 123456     | Sale is parked |

  Scenario Outline: single retail Variant item with Exclusive tax
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the single retail Variant item with Inclusive tax
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
      | CustomerNum | Message        |
      | 123456     | Sale is parked |

  Scenario Outline: Multiple retail Variant item with Exclusive tax
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the Multiple retail Variant item with Inclusive tax
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
      | CustomerNum | Message        |
      | 123456     | Sale is parked |

  Scenario Outline: single retail standard item with Exclusive tax
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the single retail standard item with Inclusive tax
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
      | CustomerNum | Message        |
      | 123456     | Sale is parked |

  Scenario Outline: Multiple retail standard item with Exclusive tax
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the Multiple retail standard item with Inclusive tax
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
      | CustomerNum | Message        |
      | 123456     | Sale is parked |


  Scenario Outline: single retail Variant item with Inclusive tax and Exclusive tax
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the single retail Variant item with Inclusive tax and Exclusive tax
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
      | CustomerNum | Message        |
      | 123456     | Sale is parked |

  Scenario Outline: Multiple retail Variant item with Inclusive tax and Exclusive tax
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the Multiple retail Variant item with Inclusive tax and Exclusive tax
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
      | CustomerNum | Message        |
      | 123456     | Sale is parked |

  Scenario Outline: single retail standard item with Inclusive tax and Exclusive tax
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the single retail standard item with Inclusive tax and Exclusive tax
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
      | CustomerNum | Message        |
      | 123456     | Sale is parked |

  Scenario Outline: Multiple retail standard item with Inclusive tax and Exclusive tax
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the Multiple retail standard item with Inclusive tax and Exclusive tax
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
      | CustomerNum | Message        |
      | 123456     | Sale is parked |



  Scenario Outline: Verify Reason characters within 50
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the single retail standard item with Inclusive tax
    And Click the park button in ordering screen
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
      | CustomerNum | Error_Message                             |
      | 123456           | You can not enter more than 50 characters |
 
  Scenario Outline: Verify the closed check in the Closed tab
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the single retail standard item with Inclusive tax
    Then Get the Check number from the retail screen
    And Click the park button in ordering screen
    And verify popup title park sale
    And verify popup content as Please specify the reason to park sale
    And Verify popup in reason in watermark
    And Verify popup Cancel button placed left corner
    And Verify popup Park button placed right corner
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Error_Message>
    And click the retrieve sale button
    And select the same check
    Then In that check will be reopen in ordering screen
    And Complete the payment using fast cash button
    Then Click the sale history
    Then verify the required check
    And Click the retail button
    And  Click the Logoff button

    Examples:
      | CustomerNum | Error_Message  | Message                       |
      | 123456           | Sale is parked | Check got closed successfully |

 
  Scenario Outline: Verify the retrieved check available in the retrieve column
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the single retail standard item with Inclusive tax
    Then Get the Check number from the retail screen
    And Click the park button in ordering screen
    And verify popup title park sale
    And verify popup content as Please specify the reason to park sale
    And Verify popup in reason in watermark
    And Verify popup Cancel button placed left corner
    And Verify popup Park button placed right corner
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Error_Message>
    And click the retrieve sale button
    And select the same check
    Then In that check will be reopen in ordering screen
    And Complete the payment using fast cash button
    And click the retrieve sale button
    And select the same checks
    And  Click the Logoff button

    Examples:
      | CustomerNum | Error_Message  |  |
      | 123456      | Sale is parked |  |

 
  Scenario Outline: Park and retrieve with customer name
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the single retail Variant item with Inclusive tax
    Then Get the Check number from the retail screen
    Then Get the Customer Name from the retail screen
    And Click the park button in ordering screen
    And verify popup title park sale
    And verify popup content as Please specify the reason to park sale
    And Verify popup in reason in watermark
    And Verify popup Cancel button placed left corner
    And Verify popup Park button placed right corner
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Error Message>
    And click the retrieve sale button
    And select the same check
    Then In that check will be reopen in ordering screen with the same Customer
    And Complete the payment using fast cash button
    And  Click the Logoff button
    Examples:
      | CustomerNum | Error Message  |  |
      | 123456      | Sale is parked |  |


  Scenario Outline: Verify partial sales can be performed in parked sale
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Order the Kit Assembly item from the retail Screen
    Then Get the Check number from the retail screen
    Then Get the Customer Name from the retail screen
    And Click the park button in ordering screen
    And verify popup title park sale
    And verify popup content as Please specify the reason to park sale
    And Verify popup in reason in watermark
    And Verify popup Cancel button placed left corner
    And Verify popup Park button placed right corner
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Error Message>
    And click the retrieve sale button
    And select the same check
    Then In that check will be reopen in ordering screen with the same Customer
    And Click the Payment option
    Then Enter the partial amount with cash option
    When Click the Submit button
    Then Verify the Please Pay popup
    And Click the Cash Option
    Then Click the Submit button
    And Click the Logoff button
    Examples:
      | CustomerNum | Error Message  |
      | 123456      | Sale is parked |


 
  Scenario Outline: Verify the menu items, total and all of the retrieved sale 
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Order the Standard Item from the retail Screen
    And Get the menu items,total and quantity from the retail screen
    And Get the Total amount
    And Get the Subtotal amount
    And Get the Paid amount
    And Get the Balance amount
    Then Get the Tax amount
    Then Get the Check number from the retail screen
    Then Get the Customer Name from the retail screen
    And Click the park button in ordering screen
    And verify popup title park sale
    And verify popup content as Please specify the reason to park sale
    And Verify popup in reason in watermark
    And Verify popup Cancel button placed left corner
    And Verify popup Park button placed right corner
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Error Message>
    And click the retrieve sale button
    And select the same check
    Then In that check will be reopen in ordering screen with the same Customer
    And Verify the retail item, quantity and total changes in Retail POS screen
    Then Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right
    And Complete the payment using fast cash button
    And Click the Logoff button
    Examples:
      | CustomerNum | Error Message  |
      | 123456      | Sale is parked |

 
  Scenario Outline: Verify able to edit the retrieved park sale
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the single retail Variant item with Inclusive tax
    Then Get the Check number from the retail screen
    Then Get the Customer Name from the retail screen
    And Click the park button in ordering screen
    And verify popup title park sale
    And verify popup content as Please specify the reason to park sale
    And Verify popup in reason in watermark
    And Verify popup Cancel button placed left corner
    And Verify popup Park button placed right corner
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Error Message>
    And click the retrieve sale button
    And select the same check
    Then In that check will be reopen in ordering screen with the same Customer
    And Order the Standard Item from the retail Screen
    And Order the Variant item from the retail Screen
    And Complete the payment using fast cash button
    And  Click the Logoff button
    Examples:
      | CustomerNum | Error Message  |  |
      | 123456      | Sale is parked |  |

 
  Scenario Outline: Verify able to delete the added item after park sale is retrieved
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Order the Standard Item from the retail Screen
    And Order the Variant item from the retail Screen
    Then Get the Check number from the retail screen
    Then Get the Customer Name from the retail screen
    And Click the park button in ordering screen
    And verify popup title park sale
    And verify popup content as Please specify the reason to park sale
    And Verify popup in reason in watermark
    And Verify popup Cancel button placed left corner
    And Verify popup Park button placed right corner
    And Enter the reason and click the park button
    Then Sale is parked message is displaying <Error Message>
    And click the retrieve sale button
    And select the same check
    Then In that check will be reopen in ordering screen with the same Customer
    And Click the close button of first menu item
    And Complete the payment using fast cash button
    And  Click the Logoff button
    Examples:
      | CustomerNum | Error Message  |  |
      | 123456      | Sale is parked |  |