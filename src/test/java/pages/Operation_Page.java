package pages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Operation_Page extends Appium_Base_Class{

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

    @AndroidFindBy(xpath = "//*[contains(@text,'Set Till') and @selected='true']")
    WebElement Operation_SetTill_Tab_Selected;

    @AndroidFindBy(xpath = "//*[contains(@text,'Active Till')]")
    WebElement Operation_ActiveTill_Tab;

    @AndroidFindBy(xpath = "//*[contains(@text,'Held Till')]")
    WebElement Operation_HeldTill_Tab;

    @AndroidFindBy(xpath = "//*[contains(@text,'Closed Till')]")
    WebElement Operation_ClosedTill_Tab;

    @AndroidFindBy(xpath = "//*[contains(@text,'OPEN TILL')]")
    WebElement Operation_OpenTill_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Open By:')]")
    WebElement Operation_OpenBy_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Global Till')]")
    WebElement Operation_GlobalTill_Text;

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

    public void verifyTheSettingsIcon(){
        try{
            if(getOrder_Screen_OperationsBtn().isDisplayed()){
                test.log(LogStatus.PASS,"The operation button is displayed in the Sale History Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"The operation button is not displayed in the Sale History Screen");
        }
    }

    public void clickTheSettingsIcon(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //click the settings icon

        click_Ele(getOrder_Screen_OperationsBtn());
    }

    public void clickTheOperationText(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
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
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //click the POS option
        getOperation_POS_Text().click();
    }

    public void clickTheTillManagement(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //click the till management option
        click_Ele(getOperation_TillManagement_Text());
    }

}
