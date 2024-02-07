@Park  @Reg
Feature:  Park

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

  Scenario Outline: single retail standard item with Inclusive tax
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the single retail standard item with Inclusive tax
    And Click the park button in ordering screen
#    Then The Park sale popup is open
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
#    Then The Park sale popup is open
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

  Scenario Outline: single retail Variant item with Inclusive tax
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the single retail Variant item with Inclusive tax
    And Click the park button in ordering screen
#    Then The Park sale popup is open
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
#    Then The Park sale popup is open
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
#    Then The Park sale popup is open
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
#    Then The Park sale popup is open
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
#    Then The Park sale popup is open
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
#    Then The Park sale popup is open
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
#    Then The Park sale popup is open
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
#    Then The Park sale popup is open
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
#    Then The Park sale popup is open
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
#    Then The Park sale popup is open
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
#    Then The Park sale popup is open
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

  Scenario Outline: Cancel the park sale
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the single retail standard item with Inclusive tax
    Then Get the Check number from the retail screen
    And Click the park button in ordering screen
#    Then The Park sale popup is open
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
    And Complete the payment using cash button with <Message>
    And  Click the Logoff button

    Examples:
      | CustomerNum | Error_Message  | Message                       |
      | 123456           | Sale is parked | Check got closed successfully |


  Scenario Outline: Park and retrive with customer name
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the single retail Variant item with Inclusive tax
    Then Get the Check number from the retail screen
    Then Get the Customer Name from the retail screen
    And Click the park button in ordering screen
#    Then The Park sale popup is open
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
    And Complete the payment using cash button with <Message>
    And  Click the Logoff button
    Examples:
      | CustomerNum | Error Message  | Message                       |
      | 123456      | Sale is parked | Check got closed successfully |


    #Issues
  #Bug ID - 11