package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

public class Operation {

    String till;

    @And("Able to view the Operation button")
    public void clickTheOptionFieldAtTheBottomOfCustomOptions() throws Exception {
        new Operation_Page().verifyTheSettingsIcon();
    }


    @When("Click the Settings icon from the Retail Screen")
    public void clickTheSettingsIconFromTheRetailScreen() {
        new Operation_Page().clickTheSettingsIcon();
    }

    @Then("View the Back Office, Sync Back Office, Operation, Log Off and QSR Mode options")
    public void viewTheBackOfficeSyncBackOfficeOperationLogOffAndQSRModeOptions() {
        new Operation_Page().verifyTheBackOfficeText();
        new Operation_Page().verifyTheSync_BackOfficeText();
        new Operation_Page().verifyTheOperationText();
        new Operation_Page().verifyTheLogOfficeText();
        new Operation_Page().verifyTheQSR_ModeOfficeText();
    }

    @When("Click the Operation button")
    public void clickTheOperationButton() {
        new Operation_Page().clickTheOperationText();
    }

    @Then("View the options are POS, Till Management, Print Labels, Process Offline, Hardware Settings, POS Settings, Close Day and Sync Back Office")
    public void viewTheOptionsArePOSTillManagementPrintLabelsProcessOfflineHardwareSettingsPOSSettingsCloseDayAndSyncBackOffice() {
        new Operation_Page().verifyThePOSText();
        new Operation_Page().verifyTheTillManagementText();
        new Operation_Page().verifyThePrintLabelsText();
        new Operation_Page().verifyTheProcessOfflineText();
        new Operation_Page().verifyTheHardwareSettingsText();
        new Operation_Page().verifyThePOSSettingsText();
        new Operation_Page().verifyTheCloseDayText();
        new Operation_Page().verifyTheSyncBackOfficeText();
        new Operation_Page().verifyTheUpgradeToNewVersionText();
    }

    @And("Click the Till Management option")
    public void clickTheTillManagementOption() {
        new Operation_Page().clickTheTillManagement();
    }

    @Then("Click the Sync Back Office option from the List Of options")
    public void clickTheSyncBackOfficeOptionFromTheListOfOptions() {
        new Operation_Page().clickTheSyncBackOfficeOption();
        new Operation_Page().Syncing_With_BO();
    }

    @And("Check the Pay In option is displayed or not")
    public void checkThePayInOptionIsDisplayedOrNot() {
        new Operation_Page().verifyThePayInOption();
    }

    @Then("Check the Pay Out option is displayed or not")
    public void checkThePayOutOptionIsDisplayedOrNot() {
        new Operation_Page().verifyThePayIOutOption();
    }

    @And("Check the Open Cash Drawer option is displayed or not")
    public void checkTheOpenCashDrawerOptionIsDisplayedOrNot() {
        new Operation_Page().verifyTheOpenCashDrawerOption();
    }

    @Then("Check the Reports option is displayed or not")
    public void checkTheReportsOptionIsDisplayedOrNot() {
        new Operation_Page().verifyTheReportsOption();
    }

    @And("Check the OPEN TILL option is displayed or not")
    public void checkTheOPENTILLOptionIsDisplayedOrNot() {
        new Operation_Page().verifyTheOpenTillOption();
    }

    @Then("Check the Open By option is displayed or not")
    public void checkTheOpenByOptionIsDisplayedOrNot() {
        new Operation_Page().verifyTheOpenByOption();
    }

    @And("Check the Global Till option is displayed or not")
    public void checkTheGlobalTillOptionIsDisplayedOrNot() {
        new Operation_Page().verifyTheGlobalTillOption();
    }

    @Then("Check the Other Total option is displayed or not")
    public void checkTheOtherTotalOptionIsDisplayedOrNot() {
        new Operation_Page().verifyTheOtherTotalOption();
    }

    @And("Check the Total option is displayed or not")
    public void checkTheTotalOptionIsDisplayedOrNot() {
        new Operation_Page().verifyTheTotalOption();
    }

    @Then("Click the Menu option")
    public void clickTheMenuOption() {
        new Operation_Page().clickTheMenuOption();
    }

    @Then("Check the Numpad option is displayed or not")
    public void checkTheNumpadOptionIsDisplayedOrNot() {
        new Customer_Profile_Page().verifyTheNumpad1();
    }

    @And("Check the Continue option is displayed or not")
    public void checkTheContinueOptionIsDisplayedOrNot() {
        new Customer_Profile_Page().verifyTheContinueButton();
    }

    @And("Click the Active Till option")
    public void clickTheActiveTillOption() {
        new Operation_Page().clickTheActiveTillOption();
    }


    @And("Check the Active Till option is displayed or not and it should selected")
    public void checkTheActiveTillOptionIsDisplayedOrNotAndItShouldSelected() {
        new Operation_Page().verifyTheActiveTillOptionWithEnabled();
    }

    @Then("Check the Date&Time Column option is displayed or not")
    public void checkTheDateTimeColumnOptionIsDisplayedOrNot() {
        new Operation_Page().verifyTheDateAndTimeColumn();
    }

    @And("Check the Till Name Column option is displayed or not")
    public void checkTheTillNameColumnOptionIsDisplayedOrNot() {
        new Operation_Page().verifyTheTillNameColumn();
    }

    @Then("Check the User Column option is displayed or not")
    public void checkTheUserColumnOptionIsDisplayedOrNot() {
        new Operation_Page().verifyTheUserColumn();
    }

    @And("Check the Device Column option is displayed or not")
    public void checkTheDeviceColumnOptionIsDisplayedOrNot() {
        new Operation_Page().verifyTheDeviceColumn();
    }

    @Then("Check the Till Balance Column option is displayed or not")
    public void checkTheTillBalanceColumnOptionIsDisplayedOrNot() {
        new Operation_Page().verifyTheTillBalanceColumn();
    }

    @And("Check the Hold Till option is displayed or not")
    public void checkTheHoldTillOptionIsDisplayedOrNot() {
        new Operation_Page().verifyTheHoldTillOption();
    }

    @And("Check the Close Till option is displayed or not")
    public void checkTheCloseTillOptionIsDisplayedOrNot() {
        new Operation_Page().verifyTheCloseTillOption();
    }

    @And("Click the Held Till option")
    public void clickTheHeldTillOption() {
        new Operation_Page().clickTheHeldTillOption();
    }

    @And("Check the Held Till option is displayed or not and it should selected")
    public void checkTheHeldTillOptionIsDisplayedOrNotAndItShouldSelected() {
        new Operation_Page().verifyTheHeldTillOptionWithEnabled();
    }

    @And("Click the Closed Till option")
    public void clickTheClosedTillOption() {
        new Operation_Page().clickTheClosedTillOption();
    }

    @And("Check the Closed Till option is displayed or not and it should selected")
    public void checkTheClosedTillOptionIsDisplayedOrNotAndItShouldSelected() {
        new Operation_Page().verifyTheClosedTillOptionWithEnabled();
    }

    @And("Check the Adjust Till option is displayed or not")
    public void checkTheAdjustTillOptionIsDisplayedOrNot() {
        new Operation_Page().verifyTheAdjustTillOption();
    }

    @And("Click the Cash Drop option and it should be selected")
    public void clickTheCashDropOptionAndItShouldBeSelected() {
        new Operation_Page().clickTheCashDropOption();
        new Operation_Page().verifyTheCashDropOption_WithEnabled();
    }

    @And("Click the Pay In option and it should be selected")
    public void clickThePayInOptionAndItShouldBeSelected() {
        new Operation_Page().clickThePayInOption();
        new Operation_Page().verifyThePayInOption_WithEnabled();
    }

    @And("Check the Paid By option is displayed or not")
    public void checkThePaidByOptionIsDisplayedOrNot() {
        new Operation_Page().verifyThePaidByOption();
    }

    @And("Click the Pay Out option and it should be selected")
    public void clickThePayOutOptionAndItShouldBeSelected() {
        new Operation_Page().clickThePayOutOption();
        new Operation_Page().verifyThePayOutOption_WithEnabled();
    }


    @And("Check the Paid To option is displayed or not")
    public void checkThePaidToOptionIsDisplayedOrNot() {
        new Operation_Page().verifyThePaidToOption();
    }

    @And("Click the Open Cash Drawer option and it should be selected")
    public void clickTheOpenCashDrawerOptionAndItShouldBeSelected() {
        new Operation_Page().clickTheOpenCashDrawerOption();
        new Operation_Page().verifyTheOpenCashDrawerOption_WithEnabled();
    }

    @And("Check the Open Cash Drawer button is displayed or not")
    public void checkTheOpenCashDrawerButtonIsDisplayedOrNot() {
        new Operation_Page().verifyTheOpenCashDrawerOption_Text();
    }

    @And("Check the Print button is displayed or not")
    public void checkThePrintButtonIsDisplayedOrNot() {
        new Operation_Page().verifyThePrintButton();
    }

    @And("Check the Close Day button is displayed or not")
    public void checkTheCloseDayButtonIsDisplayedOrNot() {
        new Operation_Page().verifyTheCloseDayText();
    }

    @And("Check the Cashier Out button is displayed or not")
    public void checkTheCashierOutButtonIsDisplayedOrNot() {
        new Operation_Page().verifyTheCashierOut();
    }

    @And("Check the Summary is displayed or not")
    public void checkTheSummaryIsDisplayedOrNot() {
        new Operation_Page().verifyTheSummary();
    }

    @And("Check the Total Net Sale is displayed or not")
    public void checkTheTotalNetSaleIsDisplayedOrNot() {
        new Operation_Page().verifyTheTotalNetSale();
    }


    @Then("Check the Gross Sale is displayed or not")
    public void checkTheGrossSaleIsDisplayedOrNot() {
        new Operation_Page().verifyTheGrossSale();
    }

    @And("Check the New Customers is displayed or not")
    public void checkTheNewCustomersIsDisplayedOrNot() {
        new Operation_Page().verifyTheNewCustomers();
    }

    @Then("Check the Net Void is displayed or not")
    public void checkTheNetVoidIsDisplayedOrNot() {
        new Operation_Page().verifyTheNetVoid();
    }

    @And("Check the Details is displayed or not")
    public void checkTheDetailsIsDisplayedOrNot() {
        new Operation_Page().verifyTheDetails();
    }

    @And("Check the User button is displayed or not")
    public void checkTheUserButtonIsDisplayedOrNot() {
        new Operation_Page().verifyTheUserButton();
    }

    @And("Check the From Date is displayed or not")
    public void checkTheFromDateIsDisplayedOrNot() {
        new Operation_Page().verifyTheFrom();
    }

    @And("Check the To Date is displayed or not")
    public void checkTheToDateIsDisplayedOrNot() {
        new Operation_Page().verifyTheTo();
    }

    @And("Check the Cover Count is displayed or not")
    public void checkTheCoverCountIsDisplayedOrNot() {}

    @And("Check the Sales is displayed or not")
    public void checkTheSalesIsDisplayedOrNot() {
        new Operation_Page().verifyTheSales();
    }

    @And("Check the Gross Sales is displayed or not")
    public void checkTheGrossSalesIsDisplayedOrNot() {
        new Operation_Page().verifyTheGrossSales();
    }

    @And("Check the Net Sales is displayed or not")
    public void checkTheNetSalesIsDisplayedOrNot() {
        new Operation_Page().verifyTheNetSales();
    }

    @And("Check the Non-Taxable Net Sales is displayed or not")
    public void checkTheNonTaxableNetSalesIsDisplayedOrNot() {
        new Operation_Page().verifyTheNonTaxableNetSales();
    }

    @And("Check the Grand Sales is displayed or not")
    public void checkTheGrandSalesIsDisplayedOrNot() {
        new Operation_Page().verifyTheGrandSales();
    }

    @And("Check the Gross Receipt is displayed or not")
    public void checkTheGrossReceiptIsDisplayedOrNot() {
        new Operation_Page().verifyTheGrossReceipt();
    }

    @And("Check the Gross Void is displayed or not")
    public void checkTheGrossVoidIsDisplayedOrNot() {
        new Operation_Page().verifyTheGrossVoid();
    }

    @And("Check the Net Voids is displayed or not")
    public void checkTheNetVoidsIsDisplayedOrNot() {
        new Operation_Page().verifyTheNetVoids();
    }

    @And("Check the Payment Summary is displayed or not")
    public void checkThePaymentSummaryIsDisplayedOrNot() {
        new Operation_Page().verifyThePaymentSummary();
    }

    @And("Check the Credit Card is displayed or not")
    public void checkTheCreditCardIsDisplayedOrNot() {
        new Operation_Page().verifyTheCreditCard();
    }

    @And("Check the Side CC is displayed or not")
    public void checkTheSideCCIsDisplayedOrNot() {
        new Operation_Page().verifyTheSideCC();
    }

    @And("Check the Other Payment is displayed or not")
    public void checkTheOtherPaymentIsDisplayedOrNot() {
        new Operation_Page().verifyTheOtherPayment();
    }

    @And("Check the Total is displayed or not")
    public void checkTheTotalIsDisplayedOrNot() {
        new Operation_Page().verifyTheTotal();
    }

    @When("Click the continue button")
    public void clickTheContinueButton() {
        new Customer_Profile_Page().clickTheContinueBtn();
    }

    @Then("Application should navigate to the Active Till screen with the created till")
    public void applicationShouldNavigateToTheActiveTillScreenWithTheCreatedTill() {
        new Operation_Page().verifyTheActiveTillOptionWithEnabled();
    }

    @And("Check the Opening Balance is displayed or not")
    public void checkTheOpeningBalanceIsDisplayedOrNot() {
        new Operation_Page().verifyTheOpeningBalance();
    }

    @And("Check the {string} popup and click the yes button")
    public void checkThePopupAndClickTheYesButton(String msg) {
        new RetailPOS_Order_Page().verifyThePopupAndConfirm(msg);
    }

    @And("Select the till from the Active Till")
    public void selectTheTillFromTheActiveTill() {
        new Operation_Page().selectTheFirstTill();
    }

    @Then("Click the Close Till button")
    public void clickTheCloseTillButton() {
        new Operation_Page().clickTheCloseTill();
    }

    @Then("Application should navigate to the Closed Till screen with the closed till")
    public void applicationShouldNavigateToTheClosedTillScreenWithTheClosedTill() {
        new Operation_Page().verifyTheClosedTillOptionWithEnabled();
    }

    @Then("Get the till number from Active Till tab")
    public void getTheTillNumberFromActiveTillTab() {
        till = new Operation_Page().getOperation_ActiveTill_FirstRow_TillNumber().getText();
    }

    @And("Verify the same till is available or not")
    public void verifyTheSameTillIsAvailableOrNot() {
       new Operation_Page().verifyTheClosedTill1(till);
    }

    @And("Verify the same till is closed or not")
    public void verifyTheSameTillIsClosedOrNot() {
        new Operation_Page().verifyTheClosedTill(till);
    }


    @Then("Enter the amount")
    public void enterTheAmount() throws InterruptedException {
        new Operation_Page().enterTheAmount1();
    }

    @Then("Click the Set Till button the {string} message is displayed or not")
    public void clickTheSetTillButtonTheMessageIsDisplayedOrNot(String msg) {
        new Operation_Page().clickTheSetTillOption_WithErrorMessage(msg);
    }

    @Then("Click the Close Till button the {string} message is displayed or not")
    public void clickTheCloseTillButtonTheMessageIsDisplayedOrNot(String msg) {
        new Operation_Page().clickTheCloseTillOption_WithErrorMessage(msg);
    }

    @And("Click the Hold Till button the {string} message is displayed or not")
    public void clickTheHoldTillButtonTheMessageIsDisplayedOrNot(String msg) {
        new Operation_Page().clickTheHoldTillOption_WithErrorMessage(msg);
    }

    @Then("Click the Hold till button")
    public void clickTheHoldTillButton() {
        new Operation_Page().clickTheHoldTillOption();
    }

    @Then("Application should navigate to the Held Till screen with the created till")
    public void applicationShouldNavigateToTheHeldTillScreenWithTheCreatedTill() {
        new Operation_Page().verifyTheHeldTillOptionWithEnabled();
    }

    @And("Select the till from the Held Till")
    public void selectTheTillFromTheHeldTill() {
        new Operation_Page().selectTheFirstTill();
    }

    @And("Click the continue button and {string} message is displayed or not")
    public void clickTheContinueButtonAndMessageIsDisplayedOrNot(String msg) throws InterruptedException {
        new Customer_Profile_Page().clickTheContinueOption_WithErrorMessage(msg);
    }

    @Then("Enter the Required amount as Thousand")
    public void enterTheRequiredAmountAsThousand() throws InterruptedException {
        new Operation_Page().enterTheAmount3();
    }

    @Then("Enter the Required amount as hundred")
    public void enterTheRequiredAmountAsHundred() throws InterruptedException {
        new Operation_Page().enterTheAmount1();
    }

    @And("Click the Till Option")
    public void clickTheTillOption() {
        new Operation_Page().clickTheTillOption();
    }

    @Then("Enter the Required amount as nine hundred")
    public void enterTheRequiredAmountAsNineHundred() throws InterruptedException {
        new Operation_Page().enterTheAmount4();
    }

    @Then("The till amount should reduced as nine hundred")
    public void theTillAmountShouldReducedAsNineHundred() {
        new Operation_Page().verifyTheTillBalance_AmountAfterCashDrop();
    }

    @Then("Enter the Required amount as thousand and hundred")
    public void enterTheRequiredAmountAsThousandAndHundred() throws InterruptedException {
        new Operation_Page().enterTheAmount5();
    }

    @And("Enter the paid by text")
    public void enterThePaidByText() {
        new Operation_Page().enterThePaidByText();
    }

    @Then("Select the Reason from the list")
    public void selectTheReasonFromTheList() throws InterruptedException {
        new Operation_Page().Select_The_Reasons();
    }

    @And("Click the Add button and {string} message is displayed or not")
    public void clickTheAddButtonAndMessageIsDisplayedOrNot(String msg) {
        new Operation_Page().clickTheAddOption_WithErrorMessage(msg);
    }

    @Then("The till amount should shows as thousand and hundred")
    public void theTillAmountShouldShowsAsThousandAndHundred() {
        new Operation_Page().verifyTheTillBalance_AmountAfterPaidBy();
    }

    @And("Enter the paid to text")
    public void enterThePaidToText() {
        new Operation_Page().enterThePaidToText();
    }
}
