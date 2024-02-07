package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Item_Selection_Page;
import pages.Park_Sale_And_Retrieve_Sale_Page;
import pages.Standard_Item_POS_Page;

public class Park_Sale {

    @Then("Click the park button in ordering screen")
    public void clickTheParkButtonInOrderingScreen() {
        new Park_Sale_And_Retrieve_Sale_Page().clickTheParkSaleBtn();
    }

    @And("verify popup title park sale")
    public void verifyPopupTitleParkSale() {
       new Park_Sale_And_Retrieve_Sale_Page().verifyTheParkSalePopupHeading();
    }

    @And("verify popup content as Please specify the reason to park sale")
    public void verifyPopupContentAsPleaseSpecifyTheReasonToParkSale() {
        new Park_Sale_And_Retrieve_Sale_Page().verifyTheParkSalePopupContent();
    }

    @And("Verify popup Cancel button placed left corner")
    public void verifyPopupCancelButtonPlacedLeftCorner() {
        new Park_Sale_And_Retrieve_Sale_Page().verifyTheCancelBtnInParkSalePopup();
    }

    @And("Verify popup Park button placed right corner")
    public void verifyPopupParkButtonPlacedRightCorner() {
        new Park_Sale_And_Retrieve_Sale_Page().verifyTheParkBtnInParkSalePopup();
    }

    @And("Enter the reason and click the park button")
    public void enterTheReasonAndClickTheParkButton() throws InterruptedException {
        new Park_Sale_And_Retrieve_Sale_Page().enterTheParkSaleReasonAndClickTheParkButton();
    }

    @Then("Sale is parked message is displaying {}")
    public void saleIsParkedMessageIsDisplaying(String msg) throws InterruptedException {
        new Park_Sale_And_Retrieve_Sale_Page().verifyTheSaleIsParkedMessage(msg);
    }

    @And("Verify popup in reason in watermark")
    public void verifyPopupInReasonInWatermark() {
        new Park_Sale_And_Retrieve_Sale_Page().verifyTheReasonTextParkSalePopup();
    }

    @And("Place the single retail Variant item with Inclusive tax and Exclusive tax")
    public void placeTheSingleRetailVariantItemWithInclusiveTaxAndExclusiveTax() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection_ForExclusive_InclusiveTaxes_Variant();
    }

    @And("Place the Multiple retail Variant item with Inclusive tax and Exclusive tax")
    public void placeTheMultipleRetailVariantItemWithInclusiveTaxAndExclusiveTax() throws Throwable {
        new Item_Selection_Page().multipleMenu_Selection_Random_Exclusive_Inclusive_Variant();
    }

    @And("Place the single retail standard item with Inclusive tax and Exclusive tax")
    public void placeTheSingleRetailStandardItemWithInclusiveTaxAndExclusiveTax() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection_ForExclusive_InclusiveTaxes_Standard();
    }

    @And("Place the Multiple retail standard item with Inclusive tax and Exclusive tax")
    public void placeTheMultipleRetailStandardItemWithInclusiveTaxAndExclusiveTax() throws Throwable {
        new Item_Selection_Page().multipleMenu_Selection_Random_Exclusive_Inclusive_Standard();
    }

    @And("Enter the reason more than fifty characters")
    public void enterTheReasonMoreThanFiftyCharacters() throws InterruptedException {
        new Park_Sale_And_Retrieve_Sale_Page().enterTheParkSaleReasonMoreThanFiftyCharsAndClickTheParkButton();
    }

    @Then("Error message should be firing in popup {}")
    public void errorMessageShouldBeFiringInPopup(String msg) {
        try{
            new Park_Sale_And_Retrieve_Sale_Page().verifyTheErrorMessageMoreThanFiftyChars(msg);
        }catch (Exception ignored){}
    }

    @And("Click the cancel button")
    public void clickTheCancelButton() {
        try{
            new Park_Sale_And_Retrieve_Sale_Page().clickTheCancelBtn();
        }catch (Exception ignored){}
    }

    @And("click the retrieve sale button")
    public void clickTheRetrieveSaleButton() throws InterruptedException {
        new Park_Sale_And_Retrieve_Sale_Page().clickTheRetrieveSaleButton();
        new Park_Sale_And_Retrieve_Sale_Page().verifyTheParkedSalePopupAvailability();
    }

    @And("Complete the payment using cash button with {}")
    public void completeThePaymentUsingCashButtonWithMessage(String msg) throws Throwable {
        new Standard_Item_POS_Page().Cash_Payment_Selection_And_Completed_ViaPaymentScreen1(msg);
    }

}
