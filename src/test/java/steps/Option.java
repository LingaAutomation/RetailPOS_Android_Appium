package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

public class Option {
    @And("Click the option field at the bottom of custom options")
    public void clickTheOptionFieldAtTheBottomOfCustomOptions() throws Exception {
        new Option_Page().clickTheOptionBtn();
    }

    @Then("Receipt option screen will appear")
    public void receiptOptionScreenWillAppear() {
        new Option_Page().verifyTheCheckOptionText();
    }

    @Then("Shows Tax Exempt, Discount, Open Item, Gift Card, Search Item, Open Cash Drawer, Service Exempt, Void, Apply Credit, EBT Balance and Cancel option")
    public void showsTaxExemptDiscountOpenItemGiftCardSearchItemOpenCashDrawerServiceExemptVoidApplyCreditEBTBalanceAndCancelOption() {
        new Option_Page().verifyTheTaxExemptBtnInTheCheckOption();
        new Option_Page().verifyTheDiscountBtnInTheCheckOption();
        new Option_Page().verifyTheOpenItemBtnInTheCheckOption();
        new Option_Page().verifyTheGiftCardBtnInTheCheckOption();
        new Option_Page().verifyTheSearchItemBtnInTheCheckOption();
        new Option_Page().verifyTheOpenCashDrawerBtnInTheCheckOption();
        new Option_Page().verifyTheServiceExemptBtnInTheCheckOption();
        new Option_Page().verifyTheVoidBtnInTheCheckOption();
        new Option_Page().verifyThePrintBtnInTheCheckOption();
        new Option_Page().verifyTheModifyBtnInTheCheckOption();
        new Option_Page().verifyTheApplyStoreCreditBtnInTheCheckOption();
        new Option_Page().verifyTheEBTBalanceBtnInTheCheckOption();
    }

    @Then("Able to view the option field")
    public void ableToViewTheOptionField() {
        new Option_Page().verifyTheOptionBtnFromRetailScreen();
    }

    @Then("Verify the Tax availability from retail screen")
    public void verifyTheTaxAvailabilityFromRetailScreen() {
        new Option_Page().verifyTheTaxFromRetailScreen();
    }

    @When("Tax Exempt option is clicked")
    public void taxExemptOptionIsClicked() {
        new Option_Page().clickTheTaxExemptBtn();
    }

    @And("Tax column will get removed from the left order summary")
    public void taxColumnWillGetRemovedFromTheLeftOrderSummary() {
        new Option_Page().verifyTheTaxFromRetailScreen_AfterClickTaxExempt();
    }

    @Then("Again click Tax Exempt option")
    public void againClickTaxExemptOption() {
        new Option_Page().clickTheTaxExemptOption_1();
    }

    @When("Discount option is clicked")
    public void discountOptionIsClicked() {
        new Option_Page().clickTheDiscountBtn();
    }

    @When("Open Item option is clicked")
    public void openItemOptionIsClicked() {
        new Option_Page().clickTheOpenItemBtn();
    }

    @When("Gift Card option is clicked")
    public void giftCardOptionIsClicked() {
        new Option_Page().clickTheGiftCardBtn();
    }

    @When("Search Item option is clicked")
    public void searchItemOptionIsClicked() {
        new Option_Page().clickTheSearchItemBtn();
    }

    @When("Able to view Open Cash Drawer option")
    public void ableToViewOpenCashDrawerOption() {
        new Option_Page().verifyTheOpenCashDrawerBtnInTheCheckOption();
    }

    @When("Service Exempt option is clicked")
    public void serviceExemptOptionIsClicked() {
        new Option_Page().clickTheServiceExemptBtn();
    }

    @When("Click on void field in receipt option screen")
    public void clickOnVoidFieldInReceiptOptionScreen() {
        new Option_Page().clickTheVoidBtn();
    }

    @When("Able to view Print option")
    public void ableToViewPrintOption() {
        new Option_Page().verifyThePrintBtnInTheCheckOption();
    }

    @When("Able to view Apply Store Credit option")
    public void ableToViewApplyStoreCreditOption() {
        new Option_Page().verifyTheApplyStoreCreditBtnInTheCheckOption();
    }

    @When("Click Apply Store Credit option")
    public void clickApplyStoreCreditOption() {
        new Option_Page().clickTheApplyStoreCreditBtn();
    }

    @Then("Empty Discount screen will appear")
    public void emptyDiscountScreenWillAppear() {
        new Option_Page().verifyTheDiscountEmptyFromRetailScreen();
    }

    @Then("Discount screen with {} configured in BO will appear")
    public void discountScreenWithConfiguredInBOWillAppear(String disc) {
        new Option_Page().verifyTheRequiredDiscount(disc);
    }

    @When("{} shown in discount screen is clicked")
    public void shownInDiscountScreenIsClicked(String disc) {
        new Option_Page().clickTheRequiredDiscount(disc);
    }

    @Then("Selected discount will get applied in order summary based on configured percentage in BO for applied {}")
    public void selectedDiscountWillGetAppliedInOrderSummaryBasedOnConfiguredPercentageInBOForApplied(String disc) throws Throwable {
        new RetailPOS_Order_Page().Check_Values_Validations_With_Item_Based_Discount_After_Tax(disc);
    }

    @Then("Applied Item Discount will get removed from left order summary")
    public void appliedItemDiscountWillGetRemovedFromLeftOrderSummary() {
        new Option_Page().verifyTheDiscountFromRetailScreen_AfterClickDiscount();
    }

    @Then("Click on the filter symbol present in Discount Screen")
    public void clickOnTheFilterSymbolPresentInDiscountScreen() {
        new Option_Page().clickTheFilterOptionFromDiscountScreen();
    }

    @When("Check boxes are shown as selected by default for Item Discount and Check Discount")
    public void checkBoxesAreShownAsSelectedByDefaultForItemDiscountAndCheckDiscount() {
        new Option_Page().verifyTheItemAndCheckDiscountFromFilter_In_DiscountScreen();
    }

    @When("Search box with symbol , filter and Cancel option")
    public void searchBoxWithSymbolFilterAndCancelOption() {
        new Option_Page().verifyTheDiscountsSearchFromDiscountScreen();
        new Option_Page().verifyTheDiscountsFromDiscountScreen();
        new Option_Page().verifyTheDiscountFilterBtnFromRetailScreen();
        new Option_Page().verifyTheCancelBtnInTheCheckOption();
    }

    @Then("Open Item screen will appear with Item Name, Price, Tax along with input box including Cancel and Done")
    public void openItemScreenWillAppearWithItemNamePriceTaxAlongWithInputBoxIncludingCancelAndDone() {
        new Option_Page().verifyTheOpenItem_OpenItemScreen();
        new Option_Page().verifyTheItemName_OpenItemScreen();
        new Option_Page().verifyTheItemNameTextBox_OpenItemScreen();
        new Option_Page().verifyThePrice_OpenItemScreen();
        new Option_Page().verifyThePriceTextBox_OpenItemScreen();
        new Option_Page().verifyTheTax_OpenItemScreen();
        new Option_Page().verifyTheTaxList_OpenItemScreen();
        new Option_Page().verifyTheCancelBtnInTheCheckOption();
        new Option_Page().verifyTheDone_OpenItemScreen();
    }

    @When("Enter Open Item Name in Item Name input box")
    public void enterOpenItemNameInItemNameInputBox() {
        new Option_Page().enterTheOpenItemName();
    }

    @Then("Enter Price for that Open Item in Price input box")
    public void enterPriceForThatOpenItemInPriceInputBox() {
        new Option_Page().clickThePriceTextBox();
        new Customer_Profile_Page().clickTheNumber3();
        new Customer_Profile_Page().clickTheNumber0();
        new Customer_Profile_Page().clickTheNumber0();
        new Customer_Profile_Page().clickTheNumber0();
        new Customer_Profile_Page().clickTheContinueBtn();
    }

    @Then("Select the Tax displayed in Tax field")
    public void selectTheTaxDisplayedInTaxField() {
        new Option_Page().clickTheFirstTax_OpenItemScreen();
    }

    @When("Open Item will get placed in retail order screen with the given data")
    public void openItemWillGetPlacedInRetailOrderScreenWithTheGivenData() {
        new Option_Page().verifyTheOpenItemAndItsPrice();
    }


    @Then("Gift Card screen will appear with Gift Card, GiveX and Factor Four")
    public void giftCardScreenWillAppearWithGiftCardGiveXAndFactorFour() {
        new Option_Page().verifyTheGiftCard_GiftCardScreen();
        new Option_Page().verifyTheGiveX_GiftCardScreen();
        new Option_Page().verifyTheFactor4_GiftCardScreen();
        new Option_Page().verifyTheCardNumber_GiftCardScreen();
        new Option_Page().verifyTheCardNumber0_GiftCardScreen();
        new Option_Page().verifyTheBeginningBalance_GiftCardScreen();
        new Option_Page().verifyTheRecuringBalance_GiftCardScreen();
    }

    @When("Select the Gift Card and select the card number")
    public void selectTheGiftCardAndSelectTheCardNumber() {
        new Option_Page().clickTheGiftCardAndClickTheNumber();
    }

    @Then("Number pad will appear in which user can enter the gift card number for purchase")
    public void numberPadWillAppearInWhichUserCanEnterTheGiftCardNumberForPurchase() {
        new Customer_Profile_Page().clickTheNumber5();
        new Customer_Profile_Page().clickTheNumber4();
        new Customer_Profile_Page().clickTheNumber3();
        new Customer_Profile_Page().clickTheNumber2();
        new Customer_Profile_Page().clickTheNumber1();
        new Customer_Profile_Page().clickTheContinueBtn();
    }

    @When("Entered gift card number will be populated in Gift Card Screen with fields such as Charge Amount, Beginning Balance, Recurring Balance with Cancel and Done button")
    public void enteredGiftCardNumberWillBePopulatedInGiftCardScreenWithFieldsSuchAsChargeAmountBeginningBalanceRecurringBalanceWithCancelAndDoneButton() {
        new Option_Page().verifyTheChargeAmount_GiftCardScreen();
        new Option_Page().verifyTheBeginningBalance_GiftCardScreen();
        new Option_Page().verifyTheRecuringBalance_GiftCardScreen();
        new Option_Page().verifyTheCancelBtnInTheCheckOption();
        new Option_Page().verifyTheDone_OpenItemScreen();
    }

    @Then("Number pad will appear then enter existing gift card number")
    public void numberPadWillAppearThenEnterExistingGiftCardNumber() {
        new Customer_Profile_Page().clickTheNumber5();
        new Customer_Profile_Page().clickTheNumber4();
        new Customer_Profile_Page().clickTheNumber3();
        new Customer_Profile_Page().clickTheNumber2();
        new Customer_Profile_Page().clickTheNumber1();
        new Customer_Profile_Page().clickTheContinueBtn();
    }

    @Then("Displays Charge Amount as zero, Beginning Balance, Recurring Balance with Cancel and Done button for the entered customer")
    public void displaysChargeAmountAsZeroBeginningBalanceRecurringBalanceWithCancelAndDoneButtonForTheEnteredCustomer() {
        new Option_Page().verifyTheChargeAmount_GiftCardScreen();
        new Option_Page().verifyTheBeginningBalance_GiftCardScreen();
        new Option_Page().verifyTheRecuringBalance_GiftCardScreen();
        new Option_Page().verifyTheCancelBtnInTheCheckOption();
        new Option_Page().verifyTheDone_OpenItemScreen();
        new Option_Page().verifyTheChargeAmountValue_GiftCardScreen();
    }

    @When("Suspend Account Toggle is present")
    public void suspendAccountToggleIsPresent() {
        new Option_Page().verifyTheSuspendAccount_GiftCardScreen();
    }

    @When("By default Suspend Account toggle is enabled")
    public void byDefaultSuspendAccountToggleIsEnabled() {
        new Option_Page().verifyTheSuspendAccountEnabled_GiftCardScreen();
    }

    @When("Disable Suspend Account toggle with {}")
    public void disableSuspendAccountToggleWith(String msg) {
        new Option_Page().verifyTheSuspendAccountDisabled_GiftCardScreen(msg);
    }

    @Then("Enable Suspend Account toggle with {}")
    public void enableSuspendAccountToggleWith(String msg) {
        new Option_Page().verifyTheActivateTheAccountFromDisabled_GiftCardScreen(msg);
    }

    @When("Click on Done button without entering charge amount")
    public void clickOnDoneButtonWithoutEnteringChargeAmount() {
        new RetailPOS_Order_Page().ClickDoneBtn();
    }

    @Then("{} pop up will appear")
    public void popUpWillAppear(String msg) {
        new Option_Page().verifyThePopupWithOutChargeAmount(msg);
        new RetailPOS_Order_Page().ClickDoneBtn();
    }

    @When("Click on Cancel button without entering charge amount")
    public void clickOnCancelButtonWithoutEnteringChargeAmount() {
        try{
            new Park_Sale_And_Retrieve_Sale_Page().clickTheCancelBtn();
        }catch (Exception ignored){}
    }

    @Then("Gift Card screen will disappear")
    public void giftCardScreenWillDisappear() {
        new Option_Page().verifyTheGiftCard_GiftCardScreen1();
    }

    @Then("Enter the charge amount by entering the amount in number pad if check amount is clicked")
    public void enterTheChargeAmountByEnteringTheAmountInNumberPadIfCheckAmountIsClicked() {
        new Customer_Profile_Page().clickTheNumber3();
        new Customer_Profile_Page().clickTheNumber0();
        new Customer_Profile_Page().clickTheNumber0();
        new Customer_Profile_Page().clickTheNumber0();
        new Customer_Profile_Page().clickTheContinueBtn();
    }

    @When("Entered amount will get populated in Charge Amount field")
    public void enteredAmountWillGetPopulatedInChargeAmountField() {
        new Option_Page().verifyTheChargeAmountValueAfterEnterTheAmount_GiftCardScreen();
    }

    @And("That gift card details will get populated in retail order screen")
    public void thatGiftCardDetailsWillGetPopulatedInRetailOrderScreen() {
        new Option_Page().verifyTheGiftCardDetailsAndItsPrice_InRetailScreen();
    }

    @Then("Try to select GiveX but unable to select it")
    public void tryToSelectGiveXButUnableToSelectIt() {
        new Option_Page().clickTheGiveX();
    }

    @Then("Try to select Factor Four but unable to select it")
    public void tryToSelectFactorFourButUnableToSelectIt() {
        new Option_Page().clickTheFactorFour();
    }

    @Then("Cursor will pointed in search field")
    public void cursorWillPointedInSearchField() {
        new Option_Page().verifyTheSearchIsFocused_RetailScreen();
    }

    @When("User can search the retail item by using SKU code and Retail Item Name")
    public void userCanSearchTheRetailItemByUsingSKUCodeAndRetailItemName() {
        new Option_Page().SearchTheItem();
    }

    @Then("Verify the Service Charge availability from retail screen")
    public void verifyTheServiceChargeAvailabilityFromRetailScreen() {
        new Option_Page().verifyTheServiceChargeFromRetailScreen();
    }

    @And("Service Charge will get removed from left order summary")
    public void serviceChargeWillGetRemovedFromLeftOrderSummary() {
        new Option_Page().verifyTheServiceChargeFromRetailScreen1();
    }

    @When("Able to view void field in receipt option screen")
    public void ableToViewVoidFieldInReceiptOptionScreen() {
        new Option_Page().verifyTheVoidBtnInTheCheckOption();
    }

    @When("Click Apply Store Credit option without customer then the {} is displayed")
    public void clickApplyStoreCreditOptionWithoutCustomerThenTheIsDisplayed(String msg) {
        new Option_Page().clickTheApplyStoreCreditBtn1(msg);
    }

    @And("Click the Attached Customer")
    public void clickTheAttachedCustomer() {
        new Option_Page().clickTheAttachedCustomer();
    }

    @Then("Select +Add Credit option under Store Credit Balance")
    public void selectAddCreditOptionUnderStoreCreditBalance() {
        new Option_Page().clickTheAddCreditBtn();
    }

    @When("ADD STORE CREDIT screen with number pad will be displayed then Enter the amount")
    public void addSTORECREDITScreenWithNumberPadWillBeDisplayedThenEnterTheAmount() {
        new Customer_Profile_Page().clickTheNumber3();
        new Customer_Profile_Page().clickTheNumber0();
        new Customer_Profile_Page().clickTheNumber0();
        new Customer_Profile_Page().clickTheNumber0();
        new Customer_Profile_Page().clickTheContinueBtn();
    }

    @Then("Click Save and page will navigate to retail order screen by attached customer with store credit")
    public void clickSaveAndPageWillNavigateToRetailOrderScreenByAttachedCustomerWithStoreCredit() {
        new Option_Page().clickTheSaveBtn();
    }

    @Then("Verify the Apply Store Credit and enter the amount")
    public void verifyTheApplyStoreCreditAndEnterTheAmount() {
        new Option_Page().verifyTheApplyStoreCredit_RetailScreen();
        new Option_Page().clickTheApplyStoreCreditEditBox();
        new Customer_Profile_Page().clickTheNumber3();
        new Customer_Profile_Page().clickTheNumber0();
        new Customer_Profile_Page().clickTheNumber0();
        new Customer_Profile_Page().clickTheContinueBtn();
    }

    @And("Click the Apply Credit button then the {} is displayed")
    public void clickTheApplyCreditButtonThenTheIsDisplayed(String msg) {
        new Option_Page().clickTheApplyCreditBtn(msg);
    }

    @Then("Click the Edit button of Add Credit option in customer profile screen")
    public void clickTheEditButtonOfAddCreditOptionInCustomerProfileScreen() {
        new Option_Page().clickTheEditBtn();
    }

    @And("Clear the amount in the Store credit")
    public void clearTheAmountInTheStoreCredit() {
        new Customer_Profile_Page().clickBtnC();
    }

}
