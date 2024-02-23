package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;
import utility.Utility;

public class Refund {

    String RetailItem;
    @Then("Click the sale history")
    public void clickTheSaleHistory() throws Throwable {
        new Standard_Item_POS_Page().Click_Sale_HistoryBtn();
    }

    @And("click the return button")
    public void clickTheReturnButton() throws InterruptedException {
        new Standard_Item_POS_Page().Click_ReturnBtn();
        Thread.sleep(7000);
        new Standard_Item_POS_Page().verifyTheRetailItemDisabled();
    }

    @And("click the Refund all button")
    public void clickTheRefundAllButton() throws InterruptedException {
        new Standard_Item_POS_Page().Click_RefundAllBtn();
    }

    @Then("Add the refund reason")
    public void addTheRefundReason() throws InterruptedException {
        Thread.sleep(2000);
        new Standard_Item_POS_Page().Select_The_Refund_Reasons();
    }//typeTheReasonTextBox();

    @And("Click the payment type as Cash")
    public void clickThePaymentTypeAsCash() throws InterruptedException {
        new Standard_Item_POS_Page().Cash_Option();
        Thread.sleep(5000);
    }

    @Then("Click the done button")
    public void clickTheDoneButton() {
        new RetailPOS_Order_Page().ClickDoneBtn();
    }

    @And("Click the payment type as Others")
    public void clickThePaymentTypeAsOthers() throws InterruptedException {
        new Standard_Item_POS_Page().Others_Option();
    }

    @And("Click the payment type as Side CC")
    public void clickThePaymentTypeAsSideCC() throws InterruptedException {
        new Standard_Item_POS_Page().SideCC_Option();
    }

    @And("Click the payment type as HA Payment and the card number is {}")
    public void clickThePaymentTypeAsHAPaymentAndTheCardNumberIs(String CardNum) throws InterruptedException {
        new Standard_Item_POS_Page().HAPayment_Option(CardNum);
    }

    @And("Click the payment type as Gift Card and the card number is {}")
    public void clickThePaymentTypeAsGiftCardAndTheCardNumberIs(String CardNum) throws InterruptedException {
        new Standard_Item_POS_Page().GiftCard_Option(CardNum);
    }

    @Then("Add the refund reason in the free text")
    public void addTheRefundReasonInTheFreeText() throws InterruptedException {
        Thread.sleep(2000);
        new Standard_Item_POS_Page().typeTheReasonTextBox();
    }

    @Then("Add the customer and the Customer Number is {}")
    public void addTheCustomerAndTheCustomerNumberIs(String CustNum) throws InterruptedException {
        new RetailPOS_Order_Page().AddTheCustomer(CustNum);
    }

    @Then("Adds the customer and the Customer Number is {}")
    public void addsTheCustomerAndTheCustomerNumberIs(String CustNum) throws InterruptedException {
        new RetailPOS_Order_Page().AddTheCustomer1(CustNum);
    }

    @And("Add multiple standard item")
    public void addMultipleStandardItem() throws Throwable {
        new Item_Selection_Page().multipleMenu_Selection_Random();
    }

    @And("click the Refund Item button")
    public void clickTheRefundItemButton() throws InterruptedException {
        new RetailPOS_Order_Page().getFirstMenuItem_OrderScreen().click();
        new Standard_Item_POS_Page().verifyTheRetailItemEnabled();
        RetailItem = new RetailPOS_Order_Page().getFirstItem();
        Thread.sleep(1000);
        new Standard_Item_POS_Page().Click_RefundItemsBtn();
    }

    @And("Apply the item based discount {} - After Tax")
    public void applyTheItemBasedDiscountAfterTax(String discountName) throws InterruptedException {
        new Discount_Selection_Page().ClickTheDiscount();
        new RetailPOS_Order_Page().chooseTheIBT_AfterTax(discountName);
        new RetailPOS_Order_Page().cancelBtn_DiscountSelectionScreen();
    }

    @And("Calculate the Check Based Discount for the {} percentage with After Tax")
    public void calculateTheCheckBasedDiscountForThePercentageWithAfterTax(String disc) throws Throwable {
        new Discount_Selection_Page().Check_Values_Validations_With_Check_Based_Discount_After_Tax(disc);
    }

    @And("Order the Multiple Standard item with Upcharge")
    public void orderTheMultipleStandardItemWithUpcharge() throws Throwable {
        new Item_Selection_Page().Multiple_Random_Menu_Selection_Upcharge_Standard();
    }

    @And("Order the Multiple Variant item with Upcharge")
    public void orderTheMultipleVariantItemWithUpcharge() throws Throwable {
        new Item_Selection_Page().Multiple_Random_Menu_Selection_Upcharge_Variant();
    }

    @And("Order the Multiple Kit Assembly item with Upcharge")
    public void orderTheMultipleKitAssemblyItemWithUpcharge() throws Throwable {
        new Item_Selection_Page().Multiple_Random_Menu_Selection_Upcharge_KitAssembly();
    }

    @And("Order the Multiple Open item with Upcharge")
    public void orderTheMultipleOpenItemWithUpcharge() throws Throwable {
        new Item_Selection_Page().Multiple_Random_Menu_Selection_Upcharge_OpenItem();
    }

    @Then("Order the Single Standard item With the Upcharge")
    public void orderTheSingleStandardItemWithTheUpcharge() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection_Upcharge_Standard();
    }

    @Then("Order the Single Variant item With the Upcharge")
    public void orderTheSingleVariantItemWithTheUpcharge() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection_Upcharge_Variant();
    }

    @And("Order the Single Kit Assembly item With the Upcharge")
    public void orderTheSingleKitAssemblyItemWithTheUpcharge() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection_Upcharge_KitAssembly();
    }

    @And("Order the Single Open item with Upcharge")
    public void orderTheSingleOpenItemWithUpcharge() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection_Upcharge_OpenItem(Utility.getProperty("Open_Item1"));
    }

    @And("Order {} Standard Items from the retail Screen")
    public void orderStandardItemsFromTheRetailScreen(String number) throws Throwable {
        new Item_Selection_Page().making_more_Items_Standard(number);
    }

    @Then("Order {} Variant Items from the retail screen")
    public void orderVariantItemsFromTheRetailScreen(String number) throws Throwable {
        new Item_Selection_Page().making_more_Items_Variant(number);
    }

    @And("Order {} kit Assembly item from the retail screen")
    public void orderKitAssemblyItemFromTheRetailScreen(String number) throws Throwable {
        new Item_Selection_Page().making_more_Items_KitAssembly(number);
    }

    @Then("Select the Exchange reason")
    public void selectTheExchangeReason() throws InterruptedException {
        new Standard_Item_POS_Page().Select_The_Exchange_Reasons();
    }

    @And("Calculate the Mix and Match Discount with {} for the {} percentage with After Tax")
    public void calculateTheMixAndMatchDiscountWithForThePercentageWithAfterTax(String quantity, String discount) throws Throwable {
        new Discount_Selection_Page().Check_Values_Validations_With_MixAndMatch_Discount_After_Tax(quantity, discount);
    }

    @And("Wait for fifteen seconds")
    public void waitForFifteenSeconds() throws InterruptedException {
        Thread.sleep(15000);
    }

    @Then("Refund screen should be displayed")
    public void refundScreenShouldBeDisplayed() {
        new Standard_Item_POS_Page().refundScreenVisibility();
    }

    @Then("Add the refund reason in the free text more than fifty characters - alphabetic")
    public void addTheRefundReasonInTheFreeTextMoreThanFiftyCharactersAlphabetic() throws InterruptedException {
        new Standard_Item_POS_Page().enterTheRefundReasonTextBox_withAlphabetic();
    }

    @Then("Add the refund reason in the free text more than fifty characters - alphanumeric")
    public void addTheRefundReasonInTheFreeTextMoreThanFiftyCharactersAlphanumeric() throws InterruptedException {
        new Standard_Item_POS_Page().enterTheRefundReasonTextBox_withAlphaNumeric();
    }

    @Then("Add the refund reason in the free text more than fifty characters - numeric")
    public void addTheRefundReasonInTheFreeTextMoreThanFiftyCharactersNumeric() throws InterruptedException {
        new Standard_Item_POS_Page().enterTheRefundReasonTextBox_withNumeric();
    }

    @And("Click the remove button of Customer")
    public void clickTheRemoveButtonOfCustomer() {
        new Standard_Item_POS_Page().clickRemoveBtn();
    }

    @And("Refund screen should not be displayed")
    public void refundScreenShouldNotBeDisplayed() {
        new Standard_Item_POS_Page().refundScreenVisibility1();
    }

    @And("Verify the refunded screen")
    public void verifyTheRefundedScreen() {
        new Standard_Item_POS_Page().refundScreenVisibility2();
    }
}
