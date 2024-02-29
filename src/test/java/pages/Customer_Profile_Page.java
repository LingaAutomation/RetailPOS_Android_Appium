package pages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testcontainers.shaded.org.apache.commons.lang.RandomStringUtils;
import utility.Utility;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Customer_Profile_Page extends Appium_Base_Class{

    FluentWait<AppiumDriver> wait = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofSeconds(5))
            .ignoring(NoSuchElementException.class);
    @AndroidFindBy(xpath = "//*[contains(@text,'Add Customer')]")
    WebElement Order_Screen_Add_Customer;

    @AndroidFindBy(xpath = "//*[@text='Add Customer']")
    WebElement Search_Screen_Add_Customer_Title;

    @AndroidFindBy(xpath = "//*[@text='Search Customer']")
    WebElement Order_Screen_Search_Customer;

    @AndroidFindBy(xpath = "//*[@text='SEARCH CUSTOMER']")
    WebElement Search_Screen_Search_Customer;

    @AndroidFindBy(xpath = "//*[@text='By Phone']")
    WebElement Search_Screen_By_Phone;

    @AndroidFindBy(xpath = "//*[contains(@text,'By Name') and contains(@text,'Email')]")
    WebElement Search_Screen_By_Name_Or_Email;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    WebElement Search_Screen_Search;

    @AndroidFindBy(xpath = "//*[@text='X']")
    WebElement Search_Screen_Close_Btn;

    @AndroidFindBy(xpath = "//android.app.Dialog[@resource-id='customer-dialog']/android.view.View[1]/android.view.View/android.view.View/android.widget.Button")
    WebElement Search_Screen_Close_Btn1;

    @AndroidFindBy(xpath = "//*[@text='Done']")
    WebElement Customer_Profile_Screen_Done_Btn;

    @AndroidFindBy(xpath = "//*[@text='Notes']/..//android.widget.EditText")
    WebElement Customer_Profile_Screen_Notes;

    @AndroidFindBy(xpath = "(//android.widget.Image)[4]")
    WebElement Customer_Profile_Screen_Profile_Image;

    @AndroidFindBy(xpath = "//*[@text='1']")
    WebElement Search_Screen_Number_1;

    @AndroidFindBy(xpath = "//*[@text='2']")
    WebElement Search_Screen_Number_2;

    @AndroidFindBy(xpath = "//*[@text='3']")
    WebElement Search_Screen_Number_3;

    @AndroidFindBy(xpath = "//*[@text='4']")
    WebElement Search_Screen_Number_4;

    @AndroidFindBy(xpath = "//*[@text='5']")
    WebElement Search_Screen_Number_5;

    @AndroidFindBy(xpath = "//*[@text='6']")
    WebElement Search_Screen_Number_6;

    @AndroidFindBy(xpath = "//*[@text='7']")
    WebElement Search_Screen_Number_7;

    @AndroidFindBy(xpath = "//*[@text='8']")
    WebElement Search_Screen_Number_8;

    @AndroidFindBy(xpath = "//*[@text='9']")
    WebElement Search_Screen_Number_9;

    @AndroidFindBy(xpath = "//*[@text='0']")
    WebElement Search_Screen_Number_0;

    @AndroidFindBy(xpath = "//*[@text='C']")
    WebElement Search_Screen_Number_C;

    @AndroidFindBy(xpath = "//*[contains(@text,'Minimum 6 characters required')]")
    WebElement Search_Screen_Minimum_6_Characters_Required;

    @AndroidFindBy(xpath = "//*[contains(@text,'Minimum 2 characters required')]")
    WebElement Search_Screen_Minimum_2_Characters_Required;

    @AndroidFindBy(xpath = "//*[contains(@text,'+ Add customer')]")
    WebElement Search_Screen_Add_Customer;

    @AndroidFindBy(xpath = "//*[contains(@text,'No results')]")
    WebElement Search_Screen_No_Results;

    @AndroidFindBy(xpath = "//*[contains(@text,'Customer Profile')]")
    WebElement Customer_Profile_Screen_Customer_Profile;

    @AndroidFindBy(xpath = "//*[contains(@text,'Map')]")
    WebElement Customer_Profile_Screen_Map;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
    WebElement Customer_Profile_Screen_Search;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='firstNameInputBox']")
    WebElement Customer_Profile_Screen_First_Name;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='firstNameInputBox']")
    WebElement Customer_Profile_Screen_First_Name_Value;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Last Name']/..//android.widget.EditText")
    WebElement Customer_Profile_Screen_Last_Name;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Last Name']/..//android.widget.EditText")
    WebElement Customer_Profile_Screen_Last_Name_value;

    @AndroidFindBy(xpath = "//*[contains(@text,'Tax')]/..//android.widget.EditText")
    WebElement Retail_Screen_Tax;

    @AndroidFindBy(xpath = "//*[contains(@text,'Customer identification number')]/..//android.widget.EditText")
    WebElement Customer_Profile_Screen_Customer_ID;

    @AndroidFindBy(xpath = "//*[contains(@text,'Email ID')]/..//android.widget.EditText")
    WebElement Customer_Profile_Screen_Email_ID;

    @AndroidFindBy(xpath = "//*[contains(@text,'Birthday')]")
    WebElement Customer_Profile_Screen_BirthDay;

    @AndroidFindBy(xpath = "//*[@focused='true']")
    WebElement Customer_Profile_Screen_BirthDay_Current_Date;

    @AndroidFindBy(xpath = "//*[contains(@text,'Mobile')]")
    WebElement Customer_Profile_Screen_Mobile;

    @AndroidFindBy(xpath = "//*[contains(@text,'Nationality')]/..//android.widget.EditText")
    WebElement Customer_Profile_Screen_Nationality;

    @AndroidFindBy(xpath = "//*[contains(@text,'+Add')]")
    WebElement Customer_Profile_Screen_Mobile_Add_Btn;
//(//android.widget.Button[@resource-id="addPhnNo"])[1]
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='addPhnNo' and @text='Edit']")
    WebElement Customer_Profile_Screen_Mobile_Edit_Btn;

    @AndroidFindBy(xpath = "(//*[@text='Edit'])[3]")
    WebElement Customer_Profile_Screen_Credit_Edit_Btn;

    @AndroidFindBy(xpath = "//*[contains(@text,'Delete')]")
    WebElement Customer_Profile_Screen_Mobile_Delete_Btn;

    @AndroidFindBy(xpath = "(//*[contains(@text,'+Add')])[2]")
    WebElement Customer_Profile_Screen_Address_Add_Btn;

    @AndroidFindBy(xpath = "//android.widget.ToggleButton[contains(@text,'Tax Exempt')]")
    WebElement Customer_Profile_Screen_Tax_Exempt;

    @AndroidFindBy(xpath = "//android.widget.ToggleButton[contains(@text,'Tax Exempt') and @checked='false']")
    WebElement Customer_Profile_Screen_Tax_Exempt_disabled;

    @AndroidFindBy(xpath = "//*[contains(@text,'+Add Credit')]")
    WebElement Customer_Profile_Screen_Add_Credit;

    @AndroidFindBy(xpath = "//*[@text='Add Credit']")
    WebElement Customer_Profile_Screen_Add_Add_Credit;

    @AndroidFindBy(xpath = "//*[contains(@text,'Previous Orders')]")
    WebElement Customer_Profile_Screen_Previous_Orders;

    @AndroidFindBy(xpath = "//*[contains(@text,'No Previous Order')]")
    WebElement Customer_Profile_Screen_No_Previous_Order;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Previous Orders']/../android.view.View//android.widget.TextView")
    WebElement Customer_Profile_Screen_First_Previous_Order;


    @AndroidFindBy(xpath = "//*[contains(@text,'Customer Plan')]")
    WebElement Customer_Profile_Screen_Customer_Plan;


    @AndroidFindBy(xpath = "//*[@text='STORE CREDIT']/..//android.widget.EditText")
    WebElement Customer_Profile_Screen_Add_Credit_Amount;


    @AndroidFindBy(xpath = "//*[contains(@text,'Display Order')]")
    WebElement Customer_Profile_Screen_Display_Order;

    @AndroidFindBy(xpath = "//*[contains(@text,'Repeat Order')]")
    WebElement Customer_Profile_Screen_Repeat_Order;

    @AndroidFindBy(xpath = "//*[contains(@text,'Save')]")
    WebElement Customer_Profile_Screen_Save;

    @AndroidFindBy(xpath = "//*[contains(@text,'Add Address')]")
    WebElement Customer_Profile_Screen_Add_Address;

    @AndroidFindBy(xpath = "//*[contains(@text,'Add Address')]/..//android.widget.EditText")
    WebElement Customer_Profile_Screen_Address_Search_Location;

    @AndroidFindBy(xpath = "//*[contains(@text,'Cancel')]")
    WebElement Customer_Profile_Screen_Address_Cancel;

    @AndroidFindBy(xpath = "//*[contains(@text,'Enter Address')]")
    WebElement Customer_Profile_Screen_Address_Enter_Address;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Address Line 1']/..//android.widget.EditText")
    WebElement Customer_Profile_Screen_Address_Address_Line1;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Address Line 2']/..//android.widget.EditText")
    WebElement Customer_Profile_Screen_Address_Address_Line2;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='City']/..//android.widget.EditText")
    WebElement Customer_Profile_Screen_Address_City;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='State']/..//android.widget.EditText")
    WebElement Customer_Profile_Screen_Address_State;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Zip Code']/..//android.widget.EditText")
    WebElement Customer_Profile_Screen_Address_ZipCode;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Country']/..//android.widget.EditText")
    WebElement Customer_Profile_Screen_Address_Country;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Gate Code']/..//android.widget.EditText")
    WebElement Customer_Profile_Screen_Address_Gate_Code;

    @AndroidFindBy(xpath = "(//*[contains(@text,'Save')])[2]")
    WebElement Customer_Profile_Screen_Address_Save_Button;

    @AndroidFindBy(xpath = "(//*[contains(@text,'Save')])[1]")
    WebElement Customer_Profile_Screen_Customer_Plan_Save_Button;

    @AndroidFindBy(xpath = "//*[contains(@text,'Add Phone')]")
    WebElement Customer_Profile_Screen_Mobile_Add_Phone;

    @AndroidFindBy(xpath = "//*[contains(@text,'Continue')]")
    WebElement Customer_Profile_Screen_Mobile_Continue;

    @AndroidFindBy(xpath = "(//*[@text='1'])[2]")
    WebElement Customer_Profile_Screen_Mobile_Number_1;

    @AndroidFindBy(xpath = "(//*[@text='2'])[2]")
    WebElement Customer_Profile_Screen_Mobile_Number_2;

    @AndroidFindBy(xpath = "(//*[@text='3'])[2]")
    WebElement Customer_Profile_Screen_Mobile_Number_3;

    @AndroidFindBy(xpath = "(//*[@text='4'])[2]")
    WebElement Customer_Profile_Screen_Mobile_Number_4;

    @AndroidFindBy(xpath = "(//*[@text='5'])[2]")
    WebElement Customer_Profile_Screen_Mobile_Number_5;

    @AndroidFindBy(xpath = "(//*[@text='6'])[2]")
    WebElement Customer_Profile_Screen_Mobile_Number_6;

    @AndroidFindBy(xpath = "(//*[@text='7'])[2]")
    WebElement Customer_Profile_Screen_Mobile_Number_7;

    @AndroidFindBy(xpath = "(//*[@text='8'])[2]")
    WebElement Customer_Profile_Screen_Mobile_Number_8;

    @AndroidFindBy(xpath = "(//*[@text='9'])[2]")
    WebElement Customer_Profile_Screen_Mobile_Number_9;

    @AndroidFindBy(xpath = "(//*[@text='0'])[2]")
    WebElement Customer_Profile_Screen_Mobile_Number_0;

    @AndroidFindBy(xpath = "(//*[@text='C'])[2]")
    WebElement Customer_Profile_Screen_Mobile_Number_C;

    @AndroidFindBy(xpath = "//*[contains(@text,'Add Phone')]/../../..//android.widget.EditText")
    WebElement Customer_Profile_Screen_Mobile_Enter_Box;

    @AndroidFindBy(xpath = "//*[@text='Card Number']/..//android.widget.EditText")
    WebElement Customer_Profile_Screen_Customer_Plan_Card_Number;

    @AndroidFindBy(xpath = "//*[@text='Recharge']/..//android.widget.EditText")
    WebElement Customer_Profile_Screen_Customer_Plan_Recharge_Amount;

    @AndroidFindBy(xpath = "//*[@text='Limit']/..//android.widget.EditText")
    WebElement Customer_Profile_Screen_Customer_Plan_Limit_Amount;

    @AndroidFindBy(xpath = "//*[@text='Limit']/..//android.widget.ToggleButton")
    WebElement Customer_Profile_Screen_Customer_Plan_Limit;

    @AndroidFindBy(xpath = "//*[@text='Max Limit']/..//android.widget.EditText")
    WebElement Customer_Profile_Screen_Customer_Plan_MaxLimit_Amount;

    @AndroidFindBy(xpath = "//*[@text='Max Limit']/..//android.widget.ToggleButton")
    WebElement Customer_Profile_Screen_Customer_Plan_MaxLimit;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Limit Period']")
    WebElement Customer_Profile_Screen_Customer_Plan_LimitPeriod;

    @AndroidFindBy(xpath = "//*[@text='Weekly']")
    WebElement Customer_Profile_Screen_Customer_Plan_LimitPeriod_Weekly;

    @AndroidFindBy(xpath = "(//*[@text='Allow Credit']/..//android.widget.ToggleButton)[2]")
    WebElement Customer_Profile_Screen_Customer_Plan_AllowCredit;

    @AndroidFindBy(xpath = "//*[@text='Submit']")
    WebElement Payment_Screen_Submit;


    public WebElement getPayment_Screen_Submit() {return Payment_Screen_Submit;}

    public WebElement getSearch_Screen_Close_Btn1() {return Search_Screen_Close_Btn1;}

    public WebElement getCustomer_Profile_Screen_Customer_Plan_AllowCredit() {return Customer_Profile_Screen_Customer_Plan_AllowCredit;}

    public WebElement getCustomer_Profile_Screen_Customer_Plan_Limit() {return Customer_Profile_Screen_Customer_Plan_Limit;}

    public WebElement getCustomer_Profile_Screen_Customer_Plan_Limit_Amount() {return Customer_Profile_Screen_Customer_Plan_Limit_Amount;}

    public WebElement getCustomer_Profile_Screen_Customer_Plan_LimitPeriod() {return Customer_Profile_Screen_Customer_Plan_LimitPeriod;}

    public WebElement getCustomer_Profile_Screen_Customer_Plan_LimitPeriod_Weekly() {return Customer_Profile_Screen_Customer_Plan_LimitPeriod_Weekly;}

    public WebElement getCustomer_Profile_Screen_Customer_Plan_MaxLimit() {return Customer_Profile_Screen_Customer_Plan_MaxLimit;}

    public WebElement getCustomer_Profile_Screen_Customer_Plan_MaxLimit_Amount() {return Customer_Profile_Screen_Customer_Plan_MaxLimit_Amount;}

    public WebElement getCustomer_Profile_Screen_Customer_Plan_Recharge_Amount() {return Customer_Profile_Screen_Customer_Plan_Recharge_Amount;}

    public WebElement getCustomer_Profile_Screen_Customer_Plan_Card_Number() {return Customer_Profile_Screen_Customer_Plan_Card_Number;}

    public WebElement getCustomer_Profile_Screen_Customer_Plan_Save_Button() {return Customer_Profile_Screen_Customer_Plan_Save_Button;}

    public WebElement getCustomer_Profile_Screen_Add_Credit_Amount() {return Customer_Profile_Screen_Add_Credit_Amount;}

    public WebElement getCustomer_Profile_Screen_Credit_Edit_Btn() {return Customer_Profile_Screen_Credit_Edit_Btn;}

    public WebElement getCustomer_Profile_Screen_Add_Add_Credit() {return Customer_Profile_Screen_Add_Add_Credit;}

    public WebElement getCustomer_Profile_Screen_First_Name_Value() {return Customer_Profile_Screen_First_Name_Value;}

    public WebElement getCustomer_Profile_Screen_Address_Address_Line1() {return Customer_Profile_Screen_Address_Address_Line1;}

    public WebElement getCustomer_Profile_Screen_Address_Address_Line2() {return Customer_Profile_Screen_Address_Address_Line2;}

    public WebElement getCustomer_Profile_Screen_Address_City() {return Customer_Profile_Screen_Address_City;}

    public WebElement getCustomer_Profile_Screen_Address_State() {return Customer_Profile_Screen_Address_State;}

    public WebElement getCustomer_Profile_Screen_Address_ZipCode() {return Customer_Profile_Screen_Address_ZipCode;}

    public WebElement getCustomer_Profile_Screen_Address_Country() {return Customer_Profile_Screen_Address_Country;}

    public WebElement getCustomer_Profile_Screen_Address_Gate_Code() {return Customer_Profile_Screen_Address_Gate_Code;}

    public WebElement getCustomer_Profile_Screen_Address_Save_Button(){return Customer_Profile_Screen_Address_Save_Button;}

    public WebElement getOrder_Screen_Add_Customer(){return Order_Screen_Add_Customer;}

    public WebElement getRetail_Screen_Tax() {return Retail_Screen_Tax;}

    public WebElement getOrder_Screen_Search_Customer(){return Order_Screen_Search_Customer;}

    public WebElement getCustomer_Profile_Screen_First_Previous_Order() {return Customer_Profile_Screen_First_Previous_Order;}

    public WebElement getSearch_Screen_Add_Customer_Title() {return Search_Screen_Add_Customer_Title;}

    public WebElement getSearch_Screen_Search_Customer(){return Search_Screen_Search_Customer;}

    public WebElement getCustomer_Profile_Screen_Tax_Exempt_disabled() {return Customer_Profile_Screen_Tax_Exempt_disabled;}

    public WebElement getCustomer_Profile_Screen_Done_Btn() {return Customer_Profile_Screen_Done_Btn;}

    public WebElement getCustomer_Profile_Screen_Profile_Image() {return Customer_Profile_Screen_Profile_Image;}

    public WebElement getCustomer_Profile_Screen_Notes() {return Customer_Profile_Screen_Notes;}

    public WebElement getSearch_Screen_By_Phone(){return Search_Screen_By_Phone;}

    public WebElement getSearch_Screen_By_Name_Or_Email(){return Search_Screen_By_Name_Or_Email;}

    public WebElement getSearch_Screen_Close_Btn() {return Search_Screen_Close_Btn;}

    public WebElement getCustomer_Profile_Screen_Customer_ID() {return Customer_Profile_Screen_Customer_ID;}

    public WebElement getCustomer_Profile_Screen_Customer_Profile() {return Customer_Profile_Screen_Customer_Profile;}

    public WebElement getCustomer_Profile_Screen_BirthDay() {return Customer_Profile_Screen_BirthDay;}

    public WebElement getCustomer_Profile_Screen_BirthDay_Current_Date() {return Customer_Profile_Screen_BirthDay_Current_Date;}

    public WebElement getCustomer_Profile_Screen_Email_ID() {return Customer_Profile_Screen_Email_ID;}

    public WebElement getSearch_Screen_Number_1() {return Search_Screen_Number_1;}

    public WebElement getCustomer_Profile_Screen_First_Name() {return Customer_Profile_Screen_First_Name;}

    public WebElement getCustomer_Profile_Screen_Map() {return Customer_Profile_Screen_Map;}

    public WebElement getCustomer_Profile_Screen_Last_Name() {return Customer_Profile_Screen_Last_Name;}

    public WebElement getCustomer_Profile_Screen_Last_Name_value() {return Customer_Profile_Screen_Last_Name_value;}

    public WebElement getCustomer_Profile_Screen_Address_Add_Btn() {return Customer_Profile_Screen_Address_Add_Btn;}

    public WebElement getCustomer_Profile_Screen_Mobile() {return Customer_Profile_Screen_Mobile;}

    public WebElement getSearch_Screen_Number_2() {return Search_Screen_Number_2;}

    public WebElement getSearch_Screen_Add_Customer() {return Search_Screen_Add_Customer;}

    public WebElement getSearch_Screen_No_Results() {return Search_Screen_No_Results;}

    public WebElement getCustomer_Profile_Screen_Add_Credit() {return Customer_Profile_Screen_Add_Credit;}

    public WebElement getSearch_Screen_Minimum_6_Characters_Required() {return Search_Screen_Minimum_6_Characters_Required;}

    public WebElement getSearch_Screen_Minimum_2_Characters_Required() {return Search_Screen_Minimum_2_Characters_Required;}

    public WebElement getCustomer_Profile_Screen_Search() {return Customer_Profile_Screen_Search;}

    public WebElement getSearch_Screen_Number_0() {return Search_Screen_Number_0;}

    public WebElement getCustomer_Profile_Screen_Mobile_Add_Btn() {return Customer_Profile_Screen_Mobile_Add_Btn;}

    public WebElement getCustomer_Profile_Screen_Nationality() {return Customer_Profile_Screen_Nationality;}

    public WebElement getCustomer_Profile_Screen_Customer_Plan() {return Customer_Profile_Screen_Customer_Plan;}

    public WebElement getCustomer_Profile_Screen_Mobile_Delete_Btn() {return Customer_Profile_Screen_Mobile_Delete_Btn;}

    public WebElement getCustomer_Profile_Screen_Mobile_Edit_Btn() {return Customer_Profile_Screen_Mobile_Edit_Btn;}

    public WebElement getCustomer_Profile_Screen_Previous_Orders() {return Customer_Profile_Screen_Previous_Orders;}

    public WebElement getCustomer_Profile_Screen_Tax_Exempt() {return Customer_Profile_Screen_Tax_Exempt;}

    public WebElement getSearch_Screen_Number_3() {return Search_Screen_Number_3;}

    public WebElement getSearch_Screen_Number_4() {return Search_Screen_Number_4;}

    public WebElement getSearch_Screen_Number_5() {return Search_Screen_Number_5;}

    public WebElement getCustomer_Profile_Screen_Display_Order() {return Customer_Profile_Screen_Display_Order;}

    public WebElement getCustomer_Profile_Screen_No_Previous_Order() {return Customer_Profile_Screen_No_Previous_Order;}

    public WebElement getCustomer_Profile_Screen_Repeat_Order() {return Customer_Profile_Screen_Repeat_Order;}

    public WebElement getSearch_Screen_Number_6() {return Search_Screen_Number_6;}

    public WebElement getSearch_Screen_Number_7() {return Search_Screen_Number_7;}

    public WebElement getSearch_Screen_Number_8() {return Search_Screen_Number_8;}

    public WebElement getSearch_Screen_Number_9() {return Search_Screen_Number_9;}

    public WebElement getSearch_Screen_Number_C() {return Search_Screen_Number_C;}

    public WebElement getCustomer_Profile_Screen_Save() {return Customer_Profile_Screen_Save;}

    public WebElement getSearch_Screen_Search() {return Search_Screen_Search;}

    public WebElement getCustomer_Profile_Screen_Add_Address() {return Customer_Profile_Screen_Add_Address;}

    public WebElement getCustomer_Profile_Screen_Address_Cancel() {return Customer_Profile_Screen_Address_Cancel;}

    public WebElement getCustomer_Profile_Screen_Address_Enter_Address() {return Customer_Profile_Screen_Address_Enter_Address;}

    public WebElement getCustomer_Profile_Screen_Address_Search_Location() {return Customer_Profile_Screen_Address_Search_Location;}

    public WebElement getCustomer_Profile_Screen_Mobile_Add_Phone() {return Customer_Profile_Screen_Mobile_Add_Phone;}

    public WebElement getCustomer_Profile_Screen_Mobile_Continue() {return Customer_Profile_Screen_Mobile_Continue;}

    public WebElement getCustomer_Profile_Screen_Mobile_Enter_Box() {return Customer_Profile_Screen_Mobile_Enter_Box;}

    public WebElement getCustomer_Profile_Screen_Mobile_Number_0() {return Customer_Profile_Screen_Mobile_Number_0;}

    public WebElement getCustomer_Profile_Screen_Mobile_Number_1() {return Customer_Profile_Screen_Mobile_Number_1;}

    public WebElement getCustomer_Profile_Screen_Mobile_Number_2() {return Customer_Profile_Screen_Mobile_Number_2;}

    public WebElement getCustomer_Profile_Screen_Mobile_Number_3() {return Customer_Profile_Screen_Mobile_Number_3;}

    public WebElement getCustomer_Profile_Screen_Mobile_Number_4() {return Customer_Profile_Screen_Mobile_Number_4;}

    public WebElement getCustomer_Profile_Screen_Mobile_Number_5() {return Customer_Profile_Screen_Mobile_Number_5;}

    public WebElement getCustomer_Profile_Screen_Mobile_Number_6() {return Customer_Profile_Screen_Mobile_Number_6;}

    public WebElement getCustomer_Profile_Screen_Mobile_Number_7() {return Customer_Profile_Screen_Mobile_Number_7;}

    public WebElement getCustomer_Profile_Screen_Mobile_Number_8() {return Customer_Profile_Screen_Mobile_Number_8;}

    public WebElement getCustomer_Profile_Screen_Mobile_Number_9() {return Customer_Profile_Screen_Mobile_Number_9;}

    public WebElement getCustomer_Profile_Screen_Mobile_Number_C() {return Customer_Profile_Screen_Mobile_Number_C;}


    public void clickTheSubmitBtn(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //click the submit button
        click_Ele(getPayment_Screen_Submit());
    }

    public void clickTheCloseButton(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //click the Limit Amount box
        click_Ele(getSearch_Screen_Close_Btn1());
    }

    public void clickTheLimitAmountBox(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //click the Limit Amount box
        click_Ele(getCustomer_Profile_Screen_Customer_Plan_Limit_Amount());
    }

    public void clickTheMaxLimitAmountBox(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //click the Limit Amount box
        click_Ele(getCustomer_Profile_Screen_Customer_Plan_MaxLimit_Amount());
    }

    public void clickTheLimitToggle(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //click the Limit Toggle
        click_Ele(getCustomer_Profile_Screen_Customer_Plan_Limit());
    }

    public void clickTheMaxLimitToggle(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //click the Limit Toggle
        click_Ele(getCustomer_Profile_Screen_Customer_Plan_MaxLimit());
    }

    public void clickTheAllowCreditToggle(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //click the Limit Toggle
        click_Ele(getCustomer_Profile_Screen_Customer_Plan_AllowCredit());
    }

    public void clickTheLimitPeriod(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //click the Limit Toggle
        click_Ele(getCustomer_Profile_Screen_Customer_Plan_LimitPeriod());
    }

    public void clickTheLimitPeriodOption(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //click the Limit Toggle
        click_Ele(getCustomer_Profile_Screen_Customer_Plan_LimitPeriod_Weekly());
    }

    public void clickTheRechargeAmount(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //click the recharge amount
        click_Ele(getCustomer_Profile_Screen_Customer_Plan_Recharge_Amount());
    }

    public void enterWrongTheCustomerPlanCardNumber(){
        //enter the invalid card number
        getCustomer_Profile_Screen_Customer_Plan_Card_Number().sendKeys("sssss");
    }

    public void enterTheCustomerPlanCardNumber(){
        String s = RandomStringUtils.randomNumeric(8);
        getCustomer_Profile_Screen_Customer_Plan_Card_Number().clear();
        //enter the invalid card number
        getCustomer_Profile_Screen_Customer_Plan_Card_Number().sendKeys(s);
    }

    public void clickTheSaveButtonOfCustomerPlan(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //click the save button
        click_Ele(getCustomer_Profile_Screen_Customer_Plan_Save_Button());
    }

    public void verifyTheAddCreditAmount(String enteredAmount){
        String result = getCustomer_Profile_Screen_Add_Credit_Amount().getText().replaceAll(",","");
        String result1 = result.substring(result.indexOf(" ")+1);

        if(result1.equals(enteredAmount)){
            test.log(LogStatus.PASS,"The required amount displayed in the Add credit section");
        }
        else{
            double act = Double.parseDouble(result1);
            double ge = Double.parseDouble(enteredAmount);
            double diff = act - ge;
            test.log(LogStatus.INFO,"Actual displayed add credit amount is : "+result1);
            test.log(LogStatus.INFO,"Entered in the add credit popup is : "+enteredAmount);
            test.log(LogStatus.FAIL,"The difference of the displayed and actual credit value is : "+diff);
        }
    }

    public void verifyTheAddCreditAmount1(){
        String result = getCustomer_Profile_Screen_Add_Credit_Amount().getText().replaceAll(",","");
        String result1 = result.substring(result.indexOf(" ")+1);

        if(result1.equals("0.00")){
            test.log(LogStatus.PASS,"The required amount displayed in the Add credit section");
        }
        else{
            double act = Double.parseDouble(result1);
            double ge = Double.parseDouble("0.00");
            double diff = act - ge;
            test.log(LogStatus.INFO,"Actual displayed add credit amount is : "+result1);
            test.log(LogStatus.INFO,"Entered in the add credit popup is : 0.00");
            test.log(LogStatus.FAIL,"The difference of the displayed and actual credit value is : "+diff);
        }
    }

    public void verifyTheAddCreditAmount2(){
        String result = getCustomer_Profile_Screen_Add_Credit_Amount().getText().replaceAll(",","");
        String result1 = result.substring(result.indexOf(" ")+1);

        if(result1.equals("9997.00")){
            test.log(LogStatus.PASS,"The required amount displayed in the Add credit section");
        }
        else{
            double act = Double.parseDouble(result1);
            double ge = Double.parseDouble("9997.00");
            double diff = act - ge;
            test.log(LogStatus.INFO,"Actual displayed add credit amount is : "+result1);
            test.log(LogStatus.INFO,"Entered in the add credit popup is : 0.00");
            test.log(LogStatus.FAIL,"The difference of the displayed and actual credit value is : "+diff);
        }
    }

    public void clickTheAddButtonOfAddress(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //click the add address button
        click_Ele(getCustomer_Profile_Screen_Address_Add_Btn());
    }

    public void clickTheFirstOrderOfPreviousOrders(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //click the previous orders - first order
        click_Ele(getCustomer_Profile_Screen_First_Previous_Order());
    }

    public void ClickTheEnterAddressButton(){
        try{
            if(getCustomer_Profile_Screen_Address_Cancel().isDisplayed()){
                test.log(LogStatus.PASS,"Cancel button is displayed after click the add button of address");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Cancel button is not displayed after click the add button of address");
        }

        click_Ele(getCustomer_Profile_Screen_Address_Enter_Address());
    }

    public void clickTheBackOrderButtonOfDisplayOrder() throws Exception {
        //android.widget.TextView[@text="Retail Automation 1"]/../../..//android.view.View[1]/android.widget.Button
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.TextView[@text='"+ Utility.getProperty("Store_Name") +"']/../../..//android.view.View[1]/android.widget.Button")).click();
    }

    public void verifyTheTax_AfterEnablingFromTheCustomerProfileScreen(){
        try{
            if(getRetail_Screen_Tax().isDisplayed()){
                test.log(LogStatus.FAIL,"Tax is displayed still after enable the Tax exempt option from the Customer profile screen");
            }
        }catch (Exception e){
            test.log(LogStatus.PASS,"Tax is not displayed after enable the Tax exempt option from the Customer profile screen");
        }
    }

    public void clickTheEditButtonOfAddCreditPopup(){
        try{
            //click the edit credit button
            click_Ele(getCustomer_Profile_Screen_Credit_Edit_Btn());
        }catch (Exception e){
            //click the edit credit button
            click_Ele(getCustomer_Profile_Screen_Credit_Edit_Btn());
        }
    }

    public void enterTheAddress(){

        //click the save button of address popup without data
        click_Ele(getCustomer_Profile_Screen_Address_Save_Button());
        try {
            if(getCustomer_Profile_Screen_Add_Address().isDisplayed()){
                test.log(LogStatus.PASS,"Add Address popup still available when use doesn't enter the data");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Add Address popup not available when use doesn't enter the data");
        }

        getCustomer_Profile_Screen_Address_Address_Line1().sendKeys("1st Main Road, Golden Colony");

        getCustomer_Profile_Screen_Address_Address_Line2().sendKeys("Golden Flats, Mogappair");

        getCustomer_Profile_Screen_Address_City().sendKeys("Chennai");

        getCustomer_Profile_Screen_Address_State().sendKeys("Tamil Nadu");

        getCustomer_Profile_Screen_Address_ZipCode().sendKeys("600050");

        getCustomer_Profile_Screen_Address_Country().sendKeys("India");

        getCustomer_Profile_Screen_Address_Gate_Code().sendKeys("123423");
    }

    public void clickTheSaveButton_Of_Add_Address(){
        //click the delete button
        click_Ele(getCustomer_Profile_Screen_Address_Save_Button());
    }

    public void clickTheDeleteButton(){
        //click the delete button
        click_Ele(getCustomer_Profile_Screen_Mobile_Delete_Btn());
    }

    public void clickTheAddMobileNumber(){
        //click the add mobile number button
        getCustomer_Profile_Screen_Mobile_Add_Btn().click();
    }

    public void clickTheByNameOption(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //click the by name or email option
        click_Ele(getSearch_Screen_By_Name_Or_Email());
    }

    public void enterTheSingleCharacter_ByNameOption_RandomName() {
        String name = RandomStringUtils.randomAlphabetic(12);

        //enter the single character
        getSearch_Screen_Search().sendKeys(name);
    }

    public void enterTheSingleCharacter_ByNameOption(){
        //enter the single character
        getSearch_Screen_Search().sendKeys("q");

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        try{
            if(getSearch_Screen_Minimum_2_Characters_Required().isDisplayed()){
                test.log(LogStatus.PASS,"When user enter the minimum 2 characters in name field then the error message is displayed");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"When user enter the minimum 2 characters in name field then the error message is not displayed");
        }
    }

    public String firstName_CustomerProfileScreen(){
        //get the first name from the customer profile screen
        test.log(LogStatus.INFO,"The Customer First Name is : "+getCustomer_Profile_Screen_First_Name_Value().getText());

        return getCustomer_Profile_Screen_First_Name_Value().getText();
    }

    public String lastName_CustomerProfileScreen(){
        //get the last name from the customer profile screen
        return getCustomer_Profile_Screen_Last_Name_value().getText();
    }

    public void verifyTheAddedCustomerInRetailScreen(String customerName){
        try{
            if(driver.findElement(By.xpath("//android.widget.TextView[@text='"+customerName+"']")).isDisplayed()){
                test.log(LogStatus.PASS,"Newly added customer is attached in the retail screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Newly added customer is not attached in the retail screen");
            ut.FailedCaptureScreenshotAsBASE64(driver,test);
        }
    }

    public void verifyTheCloseButtonAvailableOrNotFor_AttachedCustomer(String customerName){
        try{
            if(driver.findElement(By.xpath("//android.widget.TextView[@text='Search Customer']/../..//android.widget.Button")).isDisplayed()){
                test.log(LogStatus.PASS,"Close button of Newly added customer is available in the retail screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Close button of Newly added customer is not available in the retail screen");
        }
    }

    public void clickTheCloseButtonOfAttachedCustomer(String customerName){
        //click the close customer button
        driver.findElement(By.xpath("//android.widget.TextView[@text='Search Customer']/../../android.view.View[1]//android.widget.Button[@text='X']")).click();
    }

    public void updateTheMobileNumber_CustomerProfileScreen_lessThan5Chars(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //clear the Existing number
        click_Ele(getSearch_Screen_Number_C());

        String result = RandomStringUtils.randomNumeric(4);

        for (int i = 0; i < result.length(); i++){

            char s = result.charAt(i);

            //click the mobile number from number pad
            driver.findElement(By.xpath("(//*[@text='"+s+"'])[1]")).click();
        }

        //click the continue button
        clickTheContinueBtn();

        try {
            if(driver.findElement(By.xpath("//*[@text='Enter the valid mobile number']")).isDisplayed()){
                test.log(LogStatus.PASS,"Enter the valid mobile number error message is displayed when user enter 4 digits");
                ut.PassedCaptureScreenshotAsBASE64(driver,test);
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Enter the valid mobile number error message is not displayed when user enter 4 digits");
            ut.FailedCaptureScreenshotAsBASE64(driver,test);
        }
    }

    public void updateTheMobileNumber_CustomerProfileScreen1(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //clear the Existing number
        click_Ele(getSearch_Screen_Number_C());

        String result = RandomStringUtils.randomNumeric(15);

        for (int i = 0; i < result.length(); i++){

            char s = result.charAt(i);

            //click the mobile number from number pad
            driver.findElement(By.xpath("//*[@text='"+s+"']")).click();
        }

        //click the continue button
        clickTheContinueBtn();
    }

    public void updateTheMobileNumber_CustomerProfileScreen() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //clear the Existing number
        Thread.sleep(500);
        click_Ele(getCustomer_Profile_Screen_Mobile_Number_C());

        String result = RandomStringUtils.randomNumeric(15);

        for (int i = 0; i < result.length(); i++){

            char s = result.charAt(i);

            //click the mobile number from number pad
            driver.findElement(By.xpath("(//*[@text='"+s+"'])[2]")).click();
        }

        //click the continue button
        clickTheContinueBtn();
    }

    public String updateAddCredit_CustomerProfileScreen2(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //clear the Existing number
        click_Ele(getSearch_Screen_Number_C());

        String result = "1000000";

        for (int i = 0; i < result.length(); i++){

            char s = result.charAt(i);

            //click the mobile number from number pad
            driver.findElement(By.xpath("//*[@text='"+s+"']")).click();
        }

        String result1 = "10000.00";

        System.out.println("------------------------------- val : "+result1);

        //click the add credit button
        click_Ele(getCustomer_Profile_Screen_Add_Add_Credit());

        return result1;
    }

    public String updateAddCredit_CustomerProfileScreen(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //clear the Existing number
        click_Ele(getSearch_Screen_Number_C());

        String result = RandomStringUtils.randomNumeric(4);

        for (int i = 0; i < result.length(); i++){

            char s = result.charAt(i);

            //click the mobile number from number pad
            driver.findElement(By.xpath("//*[@text='"+s+"']")).click();
        }

        String result1 = result.substring(0,2)+"."+result.substring(2);

        System.out.println("------------------------------- val : "+result1);

        //click the add credit button
        click_Ele(getCustomer_Profile_Screen_Add_Add_Credit());

        return result1;
    }

    public String updateAddCredit_CustomerProfileScreen1(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //clear the Existing number
        click_Ele(getSearch_Screen_Number_C());

        String result = RandomStringUtils.randomNumeric(4);

        for (int i = 0; i < result.length(); i++){

            char s = result.charAt(i);

            //click the mobile number from number pad
            driver.findElement(By.xpath("//*[@text='"+s+"']")).click();
        }

        //click the add credit button
        clickTheContinueBtn();

        String result1 = result.substring(0,2)+"."+result.substring(2);

        System.out.println("------------------------------- val1 : "+result1);

        return result1;
    }

    public String updateAddCredit_CustomerProfileScreen3(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //clear the Existing number
        click_Ele(getSearch_Screen_Number_C());

        String result = RandomStringUtils.randomNumeric(5);

        for (int i = 0; i < result.length(); i++){

            char s = result.charAt(i);

            //click the mobile number from number pad
            driver.findElement(By.xpath("//*[@text='"+s+"']")).click();
        }

        //click the add credit button
        clickTheContinueBtn();

        String result1 = result.substring(0,2)+"."+result.substring(2);

        System.out.println("------------------------------- val1 : "+result1);

        return result1;
    }

    public void clear_TheAddCredit_CustomerProfileScreen1() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //clear the Existing number
        click_Ele(getSearch_Screen_Number_C());

        //click the continue button
        clickTheContinueBtn();
    }

    public void clickTheEditButtonOfMobileNumber(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        click_Ele(getCustomer_Profile_Screen_Mobile_Edit_Btn());
    }

    public void clickTheContinueBtn(){
            //click the continue button
        click_Ele(getCustomer_Profile_Screen_Mobile_Continue());
    }

    public void clickTheContinueOption_WithErrorMessage(String msg) throws InterruptedException {
        //click the set till option
        click_Ele(getCustomer_Profile_Screen_Mobile_Continue());Thread.sleep(1200);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[contains(@text,'"+msg+"')]"))));
        text_Confirm(driver.findElement(By.xpath("//*[contains(@text,'"+msg+"')]")),msg);
    }

    public void verifyTheContinueButton(){
        try{
            if(getCustomer_Profile_Screen_Mobile_Continue().isDisplayed()){
                test.log(LogStatus.PASS,"Continue option is displayed");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Continue option is not displayed");
        }
    }

    public void clickTheNumber1(){
        //click the required number
        click_Ele(getSearch_Screen_Number_1());
    }

    public void clickTheNumber2(){
        //click the required number
        click_Ele(getSearch_Screen_Number_2());
    }

    public void clickTheNumber3(){
        //click the required number
        click_Ele(getSearch_Screen_Number_3());
    }

    public void clickTheNumber4(){
        //click the required number
        click_Ele(getSearch_Screen_Number_4());
    }

    public void clickTheNumber5(){
        //click the required number
        click_Ele(getSearch_Screen_Number_5());
    }

    public void clickTheNumber6(){
        //click the required number
        click_Ele(getSearch_Screen_Number_6());
    }

    public void clickTheNumber7(){
        //click the required number
        click_Ele(getSearch_Screen_Number_7());
    }

    public void clickTheNumber8(){
        //click the required number
        click_Ele(getSearch_Screen_Number_8());
    }
    public void clickTheNumber9(){
        //click the required number
        click_Ele(getSearch_Screen_Number_9());
    }
    public void clickTheNumber0(){
        //click the required number
        click_Ele(getSearch_Screen_Number_0());
    }

    public void clickBtnC() throws InterruptedException {
        //click the clear button
        click_Ele(getSearch_Screen_Number_C());
        Thread.sleep(200);
    }

    public void verifyTheNumpad(){
        try{
            if(getSearch_Screen_Number_0().isDisplayed() && getSearch_Screen_Number_1().isDisplayed()
            && getSearch_Screen_Number_2().isDisplayed() && getSearch_Screen_Number_3().isDisplayed()
            && getSearch_Screen_Number_4().isDisplayed() && getSearch_Screen_Number_5().isDisplayed()
            && getSearch_Screen_Number_6().isDisplayed() && getSearch_Screen_Number_7().isDisplayed()
            && getSearch_Screen_Number_8().isDisplayed() && getSearch_Screen_Number_9().isDisplayed()
            && getSearch_Screen_Number_C().isDisplayed()){
                test.log(LogStatus.PASS,"Numpad is available in the search screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Numpad is not available in the search screen");
        }
    }

    public void verifyTheNumpad1(){
        try{
            if(getSearch_Screen_Number_0().isDisplayed() && getSearch_Screen_Number_1().isDisplayed()
                    && getSearch_Screen_Number_2().isDisplayed() && getSearch_Screen_Number_3().isDisplayed()
                    && getSearch_Screen_Number_4().isDisplayed() && getSearch_Screen_Number_5().isDisplayed()
                    && getSearch_Screen_Number_6().isDisplayed() && getSearch_Screen_Number_7().isDisplayed()
                    && getSearch_Screen_Number_8().isDisplayed() && getSearch_Screen_Number_9().isDisplayed()
                    && getSearch_Screen_Number_C().isDisplayed()){
                test.log(LogStatus.PASS,"Numpad is available in the till screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Numpad is not available in the till screen");
        }
    }

    public void clickTheAddCustomerBtn(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click the Add Customer button
        click_Ele(getOrder_Screen_Add_Customer());
    }

    public void clickTheSearchCustomerButton(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click the search Customer button
        click_Ele(getOrder_Screen_Search_Customer());
    }

    public void clickTheCloseBtn() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click the search Customer button
        click_Ele(getSearch_Screen_Close_Btn());Thread.sleep(5000);
    }

    public void verifyTheAddCustomerPopup(){
        try {
            if(getSearch_Screen_Add_Customer_Title().isDisplayed()){
                test.log(LogStatus.PASS,"Add Customer popup is available after click the Add Customer");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Add Customer popup is not available after click the Add Customer");
        }
    }

    public void verifyTheAddCustomerPopup1(){
        try {
            if(getSearch_Screen_Add_Customer().isDisplayed()){
                test.log(LogStatus.FAIL,"Add Customer popup is available after click the Add Customer from the Retail Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.PASS,"Add Customer popup is not available after click the Add Customer from the Retail Screen");
        }
    }

    public void verifyTheNoResultsInAddCustomerPopup(){
        try {
            if(getSearch_Screen_No_Results().isDisplayed()){
                test.log(LogStatus.FAIL,"No Results search result is available after user enter the new mobile number/name");
            }
        }catch (Exception e){
            test.log(LogStatus.PASS,"No Results search result is not available after user enter the new mobile number/name");
        }
    }

    public void verifyTheByPhoneInSearchScreen(){
        try {
            if(getSearch_Screen_By_Phone().isDisplayed()){
                test.log(LogStatus.PASS,"By Phone is available after click the Add Customer from the Retail Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"By Phone is not available after click the Add Customer from the Retail Screen");
        }
    }

    public void verifyTheByNameOrEmailInSearchScreen(){
        try {
            if(getSearch_Screen_By_Name_Or_Email().isDisplayed()){
                test.log(LogStatus.PASS,"By Name Or Email is available after click the Add Customer from the Retail Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"By Name Or Email is not available after click the Add Customer from the Retail Screen");
        }
    }



    public void verifyTheCustomerName(String customerName){
        int cs = customerName.indexOf(" ");
        cs = cs + 2;
        customerName = customerName.substring(0,cs);

        try{
            if(driver.findElement(By.xpath("//android.widget.TextView[@text='"+customerName+"']")).isDisplayed()){
                test.log(LogStatus.PASS,"Added customer is attached in the retail screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Added customer is not attached in the retail screen");
        }
    }

    public void verifyTheCustomerName1(String firstName, String lastName){
        String customerName = firstName.concat(lastName);
        int cs = customerName.indexOf(" ");
        cs = cs + 2;
        customerName = customerName.substring(0,cs);

        try{
            if(driver.findElement(By.xpath("//android.widget.TextView[@text='"+customerName+"']")).isDisplayed()){
                test.log(LogStatus.PASS,"Added customer is attached in the retail screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Added customer is not attached in the retail screen");
        }
    }


    public void enterTheRandomMobileNumber(){
        String result = RandomStringUtils.randomNumeric(15);

        for (int i = 0; i < result.length(); i++){

            char s = result.charAt(i);

            //click the mobile number from number pad
            driver.findElement(By.xpath("//*[@text='"+s+"']")).click();
        }
    }

    public void enterTheRandomMobileNumber_LessThanSixCharacters_AndVerifyError(){
        String result = RandomStringUtils.randomNumeric(5);

        for (int i = 0; i < result.length(); i++){

            char s = result.charAt(i);

            //click the mobile number from number pad
            driver.findElement(By.xpath("//*[@text='"+s+"']")).click();
        }

        try{
            if(getSearch_Screen_Minimum_6_Characters_Required().isDisplayed()){
                test.log(LogStatus.PASS,"When user enter the minimum 6 characters in mobile number field then the error message is displayed");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"When user enter the minimum 6 characters in mobile number field then the error message is not displayed");
        }
    }

    public String getTheMobileNumberFromTheAddCustomer_SearchField(){
        return getSearch_Screen_Search().getText();
    }

    public void verifyTheAddedMobileNumberInCustomerProfileScreen(String mobNo){
        try{
            if(driver.findElement(By.xpath("//android.widget.Button[@text='"+mobNo+"']")).isDisplayed()){
                test.log(LogStatus.PASS,"Searched mobile number is available in the Customer Profile Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Searched mobile number is not available in the Customer Profile Screen");
        }
    }

    public void clickTheAddCustomer_SearchScreen(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click the Add Customer button
        click_Ele(getSearch_Screen_Add_Customer());
    }

    public void verifyTheCustomerProfileTitle(){
        try {
            if(getCustomer_Profile_Screen_Customer_Profile().isDisplayed()){
                getCustomer_Profile_Screen_Customer_Profile().click();
                test.log(LogStatus.PASS,"Customer Profile Screen is available after click the Add Customer button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Customer Profile Screen is not available after click the Add Customer button");
        }
    }

    public void verifyTheSearchBarInCustomerProfileScreen(){
        try {
            if(getCustomer_Profile_Screen_Search().isDisplayed()){
                test.log(LogStatus.PASS,"Search Bar(In Customer Profile Screen) is available after click the Add Customer button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Search Bar(In Customer Profile Screen) is not available after click the Add Customer button");
        }
    }

    public void verifyTheCustomerProfileScreenSearch(String st){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        getCustomer_Profile_Screen_Search().clear();
        //enter the required name
        getCustomer_Profile_Screen_Search().sendKeys(st);

        getCustomer_Profile_Screen_Search().click();

        try{
            if(driver.findElement(By.xpath("//android.view.View[contains(@text,'"+st+"')]")).isDisplayed()){
                test.log(LogStatus.PASS,"Searched customer is available in the Customer Profile Screen");
                driver.findElement(By.xpath("//android.view.View[contains(@text,'"+st+"')]")).click();
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Searched customer is not available in the Customer Profile Screen");
        }
    }

    public void verifyTheFirstNameInCustomerProfileScreen(){
        try {
            if(getCustomer_Profile_Screen_First_Name().isDisplayed()){
                test.log(LogStatus.PASS,"First Name(In Customer Profile Screen) is available after click the Add Customer button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"First Name(In Customer Profile Screen) is not available after click the Add Customer button");
        }
    }

    public void verifyTheSecondNameInCustomerProfileScreen(){
        try {
            if(getCustomer_Profile_Screen_Last_Name().isDisplayed()){
                test.log(LogStatus.PASS,"Last Name(In Customer Profile Screen) is available after click the Add Customer button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Last Name(In Customer Profile Screen) is not available after click the Add Customer button");
        }
    }

    public void verifyTheCustomerIDInCustomerProfileScreen(){
        try {
            if(getCustomer_Profile_Screen_Customer_ID().isDisplayed()){
                test.log(LogStatus.PASS,"Customer ID(In Customer Profile Screen) is available after click the Add Customer button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Customer ID(In Customer Profile Screen) is not available after click the Add Customer button");
        }
    }

    public void verifyTheEmailIDInCustomerProfileScreen(){
        try {
            if(getCustomer_Profile_Screen_Email_ID().isDisplayed()){
                test.log(LogStatus.PASS,"Email ID(In Customer Profile Screen) is available after click the Add Customer button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Email ID(In Customer Profile Screen) is not available after click the Add Customer button");
        }
    }

    public void verifyTheBirthDayInCustomerProfileScreen(){
        try {
            if(getCustomer_Profile_Screen_BirthDay().isDisplayed()){
                test.log(LogStatus.PASS,"Birth day(In Customer Profile Screen) is available after click the Add Customer button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Birth day(In Customer Profile Screen) is not available after click the Add Customer button");
        }
    }



    public void verifyTheMobileInCustomerProfileScreen(){
        try {
            if(getCustomer_Profile_Screen_Mobile().isDisplayed()){
                test.log(LogStatus.PASS,"Mobile Number(In Customer Profile Screen) is available after click the Add Customer button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Mobile Number(In Customer Profile Screen) is not available after click the Add Customer button");
        }
    }

    public void verifyTheNationalityInCustomerProfileScreen(){
        try {
            if(getCustomer_Profile_Screen_Nationality().isDisplayed()){
                test.log(LogStatus.PASS,"Nationality(In Customer Profile Screen) is available after click the Add Customer button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Nationality(In Customer Profile Screen) is not available after click the Add Customer button");
        }
    }

    public void verifyTheNotesInCustomerProfileScreen(){
        try {
            if(getCustomer_Profile_Screen_Notes().isDisplayed()){
                test.log(LogStatus.PASS,"Notes(In Customer Profile Screen) is available after click the Add Customer button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Notes(In Customer Profile Screen) is not available after click the Add Customer button");
        }
    }

    public void enterTheNotes(){
        String notes = RandomStringUtils.randomAlphabetic(20);

        //enter the notes
        getCustomer_Profile_Screen_Notes().sendKeys(notes);
    }

    public void verifyTheAddressInCustomerProfileScreen(){
        try {
            if(getCustomer_Profile_Screen_Add_Address().isDisplayed()){
                test.log(LogStatus.PASS,"Add Address(In Customer Profile Screen) is available after click the Add Customer button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Add Address(In Customer Profile Screen) is not available after click the Add Customer button");
        }
    }

    public void verifyTheMapInCustomerProfileScreen(){
        try {
            if(getCustomer_Profile_Screen_Map().isDisplayed()){
                test.log(LogStatus.PASS,"Map(In Customer Profile Screen) is available after click the Add Customer button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Map(In Customer Profile Screen) is not available after click the Add Customer button");
        }
    }

    public void verifyThePreviousOrdersInCustomerProfileScreen(){
        try {
            if(getCustomer_Profile_Screen_Previous_Orders().isDisplayed()){
                test.log(LogStatus.PASS,"Previous Orders(In Customer Profile Screen) is available after click the Add Customer button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Previous Orders(In Customer Profile Screen) is not available after click the Add Customer button");
        }
    }

    public void verifyTheNoPreviousOrdersInCustomerProfileScreen(){
        try {
            if(getCustomer_Profile_Screen_No_Previous_Order().isDisplayed()){
                test.log(LogStatus.PASS,"No Previous Orders(In Customer Profile Screen) is available after click the Add Customer button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"No Previous Orders(In Customer Profile Screen) is not available after click the Add Customer button");
        }
    }

    public void verifyTheCustomerPlanInCustomerProfileScreen(){
        try {
            if(getCustomer_Profile_Screen_Customer_Plan().isDisplayed()){
                test.log(LogStatus.PASS,"Customer Plan(In Customer Profile Screen) is available after click the Add Customer button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Customer Plan(In Customer Profile Screen) is not available after click the Add Customer button");
        }
    }

    public void clickTheCustomerPlan(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        click_Ele(getCustomer_Profile_Screen_Customer_Plan());
    }

    public void verifyTheDisplayOrderInCustomerProfileScreen(){
        try {
            if(getCustomer_Profile_Screen_Display_Order().isDisplayed()){
                test.log(LogStatus.PASS,"Display Order(In Customer Profile Screen) is available after click the Add Customer button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Display Order(In Customer Profile Screen) is not available after click the Add Customer button");
        }
    }

    public void clickTheDisplayOrderButton(){
        //click the display order button
        click_Ele(getCustomer_Profile_Screen_Display_Order());
    }

    public void verifyTheRepeatOrderInCustomerProfileScreen(){
        try {
            if(getCustomer_Profile_Screen_Repeat_Order().isDisplayed()){
                test.log(LogStatus.PASS,"Repeat Order(In Customer Profile Screen) is available after click the Add Customer button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Repeat Order(In Customer Profile Screen) is not available after click the Add Customer button");
        }
    }

    public void clickTheRepeatOrder(){
        //click the repeat order
        click_Ele(getCustomer_Profile_Screen_Repeat_Order());
    }

    public void verifyTheCloseBtnInCustomerProfileScreen(){
        try {
            if(getSearch_Screen_Close_Btn().isDisplayed()){
                test.log(LogStatus.PASS,"Close Button(In Customer Profile Screen) is available after click the Add Customer button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Close Button(In Customer Profile Screen) is not available after click the Add Customer button");
        }
    }

    public void verifyTheSaveBtnInCustomerProfileScreen(){
        try {
            if(getCustomer_Profile_Screen_Save().isDisplayed()){
                test.log(LogStatus.PASS,"Save button(In Customer Profile Screen) is available after click the Add Customer button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Save button(In Customer Profile Screen) is not available after click the Add Customer button");
        }
    }

    public void verifyTheTaxExemptInCustomerProfileScreen(){
        try {
            if(getCustomer_Profile_Screen_Tax_Exempt().isDisplayed()){
                test.log(LogStatus.PASS,"Tax Exempt(In Customer Profile Screen) is available after click the Add Customer button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Tax Exempt(In Customer Profile Screen) is not available after click the Add Customer button");
        }
    }

    public void enableTheTaxExemptCustomer()
    {
        try {
            if(getCustomer_Profile_Screen_Tax_Exempt_disabled().isDisplayed()){
                test.log(LogStatus.PASS,"Tax Exempt - Disabled (In Customer Profile Screen) is available after click the Add Customer button");

                click_Ele(getCustomer_Profile_Screen_Tax_Exempt());
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Tax Exempt - Disabled (In Customer Profile Screen) is not available after click the Add Customer button");
        }

    }

    public void verifyTheProfileImageInCustomerProfileScreen(){
        try {
            if(getCustomer_Profile_Screen_Profile_Image().isDisplayed()){
                test.log(LogStatus.PASS,"Profile Image(In Customer Profile Screen) is available after click the Add Customer button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Profile Image(In Customer Profile Screen) is not available after click the Add Customer button");
        }
    }

    public void verifyTheAddCreditInCustomerProfileScreen(){
        try {
            if(getCustomer_Profile_Screen_Add_Credit().isDisplayed()){
                test.log(LogStatus.PASS,"Add Credit button(In Customer Profile Screen) is available after click the Add Customer button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Add Credit button(In Customer Profile Screen) is not available after click the Add Customer button");
        }
    }

    public void clickTheAddCreditButton(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //click the add credit button
        click_Ele(getCustomer_Profile_Screen_Add_Credit());
    }

    public void enterTheFirstName(){
        String fn = RandomStringUtils.randomAlphabetic(15);

        //clear the first name
        getCustomer_Profile_Screen_First_Name().clear();

        //enter the first name
        getCustomer_Profile_Screen_First_Name().sendKeys(fn);

        getCustomer_Profile_Screen_Customer_Profile().click();

    }

    public void enterTheLastName(){
        String ln = RandomStringUtils.randomAlphabetic(15);

        //enter the last name
        getCustomer_Profile_Screen_Last_Name().sendKeys(ln);
    }

    public void clickTheSaveBtn(){
        //click the save button
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        click_Ele(getCustomer_Profile_Screen_Save());
    }

    public void verifyTheAlertMessage(String msg){
        try{
            if(driver.findElement(By.xpath("//*[contains(@text,'"+msg+"')]")).isDisplayed()){
                test.log(LogStatus.PASS,"Error/Warning message is displayed when user click the save button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Error/Warning message is not displayed when user click the save button");
        }
    }

    public void clickTheDoneButton(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //click the done
        click_Ele(getCustomer_Profile_Screen_Done_Btn());
    }

    public void enterCustomerIdentificationNumber(){
        String cid = RandomStringUtils.randomNumeric(15);

        //enter the last name
        getCustomer_Profile_Screen_Last_Name().sendKeys(cid);
    }

    public void enterTheMailId(){
        String mail = RandomStringUtils.randomAlphanumeric(15);

        //enter the mail id
        getCustomer_Profile_Screen_Email_ID().sendKeys(mail+"@mail.com");
    }

    public void selectTheBirthDate(){
        //click the birthday calendar
        click_Ele(getCustomer_Profile_Screen_BirthDay());

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //click the current date
        click_Ele(getCustomer_Profile_Screen_BirthDay_Current_Date());
    }
    
}
