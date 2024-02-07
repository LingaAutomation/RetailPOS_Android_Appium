@Exchange

Feature: Exchange

      @initial
    Scenario: Login with Retail POS
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

    @initial
    Scenario: Verify the Retail POS Screen Elements
      Given Check the Void button is available or not in the Retail Screen
      And Check the Sale History button is available or not in the Retail Screen
      And Check the Park Sale button is available or not in the Retail Screen
      And Check the Retrieve Sale button is available or not in the Retail Screen
      And Check the Option button is available or not in the Retail Screen
      And Check the Print button is available or not in the Retail Screen
      And Check the Discount button is available or not in the Retail Screen
      And Check the Cash button is available or not in the Retail Screen
      And Check the Layaway button is available or not in the Retail Screen
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

  Scenario Outline: single retail standard item with Exclusive tax
        Given Login with the valid credentials
        And Add the customer and the Customer Number is <CustomerNum>
        And Place the single retail standard item with Exclusive tax
        And Get the Check number from the retail screen
        And Get the Customer Name from the retail screen
        Then Complete the payment using cash button
        Then click the sales history button
        Then Select check in closed tab
        And Click the return button the select check is reopen with same customer name
        And Select the retail item
        And Click the Exchange button and add more retail item
        And Click the retail item And Click the Exchange button
        Then Exchange popup is open with same customer name
        And select or enter the reason
        And Click the payment type as Cash
        And Click the Done button in Exchange popup
        And verify the Exchange check is available in Exchange tab in sale history
        Then Click the retail button
        And  Click the Logoff button

    Examples:
      | CustomerNum |
      | 123456      |

  Scenario Outline: single retail standard item with Inclusive tax
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the single retail standard item with Inclusive tax
    And Get the Check number from the retail screen
    And Get the Customer Name from the retail screen
    Then Complete the payment using cash button
    Then click the sales history button
    Then Select check in closed tab
    And Click the return button the select check is reopen with same customer name
    And Select the retail item
    And Click the Exchange button and add more retail item
    And Click the retail item And Click the Exchange button
    Then Exchange popup is open with same customer name
    And select or enter the reason
    And Click the payment type as Cash
    And Click the Done button in Exchange popup
    And verify the Exchange check is available in Exchange tab in sale history
    Then Click the retail button
    And  Click the Logoff button

    Examples:
      | CustomerNum |
      | 123456      |

  Scenario Outline: single retail standard item with Exclusive tax and Inclusive tax
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the single retail standard item with Exclusive tax and Inclusive tax
    And Get the Check number from the retail screen
    And Get the Customer Name from the retail screen
    Then Complete the payment using cash button
    Then click the sales history button
    Then Select check in closed tab
    And Click the return button the select check is reopen with same customer name
    And Select the retail item
    And Click the Exchange button and add more retail item
    And Click the retail item And Click the Exchange button
    Then Exchange popup is open with same customer name
    And select or enter the reason
    And Click the payment type as Cash
    And Click the Done button in Exchange popup
    And verify the Exchange check is available in Exchange tab in sale history
    Then Click the retail button
    And  Click the Logoff button

    Examples:
      | CustomerNum |
      | 123456      |

  Scenario Outline: Multiple retail standard item with Exclusive tax
    Given Login with the valid credentials
     And Add the customer and the Customer Number is <CustomerNum>
     And Order the Standard Item from the retail Screen
     And Get the Check number from the retail screen
     And Get the Customer Name from the retail screen
     Then Complete the payment using cash button
     Then click the sales history button
     Then Select check in closed tab
     And Click the return button the select check is reopen with same customer name
     And Select the retail item
     And Click the Exchange button and add more retail item
     And Click the retail item And Click the Exchange button
     Then Exchange popup is open with same customer name
     And select or enter the reason
     And Click the payment type as Cash
     And Click the Done button in Exchange popup
     And verify the Exchange check is available in Exchange tab in sale history
     Then Click the retail button
     And  Click the Logoff button

    Examples:
      | CustomerNum |
      | 123456      |

  Scenario Outline: Multiple retail standard item with Inclusive tax
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the Multiple retail standard item with Inclusive tax
    And Get the Check number from the retail screen
    And Get the Customer Name from the retail screen
    Then Complete the payment using cash button
    Then click the sales history button
    Then Select check in closed tab
    And Click the return button the select check is reopen with same customer name
    And Select the retail item
    And Click the Exchange button and add more retail item
    And Click the retail item And Click the Exchange button
    Then Exchange popup is open with same customer name
    And select or enter the reason
    And Click the payment type as Cash
    And Click the Done button in Exchange popup
    And verify the Exchange check is available in Exchange tab in sale history
    Then Click the retail button
    And  Click the Logoff button

    Examples:
      | CustomerNum |
      | 123456      |

  Scenario Outline: Multiple retail standard item with Exclusive tax and Inclusive tax
     Given Login with the valid credentials
     And Add the customer and the Customer Number is <CustomerNum>
     And Order the Standard Item from the retail Screen and Inclusive tax
     And Get the Check number from the retail screen
     And Get the Customer Name from the retail screen
     Then Complete the payment using cash button
     Then click the sales history button
     Then Select check in closed tab
     And Click the return button the select check is reopen with same customer name
     And Select the retail item
     And Click the Exchange button and add more retail item
     And Click the retail item And Click the Exchange button
     Then Exchange popup is open with same customer name
     And select or enter the reason
     And Click the payment type as Cash
     And Click the Done button in Exchange popup
     And verify the Exchange check is available in Exchange tab in sale history
     Then Click the retail button
     And  Click the Logoff button

    Examples:
      | CustomerNum |
      | 123456      |

  Scenario Outline: Multiple retail standard item with Inclusive tax
       Given Login with the valid credentials
       And Add the customer and the Customer Number is <CustomerNum>
       And Order the Multiple Standard Item from the retail Screen and Inclusive tax
       And Get the Check number from the retail screen
       And Get the Customer Name from the retail screen
       Then Complete the payment using cash button
       Then click the sales history button
       Then Select check in closed tab
       And Click the return button the select check is reopen with same customer name
       And Select the retail item
       And Click the Exchange button and add more retail item
       And Click the retail item And Click the Exchange button
       Then Exchange popup is open with same customer name
       And select or enter the reason
       And Click the payment type as Cash
       And Click the Done button in Exchange popup
       And verify the Exchange check is available in Exchange tab in sale history
       Then Click the retail button
       And  Click the Logoff button

    Examples:
      | CustomerNum |
      | 123456      |

  Scenario Outline:  single retail Variant item with Inclusive tax
     Given Login with the valid credentials
     And Add the customer and the Customer Number is <CustomerNum>
     And Place the single retail Variant item with Inclusive tax
     And Get the Check number from the retail screen
     And Get the Customer Name from the retail screen
     Then Complete the payment using cash button
     Then click the sales history button
     Then Select check in closed tab
     And Click the return button the select check is reopen with same customer name
     And Select the retail item
     And Click the Exchange button and add more retail item
     And Click the retail item And Click the Exchange button
     Then Exchange popup is open with same customer name
     And select or enter the reason
     And Click the payment type as Cash
     And Click the Done button in Exchange popup
     And verify the Exchange check is available in Exchange tab in sale history
     Then Click the retail button
     And  Click the Logoff button

    Examples:
      | CustomerNum |
      | 123456      |

  Scenario Outline: single retail Variant item with Exclusive tax
       Given Login with the valid credentials
       And Add the customer and the Customer Number is <CustomerNum>
       And Place the single retail Variant item with Exclusive tax
       And Get the Check number from the retail screen
       And Get the Customer Name from the retail screen
       Then Complete the payment using cash button
       Then click the sales history button
       Then Select check in closed tab
       And Click the return button the select check is reopen with same customer name
       And Select the retail item
       And Click the Exchange button and add more retail item
       And Click the retail item And Click the Exchange button
       Then Exchange popup is open with same customer name
       And select or enter the reason
       And Click the payment type as Cash
       And Click the Done button in Exchange popup
       And verify the Exchange check is available in Exchange tab in sale history
       Then Click the retail button
       And  Click the Logoff button

    Examples:
      | CustomerNum |
      | 123456      |


  Scenario Outline: single retail Variant item with Exclusive tax and Inclusive tax
      Given Login with the valid credentials
      And Add the customer and the Customer Number is <CustomerNum>
      And Place the single retail Variant item with Exclusive tax and Inclusive tax
      And Get the Check number from the retail screen
      And Get the Customer Name from the retail screen
      Then Complete the payment using cash button
      Then click the sales history button
      Then Select check in closed tab
      And Click the return button the select check is reopen with same customer name
      And Select the retail item
      And Click the Exchange button and add more retail item
      And Click the retail item And Click the Exchange button
      Then Exchange popup is open with same customer name
      And select or enter the reason
      And Click the payment type as Cash
      And Click the Done button in Exchange popup
      And verify the Exchange check is available in Exchange tab in sale history
      Then Click the retail button
      And  Click the Logoff button

    Examples:
      | CustomerNum |
      | 123456      |


  Scenario Outline: Multiple retail Variant item with Exclusive tax
      Given Login with the valid credentials
      And Add the customer and the Customer Number is <CustomerNum>
      And Place the Multiple retail Variant item with Exclusive tax
      And Get the Check number from the retail screen
      And Get the Customer Name from the retail screen
      Then Complete the payment using cash button
      Then click the sales history button
      Then Select check in closed tab
      And Click the return button the select check is reopen with same customer name
      And Select the retail item
      And Click the Exchange button and add more retail item
      And Click the retail item And Click the Exchange button
      Then Exchange popup is open with same customer name
      And select or enter the reason
      And Click the payment type as Cash
      And Click the Done button in Exchange popup
      And verify the Exchange check is available in Exchange tab in sale history
      Then Click the retail button
      And  Click the Logoff button

    Examples:
      | CustomerNum |
      | 123456      |

  Scenario Outline: Multiple retail Variant item with Inclusive tax
       Given Login with the valid credentials
       And Add the customer and the Customer Number is <CustomerNum>
       And Place the Multiple retail Variant item with Inclusive tax
       And Get the Check number from the retail screen
       And Get the Customer Name from the retail screen
       Then Complete the payment using cash button
       Then click the sales history button
       Then Select check in closed tab
       And Click the return button the select check is reopen with same customer name
       And Select the retail item
       And Click the Exchange button and add more retail item
       And Click the retail item And Click the Exchange button
       Then Exchange popup is open with same customer name
       And select or enter the reason
       And Click the payment type as Cash
       And Click the Done button in Exchange popup
       And verify the Exchange check is available in Exchange tab in sale history
       Then Click the retail button
       And  Click the Logoff button

    Examples:
      | CustomerNum |
      | 123456      |

  Scenario Outline: Multiple retail Variant item with Exclusive tax and Inclusive tax
     Given Login with the valid credentials
     And Add the customer and the Customer Number is <CustomerNum>
     And Place the Multiple retail Variant item with Exclusive tax and Inclusive tax
    And Get the Check number from the retail screen
    And Get the Customer Name from the retail screen
     Then Complete the payment using cash button
     Then click the sales history button
     Then Select check in closed tab
     And Click the return button the select check is reopen with same customer name
     And Select the retail item
     And Click the Exchange button and add more retail item
     And Click the retail item And Click the Exchange button
     Then Exchange popup is open with same customer name
     And select or enter the reason
     And Click the payment type as Cash
     And Click the Done button in Exchange popup
     And verify the Exchange check is available in Exchange tab in sale history
     Then Click the retail button
     And  Click the Logoff button

    Examples:
      | CustomerNum |
      | 123456      |

  Scenario Outline:  single retail standard item and single Variant item with Exclusive tax
     Given Login with the valid credentials
     And Add the customer and the Customer Number is <CustomerNum>
     And Place the single retail standard item and single Variant item with Exclusive tax
    And Get the Check number from the retail screen
    And Get the Customer Name from the retail screen
     Then Complete the payment using cash button
     Then click the sales history button
     Then Select check in closed tab
     And Click the return button the select check is reopen with same customer name
     And Select the retail item
     And Click the Exchange button and add more retail item
     And Click the retail item And Click the Exchange button
     Then Exchange popup is open with same customer name
     And select or enter the reason
     And Click the payment type as Cash
     And Click the Done button in Exchange popup
     And verify the Exchange check is available in Exchange tab in sale history
     Then Click the retail button
     And  Click the Logoff button

    Examples:
      | CustomerNum |
      | 123456      |

  Scenario Outline: single retail standard item and single Variant item with Inclusive tax
      Given Login with the valid credentials
      And Add the customer and the Customer Number is <CustomerNum>
      And Place the single retail standard item and single Variant item with Inclusive tax
    And Get the Check number from the retail screen
    And Get the Customer Name from the retail screen
      Then Complete the payment using cash button
      Then click the sales history button
      Then Select check in closed tab
      And Click the return button the select check is reopen with same customer name
      And Select the retail item
      And Click the Exchange button and add more retail item
      And Click the retail item And Click the Exchange button
      Then Exchange popup is open with same customer name
      And select or enter the reason
      And Click the payment type as Cash
      And Click the Done button in Exchange popup
      And verify the Exchange check is available in Exchange tab in sale history
      Then Click the retail button
      And  Click the Logoff button

    Examples:
      | CustomerNum |
      | 123456      |

   Scenario Outline: single retail standard item and single Variant item with Inclusive tax and Exclusive tax
     Given Login with the valid credentials
     And Add the customer and the Customer Number is <CustomerNum>
     And Place the single retail standard item and single Variant item with Inclusive tax and Exclusive tax
     And Get the Check number from the retail screen
     And Get the Customer Name from the retail screen
     Then Complete the payment using cash button
     Then click the sales history button
     Then Select check in closed tab
     And Click the return button the select check is reopen with same customer name
     And Select the retail item
     And Click the Exchange button and add more retail item
     And Click the retail item And Click the Exchange button
     Then Exchange popup is open with same customer name
     And select or enter the reason
     And Click the payment type as Cash
     And Click the Done button in Exchange popup
     And verify the Exchange check is available in Exchange tab in sale history
     Then Click the retail button
     And  Click the Logoff button

     Examples:
       | CustomerNum |
       | 123456      |

    Scenario Outline: single retail Variant item and Multiple Standard item with Inclusive tax and Exclusive tax
      Given Login with the valid credentials
      And Add the customer and the Customer Number is <CustomerNum>
      And Place the single retail Variant item and Multiple Standard item with Inclusive tax and Exclusive tax
      And Get the Check number from the retail screen
      And Get the Customer Name from the retail screen
      Then Complete the payment using cash button
      Then click the sales history button
      Then Select check in closed tab
      And Click the return button the select check is reopen with same customer name
      And Select the retail item
      And Click the Exchange button and add more retail item
      And Click the retail item And Click the Exchange button
      Then Exchange popup is open with same customer name
      And select or enter the reason
      And Click the payment type as Cash
      And Click the Done button in Exchange popup
      And verify the Exchange check is available in Exchange tab in sale history
      Then Click the retail button
      And  Click the Logoff button

      Examples:
        | CustomerNum |
        | 123456      |

     Scenario Outline: single retail Variant item and Multiple Standard item with Inclusive tax
       Given Login with the valid credentials
       And Add the customer and the Customer Number is <CustomerNum>
       And Place the single retail Variant item and Multiple Standard item with Inclusive tax
       And Get the Check number from the retail screen
       And Get the Customer Name from the retail screen
       Then Complete the payment using cash button
       Then click the sales history button
       Then Select check in closed tab
       And Click the return button the select check is reopen with same customer name
       And Select the retail item
       And Click the Exchange button and add more retail item
       And Click the retail item And Click the Exchange button
       Then Exchange popup is open with same customer name
       And select or enter the reason
       And Click the payment type as Cash
       And Click the Done button in Exchange popup
       And verify the Exchange check is available in Exchange tab in sale history
       Then Click the retail button
       And  Click the Logoff button

       Examples:
         | CustomerNum |
         | 123456      |

    Scenario Outline: single retail Variant item and Multiple Standard item with Exclusive tax
      Given Login with the valid credentials
      And Add the customer and the Customer Number is <CustomerNum>
      And Place the single retail Variant item and Multiple Standard item with Exclusive tax
      And Get the Check number from the retail screen
      And Get the Customer Name from the retail screen
      Then Complete the payment using cash button
      Then click the sales history button
      Then Select check in closed tab
      And Click the return button the select check is reopen with same customer name
      And Select the retail item
      And Click the Exchange button and add more retail item
      And Click the retail item And Click the Exchange button
      Then Exchange popup is open with same customer name
      And select or enter the reason
      And Click the payment type as Cash
      And Click the Done button in Exchange popup
      And verify the Exchange check is available in Exchange tab in sale history
      Then Click the retail button
      And  Click the Logoff button

      Examples:
        | CustomerNum |
        | 123456      |

     Scenario Outline: single retail Standard item and Multiple Variant item with Inclusive tax and Exclusive tax
       Given Login with the valid credentials
       And Add the customer and the Customer Number is <CustomerNum>
       And Place the single retail Standard item and Multiple Variant item with Inclusive tax and Exclusive tax
       And Get the Check number from the retail screen
       And Get the Customer Name from the retail screen
       Then Complete the payment using cash button
       Then click the sales history button
       Then Select check in closed tab
       And Click the return button the select check is reopen with same customer name
       And Select the retail item
       And Click the Exchange button and add more retail item
       And Click the retail item And Click the Exchange button
       Then Exchange popup is open with same customer name
       And select or enter the reason
       And Click the payment type as Cash
       And Click the Done button in Exchange popup
       And verify the Exchange check is available in Exchange tab in sale history
       Then Click the retail button
       And  Click the Logoff button

       Examples:
         | CustomerNum |
         | 123456      |

    Scenario Outline: single retail Standard item and Multiple Variant item with Inclusive tax
      Given Login with the valid credentials
      And Add the customer and the Customer Number is <CustomerNum>
      And Place the single retail Standard item and Multiple Variant item with Inclusive tax
      And Get the Check number from the retail screen
      And Get the Customer Name from the retail screen
      Then Complete the payment using cash button
      Then click the sales history button
      Then Select check in closed tab
      And Click the return button the select check is reopen with same customer name
      And Select the retail item
      And Click the Exchange button and add more retail item
      And Click the retail item And Click the Exchange button
      Then Exchange popup is open with same customer name
      And select or enter the reason
      And Click the payment type as Cash
      And Click the Done button in Exchange popup
      And verify the Exchange check is available in Exchange tab in sale history
      Then Click the retail button
      And  Click the Logoff button

      Examples:
        | CustomerNum |
        | 123456      |


    Scenario Outline: single retail Standard item and Multiple Variant item with Exclusive tax
      Given Login with the valid credentials
      And Add the customer and the Customer Number is <CustomerNum>
      And Place the single retail Standard item and Multiple Variant item with Exclusive tax
      And Get the Check number from the retail screen
      And Get the Customer Name from the retail screen
      Then Complete the payment using cash button
      Then click the sales history button
      Then Select check in closed tab
      And Click the return button the select check is reopen with same customer name
      And Select the retail item
      And Click the Exchange button and add more retail item
      And Click the retail item And Click the Exchange button
      Then Exchange popup is open with same customer name
      And select or enter the reason
      And Click the payment type as Cash
      And Click the Done button in Exchange popup
      And verify the Exchange check is available in Exchange tab in sale history
      Then Click the retail button
      And  Click the Logoff button

      Examples:
        | CustomerNum |
        | 123456      |

      #Issue

    Scenario Outline: without selecting any item  "Select Menu Items to Exchange" pop message is display
      Given Login with the valid credentials
      And Add the customer and the Customer Number is <CustomerNum>
      And Place the single retail Standard item and Variant item with Exclusive tax
      And Get the Check number from the retail screen
      And Get the Customer Name from the retail screen
      Then Complete the payment using cash button
      Then click the sales history button
      Then Select check in closed tab
      And Click the return button the select check is reopen with same customer name
      And Without selecting the retail item click the Exchange button
      And <Msg> popup along with Done will appear
      And Select the retail item
      And Click the Exchange button and add more retail item
      And Click the retail item And Click the Exchange button
      Then Exchange popup is open with same customer name
      And select or enter the reason
      And Click the payment type as Cash
      And Click the Done button in Exchange popup
      And verify the Exchange check is available in Exchange tab in sale history
      Then Click the retail button
      And  Click the Logoff button

      Examples:
        | CustomerNum | Msg                                |
        | 123456      | Please select item to be exchanged |

   Scenario Outline: Exchanged records should be displayed for the current data default
     Given Login with the valid credentials
     And Add the customer and the Customer Number is <CustomerNum>
     And Place the single retail standard item with Exclusive tax
     And Get the Check number from the retail screen
     And Get the Customer Name from the retail screen
     Then Complete the payment using cash button
     Then click the sales history button
     Then Select check in closed tab
     And Click the return button the select check is reopen with same customer name
     And Select the retail item
     And Click the Exchange button and add more retail item
     And Click the retail item And Click the Exchange button
     Then Exchange popup is open with same customer name
     And select or enter the reason
     And Click the payment type as Cash
     And Click the Done button in Exchange popup
     And verify the Exchange check is available in Exchange tab in sale history
     Then Click the retail button
     Then click the sales history button
     Then Select the Exchange tab
     And  Exchanged records should be displayed for the current data default
     Then Click the retail button
     And  Click the Logoff button

     Examples:
       | CustomerNum |
       | 123456      |

  Scenario Outline: The digital print receipt is not available in the Sales History Exchange tab
    Given Login with the valid credentials
    And Add the customer and the Customer Number is <CustomerNum>
    And Place the single retail standard item with Exclusive tax
    And Get the Check number from the retail screen
    And Get the Customer Name from the retail screen
    Then Complete the payment using cash button
    Then click the sales history button
    Then Select check in closed tab
    And Click the return button the select check is reopen with same customer name
    And Select the retail item
    And Click the Exchange button and add more retail item
    And Click the retail item And Click the Exchange button
    Then Exchange popup is open with same customer name
    And select or enter the reason
    And Click the payment type as Cash
    And Click the Done button in Exchange popup
    And verify the Exchange check is available in Exchange tab in sale history
    Then Click the retail button
    Then click the sales history button
    Then Select the Exchange tab
    And  Exchanged records should be displayed for the current data default
    And Click and view the digital print receipt in exchange tab
    Then Click the retail button
    And  Click the Logoff button

    Examples:
      | CustomerNum |
      | 123456      |

     Scenario Outline:While submitting the exchange payment, the success message is displaying twice.
       Given Login with the valid credentials
       And Add the customer and the Customer Number is <CustomerNum>
       And Place the single retail Standard item and Variant item with Exclusive tax
       And Get the Check number from the retail screen
       And Get the Customer Name from the retail screen
       Then Complete the payment using cash button
       Then click the sales history button
       Then Select check in closed tab
       And Click the return button the select check is reopen with same customer name
       And Select the retail item
       And Click the Exchange button and add more retail item
       And Click the retail item And Click the Exchange button
       Then Exchange popup is open with same customer name
       And select or enter the reason
       And Click the payment type as Cash
       And Click the Done button in Exchange popup
       And verify the Exchange check is available in Exchange tab in sale history
       Then Click the retail button
       And  Click the Logoff button

       Examples:
         | CustomerNum |
         | 123456      |



