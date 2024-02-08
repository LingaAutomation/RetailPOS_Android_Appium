package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Discount_Selection_Page;
import pages.Item_Selection_Page;
import pages.RetailPOS_Order_Page;
import pages.Standard_Item_POS_Page;

public class Discount {
    @And("Search for the discount as {string}")
    public void searchForTheDiscountAs(String disc) {
        new Discount_Selection_Page().searchTheDiscount(disc);
    }

    @Then("Click the {string} discount")
    public void clickTheDiscount(String disc) throws InterruptedException {
        new Discount_Selection_Page().clickTheRequiredDiscount(disc);
    }

    @And("Calculate the value of Item Based Discount for After Tax - {string} percentage with discount amount {string}")
    public void calculateTheValueOfItemBasedDiscountForAfterTaxPercentageWithDiscountAmount(String tax, String disc) {
        new Discount_Selection_Page().verifyTheTotal(tax);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax(tax);
        new Discount_Selection_Page().verifyTheDiscount_AfterTax_Amount(disc);
    }

    @And("Calculate the value of Item Based Discount for After Tax - {string} percentage with discount percentage {string}")
    public void calculateTheValueOfItemBasedDiscountForAfterTaxPercentageWithDiscountPercentage(String tax, String disc) {
        new Discount_Selection_Page().verifyTheTotal(tax);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax(tax);
        new Discount_Selection_Page().verifyTheDiscount_AfterTax_SetPercentage(disc);
    }

    @And("Calculate the value of Item Based Discount for After Tax - {string} percentage with Set Price {string}")
    public void calculateTheValueOfItemBasedDiscountForAfterTaxPercentageWithSetPrice(String tax, String disc) {
        new Discount_Selection_Page().verifyTheTotal(tax);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax(tax);
        new Discount_Selection_Page().verifyTheDiscount_AfterTax_SetPrice(disc);
    }

    @And("Calculate the value of Item Based Discount for After Tax - {string} percentage with Free Item as {string}")
    public void calculateTheValueOfItemBasedDiscountForAfterTaxPercentageWithFreeItemAs(String tax, String retailItem) {
        new Discount_Selection_Page().verifyTheTotal(tax);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax(tax);
        new Discount_Selection_Page().verifyTheDiscount_AfterTax_FreeItem();
    }

    @And("Calculate the value of Item Based Discount for Before Tax - {string} percentage with discount amount {string}")
    public void calculateTheValueOfItemBasedDiscountForBeforeTaxPercentageWithDiscountAmount(String tax, String disc) {
        new Discount_Selection_Page().verifyTheTotal_BeforeTaxDiscount(tax,disc);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax_BeforeTaxDiscount(tax, disc);
        new Discount_Selection_Page().verifyTheDiscount_AfterTax_Amount(disc);
    }

    @And("Calculate the value of Item Based Discount for Before Tax - {string} percentage with discount percentage {string}")
    public void calculateTheValueOfItemBasedDiscountForBeforeTaxPercentageWithDiscountPercentage(String tax, String disc) {
        new Discount_Selection_Page().verifyTheTotal_BeforeTaxDiscount_Percentage(tax,disc);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax_BeforeTaxDiscount_Percentage(tax, disc);
        new Discount_Selection_Page().verifyTheDiscount_AfterTax_SetPercentage(disc);
    }

    @And("Calculate the value of Item Based Discount for Before Tax - {string} percentage with Set Price {string}")
    public void calculateTheValueOfItemBasedDiscountForBeforeTaxPercentageWithSetPrice(String tax, String disc) {
        new Discount_Selection_Page().verifyTheTotal_BeforeTaxDiscount(tax,disc);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax_BeforeTaxDiscount(tax, disc);
        new Discount_Selection_Page().verifyTheDiscount_AfterTax_SetPrice(disc);
    }

    @And("Calculate the value of Item Based Discount for Before Tax - {string} percentage with Free Item as {string}")
    public void calculateTheValueOfItemBasedDiscountForBeforeTaxPercentageWithFreeItemAs(String tax, String disc) {
        new Discount_Selection_Page().verifyTheTotal(tax);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax(tax);
        new Discount_Selection_Page().verifyTheDiscount_AfterTax_FreeItem();
    }
}
