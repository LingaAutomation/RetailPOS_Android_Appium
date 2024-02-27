package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Item_Selection_Page;
import pages.RetailPOS_Order_Page;
import pages.Standard_Item_POS_Page;

public class Exchange {

    @Then("Place the single retail standard item with Exclusive tax")
    public void placeTheSingleRetailStandardItemWithExclusiveTax() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection();
    }

    @And("Place the single retail standard item with Inclusive tax")
    public void placeTheSingleRetailStandardItemWithInclusiveTax() throws Throwable {
        new RetailPOS_Order_Page().Single_Random_Menu_Selection_ForInclusiveTaxes_Standard();
    }

    @Then("click the sales history button")
    public void clickTheSalesHistoryButton() throws InterruptedException {
        new Standard_Item_POS_Page().clickTheSaleHistoryTab();
    }

    @And("Click the return button the select check is reopen with same customer name")
    public void clickTheReturnButtonTheSelectCheckIsReopenWithSameCustomerName() throws InterruptedException {
        new Standard_Item_POS_Page().Click_ReturnBtn();
        Thread.sleep(1500);
    }

    @And("Select the retail item")
    public void selectTheRetailItem() {
        new RetailPOS_Order_Page().getFirstMenuItem_OrderScreen().click();
    }

    @And("Click the Exchange button and add more retail item")
    public void clickTheExchangeButtonAndAddMoreRetailItem() throws Throwable {
//        new RetailPOS_Order_Page().getSecondMenuItem_OrderScreen().click();
//        new RetailPOS_Order_Page().getFirstMenuItem_OrderScreen().click();
        new Standard_Item_POS_Page().Click_ExchangeBtn();
//        new Item_Selection_Page().Single_Random_Menu_Selection();
    }

    @And("select or enter the reason")
    public void selectOrEnterTheReason() throws InterruptedException {
        new Standard_Item_POS_Page().Select_The_Exchange_Reasons();
    }

    @And("Click the Done button in Exchange popup")
    public void clickTheDoneButtonInExchangePopup() {
        new RetailPOS_Order_Page().ClickDoneBtn();
    }



    @And("Place the single retail Standard item and Variant item with Exclusive tax")
    public void placeTheSingleRetailStandardItemAndVariantItemWithExclusiveTax() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection();
        new Item_Selection_Page().Single_Random_Menu_SelectionFor_VariantItem();
    }

    @And("Place the single retail Variant item with Inclusive tax")
    public void placeTheSingleRetailVariantItemWithInclusiveTax() throws Throwable {
        new RetailPOS_Order_Page().Single_Random_Menu_Selection_ForInclusiveTaxes_Variant();
    }

    @And("Place the Multiple retail Variant item with Exclusive tax")
    public void placeTheMultipleRetailVariantItemWithExclusiveTax() throws Throwable {
        new Item_Selection_Page().multipleMenu_Selection_Random_Variant();
    }

    @And("Without selecting the retail item click the Exchange button")
    public void withoutSelectingTheRetailItemClickTheExchangeButton() throws InterruptedException {
        Thread.sleep(500);
        new Standard_Item_POS_Page().Click_ExchangeBtn();
    }

    @And("Place the Multiple retail standard item with Inclusive tax")
    public void placeTheMultipleRetailStandardItemWithInclusiveTax() throws Throwable {
        new RetailPOS_Order_Page().multipleMenu_Selection_Random_Inclusive_Standard();
    }

    @And("Place the single retail standard item with Exclusive tax and Inclusive tax")
    public void placeTheSingleRetailStandardItemWithExclusiveTaxAndInclusiveTax() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection_ForExclusive_InclusiveTaxes_Standard();
    }

    @And("Order the Standard Item from the retail Screen and Inclusive tax")
    public void orderTheStandardItemFromTheRetailScreenAndInclusiveTax() throws Throwable {
        new Item_Selection_Page().multipleMenu_Selection_Random_Exclusive_Inclusive_Standard();
    }

    @And("Order the Multiple Standard Item from the retail Screen and Inclusive tax")
    public void orderTheMultipleStandardItemFromTheRetailScreenAndInclusiveTax() throws Throwable {
        new RetailPOS_Order_Page().multipleMenu_Selection_Random_Inclusive_Standard();
    }

    @And("Place the single retail Variant item with Exclusive tax")
    public void placeTheSingleRetailVariantItemWithExclusiveTax() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection_Variant();
    }

    @And("Place the single retail Variant item with Exclusive tax and Inclusive tax")
    public void placeTheSingleRetailVariantItemWithExclusiveTaxAndInclusiveTax() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection_ForExclusive_InclusiveTaxes_Variant();
    }

    @And("Place the Multiple retail Variant item with Inclusive tax")
    public void placeTheMultipleRetailVariantItemWithInclusiveTax() throws Throwable {
        new RetailPOS_Order_Page().multipleMenu_Selection_Random_Inclusive_Variant();
    }

    @And("Place the Multiple retail Variant item with Exclusive tax and Inclusive tax")
    public void placeTheMultipleRetailVariantItemWithExclusiveTaxAndInclusiveTax() throws Throwable {
        new Item_Selection_Page().multipleMenu_Selection_Random_Exclusive_Inclusive_Variant();
    }

    @And("Place the single retail standard item and single Variant item with Exclusive tax")
    public void placeTheSingleRetailStandardItemAndSingleVariantItemWithExclusiveTax() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection();
        new Item_Selection_Page().Single_Random_Menu_SelectionFor_VariantItem();
    }

    @And("Place the single retail standard item and single Variant item with Inclusive tax")
    public void placeTheSingleRetailStandardItemAndSingleVariantItemWithInclusiveTax() throws Throwable {
        new RetailPOS_Order_Page().Single_Random_Menu_Selection_ForInclusiveTaxes_Standard();
        new RetailPOS_Order_Page().Single_Random_Menu_Selection_ForInclusiveTaxes_Variant();
    }

    @And("Place the single retail standard item and single Variant item with Inclusive tax and Exclusive tax")
    public void placeTheSingleRetailStandardItemAndSingleVariantItemWithInclusiveTaxAndExclusiveTax() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection_ForExclusive_InclusiveTaxes_Standard();
        new Item_Selection_Page().Single_Random_Menu_Selection_ForExclusive_InclusiveTaxes_Variant();
    }

    @And("Place the single retail Variant item and Multiple Standard item with Inclusive tax and Exclusive tax")
    public void placeTheSingleRetailVariantItemAndMultipleStandardItemWithInclusiveTaxAndExclusiveTax() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection_ForExclusive_InclusiveTaxes_Standard();
        new RetailPOS_Order_Page().Single_Random_Menu_Selection_ForInclusiveTaxes_Variant();
    }

    @And("Place the single retail Variant item and Multiple Standard item with Inclusive tax")
    public void placeTheSingleRetailVariantItemAndMultipleStandardItemWithInclusiveTax() throws Throwable {
        new RetailPOS_Order_Page().multipleMenu_Selection_Random_Inclusive_Standard();
        new RetailPOS_Order_Page().Single_Random_Menu_Selection_ForInclusiveTaxes_Variant();
    }

    @And("Place the single retail Variant item and Multiple Standard item with Exclusive tax")
    public void placeTheSingleRetailVariantItemAndMultipleStandardItemWithExclusiveTax() throws Throwable {
        new Item_Selection_Page().multipleMenu_Selection_Random();
        new Item_Selection_Page().Single_Random_Menu_SelectionFor_VariantItem();
    }

    @And("Place the single retail Standard item and Multiple Variant item with Inclusive tax and Exclusive tax")
    public void placeTheSingleRetailStandardItemAndMultipleVariantItemWithInclusiveTaxAndExclusiveTax() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection_ForExclusive_InclusiveTaxes_Standard();
        new Item_Selection_Page().multipleMenu_Selection_Random_Exclusive_Inclusive_Variant();
    }

    @And("Place the single retail Standard item and Multiple Variant item with Inclusive tax")
    public void placeTheSingleRetailStandardItemAndMultipleVariantItemWithInclusiveTax() throws Throwable {
        new RetailPOS_Order_Page().Single_Random_Menu_Selection_ForInclusiveTaxes_Standard();
        new RetailPOS_Order_Page().multipleMenu_Selection_Random_Inclusive_Variant();
    }

    @And("Place the single retail Standard item and Multiple Variant item with Exclusive tax")
    public void placeTheSingleRetailStandardItemAndMultipleVariantItemWithExclusiveTax() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection();
        new Item_Selection_Page().multipleMenu_Selection_Random_Variant();
    }

    @Then("Place the single retail KitAssembly item with Inclusive tax")
    public void placeTheSingleRetailKitAssemblyItemWithInclusiveTax() throws Throwable {
        new RetailPOS_Order_Page().Single_Random_Menu_Selection_ForInclusiveTaxes_KitAssembly();
    }

    @Then("Select the Exchange tab")
    public void selectTheExchangeTab() throws InterruptedException {
        new Standard_Item_POS_Page().clickTheExchangedTab();
    }


}
