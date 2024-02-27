package pages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Operation_Page extends Appium_Base_Class{
    FluentWait<AppiumDriver> wait = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofSeconds(5))
            .ignoring(NoSuchElementException.class);
    @AndroidFindBy(xpath = "//*[@resource-id='operations']")
    WebElement Order_Screen_OperationsBtn;

    @AndroidFindBy(xpath = "//*[contains(@text,'Operation')]")
    WebElement Operation_Operation_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'POS')]")
    WebElement Operation_POS_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Till Management')]")
    WebElement Operation_TillManagement_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Print Labels')]")
    WebElement Operation_PrintLabels_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Process Offline')]")
    WebElement Operation_ProcessOffline_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Hardware Settings')]")
    WebElement Operation_HardwareSettings_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'POS Settings')]")
    WebElement Operation_POSSettings_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Close Day')]")
    WebElement Operation_CloseDay_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Sync Back Office')]")
    WebElement Operation_SyncBackOffice_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Upgrade To New Version')]")
    WebElement Operation_UpgradeToNewVersion_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Back Office')]")
    WebElement Operation_BackOffice_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Sync Back Office')]")
    WebElement Operation_Sync_BackOffice_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Log Off')]")
    WebElement Operation_LogOff_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'QSR Mode')]")
    WebElement Operation_QSR_Mode_Text;

    @AndroidFindBy(xpath = "//android.widget.Button")
    WebElement Operation_Menu_Button;

    @AndroidFindBy(xpath = "//*[contains(@text,'Till') and @selected='true']")
    WebElement Operation_Till_Tab_Selected;

    @AndroidFindBy(xpath = "//*[contains(@text,'Cash Drop') and @selected='true']")
    WebElement Operation_Cash_Drop_Tab_Selected;

    @AndroidFindBy(xpath = "//*[contains(@text,'Pay In') and @selected='true']")
    WebElement Operation_Pay_In_Tab_Selected;

    @AndroidFindBy(xpath = "//*[contains(@text,'Pay Out') and @selected='true']")
    WebElement Operation_Pay_Out_Tab_Selected;

    @AndroidFindBy(xpath = "//*[contains(@text,'Open Cash Drawer') and @selected='true']")
    WebElement Operation_Open_Cash_Drawer_Tab_Selected;

    @AndroidFindBy(xpath = "//*[contains(@text,'Reports') and @selected='true']")
    WebElement Operation_Reports_Tab_Selected;

    @AndroidFindBy(xpath = "//*[contains(@text,'Cash Drop')]")
    WebElement Operation_Cash_Drop_Tab;

    @AndroidFindBy(xpath = "//*[contains(@text,'Pay In')]")
    WebElement Operation_Pay_In_Tab;

    @AndroidFindBy(xpath = "//*[contains(@text,'Pay Out')]")
    WebElement Operation_Pay_Out_Tab;

    @AndroidFindBy(xpath = "//*[contains(@text,'Open Cash Drawer')]")
    WebElement Operation_Open_Cash_Drawer_Tab;

    @AndroidFindBy(xpath = "//*[contains(@text,'Reports')]")
    WebElement Operation_Reports_Tab;

    @AndroidFindBy(xpath = "//*[contains(@text,'Paid By')]")
    WebElement Operation_PaidBy_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Paid To')]")
    WebElement Operation_PaidTo_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Set Till') and @selected='true']")
    WebElement Operation_SetTill_Tab_Selected;

    @AndroidFindBy(xpath = "//*[contains(@text,'Active Till') and @selected='true']")
    WebElement Operation_ActiveTill_Tab_Selected;

    @AndroidFindBy(xpath = "//*[contains(@text,'Active Till')]")
    WebElement Operation_ActiveTill_Tab;

    @AndroidFindBy(xpath = "//*[contains(@text,'Held Till')]")
    WebElement Operation_HeldTill_Tab;

    @AndroidFindBy(xpath = "//*[contains(@text,'Held Till') and @selected='true']")
    WebElement Operation_HeldTill_Tab_Selected;

    @AndroidFindBy(xpath = "//*[contains(@text,'Closed Till')]")
    WebElement Operation_ClosedTill_Tab;

    @AndroidFindBy(xpath = "//*[contains(@text,'Closed Till') and @selected='true']")
    WebElement Operation_ClosedTill_Tab_Selected;

    @AndroidFindBy(xpath = "//*[contains(@text,'OPEN TILL')]")
    WebElement Operation_OpenTill_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Open By:')]")
    WebElement Operation_OpenBy_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Global Till')]")
    WebElement Operation_GlobalTill_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Other Total')]")
    WebElement Operation_Other_Total_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Open Cash Drawer')]")
    WebElement Operation_OpenCashDrawer_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Total')]")
    WebElement Operation_Total_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Hold Till')]")
    WebElement Operation_HoldTill_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Close Till')]")
    WebElement Operation_CloseTill_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Adjust Till')]")
    WebElement Operation_AdjustTill_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Date & Time')]")
    WebElement Operation_DateAndTime_Column;

    @AndroidFindBy(xpath = "//*[contains(@text,'Till Name')]")
    WebElement Operation_TillName_Column;

    @AndroidFindBy(xpath = "//*[contains(@text,'User')]")
    WebElement Operation_User_Column;

    @AndroidFindBy(xpath = "//*[contains(@text,'Device')]")
    WebElement Operation_Device_Column;

    @AndroidFindBy(xpath = "//*[contains(@text,'Till Balance')]")
    WebElement Operation_TillBalance_Column;

    @AndroidFindBy(xpath = "//*[contains(@text,'Syncing with backoffice')]")
    WebElement syncing_Back_Office_txt;


    public WebElement getOperation_OpenCashDrawer_Text() {return Operation_OpenCashDrawer_Text;}

    public WebElement getOperation_PaidBy_Text() {return Operation_PaidBy_Text;}

    public WebElement getOperation_PaidTo_Text() {return Operation_PaidTo_Text;}

    public WebElement getOperation_ClosedTill_Tab_Selected() {return Operation_ClosedTill_Tab_Selected;}

    public WebElement getOperation_HeldTill_Tab_Selected() {return Operation_HeldTill_Tab_Selected;}

    public WebElement getOperation_ActiveTill_Tab_Selected() {return Operation_ActiveTill_Tab_Selected;}

    public WebElement getOperation_Other_Total_Text() {return Operation_Other_Total_Text;}

    public WebElement getOperation_Operation_Text(){return Operation_Operation_Text;}

    public WebElement getOperation_POS_Text(){return Operation_POS_Text;}

    public WebElement getOperation_TillManagement_Text(){return Operation_TillManagement_Text;}

    public WebElement getOperation_PrintLabels_Text(){return Operation_PrintLabels_Text;}

    public WebElement getOperation_ProcessOffline_Text(){return Operation_ProcessOffline_Text;}

    public WebElement getOperation_HardwareSettings_Text(){return Operation_HardwareSettings_Text;}

    public WebElement getOperation_POSSettings_Text(){return Operation_POSSettings_Text;}

    public WebElement getOperation_CloseDay_Text(){return Operation_CloseDay_Text;}

    public WebElement getOperation_SyncBackOffice_Text(){return Operation_SyncBackOffice_Text;}

    public WebElement getOperation_UpgradeToNewVersion_Text(){return Operation_UpgradeToNewVersion_Text;}

    public WebElement getOrder_Screen_OperationsBtn() {return Order_Screen_OperationsBtn;}

    public WebElement getOperation_BackOffice_Text() {return Operation_BackOffice_Text;}

    public WebElement getOperation_LogOff_Text() {return Operation_LogOff_Text;}

    public WebElement getOperation_QSR_Mode_Text() {return Operation_QSR_Mode_Text;}

    public WebElement getOperation_Sync_BackOffice_Text() {return Operation_Sync_BackOffice_Text;}

    public WebElement syncing_Back_Office_txt() {
        return syncing_Back_Office_txt;
    }

    public WebElement getOperation_Cash_Drop_Tab_Selected() {return Operation_Cash_Drop_Tab_Selected;}

    public WebElement getOperation_Cash_Drop_Tab() {return Operation_Cash_Drop_Tab;}

    public WebElement getOperation_Open_Cash_Drawer_Tab() {return Operation_Open_Cash_Drawer_Tab;}

    public WebElement getOperation_Menu_Button() {return Operation_Menu_Button;}

    public WebElement getOperation_Open_Cash_Drawer_Tab_Selected() {return Operation_Open_Cash_Drawer_Tab_Selected;}

    public WebElement getOperation_Pay_In_Tab() {return Operation_Pay_In_Tab;}

    public WebElement getOperation_ActiveTill_Tab() {return Operation_ActiveTill_Tab;}

    public WebElement getOperation_ClosedTill_Tab() {return Operation_ClosedTill_Tab;}

    public WebElement getOperation_HeldTill_Tab() {return Operation_HeldTill_Tab;}

    public WebElement getOperation_Pay_In_Tab_Selected() {return Operation_Pay_In_Tab_Selected;}

    public WebElement getOperation_GlobalTill_Text() {return Operation_GlobalTill_Text;}

    public WebElement getOperation_Pay_Out_Tab() {return Operation_Pay_Out_Tab;}

    public WebElement getOperation_Pay_Out_Tab_Selected() {return Operation_Pay_Out_Tab_Selected;}

    public WebElement getOperation_OpenBy_Text() {return Operation_OpenBy_Text;}

    public WebElement getOperation_Reports_Tab() {return Operation_Reports_Tab;}

    public WebElement getOperation_AdjustTill_Text() {return Operation_AdjustTill_Text;}

    public WebElement getOperation_OpenTill_Text() {return Operation_OpenTill_Text;}

    public WebElement getOperation_Reports_Tab_Selected() {return Operation_Reports_Tab_Selected;}

    public WebElement getOperation_CloseTill_Text() {return Operation_CloseTill_Text;}

    public WebElement getOperation_HoldTill_Text() {return Operation_HoldTill_Text;}

    public WebElement getOperation_SetTill_Tab_Selected() {return Operation_SetTill_Tab_Selected;}

    public WebElement getOperation_DateAndTime_Column() {return Operation_DateAndTime_Column;}

    public WebElement getOperation_Till_Tab_Selected() {return Operation_Till_Tab_Selected;}

    public WebElement getOperation_Device_Column() {return Operation_Device_Column;}

    public WebElement getOperation_TillName_Column() {return Operation_TillName_Column;}

    public WebElement getOperation_Total_Text() {return Operation_Total_Text;}

    public WebElement getOperation_User_Column() {return Operation_User_Column;}

    public WebElement getOperation_TillBalance_Column() {return Operation_TillBalance_Column;}

    public WebElement getSyncing_Back_Office_txt() {return syncing_Back_Office_txt;}



    public void Syncing_With_BO() {
        try {
            if(syncing_Back_Office_txt().isDisplayed())
                test.log(LogStatus.PASS, "Syncing with Backoffice text is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Syncing with Backoffice text is not displayed");
        }
    }

    public void verifyTheDateAndTimeColumn() {
        try {
            if(getOperation_DateAndTime_Column().isDisplayed())
                test.log(LogStatus.PASS, "Date and Time Column is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Date and Time Column is not displayed");
        }
    }

    public void verifyTheTillNameColumn() {
        try {
            if(getOperation_TillName_Column().isDisplayed())
                test.log(LogStatus.PASS, "Till Name Column is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Till Name Column is not displayed");
        }
    }

    public void verifyTheUserColumn() {
        try {
            if(getOperation_User_Column().isDisplayed())
                test.log(LogStatus.PASS, "User Column is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "User Column is not displayed");
        }
    }

    public void verifyTheDeviceColumn() {
        try {
            if(getOperation_Device_Column().isDisplayed())
                test.log(LogStatus.PASS, "Device Column is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Device Column is not displayed");
        }
    }

    public void verifyTheTillBalanceColumn() {
        try {
            if(getOperation_TillBalance_Column().isDisplayed())
                test.log(LogStatus.PASS, "Till Balance Column is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Till Balance Column is not displayed");
        }
    }

    public void verifyTheHoldTillOption(){
        try {
            if(getOperation_HoldTill_Text().isDisplayed())
                test.log(LogStatus.PASS, "Hold Till is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Hold Till is not displayed");
        }
    }

    public void verifyTheCloseTillOption(){
        try {
            if(getOperation_CloseTill_Text().isDisplayed())
                test.log(LogStatus.PASS, "Close Till is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Close Till is not displayed");
        }
    }


    public void verifyTheSettingsIcon(){
        try{
            if(getOrder_Screen_OperationsBtn().isDisplayed()){
                test.log(LogStatus.PASS,"The operation button is displayed in the Sale History Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"The operation button is not displayed in the Sale History Screen");
        }
    }

    public void verifyTheTillOptionWithEnabled(){
        try{
            if(getOperation_Till_Tab_Selected().isDisplayed()){
                test.log(LogStatus.PASS,"Till option is displayed and selected default");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Till option is not displayed and selected default");
        }
    }

    public void verifyTheActiveTillOptionWithEnabled(){
        try{
            if(getOperation_ActiveTill_Tab_Selected().isDisplayed()){
                test.log(LogStatus.PASS,"Active Till option is displayed and selected");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Active Till option is not displayed and selected");
        }
    }

    public void verifyTheHeldTillOptionWithEnabled(){
        try{
            if(getOperation_HeldTill_Tab_Selected().isDisplayed()){
                test.log(LogStatus.PASS,"Held Till option is displayed and selected");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Held Till option is not displayed and selected");
        }
    }

    public void clickTheReportsOption(){
        //click the reports
        click_Ele(getOperation_Reports_Tab());
    }

    public void clickTheHeldTillOption(){
        //click the held till option
        click_Ele(getOperation_HeldTill_Tab());
    }

    public void verifyTheReportsOptionWithEnabled(){
        try{
            if(getOperation_Reports_Tab_Selected().isDisplayed()){
                test.log(LogStatus.PASS,"Reports option is displayed and selected");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Reports option is not displayed and selected");
        }
    }


    public void verifyTheActiveTillOption(){
        try{
            if(getOperation_ActiveTill_Tab().isDisplayed()){
                test.log(LogStatus.PASS,"Active Till option is displayed");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Active Till option is not displayed");
        }
    }

    public void verifyTheHeldTillOption(){
        try{
            if(getOperation_HeldTill_Tab().isDisplayed()){
                test.log(LogStatus.PASS,"Hold Till option is displayed");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Hold Till option is not displayed");
        }
    }

    public void verifyTheClosedTillOption(){
        try{
            if(getOperation_ClosedTill_Tab().isDisplayed()){
                test.log(LogStatus.PASS,"Closed Till option is displayed");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Closed Till option is not displayed");
        }
    }

    public void clickTheClosedTillOption(){
        //click the closed till option
        click_Ele(getOperation_ClosedTill_Tab());
    }

    public void verifyTheClosedTillOptionWithEnabled(){
        try{
            if(getOperation_ClosedTill_Tab_Selected().isDisplayed()){
                test.log(LogStatus.PASS,"Closed Till option is displayed and with enabled");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Closed Till option is not displayed and with enabled");
        }
    }

    public void verifyTheAdjustTillOption(){
        try{
            if(getOperation_AdjustTill_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Adjust Till option is displayed");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Adjust Till option is not displayed");
        }
    }


    public void verifyTheCashDropOption(){
        try{
            if(getOperation_Cash_Drop_Tab().isDisplayed()){
                test.log(LogStatus.PASS,"Cash Drop option is displayed");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Cash Drop option is not displayed");
        }
    }

    public void clickTheCashDropOption(){
        //click the cash drop option
        click_Ele(getOperation_Cash_Drop_Tab());
    }

    public void verifyTheCashDropOption_WithEnabled(){
        try{
            if(getOperation_Cash_Drop_Tab_Selected().isDisplayed()){
                test.log(LogStatus.PASS,"Cash Drop option is displayed and Selected");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Cash Drop option is not displayed and Selected");
        }
    }

    public void verifyThePayInOption(){
        try{
            if(getOperation_Pay_In_Tab().isDisplayed()){
                test.log(LogStatus.PASS,"Pay In option is displayed");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Pay In option is not displayed");
        }
    }


    public void clickThePayInOption(){
        //click the pay in option
        click_Ele(getOperation_Pay_In_Tab());
    }

    public void clickThePayOutOption(){
        //click the pay in option
        click_Ele(getOperation_Pay_Out_Tab());
    }

    public void verifyThePayInOption_WithEnabled(){
        try{
            if(getOperation_Pay_In_Tab_Selected().isDisplayed()){
                test.log(LogStatus.PASS,"Pay In option is displayed and Selected");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Pay In option is not displayed and Selected");
        }
    }

    public void verifyThePayOutOption_WithEnabled(){
        try{
            if(getOperation_Pay_Out_Tab_Selected().isDisplayed()){
                test.log(LogStatus.PASS,"Pay Out option is displayed and Selected");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Pay Out option is not displayed and Selected");
        }
    }

    public void verifyThePaidByOption(){
        try{
            if(getOperation_PaidBy_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Paid By option is displayed");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Paid By option is not displayed");
        }
    }

    public void verifyThePaidToOption(){
        try{
            if(getOperation_PaidTo_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Paid To option is displayed");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Paid To option is not displayed");
        }
    }

    public void verifyThePayIOutOption(){
        try{
            if(getOperation_Pay_Out_Tab().isDisplayed()){
                test.log(LogStatus.PASS,"Pay Out option is displayed");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Pay Out option is not displayed");
        }
    }

    public void verifyTheOpenCashDrawerOption(){
        try{
            if(getOperation_Open_Cash_Drawer_Tab().isDisplayed()){
                test.log(LogStatus.PASS,"Open Cash drawer option is displayed");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Open Cash drawer option is not displayed");
        }
    }

    public void verifyTheOpenCashDrawerOption_Text(){
        try{
            if(getOperation_OpenCashDrawer_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Open Cash drawer button is displayed");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Open Cash drawer button is not displayed");
        }
    }

    public void clickTheOpenCashDrawerOption(){
        //click the open cash drawer
        click_Ele(getOperation_Open_Cash_Drawer_Tab());
    }

    public void verifyTheOpenCashDrawerOption_WithEnabled(){
        try{
            if(getOperation_Open_Cash_Drawer_Tab_Selected().isDisplayed()){
                test.log(LogStatus.PASS,"Open Cash drawer option is displayed and Selected");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Open Cash drawer option is not displayed and Selected");
        }
    }

    public void verifyTheReportsOption(){
        try{
            if(getOperation_Reports_Tab().isDisplayed()){
                test.log(LogStatus.PASS,"Reports option is displayed");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Reports option is not displayed");
        }
    }

    public void verifyTheOpenTillOption(){
        try{
            if(getOperation_OpenTill_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Open Till option is displayed");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Open Till option is not displayed");
        }
    }

    public void verifyTheOpenByOption(){
        try{
            if(getOperation_OpenBy_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Open By option is displayed");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Open By option is not displayed");
        }
    }

    public void verifyTheGlobalTillOption(){
        try{
            if(getOperation_GlobalTill_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Global Till option is displayed");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Global Till option is not displayed");
        }
    }

    public void verifyTheOtherTotalOption(){
        try{
            if(getOperation_Other_Total_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Other Total option is displayed");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Other Total option is not displayed");
        }
    }

    public void verifyTheTotalOption(){
        try{
            if(getOperation_Total_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Total option is displayed");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Total option is not displayed");
        }
    }



    public void clickTheMenuOption(){
            wait.until(ExpectedConditions.visibilityOf(getOperation_Menu_Button()));
            click_Ele(getOperation_Menu_Button());
    }

    public void clickTheActiveTillOption(){
        wait.until(ExpectedConditions.visibilityOf(getOperation_ActiveTill_Tab()));
        click_Ele(getOperation_ActiveTill_Tab());
    }


    public void verifyTheSetTillOptionWithEnabled(){
        try{
            if(getOperation_SetTill_Tab_Selected().isDisplayed()){
                test.log(LogStatus.PASS,"Set Till option is displayed and selected default");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Set Till option is not displayed and selected default");
        }
    }


    public void clickTheSettingsIcon(){
        wait.until(ExpectedConditions.visibilityOf(getOrder_Screen_OperationsBtn()));
        //click the settings icon
        click_Ele(getOrder_Screen_OperationsBtn());
    }

    public void clickTheOperationText(){
        wait.until(ExpectedConditions.visibilityOf(getOperation_Operation_Text()));
        //click the operation text
        click_Ele(getOperation_Operation_Text());
    }

    public void verifyTheOperationText(){
        try{
            if(getOperation_Operation_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Operation text/option is displayed when user click the Settings button from the Sale History Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Operation text/option is not displayed when user click the Settings button from the Sale History Screen");
        }
    }

    public void verifyTheBackOfficeText(){
        try{
            if(getOperation_BackOffice_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Back Office text/option is displayed when user click the Settings button from the Sale History Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Back Office text/option is not displayed when user click the Settings button from the Sale History Screen");
        }
    }

    public void verifyTheSync_BackOfficeText(){
        try{
            if(getOperation_Sync_BackOffice_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Sync Back Office text/option is displayed when user click the Settings button from the Sale History Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Sync Back Office text/option is not displayed when user click the Settings button from the Sale History Screen");
        }
    }

    public void verifyTheLogOfficeText(){
        try{
            if(getOperation_LogOff_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Log Off text/option is displayed when user click the Settings button from the Sale History Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Log Off text/option is not displayed when user click the Settings button from the Sale History Screen");
        }
    }

    public void verifyTheQSR_ModeOfficeText(){
        try{
            if(getOperation_QSR_Mode_Text().isDisplayed()){
                test.log(LogStatus.PASS,"QSR Mode text/option is displayed when user click the Settings button from the Sale History Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"QSR Mode text/option is not displayed when user click the Settings button from the Sale History Screen");
        }
    }



    public void verifyThePOSText(){
        try{
            if(getOperation_POS_Text().isDisplayed()){
                test.log(LogStatus.PASS,"POS text/option is displayed when user click the operation button from the Sale History Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"POS text/option is not displayed when user click the operation button from the Sale History Screen");
        }
    }

    public void verifyTheTillManagementText(){
        try{
            if(getOperation_TillManagement_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Till Management text/option is displayed when user click the operation button from the Sale History Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Till Management text/option is not displayed when user click the operation button from the Sale History Screen");
        }
    }

    public void verifyThePrintLabelsText(){
        try{
            if(getOperation_PrintLabels_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Print Labels text/option is displayed when user click the operation button from the Sale History Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Print Labels text/option is not displayed when user click the operation button from the Sale History Screen");
        }
    }

    public void verifyTheProcessOfflineText(){
        try{
            if(getOperation_ProcessOffline_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Process Offline text/option is displayed when user click the operation button from the Sale History Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Process Offline text/option is not displayed when user click the operation button from the Sale History Screen");
        }
    }

    public void verifyTheHardwareSettingsText(){
        try{
            if(getOperation_HardwareSettings_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Hardware Settings text/option is displayed when user click the operation button from the Sale History Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Hardware Settings text/option is not displayed when user click the operation button from the Sale History Screen");
        }
    }

    public void verifyThePOSSettingsText(){
        try{
            if(getOperation_POSSettings_Text().isDisplayed()){
                test.log(LogStatus.PASS,"POS Settings text/option is displayed when user click the operation button from the Sale History Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"POS Settings text/option is not displayed when user click the operation button from the Sale History Screen");
        }
    }

    public void verifyTheCloseDayText(){
        try{
            if(getOperation_CloseDay_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Close Day text/option is displayed when user click the operation button from the Sale History Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Close Day text/option is not displayed when user click the operation button from the Sale History Screen");
        }
    }

    public void verifyTheSyncBackOfficeText(){
        try{
            if(getOperation_SyncBackOffice_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Sync Back Office text/option is displayed when user click the operation button from the Sale History Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Sync Back Office text/option is not displayed when user click the operation button from the Sale History Screen");
        }
    }

    public void clickTheSyncBackOfficeOption(){
        //click the sync back office btn
        click_Ele(getOperation_SyncBackOffice_Text());
    }

    public void verifyTheUpgradeToNewVersionText(){
        try{
            if(getOperation_UpgradeToNewVersion_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Upgrade To New Version text/option is displayed when user click the operation button from the Sale History Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Upgrade To New Version text/option is not displayed when user click the operation button from the Sale History Screen");
        }
    }

    public void ClickThePOSOption(){
        wait.until(ExpectedConditions.visibilityOf(getOperation_POS_Text()));
        //click the POS option
        getOperation_POS_Text().click();
    }

    public void clickTheTillManagement(){
        wait.until(ExpectedConditions.visibilityOf(getOperation_TillManagement_Text()));
        //click the till management option
        click_Ele(getOperation_TillManagement_Text());
    }

}
