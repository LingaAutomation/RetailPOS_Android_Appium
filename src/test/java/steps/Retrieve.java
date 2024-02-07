package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Item_Selection_Page;
import pages.Park_Sale_And_Retrieve_Sale_Page;

public class Retrieve {

    @Then("Place the single retail standard item and Multiple Variant item  with Inclusive tax and Exclusive tax")
    public void placeTheSingleRetailStandardItemAndMultipleVariantItemWithInclusiveAndExclusiveTax() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection_ForExclusive_InclusiveTaxes_Standard();
        new Item_Selection_Page().multipleMenu_Selection_Random_Exclusive_Inclusive_Variant();
    }

    @And("Place the single retail Variant item and Multiple standard item  with Inclusive tax and Exclusive tax")
    public void placeTheSingleRetailVariantItemAndMultipleStandardItemWithInclusiveTaxAndExclusiveTax() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection_ForExclusive_InclusiveTaxes_Variant();
        new Item_Selection_Page().multipleMenu_Selection_Random_Exclusive_Inclusive_Standard();
    }

    @And("Click the Retrieve button")
    public void clickTheRetrieveButton() throws InterruptedException {
        new Park_Sale_And_Retrieve_Sale_Page().clickTheRetrieveSaleButton();
    }

    @And("The message is appear {}")
    public void theMessageIsAppear(String msg) throws InterruptedException {
        new Park_Sale_And_Retrieve_Sale_Page().verifyTheParkedSaleIsRetrievedMessage(msg);
    }

    @Then("Alert popup message is displaying {}")
    public void alertPopupMessageIsDisplaying(String msg) {
        new Park_Sale_And_Retrieve_Sale_Page().retrieveSale_Popup(msg);
    }

    @And("Click the Retrieve button with out any parked sale is available")
    public void clickTheRetrieveButtonWithOutAnyParkedSaleIsAvailable() throws Throwable {
        new Park_Sale_And_Retrieve_Sale_Page().closeAllTheParkedSaleUsingFastCash();
    }

    @And("Retrieve popup is open with the {}")
    public void retrievePopupIsOpenWithThe(String msg) {
        new Park_Sale_And_Retrieve_Sale_Page().verifyNoParkedReceiptsFoundText(msg);
    }

    @Then("Verify the title in the popup {}")
    public void verifyTheTitleInThePopup(String msg) {
        new Park_Sale_And_Retrieve_Sale_Page().verifyPark_Sale_Retrieve_Sale_header_text(msg);
    }

    @Then("Verify the search is available")
    public void verifyTheSearchIsAvailable() {
        new Park_Sale_And_Retrieve_Sale_Page().verifySearchFiledInSearchField();
    }


    @Then("Verify the cancel button in left button corner")
    public void verifyTheCancelButtonInLeftButtonCorner() {
        new Park_Sale_And_Retrieve_Sale_Page().verifyRetrieveSaleCancelBtn();
    }
}
