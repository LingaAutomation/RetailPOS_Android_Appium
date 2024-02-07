package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Item_Selection_Page;
import pages.RetailPOS_Order_Page;
import pages.Standard_Item_POS_Page;

public class Layaway {

    String Total;

    @Then("Select the Layaway option without selecting any items")
    public void selectTheLayAwayOptionWithoutSelectingAnyItems() throws Throwable {
        new RetailPOS_Order_Page().getOrder_Screen_layawayBtn().click();
    }

    @Then("Error message should be displayed shown {} for with out any item")
    public void errorMessageShouldBeDisplayedShownForWithOutAnyMenuItem(String msg) {
        new RetailPOS_Order_Page().LayAway_Without_Item(msg);
    }

    @Then("Place Standard retail item in retail order screen with exclusive or item tax  without attaching customer")
    public void placeStandardRetailItemInRetailOrderScreenWithExclusiveOrItemTaxWithoutAttachingCustomer() throws Throwable {
        new Item_Selection_Page().multipleMenu_Selection_Random();
    }

    @Then("Click the Layaway option in retail order screen")
    public void clickTheLayawayOptionInRetailOrderScreen() {
        new RetailPOS_Order_Page().getOrder_Screen_layawayBtn().click();
    }

    @Then("Page will redirect to Add customer screen")
    public void pageWillRedirectToAddCustomerScreen() {
        new RetailPOS_Order_Page().addCustomerPopupDisplayed();
    }

    @And("Click the close button of add customer popup and void the retail items")
    public void clickTheCloseButtonOfAddCustomerPopupAndVoidTheRetailItems() {
        new RetailPOS_Order_Page().closeTheAddCustomerPopup();
        new RetailPOS_Order_Page().Void_MenuItems();
    }

    @Then("Place Variant retail item in retail order screen with exclusive or item tax")
    public void placeVariantRetailItemInRetailOrderScreenWithExclusiveOrItemTax() throws Throwable {
        new Item_Selection_Page().multipleMenu_Selection_Random_Variant();
    }

    @When("Click on Layaway option in retail order screen")
    public void clickOnLayawayOptionInRetailOrderScreen() {
        new RetailPOS_Order_Page().getOrder_Screen_layawayBtn().click();
    }

    @And("Enter Deposit Amount screen will appear")
    public void enterDepositAmountScreenWillAppear() {
        new RetailPOS_Order_Page().enterDepositAmountPopupDisplayed();
    }

    @And("Click the close button of enter deposit amount popup and void the retail items")
    public void clickTheCloseButtonOfEnterDepositAmountPopupAndVoidTheRetailItems() {
        new RetailPOS_Order_Page().closeTheAddCustomerPopup();
        new RetailPOS_Order_Page().Void_MenuItems();
    }

    @Then("Place Standard retail item in retail order screen with exclusive or item tax")
    public void placeStandardRetailItemInRetailOrderScreenWithExclusiveOrItemTax() throws Throwable {
        new Item_Selection_Page().multipleMenu_Selection_Random();
    }

    @And("User can view Due Balance, Suggested Deposit percentage and minimum deposit percentage")
    public void userCanViewDueBalanceSuggestedDepositPercentageAndMinimumDepositPercentage() {
        new RetailPOS_Order_Page().verifyTheElementAvailabilityInEnterDepositAmountScreen();
    }

    @Then("Click on Get Deposit button without selecting Suggested or Minimum percentage amount")
    public void clickOnGetDepositButtonWithoutSelectingSuggestedOrMinimumPercentageAmount() {
        new RetailPOS_Order_Page().get_Enter_Deposit_Amount_Screen_GET_DEPOSIT().click();
    }

    @Then("Place Variant retail item in retail order screen with inclusive tax")
    public void placeVariantRetailItemInRetailOrderScreenWithInclusiveTax() throws Throwable {
        new RetailPOS_Order_Page().Single_Random_Menu_Selection_ForInclusiveTaxes_Variant();
    }

    @Then("Click on Suggested Deposit button")
    public void clickOnSuggestedDepositButton() {
        new RetailPOS_Order_Page().get_Enter_Deposit_Amount_Screen_SUGG_DEPOSIT().click();
    }

    @Then("Click on Minimum Deposit button")
    public void clickOnMinimumDepositButton() {
        new RetailPOS_Order_Page().get_Enter_Deposit_Amount_Screen_MIN_DEPOSIT().click();
    }

    @And("Click on Get Deposit button")
    public void clickOnGetDepositButton() {
        new RetailPOS_Order_Page().get_Enter_Deposit_Amount_Screen_GET_DEPOSIT().click();
    }

    @Then("Click on Minimum or Suggested Deposit button")
    public void clickOnMinimumOrSuggestedDepositButton() {
        new RetailPOS_Order_Page().clickSuggestedDepositOrMinimumDeposit();
    }

    @Then("Place Variant retail item in retail order screen with check tax")
    public void placeVariantRetailItemInRetailOrderScreenWithCheckTax() throws Throwable {
        new RetailPOS_Order_Page().Single_Random_Menu_Selection_ForCBTaxes_Variant();
    }

    @Then("Place Kit Assembly retail item in retail order screen with exclusive or item tax")
    public void placeKitAssemblyRetailItemInRetailOrderScreenWithExclusiveOrItemTax() throws Throwable {
        new Item_Selection_Page().multipleMenu_Selection_Random_Kit_Accessible();
    }

    @And("Calculate the Correct Values are displayed or not in the enter deposit amount popup then values are {} and {}")
    public void calculateTheCorrectValuesAreDisplayedOrNotInTheEnterDepositAmountPopupThenValuesAreAnd(String suggestedDeposit, String minimumDeposit) throws Throwable {
        new Standard_Item_POS_Page().Verify_The_TotalInEnterDepositAmountButton(Total);
        Total = Total.replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        new RetailPOS_Order_Page().verifyTheValuesSuggestedDeposit(Total,suggestedDeposit);
        new RetailPOS_Order_Page().verifyTheValuesMinimumDeposit(Total,minimumDeposit);
    }

    @Then("Get the total amount from the order screen")
    public void getTheTotalAmountFromTheOrderScreen() {
        Total = new RetailPOS_Order_Page().get_TotalAmount();
    }

    @When("{} popup along with Done will appear")
    public void popupAlongWithDoneWillAppear(String msg) {
        new RetailPOS_Order_Page().SuggestedDeposit(msg);
    }

    @Then("Suggested deposit amount will be populated in number pad in Enter Deposit Amount screen")
    public void suggestedDepositAmountWillBePopulatedInNumberPadInEnterDepositAmountScreen() {
        new RetailPOS_Order_Page().verifyTheSuggestedAmountInEnterDepositAmountScreen();
    }

    @Then("Minimum deposit amount will be populated in number pad in Enter Deposit Amount screen")
    public void minimumDepositAmountWillBePopulatedInNumberPadInEnterDepositAmountScreen() {
        new RetailPOS_Order_Page().verifyTheMinimumAmountInEnterDepositAmountScreen();
    }

    @Then("Selected deposit amount either Suggested or Minimum deposit amount will be populated in number pad in Enter Deposit Amount screen")
    public void selectedDepositAmountEitherSuggestedOrMinimumDepositAmountWillBePopulatedInNumberPadInEnterDepositAmountScreen() {
        new RetailPOS_Order_Page().verifyTheSuggestedOrMinimumAmountInEnterDepositAmountScreen();
    }

    @And("User can view the Due Balance and total amount is same or not")
    public void userCanViewTheDueBalanceAndTotalAmountIsSameOrNot() throws Throwable {
        new Standard_Item_POS_Page().Verify_The_TotalInEnterDepositAmountButton(Total);
    }

    @Then("User can view Balance Due amount which was selected in Enter Deposit Screen")
    public void userCanViewBalanceDueAmountWhichWasSelectedInEnterDepositScreen() throws Throwable {
        new Standard_Item_POS_Page().Verify_The_TotalInEnterDepositAmountAndPaymentsScreen(Total);
    }

    @Then("Complete the Payments using Cash method")
    public void completeThePaymentsUsingCashMethod() throws InterruptedException {
        new Standard_Item_POS_Page().Cash_Option();
        new Standard_Item_POS_Page().Cash_Option();
        new Standard_Item_POS_Page().Submit_Option();
        Thread.sleep(1000);
    }

    @And("Select the payment method to pay the deposit amount")
    public void selectThePaymentMethodToPayTheDepositAmount() throws InterruptedException {
        new Standard_Item_POS_Page().Cash_Option();
        new Standard_Item_POS_Page().Cash_Option();
        new Standard_Item_POS_Page().Submit_Option();
    }

    @And("Select the cash payment method to pay the deposit amount")
    public void selectTheCashPaymentMethodToPayTheDepositAmount() throws InterruptedException {
        new Standard_Item_POS_Page().Cash_Option();
    }

    @And("Click on Send to Layaway option")
    public void clickOnSendToLayawayOption() throws InterruptedException {
        new Standard_Item_POS_Page().clickSendToLayawayBtn();
      // Thread.sleep(2000);
    }

    @Then("Layaway receipt will be moved to Layaways tab in Sale History screen with retail button click")
    public void layawayReceiptWillBeMovedToLayawaysTabInSaleHistoryScreenWithRetailButtonClick() throws InterruptedException {
        Thread.sleep(3000);
        new RetailPOS_Order_Page().layawaysTabAvailability();
    }

    @Then("Layaway receipt will be moved to Layaways tab in Sale History screend")
    public void layawayReceiptWillBeMovedToLayawaysTabInSaleHistoryScreen() throws InterruptedException {
        Thread.sleep(3000);
        new RetailPOS_Order_Page().layawaysTabAvailability1();
    }

    @Then("Place Kit Assembly item in retail order screen with inclusive tax")
    public void placeKitAssemblyItemInRetailOrderScreenWithInclusiveTax() throws Throwable {
        new RetailPOS_Order_Page().Single_Random_Menu_Selection_ForInclusiveTaxes_KitAssembly();
    }

    @When("Select the Payment button from the bottom")
    public void selectThePaymentButtonFromTheBottom() {
        new Standard_Item_POS_Page().Click_PaymentOption();
    }

    @And("Payment screen with paid amount will be displayed")
    public void paymentScreenWithPaidAmountWillBeDisplayed() {
        new RetailPOS_Order_Page().verifyThePaidAmount();
    }

    @Then("Click on Submit button without paying full due amount")
    public void clickOnSubmitButtonWithoutPayingFullDueAmount() throws InterruptedException {
        new Standard_Item_POS_Page().Submit_Option();
    }

    @Then("Error message should be displayed and the message is {}")
    public void errorMessageShouldBeDisplayedAndTheMessageIs(String msg) {
        new RetailPOS_Order_Page().pleasePay(msg);
    }

    @And("Complete the Check using Cash and Submit")
    public void completeTheCheckUsingCashAndSubmit() throws InterruptedException {
        new Standard_Item_POS_Page().Cash_Option();
        new Standard_Item_POS_Page().Submit_Option();
    }

    @And("Enter different amount than suggested or minimum amount in payment page")
    public void enterDifferentAmountThanSuggestedOrMinimumAmountInPaymentPage() throws InterruptedException {
        new Standard_Item_POS_Page().getPayment_Screen_Number8_Btn().click();
        new Standard_Item_POS_Page().clickSendToLayawayBtn();
    }

    @Then("Enter partial amount and click on Back button")
    public void enterPartialAmountAndClickOnBackButton() throws InterruptedException {
        new Standard_Item_POS_Page().getPayment_Screen_Number8_Btn().click();
        new Standard_Item_POS_Page().Cash_Option();
        new Standard_Item_POS_Page().Back_Option();
    }

    @And("Select Finish button")
    public void selectFinishButton() {
        new RetailPOS_Order_Page().getOrder_Screen_FinishBtn();
    }

    @Then("Enter full amount and click on Submit button")
    public void enterFullAmountAndClickOnSubmitButton() throws InterruptedException {
        new Standard_Item_POS_Page().Cash_Option();
        new Standard_Item_POS_Page().Submit_Option();
    }


    @Then("Payment Method screen will get displayed with configured payments and  Paid deposit")
    public void paymentMethodScreenWillGetDisplayedWithConfiguredPaymentsAndPaidDeposit() throws Throwable {
        new Standard_Item_POS_Page().Verify_The_TotalInEnterDepositAmountAndPaymentsScreen(Total);
        new RetailPOS_Order_Page().verifyThePaidAmount();
    }

    @And("Displays Delete, Adjust and Back button in Payment Method screen")
    public void displaysDeleteAdjustAndBackButtonInPaymentMethodScreen() {
        new RetailPOS_Order_Page().verifyTheDeleteBtn();
        new RetailPOS_Order_Page().verifyTheAdjustBtn();
        new RetailPOS_Order_Page().verifyTheBackbtn();

    }

    @And("Select Back button")
    public void selectBackButton() throws InterruptedException {
        new Standard_Item_POS_Page().Back_Option();
    }

    @Then("Page will remains in retail order screen with placed Standard retail item")
    public void pageWillRemainsInRetailOrderScreenWithPlacedStandardRetailItem() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_VoidBtn();
        new RetailPOS_Order_Page().Retail_OrderScreen_SaleHistoryBtn();
        new RetailPOS_Order_Page().Retail_OrderScreen_ParkSaleBtn();
    }

    @And("Select Delete button without selecting any payment")
    public void selectDeleteButtonWithoutSelectingAnyPayment() {
        new RetailPOS_Order_Page().clickTheDeleteBtn();
    }

    @And("Select Adjust button without selecting any payment")
    public void selectAdjustButtonWithoutSelectingAnyPayment() {
        new RetailPOS_Order_Page().clickTheAdjustBtn();
    }

    @Then("Click on close symbol for that placed retail item")
    public void clickOnCloseSymbolForThatPlacedRetailItem() {
        new RetailPOS_Order_Page().closeTheAddCustomerPopup();
    }

    @Then("Click on void option for that placed retail item")
    public void clickOnVoidOptionForThatPlacedRetailItem() {
        new RetailPOS_Order_Page().clickTheVoidBtn();
    }

    @Then("Error message should be display and the message is {}")
    public void errorMessageShouldBeDisplayAndTheMessageIs(String msg) {
        new RetailPOS_Order_Page().pleasePay1(msg);
    }

    @Then("Click the Option from the retail screen")
    public void clickTheOptionFromTheRetailScreen() {
        new RetailPOS_Order_Page().clickTheOption();
    }

    @And("Select the Tax Exempt option from the given options")
    public void selectTheTaxExemptOptionFromTheGivenOptions() {
        new RetailPOS_Order_Page().clickTaxExempte();
    }

    @And("Click the Discount Option from the given options")
    public void clickTheDiscountOptionFromTheGivenOptions() {
        new RetailPOS_Order_Page().clickDiscount();
    }

    @And("Click the {} after tax - item based tax")
    public void clickTheAfterTaxItemBasedTax(String disc) {
        new RetailPOS_Order_Page().chooseTheIBT_AfterTax(disc);
        new RetailPOS_Order_Page().cancelBtn_DiscountSelectionScreen();
    }

    @And("Calculate the Item Based Discount for the {} percentage with After Tax")
    public void calculateTheItemBasedDiscountForThePercentageWithAfterTax(String disc) throws Throwable {
        new RetailPOS_Order_Page().Check_Values_Validations_With_Item_Based_Discount_After_Tax(disc);
    }


}
