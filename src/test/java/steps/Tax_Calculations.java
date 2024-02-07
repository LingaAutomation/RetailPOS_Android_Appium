package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Item_Selection_Page;
import pages.RetailPOS_Order_Page;

public class Tax_Calculations {
    @And("^Calculate the exclusive tax and values$")
    public void calculateTheExclusiveTaxAndValues() throws Throwable {
        new RetailPOS_Order_Page().Exclusive_Tax_Calculation();
    }

    @Then("Order the Kit Assembly item from the retail Screen")
    public void orderTheKitAssemblyItemFromTheRetailScreen() throws Throwable {
        new Item_Selection_Page().multipleMenu_Selection_Random_Kit_Accessible();
        
    }

    @Then("Order the Variant item from the retail Screen")
    public void orderTheVariantItemFromTheRetailScreen() throws Throwable {
        new Item_Selection_Page().multipleMenu_Selection_Random_Variant();
    }

    @And("Calculate the inclusive tax and values")
    public void calculateTheInclusiveTaxAndValues() throws Throwable {
        new RetailPOS_Order_Page().Inclusive_Tax_Calculation();
    }

    @Then("Order the Random menu item for the inclusive tax - Standard")
    public void orderTheRandomMenuItemForTheInclusiveTaxStandard() throws Throwable {
        new RetailPOS_Order_Page().Single_Random_Menu_Selection_ForInclusiveTaxes_Standard();
       // new RetailPOS_Order_Page().Single_Random_Menu_Selection_ForInclusiveTaxes();
    }

    @Then("Order the Random menu item for the quantity based tax")
    public void orderTheRandomMenuItemForTheQuantityBasedTax() throws Throwable {
        new RetailPOS_Order_Page().Single_Random_Menu_Selection_ForQBTaxes();
    }

    @And("Calculate the quantity based tax and values")
    public void calculateTheQuantityBasedTaxAndValues() throws Throwable {
        new RetailPOS_Order_Page().QB_Tax_Calculation();
    }

    @Then("Order the Random menu item for the check based tax")
    public void orderTheRandomMenuItemForTheCheckBasedTax() throws Throwable {
        new RetailPOS_Order_Page().Single_Random_Menu_Selection_ForCBTaxes();
    }

    @And("Calculate the check based tax and values")
    public void calculateTheCheckBasedTaxAndValues() throws Throwable {
        new RetailPOS_Order_Page().CB_Tax_Calculation();
    }

    @Then("Order the Random menu item for the tax on Item tax")
    public void orderTheRandomMenuItemForTheTaxOnItemTax() throws Throwable {
        new RetailPOS_Order_Page().Single_Random_Menu_Selection_ForTaxOnItemBasedTax();
    }

    @And("Calculate the tax on item tax and values")
    public void calculateTheTaxOnItemTaxAndValues() throws Throwable {
        new RetailPOS_Order_Page().Tax_On_Item_Tax_Calculation();
    }

    @Then("Order the Single Standard item for the quantity based tax")
    public void orderTheSingleStandardItemForTheQuantityBasedTax() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection_ForQBTaxes_Standard();
    }

    @Then("Order the Single Variant item for the quantity based tax")
    public void orderTheSingleVariantItemForTheQuantityBasedTax() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection_ForQBTaxes_Variant();
    }

    @Then("Order the Single Kit Assembly item for the quantity based tax")
    public void orderTheSingleKitAssemblyItemForTheQuantityBasedTax() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection_ForQBTaxes_KitAssembly();
    }

    @Then("Order the Multiple Standard item for the quantity based tax")
    public void orderTheMultipleStandardItemForTheQuantityBasedTax() throws Throwable {
        new Item_Selection_Page().Multiple_Random_Menu_Selection_ForQBTaxes_Standard();
    }

    @Then("Order the Multiple Variant item for the quantity based tax")
    public void orderTheMultipleVariantItemForTheQuantityBasedTax() throws Throwable {
        new Item_Selection_Page().Multiple_Random_Menu_Selection_ForQBTaxes_Variant();
    }

    @Then("Order the Multiple Kit Assembly item for the quantity based tax")
    public void orderTheMultipleKitAssemblyItemForTheQuantityBasedTax() throws Throwable {
        new Item_Selection_Page().Multiple_Random_Menu_Selection_ForQBTaxes_KitAssembly();
    }

    @Then("Order the Single Standard item for the tax on Item tax")
    public void orderTheSingleStandardItemForTheTaxOnItemTax() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection_TOIT_Standard();
    }

    @Then("Order the Single Variant item for the tax on Item tax")
    public void orderTheSingleVariantItemForTheTaxOnItemTax() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection_TOIT_Variant();
    }
    @Then("Order the Single Kit Assembly item for the tax on Item tax")
    public void orderTheSingleKitAssemblyItemForTheTaxOnItemTax() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection_TOIT_KitAssembly();
    }
    
    @Then("Order the Multiple Standard item for the tax on Item tax")
    public void orderTheMultipleStandardItemForTheTaxOnItemTax() throws Throwable {
        new Item_Selection_Page().Multiple_Random_Menu_Selection_TOIT_Standard();
    }


    @Then("Order the Multiple Variant item for the tax on Item tax")
    public void orderTheMultipleVariantItemForTheTaxOnItemTax() throws Throwable {
        new Item_Selection_Page().Multiple_Random_Menu_Selection_TOIT_Variant();
    }

    @Then("Order the Multiple Kit Assembly item for the tax on Item tax")
    public void orderTheMultipleKitAssemblyItemForTheTaxOnItemTax() throws Throwable {
        new Item_Selection_Page().Multiple_Random_Menu_Selection_TOIT_KitAssembly();
    }

    @Then("Order the Single Standard item for the check based tax")
    public void orderTheSingleStandardItemForTheCheckBasedTax() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection_CBT_Standard();
    }

    @Then("Order the Single Variant item for the check based tax")
    public void orderTheSingleVariantItemForTheCheckBasedTax() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection_CBT_Variant();
    }

    @Then("Order the Single Kit Assembly item for the check based tax")
    public void orderTheSingleKitAssemblyItemForTheCheckBasedTax() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection_CBT_KitAssembly();
    }

    @Then("Order the Multiple Standard item for the check based tax")
    public void orderTheMultipleStandardItemForTheCheckBasedTax() throws Throwable {
        new Item_Selection_Page().Multiple_Random_Menu_Selection_CBT_Standard();
    }

    @Then("Order the Multiple Variant item for the check based tax")
    public void orderTheMultipleVariantItemForTheCheckBasedTax() throws Throwable {
        new Item_Selection_Page().Multiple_Random_Menu_Selection_CBT_Variant();
    }

    @Then("Order the Multiple Kit Assembly item for the check based tax")
    public void orderTheMultipleKitAssemblyItemForTheCheckBasedTax() throws Throwable {
        new Item_Selection_Page().Multiple_Random_Menu_Selection_CBT_KitAssembly();
    }
}
