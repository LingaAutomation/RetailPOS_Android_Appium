@Refund    @Reg
Feature: Refund Retail

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

  Scenario: verify the refund check in refund tab with Cash Payment
    Given Login with the valid credentials
    And Order the Standard Item from the retail Screen
    And Get the Check number from the retail screen
    Then Complete the payment using fast cash button
    Then Click the sale history
    And select the required check
    And click the return button
    And click the Refund all button
    Then Refund screen should be displayed
    Then Add the refund reason
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tab
    And Click the Logoff button

#  Scenario: Verify the closed check and Return with other payment type
#    Given Login with the valid credentials
#    And Order the Standard Item from the retail Screen
#    And Get the Check number from the retail screen
#    Then Complete the payment using fast cash button
#    Then Click the sale history
#    And select the required check
#    And click the return button
#    And click the Refund all button
#    Then Add the refund reason
#    And Click the payment type as Others
#    Then Click the done button
#    When User verify the corresponding check in the refund tab
#    And Click the Logoff button
#
#  Scenario: Verify the closed check and Return with Side-CC payment type
#    Given Login with the valid credentials
#    And Order the Standard Item from the retail Screen
#    And Get the Check number from the retail screen
#    Then Complete the payment using fast cash button
#    Then Click the sale history
#    And select the required check
#    And click the return button
#    And click the Refund all button
#    Then Add the refund reason
#    And Click the payment type as Side CC
#    Then Click the done button
#    When User verify the corresponding check in the refund tab
#    And Click the Logoff button
#
#  Scenario Outline: Verify the closed check and Return with HA payment type
#    Given Login with the valid credentials
#    And Order the Standard Item from the retail Screen
#    And Get the Check number from the retail screen
#    Then Complete the payment using fast cash button
#    Then Click the sale history
#    And select the required check
#    And click the return button
#    And click the Refund all button
#    Then Add the refund reason
#    And Click the payment type as HA Payment and the card number is <CardNumber>
#    Then Click the done button
#    When User verify the corresponding check in the refund tab
#    And Click the Logoff button
#    Examples:
#      | CardNumber |
#      | 150        |
#
#  Scenario Outline: Verify the closed check and Return with Gift Card type
#    Given Login with the valid credentials
#    And Order the Standard Item from the retail Screen
#    And Get the Check number from the retail screen
#    Then Complete the payment using fast cash button
#    Then Click the sale history
#    And select the required check
#    And click the return button
#    And click the Refund all button
#    Then Add the refund reason
#    And Click the payment type as Gift Card and the card number is <CardNumber>
#    Then Click the done button
#    When User verify the corresponding check in the refund tab
#    And Click the Logoff button
#    Examples:
#      | CardNumber |
#      | 1234       |

  Scenario: verify the refund check in cash with Free text reason
    Given Login with the valid credentials
    And Order the Standard Item from the retail Screen
    And Get the Check number from the retail screen
    Then Complete the payment using fast cash button
    Then Click the sale history
    And select the required check
    And click the return button
    And click the Refund all button
    Then Add the refund reason in the free text
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tab
    And Click the Logoff button

  Scenario Outline: verify the refund check in cash with customer
    Given Login with the valid credentials
    And Order the Standard Item from the retail Screen
    And Get the Check number from the retail screen
    Then Complete the payment using fast cash button
    Then Click the sale history
    And select the required check
    And click the return button
    Then Add the customer and the Customer Number is <CustomerNum>
    Then Get the Customer Name from the retail screen
    And click the Refund all button
    Then Add the refund reason in the free text
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tabs
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |

  Scenario Outline: verify the check number is changed in the refund tab
    Given Login with the valid credentials
    And Order the Standard Item from the retail Screen
    And Get the Check number from the retail screen
    Then Complete the payment using fast cash button
    Then Click the sale history
    And select the required check
    And click the return button
    Then Add the customer and the Customer Number is <CustomerNum>
    Then Get the Customer Name from the retail screen
    And click the Refund all button
    Then Add the refund reason in the free text
    And Click the payment type as Cash
    Then Click the done button
    When Verify the check no is changed in the Refunded tab
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |

    # As of now Refund Item having some issue, After completing the sale user select the check for Refund in retail screen all the menu items are non selectable
  #so we hold the refund item - 27/12/2023
#  Scenario Outline: verify the refund for particular retail item
#    Given Login with the valid credentials
#    And Add multiple standard item
#    And Get the Check number from the retail screen
#    Then Complete the payment using fast cash button
#    Then Click the sale history
#    And select the required check
#    And click the return button
#    Then Add the customer and the Customer Number is <CustomerNum>
#    Then Get the Customer Name from the retail screen
#    And click the Refund Item button
#    Then Add the refund reason in the free text
#    And Click the payment type as Cash
#    Then Click the done button
#    When Verify the check no is changed in the Refunded tab and only that retail item is refunded
#    And Click the Logoff button
#    Examples:
#      | CustomerNum |
#      | 123456      |

  Scenario Outline: verify the refund check in cash with customer and Exclusive tax
    Given Login with the valid credentials
    And Order the Standard Item from the retail Screen
    And Get the Check number from the retail screen
    Then Complete the payment using fast cash button
    Then Click the sale history
    And select the required check
    And click the return button
    Then Add the customer and the Customer Number is <CustomerNum>
    Then Get the Customer Name from the retail screen
    And click the Refund all button
    Then Add the refund reason in the free text
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tabs
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |

  Scenario Outline: verify the refund check in cash with customer and Quantity based tax
    Given Login with the valid credentials
    And Order the Multiple Standard item for the quantity based tax
    And Get the Check number from the retail screen
    And Calculate the quantity based tax and values
    Then Complete the payment using fast cash button
    Then Click the sale history
    And select the required check
    And click the return button
    Then Add the customer and the Customer Number is <CustomerNum>
    Then Get the Customer Name from the retail screen
    And click the Refund all button
    Then Add the refund reason in the free text
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tabs
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |

  Scenario Outline: verify the refund check in cash with customer and Tax on Item tax
    Given Login with the valid credentials
    Then Order the Multiple Standard item for the tax on Item tax
    And Get the Check number from the retail screen
    And Calculate the tax on item tax and values
    Then Complete the payment using fast cash button
    Then Click the sale history
    And select the required check
    And click the return button
    Then Add the customer and the Customer Number is <CustomerNum>
    Then Get the Customer Name from the retail screen
    And click the Refund all button
    Then Add the refund reason in the free text
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tabs
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |

  Scenario Outline: verify the refund check in cash with customer and Check tax
    Given Login with the valid credentials
    Then Order the Multiple Standard item for the check based tax
    And Get the Check number from the retail screen
    And Calculate the check based tax and values
    Then Complete the payment using fast cash button
    Then Click the sale history
    And select the required check
    And click the return button
    Then Add the customer and the Customer Number is <CustomerNum>
    Then Get the Customer Name from the retail screen
    And click the Refund all button
    Then Add the refund reason in the free text
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tabs
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |

    # Tax on Check Tax will not work as of now - 26-December-2023
#  Scenario Outline: verify the refund check in cash with customer and Tax on Check tax
#    Given Login with the valid credentials
#    And Order the Standard Item with Tax on check tax from the retail Screen
#    And Get the Check number from the retail screen
#    Then Complete the payment using fast cash button
#    Then Click the sale history
#    And select the required check
#    And click the return button
#    Then Add the customer and the Customer Number is <CustomerNum>
#    Then Get the Customer Name from the retail screen
#    And click the Refund all button
#    Then Add the refund reason in the free text
#    And Click the payment type as Cash
#    Then Click the done button
#    When User verify the corresponding check in the refund tabs
#    And Click the Logoff button
#    Examples:
#      | CustomerNum |
#      | 123456      |

  Scenario Outline: verify the refund check in cash with customer and with Item Based discount
    Given Login with the valid credentials
    Then Order the Standard Item from the retail Screen
    And Get the Check number from the retail screen
    Then Click the Option from the retail screen
    And Click the Discount Option from the given options
    And Click the <Discount_Name> after tax - item based tax
    And Calculate the Item Based Discount for the <Discount> percentage with After Tax
    Then Complete the payment using fast cash button
    Then Click the sale history
    And select the required check
    And click the return button
    Then Add the customer and the Customer Number is <CustomerNum>
    And Get the Customer Name from the retail screen
    And click the Refund all button
    Then Add the refund reason in the free text
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tabs
    And Click the Logoff button
    Examples:
      | CustomerNum | Discount_Name | Discount |
      | 123456      | IBD1          | 5        |
#
#  Scenario Outline: verify the refund check in cash with customer and with Check Based discount
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen
#    And Get the Check number from the retail screen
#    Then Click the Option from the retail screen
#    And Click the Discount Option from the given options
#    And Click the <Discount_Name> after tax - item based tax
#    And Calculate the Check Based Discount for the <Discount> percentage with After Tax
#    Then Complete the payment using fast cash button
#    Then Click the sale history
#    And select the required check
#    And click the return button
#    Then Add the customer and the Customer Number is <CustomerNum>
#    Then Get the Customer Name from the retail screen
#    And click the Refund all button
#    Then Add the refund reason in the free text
#    And Click the payment type as Cash
#    Then Click the done button
#    When User verify the corresponding check in the refund tabs
#    And Click the Logoff button
#    Examples:
#      | CustomerNum | Discount_Name | Discount |
#      | 123456      | CBD           | 7        |
#
#    Open item discount is not available in Retail POS - in iPAD open item discount is available on menu option but
#    in Retail POS menu option is not available need to confirm with DEV/BA team - 29/12/2023
#  Scenario Outline: verify the refund check in cash with customer and with Open item discount
#    Given Login with the valid credentials
#    And Order the Open Item from the retail screen with price
#    And Get the Check number from the retail screen
#    Then Click the Option from the retail screen
#    And Click the Discount Option from the given options
#    And Click the <Discount_Name> after tax - item based tax
#    And Calculate the Open Item Discount for the <Discount> percentage with After Tax
#    Then Complete the payment using fast cash button
#    Then Click the sale history
#    And select the required check
#    And click the return button
#    Then Add the customer and the Customer Number is <CustomerNum>
#    Then Get the Customer Name from the retail screen
#    And click the Refund all button
#    Then Add the refund reason in the free text
#    And Click the payment type as Cash
#    Then Click the done button
#    When User verify the corresponding check in the refund tabs
#    And Click the Logoff button
#    Examples:
#      | CustomerNum | Discount_Name | Discount |
#      | 123456      | CBD           | 7        |
#
#      Open item discount is not available in Retail POS - in iPAD open item discount is available on menu option but
#    in Retail POS menu option is not available need to confirm with DEV/BA team - 29/12/2023
#  Scenario Outline: verify the refund check in cash with customer and with Open check discount
#    Given Login with the valid credentials
#    And Order the Open Item from the retail screen with price
#    And Get the Check number from the retail screen
#    Then Click the Option from the retail screen
#    And Click the Discount Option from the given options
#    And Click the <Discount_Name> after tax - item based tax
#    And Calculate the Open Check Discount for the <Discount> percentage with After Tax
#    Then Complete the payment using fast cash button
#    Then Click the sale history
#    And select the required check
#    And click the return button
#    Then Add the customer and the Customer Number is <CustomerNum>
#    Then Get the Customer Name from the retail screen
#    And click the Refund all button
#    Then Add the refund reason in the free text
#    And Click the payment type as Cash
#    Then Click the done button
#    When User verify the corresponding check in the refund tabs
#    And Click the Logoff button
#    Examples:
#      | CustomerNum | Discount_Name | Discount |
#      | 123456      | CBD           | 7        |

  Scenario Outline: verify the refund check in cash with customer and with Mix And Match discount
    Given Login with the valid credentials
    Then Order the Standard Item from the retail Screen
    And Get the Check number from the retail screen
    Then Click the Option from the retail screen
    And Click the Discount Option from the given options
    And Click the <Discount_Name> after tax - item based tax
    And Calculate the Mix and Match Discount with <Quantity> for the <Discount> percentage with After Tax
    Then Complete the payment using fast cash button
    Then Click the sale history
    And select the required check
    And click the return button
    Then Add the customer and the Customer Number is <CustomerNum>
    Then Get the Customer Name from the retail screen
    And click the Refund all button
    Then Add the refund reason in the free text
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tabs
    And Click the Logoff button
    Examples:
      | CustomerNum | Discount_Name | Discount | Quantity |
      | 123456      | MAMD          | 4        | 2        |

  Scenario Outline: verify the refund check in cash with customer for variant item
    Given Login with the valid credentials
    And Order the Variant item from the retail Screen
    And Get the Check number from the retail screen
    Then Complete the payment using fast cash button
    Then Click the sale history
    And select the required check
    And click the return button
    Then Add the customer and the Customer Number is <CustomerNum>
    Then Get the Customer Name from the retail screen
    And click the Refund all button
    Then Add the refund reason in the free text
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tabs
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |

#  Scenario Outline: verify the refund check in cash with customer for Kit/Assembly item
#    Given Login with the valid credentials
#    And Order the Kit Assembly item from the retail Screen
#    Then Complete the payment using fast cash button
#    Then Click the sale history
#    And select the required check
#    And click the return button
#    Then Add the customer and the Customer Number is <CustomerNum>
#    Then Get the Customer Name from the retail screen
#    And click the Refund all button
#    Then Add the refund reason in the free text
#    And Click the payment type as Cash
#    Then Click the done button
#    When User verify the corresponding check in the refund tabs
#    And Click the Logoff button
#    Examples:
#      | CustomerNum |
#      | 123456      |

  Scenario Outline: verify the refund check in cash with customer for Open item
    Given Login with the valid credentials
    And Order the Open Item from the retail screen with price
    And Get the Check number from the retail screen
    Then Complete the payment using fast cash button
    Then Click the sale history
    And select the required check
    And click the return button
    Then Add the customer and the Customer Number is <CustomerNum>
    Then Get the Customer Name from the retail screen
    And click the Refund all button
    Then Add the refund reason in the free text
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tabs
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |

 Scenario Outline: verify the refund check in cash with customer with all four item
    Given Login with the valid credentials
    And Order the Standard Item from the retail Screen
    And Order the Variant item from the retail Screen
#    And Order the Kit Assembly item from the retail Screen
    And Order the Open Item from the retail screen with price
    And Get the Check number from the retail screen
    Then Complete the payment using fast cash button
    Then Click the sale history
    And select the required check
    And click the return button
    Then Add the customer and the Customer Number is <CustomerNum>
    Then Get the Customer Name from the retail screen
    And click the Refund all button
    Then Add the refund reason in the free text
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tabs
    And Click the Logoff button
   Examples:
     | CustomerNum |
     | 123456      |

  Scenario Outline: verify the refund check in cash with customer for standard item with upcharge
    Given Login with the valid credentials
    And Order the Multiple Standard item with Upcharge
    And Get the Check number from the retail screen
    Then Complete the payment using fast cash button
    Then Click the sale history
    And select the required check
    And click the return button
    Then Add the customer and the Customer Number is <CustomerNum>
    Then Get the Customer Name from the retail screen
    And click the Refund all button
    Then Add the refund reason in the free text
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tabs
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |

  Scenario Outline: verify the refund check in cash with customer for variant item with upcharge
    Given Login with the valid credentials
    And Order the Multiple Variant item with Upcharge
    And Get the Check number from the retail screen
    Then Complete the payment using fast cash button
    Then Click the sale history
    And select the required check
    And click the return button
    Then Add the customer and the Customer Number is <CustomerNum>
    Then Get the Customer Name from the retail screen
    And click the Refund all button
    Then Add the refund reason in the free text
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tabs
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |

#  Scenario Outline: verify the refund check in cash with customer for Kit/Assembly item with upcharge
#    Given Login with the valid credentials
#    And Order the Multiple Kit Assembly item with Upcharge
#    And Get the Check number from the retail screen
#    Then Complete the payment using fast cash button
#    Then Click the sale history
#    And select the required check
#    And click the return button
#    Then Add the customer and the Customer Number is <CustomerNum>
#    Then Get the Customer Name from the retail screen
#    And click the Refund all button
#    Then Add the refund reason in the free text
#    And Click the payment type as Cash
#    Then Click the done button
#    When User verify the corresponding check in the refund tabs
#    And Click the Logoff button
#    Examples:
#      | CustomerNum |
#      | 123456      |

  Scenario Outline: verify the refund check in cash with customer for Open item with upcharge
    Given Login with the valid credentials
    And Order the Multiple Open item with Upcharge
    And Get the Check number from the retail screen
    Then Complete the payment using fast cash button
    Then Click the sale history
    And select the required check
    And click the return button
    Then Add the customer and the Customer Number is <CustomerNum>
    Then Get the Customer Name from the retail screen
    And click the Refund all button
    Then Add the refund reason in the free text
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tabs
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |

  Scenario Outline: verify the refund check in cash with customer with all four item with upcharge
    Given Login with the valid credentials
    Then Order the Single Standard item With the Upcharge
    Then Order the Single Variant item With the Upcharge
#    And Order the Single Kit Assembly item With the Upcharge
    And Order the Single Open item with Upcharge
    And Get the Check number from the retail screen
    Then Complete the payment using fast cash button
    Then Click the sale history
    And select the required check
    And click the return button
    Then Add the customer and the Customer Number is <CustomerNum>
    Then Get the Customer Name from the retail screen
    And click the Refund all button
    Then Add the refund reason in the free text
    And Click the payment type as Cash
    Then Click the done button
    When User verify the corresponding check in the refund tabs
    And Click the Logoff button
    Examples:
      | CustomerNum |
      | 123456      |

  #Unable to do the exchange as of now - unable to select the menu item while doing the exchange - 29-12-2023
#  Scenario: verify the refund check along with exchange
#    Given Login with the valid credentials
#    And Order the Standard Item from the retail Screen
#    And Get the Check number from the retail screen
#    Then Complete the payment using fast cash button
#    Then Click the sale history
#    And select the required check
#    And click the return button
#    And Click the Exchange button and add more retail item
#    And Click the retail item And Click the Exchange button
#    Then Select the Exchange reason
#    And Click the payment type as Cash
#    And Click the Done button in Exchange popup
#    And verify the Exchange check is available in Exchange tab in sale history
#    And Click the Logoff button

  Scenario Outline: verify the refund check with minimum 100 retail item in refund tab with Cash Payment
    Given Login with the valid credentials
    And Order <Number> Standard Items from the retail Screen
    Then Order <Number> Variant Items from the retail screen
#    And Order <Number> kit Assembly item from the retail screen
    And Get the Check number from the retail screen
    Then Complete the payment using fast cash button
    Then Click the sale history
    And select the required check
    And click the return button
    And click the Refund all button
    Then Add the refund reason
    And Click the payment type as Cash
    And Wait for fifteen seconds
    Then Click the done button
    When User verify the corresponding check in the refund tab
    And Click the Logoff button
    Examples:
      | Number |
      | 100    |

#  Scenario Outline: verify the refund check with minimum 300 retail item in refund tab with Cash Payment
#    Given Login with the valid credentials
#    And Order <Number> Standard Items from the retail Screen
#    Then Order <Number> Variant Items from the retail screen
##    And Order <Number> kit Assembly item from the retail screen
#    And Get the Check number from the retail screen
#    Then Complete the payment using fast cash button
#    Then Click the sale history
#
#    And select the required check
#
#    And click the return button
#    And click the Refund all button
#    Then Add the refund reason
#    And Click the payment type as Cash
#    Then Click the done button
#    When User verify the corresponding check in the refund tab
#    And Click the Logoff button
#    Examples:
#      | Number |
#      | 300    |
#
#  Scenario Outline: verify the refund check with minimum 400 retail item in refund tab with Cash Payment
#    Given Login with the valid credentials
#    And Order <Number> Standard Items from the retail Screen
#    Then Order <Number> Variant Items from the retail screen
##    And Order <Number> kit Assembly item from the retail screen
#    And Get the Check number from the retail screen
#    Then Complete the payment using fast cash button
#    Then Click the sale history
#
#    And select the required check
#    And click the return button
#    And click the Refund all button
#    Then Add the refund reason
#    And Click the payment type as Cash
#    Then Click the done button
#    When User verify the corresponding check in the refund tab
#    And Click the Logoff button
#    Examples:
#      | Number |
#      | 400    |