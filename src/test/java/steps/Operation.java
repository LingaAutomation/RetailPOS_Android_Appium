package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

public class Operation {
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
}
