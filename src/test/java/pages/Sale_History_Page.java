package pages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Sale_History_Page extends Appium_Base_Class{

    Utility ut = new Utility();

    @AndroidFindBy(xpath = "//*[contains(@text,'All Orders')]")
    WebElement All_Orders_All_Orders_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Check Status')]")
    WebElement All_Orders_Check_Status_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Closed')]")
    WebElement All_Orders_Closed_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Void')]")
    WebElement All_Orders_Void_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Parked')]")
    WebElement All_Orders_Parked_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Refunded')]")
    WebElement All_Orders_Refunded_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Exchanged')]")
    WebElement All_Orders_Exchanged_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Layaways')]")
    WebElement All_Orders_Layaways_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Search Date')]")
    WebElement All_Orders_Search_Date_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Check No')]")
    WebElement All_Orders_Receipt_No_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Customer')]")
    WebElement All_Orders_Customer_Column_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Receipt No')]")
    WebElement All_Orders_Receipt_No_Column_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Date')]")
    WebElement All_Orders_Date_Column_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Time')]")
    WebElement All_Orders_Time_Column_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Cashier')]")
    WebElement All_Orders_Cashier_Column_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Total')]")
    WebElement All_Orders_Total_Column_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Transaction Time')]")
    WebElement All_Orders_Transaction_Time_Column_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Reasons')]")
    WebElement All_Orders_Reasons_Column_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Refund Total')]")
    WebElement All_Orders_Refund_Total_Column_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Refund Type')]")
    WebElement All_Orders_Refund_Type_Column_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Server')]")
    WebElement All_Orders_Server_Column_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Re-Open Check')]")
    WebElement All_Orders_Reopen_Check_Button;

    @AndroidFindBy(xpath = "//*[contains(@text,'Return')]")
    WebElement All_Orders_Return_Button;

    @AndroidFindBy(xpath = "//*[contains(@text,'Re-Print Check')]")
    WebElement All_Orders_RePrint_Check_Button;

    @AndroidFindBy(xpath = "//*[contains(@text,'Operation')]")
    WebElement All_Orders_Operation_Button;

    @AndroidFindBy(xpath = "//*[contains(@text,'Pay Check')]")
    WebElement All_Orders_Pay_Check_Button;

    @AndroidFindBy(xpath = "//*[contains(@text,'Open Check')]")
    WebElement All_Orders_Open_Check_Button;

    @AndroidFindBy(xpath = "//*[contains(@text,'Print Receipt')]")
    WebElement All_Orders_Print_Receipt_Button;

    @AndroidFindBy(xpath = "//*[contains(@text,'Check Total:')]")
    WebElement All_Orders_Check_Total_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Customer:')]")
    WebElement All_Orders_Customer_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Average Duration:')]")
    WebElement All_Orders_Average_Duration_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Average Amount:')]")
    WebElement All_Orders_Average_Amount_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Closed') and @focused='true']")
    WebElement All_Orders_Closed_Tab_Active;

    @AndroidFindBy(xpath = "//*[contains(@text,'Void') and @focused='true']")
    WebElement All_Orders_Void_Active;

    @AndroidFindBy(xpath = "//*[contains(@text,'Parked') and @focused='true']")
    WebElement All_Orders_Parked_Tab_Active;

    @AndroidFindBy(xpath = "//*[contains(@text,'Refunded') and @focused='true']")
    WebElement All_Orders_Refunded_Tab_Active;

    @AndroidFindBy(xpath = "//*[contains(@text,'Exchanged') and @focused='true']")
    WebElement All_Orders_Exchanged_Tab_Active;

    @AndroidFindBy(xpath = "//*[contains(@text,'Layaways') and @focused='true']")
    WebElement All_Orders_Layaways_Tab_Active;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.view.View[7]/android.widget.Button")
    WebElement All_Orders_First_Digital_Receipt;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.view.View[7]/android.widget.Button")
    WebElement All_Orders_First_Digital_Receipt_Refund;

    @AndroidFindBy(xpath = "//*[contains(@text,'Table-No: Retail')]")
    WebElement All_Orders_Digital_Receipt_Table_No;

    @AndroidFindBy(xpath = "//*[contains(@text,'Status: Fully Refunded')]")
    WebElement All_Orders_Digital_Receipt_Status;

    @AndroidFindBy(xpath = "//*[contains(@text,'ORDER SUMMARY')]")
    WebElement All_Orders_Digital_Receipt_Order_Summary;

    @AndroidFindBy(xpath = "//*[contains(@text,'Tax Summary')]")
    WebElement All_Orders_Digital_Receipt_Tax_Summary;

    @AndroidFindBy(xpath = "//*[contains(@text,'Grand Total')]")
    WebElement All_Orders_Digital_Receipt_Grand_Total;

    @AndroidFindBy(xpath = "//*[contains(@text,'REFUND SUMMARY')]")
    WebElement All_Orders_Digital_Receipt_Refund_Summary;

    @AndroidFindBy(xpath = "//*[contains(@text,'Grand Total')]/../..//android.view.View[2]/android.widget.TextView")
    WebElement All_Orders_Digital_Receipt_Grand_Total_Amount;

    @AndroidFindBy(xpath = "//android.widget.TextView/..//android.view.View[1]/android.widget.Button")
    WebElement All_Orders_Digital_Receipt_Back_Button;

    @AndroidFindBy(xpath = "(//android.widget.TextView/..//android.view.View[2]/android.view.View/android.widget.TextView[1])[1]")
    WebElement All_Orders_Digital_Receipt_Store_Name;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.Button/../../android.widget.TextView")
    WebElement All_Orders_Digital_Receipt_Customer_Name;

    @AndroidFindBy(xpath = "//*[contains(@text,'Server : ')]")
    WebElement All_Orders_Digital_Receipt_Server;

    @AndroidFindBy(xpath = "//*[contains(@text,'Check No')]")
    WebElement All_Orders_Digital_Receipt_Receipt_No_txt;

    @AndroidFindBy(xpath = "//*[contains(@text,'Check No')]/..//android.widget.TextView[3]")
    WebElement All_Orders_Digital_Receipt_Receipt_No;

    @AndroidFindBy(xpath = "//*[contains(@text,'Check No')]/..//android.widget.TextView[4]")
    WebElement All_Orders_Digital_Receipt_Date_And_Time;

    @AndroidFindBy(xpath = "//*[contains(@text,'Subtotal')]")
    WebElement All_Orders_Digital_Receipt_Subtotal;

    @AndroidFindBy(xpath = "//*[contains(@text,'* This Sale is refunded')]")
    WebElement All_Orders_Digital_Receipt_ThisSaleIsRefunded;

    @AndroidFindBy(xpath = "//*[contains(@text,'Subtotal')]/..//android.widget.TextView[3]")
    WebElement All_Orders_Digital_Receipt_Subtotal_Amount;

    @AndroidFindBy(xpath = "//*[contains(@text,'Subtotal')]/..//android.widget.TextView[4]")
    WebElement All_Orders_Digital_Receipt_Subtotal_Amount_Refund;

    @AndroidFindBy(xpath = "//*[contains(@text,'Subtotal')]/..//android.widget.TextView[5]")
    WebElement All_Orders_Digital_Receipt_Tax;

    @AndroidFindBy(xpath = "//*[contains(@text,'Subtotal')]/..//android.widget.TextView[6]")
    WebElement All_Orders_Digital_Receipt_Tax_Amount_Refund;

    @AndroidFindBy(xpath = "//*[contains(@text,'Subtotal')]/..//android.widget.TextView[4]")
    WebElement All_Orders_Digital_Receipt_Total;

    @AndroidFindBy(xpath = "//*[contains(@text,'Check No')]/..//android.widget.TextView[5]")
    WebElement All_Orders_Digital_Receipt_Total_Amount;

    @AndroidFindBy(xpath = "//*[contains(@text,'Total Tax')]")
    WebElement All_Orders_Digital_Receipt_Total_Tax;

    @AndroidFindBy(xpath = "//*[contains(@text,'barcode')]/../../android.view.View[4]/android.widget.TextView")
    WebElement All_Orders_Digital_Receipt_BarCode;

    @AndroidFindBy(xpath = "//*[contains(@text,'Have a nice day, Visit us again')]")
    WebElement All_Orders_Digital_Receipt_VisitUsAgain;

    @AndroidFindBy(xpath = "//*[contains(@text,'Open calendar')]")
    WebElement All_Orders_Calendar_Icon;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'datepicker')]")
    WebElement All_Orders_Calendar_datePicker;

    @AndroidFindBy(xpath = "//*[contains(@text,'Choose month and year')]")
    WebElement All_Orders_Calendar_Month_Year;

    @AndroidFindBy(xpath = "//*[contains(@text,'Previous month')]")
    WebElement All_Orders_Calendar_PreviousMonth_Arrow;

    @AndroidFindBy(xpath = "//*[contains(@text,'Next month')]")
    WebElement All_Orders_Calendar_NextMonth_Arrow;

    @AndroidFindBy(xpath = "//*[contains(@text,'Sunday')]")
    WebElement All_Orders_Calendar_Sunday;

    @AndroidFindBy(xpath = "//*[contains(@text,'Monday')]")
    WebElement All_Orders_Calendar_Monday;

    @AndroidFindBy(xpath = "//*[contains(@text,'Tuesday')]")
    WebElement All_Orders_Calendar_Tuesday;

    @AndroidFindBy(xpath = "//*[contains(@text,'Wednesday')]")
    WebElement All_Orders_Calendar_Wednesday;

    @AndroidFindBy(xpath = "//*[contains(@text,'Thursday')]")
    WebElement All_Orders_Calendar_Thursday;

    @AndroidFindBy(xpath = "//*[contains(@text,'Friday')]")
    WebElement All_Orders_Calendar_Friday;

    @AndroidFindBy(xpath = "//*[contains(@text,'Saturday')]")
    WebElement All_Orders_Calendar_Saturday;

    @AndroidFindBy(xpath = "//*[contains(@text,'Select the Receipt Printer in Operations/Hardware Settings')]")
    WebElement All_Orders_Reprint_Popup_Text;

    @AndroidFindBy(xpath = "(//android.view.View/android.view.View[7]/android.widget.Button/../..)[1]")
    WebElement FirstCheck_InTheClosedTab;

    @AndroidFindBy(xpath = "(//android.view.View/android.view.View[9]/android.widget.Button/../..)[1]")
    WebElement FirstCheck_InTheRefundTab;

    public Sale_History_Page() throws Exception {
    }


    //  public WebElement getAll_Orders_Reprint_Popup_Text(){return All_Orders_Reprint_Popup_Text;}

    public WebElement getAll_Orders_Calendar_Icon(){return All_Orders_Calendar_Icon;}

    public WebElement getAll_Orders_Digital_Receipt_Grand_Total_Amount(){return All_Orders_Digital_Receipt_Grand_Total_Amount;}

    public WebElement getAll_Orders_Digital_Receipt_Back_Button() { return All_Orders_Digital_Receipt_Back_Button;}

    public WebElement getAll_Orders_All_Orders_Text() { return All_Orders_All_Orders_Text;}

    public WebElement getAll_Orders_Check_Status_Text(){return All_Orders_Check_Status_Text;}

    public WebElement getAll_Orders_Closed_Text(){return All_Orders_Closed_Text;}

    public WebElement getAll_Orders_Cashier_Column_Text() {return All_Orders_Cashier_Column_Text; }

    public WebElement getAll_Orders_Customer_Column_Text() { return All_Orders_Customer_Column_Text; }

    public WebElement getAll_Orders_Date_Column_Text() { return All_Orders_Date_Column_Text;}

    public WebElement getAll_Orders_Exchanged_Text() { return All_Orders_Exchanged_Text;}

    public WebElement getAll_Orders_Layaways_Text() { return All_Orders_Layaways_Text; }

    public WebElement getAll_Orders_Check_Total_Text() { return All_Orders_Check_Total_Text;}

    public WebElement getAll_Orders_Open_Check_Button() { return All_Orders_Open_Check_Button;}

    public WebElement getAll_Orders_Parked_Text() { return All_Orders_Parked_Text; }

    public WebElement getAll_Orders_Operation_Button() {return All_Orders_Operation_Button;}

    public WebElement getAll_Orders_Reasons_Column_Text() { return All_Orders_Reasons_Column_Text;}

    public WebElement getAll_Orders_Average_Duration_Text() {   return All_Orders_Average_Duration_Text;}

    public WebElement getAll_Orders_Pay_Check_Button() { return All_Orders_Pay_Check_Button; }

    public WebElement getAll_Orders_Print_Receipt_Button() { return All_Orders_Print_Receipt_Button; }

    public WebElement getAll_Orders_Receipt_No_Column_Text() {  return All_Orders_Receipt_No_Column_Text; }

    public WebElement getAll_Orders_Receipt_No_Text() {  return All_Orders_Receipt_No_Text; }

    public WebElement getAll_Orders_Customer_Text() { return All_Orders_Customer_Text; }

    public WebElement getAll_Orders_Refund_Total_Column_Text() { return All_Orders_Refund_Total_Column_Text; }

    public WebElement getAll_Orders_Average_Amount_Text() { return All_Orders_Average_Amount_Text; }

    public WebElement getAll_Orders_Refund_Type_Column_Text() {return All_Orders_Refund_Type_Column_Text; }

    public WebElement getAll_Orders_Refunded_Text() { return All_Orders_Refunded_Text; }

    public WebElement getAll_Orders_Reopen_Check_Button() { return All_Orders_Reopen_Check_Button;}

    public WebElement getAll_Orders_Return_Button() { return All_Orders_Return_Button; }

    public WebElement getAll_Orders_Search_Date_Text() {  return All_Orders_Search_Date_Text; }

    public WebElement getAll_Orders_RePrint_Check_Button() {return All_Orders_RePrint_Check_Button;}

    public WebElement getAll_Orders_Time_Column_Text() {  return All_Orders_Time_Column_Text; }

    public WebElement getAll_Orders_Server_Column_Text() { return All_Orders_Server_Column_Text;}

    public WebElement getAll_Orders_Total_Column_Text() { return All_Orders_Total_Column_Text;}

    public WebElement getAll_Orders_Transaction_Time_Column_Text() {  return All_Orders_Transaction_Time_Column_Text;}

    public WebElement getAll_Orders_Void_Text() {    return All_Orders_Void_Text;}

    public WebElement getAll_Orders_Closed_Tab_Active() {  return All_Orders_Closed_Tab_Active;  }

    public WebElement getAll_Orders_Exchanged_Tab_Active() {    return All_Orders_Exchanged_Tab_Active;  }

    public WebElement getAll_Orders_Layaways_Tab_Active() {return All_Orders_Layaways_Tab_Active; }

    public WebElement getAll_Orders_Parked_Tab_Active() {   return All_Orders_Parked_Tab_Active; }

    public WebElement getAll_Orders_Refunded_Tab_Active() { return All_Orders_Refunded_Tab_Active; }

    public WebElement getAll_Orders_Void_Active() {   return All_Orders_Void_Active; }

    public WebElement getAll_Orders_First_Digital_Receipt() { return All_Orders_First_Digital_Receipt; }

    public WebElement getAll_Orders_First_Digital_Receipt_Refund(){return All_Orders_First_Digital_Receipt_Refund;}

    public WebElement getAll_Orders_Digital_Receipt_Table_No() { return All_Orders_Digital_Receipt_Table_No;}

    public WebElement getAll_Orders_Digital_Receipt_Status(){return All_Orders_Digital_Receipt_Status;}

    public WebElement getAll_Orders_Digital_Receipt_Order_Summary() {  return All_Orders_Digital_Receipt_Order_Summary;}

    public WebElement getAll_Orders_Digital_Receipt_Tax_Summary() {  return All_Orders_Digital_Receipt_Tax_Summary;}

    public WebElement getAll_Orders_Digital_Receipt_Grand_Total() { return All_Orders_Digital_Receipt_Grand_Total;}

    public WebElement getAll_Orders_Digital_Receipt_Refund_Summary(){return All_Orders_Digital_Receipt_Refund_Summary; }

    public WebElement getAll_Orders_Digital_Receipt_Store_Name() {return All_Orders_Digital_Receipt_Store_Name;}

    public WebElement getAll_Orders_Digital_Receipt_BarCode() {return All_Orders_Digital_Receipt_BarCode;}

    public WebElement getAll_Orders_Digital_Receipt_Customer_Name() {return All_Orders_Digital_Receipt_Customer_Name;}

    public WebElement getAll_Orders_Digital_Receipt_Date_And_Time() {return All_Orders_Digital_Receipt_Date_And_Time;}

    public WebElement getAll_Orders_Digital_Receipt_Receipt_No_txt() {return All_Orders_Digital_Receipt_Receipt_No_txt;}

    public WebElement getAll_Orders_Digital_Receipt_Receipt_No() {return All_Orders_Digital_Receipt_Receipt_No;}

    public WebElement getAll_Orders_Digital_Receipt_Server() {return All_Orders_Digital_Receipt_Server;}

    public WebElement getAll_Orders_Digital_Receipt_Subtotal() {return All_Orders_Digital_Receipt_Subtotal;}

    public WebElement getAll_Orders_Digital_Receipt_Subtotal_Amount() {return All_Orders_Digital_Receipt_Subtotal_Amount;}

    public WebElement getAll_Orders_Digital_Receipt_Total() {return All_Orders_Digital_Receipt_Total;}

    public WebElement getAll_Orders_Digital_Receipt_Total_Amount() {return All_Orders_Digital_Receipt_Total_Amount;}

    public WebElement getAll_Orders_Digital_Receipt_Total_Tax() {return All_Orders_Digital_Receipt_Total_Tax;}

    public WebElement getAll_Orders_Digital_Receipt_VisitUsAgain() {return All_Orders_Digital_Receipt_VisitUsAgain;}

    public WebElement getAll_Orders_Digital_Receipt_Subtotal_Amount_Refund(){return All_Orders_Digital_Receipt_Subtotal_Amount_Refund;}

    public WebElement getAll_Orders_Digital_Receipt_Tax(){return All_Orders_Digital_Receipt_Tax;}

    public WebElement getAll_Orders_Digital_Receipt_Tax_Amount_Refund(){return All_Orders_Digital_Receipt_Tax_Amount_Refund;}

    public WebElement getAll_Orders_Digital_Receipt_ThisSaleIsRefunded(){return All_Orders_Digital_Receipt_ThisSaleIsRefunded;}

    public void verifyTheUserNavigateToTheRetailScreeOrNot(){
        try{
            new RetailPOS_Order_Page().Retail_OrderScreen_VoidBtn();
            test.log(LogStatus.PASS,"User Reach the Retail Order Screen after enter the valid pin screen");
        } catch (Throwable e) {
            test.log(LogStatus.FAIL,"User Reach not the Retail Order Screen after enter the valid pin screen");
        }
    }

    public void verifyTheCalendarIcon(){
        try{
            if(getAll_Orders_Calendar_Icon().isDisplayed()){
                test.log(LogStatus.PASS,"Calendar icon found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Calendar icon not found in the Receipt/Check Status Screen");
        }
    }

    public void verifyThisSaleIsRefunded(){
        try{
            if(getAll_Orders_Digital_Receipt_ThisSaleIsRefunded().isDisplayed()){
                test.log(LogStatus.PASS,"This Sale is Refunded text is available in the refunded receipt screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"This Sale is Refunded text is not available in the refunded receipt screen");
        }
    }

    public void verifyAll_Orders_All_Orders_Text(){
        try{
            if(getAll_Orders_All_Orders_Text().isDisplayed()){
                test.log(LogStatus.PASS,"All Orders Text found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"All Orders Text not found in the Receipt/Check Status Screen");
        }
    }

    public void verifyAll_Orders_Check_Status_Text(){
        try{
            if(getAll_Orders_Check_Status_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Check Status Text found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Check Status Text not found in the Receipt/Check Status Screen");
        }
    }

    public void verifyAll_Orders_Closed_Text(){
        try{
            if(getAll_Orders_Closed_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Closed Tab Text found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Closed Tab Text not found in the Receipt/Check Status Screen");
        }
    }

    public void verifyAll_Orders_Cashier_Column_Text(){
        try{
            if(getAll_Orders_Cashier_Column_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Cashier Column found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Cashier Column not found in the Receipt/Check Status Screen");
        }
    }

    public void verifyAll_Orders_Customer_Column_Text(){
        try{
            if(getAll_Orders_Customer_Column_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Customer Column found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Customer Column not found in the Receipt/Check Status Screen");
        }
    }

    public void verifyAll_Orders_Date_Column_Text(){
        try{
            if(getAll_Orders_Date_Column_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Date Column found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Date Column not found in the Receipt/Check Status Screen");
        }
    }

    public void verifyAll_Orders_Exchanged_Text(){
        try{
            if(getAll_Orders_Exchanged_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Exchanged Tab found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Exchanged Tab not found in the Receipt/Check Status Screen");
        }
    }

    public void clickTheExchangedTab(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click the exchanged tab
        click_Ele(getAll_Orders_Exchanged_Text());
    }

    public void verifyAll_Orders_Layaways_Text(){
        try{
            if(getAll_Orders_Layaways_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Layaways Tab found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Layaways Tab not found in the Receipt/Check Status Screen");
        }
    }

    public void verifyAll_Orders_Check_Total_Text(){
        try{
            if(getAll_Orders_Check_Total_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Check Total Text found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Check Total Text not found in the Receipt/Check Status Screen");
        }
    }

    public void verifyAll_Orders_Open_Check_Button(){
        try{
            if(getAll_Orders_Open_Check_Button().isDisplayed()){
                test.log(LogStatus.PASS,"Open Check button found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Open Check button not found in the Receipt/Check Status Screen");
        }
    }

    public void clickTheOpenCheckButton(){
        //Click the open check button
        click_Ele(getAll_Orders_Open_Check_Button());
    }

    public void verifyAll_Orders_Parked_Text(){
        try{
            if(getAll_Orders_Parked_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Parked Tab found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Parked Tab not found in the Receipt/Check Status Screen");
        }
    }

    public void clickTheParkedTab(){
        //Click the parked tab
        click_Ele(getAll_Orders_Parked_Text());
    }

    public void verifyAll_Orders_Operation_Button(){
        try{
            if(getAll_Orders_Operation_Button().isDisplayed()){
                test.log(LogStatus.PASS,"Operation button found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Operation button not found in the Receipt/Check Status Screen");
        }
    }

    public void clickTheOperationBtn(){
        //click the operation button
        getAll_Orders_Operation_Button().click();
    }

    public void verifyAll_Orders_Reasons_Column_Text(){
        try{
            if(getAll_Orders_Reasons_Column_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Reasons Column found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Reasons Column not found in the Receipt/Check Status Screen");
        }
    }

    public void verifyAll_Orders_Average_Duration_Text(){
        try{
            if(getAll_Orders_Average_Duration_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Average Duration text found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Average Duration text not found in the Receipt/Check Status Screen");
        }
    }

    public void verifyAll_Orders_Pay_Check_Button(){
        try{
            if(getAll_Orders_Pay_Check_Button().isDisplayed()){
                test.log(LogStatus.PASS,"Pay Check button found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Pay Check button not found in the Receipt/Check Status Screen");
        }
    }

    public void clickThePayCheckButton(){
        //Click the pay check button
        click_Ele(getAll_Orders_Pay_Check_Button());
    }

    public void verifyAll_Orders_Print_Receipt_Button(){
        try{
            if(getAll_Orders_Print_Receipt_Button().isDisplayed()){
                test.log(LogStatus.PASS,"Print Receipt button found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Print Receipt button not found in the Receipt/Check Status Screen");
        }
    }

    public void verifyAll_Orders_Receipt_No_Column_Text(){
        try{
            if(getAll_Orders_Receipt_No_Column_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Receipt Number Column found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Receipt Number Column not found in the Receipt/Check Status Screen");
        }
    }

    public void verifyAll_Orders_Receipt_No_Text(){
        try{
            if(getAll_Orders_Receipt_No_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Receipt Number Text found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Receipt Number Text not found in the Receipt/Check Status Screen");
        }
    }

    public void verifyAll_Orders_Customer_Text(){
        try{
            if(getAll_Orders_Customer_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Customer Text found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Customer Text not found in the Receipt/Check Status Screen");
        }
    }

    public void verifyAll_Orders_Refund_Total_Column_Text(){
        try{
            if(getAll_Orders_Refund_Total_Column_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Refund Total Column found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Refund Total Column not found in the Receipt/Check Status Screen");
        }
    }
    public void verifyAll_Orders_Average_Amount_Text(){
        try{
            if(getAll_Orders_Average_Amount_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Average Amount found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Average Amount not found in the Receipt/Check Status Screen");
        }
    }

    public void verifyAll_Orders_Refund_Type_Column_Text(){
        try{
            if(getAll_Orders_Refund_Type_Column_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Refund Type Column found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Refund Type Column not found in the Receipt/Check Status Screen");
        }
    }

    public void verifyAll_Orders_Refunded_Text(){
        try{
            if(getAll_Orders_Refunded_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Refunded tab found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Refunded tab not found in the Receipt/Check Status Screen");
        }
    }

    public void clickTheRefundedTab(){
        //click the refunded tab
        click_Ele(getAll_Orders_Refunded_Text());
    }

    public void verifyAll_Orders_Reopen_Check_Button(){
        try{
            if(getAll_Orders_Reopen_Check_Button().isDisplayed()){
                test.log(LogStatus.PASS,"Reopen Check button found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Reopen Check button not found in the Receipt/Check Status Screen");
        }
    }

    public void verifyAll_Orders_Return_Button(){
        try{
            if(getAll_Orders_Return_Button().isDisplayed()){
                test.log(LogStatus.PASS,"Return button found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Return button not found in the Receipt/Check Status Screen");
        }
    }

    public void verifyAll_Orders_Search_Date_Text(){
        try{
            if(getAll_Orders_Search_Date_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Search field found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Search field not found in the Receipt/Check Status Screen");
        }
    }

    public void verifyAll_Orders_RePrint_Check_Button(){
        try{
            if(getAll_Orders_RePrint_Check_Button().isDisplayed()){
                test.log(LogStatus.PASS,"Reprint check button found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Reprint check button not found in the Receipt/Check Status Screen");
        }
    }

    public void verifyAll_Orders_Time_Column_Text(){
        try{
            if(getAll_Orders_Time_Column_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Time Column found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Time Column not found in the Receipt/Check Status Screen");
        }
    }
    public void verifyAll_Orders_Server_Column_Text(){
        try{
            if(getAll_Orders_Server_Column_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Server Column found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Server Column not found in the Receipt/Check Status Screen");
        }
    }

    public void verifyAll_Orders_Total_Column_Text(){
        try{
            if(getAll_Orders_Total_Column_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Total Column found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Total Column not found in the Receipt/Check Status Screen");
        }
    }

    public void verifyAll_Orders_Transaction_Time_Column_Text(){
        try{
            if(getAll_Orders_Transaction_Time_Column_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Transaction Time Column found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Transaction Time Column button not found in the Receipt/Check Status Screen");
        }
    }

    public void verifyAll_Orders_Void_Text(){
        try{
            if(getAll_Orders_Void_Text().isDisplayed()){
                test.log(LogStatus.PASS,"Void text found in the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Void text not found in the Receipt/Check Status Screen");
        }
    }

    public void clickTheVoidTab() throws InterruptedException {
        //click the void tab
        getAll_Orders_Void_Text().click();
        Thread.sleep(1000);
    }

    public void verifyAll_Orders_Closed_Tab_Active(){
        try{driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            if(getAll_Orders_Closed_Tab_Active().isDisplayed()){
                test.log(LogStatus.PASS,"Closed Tab is active when user reach the Receipt/Check Status Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Closed Tab is not  active when user reach the Receipt/Check Status Screen");
        }
    }

    public void verifyAll_Orders_Exchanged_Tab_Active(){
        try{driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            if(getAll_Orders_Exchanged_Tab_Active().isDisplayed()){
                test.log(LogStatus.PASS,"Exchanged Tab is active when user click the Exchanged Tab");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Exchanged Tab is active when user click the Exchanged Tab");
        }
    }

    public void clickLayAwaysTab(){
        //click the lay away tab
        click_Ele(getAll_Orders_Layaways_Text());
    }

    public void verifyAll_Orders_Layaways_Tab_Active(){
        try{driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            if(getAll_Orders_Layaways_Tab_Active().isDisplayed()){
                test.log(LogStatus.PASS,"Layaways Tab is active when user click the Layaways Tab");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Layaways Tab is active when user click the Layaways Tab");
        }
    }

    public void verifyAll_Orders_Parked_Tab_Active(){
        try{driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            if(getAll_Orders_Parked_Tab_Active().isDisplayed()){
                test.log(LogStatus.PASS,"Parked Tab is active when user click the Parked Tab");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Parked Tab is active when user click the Parked Tab");
        }
    }

    public void verifyAll_Orders_Void_Active(){
        try{driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            if(getAll_Orders_Void_Active().isDisplayed()){
                test.log(LogStatus.PASS,"Void Tab is active when user click the Void Tab");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Void Tab is active when user click the Void Tab");
        }
    }

    public void verifyAll_Orders_Refunded_Tab_Active(){
        try{driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            if(getAll_Orders_Refunded_Tab_Active().isDisplayed()){
                test.log(LogStatus.PASS,"Refunded Tab is active when user click the Refunded Tab");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Refunded Tab is active when user click the Refunded Tab");
        }
    }

    public String getTheCurrentTime(){
        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Define the desired format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        // Format the current time
        return currentTime.format(formatter);
    }

    public String getCurrentDateAndTime(){
        // Get the current date and time
        Date currentDate = new Date();

        // Define the desired date and time format
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy hh:mm a");

        // Format the date and time
       return dateFormat.format(currentDate);
    }

    public String getTheCurrentDate(){
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define the desired format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

        // Format the current date
        return currentDate.format(formatter);
    }

    public void ClickTheDigitalReceiptBtn() throws InterruptedException {
        Thread.sleep(1500);
        //Click the digital receipt button
        getAll_Orders_First_Digital_Receipt().click();

        Thread.sleep(500);
    }

    public void ClickTheDigitalReceiptBtn_Refund() throws InterruptedException {
        // click the digital receipt button
        getAll_Orders_First_Digital_Receipt_Refund().click();
        Thread.sleep(1500);
    }

    public void clickTheReprintCheck(){
        //click the reprint check
        getAll_Orders_RePrint_Check_Button().click();

       try{
           text_Confirm_without_Screenshot(All_Orders_Reprint_Popup_Text,"Select the Receipt Printer in Operations/Hardware Settings");
       }catch (Exception e){
           test.log(LogStatus.FAIL,"Select the Receipt Printer in Operations/Hardware Settings notification is not displayed when user click the Reprint button");
       }

    }

    public void clickTheCalendarIcon(){
        //click the calendar icon
        getAll_Orders_Calendar_Icon().click();
    }

    public void verifyAll_Orders_Digital_Receipt_Table_No(){
        try{
            if(getAll_Orders_Digital_Receipt_Table_No().isDisplayed()){
                test.log(LogStatus.PASS,"Table number field is available when user click the Digital Receipt Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Table number field is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyAll_Orders_Digital_Receipt_Status(){
        try{
            if(getAll_Orders_Digital_Receipt_Status().isDisplayed()){
                test.log(LogStatus.PASS,"Status field is available when user click the Digital Receipt Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Status field is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyAll_Orders_Digital_Receipt_Order_Summary(){
        try{
            if(getAll_Orders_Digital_Receipt_Order_Summary().isDisplayed()){
                test.log(LogStatus.PASS,"Order Summary field is available when user click the Digital Receipt Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Order Summary field is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyAll_Orders_Digital_Receipt_Refund_Summary(){
        try{
            if(getAll_Orders_Digital_Receipt_Refund_Summary().isDisplayed()){
                test.log(LogStatus.PASS,"Refund Summary field is available when user click the Digital Receipt Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Refund Summary field is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyAll_Orders_Digital_Receipt_Tax_Summary(){
        try{
            if(getAll_Orders_Digital_Receipt_Tax_Summary().isDisplayed()){
                test.log(LogStatus.PASS,"Tax Summary field is available when user click the Digital Receipt Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Tax Summary field is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyAll_Orders_Digital_Receipt_Grand_Total(){
        try{
            if(getAll_Orders_Digital_Receipt_Grand_Total().isDisplayed()){
                test.log(LogStatus.PASS,"Grand Total field is available when user click the Digital Receipt Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Grand Total field is not available when user click the Digital Receipt Screen");
        }
    }

    public void clickTheBackButtonFromDigitalReceiptScreen(){
        //click the back button
        All_Orders_Digital_Receipt_Back_Button.click();
    }

    public void verifyAll_Orders_Digital_Receipt_Back_Button(){
        try{
            if(getAll_Orders_Digital_Receipt_Back_Button().isDisplayed()){
                test.log(LogStatus.PASS,"Back button is available when user click the Digital Receipt Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Back button is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyAll_Orders_Digital_Receipt_Store_Name(){
        try{
            if(getAll_Orders_Digital_Receipt_Store_Name().isDisplayed()){
                test.log(LogStatus.PASS,"Store name is available when user click the Digital Receipt Screen");

                if(getAll_Orders_Digital_Receipt_Store_Name().getText().equals(Utility.getProperty("Store_Name"))){
                    test.log(LogStatus.PASS,"The Correct Store name is displayed in the digital receipt");
                }
                else{
                    test.log(LogStatus.FAIL,"Displayed Store name is wrong");
                    ut.FailedCaptureScreenshotAsBASE64(driver,test);
                }
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Store name is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyAll_Orders_Digital_Receipt_BarCode(String check){
        try{
            if(getAll_Orders_Digital_Receipt_BarCode().isDisplayed()){
                test.log(LogStatus.PASS,"Barcode is available when user click the Digital Receipt Screen");

                String s1 = check.substring(0,1);
                String s2 = check.substring(2,check.length());

                // Get the current date
                LocalDate currentDate = LocalDate.now();

                // Define the desired format
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyy");

                // Format the current date
                String formattedDate = currentDate.format(formatter);

                String temp = s1.concat(formattedDate).concat(s2);

                if(getAll_Orders_Digital_Receipt_BarCode().getText().contains(temp)){
                    test.log(LogStatus.PASS,"The correct barcode details are displayed");
                }else{
                    test.log(LogStatus.FAIL,"Wrong barcode details are displayed");
                }
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Barcode is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyAll_Orders_Digital_Receipt_Customer_Name(){
        try{
            if(getAll_Orders_Digital_Receipt_Customer_Name().isDisplayed()){
                test.log(LogStatus.PASS,"Customer Name is available when user click the Digital Receipt Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Customer Name is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyAll_Orders_Digital_Receipt_Date_And_Time(){
        try{
            if(getAll_Orders_Digital_Receipt_Date_And_Time().isDisplayed()){
                test.log(LogStatus.PASS,"Date and time is available when user click the Digital Receipt Screen");

                if(getAll_Orders_Digital_Receipt_Date_And_Time().getText().equals(getTheCurrentDate())){
                    test.log(LogStatus.PASS,"The Correct date is displayed in the digital receipt");
                }
                else{
                    test.log(LogStatus.FAIL,"Displayed date is wrong");
                    ut.FailedCaptureScreenshotAsBASE64(driver,test);
                }

            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Date and time is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyAll_Orders_Digital_Receipt_Date_And_Time1(String time){
        try{
            if(getAll_Orders_Digital_Receipt_Date_And_Time().isDisplayed()){
                test.log(LogStatus.PASS,"Date and time is available when user click the Digital Receipt Screen");

                if(getAll_Orders_Digital_Receipt_Date_And_Time().getText().equals(time)){
                    test.log(LogStatus.PASS,"The Correct date is displayed in the digital receipt");
                }
                else{
                    test.log(LogStatus.FAIL,"Displayed date is wrong");
                    ut.FailedCaptureScreenshotAsBASE64(driver,test);
                }

            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Date and time is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyAll_Orders_Digital_Receipt_Receipt_No(String checkNumber){
        try{
            if(getAll_Orders_Digital_Receipt_Receipt_No_txt().isDisplayed()){
                test.log(LogStatus.PASS,"Back button is available when user click the Digital Receipt Screen");

                if(getAll_Orders_Digital_Receipt_Receipt_No().getText().equals(checkNumber)){
                    test.log(LogStatus.PASS,"The Correct check number is displayed in the digital receipt");
                }
                else{
                    test.log(LogStatus.FAIL,"Displayed check number is wrong");
                    ut.FailedCaptureScreenshotAsBASE64(driver,test);
                }

            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Back button is not available when user click the Digital Receipt Screen");
        }
    }
    public void verifyAll_Orders_Digital_Receipt_Server(){
        try{
            String sa = getAll_Orders_Digital_Receipt_Server().getText();
            sa = sa.concat(Utility.getProperty("Cashier"));
            if(getAll_Orders_Digital_Receipt_Server().isDisplayed()){
                test.log(LogStatus.PASS,"Server is available when user click the Digital Receipt Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Server is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyAll_Orders_Digital_Receipt_Subtotal(String subtotal){
        try{
            if(getAll_Orders_Digital_Receipt_Subtotal().isDisplayed()){
                test.log(LogStatus.PASS,"Subtotal is available when user click the Digital Receipt Screen");
                if(getAll_Orders_Digital_Receipt_Subtotal_Amount().getText().equals(subtotal)){
                    test.log(LogStatus.PASS,"The Correct Subtotal is displayed in the digital receipt");
                }
                else{
                    test.log(LogStatus.FAIL,"Displayed subtotal is wrong");
                    ut.FailedCaptureScreenshotAsBASE64(driver,test);
                }

            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Subtotal is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyAll_Orders_Digital_Receipt_Total(String total){
        try{
            if(getAll_Orders_Digital_Receipt_Total().isDisplayed()){
                test.log(LogStatus.PASS,"Total is available when user click the Digital Receipt Screen");

                if(getAll_Orders_Digital_Receipt_Total_Amount().getText().equals(total)){
                    test.log(LogStatus.PASS,"The Correct total is displayed in the digital receipt");
                }
                else{
                    test.log(LogStatus.FAIL,"Displayed total is wrong");
                    ut.FailedCaptureScreenshotAsBASE64(driver,test);
                }
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Total is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyAll_Orders_Digital_Receipt_GrandTotal(String total){
        try{
            if(getAll_Orders_Digital_Receipt_Grand_Total().isDisplayed()){
                test.log(LogStatus.PASS,"Grand Total is available when user click the Digital Receipt Screen");

                if(getAll_Orders_Digital_Receipt_Grand_Total_Amount().getText().equals(total)){
                    test.log(LogStatus.PASS,"The Correct grand total is displayed in the digital receipt");
                }
                else{
                    test.log(LogStatus.FAIL,"Displayed grand total is wrong");
                    ut.FailedCaptureScreenshotAsBASE64(driver,test);
                }
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Grand Total is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyAll_Orders_Digital_Receipt_GrandTotal_Refund(String total){
        try{
            if(getAll_Orders_Digital_Receipt_Grand_Total().isDisplayed()){
                test.log(LogStatus.PASS,"Grand Total is available when user click the Digital Receipt Screen");

                String tot = getAll_Orders_Digital_Receipt_Grand_Total_Amount().getText();
                char t = tot.charAt(0);
                if(t == '-'){
                    test.log(LogStatus.INFO,"'-' symbol is available before the grand total in refunded receipt");
                    tot = tot.replaceAll("-","");
                }else{
                    test.log(LogStatus.FAIL,"'-' symbol is not available before the grand total in refunded receipt");
                }


                if(tot.equals(total)){
                    test.log(LogStatus.PASS,"The Correct grand total is displayed in the digital receipt");
                }
                else{
                    test.log(LogStatus.FAIL,"Displayed grand total is wrong");
                    ut.FailedCaptureScreenshotAsBASE64(driver,test);
                }
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Grand Total is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyAll_Orders_Digital_Receipt_Total_Tax(){
        try{
            if(getAll_Orders_Digital_Receipt_Total_Tax().isDisplayed()){
                test.log(LogStatus.PASS,"Total Tax is available when user click the Digital Receipt Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Total Tax is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyAll_Orders_Digital_Receipt_VisitUsAgain(){
        try{
            if(getAll_Orders_Digital_Receipt_VisitUsAgain().isDisplayed()){
                test.log(LogStatus.PASS,"Have a nice day, Visit us again text is available when user click the Digital Receipt Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Have a nice day, Visit us again text is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyTheTotalTaxValue(String tax){
        List<?> s = driver.findElements(By.xpath("//*[contains(@text,'Total Tax')]/../../..//android.view.View/android.widget.TextView"));

        int sa = s.size();
        int saq = sa -  6;
        try{
            if(driver.findElement(By.xpath("(//*[contains(@text,'Total Tax')]/../../..//android.view.View/android.widget.TextView)["+saq+"]")).isDisplayed()){
                test.log(LogStatus.PASS,"Total tax amount is available when user click the Digital Receipt Screen");

                if(driver.findElement(By.xpath("(//*[contains(@text,'Total Tax')]/../../..//android.view.View/android.widget.TextView)["+saq+"]")).getText().equals(tax)){
                    test.log(LogStatus.PASS,"The Correct total tax is displayed in the digital receipt");
                }
                else{
                    test.log(LogStatus.FAIL,"Displayed total tax is wrong");
                    ut.FailedCaptureScreenshotAsBASE64(driver,test);
                }
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Total tax amount is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyTheGratuityText(){
        List<?> s = driver.findElements(By.xpath("//*[contains(@text,'Total Tax')]/../../..//android.view.View/android.widget.TextView"));

        int sa = s.size();
        int saq = sa -  5;
        try{
            if(driver.findElement(By.xpath("(//*[contains(@text,'Total Tax')]/../../..//android.view.View/android.widget.TextView)["+saq+"]")).isDisplayed()){
                test.log(LogStatus.PASS,"Gratuity text is available when user click the Digital Receipt Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Gratuity text is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyTheGratuityValue(String tax){
        List<?> s = driver.findElements(By.xpath("//*[contains(@text,'Total Tax')]/../../..//android.view.View/android.widget.TextView"));

        int sa = s.size();
        int saq = sa -  4;
        try{
            if(driver.findElement(By.xpath("(//*[contains(@text,'Total Tax')]/../../..//android.view.View/android.widget.TextView)["+saq+"]")).isDisplayed()){
                test.log(LogStatus.PASS,"Gratuity amount is available when user click the Digital Receipt Screen");

                if(driver.findElement(By.xpath("(//*[contains(@text,'Total Tax')]/../../..//android.view.View/android.widget.TextView)["+saq+"]")).getText().equals(tax)){
                    test.log(LogStatus.PASS,"The Correct Gratuity is displayed in the digital receipt");
                }
                else{
                    test.log(LogStatus.FAIL,"Displayed Gratuity is wrong");
                    ut.FailedCaptureScreenshotAsBASE64(driver,test);
                }
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Gratuity amount is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyTheDiscountText(){
        List<?> s = driver.findElements(By.xpath("//*[contains(@text,'Total Tax')]/../../..//android.view.View/android.widget.TextView"));

        int sa = s.size();
        int saq = sa - 3;
        try{
            if(driver.findElement(By.xpath("(//*[contains(@text,'Total Tax')]/../../..//android.view.View/android.widget.TextView)["+saq+"]")).isDisplayed()){
                test.log(LogStatus.PASS,"Discount text is available when user click the Digital Receipt Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Discount text is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyTheDiscountValue(String discount){
        List<?> s = driver.findElements(By.xpath("//*[contains(@text,'Total Tax')]/../../..//android.view.View/android.widget.TextView"));

        int sa = s.size();
        int saq = sa -  2;
        try{
            if(driver.findElement(By.xpath("(//*[contains(@text,'Total Tax')]/../../..//android.view.View/android.widget.TextView)["+saq+"]")).isDisplayed()){
                test.log(LogStatus.PASS,"Discount amount is available when user click the Digital Receipt Screen");

                if(driver.findElement(By.xpath("(//*[contains(@text,'Total Tax')]/../../..//android.view.View/android.widget.TextView)["+saq+"]")).getText().equals(discount)){
                    test.log(LogStatus.PASS,"The Correct Discount is displayed in the digital receipt");
                }
                else{
                    test.log(LogStatus.FAIL,"Displayed Discount is wrong");
                    ut.FailedCaptureScreenshotAsBASE64(driver,test);
                }
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Discount amount is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyTheServiceChargeText(){
        List<?> s = driver.findElements(By.xpath("//*[contains(@text,'Total Tax')]/../../..//android.view.View/android.widget.TextView"));

        int sa = s.size();
        int saq = sa - 1;
        try{
            if(driver.findElement(By.xpath("(//*[contains(@text,'Total Tax')]/../../..//android.view.View/android.widget.TextView)["+saq+"]")).isDisplayed()){
                test.log(LogStatus.PASS,"Service Charge text is available when user click the Digital Receipt Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Service Charge text is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyTheServiceChargeValue(String ServiceCharge){
        List<?> s = driver.findElements(By.xpath("//*[contains(@text,'Total Tax')]/../../..//android.view.View/android.widget.TextView"));

        int sa = s.size();
        try{
            if(driver.findElement(By.xpath("(//*[contains(@text,'Total Tax')]/../../..//android.view.View/android.widget.TextView)["+sa+"]")).isDisplayed()){
                test.log(LogStatus.PASS,"Service Charge amount is available when user click the Digital Receipt Screen");

                if(driver.findElement(By.xpath("(//*[contains(@text,'Total Tax')]/../../..//android.view.View/android.widget.TextView)["+sa+"]")).getText().equals(ServiceCharge)){
                    test.log(LogStatus.PASS,"The Correct Service Charge is displayed in the digital receipt");
                }
                else{
                    test.log(LogStatus.FAIL,"Displayed Service Charge is wrong");
                    ut.FailedCaptureScreenshotAsBASE64(driver,test);
                }
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Service Charge amount is not available when user click the Digital Receipt Screen");
        }
    }



    public String getTheRetailItems_FromDigitalReceiptScreen(){

        List<?> s = driver.findElements(By.xpath("//*[@resource-id='background-content']/../android.view.View/android.view.View/android.widget.TextView"));

        int sa = s.size();
        int saq = sa - 8;

        List<String> menus = new ArrayList<>();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= saq; i = i+3) {

            String menu = driver.findElement(By.xpath("(//*[@resource-id='background-content']/../android.view.View/android.view.View/android.widget.TextView)["+i+"]")).getText();

            menus.add(menu);
        }

        return menus.toString();
    }

    public String getTheQuantityOfRetailItems_FromDigitalReceiptScreen(){

        List<?> s = driver.findElements(By.xpath("//*[@resource-id='background-content']/../android.view.View/android.view.View/android.widget.TextView"));

        int sa = s.size();
        int saq = sa - 8;

        List<String> q = new ArrayList<>();

        // for loop for clicking on every time in the list
        for (int i = 2; i <= saq; i = i+3) {

            String qa = driver.findElement(By.xpath("(//*[@resource-id='background-content']/../android.view.View/android.view.View/android.widget.TextView)["+i+"]")).getText();
            q.add(qa);
        }

        return q.toString();
    }

    public String getTheTotalOfRetailItems_FromDigitalReceiptScreen(){

        List<?> s = driver.findElements(By.xpath("//*[@resource-id='background-content']/../android.view.View/android.view.View/android.widget.TextView"));

        int sa = s.size();
        int saq = sa - 8;

        List<String> tot = new ArrayList<>();


        // for loop for clicking on every time in the list
        for (int i = 3; i <= saq; i = i+3) {

            String total = driver.findElement(By.xpath("(//*[@resource-id='background-content']/../android.view.View/android.view.View/android.widget.TextView)["+i+"]")).getText();
            tot.add(total);
        }

        return tot.toString();
    }

    public String getTheRetailItems_FromDigitalReceiptScreen_Void(){

        List<?> s = driver.findElements(By.xpath("//*[@resource-id='background-content']/../android.view.View/android.view.View/android.widget.TextView"));

        int sa = s.size();
        int saq = sa - 8;

        List<String> menus = new ArrayList<>();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= saq; i = i+4) {

            String menu = driver.findElement(By.xpath("(//*[@resource-id='background-content']/../android.view.View/android.view.View/android.widget.TextView)["+i+"]")).getText();

            menus.add(menu);
        }

        return menus.toString();
    }

    public String getTheQuantityOfRetailItems_FromDigitalReceiptScreen_Void(){

        List<?> s = driver.findElements(By.xpath("//*[@resource-id='background-content']/../android.view.View/android.view.View/android.widget.TextView"));

        int sa = s.size();
        int saq = sa - 8;

        List<String> q = new ArrayList<>();

        // for loop for clicking on every time in the list
        for (int i = 2; i <= saq; i = i+4) {

            String qa = driver.findElement(By.xpath("(//*[@resource-id='background-content']/../android.view.View/android.view.View/android.widget.TextView)["+i+"]")).getText();
            q.add(qa);
        }

        return q.toString();
    }

    public String getTheTotalOfRetailItems_FromDigitalReceiptScreen_Void(){

        List<?> s = driver.findElements(By.xpath("//*[@resource-id='background-content']/../android.view.View/android.view.View/android.widget.TextView"));

        int sa = s.size();
        int saq = sa - 8;

        List<String> tot = new ArrayList<>();


        // for loop for clicking on every time in the list
        for (int i = 3; i <= saq; i = i+4) {

            String total = driver.findElement(By.xpath("(//*[@resource-id='background-content']/../android.view.View/android.view.View/android.widget.TextView)["+i+"]")).getText();
            tot.add(total);
        }

        return tot.toString();
    }

    public String getTheRetailItems_FromDigitalReceiptScreen_Refund(){

        List<?> s = driver.findElements(By.xpath("//*[@resource-id='background-content']/../android.view.View/android.view.View/android.widget.TextView"));

        int saq = s.size();

        List<String> menus = new ArrayList<>();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= saq; i = i+3) {

            String menu = driver.findElement(By.xpath("(//*[@resource-id='background-content']/../android.view.View/android.view.View/android.widget.TextView)["+i+"]")).getText();

            menus.add(menu);
        }

        return menus.toString();
    }

    public String getTheQuantityOfRetailItems_FromDigitalReceiptScreen_Refund(){

        List<?> s = driver.findElements(By.xpath("//*[@resource-id='background-content']/../android.view.View/android.view.View/android.widget.TextView"));

        int saq = s.size();

        List<String> q = new ArrayList<>();

        // for loop for clicking on every time in the list
        for (int i = 2; i <= saq; i = i+3) {

            String qa = driver.findElement(By.xpath("(//*[@resource-id='background-content']/../android.view.View/android.view.View/android.widget.TextView)["+i+"]")).getText();

            char t = qa.charAt(0);
            if(t == '-'){
                test.log(LogStatus.INFO,"'-' symbol is available before the quantity in refunded receipt");
                qa = qa.replaceAll("-","");
            }else{
                test.log(LogStatus.FAIL,"'-' symbol is not available before the quantity in refunded receipt");
            }

            q.add(qa);
        }

        return q.toString();
    }

    public String getTheTotalOfRetailItems_FromDigitalReceiptScreen_Refund(){

        List<?> s = driver.findElements(By.xpath("//*[@resource-id='background-content']/../android.view.View/android.view.View/android.widget.TextView"));

        int saq = s.size();

        List<String> tot = new ArrayList<>();


        // for loop for clicking on every time in the list
        for (int i = 3; i <= saq; i = i+3) {

            String total = driver.findElement(By.xpath("(//*[@resource-id='background-content']/../android.view.View/android.view.View/android.widget.TextView)["+i+"]")).getText();
            char t = total.charAt(0);
            if(t == '-'){
                test.log(LogStatus.INFO,"'-' symbol is available before the total in refunded receipt");
                total = total.replaceAll("-","");
            }else{
                test.log(LogStatus.FAIL,"'-' symbol is not available before the total in refunded receipt");
            }
            tot.add(total);
        }

        return tot.toString();
    }

    public void verifyTheRetailItemQuantityAndTotalInRetailScreenAndReceiptScreen(String menu, String quan,String tot){
        String actMenu = getTheRetailItems_FromDigitalReceiptScreen();
        String actQuan = getTheQuantityOfRetailItems_FromDigitalReceiptScreen();
        String actTot = getTheTotalOfRetailItems_FromDigitalReceiptScreen();

        if (actMenu.contains(menu)){
            test.log(LogStatus.PASS,"Menu Items from retail screen and receipt screen are same");
        }else{
            test.log(LogStatus.FAIL,"Menu Items from retail screen and receipt screen are not same");
        }

        if (actQuan.contains(quan)){
            test.log(LogStatus.PASS,"Menu Item's Quantity from retail screen and receipt screen are same");
        }else{
            test.log(LogStatus.FAIL,"Menu Item's Quantity from retail screen and receipt screen are not same");
        }

        if (actTot.contains(tot)){
            test.log(LogStatus.PASS,"Menu Item's Total from retail screen and receipt screen are same");
        }else{
            test.log(LogStatus.FAIL,"Menu Item's Total from retail screen and receipt screen are not same");
        }
    }

    public void verifyTheRetailItemsInRetailScreenAndReceiptScreen(String menu){
        String actMenu = getTheRetailItems_FromDigitalReceiptScreen();

        if (actMenu.contains(menu)){
            test.log(LogStatus.PASS,"Menu Items from retail screen are same");
        }else{
            test.log(LogStatus.FAIL,"Menu Items from retail screen are not same");
        }
    }

    public void verifyTheRetailItemQuantityAndTotalInRetailScreenAndReceiptScreen1(String menu, String quan,String tot){
        String actMenu = getTheRetailItems_FromDigitalReceiptScreen_Void();
        String actQuan = getTheQuantityOfRetailItems_FromDigitalReceiptScreen_Void();
        String actTot = getTheTotalOfRetailItems_FromDigitalReceiptScreen_Void();

        if (actMenu.contains(menu)){
            test.log(LogStatus.PASS,"Menu Items from retail screen and receipt screen are same");
        }else{
            test.log(LogStatus.FAIL,"Menu Items from retail screen and receipt screen are not same");
        }

        if (actQuan.contains(quan)){
            test.log(LogStatus.PASS,"Menu Item's Quantity from retail screen and receipt screen are same");
        }else{
            test.log(LogStatus.FAIL,"Menu Item's Quantity from retail screen and receipt screen are not same");
        }

        if (actTot.contains(tot)){
            test.log(LogStatus.PASS,"Menu Item's Total from retail screen and receipt screen are same");
        }else{
            test.log(LogStatus.FAIL,"Menu Item's Total from retail screen and receipt screen are not same");
        }
    }

    public void verifyTheRetailItemQuantityAndTotalInRetailScreenAndReceiptScreen2(String menu, String quan,String tot){
        String actMenu = getTheRetailItems_FromDigitalReceiptScreen_Refund();
        String actQuan = getTheQuantityOfRetailItems_FromDigitalReceiptScreen_Refund();
        String actTot = getTheTotalOfRetailItems_FromDigitalReceiptScreen_Refund();

        if (actMenu.contains(menu)){
            test.log(LogStatus.PASS,"Menu Items from retail screen and receipt screen are same");
        }else{
            test.log(LogStatus.FAIL,"Menu Items from retail screen and receipt screen are not same");
        }

        if (actQuan.contains(quan)){
            test.log(LogStatus.PASS,"Menu Item's Quantity from retail screen and receipt screen are same");
        }else{
            test.log(LogStatus.FAIL,"Menu Item's Quantity from retail screen and receipt screen are not same");
        }

        if (actTot.contains(tot)){
            test.log(LogStatus.PASS,"Menu Item's Total from retail screen and receipt screen are same");
        }else{
            test.log(LogStatus.FAIL,"Menu Item's Total from retail screen and receipt screen are not same");
        }
    }

    public void verifyTheRetailItemQuantityAndTotalInRetailScreenAndAfterReopenRetailScreen1(String menu, String quan,String tot){
        String actMenu = getTheRetailItems_FromRetailScreen();
        String actQuan = getTheQuantityOfRetailItems_FromRetailScreen().replaceAll("-","");
        String actTot = getTheTotalOfRetailItems_FromRetailScreen().replaceAll("-","");

        if (actMenu.contains(menu)){
            test.log(LogStatus.FAIL,"Menu Items from retail screen and reopen/return to retail screen are same");
        }else{
            test.log(LogStatus.PASS,"Menu Items from retail screen and reopen/return to retail screen are not same");
        }

        if (actQuan.contains(quan)){
            test.log(LogStatus.FAIL,"Menu Item's Quantity from retail screen and reopen/return to retail screen are same");
        }else{
            test.log(LogStatus.PASS,"Menu Item's Quantity from retail screen and reopen/return to retail screen are not same");
        }

        if (actTot.contains(tot)){
            test.log(LogStatus.FAIL,"Menu Item's Total from retail screen and reopen/return to retail screen are same");
        }else{
            test.log(LogStatus.PASS,"Menu Item's Total from retail screen and reopen/return to retail screen are not same");
        }
    }

    public void verifyTheRetailItemQuantityAndTotalInRetailScreenAndAfterReopenRetailScreen(String menu, String quan,String tot){
        String actMenu = getTheRetailItems_FromRetailScreen();
        String actQuan = getTheQuantityOfRetailItems_FromRetailScreen().replaceAll("-","");
        String actTot = getTheTotalOfRetailItems_FromRetailScreen().replaceAll("-","");

        if (actMenu.contains(menu)){
            test.log(LogStatus.PASS,"Menu Items from retail screen and reopen/return to retail screen are same");
        }else{
            test.log(LogStatus.FAIL,"Menu Items from retail screen and reopen/return to retail screen are not same");
        }

        if (actQuan.contains(quan)){
            test.log(LogStatus.PASS,"Menu Item's Quantity from retail screen and reopen/return to retail screen are same");
        }else{
            test.log(LogStatus.FAIL,"Menu Item's Quantity from retail screen and reopen/return to retail screen are not same");
        }

        if (actTot.contains(tot)){
            test.log(LogStatus.PASS,"Menu Item's Total from retail screen and reopen/return to retail screen are same");
        }else{
            test.log(LogStatus.FAIL,"Menu Item's Total from retail screen and reopen/return to retail screen are not same");
        }
    }

    public void verifyTheDatePicker(){
        //check the date picker is displayed or not
        try{
            if(All_Orders_Calendar_datePicker.isDisplayed()){
                test.log(LogStatus.PASS,"Date picker is displayed when user click the calendar option");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Date picker is not displayed when user click the calendar option");
        }
    }

    public void verifyAll_Orders_Digital_Receipt_Subtotal_Refund(String subtotal){
        try{
            if(getAll_Orders_Digital_Receipt_Subtotal().isDisplayed()){
                test.log(LogStatus.PASS,"Subtotal is available when user click the Digital Receipt Screen");

                String total = getAll_Orders_Digital_Receipt_Subtotal_Amount_Refund().getText();
                char t = total.charAt(0);
                if(t == '-'){
                    test.log(LogStatus.INFO,"'-' symbol is available before the Subtotal in refunded receipt");
                    total = total.replaceAll("-","");
                }else{
                    test.log(LogStatus.FAIL,"'-' symbol is not available before the Subtotal in refunded receipt");
                }

                if(total.equals(subtotal)){
                    test.log(LogStatus.PASS,"The Correct Subtotal is displayed in the digital receipt");
                }
                else{
                    test.log(LogStatus.FAIL,"Displayed subtotal is wrong");
                    ut.FailedCaptureScreenshotAsBASE64(driver,test);
                }

            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Subtotal is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyAll_Orders_Digital_Receipt_Tax_Refund(String tax){
        try{
            if(getAll_Orders_Digital_Receipt_Tax().isDisplayed()){
                test.log(LogStatus.PASS,"Subtotal is available when user click the Digital Receipt Screen");

                String total = getAll_Orders_Digital_Receipt_Tax_Amount_Refund().getText();
                char t = total.charAt(0);
                if(t == '-'){
                    test.log(LogStatus.INFO,"'-' symbol is available before the Tax in refunded receipt");
                    total = total.replaceAll("-","");
                }else{
                    test.log(LogStatus.FAIL,"'-' symbol is not available before the Tax in refunded receipt");
                }

                if(total.equals(tax)){
                    test.log(LogStatus.PASS,"The Correct Tax is displayed in the digital receipt");
                }
                else{
                    test.log(LogStatus.FAIL,"Displayed subtotal is wrong");
                    ut.FailedCaptureScreenshotAsBASE64(driver,test);
                }

            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Subtotal is not available when user click the Digital Receipt Screen");
        }
    }

    public void verifyTheMonthYearPreviousAndNexMonthArrow(){
        //check the date picker is displayed or not
        try{
            if(All_Orders_Calendar_Month_Year.isDisplayed() && All_Orders_Calendar_PreviousMonth_Arrow.isDisplayed() && All_Orders_Calendar_NextMonth_Arrow.isDisplayed()){
                test.log(LogStatus.PASS,"Month, Year, Previous Month and Next Month arrow is displayed when user click the calendar option");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Month, Year, Previous Month and Next Month arrow is not displayed when user click the calendar option");
        }
    }

    public void verifyTheSMTWTFS(){
        //check the date picker is displayed or not
        try{
            if(All_Orders_Calendar_Monday.isDisplayed() && All_Orders_Calendar_Tuesday.isDisplayed() && All_Orders_Calendar_Wednesday.isDisplayed() && All_Orders_Calendar_Thursday.isDisplayed()
                && All_Orders_Calendar_Friday.isDisplayed() && All_Orders_Calendar_Saturday.isDisplayed() && All_Orders_Calendar_Sunday.isDisplayed()){
                test.log(LogStatus.PASS,"All the days are displayed when user click the calendar option");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"All the days are not displayed when user click the calendar option");
        }
    }

    public void getTheNumberOfDaysDisplayedInTheCalendar(){

        //get the total number of rows in the calendar
        List<?> s = driver.findElements(By.xpath("(//android.widget.GridView)[2]/android.view.View"));

        int sa = s.size();

        //get the number of buttons in the last row
        List<?> s1 = driver.findElements(By.xpath("(//android.widget.GridView)[2]/android.view.View["+sa+"]/android.view.View"));

        int sa1 = s1.size();

        //get the date from the calendar
        String dat = driver.findElement(By.xpath("(//android.widget.GridView)[2]/android.view.View["+sa+"]/android.view.View["+sa1+"]")).getText().substring(0,1);

        int date = Integer.parseInt(dat);

        // Get the current year and month
        YearMonth currentYearMonth = YearMonth.now();

        // Get the number of days in the current month
        int daysInMonth = currentYearMonth.lengthOfMonth();

        if(date == daysInMonth){
            test.log(LogStatus.PASS,"The calendar shows the correct last date, when user click the calendar icon");
        }else{
            test.log(LogStatus.INFO,"The Actual last date is : "+daysInMonth);
            test.log(LogStatus.INFO,"The displayed last date is : "+date);
            test.log(LogStatus.FAIL,"The calendar shows the wrong last date, when user click the calendar icon");
        }

    }

    public void verifyTheEnabledDaysTillTheCurrentDate(){

        // Get the current date
        LocalDate currentDate1 = LocalDate.now();

        // Define the desired date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(" MMMM yyyy");

        // Format the current date using the defined formatter
        String formattedDate = currentDate1.format(formatter);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Get the day of the month
        int dayOfMonth = currentDate.getDayOfMonth();

        for(int i = 1; i <= dayOfMonth; i++){
            if(driver.findElement(By.xpath("//android.widget.ToggleButton[contains(@text,'"+i+""+formattedDate+"')]")).isEnabled()){
                test.log(LogStatus.PASS,"The given date is enabled and the date is : "+i);
            }else {
                test.log(LogStatus.FAIL,"The given date is disabled and the date is : "+i);
            }
        }
    }

    public void verifyTheDisabledDaysAfterTheCurrentDate(){

        // Get the current date
        LocalDate currentDate1 = LocalDate.now();

        // Define the desired date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(" MMMM yyyy");

        // Format the current date using the defined formatter
        String formattedDate = currentDate1.format(formatter);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Get the day of the month
        int dayOfMonth = currentDate.getDayOfMonth();

        // Get the current year and month
        YearMonth currentYearMonth = YearMonth.now();

        // Get the number of days in the current month
        int daysInMonth = currentYearMonth.lengthOfMonth();

        for(int i = dayOfMonth + 1; i <= daysInMonth; i++){
            if(! driver.findElement(By.xpath("//android.widget.ToggleButton[contains(@text,'"+i+""+formattedDate+"')]")).isEnabled()){
                test.log(LogStatus.PASS,"The given date is disabled and the date is : "+i);
            }else {
                test.log(LogStatus.FAIL,"The given date is enabled and the date is : "+i);
            }
        }
    }

    public void clickTheFirstRefundedCheck(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //click the First row
        click_Ele(FirstCheck_InTheRefundTab);
    }

    public void clickTheReopenCheckBtn() throws InterruptedException {
        //click the reopen check button
        click_Ele(getAll_Orders_Reopen_Check_Button());
    }

    public void verifyTheRetailItemEnableOrDisable(){
        List<?> s = driver.findElements(By.xpath("(//*[@text='X'])"));

        int sa = s.size();

        click_Ele(driver.findElement(By.xpath("(//*[@text='X'])[1]")));

        List<?> s1 = driver.findElements(By.xpath("(//*[@text='X'])"));

        int sa1 = s1.size();

        if(sa == sa1){
            test.log(LogStatus.PASS,"The Retail Items is/are getting disabled after reopen from the Refunded/Exchanged Tab");
        }else{
            test.log(LogStatus.FAIL,"The Retail Items is/are getting enabled after reopen from the Refunded/Exchanged Tab");
        }
    }

    public String getTheRetailItems_FromRetailScreen(){
        List<?> s = driver.findElements(By.xpath("//android.view.View[@resource-id='react-ordder-list-render']/android.view.View"));

        int sa = s.size();
        List<String> menus = new ArrayList<>();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa;  i++) {

            String menu = driver.findElement(By.xpath("//android.view.View[@resource-id='react-ordder-list-render']/android.view.View["+i+"]/android.widget.TextView[1]")).getText();

            menus.add(menu);
        }
        return menus.toString();
    }

    public String getTheSKUCode_FromRetailScreen(){
        List<?> s = driver.findElements(By.xpath("//android.view.View[@resource-id='react-ordder-list-render']/android.view.View"));

        int sa = s.size();
        List<String> menus = new ArrayList<>();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa;  i++) {

            String menu = driver.findElement(By.xpath("//android.view.View[@resource-id='react-ordder-list-render']/android.view.View["+i+"]/android.widget.TextView[3]")).getText();

            menus.add(menu);
        }
        return menus.toString();
    }

    public void validateTheSKUCode(String SKU){
        List<?> s = driver.findElements(By.xpath("//android.view.View[@resource-id='react-ordder-list-render']/android.view.View"));

        int sa = s.size();
        List<String> menus = new ArrayList<>();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa;  i++) {

            menus.add("-");
        }

        String sku1 = menus.toString();

        if (SKU.equals(sku1)){
            test.log(LogStatus.FAIL,"SKU Code not placed when user order the retail item");
        }else{
            test.log(LogStatus.PASS,"Correct SKU Code placed when user order the retail item");
        }
    }

    public void verifyTheSKUCode(){
        List<?> s = driver.findElements(By.xpath("//android.view.View[@resource-id='react-ordder-list-render']/android.view.View"));

        int sa = s.size();
        List<String> menus = new ArrayList<>();
        List<String> menus1 = new ArrayList<>();
        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa;  i++) {

            menus.add("-");
        }
        for (int i = 1; i <= sa;  i++) {
            String me = driver.findElement(By.xpath("//android.view.View[@resource-id='react-ordder-list-render']/android.view.View["+i+"]/android.widget.TextView[3]")).getText();
            menus1.add(me);
        }


        String sku1 = menus.toString();
        String SKU = menus1.toString();
        if (SKU.equals(sku1)){
            test.log(LogStatus.FAIL,"SKU Code not placed when user order the retail item");
        }else{
            test.log(LogStatus.PASS,"Correct SKU Code placed when user order the retail item");
        }
    }

    public String getTheVariantCode_FromRetailScreen(){
        List<?> s = driver.findElements(By.xpath("//android.view.View[@resource-id='react-ordder-list-render']/android.view.View"));

        int sa = s.size();
        List<String> menus = new ArrayList<>();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa;  i++) {

            String menu = driver.findElement(By.xpath("//android.view.View[@resource-id='react-ordder-list-render']/android.view.View["+i+"]/android.widget.TextView[2]")).getText();

            menus.add(menu);
        }
        return menus.toString();
    }

    public void validateTheVariantCode(String SKU){
        List<?> s = driver.findElements(By.xpath("//android.view.View[@resource-id='react-ordder-list-render']/android.view.View"));

        int sa = s.size();
        List<String> menus = new ArrayList<>();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa;  i++) {

            menus.add("");
        }

        String sku1 = menus.toString();

        if (SKU.equals(sku1)){
            test.log(LogStatus.FAIL,"Variant Code not placed when user order the variant retail item");
        }else{
            test.log(LogStatus.PASS,"Correct Variant Code placed when user order the variant retail item");
        }
    }

    public void clearAllTheLayAwaySalesFromTheLayAwayTab(){
        try{
            for(int i = 1; i <= 1000; i++){
                Thread.sleep(2000);
                //click the first check available check
                click_Ele(FirstCheck_InTheClosedTab);

                new Sale_History_Page().clickTheOpenCheckButton();

                driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

                new Standard_Item_POS_Page().Cash_Payment_Selection_And_Completed();

                driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

                new Standard_Item_POS_Page().Click_Sale_HistoryBtn();

                driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

                new Sale_History_Page().verifyAll_Orders_All_Orders_Text();

                driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

                new Sale_History_Page().clickLayAwaysTab();
                new Sale_History_Page().verifyAll_Orders_Layaways_Tab_Active();
            }
        }catch (Throwable ignored) {}
    }

    public String getTheQuantityOfRetailItems_FromRetailScreen(){

        List<?> s = driver.findElements(By.xpath("//android.view.View[@resource-id='react-ordder-list-render']/android.view.View"));

        int sa = s.size();

        List<String> quan = new ArrayList<>();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa; i++) {

            String qu = driver.findElement(By.xpath("//android.view.View[@resource-id='react-ordder-list-render']/android.view.View["+i+"]/android.widget.TextView[4]")).getText();

            quan.add(qu);
        }
        return quan.toString();
    }

    public String getTheTotalOfRetailItems_FromRetailScreen(){

        List<?> s = driver.findElements(By.xpath("//android.view.View[@resource-id='react-ordder-list-render']/android.view.View"));

        int sa = s.size();

        List<String> tot = new ArrayList<>();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa; i++) {

            String total = driver.findElement(By.xpath("//android.view.View[@resource-id='react-ordder-list-render']/android.view.View["+i+"]/android.widget.TextView[7]")).getText();

            tot.add(total);
        }
        return tot.toString();
    }

    public void clickTheCloseButtonOfMenuItem(){
        //Click the close button of the menu item
        driver.findElement(By.xpath("//*[@text='X']")).click();
    }

}
