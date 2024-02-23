@Tax   @Reg

  Feature: Tax calculation for all type of retail items

@err1
    Scenario: Calculate the exclusive tax for the Standard Item with fast cash
      Given Login with the valid credentials
      Then Order the Standard Item from the retail Screen
      And Calculate the exclusive tax and values
      Then Complete the payment using fast cash button
      And Click the Logoff button

    Scenario: Calculate the exclusive tax for the Variant Item with fast cash
      Given Login with the valid credentials
      Then Order the Variant item from the retail Screen
      And Calculate the exclusive tax and values
      Then Complete the payment using fast cash button
      And Click the Logoff button

#      As of now kit-Assembly Item displayed in the vertical view so unable to working on that - 18-Dec-2023
    Scenario: Calculate the exclusive tax for the Kit Assembly Item with fast cash
      Given Login with the valid credentials
      Then Order the Kit Assembly item from the retail Screen
      And Calculate the exclusive tax and values
      Then Complete the payment using fast cash button
      And Click the Logoff button

    Scenario: Calculate the inclusive tax for the Random menu item with fast cash - Single Standard
      Given Login with the valid credentials
      Then Place the single retail standard item with Inclusive tax
      And Calculate the inclusive tax and values
      Then Complete the payment using fast cash button
      And Click the Logoff button

    Scenario: Calculate the inclusive tax for the Random menu item with fast cash - Single Variant
      Given Login with the valid credentials
      Then Place the single retail Variant item with Inclusive tax
      And Calculate the inclusive tax and values
      Then Complete the payment using fast cash button
      And Click the Logoff button

    Scenario: Calculate the inclusive tax for the Random menu item with fast cash - Single KitAssembly
      Given Login with the valid credentials
      Then Place the single retail KitAssembly item with Inclusive tax
      And Calculate the inclusive tax and values
      Then Complete the payment using fast cash button
      And Click the Logoff button

    Scenario: Calculate the inclusive tax for the Random menu item with fast cash - Multiple Standard
      Given Login with the valid credentials
      Then Place the Multiple retail standard item with Inclusive tax
      And Calculate the inclusive tax and values
      Then Complete the payment using fast cash button
      And Click the Logoff button

    Scenario: Calculate the inclusive tax for the Random menu item with fast cash - Multiple Variant
      Given Login with the valid credentials
      Then Place the Multiple retail Variant item with Inclusive tax
      And Calculate the inclusive tax and values
      Then Complete the payment using fast cash button
      And Click the Logoff button

    Scenario: Calculate the inclusive tax for the Random menu item with fast cash - Multiple KitAssembly
      Given Login with the valid credentials
      Then Place the Multiple retail KitAssembly item with Inclusive tax
      And Calculate the inclusive tax and values
      Then Complete the payment using fast cash button
      And Click the Logoff button

    Scenario: Calculate the Quantity Based Tax for the Random menu item with the fast cash - Single Standard
      Given Login with the valid credentials
      Then Order the Single Standard item for the quantity based tax
      And Calculate the quantity based tax and values
      Then Complete the payment using fast cash button
      And Click the Logoff button

    Scenario: Calculate the Quantity Based Tax for the Random menu item with the fast cash - Single Variant
      Given Login with the valid credentials
      Then Order the Single Variant item for the quantity based tax
      And Calculate the quantity based tax and values
      Then Complete the payment using fast cash button
      And Click the Logoff button

    Scenario: Calculate the Quantity Based Tax for the Random menu item with the fast cash - Single Kit Assembly
      Given Login with the valid credentials
      Then Order the Single Kit Assembly item for the quantity based tax
      And Calculate the quantity based tax and values
      Then Complete the payment using fast cash button
      And Click the Logoff button


    Scenario: Calculate the Quantity Based Tax for the Random menu item with the fast cash - Multiple Standard
      Given Login with the valid credentials
      Then Order the Multiple Standard item for the quantity based tax
      And Calculate the quantity based tax and values
      Then Complete the payment using fast cash button
      And Click the Logoff button

    Scenario: Calculate the Quantity Based Tax for the Random menu item with the fast cash - Multiple Variant
      Given Login with the valid credentials
      Then Order the Multiple Variant item for the quantity based tax
      And Calculate the quantity based tax and values
      Then Complete the payment using fast cash button
      And Click the Logoff button

    Scenario: Calculate the Quantity Based Tax for the Random menu item with the fast cash - Multiple Kit Assembly
      Given Login with the valid credentials
      Then Order the Multiple Kit Assembly item for the quantity based tax
      And Calculate the quantity based tax and values
      Then Complete the payment using fast cash button
      And Click the Logoff button

    Scenario: Calculate the Check Based Tax for the Random menu item - Single Standard
      Given Login with the valid credentials
      Then Order the Single Standard item for the check based tax
      And Calculate the check based tax and values
      Then Void the Ordered items from the Retail Screen
      And Click the Logoff button

    Scenario: Calculate the Check Based Tax for the Random menu item - Single Variant
      Given Login with the valid credentials
      Then Order the Single Variant item for the check based tax
      And Calculate the check based tax and values
      Then Void the Ordered items from the Retail Screen
      And Click the Logoff button

    Scenario: Calculate the Check Based Tax for the Random menu item - Single Kit Assembly
      Given Login with the valid credentials
      Then Order the Single Kit Assembly item for the check based tax
      And Calculate the check based tax and values
      Then Void the Ordered items from the Retail Screen
      And Click the Logoff button

    Scenario: Calculate the Check Based Tax for the Random menu item - Multiple Standard
      Given Login with the valid credentials
      Then Order the Multiple Standard item for the check based tax
      And Calculate the check based tax and values
      Then Void the Ordered items from the Retail Screen
      And Click the Logoff button

    Scenario: Calculate the Check Based Tax for the Random menu item - Multiple Variant
      Given Login with the valid credentials
      Then Order the Multiple Variant item for the check based tax
      And Calculate the check based tax and values
      Then Void the Ordered items from the Retail Screen
      And Click the Logoff button

    Scenario: Calculate the Check Based Tax for the Random menu item - Multiple Kit Assembly
      Given Login with the valid credentials
      Then Order the Multiple Kit Assembly item for the check based tax
      And Calculate the check based tax and values
      Then Void the Ordered items from the Retail Screen
      And Click the Logoff button

      Scenario: Calculate the Tax on Item Tax for the Random menu item - Single Standard
      Given Login with the valid credentials
      Then Order the Single Standard item for the tax on Item tax
      And Calculate the tax on item tax and values
      Then Complete the payment using fast cash button
      And Click the Logoff button

    Scenario: Calculate the Tax on Item Tax for the Random menu item - Single Variant
      Given Login with the valid credentials
      Then Order the Single Variant item for the tax on Item tax
      And Calculate the tax on item tax and values
      Then Complete the payment using fast cash button
      And Click the Logoff button

    Scenario: Calculate the Tax on Item Tax for the Random menu item - Single Kit Assembly
      Given Login with the valid credentials
      Then Order the Single Kit Assembly item for the tax on Item tax
      And Calculate the tax on item tax and values
      Then Complete the payment using fast cash button
      And Click the Logoff button

    Scenario: Calculate the Tax on Item Tax for the Random menu item - Multiple Standard
      Given Login with the valid credentials
      Then Order the Multiple Standard item for the tax on Item tax
      And Calculate the tax on item tax and values
      Then Complete the payment using fast cash button
      And Click the Logoff button

    Scenario: Calculate the Tax on Item Tax for the Random menu item - Multiple Variant
      Given Login with the valid credentials
      Then Order the Multiple Variant item for the tax on Item tax
      And Calculate the tax on item tax and values
      Then Complete the payment using fast cash button
      And Click the Logoff button

    Scenario: Calculate the Tax on Item Tax for the Random menu item - Multiple Kit Assembly
      Given Login with the valid credentials
      Then Order the Multiple Kit Assembly item for the tax on Item tax
      And Calculate the tax on item tax and values
      Then Complete the payment using fast cash button
     And Click the Logoff button