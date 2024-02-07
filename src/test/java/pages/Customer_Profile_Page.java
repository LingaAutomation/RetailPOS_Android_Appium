package pages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testcontainers.shaded.org.apache.commons.lang.RandomStringUtils;

import java.util.concurrent.TimeUnit;

public class Customer_Profile_Page extends Appium_Base_Class{

    @AndroidFindBy(xpath = "//*[@text='Add Customer']")
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

    @AndroidFindBy(xpath = "//*[@text='Done']")
    WebElement Customer_Profile_Screen_Done_Btn;

    @AndroidFindBy(xpath = "//*[@text='Notes']")
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

    @AndroidFindBy(xpath = "//*[contains(@text,'+ Add customer')]")
    WebElement Search_Screen_Add_Customer;

    @AndroidFindBy(xpath = "//*[contains(@text,'Customer Profile')]")
    WebElement Customer_Profile_Screen_Customer_Profile;

    @AndroidFindBy(xpath = "//*[contains(@text,'Map')]")
    WebElement Customer_Profile_Screen_Map;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
    WebElement Customer_Profile_Screen_Search;

    @AndroidFindBy(xpath = "//*[contains(@text,'First Name')]")
    WebElement Customer_Profile_Screen_First_Name;

    @AndroidFindBy(xpath = "//*[contains(@text,'Last Name')]")
    WebElement Customer_Profile_Screen_Last_Name;

    @AndroidFindBy(xpath = "//*[contains(@text,'Customer identification number')]")
    WebElement Customer_Profile_Screen_Customer_ID;

    @AndroidFindBy(xpath = "//*[contains(@text,'Email ID')]")
    WebElement Customer_Profile_Screen_Email_ID;

    @AndroidFindBy(xpath = "//*[contains(@text,'Birthday')]")
    WebElement Customer_Profile_Screen_BirthDay;

    @AndroidFindBy(xpath = "//*[@focused='true']")
    WebElement Customer_Profile_Screen_BirthDay_Current_Date;

    @AndroidFindBy(xpath = "//*[contains(@text,'Mobile')]")
    WebElement Customer_Profile_Screen_Mobile;

    @AndroidFindBy(xpath = "//*[contains(@text,'Nationality')]")
    WebElement Customer_Profile_Screen_Nationality;

    @AndroidFindBy(xpath = "//*[contains(@text,'+Add')]")
    WebElement Customer_Profile_Screen_Mobile_Add_Btn;

    @AndroidFindBy(xpath = "//*[contains(@text,'Edit')]")
    WebElement Customer_Profile_Screen_Mobile_Edit_Btn;

    @AndroidFindBy(xpath = "//*[contains(@text,'Delete')]")
    WebElement Customer_Profile_Screen_Mobile_Delete_Btn;

    @AndroidFindBy(xpath = "((//*[contains(@text,'+Add')])[2]")
    WebElement Customer_Profile_Screen_Address_Add_Btn;

    @AndroidFindBy(xpath = "//*[contains(@text,'Tax Exempt')]")
    WebElement Customer_Profile_Screen_Tax_Exempt;

    @AndroidFindBy(xpath = "//*[contains(@text,'Add Credit')]")
    WebElement Customer_Profile_Screen_Add_Credit;

    @AndroidFindBy(xpath = "//*[contains(@text,'Previous Orders')]")
    WebElement Customer_Profile_Screen_Previous_Orders;

    @AndroidFindBy(xpath = "//*[contains(@text,'No Previous Order')]")
    WebElement Customer_Profile_Screen_No_Previous_Order;

    @AndroidFindBy(xpath = "//*[contains(@text,'Customer Plan')]")
    WebElement Customer_Profile_Screen_Customer_Plan;

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

    public WebElement getOrder_Screen_Add_Customer(){return Order_Screen_Add_Customer;}

    public WebElement getOrder_Screen_Search_Customer(){return Order_Screen_Search_Customer;}

    public WebElement getSearch_Screen_Add_Customer_Title() {return Search_Screen_Add_Customer_Title;}

    public WebElement getSearch_Screen_Search_Customer(){return Search_Screen_Search_Customer;}

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

    public WebElement getCustomer_Profile_Screen_Address_Add_Btn() {return Customer_Profile_Screen_Address_Add_Btn;}

    public WebElement getCustomer_Profile_Screen_Mobile() {return Customer_Profile_Screen_Mobile;}

    public WebElement getSearch_Screen_Number_2() {return Search_Screen_Number_2;}

    public WebElement getSearch_Screen_Add_Customer() {return Search_Screen_Add_Customer;}

    public WebElement getCustomer_Profile_Screen_Add_Credit() {return Customer_Profile_Screen_Add_Credit;}

    public WebElement getSearch_Screen_Minimum_6_Characters_Required() {return Search_Screen_Minimum_6_Characters_Required;}

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

    public void clickTheContinueBtn(){
            //click the continue button
        click_Ele(getCustomer_Profile_Screen_Mobile_Continue());
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

    public void clickBtnC(){
        //click the clear button
        click_Ele(getSearch_Screen_Number_C());
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

    public void clickTheCloseBtn(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click the search Customer button
        click_Ele(getSearch_Screen_Close_Btn());
    }

    public void verifyTheAddCustomerPopup(){
        try {
            if(getSearch_Screen_Add_Customer().isDisplayed()){
                test.log(LogStatus.PASS,"Add Customer popup is available after click the Add Customer from the Retail Screen");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Add Customer popup is not available after click the Add Customer from the Retail Screen");
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

    public void enterTheRandomMobileNumber(){
        String result = RandomStringUtils.randomNumeric(15);

        for (int i = 0; i < result.length(); i++){

            char s = result.charAt(i);

            //click the mobile number from number pad
            driver.findElement(By.xpath("//*[@text='"+s+"']")).click();
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

    public void verifyTheDisplayOrderInCustomerProfileScreen(){
        try {
            if(getCustomer_Profile_Screen_Display_Order().isDisplayed()){
                test.log(LogStatus.PASS,"Display Order(In Customer Profile Screen) is available after click the Add Customer button");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Display Order(In Customer Profile Screen) is not available after click the Add Customer button");
        }
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

    public void enterTheFirstName(){
        String fn = RandomStringUtils.randomAlphabetic(15);

        //enter the first name
        getCustomer_Profile_Screen_First_Name().sendKeys(fn);
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
