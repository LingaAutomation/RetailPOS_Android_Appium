@Disc
Feature: Discounts Validations

#  #############################   Item Based - Discount Validation   #############################
#  Scenario: Verify the discount value - Item Based Discount for After Tax - "10" percentage with discount amount "1.75"
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen
#    When Click the Discount Option from the given options
#    And Search for the discount as "IBD_AT_AMT"
#    Then Click the "IBD_AT_AMT" discount
#    And Click the cancel button
#    And Calculate the value of Item Based Discount for After Tax - "10" percentage with discount amount "1.75"
#    Then Complete the payment using fast cash button
#    And Click the Logoff button
#
#  Scenario: Verify the discount value - Item Based Discount for After Tax - "10" percentage with discount percentage "7%"
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen
#    When Click the Discount Option from the given options
#    And Search for the discount as "IBD_AT_PER"
#    Then Click the "IBD_AT_PER" discount
#    And Click the cancel button
#    And Calculate the value of Item Based Discount for After Tax - "10" percentage with discount percentage "7"
#    Then Complete the payment using fast cash button
#    And Click the Logoff button
#
#  Scenario: Verify the discount value - Item Based Discount for After Tax - "10" percentage with Set Price "11.25"
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen
#    When Click the Discount Option from the given options
#    And Search for the discount as "IBD_AT_SP"
#    Then Click the "IBD_AT_SP" discount
#    And Click the cancel button
#    And Calculate the value of Item Based Discount for After Tax - "10" percentage with Set Price "11.25"
#    Then Complete the payment using fast cash button
#    And Click the Logoff button
#
#  Scenario: Verify the discount value - Item Based Discount for After Tax - "10" percentage with Free Item as "Standard Item 1"
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen
#    When Click the Discount Option from the given options
#    And Search for the discount as "IBD_AT_FI"
#    Then Click the "IBD_AT_FI" discount
#    And Click the cancel button
#    And Calculate the value of Item Based Discount for After Tax - "10" percentage with Free Item as "Standard Item 1"
#    Then Complete the payment using fast cash button
#    And Click the Logoff button

  Scenario: Verify the discount value - Item Based Discount for Before Tax - "10" percentage with discount amount "1.75"
    Given Login with the valid credentials
    Then Order the Standard Item from the retail Screen
    When Click the Discount Option from the given options
    And Search for the discount as "IBD_BT_AMT"
    Then Click the "IBD_BT_AMT" discount
    And Click the cancel button
    And Calculate the value of Item Based Discount for Before Tax - "10" percentage with discount amount "1.75"
    Then Complete the payment using fast cash button
    And Click the Logoff button

  Scenario: Verify the discount value - Item Based Discount for Before Tax - "10" percentage with discount percentage "7%"
    Given Login with the valid credentials
    Then Order the Standard Item from the retail Screen
    When Click the Discount Option from the given options
    And Search for the discount as "IBD_BT_PER"
    Then Click the "IBD_BT_PER" discount
    And Click the cancel button
    And Calculate the value of Item Based Discount for Before Tax - "10" percentage with discount percentage "7"
    Then Complete the payment using fast cash button
    And Click the Logoff button

  Scenario: Verify the discount value - Item Based Discount for Before Tax - "10" percentage with Set Price "11.25"
    Given Login with the valid credentials
    Then Order the Standard Item from the retail Screen
    When Click the Discount Option from the given options
    And Search for the discount as "IBD_BT_SP"
    Then Click the "IBD_BT_SP" discount
    And Click the cancel button
    And Calculate the value of Item Based Discount for Before Tax - "10" percentage with Set Price "11.25"
    Then Complete the payment using fast cash button
    And Click the Logoff button

  Scenario: Verify the discount value - Item Based Discount for Before Tax - "10" percentage with Free Item as "Standard Item 1"
    Given Login with the valid credentials
    Then Order the Standard Item from the retail Screen
    When Click the Discount Option from the given options
    And Search for the discount as "IBD_BT_FI"
    Then Click the "IBD_BT_FI" discount
    And Click the cancel button
    And Calculate the value of Item Based Discount for Before Tax - "10" percentage with Free Item as "Standard Item 1"
    Then Complete the payment using fast cash button
    And Click the Logoff button

#    #############################   Check Based - Discount Validation   #############################
#  Scenario: Verify the discount value - Check Based Discount for After Tax - "10" percentage with discount amount "1.75"
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen
#    When Click the Discount Option from the given options
#    And Search for the discount as "CBD_AT_AMT"
#    Then Click the "CBD_AT_AMT" discount
#    And Click the cancel button
#    And Calculate the value of Check Based Discount for After Tax - "10" percentage with discount amount "1.75"
#    Then Complete the payment using fast cash button
#    And Click the Logoff button
#
#  Scenario: Verify the discount value - Check Based Discount for After Tax - "10" percentage with discount percentage "7%"
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen
#    When Click the Discount Option from the given options
#    And Search for the discount as "CBD_AT_PER"
#    Then Click the "CBD_AT_PER" discount
#    And Click the cancel button
#    And Calculate the value of Check Based Discount for After Tax - "10" percentage with discount percentage "7"
#    Then Complete the payment using fast cash button
#    And Click the Logoff button
#
#  Scenario: Verify the discount value - Check Based Discount for After Tax - "10" percentage with Set Price "11.25"
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen
#    When Click the Discount Option from the given options
#    And Search for the discount as "CBD_AT_SP"
#    Then Click the "CBD_AT_SP" discount
#    And Click the cancel button
#    And Calculate the value of Check Based Discount for After Tax - "10" percentage with Set Price "11.25"
#    Then Complete the payment using fast cash button
#    And Click the Logoff button
#
#  Scenario: Verify the discount value - Check Based Discount for After Tax - "10" percentage with Free Item as "Standard Item 1"
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen
#    When Click the Discount Option from the given options
#    And Search for the discount as "CBD_AT_FI"
#    Then Click the "CBD_AT_FI" discount
#    And Click the cancel button
#    And Calculate the value of Check Based Discount for After Tax - "10" percentage with Free Item as "Standard Item 1"
#    Then Complete the payment using fast cash button
#    And Click the Logoff button
#
#  Scenario: Verify the discount value - Check Based Discount for Before Tax - "10" percentage with discount amount "1.75"
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen
#    When Click the Discount Option from the given options
#    And Search for the discount as "CBD_BT_AMT"
#    Then Click the "CBD_BT_AMT" discount
#    And Click the cancel button
#    And Calculate the value of Check Based Discount for Before Tax - "10" percentage with discount amount "1.75"
#    Then Complete the payment using fast cash button
#    And Click the Logoff button
#
#  Scenario: Verify the discount value - Check Based Discount for Before Tax - "10" percentage with discount percentage "7%"
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen
#    When Click the Discount Option from the given options
#    And Search for the discount as "CBD_BT_PER"
#    Then Click the "CBD_BT_PER" discount
#    And Click the cancel button
#    And Calculate the value of Check Based Discount for Before Tax - "10" percentage with discount percentage "7"
#    Then Complete the payment using fast cash button
#    And Click the Logoff button
#
#  Scenario: Verify the discount value - Check Based Discount for Before Tax - "10" percentage with Set Price "11.25"
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen
#    When Click the Discount Option from the given options
#    And Search for the discount as "CBD_BT_SP"
#    Then Click the "CBD_BT_SP" discount
#    And Click the cancel button
#    And Calculate the value of Check Based Discount for Before Tax - "10" percentage with Set Price "11.25"
#    Then Complete the payment using fast cash button
#    And Click the Logoff button
#
#  Scenario: Verify the discount value - Check Based Discount for Before Tax - "10" percentage with Free Item as "Standard Item 1"
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen
#    When Click the Discount Option from the given options
#    And Search for the discount as "CBD_BT_FI"
#    Then Click the "CBD_BT_FI" discount
#    And Click the cancel button
#    And Calculate the value of Check Based Discount for Before Tax - "10" percentage with Free Item as "Standard Item 1"
#    Then Complete the payment using fast cash button
#    And Click the Logoff button
#
##    #############################   Open Item - Discount Validation   #############################
##  Scenario: Verify the discount value - Open Item Discount for After Tax - "10" percentage with Percentage as "5%"
##    Given Login with the valid credentials
##    Then Order the Standard Item from the retail Screen
##    And Click the Option from the retail screen
##    When Click the Discount Option from the given options
##    And Search for the discount as "OID_AT_PER"
##    Then Click the "OID_AT_PER" discount
##    And Click the cancel button
##    And Calculate the value of Open Item Discount for After Tax - "10" percentage with Percentage as "5"
##    Then Complete the payment using fast cash button
##    And Click the Logoff button
##
##
##        #############################   Open Check - Discount Validation   #############################
##  Scenario: Verify the discount value - Open Check Discount for After Tax - "10" percentage with Percentage as "6%"
##    Given Login with the valid credentials
##    Then Order the Standard Item from the retail Screen
##    And Click the Option from the retail screen
##    When Click the Discount Option from the given options
##    And Search for the discount as "OCD_AT_PER"
##    Then Click the "OCD_AT_PER" discount
##    And Click the cancel button
##    And Calculate the value of Open Check Discount for After Tax - "10" percentage with Percentage as "6"
##    Then Complete the payment using fast cash button
##    And Click the Logoff button
#
#      #############################   Check Based - Discount Validation   #############################
#  Scenario: Verify the discount value - Mix And Match Discount for After Tax - "10" percentage with Set Price as "11.75"
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen
#    When Click the Discount Option from the given options
#    And Search for the discount as "MAM_AT_SP"
#    Then Click the "MAM_AT_SP" discount
#    And Click the cancel button
#    And Calculate the value of Mix And Match Discount for After Tax - "10" percentage with Set Price as "11.75"
#    Then Complete the payment using fast cash button
#    And Click the Logoff button
#
#  Scenario: Verify the discount value - Mix And Match Discount for After Tax - "10" percentage with Set Each Item Price as "8.25"
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen
#    When Click the Discount Option from the given options
#    And Search for the discount as "MAM_AT_SEIP"
#    Then Click the "MAM_AT_SEIP" discount
#    And Click the cancel button
#    And Calculate the value of Mix And Match Discount for After Tax - "10" percentage with Set Each Item Price as "8.25"
#    Then Complete the payment using fast cash button
#    And Click the Logoff button
#
#  Scenario: Verify the discount value - Mix And Match Discount for After Tax - "10" percentage with Set Percentage as "7" Least Expensive
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen
#    When Click the Discount Option from the given options
#    And Search for the discount as "MAM_AT_SPL"
#    Then Click the "MAM_AT_SPL" discount
#    And Click the cancel button
#    And Calculate the value of Mix And Match Discount for After Tax - "10" percentage with Set Percentage as "7" Least Expensive
#    Then Complete the payment using fast cash button
#    And Click the Logoff button
#
#  Scenario: Verify the discount value - Mix And Match Discount for After Tax - "10" percentage with Set Percentage as "7" Most Expensive
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen
#    When Click the Discount Option from the given options
#    And Search for the discount as "MAM_AT_SPM"
#    Then Click the "MAM_AT_SPM" discount
#    And Click the cancel button
#    And Calculate the value of Mix And Match Discount for After Tax - "10" percentage with Set Percentage as "7" Most Expensive
#    Then Complete the payment using fast cash button
#    And Click the Logoff button
#
#  Scenario: Verify the discount value - Mix And Match Discount for After Tax - "10" percentage with Set Percentage as "7" With Combo Discounts
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen
#    When Click the Discount Option from the given options
#    And Search for the discount as "MAM_AT_SP_C"
#    Then Click the "MAM_AT_SP_C" discount
#    And Click the cancel button
#    And Calculate the value of Mix And Match Discount for After Tax - "10" percentage with Set Percentage as "7" With Combo Discounts
#    Then Complete the payment using fast cash button
#    And Click the Logoff button
#
#  Scenario: Verify the discount value - Mix And Match Discount for After Tax - "10" percentage with Set Price as "11.75" With Combo Discounts
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen
#    When Click the Discount Option from the given options
#    And Search for the discount as "MAM_AT_AMT_C"
#    Then Click the "MAM_AT_AMT_C" discount
#    And Click the cancel button
#    And Calculate the value of Mix And Match Discount for After Tax - "10" percentage with Set Price as "11.75" With Combo Discounts
#    Then Complete the payment using fast cash button
#    And Click the Logoff button
#
#  Scenario: Verify the discount value - Mix And Match Discount for Before Tax - "10" percentage with Set Price as "11.75"
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen
#    When Click the Discount Option from the given options
#    And Search for the discount as "MAM_BT_SP"
#    Then Click the "MAM_BT_SP" discount
#    And Click the cancel button
#    And Calculate the value of Mix And Match Discount for Before Tax - "10" percentage with Set Price as "11.75"
#    Then Complete the payment using fast cash button
#    And Click the Logoff button
#
#  Scenario: Verify the discount value - Mix And Match Discount for Before Tax - "10" percentage with Set Each Item Price as "8.25"
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen
#    When Click the Discount Option from the given options
#    And Search for the discount as "MAM_BT_SEIP"
#    Then Click the "MAM_BT_SEIP" discount
#    And Click the cancel button
#    And Calculate the value of Mix And Match Discount for Before Tax - "10" percentage with Set Each Item Price as "8.25"
#    Then Complete the payment using fast cash button
#    And Click the Logoff button
#
#  Scenario: Verify the discount value - Mix And Match Discount for Before Tax - "10" percentage with Set Percentage as "7" Least Expensive
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen
#    When Click the Discount Option from the given options
#    And Search for the discount as "MAM_BT_SPL"
#    Then Click the "MAM_BT_SPL" discount
#    And Click the cancel button
#    And Calculate the value of Mix And Match Discount for Before Tax - "10" percentage with Set Percentage as "7" Least Expensive
#    Then Complete the payment using fast cash button
#    And Click the Logoff button
#
#  Scenario: Verify the discount value - Mix And Match Discount for Before Tax - "10" percentage with Set Percentage as "7" Most Expensive
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen
#    When Click the Discount Option from the given options
#    And Search for the discount as "MAM_BT_SPM"
#    Then Click the "MAM_BT_SPM" discount
#    And Click the cancel button
#    And Calculate the value of Mix And Match Discount for Before Tax - "10" percentage with Set Percentage as "7" Most Expensive
#    Then Complete the payment using fast cash button
#    And Click the Logoff button
#
#  Scenario: Verify the discount value - Mix And Match Discount for Before Tax - "10" percentage with Set Percentage as "7" With Combo Discounts
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen
#    When Click the Discount Option from the given options
#    And Search for the discount as "MAM_BT_SP_C"
#    Then Click the "MAM_BT_SP_C" discount
#    And Click the cancel button
#    And Calculate the value of Mix And Match Discount for Before Tax - "10" percentage with Set Percentage as "7" With Combo Discounts
#    Then Complete the payment using fast cash button
#    And Click the Logoff button
#
#  Scenario: Verify the discount value - Mix And Match Discount for Before Tax - "10" percentage with Set Price as "11.75" With Combo Discounts
#    Given Login with the valid credentials
#    Then Order the Standard Item from the retail Screen
#    When Click the Discount Option from the given options
#    And Search for the discount as "MAM_BT_AMT_C"
#    Then Click the "MAM_BT_AMT_C" discount
#    And Click the cancel button
#    And Calculate the value of Mix And Match Discount for Before Tax - "10" percentage with Set Price as "11.75" With Combo Discounts
#    Then Complete the payment using fast cash button
#    And Click the Logoff button