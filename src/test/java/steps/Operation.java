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
}
