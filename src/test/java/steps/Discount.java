package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Discount_Selection_Page;
import pages.Item_Selection_Page;

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
        new Discount_Selection_Page().verifyTheTotal_BeforeTaxDiscount_SetPrice(tax,disc);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax_BeforeTaxDiscount_SetPrice(tax, disc);
        new Discount_Selection_Page().verifyTheDiscount_AfterTax_SetPrice(disc);
    }

    @And("Calculate the value of Item Based Discount for Before Tax - {string} percentage with Free Item as {string}")
    public void calculateTheValueOfItemBasedDiscountForBeforeTaxPercentageWithFreeItemAs(String tax, String disc) {
        new Discount_Selection_Page().verifyTheTotal(tax);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax(tax);
        new Discount_Selection_Page().verifyTheDiscount_AfterTax_FreeItem();
    }

    @And("Calculate the value of Check Based Discount for After Tax - {string} percentage with discount amount {string}")
    public void calculateTheValueOfCheckBasedDiscountForAfterTaxPercentageWithDiscountAmount(String tax, String disc) {
        new Discount_Selection_Page().verifyTheTotal(tax);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax(tax);
        new Discount_Selection_Page().verifyTheCheckBasedDiscount_AfterTax_Amount(tax,disc);
    }

    @And("Calculate the value of Check Based Discount for After Tax - {string} percentage with discount percentage {string}")
    public void calculateTheValueOfCheckBasedDiscountForAfterTaxPercentageWithDiscountPercentage(String tax, String disc) {
        new Discount_Selection_Page().verifyTheTotal(tax);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax(tax);
        new Discount_Selection_Page().verifyTheCheckBasedDiscount_AfterTax_Percentage(disc);
    }

    @And("Calculate the value of Check Based Discount for After Tax - {string} percentage with Set Price {string}")
    public void calculateTheValueOfCheckBasedDiscountForAfterTaxPercentageWithSetPrice(String tax, String disc) {
        new Discount_Selection_Page().verifyTheTotal(tax);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax(tax);
        new Discount_Selection_Page().verifyTheCheckBasedDiscount_AfterTax_SetPrice(disc);
    }

    @And("Calculate the value of Check Based Discount for After Tax - {string} percentage with Free Item as {string}")
    public void calculateTheValueOfCheckBasedDiscountForAfterTaxPercentageWithFreeItemAs(String tax, String disc) {
        new Discount_Selection_Page().verifyTheTotal(tax);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax(tax);
        new Discount_Selection_Page().verifyTheCheckBasedDiscount_AfterTax_FreeItem();
    }

    @And("Calculate the value of Check Based Discount for Before Tax - {string} percentage with discount amount {string}")
    public void calculateTheValueOfCheckBasedDiscountForBeforeTaxPercentageWithDiscountAmount(String tax, String disc) {
        new Discount_Selection_Page().verifyTheTotal_BeforeTaxDiscount_CheckBased_Amount(tax, disc);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax_BeforeTaxDiscount_CheckBased_Amount(tax, disc);
        new Discount_Selection_Page().verifyTheCheckBasedDiscount_AfterTax_Amount(tax, disc);
    }

    @And("Calculate the value of Check Based Discount for Before Tax - {string} percentage with discount percentage {string}")
    public void calculateTheValueOfCheckBasedDiscountForBeforeTaxPercentageWithDiscountPercentage(String tax, String disc) {
        new Discount_Selection_Page().verifyTheTotal_BeforeTaxDiscount_CheckBased_Percentage(tax, disc);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax_BeforeTaxDiscount_CheckBased_Percentage(tax, disc);
        new Discount_Selection_Page().verifyTheCheckBasedDiscount_AfterTax_Percentage(disc);
    }

    @And("Calculate the value of Check Based Discount for Before Tax - {string} percentage with Set Price {string}")
    public void calculateTheValueOfCheckBasedDiscountForBeforeTaxPercentageWithSetPrice(String tax, String disc) {
        new Discount_Selection_Page().verifyTheTotal_BeforeTaxDiscount_CheckBased_SetPrice(tax, disc);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax_BeforeTaxDiscount_CheckBased_SetPrice(tax, disc);
        new Discount_Selection_Page().verifyTheCheckBasedDiscount_AfterTax_SetPrice(disc);
    }

    @And("Calculate the value of Check Based Discount for Before Tax - {string} percentage with Free Item as {string}")
    public void calculateTheValueOfCheckBasedDiscountForBeforeTaxPercentageWithFreeItemAs(String tax, String arg1) {
        new Discount_Selection_Page().verifyTheTotal(tax);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax(tax);
        new Discount_Selection_Page().verifyTheCheckBasedDiscount_AfterTax_FreeItem();
    }

    @And("Calculate the value of Mix And Match Discount for After Tax - {string} percentage with Set Price as {string} and minimum quantity is {string}")
    public void calculateTheValueOfMixAndMatchDiscountForAfterTaxPercentageWithSetPriceAs(String tax, String disc,String qty) {
        new Discount_Selection_Page().verifyTheTotal(tax);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax(tax);
        new Discount_Selection_Page().verifyTheDiscount_AfterTax_SetPrice_MixAndMatch(disc,qty);
    }

    @And("Calculate the value of Mix And Match Discount for After Tax - {string} percentage with Set Each Item Price as {string} and minimum quantity is {string}")
    public void calculateTheValueOfMixAndMatchDiscountForAfterTaxPercentageWithSetEachItemPriceAs(String tax, String disc,String qty) {
        new Discount_Selection_Page().verifyTheTotal(tax);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax(tax);
        new Discount_Selection_Page().verifyTheDiscount_AfterTax_SetEachItemPrice_MixAndMatch(disc,qty);
    }

    @And("Calculate the value of Mix And Match Discount for Before Tax - {string} percentage with Set Price as {string} and minimum quantity is {string}")
    public void calculateTheValueOfMixAndMatchDiscountForBeforeTaxPercentageWithSetPriceAs(String tax, String disc,String qty) {
        new Discount_Selection_Page().verifyTheTotal_BeforeTaxDiscount(tax, disc);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax_BeforeTaxDiscount(tax, disc);
        new Discount_Selection_Page().verifyTheDiscount_AfterTax_SetPrice_MixAndMatch(disc,qty);
    }

    @And("Calculate the value of Mix And Match Discount for Before Tax - {string} percentage with Set Each Item Price as {string} and minimum quantity is {string}")
    public void calculateTheValueOfMixAndMatchDiscountForBeforeTaxPercentageWithSetEachItemPriceAs(String tax, String disc,String qty) {
        new Discount_Selection_Page().verifyTheTotal_BeforeTaxDiscount(tax, disc);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax_BeforeTaxDiscount(tax, disc);
        new Discount_Selection_Page().verifyTheDiscount_AfterTax_SetEachItemPrice_MixAndMatch(disc,qty);
    }

    @And("Calculate the value of Mix And Match Discount for After Tax - {string} percentage with Set Percentage as {string} Least Expensive and minimum quantity is {string}")
    public void calculateTheValueOfMixAndMatchDiscountForAfterTaxPercentageWithSetPercentageAsLeastExpensive(String tax, String disc,String qty) throws Exception {
        new Discount_Selection_Page().verifyTheTotal(tax);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax(tax);
        new Discount_Selection_Page().verifyThe_MixAndMatch_Discount_AfterTax_SetPercentage_LeastExpensive(disc,qty);
    }


    @And("Calculate the value of Mix And Match Discount for After Tax - {string} percentage with Set Percentage as {string} Most Expensive and minimum quantity is {string}")
    public void calculateTheValueOfMixAndMatchDiscountForAfterTaxPercentageWithSetPercentageAsMostExpensive(String tax, String disc,String qty) throws Exception {
        new Discount_Selection_Page().verifyTheTotal(tax);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax(tax);
        new Discount_Selection_Page().verifyThe_MixAndMatch_Discount_AfterTax_SetPercentage_MostExpensive(disc,qty);
    }

    @And("Calculate the value of Mix And Match Discount for Before Tax - {string} percentage with Set Percentage as {string} Least Expensive and minimum quantity is {string}")
    public void calculateTheValueOfMixAndMatchDiscountForBeforeTaxPercentageWithSetPercentageAsLeastExpensiveAndMinimumQuantityIs(String tax, String disc,String qty) throws Exception {
        new Discount_Selection_Page().verifyThe_MixAndMatch_Total_BeforeTax_SetPercentage_LeastExpensive(tax, disc, qty);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyThe_MixAndMatch_Tax_BeforeTax_SetPercentage_LeastExpensive(tax, disc, qty);
        new Discount_Selection_Page().verifyThe_MixAndMatch_Discount_AfterTax_SetPercentage_LeastExpensive(disc,qty);
    }

    @And("Calculate the value of Mix And Match Discount for Before Tax - {string} percentage with Set Percentage as {string} Most Expensive and minimum quantity is {string}")
    public void calculateTheValueOfMixAndMatchDiscountForBeforeTaxPercentageWithSetPercentageAsMostExpensiveAndMinimumQuantityIs(String tax, String disc,String qty) throws Exception {
        new Discount_Selection_Page().verifyThe_MixAndMatch_Total_BeforeTax_SetPercentage_MostExpensive(tax, disc, qty);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyThe_MixAndMatch_Tax_BeforeTax_SetPercentage_MostExpensive(tax, disc, qty);
        new Discount_Selection_Page().verifyThe_MixAndMatch_Discount_AfterTax_SetPercentage_MostExpensive(disc,qty);
    }

    @Then("Order the Combo Item {string} from the retail Screen")
    public void orderTheComboItemFromTheRetailScreen(String discType) throws Throwable {
        new Item_Selection_Page().multipleMenu_Selection_Random_Combo_Discount(discType);
    }

    @And("Calculate the value of Mix And Match Discount for After Tax - {string} percentage with Set Percentage as {string} With Combo Discounts")
    public void calculateTheValueOfMixAndMatchDiscountForAfterTaxPercentageWithSetPercentageAsWithComboDiscounts(String tax, String disc) {
        new Discount_Selection_Page().verifyTheTotal(tax);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax(tax);
        new Discount_Selection_Page().verifyTheDiscount_AfterTax_SetPercentage(disc);
    }

    @And("Calculate the value of Mix And Match Discount for After Tax - {string} percentage with Set Price as {string} With Combo Discounts")
    public void calculateTheValueOfMixAndMatchDiscountForAfterTaxPercentageWithSetPriceAsWithComboDiscounts(String tax, String disc) {
        new Discount_Selection_Page().verifyTheTotal(tax);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax(tax);
        new Discount_Selection_Page().verifyTheCheckBasedDiscount_AfterTax_SetPrice(disc);
    }

    @And("Calculate the value of Mix And Match Discount for Before Tax - {string} percentage with Set Percentage as {string} With Combo Discounts")
    public void calculateTheValueOfMixAndMatchDiscountForBeforeTaxPercentageWithSetPercentageAsWithComboDiscounts(String tax, String disc) {
        new Discount_Selection_Page().verifyTheTotal_BeforeTaxDiscount_Percentage(tax,disc);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax_BeforeTaxDiscount_Percentage(tax, disc);
        new Discount_Selection_Page().verifyTheDiscount_AfterTax_SetPercentage(disc);
    }

    @And("Calculate the value of Mix And Match Discount for Before Tax - {string} percentage with Set Price as {string} With Combo Discounts")
    public void calculateTheValueOfMixAndMatchDiscountForBeforeTaxPercentageWithSetPriceAsWithComboDiscounts(String tax, String disc) {
        new Discount_Selection_Page().verifyTheTotal_BeforeTaxDiscount_CheckBased_SetPrice(tax, disc);
        new Discount_Selection_Page().verifyTheSubTotal();
        new Discount_Selection_Page().verifyTheTax_BeforeTaxDiscount_CheckBased_SetPrice(tax, disc);
        new Discount_Selection_Page().verifyTheCheckBasedDiscount_AfterTax_SetPrice(disc);
//        new Discount_Selection_Page().verifyTheTotal_BeforeTaxDiscount_SetPrice(tax,disc);
//        new Discount_Selection_Page().verifyTheSubTotal();
//        new Discount_Selection_Page().verifyTheTax_BeforeTaxDiscount_SetPrice(tax, disc);
//        new Discount_Selection_Page().verifyTheCheckBasedDiscount_AfterTax_SetPrice(disc);
    }
}
