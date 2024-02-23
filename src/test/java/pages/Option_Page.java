package pages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Option_Page extends Appium_Base_Class{

    @AndroidFindBy(xpath = "//*[@text='Option']")
    WebElement Order_Screen_OptionBtn;

    @AndroidFindBy(xpath = "//*[@text='Check Option']")
    WebElement Order_Screen_Check_Option;

    @AndroidFindBy(xpath = "//*[@text='Tax Exempt']")
    WebElement Order_Screen_Check_Option_Tax_Exempt;

    @AndroidFindBy(xpath = "//*[@text='Discount']")
    WebElement Order_Screen_Check_Option_Discount;

    @AndroidFindBy(xpath = "//*[@text='Open Item']")
    WebElement Order_Screen_Check_Option_Open_Item;

    @AndroidFindBy(xpath = "//*[@text='Gift Card']")
    WebElement Order_Screen_Check_Option_Gift_Card;

    @AndroidFindBy(xpath = "//*[@text='Search Item']")
    WebElement Order_Screen_Check_Option_Search_Item;

    @AndroidFindBy(xpath = "//*[@text='Open Cash Drawer']")
    WebElement Order_Screen_Check_Option_Open_Cash_Drawer;

    @AndroidFindBy(xpath = "//*[@text='Service Exempt']")
    WebElement Order_Screen_Check_Option_Service_Exempt;

    @AndroidFindBy(xpath = "//*[@text='Void']")
    WebElement Order_Screen_Check_Option_Void;

    @AndroidFindBy(xpath = "//*[@text='Print']")
    WebElement Order_Screen_Check_Option_Print;

    @AndroidFindBy(xpath = "//*[@text='Modify']")
    WebElement Order_Screen_Check_Option_Modify;

    @AndroidFindBy(xpath = "//*[@text='Apply Store Credit']")
    WebElement Order_Screen_Check_Option_Apply_Store_Credit;

    @AndroidFindBy(xpath = "//*[@text='EBT balance']")
    WebElement Order_Screen_Check_Option_EBT_balance;

    @AndroidFindBy(xpath = "//*[@text='Cancel']")
    WebElement Order_Screen_Check_Option_Cancel;

    @AndroidFindBy(xpath = "//*[@text='Tax']")
    WebElement Order_Screen_Tax_Txt;

    @AndroidFindBy(xpath = "//*[@text='Service Charge']")
    WebElement Order_Screen_Service_Charge_Txt;

    @AndroidFindBy(xpath = "//*[contains(@text,'Tax exempt removed successfully')]")
    WebElement Tax_Exempt_Popup_Text;

    @AndroidFindBy(xpath = "//*[contains(@text,'Please attach customer to apply store credits')]")
    WebElement Store_Credit_Popup_Text;

    @AndroidFindBy(xpath = "//android.app.Dialog/android.widget.TextView")
    WebElement Order_Screen_Check_Option_Discount_Empty;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    WebElement Order_Screen_Check_Option_Discount_Search;

    @AndroidFindBy(xpath = "//*[@text='Discounts']")
    WebElement Order_Screen_Check_Option_Discount_Discounts;

    @AndroidFindBy(xpath = "//android.app.Dialog/android.view.View[1]/android.view.View[3]/android.widget.Button")
    WebElement Order_Screen_Check_Option_Discount_Filter;

    @AndroidFindBy(xpath = "//*[@text='Discount']")
    WebElement Order_Screen_Check_Option_Discount_Filter_ItemAndCheck_Discount;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id]")
    WebElement Order_Screen_Discount_Txt;

    @AndroidFindBy(xpath = "//*[@text='Open Item']")
    WebElement Order_Screen_Check_Option_OpenItem_Open_Item;

    @AndroidFindBy(xpath = "//*[@text='Item Name:']")
    WebElement Order_Screen_Check_Option_OpenItem_Item_Name;

    @AndroidFindBy(xpath = "(//*[@text='Item Name:']/..//android.widget.EditText)[1]")
    WebElement Order_Screen_Check_Option_OpenItem_Item_Name_TextBox;

    @AndroidFindBy(xpath = "//*[@text='Price']")
    WebElement Order_Screen_Check_Option_OpenItem_Price;

    @AndroidFindBy(xpath = "(//*[@text='Item Name:']/..//android.widget.EditText)[2]")
    WebElement Order_Screen_Check_Option_OpenItem_Price_TextBox;

    @AndroidFindBy(xpath = "//*[@text='Tax']")
    WebElement Order_Screen_Check_Option_OpenItem_Tax;

    @AndroidFindBy(xpath = "//*[@text='Item Name:']/..//android.widget.ListView")
    WebElement Order_Screen_Check_Option_OpenItem_Tax_ListBox;

    @AndroidFindBy(xpath = "//*[@text='Done']")
    WebElement Order_Screen_Check_Option_OpenItem_Done;

    @AndroidFindBy(xpath = "//android.widget.ListView/android.view.View[1]")
    WebElement Order_Screen_Check_Option_OpenItem_First_TaX;

    @AndroidFindBy(xpath = "//*[@resource-id='react-ordder-list-render']//android.widget.TextView[1]")
    WebElement FirstMenuItem_OrderScreen;

    @AndroidFindBy(xpath = "//*[@resource-id='react-ordder-list-render']//android.widget.TextView[5]")
    WebElement FirstMenuItemPrice_OrderScreen;

    @AndroidFindBy(xpath = "//*[@text='Gift Card']")
    WebElement Order_Screen_Check_Option_GiftCard_GiftCard;

    @AndroidFindBy(xpath = "//*[@text='Gift Card' and @focused='true']")
    WebElement Order_Screen_Check_Option_GiftCardEnabled_GiftCard;

    @AndroidFindBy(xpath = "//*[@text='GiveX' and @focused='false']")
    WebElement Order_Screen_Check_Option_GiveXDisabled_GiftCard;

    @AndroidFindBy(xpath = "//*[@text='Factor 4' and @focused='false']")
    WebElement Order_Screen_Check_Option_Factor_4Disabled_GiftCard;

    @AndroidFindBy(xpath = "//*[@text='GiveX']")
    WebElement Order_Screen_Check_Option_GiftCard_GiveX;

    @AndroidFindBy(xpath = "//*[@text='Factor 4']")
    WebElement Order_Screen_Check_Option_GiftCard_Factor_4;

    @AndroidFindBy(xpath = "//*[@text='Card Number']")
    WebElement Order_Screen_Check_Option_GiftCard_CardNumber;

    @AndroidFindBy(xpath = "//*[@text='0000 0000 0000 0000']")
    WebElement Order_Screen_Check_Option_GiftCard_CardNumber0;

    @AndroidFindBy(xpath = "//*[contains(@text,'Beginning Balance :')]")
    WebElement Order_Screen_Check_Option_GiftCard_BeginningBalance;

    @AndroidFindBy(xpath = "//*[contains(@text,'Recuring Balance :')]")
    WebElement Order_Screen_Check_Option_GiftCard_RecuringBalance;

    @AndroidFindBy(xpath = "//*[contains(@text,'Charge Amount')]")
    WebElement Order_Screen_Check_Option_GiftCard_ChargeAmount;

    @AndroidFindBy(xpath = "//*[contains(@text,'Suspend Account')]/..//android.widget.ToggleButton")
    WebElement Order_Screen_Check_Option_GiftCard_Suspend_Account;

    @AndroidFindBy(xpath = "//*[contains(@text,'Suspend Account')]/..//android.widget.ToggleButton[@checked='true']")
    WebElement Order_Screen_Check_Option_GiftCard_Suspend_Account_Enabled;

    @AndroidFindBy(xpath = "//*[contains(@text,'Activate Account')]/..//android.widget.ToggleButton[@checked='false']")
    WebElement Order_Screen_Check_Option_GiftCard_Suspend_Account_Disabled;

    @AndroidFindBy(xpath = "//*[contains(@text,'Charge Amount')]/..//android.widget.TextView[2]")
    WebElement Order_Screen_Check_Option_GiftCard_ChargeAmount_Value;

    @AndroidFindBy(xpath = "//*[@resource-id='alert-done-popup']/android.widget.TextView")
    WebElement Order_Screen_GiftCard_POP_up_Text;

    @AndroidFindBy(xpath = "//android.widget.EditText[@focused='true']")
    WebElement Order_Screen_Search_Focused;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id='mat-option-0']")
    WebElement Order_Screen_Search_First_Item;

    @AndroidFindBy(xpath = "//*[@text='Search Customer']/../../android.view.View[1]/android.view.View/android.widget.TextView")
    WebElement Order_Screen_Attached_Customer;

    @AndroidFindBy(xpath = "//*[@text='+Add Credit']")
    WebElement Customer_Profile_Screen_Add_CreditBtn;

    @AndroidFindBy(xpath = "(//*[@text='Edit'])[3]")
    WebElement Customer_Profile_Screen_EditBtn;

    @AndroidFindBy(xpath = "//*[@text='Save']")
    WebElement Customer_Profile_Screen_SaveBtn;

    @AndroidFindBy(xpath = "//*[@text='Apply Store Credit']")
    WebElement Order_Screen_Apply_Store_Credit;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    WebElement Order_Screen_Apply_Store_Credit_EditBox;

    @AndroidFindBy(xpath = "//*[@text='Apply Credit']")
    WebElement Order_Screen_Apply_Credit;



    public WebElement getOrder_Screen_OptionBtn(){return Order_Screen_OptionBtn;}

    public WebElement getOrder_Screen_Discount_Txt() {return Order_Screen_Discount_Txt;}

    public WebElement getOrder_Screen_Check_Option(){return Order_Screen_Check_Option;}

    public WebElement getOrder_Screen_Check_Option_Tax_Exempt(){return Order_Screen_Check_Option_Tax_Exempt;}

    public WebElement getOrder_Screen_Check_Option_Discount(){return Order_Screen_Check_Option_Discount;}

    public WebElement getOrder_Screen_Check_Option_Open_Item(){return Order_Screen_Check_Option_Open_Item;}

    public WebElement getOrder_Screen_Check_Option_Gift_Card() {return Order_Screen_Check_Option_Gift_Card;}

    public WebElement getOrder_Screen_Check_Option_Search_Item() {return Order_Screen_Check_Option_Search_Item;}

    public WebElement getOrder_Screen_Check_Option_Open_Cash_Drawer() {return Order_Screen_Check_Option_Open_Cash_Drawer;}

    public WebElement getOrder_Screen_Check_Option_Service_Exempt() {return Order_Screen_Check_Option_Service_Exempt;}

    public WebElement getOrder_Screen_Check_Option_Void() {return Order_Screen_Check_Option_Void;}

    public WebElement getOrder_Screen_Check_Option_Print() {return Order_Screen_Check_Option_Print;}

    public WebElement getOrder_Screen_Check_Option_Modify() {return Order_Screen_Check_Option_Modify;}

    public WebElement getOrder_Screen_Check_Option_Apply_Store_Credit() {return Order_Screen_Check_Option_Apply_Store_Credit;}

    public WebElement getOrder_Screen_Check_Option_EBT_balance() {return Order_Screen_Check_Option_EBT_balance;}

    public WebElement getOrder_Screen_Check_Option_Cancel() {return Order_Screen_Check_Option_Cancel;}

    public WebElement getOrder_Screen_Tax() {return Order_Screen_Tax_Txt;}

    public WebElement getOrder_Screen_Service_Charge_Txt() {return Order_Screen_Service_Charge_Txt;}

    public WebElement getOrder_Screen_Check_Option_Discount_Discounts() {return Order_Screen_Check_Option_Discount_Discounts;}

    public WebElement getOrder_Screen_Check_Option_Discount_Search() {return Order_Screen_Check_Option_Discount_Search;}

    public WebElement getOrder_Screen_Check_Option_Discount_Filter() {return Order_Screen_Check_Option_Discount_Filter;}

    public WebElement getOrder_Screen_Check_Option_Discount_Empty() {return Order_Screen_Check_Option_Discount_Empty;}

    public WebElement getOrder_Screen_Check_Option_Discount_Filter_ItemAndCheck_Discount() {return Order_Screen_Check_Option_Discount_Filter_ItemAndCheck_Discount;}

    public WebElement getOrder_Screen_Check_Option_OpenItem_Open_Item() {return Order_Screen_Check_Option_OpenItem_Open_Item;}

    public WebElement getOrder_Screen_Check_Option_OpenItem_Item_Name() {return Order_Screen_Check_Option_OpenItem_Item_Name;}

    public WebElement getOrder_Screen_Check_Option_OpenItem_Item_Name_TextBox() {return Order_Screen_Check_Option_OpenItem_Item_Name_TextBox;}

    public WebElement getOrder_Screen_Check_Option_OpenItem_Price() {return Order_Screen_Check_Option_OpenItem_Price;}

    public WebElement getOrder_Screen_Check_Option_OpenItem_Price_TextBox() {return Order_Screen_Check_Option_OpenItem_Price_TextBox;}

    public WebElement getOrder_Screen_Check_Option_OpenItem_Tax() {return Order_Screen_Check_Option_OpenItem_Tax;}

    public WebElement getOrder_Screen_Check_Option_OpenItem_Tax_ListBox() {return Order_Screen_Check_Option_OpenItem_Tax_ListBox;}

    public WebElement getOrder_Screen_Check_Option_OpenItem_Done() {return Order_Screen_Check_Option_OpenItem_Done;}

    public WebElement getOrder_Screen_Check_Option_OpenItem_First_TaX() {return Order_Screen_Check_Option_OpenItem_First_TaX;}

    public WebElement getFirstMenuItem_OrderScreen() {return FirstMenuItem_OrderScreen;}

    public WebElement getFirstMenuItemPrice_OrderScreen() {return FirstMenuItemPrice_OrderScreen;}

    public WebElement getOrder_Screen_Check_Option_GiftCard_GiftCard() {return Order_Screen_Check_Option_GiftCard_GiftCard;}

    public WebElement getOrder_Screen_Check_Option_GiftCard_GiveX() {return Order_Screen_Check_Option_GiftCard_GiveX;}

    public WebElement getOrder_Screen_Check_Option_GiftCard_Factor_4() {return Order_Screen_Check_Option_GiftCard_Factor_4;}

    public WebElement getOrder_Screen_Check_Option_GiftCard_CardNumber() {return Order_Screen_Check_Option_GiftCard_CardNumber;}

    public WebElement getOrder_Screen_Check_Option_GiftCard_CardNumber0() {return Order_Screen_Check_Option_GiftCard_CardNumber0;}

    public WebElement getOrder_Screen_Check_Option_GiftCard_BeginningBalance() {return Order_Screen_Check_Option_GiftCard_BeginningBalance;}

    public WebElement getOrder_Screen_Check_Option_GiftCard_RecuringBalance() {return Order_Screen_Check_Option_GiftCard_RecuringBalance;}

    public WebElement getOrder_Screen_Check_Option_GiftCard_ChargeAmount() {return Order_Screen_Check_Option_GiftCard_ChargeAmount;}

    public WebElement getOrder_Screen_Check_Option_GiftCard_Suspend_Account() {return Order_Screen_Check_Option_GiftCard_Suspend_Account;}

    public WebElement getOrder_Screen_Check_Option_GiftCard_ChargeAmount_Value() {return Order_Screen_Check_Option_GiftCard_ChargeAmount_Value;}

    public WebElement getOrder_Screen_Check_Option_GiftCard_Suspend_Account_Enabled() {return Order_Screen_Check_Option_GiftCard_Suspend_Account_Enabled;}

    public WebElement getOrder_Screen_Check_Option_GiftCard_Suspend_Account_Disabled() {return Order_Screen_Check_Option_GiftCard_Suspend_Account_Disabled;}

    public WebElement getOrder_Screen_Check_Option_GiftCardEnabled_GiftCard() {return Order_Screen_Check_Option_GiftCardEnabled_GiftCard;}

    public WebElement getOrder_Screen_Check_Option_GiveXDisabled_GiftCard() {return Order_Screen_Check_Option_GiveXDisabled_GiftCard;}

    public WebElement getOrder_Screen_Check_Option_Factor_4Disabled_GiftCard() {return Order_Screen_Check_Option_Factor_4Disabled_GiftCard;}

    public WebElement getOrder_Screen_Search_Focused() {return Order_Screen_Search_Focused;}

    public WebElement getOrder_Screen_Search_First_Item() {return Order_Screen_Search_First_Item;}

    public WebElement getCustomer_Profile_Screen_Add_CreditBtn() {return Customer_Profile_Screen_Add_CreditBtn;}

    public WebElement getCustomer_Profile_Screen_EditBtn() {return Customer_Profile_Screen_EditBtn;}

    public WebElement getCustomer_Profile_Screen_SaveBtn() {return Customer_Profile_Screen_SaveBtn;}

    public WebElement getOrder_Screen_Apply_Credit() {return Order_Screen_Apply_Credit;}

    public WebElement getOrder_Screen_Apply_Store_Credit() {return Order_Screen_Apply_Store_Credit;}

    public WebElement getOrder_Screen_Apply_Store_Credit_EditBox() {return Order_Screen_Apply_Store_Credit_EditBox;}

    public WebElement getOrder_Screen_Attached_Customer() {return Order_Screen_Attached_Customer;}



    public void clickTheAttachedCustomer() throws InterruptedException {
        //click the attached customer
        click_Ele(getOrder_Screen_Attached_Customer());
        Thread.sleep(3000);
    }

    public void clickTheAddCreditBtn() throws InterruptedException {
        //click the add credit button
        click_Ele(getCustomer_Profile_Screen_Add_CreditBtn());
        Thread.sleep(700);
    }

    public void clickTheEditBtn(){
        //click the edit btn
        click_Ele(getCustomer_Profile_Screen_EditBtn());
    }

    public void clickTheSaveBtn(){
        //click the save btn
        click_Ele(getCustomer_Profile_Screen_SaveBtn());
    }

    public void verifyTheApplyStoreCredit_RetailScreen(){
        try {
            if(getOrder_Screen_Apply_Store_Credit().isDisplayed()) {
                test.log(LogStatus.PASS, "Apply Store Credit is displayed when user click the Apply Store Credit from the Check option screen");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Apply Store Credit is not displayed when user click the Apply Store Credit from the Check option screen");
        }
    }

    public void clickTheApplyStoreCreditEditBox(){
        //click the edit box
        click_Ele(getOrder_Screen_Apply_Store_Credit_EditBox());
    }

    public void clickTheApplyCreditBtn(String msg){
        //click the apply credit
        click_Ele(getOrder_Screen_Apply_Credit());

        try{
            text_Confirm_without_Screenshot(Store_Credit_Popup_Text,msg);
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Store Credit Applied notification is not displayed when click the apply credit from the apply store credit popup");
        }
    }

    public void SearchTheItem() throws InterruptedException {
        String s = "Standard Item 3";
        //search the item
        getOrder_Screen_Search_Focused().sendKeys(s);
        getOrder_Screen_Search_Focused().click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[contains(@resource-id,'mat-option') and contains(@text,'"+s+"')]")).click();
        //click_Ele(getOrder_Screen_Search_First_Item());
    }

    public void SearchTheItem1() throws InterruptedException {
        String s = "151623524558";
        //search the item
        getOrder_Screen_Search_Focused().sendKeys(s);
        getOrder_Screen_Search_Focused().click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[contains(@resource-id,'mat-option')]")).click();
        //click_Ele(getOrder_Screen_Search_First_Item());
    }

    public void verifyTheSearchIsFocused_RetailScreen(){
        try {
            if(getOrder_Screen_Search_Focused().isDisplayed()) {
                test.log(LogStatus.PASS, "Search text box is focused when user click the Search Item from the Check option screen");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Search text box is not focused when user click the Search Item from the Check option screen");
        }
    }

    public void verifyTheChargeAmountValueAfterEnterTheAmount_GiftCardScreen(){
        try {
            if(getOrder_Screen_Check_Option_GiftCard_ChargeAmount_Value().isDisplayed()) {
                 String val = getOrder_Screen_Check_Option_GiftCard_ChargeAmount_Value().getText();
                if(val.contains("30.00")){
                    test.log(LogStatus.PASS, "Charge Amount Value is updated after enter the amount in the Gift card popup");
                }else{
                    test.log(LogStatus.FAIL, "Charge Amount Value is not updated after enter the amount in the Gift card popup");
                }
            }
        }catch(Exception ignored) {
       }
    }

    public void verifyThePopupWithOutChargeAmount(String msg){
        text_Confirm(Order_Screen_GiftCard_POP_up_Text, msg);
    }

    public void verifyTheSuspendAccountEnabled_GiftCardScreen(){
        try {
            if(getOrder_Screen_Check_Option_GiftCard_Suspend_Account_Enabled().isDisplayed()) {
                test.log(LogStatus.PASS, "Suspend Account is displayed(Enabled by default) in the Gift card popup after enter the gift card number");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Suspend Account is not displayed(Enabled by default) in the Gift card popup after enter the gift card number");
        }
    }

    public void verifyTheSuspendAccountDisabled_GiftCardScreen(String msg){

        try {
            if(getOrder_Screen_Check_Option_GiftCard_Suspend_Account_Enabled().isDisplayed()) {
                //click the suspend account
                getOrder_Screen_Check_Option_GiftCard_Suspend_Account().click();
            }
        }catch(Exception ignored) {}

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        text_Confirm(Order_Screen_GiftCard_POP_up_Text, msg);

        click_Ele(getOrder_Screen_Check_Option_OpenItem_Done());

        try {
            if(getOrder_Screen_Check_Option_GiftCard_Suspend_Account_Disabled().isDisplayed()) {
                test.log(LogStatus.PASS, "Activate Account is displayed(after disable the suspend account toggle) in the Gift card popup after enter the gift card number");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Activate Account is not displayed(after disable the suspend account toggle) in the Gift card popup after enter the gift card number");
        }
    }

    public void verifyTheActivateTheAccountFromDisabled_GiftCardScreen(String msg){

        getOrder_Screen_Check_Option_GiftCard_Suspend_Account_Disabled().click();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        text_Confirm(Order_Screen_GiftCard_POP_up_Text, msg);

        click_Ele(getOrder_Screen_Check_Option_OpenItem_Done());

        try {
            if(getOrder_Screen_Check_Option_GiftCard_Suspend_Account_Enabled().isDisplayed()) {
                test.log(LogStatus.PASS, "Suspend Account is displayed in the Gift card(Enabled) popup after enter the gift card number");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Suspend Account is not displayed in the Gift card(Enabled) popup after enter the gift card number");
        }
    }

    public void verifyTheSuspendAccount_GiftCardScreen(){
        try {
            if(getOrder_Screen_Check_Option_GiftCard_Suspend_Account().isDisplayed()) {
                test.log(LogStatus.PASS, "Suspend Account is displayed in the Gift card popup after enter the gift card number");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Suspend Account is not displayed in the Gift card popup after enter the gift card number");
        }
    }

    public void verifyTheChargeAmountValue_GiftCardScreen(){
        try {
            if(getOrder_Screen_Check_Option_GiftCard_ChargeAmount_Value().isDisplayed()) {
                test.log(LogStatus.PASS, "Charge Amount Value is displayed in the Gift card popup when user click the Gift Card option from the Check Option");
                    String val = getOrder_Screen_Check_Option_GiftCard_ChargeAmount_Value().getText();
                    if(val.contains("0.00")){
                        test.log(LogStatus.PASS, "Charge Amount Value is Zero in the Gift card popup after enter the gift card number");
                    }else{
                        test.log(LogStatus.FAIL, "Charge Amount Value is not Zero in the Gift card popup after enter the gift card number");
                    }
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Charge Amount Value is not displayed in the Gift card popup when user click the Gift Card option from the Check Option");
        }
    }

    public void verifyTheChargeAmount_GiftCardScreen(){
        try {
            if(getOrder_Screen_Check_Option_GiftCard_ChargeAmount().isDisplayed()) {
                test.log(LogStatus.PASS, "Charge Amount is displayed in the Gift card popup when user click the Gift Card option from the Check Option");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Charge Amount is not displayed in the Gift card popup when user click the Gift Card option from the Check Option");
        }
    }

    public void verifyTheGiftCard_GiftCardScreen(){
        try {
            if(getOrder_Screen_Check_Option_GiftCard_GiftCard().isDisplayed()) {
                test.log(LogStatus.PASS, "Gift Card is displayed in the Gift card popup when user click the Gift Card option from the Check Option");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Gift Card is not displayed in the Gift card popup when user click the Gift Card option from the Check Option");
        }
    }

    public void verifyTheGiftCard_GiftCardScreen1(){
        try {
            if(getOrder_Screen_Check_Option_GiftCard_GiftCard().isDisplayed()) {
                test.log(LogStatus.FAIL, "Gift Card is displayed in the Gift card popup when user click the cancel option");
            }
        }catch(Exception e) {
            test.log(LogStatus.PASS, "Gift Card is disappeared after user click the cancel option");
        }
    }

    public void verifyTheGiveX_GiftCardScreen(){
        try {
            if(getOrder_Screen_Check_Option_GiftCard_GiveX().isDisplayed()) {
                test.log(LogStatus.PASS, "GiveX Card is displayed in the Gift card popup when user click the Gift Card option from the Check Option");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "GiveX Card is not displayed in the Gift card popup when user click the Gift Card option from the Check Option");
        }
    }

    public void verifyTheFactor4_GiftCardScreen(){
        try {
            if(getOrder_Screen_Check_Option_GiftCard_Factor_4().isDisplayed()) {
                test.log(LogStatus.PASS, "Factor 4 Card is displayed in the Gift card popup when user click the Gift Card option from the Check Option");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Factor 4 Card is not displayed in the Gift card popup when user click the Gift Card option from the Check Option");
        }
    }

    public void verifyTheCardNumber_GiftCardScreen(){
        try {
            if(getOrder_Screen_Check_Option_GiftCard_CardNumber().isDisplayed()) {
                test.log(LogStatus.PASS, "Card Number text is displayed in the Gift card popup when user click the Gift Card option from the Check Option");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Card Number text is not displayed in the Gift card popup when user click the Gift Card option from the Check Option");
        }
    }

    public void verifyTheCardNumber0_GiftCardScreen(){
        try {
            if(getOrder_Screen_Check_Option_GiftCard_CardNumber0().isDisplayed()) {
                test.log(LogStatus.PASS, "Card Number is displayed in the Gift card popup when user click the Gift Card option from the Check Option");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Card Number is not displayed in the Gift card popup when user click the Gift Card option from the Check Option");
        }
    }
    public void verifyTheBeginningBalance_GiftCardScreen(){
        try {
            if(getOrder_Screen_Check_Option_GiftCard_BeginningBalance().isDisplayed()) {
                test.log(LogStatus.PASS, "Beginning Balance is displayed in the Gift card popup when user click the Gift Card option from the Check Option");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Beginning Balance is not displayed in the Gift card popup when user click the Gift Card option from the Check Option");
        }
    }

    public void verifyTheRecuringBalance_GiftCardScreen(){
        try {
            if(getOrder_Screen_Check_Option_GiftCard_RecuringBalance().isDisplayed()) {
                test.log(LogStatus.PASS, "Recuring Balance is displayed in the Gift card popup when user click the Gift Card option from the Check Option");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Recuring Balance is not displayed in the Gift card popup when user click the Gift Card option from the Check Option");
        }
    }

    public void verifyTheGiftCardDetailsAndItsPrice_InRetailScreen(){
        try {
            if(getFirstMenuItem_OrderScreen().getText().equals("GC-54321")) {
                test.log(LogStatus.PASS, "Gift Card detail added successfully in Order Screen");
            }
        }catch(Exception c) {
            test.log(LogStatus.FAIL, "Gift Card detail added fail in Order Screen");
        }

        try {
            if(getFirstMenuItemPrice_OrderScreen().getText().equals("30.00")) {
                test.log(LogStatus.PASS, "Charge amount displayed successfully in Order Screen");
            }
        }catch(Exception c) {
            test.log(LogStatus.FAIL, "Charge amount displayed wrongly in Order Screen");
        }
    }

    public void verifyTheOpenItemAndItsPrice(){
        try {
            if(getFirstMenuItem_OrderScreen().getText().equals("Open_Item")) {
                test.log(LogStatus.PASS, "Open Item added successfully in Order Screen");
            }
        }catch(Exception c) {
            test.log(LogStatus.FAIL, "Open Item added fail in Order Screen");
        }

        try {
            if(getFirstMenuItemPrice_OrderScreen().getText().equals("30.00")) {
                test.log(LogStatus.PASS, "Open Item price displayed successfully in Order Screen");
            }
        }catch(Exception c) {
            test.log(LogStatus.FAIL, "Open Item price displayed wrongly in Order Screen");
        }
    }

    public void clickTheFirstTax_OpenItemScreen(){
        //click the first tax
        click_Ele(getOrder_Screen_Check_Option_OpenItem_First_TaX());
    }

    public void verifyTheOpenItem_OpenItemScreen(){
        try {
            if(getOrder_Screen_Check_Option_OpenItem_Open_Item().isDisplayed()) {
                test.log(LogStatus.PASS, "Open Item text is displayed in the Open Item popup");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Open Item text is not displayed in the Open Item popup");
        }
    }

    public void verifyTheItemName_OpenItemScreen(){
        try {
            if(getOrder_Screen_Check_Option_OpenItem_Item_Name().isDisplayed()) {
                test.log(LogStatus.PASS, "Item Name text is displayed in the Open Item popup");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Item Name text is not displayed in the Open Item popup");
        }
    }

    public void verifyTheItemNameTextBox_OpenItemScreen(){
        try {
            if(getOrder_Screen_Check_Option_OpenItem_Item_Name_TextBox().isDisplayed()) {
                test.log(LogStatus.PASS, "Item name text box is displayed in the Open Item popup");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Item name text box is not displayed in the Open Item popup");
        }
    }

    public void enterTheOpenItemName(){
        //enter the name
        getOrder_Screen_Check_Option_OpenItem_Item_Name_TextBox().sendKeys("Open_Item");
    }

    public void clickThePriceTextBox(){
        //click the price text box
        click_Ele(getOrder_Screen_Check_Option_OpenItem_Price_TextBox());
    }

    public void verifyThePrice_OpenItemScreen(){
        try {
            if(getOrder_Screen_Check_Option_OpenItem_Price().isDisplayed()) {
                test.log(LogStatus.PASS, "Price text is displayed in the Open Item popup");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Price text is not displayed in the Open Item popup");
        }
    }

    public void verifyThePriceTextBox_OpenItemScreen(){
        try {
            if(getOrder_Screen_Check_Option_OpenItem_Price_TextBox().isDisplayed()) {
                test.log(LogStatus.PASS, "Price text box is displayed in the Open Item popup");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Price text box is not displayed in the Open Item popup");
        }
    }

    public void verifyTheTax_OpenItemScreen(){
        try {
            if(getOrder_Screen_Check_Option_OpenItem_Tax().isDisplayed()) {
                test.log(LogStatus.PASS, "Tax text is displayed in the Open Item popup");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Tax text is not displayed in the Open Item popup");
        }
    }

    public void verifyTheTaxList_OpenItemScreen(){
        try {
            if(getOrder_Screen_Check_Option_OpenItem_Tax_ListBox().isDisplayed()) {
                test.log(LogStatus.PASS, "Tax List is displayed in the Open Item popup");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Tax List is not displayed in the Open Item popup");
        }
    }

    public void verifyTheDone_OpenItemScreen(){
        try {
            if(getOrder_Screen_Check_Option_OpenItem_Done().isDisplayed()) {
                test.log(LogStatus.PASS, "Done is displayed in the Open Item popup");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Done is not displayed in the Open Item popup");
        }
    }

    public void verifyTheItemAndCheckDiscountFromFilter_In_DiscountScreen(){
        try {
            if(getOrder_Screen_Check_Option_Discount_Filter_ItemAndCheck_Discount().isDisplayed()) {
                test.log(LogStatus.PASS, "Item and Check Discount text is displayed in the Discounts screen when user click the Filter option");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Item and Check Discount text is not displayed in the Discounts screen when user click the Filter option");
        }
    }

    public void verifyTheDiscountsFromDiscountScreen(){
        try {
            if(getOrder_Screen_Check_Option_Discount_Discounts().isDisplayed()) {
                test.log(LogStatus.PASS, "Discount text is displayed in the Discounts screen");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Discount text is not displayed in the Discounts screen");
        }
    }

    public void verifyTheDiscountsSearchFromDiscountScreen(){
        try {
            if(getOrder_Screen_Check_Option_Discount_Search().isDisplayed()) {
                test.log(LogStatus.PASS, "Discount Search is displayed in the Discounts screen");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Discount Search is not displayed in the Discounts screen");
        }
    }
    public void verifyTheDiscountFilterBtnFromRetailScreen(){
        try {
            if(getOrder_Screen_Check_Option_Discount_Filter().isDisplayed()) {
                test.log(LogStatus.PASS, "Discount Filter is displayed in the Retail POS order screen");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Discount Filter is not displayed in the Retail POS order screen");
        }
    }

    public void verifyTheDiscountEmptyFromRetailScreen(){
        try {
            if(getOrder_Screen_Check_Option_Discount_Empty().isDisplayed()) {
                test.log(LogStatus.PASS, "Option button is displayed in the Retail POS order screen");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Option is not displayed in the Retail POS order screen");
        }
    }

    public void verifyTheOptionBtnFromRetailScreen(){
        try {
            if(getOrder_Screen_OptionBtn().isDisplayed()) {
                test.log(LogStatus.PASS, "Option button is displayed in the Retail POS order screen");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Option is not displayed in the Retail POS order screen");
        }
    }

    public void verifyTheTaxFromRetailScreen(){
        try {
            if(getOrder_Screen_Tax().isDisplayed()) {
                test.log(LogStatus.PASS, "Tax option is displayed in the Retail POS order screen");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Tax option is not displayed in the Retail POS order screen");
        }
    }

    public void verifyTheServiceChargeFromRetailScreen(){
        try {
            if(getOrder_Screen_Service_Charge_Txt().isDisplayed()) {
                test.log(LogStatus.PASS, "Service Charge option is displayed in the Retail POS order screen");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Service Charge option is not displayed in the Retail POS order screen");
        }
    }

    public void verifyTheServiceChargeFromRetailScreen1(){
        try {
            if(getOrder_Screen_Service_Charge_Txt().isDisplayed()) {
                test.log(LogStatus.FAIL, "Service Charge option is displayed in the Retail POS order screen after click the Service Exempt from the Check option");
            }
        }catch(Exception e) {
            test.log(LogStatus.PASS, "Service Charge option is not displayed in the Retail POS order screen after click the Service Exempt from the Check option");
        }
    }

    public void verifyTheTaxFromRetailScreen_AfterClickTaxExempt(){
        try {
            if(getOrder_Screen_Tax().isDisplayed()) {
                test.log(LogStatus.FAIL, "Tax option is displayed in the Retail POS order screen after selecting the Tax Exempt option from the check option");
            }
        }catch(Exception e) {
            test.log(LogStatus.PASS, "Tax option is not displayed in the Retail POS order screen after selecting the Tax Exempt option from the check option");
        }
    }

    public void verifyTheDiscountFromRetailScreen_AfterClickDiscount(){
        try {
            if(getOrder_Screen_Discount_Txt().isDisplayed()) {
                test.log(LogStatus.FAIL, "Discount option is displayed in the Retail POS order screen after selecting the Tax Exempt option from the check option");
            }
        }catch(Exception e) {
            test.log(LogStatus.PASS, "Discount option is not displayed in the Retail POS order screen after selecting the Tax Exempt option from the check option");
        }
    }

    public void verifyTheCheckOptionText(){
        try {
            if(getOrder_Screen_Check_Option().isDisplayed()) {
                test.log(LogStatus.PASS, "Check Option popup is displayed in the Retail POS order screen");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Check Option popup is not displayed in the Retail POS order screen");
        }
    }

    public void verifyTheTaxExemptBtnInTheCheckOption(){
        try {
            if(getOrder_Screen_Check_Option_Tax_Exempt().isDisplayed()) {
                test.log(LogStatus.PASS, "Tax Exempt option is displayed in the Check Option popup");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Tax Exempt option is not displayed in the Check Option popup");
        }
    }

    public void verifyTheDiscountBtnInTheCheckOption(){
        try {
            if(getOrder_Screen_Check_Option_Discount().isDisplayed()) {
                test.log(LogStatus.PASS, "Discount option is displayed in the Check Option popup");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Discount option is not displayed in the Check Option popup");
        }
    }

    public void verifyTheOpenItemBtnInTheCheckOption(){
        try {
            if(getOrder_Screen_Check_Option_Open_Item().isDisplayed()) {
                test.log(LogStatus.PASS, "Open Item option is displayed in the Check Option popup");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Open Item option is not displayed in the Check Option popup");
        }
    }

    public void verifyTheGiftCardBtnInTheCheckOption(){
        try {
            if(getOrder_Screen_Check_Option_Gift_Card().isDisplayed()) {
                test.log(LogStatus.PASS, "Gift Card option is displayed in the Check Option popup");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Gift Card option is not displayed in the Check Option popup");
        }
    }

    public void verifyTheSearchItemBtnInTheCheckOption(){
        try {
            if(getOrder_Screen_Check_Option_Search_Item().isDisplayed()) {
                test.log(LogStatus.PASS, "Search Item option is displayed in the Check Option popup");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Search Item option is not displayed in the Check Option popup");
        }
    }

    public void verifyTheOpenCashDrawerBtnInTheCheckOption(){
        try {
            if(getOrder_Screen_Check_Option_Open_Cash_Drawer().isDisplayed()) {
                test.log(LogStatus.PASS, "Open Cash Drawer option is displayed in the Check Option popup");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Open Cash Drawer option is not displayed in the Check Option popup");
        }
    }

    public void verifyTheServiceExemptBtnInTheCheckOption(){
        try {
            if(getOrder_Screen_Check_Option_Service_Exempt().isDisplayed()) {
                test.log(LogStatus.PASS, "Service Exempt option is displayed in the Check Option popup");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Service Exempt option is not displayed in the Check Option popup");
        }
    }

    public void verifyTheVoidBtnInTheCheckOption(){
        try {
            if(getOrder_Screen_Check_Option_Void().isDisplayed()) {
                test.log(LogStatus.PASS, "Void option is displayed in the Check Option popup");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Void option is not displayed in the Check Option popup");
        }
    }

    public void verifyThePrintBtnInTheCheckOption(){
        try {
            if(getOrder_Screen_Check_Option_Print().isDisplayed()) {
                test.log(LogStatus.PASS, "Print option is displayed in the Check Option popup");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Print option is not displayed in the Check Option popup");
        }
    }

    public void verifyTheModifyBtnInTheCheckOption(){
        try {
            if(getOrder_Screen_Check_Option_Modify().isDisplayed()) {
                test.log(LogStatus.PASS, "Modify option is displayed in the Check Option popup");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Modify option is not displayed in the Check Option popup");
        }
    }

    public void verifyTheApplyStoreCreditBtnInTheCheckOption(){
        try {
            if(getOrder_Screen_Check_Option_Apply_Store_Credit().isDisplayed()) {
                test.log(LogStatus.PASS, "Apply Store Credit option is displayed in the Check Option popup");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Apply Store Credit option is not displayed in the Check Option popup");
        }
    }

    public void verifyTheEBTBalanceBtnInTheCheckOption(){
        try {
            if(getOrder_Screen_Check_Option_EBT_balance().isDisplayed()) {
                test.log(LogStatus.PASS, "EBT balance option is displayed in the Check Option popup");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "EBT balance option is not displayed in the Check Option popup");
        }
    }

    public void verifyTheCancelBtnInTheCheckOption(){
        try {
            if(getOrder_Screen_Check_Option_Cancel().isDisplayed()) {
                test.log(LogStatus.PASS, "Cancel option is displayed in the Check Option popup");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Cancel option is not displayed in the Check Option popup");
        }
    }

    public void clickTheOptionBtn(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click the option
        click_Ele(getOrder_Screen_OptionBtn());
    }

    public void clickTheTaxExemptBtn(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click the tax exempt
        click_Ele(getOrder_Screen_Check_Option_Tax_Exempt());
    }

    public void clickTheDiscountBtn(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click the discount
        click_Ele(getOrder_Screen_Check_Option_Discount());
    }

    public void clickTheOpenItemBtn(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click the open item
        click_Ele(getOrder_Screen_Check_Option_Open_Item());
    }

    public void clickTheGiftCardBtn(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click the gift card
        click_Ele(getOrder_Screen_Check_Option_Gift_Card());
    }

    public void clickTheSearchItemBtn(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click the search item
        click_Ele(getOrder_Screen_Check_Option_Search_Item());
    }

    public void clickTheOpenCashDrawerBtn(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click the open cash drawer
        click_Ele(getOrder_Screen_Check_Option_Open_Cash_Drawer());
    }

    public void clickTheServiceExemptBtn(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click the service exempt
        click_Ele(getOrder_Screen_Check_Option_Service_Exempt());
    }

    public void clickTheVoidBtn(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click the Void
        click_Ele(getOrder_Screen_Check_Option_Void());
    }

    public void clickThePrintBtn(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click the Print
        click_Ele(getOrder_Screen_Check_Option_Print());
    }

    public void clickTheModifyBtn(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click the Modify
        click_Ele(getOrder_Screen_Check_Option_Modify());
    }

    public void clickTheApplyStoreCreditBtn(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click the Apply Store Credit
        click_Ele(getOrder_Screen_Check_Option_Apply_Store_Credit());
    }

    public void clickTheApplyStoreCreditBtn1(String msg) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click the Apply Store Credit
        click_Ele(getOrder_Screen_Check_Option_Apply_Store_Credit());
        Thread.sleep(1500);
        try{
            text_Confirm_without_Screenshot(Store_Credit_Popup_Text,msg);
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Please attach customer to apply store credits notification is not displayed when click the apply store credit from the Check option");
        }
//        clickTheCancelBtn();
    }

    public void clickTheCancelBtn(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click the cancel
        click_Ele(getOrder_Screen_Check_Option_Cancel());
    }

    public void clickTheTaxExemptOption_1(){
        //click the tax exempt
        getOrder_Screen_Check_Option_Tax_Exempt().click();

        try{
            text_Confirm_without_Screenshot(Tax_Exempt_Popup_Text,"Tax exempt removed successfully");
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Tax exempt removed successfully notification is not displayed when user remove the Tax Exempt");
        }
    }

    public void verifyTheRequiredDiscount(String disc){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //verify the required tax
        try {
            if(driver.findElement(By.xpath("//*[contains(@text,'"+disc+"')]")).isDisplayed()) {
                test.log(LogStatus.PASS, "The required discount is displayed in the Discounts popup");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "The required discount is not displayed in the Discounts popup");
        }
    }

    public void clickTheRequiredDiscount(String disc){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //click the required tax
        click_Ele(driver.findElement(By.xpath("//*[contains(@text,'"+disc+"')]")));
    }

    public void clickTheFilterOptionFromDiscountScreen(){
        //click the filter option
        click_Ele(getOrder_Screen_Check_Option_Discount_Filter());
    }


    public void clickTheGiftCardAndClickTheNumber() {
        //click the gift card number
        click_Ele(getOrder_Screen_Check_Option_GiftCard_GiftCard());

        try {
            if(getOrder_Screen_Check_Option_GiftCardEnabled_GiftCard().isDisplayed()) {
                test.log(LogStatus.PASS, "Gift card option is selected after click the Gift Card option in the Gift card popup");
            }
        }catch(Exception e) {
            test.log(LogStatus.FAIL, "Gift card option is not selected after click the Gift Card option in the Gift card popup");
        }

        //click the number
        click_Ele(getOrder_Screen_Check_Option_GiftCard_CardNumber0());
    }

    public void clickTheGiveX() {
        //click the gift card number
        click_Ele(getOrder_Screen_Check_Option_GiftCard_GiveX());

        try {
            if (getOrder_Screen_Check_Option_GiveXDisabled_GiftCard().isDisplayed()) {
                test.log(LogStatus.PASS, "GiveX option is selected after click the GiveX option in the Gift card popup");
            }
        } catch (Exception e) {
            test.log(LogStatus.FAIL, "GiveX option is not selected after click the GiveX option in the Gift card popup");
        }
    }

    public void clickTheFactorFour() {
        //click the gift card number
        click_Ele(getOrder_Screen_Check_Option_GiftCard_Factor_4());

        try {
            if (getOrder_Screen_Check_Option_Factor_4Disabled_GiftCard().isDisplayed()) {
                test.log(LogStatus.PASS, "Factor 4 option is selected after click the Factor 4 option in the Gift card popup");
            }
        } catch (Exception e) {
            test.log(LogStatus.FAIL, "Factor 4 option is not selected after click the Factor 4 option in the Gift card popup");
        }
    }
}
