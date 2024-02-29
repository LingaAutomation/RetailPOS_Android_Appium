package pages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

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

    @AndroidFindBy(xpath = "//*[@text='Till']")
    WebElement Operation_Till_Tab;

    @AndroidFindBy(xpath = "//*[contains(@text,'Add')]")
    WebElement Operation_Till_Add;

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

    @AndroidFindBy(xpath = "//*[contains(@text,'Paid By')]/..//android.widget.EditText")
    WebElement Operation_PaidBy_Text_inputBox;

    @AndroidFindBy(xpath = "//*[contains(@text,'Paid To')]")
    WebElement Operation_PaidTo_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Paid To')]/..//android.widget.EditText")
    WebElement Operation_PaidTo_Text_inputBox;

    @AndroidFindBy(xpath = "//*[contains(@text,'Set Till') and @selected='true']")
    WebElement Operation_SetTill_Tab_Selected;

    @AndroidFindBy(xpath = "//*[contains(@text,'Set Till')]")
    WebElement Operation_SetTill_Tab;

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

    @AndroidFindBy(xpath = "//*[contains(@text,'TOTAL NET SALE')]")
    WebElement Operation_TotalNetSale;

    @AndroidFindBy(xpath = "//*[contains(@text,'GROSS SALE')]")
    WebElement Operation_GrossSale;

    @AndroidFindBy(xpath = "//*[contains(@text,'NEW CUSTOMERS')]")
    WebElement Operation_NewCustomers;

    @AndroidFindBy(xpath = "//*[contains(@text,'NET VOID')]")
    WebElement Operation_NetVoid;

    @AndroidFindBy(xpath = "//*[contains(@text,'Details')]")
    WebElement Operation_Details;

    @AndroidFindBy(xpath = "//*[contains(@text,'Details')]/../../..//android.widget.Button")
    WebElement Operation_UserButton;

    @AndroidFindBy(xpath = "//*[contains(@text,'From')]")
    WebElement Operation_From;

    @AndroidFindBy(xpath = "//*[contains(@text,'To')]")
    WebElement Operation_To;

    @AndroidFindBy(xpath = "//*[contains(@text,'SALES')]")
    WebElement Operation_Sales;

    @AndroidFindBy(xpath = "//*[contains(@text,'Gross Sales')]")
    WebElement Operation_GrossSales;

    @AndroidFindBy(xpath = "//*[contains(@text,'Net Sales')]")
    WebElement Operation_NetSales;

    @AndroidFindBy(xpath = "//*[contains(@text,'Non-Taxable Net Sales')]")
    WebElement Operation_NonTaxable_NetSales;

    @AndroidFindBy(xpath = "//*[contains(@text,'Grand Sales')]")
    WebElement Operation_GrandSales;

    @AndroidFindBy(xpath = "//*[contains(@text,'Gross Receipt')]")
    WebElement Operation_GrossReceipt;

    @AndroidFindBy(xpath = "//*[contains(@text,'Gross Void')]")
    WebElement Operation_GrossVoid;

    @AndroidFindBy(xpath = "//*[contains(@text,'Net Void')]")
    WebElement Operation_NetVoids;

    @AndroidFindBy(xpath = "//*[contains(@text,'PAYMENT SUMMARY')]")
    WebElement Operation_PaymentSummary;

    @AndroidFindBy(xpath = "//*[contains(@text,'Credit Card')]")
    WebElement Operation_CreditCard;

    @AndroidFindBy(xpath = "//*[contains(@text,'SideCC')]")
    WebElement Operation_SideCC;

    @AndroidFindBy(xpath = "//*[contains(@text,'OTHER PAYMENT')]")
    WebElement Operation_OtherPayment;

    @AndroidFindBy(xpath = "//*[contains(@text,'Total')]")
    WebElement Operation_Total;

    @AndroidFindBy(xpath = "//*[@text='SUMMARY']")
    WebElement Operation_Summary;

    @AndroidFindBy(xpath = "//*[contains(@text,'Opening Balance')]")
    WebElement Operation_OpeningBalance;

    @AndroidFindBy(xpath = "//*[contains(@text,'Cashier Out')]")
    WebElement Operation_CashierOut;

    @AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button")
    WebElement Operation_PrintButton;

    @AndroidFindBy(xpath = "//android.widget.GridView/android.view.View[2]/android.view.View[1]")
    WebElement Operation_ActiveTill_FirstRow;

    @AndroidFindBy(xpath = "//android.widget.GridView/android.view.View[2]/android.view.View[1]/android.view.View[2]")
    WebElement Operation_ActiveTill_FirstRow_TillNumber;

    @AndroidFindBy(xpath = "//android.widget.GridView/android.view.View[2]/android.view.View[1]/android.view.View[5]")
    WebElement Operation_ActiveTill_FirstRow_Amount;


    public WebElement getOperation_PaidBy_Text_inputBox() {return Operation_PaidBy_Text_inputBox;}

    public WebElement getOperation_PaidTo_Text_inputBox() {return Operation_PaidTo_Text_inputBox;}

    public WebElement getOperation_Till_Add() {return Operation_Till_Add;}

    public WebElement getOperation_Till_Tab() {return Operation_Till_Tab;}

    public WebElement getOperation_SetTill_Tab() {return Operation_SetTill_Tab;}

    public WebElement getOperation_ActiveTill_FirstRow_Amount() {return Operation_ActiveTill_FirstRow_Amount;}

    public WebElement getOperation_ActiveTill_FirstRow_TillNumber() {return Operation_ActiveTill_FirstRow_TillNumber;}

    public WebElement getOperation_ActiveTill_FirstRow() {return Operation_ActiveTill_FirstRow;}

    public WebElement getOperation_CashierOut() {return Operation_CashierOut;}

    public WebElement getOperation_CreditCard() {return Operation_CreditCard;}

    public WebElement getOperation_Details() {return Operation_Details;}

    public WebElement getOperation_GrossSale() {return Operation_GrossSale;}

    public WebElement getOperation_From() {return Operation_From;}

    public WebElement getOperation_NetVoid() {return Operation_NetVoid;}

    public WebElement getOperation_To() {return Operation_To;}

    public WebElement getOperation_NewCustomers() {return Operation_NewCustomers;}

    public WebElement getOperation_TotalNetSale() {return Operation_TotalNetSale;}

    public WebElement getOperation_GrandSales() {return Operation_GrandSales;}

    public WebElement getOperation_GrossReceipt() {return Operation_GrossReceipt;}

    public WebElement getOperation_UserButton() {return Operation_UserButton;}

    public WebElement getOperation_GrossSales() {return Operation_GrossSales;}

    public WebElement getOperation_GrossVoid() {return Operation_GrossVoid;}

    public WebElement getOperation_NetSales() {return Operation_NetSales;}

    public WebElement getOperation_NetVoids() {return Operation_NetVoids;}

    public WebElement getOperation_NonTaxable_NetSales() {return Operation_NonTaxable_NetSales;}

    public WebElement getOperation_OpeningBalance() {return Operation_OpeningBalance;}

    public WebElement getOperation_OtherPayment() {return Operation_OtherPayment;}

    public WebElement getOperation_PaymentSummary() {return Operation_PaymentSummary;}

    public WebElement getOperation_PrintButton() {return Operation_PrintButton;}

    public WebElement getOperation_Sales() {return Operation_Sales;}

    public WebElement getOperation_SideCC() {return Operation_SideCC;}

    public WebElement getOperation_Summary() {return Operation_Summary;}

    public WebElement getOperation_Total() {return Operation_Total;}

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


    public void enterThePaidByText(){
        //enter the text
        send_data(getOperation_PaidBy_Text_inputBox(),"Test");
    }

    public void  Select_The_Reasons() throws InterruptedException {
        // Getting list of options
        List<?> itemsInDropdown = driver.findElements(By.xpath("//android.app.Dialog[contains(@resource-id,'mat-dialog')]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View"));

        // Getting size of options available
        int size = itemsInDropdown.size();

        if(size >= 12){
            // Generate a random number with in range
            int randnMumber = ThreadLocalRandom.current().nextInt(1, 12);

            // Selecting random value
            click_Ele((WebElement) itemsInDropdown.get(randnMumber));

            Thread.sleep(2000);
        }else{
            // Generate a random number with in range
            int randnMumber = ThreadLocalRandom.current().nextInt(1, size);

            // Selecting random value
            click_Ele((WebElement) itemsInDropdown.get(randnMumber));

            Thread.sleep(2000);
        }

    }


    public void enterThePaidToText(){
        //enter the text
        send_data(getOperation_PaidTo_Text_inputBox(),"Test");
    }

    public void clickTheTillOption(){
        //click the Till option
        click_Ele(getOperation_Till_Tab());
    }

    public void enterTheAmount(String tot){
        tot = tot.replace(".","");

        for(int i = 0; i < tot.length();i++){
            String ss = String.valueOf(tot.charAt(i));
//            System.out.println("----------dddddddd-------- "+ss);
            driver.findElement(By.xpath("//android.widget.Button[contains(@text,'"+ss+"')]")).click();
//            System.out.println("------------------ "+driver.findElement(By.xpath("//android.widget.Button[contains(@text,'"+ss+"')]")).getText());
        }
    }

    public void enterTheAmount1() {
        String tot = "10000";

        for(int i = 0; i < tot.length();i++){
            driver.findElement(By.xpath("//android.widget.Button[contains(@text,'"+tot.charAt(i)+"')]")).click();
        }
    }

    public void enterTheAmount3() {
        String tot = "100000";

        for(int i = 0; i < tot.length();i++){
            driver.findElement(By.xpath("//android.widget.Button[contains(@text,'"+tot.charAt(i)+"')]")).click();
        }
    }

    public void enterTheAmount4() {
        String tot = "90000";

        for(int i = 0; i < tot.length();i++){
            driver.findElement(By.xpath("//android.widget.Button[contains(@text,'"+tot.charAt(i)+"')]")).click();
        }
    }

    public void enterTheAmount5(){
        String tot = "110000";

        for(int i = 0; i < tot.length();i++){
            driver.findElement(By.xpath("//android.widget.Button[contains(@text,'"+tot.charAt(i)+"')]")).click();
        }
    }

    public void enterTheAmount2(String total) {
//        System.out.println("------------------ : "+total);
        double s1 = Double.parseDouble(total);

        double s2 = 100.00 + s1;

        s2 = Math.round(s2*100.00)/100.00;

        String tot = String.valueOf(s2);
        tot=tot.replace(".","");
        for(int i = 0; i < tot.length();i++){
            driver.findElement(By.xpath("//android.widget.Button[contains(@text,'"+tot.charAt(i)+"')]")).click();
        }
    }

    public void clickTheSetTillOption_WithErrorMessage(String msg){
        //click the set till option
        click_Ele(getOperation_SetTill_Tab());
        text_Confirm(driver.findElement(By.xpath("//*[contains(@text,'"+msg+"')]")),msg);
    }

    public void clickTheAddOption_WithErrorMessage(String msg){
        //click the set till option
        click_Ele(getOperation_Till_Add());
        text_Confirm(driver.findElement(By.xpath("//*[contains(@text,'"+msg+"')]")),msg);
    }


    public void clickTheCloseTillOption_WithErrorMessage(String msg){
        //click the set till option
        click_Ele(getOperation_CloseTill_Text());
        text_Confirm(driver.findElement(By.xpath("//*[contains(@text,'"+msg+"')]")),msg);
    }

    public void clickTheHoldTillOption_WithErrorMessage(String msg){
        //click the set till option
        click_Ele(getOperation_HoldTill_Text());
        text_Confirm(driver.findElement(By.xpath("//*[contains(@text,'"+msg+"')]")),msg);
    }

    public void clickTheHoldTillOption(){
        //click the set till option
        click_Ele(getOperation_HoldTill_Text());
    }

    public void verifyTheTillBalance_AmountInActiveTill(String tot){
        String tillAmount = getOperation_ActiveTill_FirstRow_Amount().getText().replaceAll("[a-zA-Z $₹,:]", "").substring(1);

        if(tillAmount.equals("0.00")){
            test.log(LogStatus.FAIL,"Till Amount is not updated");
        }else if(tillAmount.equals(tot)){
            test.log(LogStatus.PASS,"Till amount updated correctly");
        }
    }

    public void verifyTheTillBalance_AmountAfterCashDrop(){
        String tillAmount = getOperation_ActiveTill_FirstRow_Amount().getText().replaceAll("[a-zA-Z $₹,:]", "").substring(1);

        if(tillAmount.equals("0.00")){
            test.log(LogStatus.FAIL,"Till Amount is not updated");
        }else if(tillAmount.equals("900.00")){
            test.log(LogStatus.PASS,"Till amount updated correctly");
        }
    }

    public void verifyTheTillBalance_AmountAfterPaidBy(){
        String tillAmount = getOperation_ActiveTill_FirstRow_Amount().getText().replaceAll("[a-zA-Z $₹,:]", "").substring(1);

        if(tillAmount.equals("0.00")){
            test.log(LogStatus.FAIL,"Till Amount is not updated");
        }else if(tillAmount.equals("1100.00")){
            test.log(LogStatus.PASS,"Till amount updated correctly");
        }
    }

    public void verifyTheClosedTill(String tillNo){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text='"+tillNo+"']"))));
        String ss = driver.findElement(By.xpath("//*[@text='"+tillNo+"']")).getText();

        if(ss.equals(tillNo)){
            test.log(LogStatus.PASS,"The Closed Till is available in the Closed Tab");
        }else{
            test.log(LogStatus.FAIL,"The Closed Till is not available in the Closed Tab");
            ut.FailedCaptureScreenshotAsBASE64(driver,test);
        }
    }

    public void verifyTheClosedTill1(String tillNo){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text='"+tillNo+"']"))));
        String ss = driver.findElement(By.xpath("//*[@text='"+tillNo+"']")).getText();

        if(ss.equals(tillNo)){
            test.log(LogStatus.PASS,"The Till is available in the Active Tab");
        }else{
            test.log(LogStatus.FAIL,"The Till is not available in the Active Tab");
            ut.FailedCaptureScreenshotAsBASE64(driver,test);
        }
    }

    public void selectTheFirstTill(){
        wait.until(ExpectedConditions.visibilityOf(getOperation_ActiveTill_FirstRow()));
        //select the Active till
        click_Ele(getOperation_ActiveTill_FirstRow());
    }

    public void clickTheCloseTill(){
        //click the Close Till
        click_Ele(getOperation_CloseTill_Text());
    }

    public void Syncing_With_BO() {
        try {
            if(syncing_Back_Office_txt().isDisplayed())
                test.log(LogStatus.PASS, "Syncing with Backoffice text is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Syncing with Backoffice text is not displayed");
        }
    }

    public void verifyTheTotalNetSale() {
        try {
            if(getOperation_TotalNetSale().isDisplayed())
                test.log(LogStatus.PASS, "Total Net Sale is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Total Net Sale is not displayed");
        }
    }

    public void verifyTheGrossSale() {
        try {
            if(getOperation_GrossSale().isDisplayed())
                test.log(LogStatus.PASS, "Gross Sale is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Gross Sale is not displayed");
        }
    }

    public void verifyTheNewCustomers() {
        try {
            if(getOperation_NewCustomers().isDisplayed())
                test.log(LogStatus.PASS, "New Customers is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "New Customers is not displayed");
        }
    }

    public void verifyTheNetVoid() {
        try {
            if(getOperation_NetVoid().isDisplayed())
                test.log(LogStatus.PASS, "Net Void is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Net Void is not displayed");
        }
    }

    public void verifyTheDetails() {
        try {
            if(getOperation_Details().isDisplayed())
                test.log(LogStatus.PASS, "Details is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Details is not displayed");
        }
    }

    public void verifyTheUserButton() {
        try {
            if(getOperation_UserButton().isDisplayed())
                test.log(LogStatus.PASS, "User button is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "User button is not displayed");
        }
    }

    public void verifyThePrintButton() {
        try {
            if(getOperation_PrintButton().isDisplayed())
                test.log(LogStatus.PASS, "Print Button is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Print Button is not displayed");
        }
    }

    public void verifyTheFrom() {
        try {
            if(getOperation_From().isDisplayed())
                test.log(LogStatus.PASS, "From is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "From is not displayed");
        }
    }

    public void verifyTheTo() {
        try {
            if(getOperation_To().isDisplayed())
                test.log(LogStatus.PASS, "To is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "To is not displayed");
        }
    }

    public void verifyTheSales() {
        try {
            if(getOperation_Sales().isDisplayed())
                test.log(LogStatus.PASS, "Sales is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Sales is not displayed");
        }
    }

    public void verifyTheGrossSales() {
        try {
            if(getOperation_GrossSales().isDisplayed())
                test.log(LogStatus.PASS, "Gross Sales is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Gross Sales is not displayed");
        }
    }

    public void verifyTheNetSales() {
        try {
            if(getOperation_NetSales().isDisplayed())
                test.log(LogStatus.PASS, "Net Sales is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Net Sales is not displayed");
        }
    }

    public void verifyTheNonTaxableNetSales() {
        try {
            if(getOperation_NonTaxable_NetSales().isDisplayed())
                test.log(LogStatus.PASS, "Non Taxable Net Sales is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Non Taxable Net Sales is not displayed");
        }
    }

    public void verifyTheGrandSales() {
        try {
            if(getOperation_GrandSales().isDisplayed())
                test.log(LogStatus.PASS, "Grand Sales is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Grand Sales is not displayed");
        }
    }

    public void verifyTheGrossReceipt() {
        try {
            if(getOperation_GrossReceipt().isDisplayed())
                test.log(LogStatus.PASS, "Gross Receipt is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Gross Receipt is not displayed");
        }
    }

    public void verifyTheGrossVoid() {
        try {
            if(getOperation_GrossVoid().isDisplayed())
                test.log(LogStatus.PASS, "Gross Void is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Gross Void is not displayed");
        }
    }

    public void verifyTheNetVoids() {
        try {
            if(getOperation_NetVoids().isDisplayed())
                test.log(LogStatus.PASS, "Net Void is displayed under Sales");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Net Void is not displayed under Sales");
        }
    }

    public void verifyThePaymentSummary() {
        try {
            if(getOperation_PaymentSummary().isDisplayed())
                test.log(LogStatus.PASS, "Payment Summary is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Payment Summary is not displayed");
        }
    }

    public void verifyTheCreditCard() {
        try {
            if(getOperation_CreditCard().isDisplayed())
                test.log(LogStatus.PASS, "Credit Card is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Credit Card is not displayed");
        }
    }

    public void verifyTheSideCC() {
        try {
            if(getOperation_SideCC().isDisplayed())
                test.log(LogStatus.PASS, "SideCC is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "SideCC is not displayed");
        }
    }

    public void verifyTheOtherPayment() {
        try {
            if(getOperation_OtherPayment().isDisplayed())
                test.log(LogStatus.PASS, "Other Payment is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Other Payment is not displayed");
        }
    }

    public void verifyTheTotal() {
        try {
            if(getOperation_Total().isDisplayed())
                test.log(LogStatus.PASS, "Total is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Total is not displayed");
        }
    }

    public void verifyTheSummary() {
        try {
            if(getOperation_Summary().isDisplayed())
                test.log(LogStatus.PASS, "Summary is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Summary is not displayed");
        }
    }

    public void verifyTheOpeningBalance() {
        try {
            if(getOperation_OpeningBalance().isDisplayed())
                test.log(LogStatus.PASS, "Opening Balance is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Opening Balance is not displayed");
        }
    }

    public void verifyTheCashierOut() {
        try {
            if(getOperation_CashierOut().isDisplayed())
                test.log(LogStatus.PASS, "Cashier Out is displayed");
        }catch(Exception d) {
            test.log(LogStatus.FAIL, "Cashier Out is not displayed");
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
                test.log(LogStatus.PASS,"POS text/option is displayed when user click the operation button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"POS text/option is not displayed when user click the operation button");
        }
    }

    public void verifyTheTillManagementText(){
        try{
            if(getOperation_TillManagement_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Till Management text/option is displayed when user click the operation button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Till Management text/option is not displayed when user click the operation button");
        }
    }

    public void verifyThePrintLabelsText(){
        try{
            if(getOperation_PrintLabels_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Print Labels text/option is displayed when user click the operation button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Print Labels text/option is not displayed when user click the operation button");
        }
    }

    public void verifyTheProcessOfflineText(){
        try{
            if(getOperation_ProcessOffline_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Process Offline text/option is displayed when user click the operation button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Process Offline text/option is not displayed when user click the operation button");
        }
    }

    public void verifyTheHardwareSettingsText(){
        try{
            if(getOperation_HardwareSettings_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Hardware Settings text/option is displayed when user click the operation button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Hardware Settings text/option is not displayed when user click the operation button");
        }
    }

    public void verifyThePOSSettingsText(){
        try{
            if(getOperation_POSSettings_Text().isDisplayed()){
                test.log(LogStatus.PASS,"POS Settings text/option is displayed when user click the operation button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"POS Settings text/option is not displayed when user click the operation button");
        }
    }

        public void verifyTheCloseDayText(){
            try{
                if(getOperation_CloseDay_Text().isDisplayed()){
                    test.log(LogStatus.PASS,"Close Day text/option is displayed");
                }
            }catch (Exception e){
                test.log(LogStatus.FAIL,"Close Day text/option is not displayed");
            }
        }

    public void verifyTheSyncBackOfficeText(){
        try{
            if(getOperation_SyncBackOffice_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Sync Back Office text/option is displayed when user click the operation button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Sync Back Office text/option is not displayed when user click the operation button");
        }
    }

    public void clickTheSyncBackOfficeOption(){
        //click the sync back office btn
        click_Ele(getOperation_SyncBackOffice_Text());
    }

    public void verifyTheUpgradeToNewVersionText(){
        try{
            if(getOperation_UpgradeToNewVersion_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Upgrade To New Version text/option is displayed when user click the operation button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Upgrade To New Version text/option is not displayed when user click the operation button");
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
