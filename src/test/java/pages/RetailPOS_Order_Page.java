package pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import utility.Utility;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class RetailPOS_Order_Page extends Appium_Base_Class{

	public Common_xpath cm;
	public Pin_Screen_Page psp;
    Utility ut = new Utility();
    Float unknownValue = 0.0f;
	@AndroidFindBy(xpath = "//*[@text='Log Off']")
	WebElement Order_Screen_LogOff;
	@AndroidFindBy(xpath = "//*[@text='ITEM']")
	WebElement Order_Screen_Item_ColumnTxt;
	@AndroidFindBy(xpath = "//*[@text='VARIANT']")
	WebElement Order_Screen_Variant_ColumnTxt;
	@AndroidFindBy(xpath = "//*[@text='SKU CODE']")
	WebElement Order_Screen_SkuCode_ColumnTxt;
	@AndroidFindBy(xpath = "//*[@text='QTY']")
	WebElement Order_Screen_Qty_ColumnTxt;
	@AndroidFindBy(xpath = "//*[@text='PRICE']")
	WebElement Order_Screen_Price_ColumnTxt;
	@AndroidFindBy(xpath = "//*[@text='DISCOUNT']")
	WebElement Order_Screen_Discount_ColumnTxt;
	@AndroidFindBy(xpath = "//*[@text='TOTAL']")
	WebElement Order_Screen_Total_ColumnTxt;
	@AndroidFindBy(xpath = "//*[@text='Receipt No']")
	WebElement Order_Screen_Receipt_NoTxt;
	@AndroidFindBy(xpath = "//*[@text='Receipt No']/../android.widget.TextView[3]")
	WebElement Order_Screen_Check_No;
	@AndroidFindBy(xpath = "//*[@text='Receipt No']/../android.widget.TextView[3]")
	WebElement Order_Screen_Customer;
	@AndroidFindBy(xpath = "//*[@resource-id='operations']")
	WebElement Order_Screen_OperationsBtn;
	@AndroidFindBy(xpath = "//*[@text='Void']")
	WebElement Order_Screen_VoidBtn;
	@AndroidFindBy(xpath = "//*[@text='Sale History']")
	WebElement Order_Screen_Sale_HistoryBtn;
	@AndroidFindBy(xpath = "//*[@text='Park Sale']")
	WebElement Order_Screen_Park_SaleBtn;
	@AndroidFindBy(xpath = "//*[@text='Retrieve Sale']")
	WebElement Order_Screen_Retreive_SaleBtn;
	@AndroidFindBy(xpath = "//*[@text='Layaway']")
	WebElement Order_Screen_layawayBtn;
	@AndroidFindBy(xpath = "//*[@text='Option']")
	WebElement Order_Screen_OptionBtn;
	@AndroidFindBy(xpath = "//*[@text='Print']")
	WebElement Order_Screen_PrintBtn;
	@AndroidFindBy(xpath = "//*[@text='Discount']")
	WebElement Order_Screen_DiscountBtn;
	@AndroidFindBy(xpath = "//*[@text='Cash']")
	WebElement Order_Screen_CashBtn;
	@AndroidFindBy(xpath = "//*[@text='Payment']")
	WebElement Order_Screen_PaymentBtn;
	@AndroidFindBy(xpath = "//*[@text='Success']")
	WebElement Order_Screen_SuccessStatus;
	@AndroidFindBy(xpath = "//*[@text='Delete']")
	WebElement Order_Screen_DeleteBtn;
	@AndroidFindBy(xpath = "//*[@text='Adjust']")
	WebElement Order_Screen_AdjustBtn;
	@AndroidFindBy(xpath = "//*[@text='Back']")
	WebElement Order_Screen_BackBtn;
	@AndroidFindBy(xpath = "//*[@text='Add Customer']")
	WebElement Order_Screen_Add_CustomerBtn;
	@AndroidFindBy(xpath = "//*[@text='Search Customer']")
	WebElement Order_Screen_Search_CustomerBtn;
	@AndroidFindBy(xpath = "//android.view.View/android.view.View[2]/android.widget.EditText")
	WebElement Order_Screen_Menu_Search_TextBox;
	@AndroidFindBy(xpath = "//android.view.View/android.view.View[2]/android.widget.Button/android.widget.Image")
	WebElement Order_Screen_Category_ExpandBtn;
	@AndroidFindBy(xpath = "//*[@text='Add Customer']")
	WebElement Order_Screen_Add_Customer_popupText;
	@AndroidFindBy(xpath = "//*[@text='ENTER DEPOSIT AMOUNT']")
	WebElement Enter_Deposit_Amount_popupText;
	
	@AndroidFindBy(xpath = "//*[@text='By Phone']")
	WebElement Order_Screen_By_PhoneBtn;
	
	@AndroidFindBy(xpath = "//*[@text='By Name / Email']")
	WebElement Order_Screen_By_Name_EmailBtn;
	
	@AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View/android.widget.EditText")
	WebElement Order_Screen_CustomerSearch_Input_Box;
	
	@AndroidFindBy(xpath = "//android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView")
	WebElement Order_Screen_Total_Amount;
	
	@AndroidFindBy(xpath = "//*[@text='Subtotal']")
	WebElement Order_Screen_SubTotal_Txt;

	public WebElement getOrder_Screen_SubTotal() {
		return Order_Screen_SubTotal_Txt;
	}

	public WebElement getOrder_Screen_Add_Customer_popupText()
	{return Order_Screen_Add_Customer_popupText;}

	public WebElement getEnter_Deposit_Amount_popupText()
	{return Enter_Deposit_Amount_popupText;}

	public void addCustomerPopupDisplayed(){
		try{
			if(getOrder_Screen_Add_Customer_popupText().isDisplayed()){
				test.log(LogStatus.PASS,"Add Customer Popup is displayed");
			}
		}catch (Exception s){
			test.log(LogStatus.FAIL,"Add Customer Popup is not displayed");
		}
	}

	public void enterDepositAmountPopupDisplayed(){
		try{
			if(getEnter_Deposit_Amount_popupText().isDisplayed()){
				test.log(LogStatus.PASS,"Enter Deposit Popup is displayed");
			}
		}catch (Exception s){
			test.log(LogStatus.FAIL,"Enter Deposit Popup is not displayed");
		}
	}

	@AndroidFindBy(xpath = "//*[@text='Tax']")
	WebElement Order_Screen_Tax_Txt;

	public WebElement getOrder_Screen_Tax() {
		return Order_Screen_Tax_Txt;
	}

	public WebElement getOrder_Screen_Gratuity() {
		return Order_Screen_Gratuity_Value;
	}

	public WebElement getOrder_Screen_ServiceCharge() {
		return Order_Screen_ServiceCharge_Value;
	}
	
	@AndroidFindBy(xpath = "//*[@text='Total']")
	WebElement Order_Screen_Total_Txt;

	public WebElement getOrder_Screen_Total() {
		return Order_Screen_Total_Txt;
	}
	
	@AndroidFindBy(xpath = "//*[@text='Paid Amount']")
	WebElement Order_Screen_Paid_Amount_Txt;

	public WebElement getOrder_Screen_Paid_Amount() {
		return Order_Screen_Paid_Amount_Txt;
	}
	
	@AndroidFindBy(xpath = "//*[@text='Balance Amount']")
	WebElement Order_Screen_Balance_Amount_Txt;

	public WebElement getOrder_Screen_Balance_Amount() {
		return Order_Screen_Balance_Amount_Txt;
	}
	
	@AndroidFindBy(xpath = "//*[@text='Receipt No']/../../android.view.View//android.widget.TextView[3]")
	WebElement Order_Screen_Check_NO;
	
	@AndroidFindBy(xpath = "//*[@text='Subtotal']/../android.view.View/android.view.View/android.widget.TextView")
	WebElement Order_Screen_SubTotal_Value;
	
	@AndroidFindBy(xpath = "//*[@text='Discount']/../android.view.View/android.view.View/android.widget.TextView")
	WebElement Order_Screen_Discount_Value;

	public WebElement getOrder_Screen_Discount_Value() {
		return Order_Screen_Discount_Value;
	}
	
	public WebElement getOrder_Screen_SubTotal_Value() {return Order_Screen_SubTotal_Value;}

	public WebElement getOrder_Screen_Tax_Value() {
		return Order_Screen_Tax_Value;
	}

	public WebElement getOrder_Screen_Total_Value() {
		return Order_Screen_Total_Value;
	}


	public WebElement getOrder_Screen_Paid_Amount_Value() {
		return Order_Screen_Paid_Amount_Value;
	}

	public WebElement getOrder_Screen_Balance_Amount_Value() {
		return Order_Screen_Balance_Amount_Value;
	}


	@AndroidFindBy(xpath = "//*[@text='Tax']/../android.view.View/android.view.View/android.widget.TextView")
	WebElement Order_Screen_Tax_Value;

	@AndroidFindBy(xpath = "//*[@text='Gratuity']/../android.view.View/android.view.View/android.widget.TextView")
	WebElement Order_Screen_Gratuity_Value;

	@AndroidFindBy(xpath = "//*[@text='Service Charge']/../android.view.View/android.view.View/android.widget.TextView")
	WebElement Order_Screen_ServiceCharge_Value;
	
	@AndroidFindBy(xpath = "//*[@text='Total']/../android.view.View/android.view.View/android.widget.TextView")
	WebElement Order_Screen_Total_Value;
	
	@AndroidFindBy(xpath = "//*[@text='Paid Amount']/../android.view.View/android.view.View/android.widget.TextView")
	WebElement Order_Screen_Paid_Amount_Value;
	
	@AndroidFindBy(xpath = "//*[@text='Balance Amount']/../android.view.View/android.view.View/android.widget.TextView")
	WebElement Order_Screen_Balance_Amount_Value;
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.ListView']//android.view.View//android.view.View//android.view.View")
	WebElement Order_Screen_Customer_Serach_List;
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.ListView']//android.view.View//android.view.View//android.view.View[1]")
	WebElement Order_Screen_Customer_Serach_List_First_Result;
	
	@AndroidFindBy(xpath = "//*[@text='Remove']")
	WebElement Order_Screen_Customer_Remove_Btn;
	
	@AndroidFindBy(xpath = "//android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[1]/android.widget.TextView")
	WebElement Order_Screen_Customer_Name_Btn;

	@AndroidFindBy(xpath = "//android.widget.EditText")
	WebElement SearchBox_SearchCustomerScreen;

	@AndroidFindBy(xpath = "//*[@text='Save']")
	WebElement Customer_Profile_SaveBtn;

	@AndroidFindBy(xpath = "//*[@text='Customer Plan']")
	WebElement Customer_Profile_CustomerPlanBtn;

	@AndroidFindBy(xpath = "//*[@text='Return']")
	WebElement Customer_Profile_ReturnBtn;

	@AndroidFindBy(xpath = "//*[contains(@text,'Previous Orders')]/../android.view.View/android.view.View/android.widget.TextView[1]")
	WebElement Customer_Profile_FirstPreviousOrder;

	public void AddTheCustomer(String num) throws InterruptedException {
		//wait until the particular Element displayed
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//click the search customer button
//		getOrder_Screen_Search_CustomerBtn().click();
		getOrder_Screen_Add_CustomerBtn().click();

		Thread.sleep(500);
		//clear the search field in the Search customer
		SearchBox_SearchCustomerScreen.clear();

//		for(int i = 0; i <= num.length();i++){
//			String d = String.valueOf(num.charAt(i));
//			System.out.println("jjjjjjjjjjjjjjj : "+d);
//			//click the number
//			driver.findElement(By.xpath("//*[contains(@text,'"+d+"')]")).click();Thread.sleep(500);
//			//SearchBox_SearchCustomerScreen.sendKeys(d);Thread.sleep(500);
//		}

		//enter the number in search field in the Search customer
		SearchBox_SearchCustomerScreen.sendKeys(num);

		Thread.sleep(2000);
		//wait until the particular Element displayed
		SearchBox_SearchCustomerScreen.click();	Thread.sleep(2000);
		//wait until the particular Element displayed

		//click the customer from the searched result
		driver.findElement(By.xpath("(//*[contains(@text,'"+num+"')])[2]")).click();

//				Thread.sleep(4000);		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		//Click the save button from the Customer Profile Screen
//		Customer_Profile_SaveBtn.click();
		Thread.sleep(2000);
	}

	@AndroidFindBy(xpath = "//*[contains(@text,'Openitem')]")//android.view.View//*[contains(@text,'Standard Item')]
	WebElement Order_Screen_Category_OpenItem;

	@AndroidFindBy(xpath = "//*[contains(@text,'Back')]")
	WebElement Order_Screen_Category_Back_Btn;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'CANCEL')]")
	WebElement Menu_Screen_Category_Cancel_Btn;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'MENU ITEMS OF')]")
	WebElement Order_Screen_Category_Name_InPopUp;
	
	@AndroidFindBy(xpath = "//*[contains(@resource-id,'menu-item')]")
	WebElement Order_Screen_Menu_Item_List2;
	
	@AndroidFindBy(xpath = "(//*[@text='X'])[2]")
	WebElement Order_Screen_Menu_Cancel_Btn;
	
	@AndroidFindBy(xpath = "//*[@resource-id='react-ordder-list-render']//android.view.View[1]//android.widget.TextView[5]")
	WebElement Order_Screen_Menu_Prices_List;
	
	@AndroidFindBy(xpath = "//*[@text=' Done']")
	WebElement Order_Screen_Variant_Menu_Done_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='Search']")
	WebElement Order_Screen_Serach_Box;

	@AndroidFindBy(xpath = "//*[contains(@text,'Tax Exempt')]")
	WebElement Order_Screen_TaxExempt;

	@AndroidFindBy(xpath = "//*[contains(@text,'Discount')]")
	WebElement Order_Screen_Discount;

	@AndroidFindBy(xpath = "//*[contains(@text,'Discount')]/../android.view.View/android.view.View/android.widget.TextView")
	WebElement Order_Screen_DiscountValue;

	@AndroidFindBy(xpath = "//*[@text='Log Off']")
	WebElement Order_Screen_LogOffBtn;

	@AndroidFindBy(xpath = "//*[@text='Finish']")
	WebElement Order_Screen_FinishBtn;
	
	@AndroidFindBy(xpath = "//*[@text='Standard Item 3']")
	WebElement Order_Screen_Menu_Serach_Result;
	
	@AndroidFindBy(xpath = "//*[@resource-id='react-ordder-list-render']/android.view.View/android.widget.TextView[1]")
	WebElement Order_Screen_Menu_Item_List;
	
	@AndroidFindBy(xpath = "//*[@text='Void']")
	public WebElement Order_Screen_Void_Btn;
	
	@AndroidFindBy(xpath = "//*[@resource-id='alert-done-popup']/android.widget.TextView")
	WebElement Order_Screen_Void_POP_up_Text;

	@AndroidFindBy(xpath = "//*[@resource-id='alert-done-popup']/android.widget.TextView")
	WebElement Order_Screen_Layaway_POP_up_Text;
	
	@AndroidFindBy(xpath = "//*[@text='Done']")
	WebElement Order_Screen_Void_pop_up_Done_Btn;
	
	@AndroidFindBy(xpath = "//*[@resource-id='category-ui']/android.view.View/android.widget.Button/android.widget.Image")
	WebElement Order_Screen_Category_Extent_Btn;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'Search Customer')]/../../android.view.View/android.widget.Button[@text='1']")
	WebElement Order_Screen_NumberPad_1;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'Search Customer')]/../../android.view.View/android.widget.Button[@text='2']")
	WebElement Order_Screen_NumberPad_2;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'Search Customer')]/../../android.view.View/android.widget.Button[@text='3']")
	WebElement Order_Screen_NumberPad_3;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'Search Customer')]/../../android.view.View/android.widget.Button[@text='4']")
	WebElement Order_Screen_NumberPad_4;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'Search Customer')]/../../android.view.View/android.widget.Button[@text='5']")
	WebElement Order_Screen_NumberPad_5;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'Search Customer')]/../../android.view.View/android.widget.Button[@text='6']")
	WebElement Order_Screen_NumberPad_6;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'Search Customer')]/../../android.view.View/android.widget.Button[@text='7']")
	WebElement Order_Screen_NumberPad_7;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'Search Customer')]/../../android.view.View/android.widget.Button[@text='8']")
	WebElement Order_Screen_NumberPad_8;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'Search Customer')]/../../android.view.View/android.widget.Button[@text='9']")
	WebElement Order_Screen_NumberPad_9;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'Search Customer')]/../../android.view.View/android.widget.Button[@text='0']")
	WebElement Order_Screen_NumberPad_0;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'Search Customer')]/../../android.view.View/android.widget.Button[@text='00']")
	WebElement Order_Screen_NumberPad_00;
	
	@AndroidFindBy(xpath = "//*[contains(@text,'Search Customer')]/../../android.view.View/android.widget.Button[@text='C']")
	WebElement Order_Screen_NumberPad_Clear;
	
	@AndroidFindBy(xpath = "//*[@resource-id='react-ordder-list-render']/android.view.View/android.widget.TextView[4]")
	WebElement Order_Screen_MenuItem_Count_Btn;
	
	@AndroidFindBy(xpath = "(//android.view.View[2]/android.view.View/android.view.View/android.view.View)//android.widget.Button")
	WebElement Kit_Variant_Box;

	@AndroidFindBy(xpath = "//*[@resource-id='react-ordder-list-render']//android.widget.TextView[1]")
	WebElement FirstMenuItem_OrderScreen;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'react-ordder-list-render')]//android.view.View[2]/android.widget.TextView[1]")
	WebElement SecondMenuItem_OrderScreen;

	@AndroidFindBy(xpath = "//*[@resource-id='react-ordder-list-render']//android.widget.TextView[5]")
	WebElement FirstMenuItemPrice_OrderScreen;

	@AndroidFindBy(xpath = "//*[@resource-id='react-ordder-list-render']//android.widget.TextView[4]")
	WebElement FirstMenuItemQuantity_OrderScreen;

	public WebElement Order_Screen_Menu_Cancel_Btn(int value) {

		return (WebElement) driver.findElement(By.xpath("(//*[@text='X'])["+value+"]"));
	}
	
	public WebElement getOrder_Screen_LogOff() {
		return Order_Screen_LogOff;
	}

	public WebElement getOrder_Screen_TaxExempt() {
		return Order_Screen_TaxExempt;
	}

	public WebElement getOrder_Screen_Discount() {
		return Order_Screen_Discount;
	}

	public WebElement getFirstMenuItem_OrderScreen() {
		return FirstMenuItem_OrderScreen;
	}

	public String getFirstItem(){
		return Get_Text(FirstMenuItem_OrderScreen);
	}

	public void verifyTheMenuItem(String menuItem){
		String fm = getFirstItem();

		if(fm.equals(menuItem)){
			test.log(LogStatus.PASS,"The required menu item is displayed in the Retail Item");
		}else{
			test.log(LogStatus.FAIL,"The required menu item is not displayed in the Retail Item");
		}
	}

	public WebElement getSecondMenuItem_OrderScreen() {
		return SecondMenuItem_OrderScreen;
	}
	
	public WebElement getFirstMenuItemPrice_OrderScreen() {
		return FirstMenuItemPrice_OrderScreen;
	}

	public WebElement getOrder_Screen_Item_ColumnTxt() {
		return Order_Screen_Item_ColumnTxt;
	}

	public WebElement getOrder_Screen_Variant_ColumnTxt() {
		return Order_Screen_Variant_ColumnTxt;
	}

	public WebElement getOrder_Screen_SkuCode_ColumnTxt() {
		return Order_Screen_SkuCode_ColumnTxt;
	}

	public WebElement getOrder_Screen_Qty_ColumnTxt() {
		return Order_Screen_Qty_ColumnTxt;
	}

	public WebElement getOrder_Screen_Price_ColumnTxt() {
		return Order_Screen_Price_ColumnTxt;
	}

	public WebElement getOrder_Screen_Discount_ColumnTxt() {
		return Order_Screen_Discount_ColumnTxt;
	}

	public WebElement getOrder_Screen_Total_ColumnTxt() {
		return Order_Screen_Total_ColumnTxt;
	}

	public WebElement getOrder_Screen_Receipt_NoTxt() {
		return Order_Screen_Receipt_NoTxt;
	}

	public WebElement getOrder_Screen_FinishBtn() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return Order_Screen_FinishBtn;
	}

	public void VerifyTheFinishBtn(){
		try{
			if(getOrder_Screen_FinishBtn().isDisplayed()){
				test.log(LogStatus.PASS,"Finish button is displayed in the retail order screen");
			}
		}catch (Exception d){
			test.log(LogStatus.FAIL,"Finish button is not displayed in the retail order screen");
		}
	}

	public void clickTheFinishBtn(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		click_Ele(getOrder_Screen_FinishBtn());
	}

	public WebElement getOrder_Screen_Check_No() {
		return Order_Screen_Check_No;
	}

	public WebElement getOrder_Screen_Customer(){
		return Order_Screen_Customer;
	}

	public WebElement getOrder_Screen_OperationsBtn() {
		return Order_Screen_OperationsBtn;
	}

	public WebElement getOrder_Screen_VoidBtn() {
		return Order_Screen_VoidBtn;
	}

	public WebElement getOrder_Screen_Sale_HistoryBtn() {
		return Order_Screen_Sale_HistoryBtn;
	}

	public WebElement getOrder_Screen_Park_SaleBtn() {
		return Order_Screen_Park_SaleBtn;
	}

	public WebElement getOrder_Screen_Retreive_SaleBtn() {
		return Order_Screen_Retreive_SaleBtn;
	}

	public WebElement getOrder_Screen_layawayBtn() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return Order_Screen_layawayBtn;
	}

	public WebElement getOrder_Screen_OptionBtn() {
		return Order_Screen_OptionBtn;
	}

	public WebElement getOrder_Screen_PrintBtn() {
		return Order_Screen_PrintBtn;
	}

	public WebElement getOrder_Screen_DiscountBtn() {return Order_Screen_DiscountBtn;}

	public WebElement getOrder_Screen_CashBtn() {
		return Order_Screen_CashBtn;
	}

	public WebElement getOrder_Screen_PaymentBtn() {
		return Order_Screen_PaymentBtn;
	}

	public WebElement getOrder_Screen_SuccessStatus() {
		return Order_Screen_SuccessStatus;
	}

	public WebElement getOrder_Screen_DeleteBtn() {
		return Order_Screen_DeleteBtn;
	}

	public WebElement getOrder_Screen_AdjustBtn() {
		return Order_Screen_AdjustBtn;
	}

	public WebElement getOrder_Screen_BackBtn() {
		return Order_Screen_BackBtn;
	}

	public void verifyThePaidAmount(){
		try {
			if(getOrder_Screen_SuccessStatus().isDisplayed()){
				test.log(LogStatus.PASS,"Paid Amount is displayed");
			}
		}catch (Exception e){
			test.log(LogStatus.FAIL,"Paid Amount is not displayed");
		}
	}

	public void ClickThePaidAmount(){
		//Click the paid amount
		getOrder_Screen_SuccessStatus().click();
	}

	public void clickTheDeleteBtn(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//click the delete btn
		click_Ele(getOrder_Screen_DeleteBtn());
	}

	public void clickTaxExempte(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//click the delete btn
		click_Ele(getOrder_Screen_TaxExempt());
	}

	public void clickDiscount(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//click the delete btn
		click_Ele(getOrder_Screen_Discount());
	}

	public void clickTheAdjustBtn(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//click the delete btn
		click_Ele(getOrder_Screen_AdjustBtn());
	}

	public void verifyTheDeleteBtn(){
		try {
			if(getOrder_Screen_DeleteBtn().isDisplayed()){
				test.log(LogStatus.PASS,"Delete Button is displayed");
			}
		}catch (Exception e){
			test.log(LogStatus.FAIL,"Delete Button is not displayed");
		}
	}

	public void verifyTheAdjustBtn(){
		try {
			if(getOrder_Screen_AdjustBtn().isDisplayed()){
				test.log(LogStatus.PASS,"Adjust Button is displayed");
			}
		}catch (Exception e){
			test.log(LogStatus.FAIL,"Adjust Button is not displayed");
		}
	}

	public void verifyTheBackbtn(){
		try {
			if(getOrder_Screen_BackBtn().isDisplayed()){
				test.log(LogStatus.PASS,"Back Button is displayed");
			}
		}catch (Exception e){
			test.log(LogStatus.FAIL,"Back Button is not displayed");
		}
	}

	public WebElement getOrder_Screen_Add_CustomerBtn() {
		return Order_Screen_Add_CustomerBtn;
	}

	public WebElement getOrder_Screen_Search_CustomerBtn() {
		return Order_Screen_Search_CustomerBtn;
	}

	public WebElement getOrder_Screen_Menu_Search_TextBox() {
		return Order_Screen_Menu_Search_TextBox;
	}

	public WebElement getOrder_Screen_Category_ExpandBtn() {
		return Order_Screen_Category_ExpandBtn;
	}
	
	@AndroidFindBy(xpath = "//*[contains(@text,'Sync Back Office')]")
	WebElement sync_Back_Office_Btn;
	
	public WebElement sync_Back_Office_Btn() {
		return sync_Back_Office_Btn;
	}
	
	@AndroidFindBy(xpath = "//*[contains(@text,'Syncing with backoffice')]")
	WebElement syncing_Back_Office_txt;
	
	public WebElement syncing_Back_Office_txt() {
		return syncing_Back_Office_txt;
	}
	
	public void Syncing_With_BO() {
		try {
			if(syncing_Back_Office_txt().isDisplayed())
				test.log(LogStatus.PASS, "Syncing with Backoffice text is displayed");
		}catch(Exception d) {
			test.log(LogStatus.FAIL, "Syncing with Backoffice text is not displayed");
		}
	}
	
	@AndroidFindBy(xpath = "//*[contains(@text,'Please select any one item.')]")
	WebElement please_Select_Anyone_Item_txt;
	
	public WebElement please_Select_Anyone_Item_txt() {
		return please_Select_Anyone_Item_txt;
	}
	
	@AndroidFindBy(xpath = "//*[contains(@text,'Done')]")
	WebElement done_btn;

	public void ClickDoneBtn(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//Click the done button
		done_btn.click();
	}
	
	public WebElement done_btn() {
		return done_btn;
	}
	
	public void please_Select_Anyone_Item_Popup() {
		try {
			if(please_Select_Anyone_Item_txt().isDisplayed())
				test.log(LogStatus.PASS, "Please select anyone item popup is displayed when user click the any number from numpad without choosing any menu item");
		
				//click the done button
			done_btn().click();
			Thread.sleep(1000);
		}catch(Exception d) {
			test.log(LogStatus.FAIL, "Please select anyone item popup is not displayed when user click the any number from numpad without choosing any menu item");
		}
	}

	public void Retail_OrderScreen_Columns_Item() throws Throwable {
		text_Confirm(getOrder_Screen_Item_ColumnTxt(), Utility.getProperty("OrderScreen_Clmn_Item"));
	}

	public void Retail_OrderScreen_Columns_Variant() throws Throwable {
		text_Confirm_without_Screenshot(getOrder_Screen_Variant_ColumnTxt(), Utility.getProperty("OrderScreen_Clmn_Variant"));
	}

	public void Retail_OrderScreen_Columns_SKUCode() throws Throwable {
		text_Confirm_without_Screenshot(getOrder_Screen_SkuCode_ColumnTxt(), Utility.getProperty("OrderScreen_Clmn_SkuCode"));
	}

	public void Retail_OrderScreen_Columns_Qty() throws Throwable {
		text_Confirm_without_Screenshot(getOrder_Screen_Qty_ColumnTxt(), Utility.getProperty("OrderScreen_Clmn_QTY"));
	}

	public void Retail_OrderScreen_Columns_Price() throws Throwable {
		text_Confirm_without_Screenshot(getOrder_Screen_Price_ColumnTxt(), Utility.getProperty("OrderScreen_Clmn_Price"));
	}

	public void Retail_OrderScreen_Columns_Discount() throws Throwable {
		text_Confirm_without_Screenshot(getOrder_Screen_Discount_ColumnTxt(), Utility.getProperty("OrderScreen_Clmn_Discount"));
	}
	
	public void Retail_OrderScreen_Columns_Total() throws Throwable {
		text_Confirm_without_Screenshot(getOrder_Screen_Total_ColumnTxt(), Utility.getProperty("OrderScreen_Clmn_Total"));
	}

	public void LayAway_Without_Item(String str) {
		text_Confirm(Order_Screen_Layaway_POP_up_Text, str);
		click_Ele(Order_Screen_Void_pop_up_Done_Btn);
	}

	public void pleasePay(String str) {
		try{
			if(Order_Screen_Layaway_POP_up_Text.getText().contains(str)){
				test.log(LogStatus.PASS,str+" popup is displayed");
			}
		}catch (Exception e){
			test.log(LogStatus.FAIL,str+" popup is not displayed");
		}
		click_Ele(Order_Screen_Void_pop_up_Done_Btn);
	}

	public void pleasePay1(String str) {
		try{
			if(Order_Screen_Layaway_POP_up_Text.getText().contains(str)){
				test.log(LogStatus.PASS,str+" popup is displayed");
				try{
					if(Order_Screen_Layaway_POP_up_Text.getText().contains("Walkin")){
						test.log(LogStatus.FAIL,"Walkin is displayed in the popup, but user already add the customer");
					}
				}catch (Exception e){
					test.log(LogStatus.PASS,"Walkin is not displayed in the popup, but user already add the customer");
				}
			}
		}catch (Exception e){
			test.log(LogStatus.FAIL,str+" popup is not displayed");
		}
		click_Ele(Order_Screen_Void_pop_up_Done_Btn);
	}

	public void SuggestedDeposit(String str) {
		text_Confirm(Order_Screen_Layaway_POP_up_Text, str);
		click_Ele(Order_Screen_Void_pop_up_Done_Btn);

	}
	
	public void Void_MenuItems() {
		click_Ele(Order_Screen_Void_Btn);
		text_Confirm(Order_Screen_Void_POP_up_Text, "All Orders Are Voided");
		click_Ele(Order_Screen_Void_pop_up_Done_Btn);
	}

	public void verifyTheParkSaleClickWithoutRetailItem_ErrorMessage(String msg) {
		text_Confirm(Order_Screen_Void_POP_up_Text, msg);
		click_Ele(Order_Screen_Void_pop_up_Done_Btn);
	}
	
	public void Log_Off_to_Pinscreen() {
		psp = new Pin_Screen_Page();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		click_Ele(psp.LogOff_Btn);
	}

	public void closeTheAddCustomerPopup(){
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@text='X'])")).click();
	}
	
	public void Removing_Menu_Items() throws Throwable {
		Thread.sleep(2000);
		click_On_EveryItem_INLIST(driver, "(//*[@text='X'])");

	}

	@AndroidFindBy(xpath = "//*[@text='Retail']")
	WebElement AllOrders_Retail_Btn;
	
	public WebElement getAllOrders_Retail_Btn() {
		return AllOrders_Retail_Btn;
	}

	@AndroidFindBy(xpath = "//*[contains(@text,'Layaways')]")
	WebElement Layaways_tab;

	public WebElement getLayawaysTab() {
		return Layaways_tab;
	}

	public void layawaysTabAvailability(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		try{
			if (getLayawaysTab().isDisplayed()){
				test.log(LogStatus.PASS,"Layaways Tab is displayed");
			}
		}catch(Exception e){
			test.log(LogStatus.FAIL,"Layaways Tab is not displayed");
		}

		//Click the RetailOption
		getAllOrders_Retail_Btn().click();
	}

	public void layawaysTabAvailability1() throws InterruptedException {
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		try{System.out.println("Layaways tab is still displayed");
			if (getLayawaysTab().getText().contains("Layaways")){
				test.log(LogStatus.PASS,"Layaways Tab is displayed");
			}
		}catch(Exception e){
			test.log(LogStatus.FAIL,"Layaways Tab is not displayed");
		}
	}

	//android.widget.GridView/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]
	
	public void verify_The_Closed_Checks_Order() throws Throwable {
		
		//web element for the check number in the sale history page
		List<WebElement> ele = driver.findElements(By.xpath("//android.widget.GridView/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]"));
		
		ArrayList<String> ArLst=new ArrayList<String>();
		
			for(int i = 1; i <=ele.size() ; i++)
			{
				ArLst.add(driver.findElement(By.xpath("//android.widget.GridView/android.view.View[2]/android.view.View/android.view.View/android.view.View["+i+"]/android.view.View[2]")).getText());
			}
			
			ArrayList<String> sortedLst=new ArrayList<String>();
			
			for(String st:ArLst)
			{
				sortedLst.add(st);
			}
			
			Collections.sort(sortedLst);
			//Collections.reverse(sortedLst);
			//System.out.println(sortedLst);
			
			if(sortedLst.equals(ArLst))
			{
				test.log(LogStatus.PASS,"Checks are arranged correctly");
				
				ut.PassedCaptureScreenshotAsBASE64(driver, test);
				System.out.println("Sorted List from Table(Actual - Ascending) : "+ArLst);
				System.out.println("Sorted List from Table(Expected - Ascending) : "+sortedLst);
			}
			else
			{
				test.log(LogStatus.FAIL, "Checks are arranged wrongly");
				
				ut.FailedCaptureScreenshotAsBASE64(driver, test);
				
				System.out.println("Sorted List from Table(Actual - Ascending) : "+ArLst);
				System.out.println("Sorted List from Table(Expected - Ascending) : "+sortedLst);
			}
		
			Thread.sleep(1000);
			//click the retail button from the All orders page
			AllOrders_Retail_Btn.click();
	}

	@AndroidFindBy(xpath = "//*[contains(@text,'Standard Item')]")//android.view.View//*[contains(@text,'Standard Item')]
	WebElement Order_Screen_Category_StandardItem;

	public void Select_Child_Menu_Item(String childItem,String price) throws Throwable {
		cm = new Common_xpath();
		
		click_Ele(Order_Screen_Category_StandardItem);
		
		Thread.sleep(2000);
		//click the child item
		click_Ele(driver.findElement(By.xpath("//*[contains(@text,'"+childItem+"')]")));
		Thread.sleep(2000);
		
		//click the cancel button
		click_Ele(Menu_Screen_Category_Cancel_Btn);
		Thread.sleep(1000);
		
		try {
			if(getFirstMenuItem_OrderScreen().getText().equals(childItem)) {
				test.log(LogStatus.PASS, "Child Item added successfully in Order Screen");
			}
		}catch(Exception c) {
			test.log(LogStatus.FAIL, "Child Item added fail in Order Screen");
		}
		
		try {
			if(getFirstMenuItemPrice_OrderScreen().getText().equals(price)) {
				test.log(LogStatus.PASS, "Child Item price displyed successfully in Order Screen");
			}
		}catch(Exception c) {
			test.log(LogStatus.FAIL, "Child Item price displayed wrongly in Order Screen");
		}
		
	}

	public void OrderScreen_Serach() throws Throwable {
		cm = new Common_xpath();
		
		
		click_Ele(Order_Screen_Serach_Box);
		send_data(Order_Screen_Serach_Box, "standard Item");
//		driver.hideKeyboard();
		Random_Selection(driver, "//*[contains(@text,'Search')]/android.view.View/android.view.View/android.view.View");
		click_Ele(Order_Screen_Total_ColumnTxt);
		ClearData_inputBOX(Order_Screen_Serach_Box);
		
	}

	public String get_TotalAmount() {
		return getOrder_Screen_Total_Value().getText();
	}

	public String getDiscountAmount(){
		return getOrder_Screen_Discount_Value().getText();
	}

	public String get_SubtotalAmount(){
		return getOrder_Screen_SubTotal_Value().getText();
	}

	public String get_TaxAmount(){
		return getOrder_Screen_Tax_Value().getText();
	}

	public void VerifyTheSubtotalTaxTotal_Exchange(String subtotal,String tax,String tot){
		String st = get_SubtotalAmount();
		String ta = get_TaxAmount();
		String to = get_TotalAmount();
		if(st.equals(subtotal)){
			test.log(LogStatus.FAIL,"Recently added retail item, subTotal is not added in to the Sub total field");
		}else{
			test.log(LogStatus.PASS,"Recently added retail item, subTotal is added in to the Sub total field");
		}

		if(ta.equals(tax)){
			test.log(LogStatus.FAIL,"Recently added retail item, tax is not added in to the tax field");
		}else{
			test.log(LogStatus.PASS,"Recently added retail item, tax is added in to the tax field");
		}

		if(to.equals(tot)){
			test.log(LogStatus.FAIL,"Recently added retail item, Total is not added in to the total field");
		}else{
			test.log(LogStatus.PASS,"Recently added retail item, Total is added in to the total field");
		}
	}

	public String get_PaidAmount(){return getOrder_Screen_Paid_Amount_Value().getText();}

	public String get_BalanceAmount(){return getOrder_Screen_Balance_Amount_Value().getText();}

	public String get_GratuityAmount(){
		String s;

		try{
			s = getOrder_Screen_Gratuity().getText();
		}catch (Exception e){
			s = "aaa";
		}

		return s;
	}

	public String get_DiscountAmount(){
		String s;

		try{
			s = getOrder_Screen_Discount_Value().getText();
		}catch (Exception e){
			s = "aaa";
		}

		return s;
	}

	public String get_ServiceChargeAmount(){

		String s;

		try{
			s = getOrder_Screen_ServiceCharge().getText();
		}catch (Exception e){
			s = "aaa";
		}

		return s;
	}

	@AndroidFindBy(xpath = "//*[contains(@text,'Due Balance')]/../android.widget.TextView[2]")
	WebElement Enter_Deposit_Amount_DueBalance;

	@AndroidFindBy(xpath = "//*[contains(@text,'Due Balance')]/../android.widget.TextView[4]")
	WebElement Enter_Deposit_Amount_SuggestedDeposit;

	@AndroidFindBy(xpath = "//*[contains(@text,'Due Balance')]/../android.widget.TextView[6]")
	WebElement Enter_Deposit_Amount_MinimumDeposit;

	public String getTheSuggestedDepositValue(){
		return Enter_Deposit_Amount_SuggestedDeposit.getText();
	}

	public String getTheMinimumDepositValue(){
		return Enter_Deposit_Amount_MinimumDeposit.getText();
	}

	public void verifyTheReopenCheck_SubTotal(String SubTotal){
		//Get the subTotal
		String st = get_SubtotalAmount();

		if(st.equals(SubTotal)){
			test.log(LogStatus.PASS,"Subtotal value is same after reopen/return the receipt");
		}else{
			test.log(LogStatus.INFO,"The Subtotal when user create the sale : "+SubTotal);
			test.log(LogStatus.INFO,"The Subtotal after reopen/return the receipt : "+st);
			test.log(LogStatus.FAIL,"Subtotal value is not same after reopen/return the receipt");
		}
	}

	public void verifyTheReopenCheck_Total(String Total){
		//Get the Total
		String st = get_TotalAmount();

		if(st.equals(Total)){
			test.log(LogStatus.PASS,"Total value is same after reopen/return the receipt");
		}else{
			test.log(LogStatus.INFO,"The Total when user create the sale : "+Total);
			test.log(LogStatus.INFO,"The Total after reopen/return the receipt : "+st);
			test.log(LogStatus.FAIL,"Total value is not same after reopen/return the receipt");
		}
	}

	public void verifyTheReopenCheck_Paid(String Total){
		//Get the Total
		String st = getOrder_Screen_Paid_Amount_Value().getText();

		if(st.equals(Total)){
			test.log(LogStatus.PASS,"Paid amount value is displayed correctly after reopen/return the receipt");
		}else{
			test.log(LogStatus.INFO,"The Paid amount when user create the sale : "+Total);
			test.log(LogStatus.INFO,"The Paid amount after reopen/return the receipt : "+st);
			test.log(LogStatus.FAIL,"Paid amount value is not same after reopen/return the receipt");
		}
	}

	public void verifyTheReopenCheck_BalanceAmount(String BalanceAmount){
		//Get the Total
		String st = getOrder_Screen_Balance_Amount_Value().getText();

		if(st.equals(BalanceAmount)){
			test.log(LogStatus.PASS,"Balance amount value is displayed correctly after reopen/return the receipt");
		}else{
			test.log(LogStatus.INFO,"The Balance amount when user create the sale : "+BalanceAmount);
			test.log(LogStatus.INFO,"The Balance amount after reopen/return the receipt : "+st);
			test.log(LogStatus.FAIL,"Balance amount value is not same after reopen/return the receipt");
		}
	}

	public void verifyTheReopenCheck_CheckNo(String CheckNo){
		//Get the check number
		String CN = get_Check_NO();

		if(CN.equals(CheckNo)){
			test.log(LogStatus.FAIL,"Check Number is same after reopen/return the receipt");
		}else{
			test.log(LogStatus.INFO,"The Check Number when user create the sale : "+CheckNo);
			test.log(LogStatus.INFO,"The Check Number after reopen/return the receipt : "+CN);
			test.log(LogStatus.PASS,"Check Number value is not same after reopen/return the receipt");
		}
	}

	public void verifyTheReopenCheck_Tax(String Tax){
		//Get the tax
		String taxx = get_TaxAmount();

		if(taxx.equals(Tax)){
			test.log(LogStatus.PASS,"Tax is same after reopen/return the receipt");
		}else{
			test.log(LogStatus.INFO,"The tax when user create the sale : "+Tax);
			test.log(LogStatus.INFO,"The tax after reopen/return the receipt : "+taxx);
			test.log(LogStatus.FAIL,"Tax value is not same after reopen/return the receipt");
		}
	}

	public void verifyTheValuesSuggestedDeposit(String Total, String suggDepo){
		double tot = Double.parseDouble(Total);
		double sugg = Double.parseDouble(suggDepo);

		double sugg1 = (sugg * tot)/100;
		sugg1 = Math.round(sugg1*100.00)/100.00;
		test.log(LogStatus.INFO, "The Calculated Suggested Deposit is : "+sugg1);

		String s1 = getTheSuggestedDepositValue().replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
		double sug = Double.parseDouble(s1);
		test.log(LogStatus.INFO, "The Suggested Deposit from the Enter Deposit Amount is : "+sug);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Check whether the check number is available or not
		if(sug == sugg1){
			test.log(LogStatus.PASS,"The Suggested Deposit is calculated correctly");
		}else{
			double diff = sugg1 - sug;
			test.log(LogStatus.FAIL,"The Suggested Deposit is calculated wrongly and the difference is : "+diff);
		}
	}

	public void verifyTheValuesMinimumDeposit(String Total,String minDepo){
		double tot = Double.parseDouble(Total);
		double mind = Double.parseDouble(minDepo);

		double mind1 = (mind * tot)/100;
		mind1 = Math.round(mind1*100.00)/100.00;
		test.log(LogStatus.INFO, "The Calculated Minimum Deposit is : "+mind1);

		String s1 = getTheMinimumDepositValue().replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
		double min = Double.parseDouble(s1);
		test.log(LogStatus.INFO, "The Minimum Deposit from the Enter Deposit Amount is : "+min);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Check whether the check number is available or not
		if(min == mind1){
			test.log(LogStatus.PASS,"The Minimum Deposit is calculated correctly");
		}else{
			double diff = mind1 - min;
			test.log(LogStatus.FAIL,"The Minimum Deposit is calculated wrongly and the difference is : "+diff);
		}
	}

	public void verifyTheMenuItemPriceForMarkupAddedMenuItem(String item, String price) throws Throwable {
		double calculatedPrice = Get_Price_Amount_For_Every_MenuItem(driver,"(//*[@text='X'])","/../..//android.widget.TextView[5]");
		System.out.println("Calculate Price Value is : "+calculatedPrice);
		double t1 = Double.parseDouble(item);
		double t2 = Double.parseDouble(price);
		double actual = ((t1 * t2)/100)+t1;
		System.out.println("Actual Price value is : "+actual);
		if(actual == calculatedPrice){
			test.log(LogStatus.INFO,"Calculated price is : "+calculatedPrice);
			test.log(LogStatus.INFO,"Actual price is : "+actual);
			test.log(LogStatus.PASS,"Markup value added correctly in the menu item and the final price is : "+actual);
		}
		else {
			double diff = calculatedPrice - actual;
			test.log(LogStatus.INFO,"Calculated price is : "+calculatedPrice);
			test.log(LogStatus.INFO,"Actual price is : "+actual);
			test.log(LogStatus.FAIL,"Markup price added wrongly in the menu item and difference is : "+diff);
		}
	}
	
	public void Check_Values_Validations() throws Throwable {

		cm = new Common_xpath();

		//Total price value calculated in float
		Float Calculated_Total_Price = Get_Price_Amount_For_Every_MenuItem(driver, "(//*[@text='X'])", "/../..//android.widget.TextView[5]");
		//Total total amount value calculated in float
		Float Calculated_Total_Amount = Get_Total_Amount_For_Every_MenuItem(driver, "(//*[@text='X'])", "/../..//android.widget.TextView[7]");

		//Actual Sub Total value in ordre screen
		String actualText1 = getOrder_Screen_SubTotal_Value().getText();

		// Replace all commo's with empty space
		String actualText = actualText1.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);

		// Convert the String value of the Net Sales element into float value
		float actual_SubTotal_Value = Float.parseFloat(actualText);

		System.out.println("Actual Sub-Total Value :" + actual_SubTotal_Value);

		String actualText2 = getOrder_Screen_Total_Value().getText();

		// Replace all commo's with empty space
		String actualText3 = actualText2.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);

		// Convert the String value of the Net Sales element into float value
		float actual_Total_Value = Float.parseFloat(actualText3);

		System.out.println("Actual Total Value :" + actual_Total_Value);

		// Check weather the Calculated Price amount and Actual Price amount is same or not
		if (Calculated_Total_Price == actual_SubTotal_Value) {
			test.log(LogStatus.PASS, "Actual and Expected Sub-Total amount are same");

			// Print the actual value
			System.out.println("The Actual Sub-Total Value is : " + actual_SubTotal_Value);

			test.log(LogStatus.PASS, "The Actual Sub-Total Value is : " + actual_SubTotal_Value);
		}

		else if (actual_SubTotal_Value == unknownValue) {
			test.log(LogStatus.PASS, "Here we don't have the exact expected value");

			System.out.println("The Actual Sub-Total value is : " + actual_SubTotal_Value);

			test.log(LogStatus.INFO, "The Actual Sub-Total value is : " + actual_SubTotal_Value);
		}

		else {
			test.log(LogStatus.FAIL, "Actual and Expected Sub-Total values are different");

			// Get the different
			float different = Calculated_Total_Price - actual_SubTotal_Value;

			// Print the different value
			System.out.println("Sub-Total Value different is : " + different);

			test.log(LogStatus.FAIL, "Sub-Total Value different is : " + different);
		}

		// Check weather the Calculated Total amount and Actual Total amount is same or not
		if (Calculated_Total_Amount == actual_Total_Value) {
			test.log(LogStatus.PASS, "Actual and Expected Total amount are same");

			// Print the actual value
			System.out.println("The Actual Total Value is : " + actual_Total_Value);

			test.log(LogStatus.PASS, "The Actual Total Value is : " + actual_Total_Value);
		}

		else if (actual_Total_Value == unknownValue) {
			test.log(LogStatus.PASS, "Here we don't have the exact expected value");

			System.out.println("The Actual Total value is : " + actual_Total_Value);

			test.log(LogStatus.INFO, "The Actual Total value is : " + actual_Total_Value);
		}

		else {
			test.log(LogStatus.FAIL, "Actual and Expected Total values are different");

			System.out.println("******************");
			System.out.println(Calculated_Total_Amount);
			System.out.println(actual_Total_Value);
			System.out.println("******************");

			// Get the different
			float different = Calculated_Total_Amount - actual_Total_Value;

			// Print the different value
			System.out.println("Total Value different is : " + different);

			test.log(LogStatus.FAIL, "Total Value different is : " + different);
		}
	}

	public void cancelBtn_DiscountSelectionScreen(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//Click the cancel btn
		click_Ele(driver.findElement(By.xpath("//*[contains(@text,'Cancel')]")));
	}
	public void chooseTheIBT_AfterTax(String disc){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//click the required tax
		click_Ele(driver.findElement(By.xpath("//*[contains(@text,'"+disc+"')]")));
	}

	public void Check_Values_Validations_With_Item_Based_Discount_After_Tax(String dis) throws Throwable {

		cm = new Common_xpath();

		//Total price value calculated in float
		Float Calculated_Total_Price = Get_Price_Amount_For_Every_MenuItem(driver, "(//*[@text='X'])", "/../..//android.widget.TextView[5]");
		//Total total amount value calculated in float
		Float Calculated_Total_Amount = Get_Total_Amount_For_Every_MenuItem(driver, "(//*[@text='X'])", "/../..//android.widget.TextView[7]");
		//Total total amount value calculated in float
		double Calculated_Disc_Amount = Get_ItemBasedDisc_Amount_AfterTax_For_Every_MenuItem(driver, "(//*[@text='X'])", "/../..//android.widget.TextView[6]",dis);

		//Actual Sub Total value in ordre screen
		String actualText1 = getOrder_Screen_SubTotal_Value().getText();

		// Replace all commo's with empty space
		String actualText = actualText1.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);

		// Convert the String value of the Net Sales element into float value
		float actual_SubTotal_Value = Float.parseFloat(actualText);

		System.out.println("Actual Sub-Total Value :" + actual_SubTotal_Value);

		String actualText2 = getOrder_Screen_Total_Value().getText();

		// Replace all commo's with empty space
		String actualText3 = actualText2.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);

		// Convert the String value of the Net Sales element into float value
		float actual_Total_Value = Float.parseFloat(actualText3);

		System.out.println("Actual Total Value :" + actual_Total_Value);

		String discount = getOrder_Screen_Discount_Value().getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
		double disc1 = Double.parseDouble(discount);
		System.out.println("Actual Discount Value :" + disc1);

		// Check weather the Calculated Price amount and Actual Price amount is same or not
		if (Calculated_Total_Price == actual_SubTotal_Value) {
			test.log(LogStatus.PASS, "Actual and Expected Sub-Total amount are same");

			ut.PassedCaptureScreenshotAsBASE64(driver,test);

			// Print the actual value
			System.out.println("The Actual Sub-Total Value is : " + actual_SubTotal_Value);

			test.log(LogStatus.PASS, "The Actual Sub-Total Value is : " + actual_SubTotal_Value);
		}

		else if (actual_SubTotal_Value == unknownValue) {
			test.log(LogStatus.PASS, "Here we don't have the exact expected value");

			System.out.println("The Actual Sub-Total value is : " + actual_SubTotal_Value);

			test.log(LogStatus.INFO, "The Actual Sub-Total value is : " + actual_SubTotal_Value);
		}

		else {
			test.log(LogStatus.FAIL, "Actual and Expected Sub-Total values are different");
			ut.FailedCaptureScreenshotAsBASE64(driver,test);

			// Get the different
			float different = Calculated_Total_Price - actual_SubTotal_Value;

			// Print the different value
			System.out.println("Sub-Total Value different is : " + different);

			test.log(LogStatus.FAIL, "Sub-Total Value different is : " + different);
		}

		// Check weather the Calculated Total amount and Actual Total amount is same or not
		if (Calculated_Total_Amount == actual_Total_Value) {
			test.log(LogStatus.PASS, "Actual and Expected Total amount are same");

			// Print the actual value
			System.out.println("The Actual Total Value is : " + actual_Total_Value);

			test.log(LogStatus.PASS, "The Actual Total Value is : " + actual_Total_Value);
		}

		else if (actual_Total_Value == unknownValue) {
			test.log(LogStatus.PASS, "Here we don't have the exact expected value");

			System.out.println("The Actual Total value is : " + actual_Total_Value);

			test.log(LogStatus.INFO, "The Actual Total value is : " + actual_Total_Value);
		}

		else {
			test.log(LogStatus.FAIL, "Actual and Expected Total values are different");

			System.out.println("******************");
			System.out.println(Calculated_Total_Amount);
			System.out.println(actual_Total_Value);
			System.out.println("******************");

			// Get the different
			float different = Calculated_Total_Amount - actual_Total_Value;

			// Print the different value
			System.out.println("Total Value different is : " + different);

			test.log(LogStatus.FAIL, "Total Value different is : " + different);
		}


		// Check weather the Calculated Total amount and Actual Total amount is same or not
		if (Calculated_Disc_Amount == disc1) {
			test.log(LogStatus.PASS, "Actual and Expected Discount amount are same");

			// Print the actual value
			System.out.println("The Actual Discount Value is : " + disc1);

			test.log(LogStatus.PASS, "The Actual Discount Value is : " + disc1);
		}
		else {

			double diff = Calculated_Disc_Amount - disc1;

			test.log(LogStatus.FAIL, "Actual and Expected Discount values are different and the difference is : "+diff);

			// Print the different value
			System.out.println("Total Value different is : " + diff);
		}
	}


	
	public String get_Check_NO() {
		return Get_Text(getOrder_Screen_Check_No());
	}

	public void verifyTheCheckNumber(String checkNumber){
		try{
			if(get_Check_NO().equals(checkNumber)){
				test.log(LogStatus.PASS,"The required check is available in the retail screen");
			}
		}catch (Exception e){
			test.log(LogStatus.FAIL,"The required check is not available in the retail screen");
		}
	}

	public void verifyTheCheckNumber_Refund(String checkNumber){
		try{
			checkNumber = "R".concat(checkNumber);
			if(get_Check_NO().equals(checkNumber)){
				test.log(LogStatus.PASS,"The required check is available in the retail screen - after click the Return button");
			}
		}catch (Exception e){
			test.log(LogStatus.FAIL,"The required check is not available in the retail screen - after click the Return button");
		}
	}

	public void verifyTheCheckNumber_Exchange(String checkNumber){
		try{
			String CheckNo1 = checkNumber.substring(checkNumber.indexOf("-")+1).trim();

			//parse the check number
			int cknum = Integer.parseInt(CheckNo1);

			cknum = cknum + 1;

			String cn = String.valueOf(cknum);

			if(get_Check_NO().contains(cn)){
				test.log(LogStatus.PASS,"The required check is available in the retail screen - after click the Exchange button");
			}
		}catch (Exception e){
			test.log(LogStatus.FAIL,"The required check is not available in the retail screen - after click the Exchange button");
		}
	}

	public void verifyTheCheckNumber_RetailScreenWhenDoingRefund(String checkNumber){
		checkNumber = "R".concat(checkNumber);
		try{
			if(get_Check_NO().equals(checkNumber)){
				test.log(LogStatus.PASS,"The required check is available in the retail screen, when user try to do the refund");
			}
		}catch (Exception e){
			test.log(LogStatus.FAIL,"The required check is not available in the retail screen, when user try to do the refund");
		}
	}

	public String getCustomerName(){
		return Get_Text(getOrder_Screen_Customer());
	}

	public void verifyTheCustomerName(String customerName){
		try{
			if(getCustomerName().equals(customerName)){
				test.log(LogStatus.PASS,"The required customer is available in the retail screen");
			}
		}catch (Exception e){
			test.log(LogStatus.FAIL,"The required customer is not available in the retail screen");
		}
	}
	
	public void balance_Amount() {
		cm = new Common_xpath();
		
		
		        //Actual Sub Total value in ordre screen
				String actualText1 = getOrder_Screen_Total_Value().getText();
			
				// Replace all commo's with empty space
			    String actualText = actualText1.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);

				// Convert the String value of the Net Sales element into float value
				float actual_Total_Value = Float.parseFloat(actualText);
				
				 //Actual Sub Total value in ordre screen
				String actualText2 = getOrder_Screen_Total_Value().getText();
			
				// Replace all commo's with empty space
			    String actualText_Paid_Amount = actualText2.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);

				// Convert the String value of the Net Sales element into float value
				float actual_Paid_Amount_Value = Float.parseFloat(actualText_Paid_Amount);
				
				 //Actual Sub Total value in ordre screen
				String actualText3 = getOrder_Screen_Total_Value().getText();
			
				// Replace all commo's with empty space
			    String actualText_Balance_Amount = actualText3.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);

				// Convert the String value of the Net Sales element into float value
				float actual_Balance_Amount_Value = Float.parseFloat(actualText_Balance_Amount);
				
				//Gettign subtracted wiht the Check total and the Paud amount we can get the calculated balance amount
				Float Calculated_Balance_Amount =  actual_Total_Value - actual_Paid_Amount_Value;
				
				// Check weather the Calculated Balance amount and Actual Balance amount is same or not
				if (Calculated_Balance_Amount == actual_Balance_Amount_Value) {
					test.log(LogStatus.PASS, "Actual and Expected Balance amount are same");

					// Print the actual value
					System.out.println("The Actual Balance amount Value is : " + actual_Balance_Amount_Value);

					test.log(LogStatus.PASS, "The Actual Balance amount Value is : " + actual_Balance_Amount_Value);
				}
				else if (actual_Balance_Amount_Value == unknownValue) {
					test.log(LogStatus.PASS, "Here we don't have the exact expected value");

					System.out.println("The Actual Balance amount value is : " + actual_Balance_Amount_Value);

					test.log(LogStatus.INFO, "The Actual Balance amount value is : " + actual_Balance_Amount_Value);
				}
				else {
					test.log(LogStatus.FAIL, "Actual and Expected Balance amount values are different");

					// Get the different
					float different = Calculated_Balance_Amount - actual_Balance_Amount_Value;

					// Print the different value
					System.out.println("Balance amount Value different is : " + different);

					test.log(LogStatus.FAIL, "Balance amount Value different is : " + different);
				}
	}
	
	public void balance_Amount1() {
		        //Get the value of Total amount from the Order Screen
				String actual_Total = getOrder_Screen_Total_Value().getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
				
				//Parse the total string value into double
				double act_Total = Double.parseDouble(actual_Total);
				
				 //Get the value of Paid amount from the Order Screen
				String actual_Paid = getOrder_Screen_Paid_Amount_Value().getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
			
				//Parse the paid string value into double
				double act_Paid = Double.parseDouble(actual_Paid);
				
				 //Get the value of balance amount from the Order Screen
				String actual_Balance = getOrder_Screen_Balance_Amount_Value().getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
			
				//Parse the balance string value into double
				double act_Balance = Double.parseDouble(actual_Balance);
				
				//Subtract the paid value from the Total value then we get the balance amount
				double Calculated_Balance_Amount =  act_Total - act_Paid;
				
				// Check weather the Calculated Balance amount and Actual Balance amount is same or not
				if (Calculated_Balance_Amount == act_Balance) {
					test.log(LogStatus.PASS, "Actual and Expected Balance amount are same");

					// Print the actual value
					System.out.println("The Actual Balance amount Value is : " + act_Balance);

					test.log(LogStatus.PASS, "The Actual Balance amount Value is : " + act_Balance);
				}

				else {
					test.log(LogStatus.FAIL, "Actual and Expected Balance amount values are different");

					// Get the different
					double different = Calculated_Balance_Amount - act_Balance;

					// Print the different value
					System.out.println("Balance amount Value different is : " + different);

					test.log(LogStatus.FAIL, "Balance amount Value different is : " + different);
				}
	}

	@AndroidFindBy(xpath = "//*[contains(@text,'Due Balance')]")
	WebElement Enter_Deposit_Amount_Screen_Due_Balance;

	@AndroidFindBy(xpath = "//*[contains(@text,'Due Balance')]/../../android.view.View[2]/android.widget.TextView")
	WebElement Amount_InEnterDepositAmount;

	public String getAmountInEnterDepositAmountPopup(){
		return Amount_InEnterDepositAmount.getText();
	}

	public void verifyTheSuggestedAmountInEnterDepositAmountScreen(){
		if(getAmountInEnterDepositAmountPopup().equals(getTheSuggestedDepositValue())){
			test.log(LogStatus.PASS,"Suggested Deposit Amount and the Amount in number pad are same");
		}else{
			test.log(LogStatus.FAIL,"Suggested Deposit Amount and the Amount in number pad are not same, in number pad displayed amount is : "+getAmountInEnterDepositAmountPopup());
		}
	}

	public void verifyTheMinimumAmountInEnterDepositAmountScreen(){
		if(getAmountInEnterDepositAmountPopup().equals(getTheMinimumDepositValue())){
			test.log(LogStatus.PASS,"Minimum Deposit Amount and the Amount in number pad are same");
		}else{
			test.log(LogStatus.FAIL,"Minimum Deposit Amount and the Amount in number pad are not same, in number pad displayed amount is : "+getAmountInEnterDepositAmountPopup());
		}
	}

	public void verifyTheSuggestedOrMinimumAmountInEnterDepositAmountScreen(){
		if(getAmountInEnterDepositAmountPopup().equals(getTheMinimumDepositValue()) || getAmountInEnterDepositAmountPopup().equals(getTheSuggestedDepositValue())){
			test.log(LogStatus.PASS,"Minimum or Suggested Deposit Amount and the Amount in number pad are same");
		}else{
			test.log(LogStatus.FAIL,"Minimum or Suggested Deposit Amount and the Amount in number pad are not same, in number pad displayed amount is : "+getAmountInEnterDepositAmountPopup());
		}
	}

	@AndroidFindBy(xpath = "//*[contains(@text,'Suggested Deposit')]")
	WebElement Enter_Deposit_Amount_Screen_Suggested_Deposit;

	@AndroidFindBy(xpath = "//*[contains(@text,'Min. Deposit')]")
	WebElement Enter_Deposit_Amount_Screen_Min_Deposit;

	@AndroidFindBy(xpath = "//*[contains(@text,'SUGG. DEPOSIT')]")
	WebElement Enter_Deposit_Amount_Screen_SUGG_DEPOSIT;

	@AndroidFindBy(xpath = "//*[contains(@text,'MIN. DEPOSIT')]")
	WebElement Enter_Deposit_Amount_Screen_MIN_DEPOSIT;

	@AndroidFindBy(xpath = "//*[contains(@text,'GET DEPOSIT')]")
	WebElement Enter_Deposit_Amount_Screen_GET_DEPOSIT;

	public WebElement get_Enter_Deposit_Amount_Screen_Due_Balance(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return Enter_Deposit_Amount_Screen_Due_Balance;
	}

	public WebElement get_Enter_Deposit_Amount_Screen_Suggested_Deposit(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return Enter_Deposit_Amount_Screen_Suggested_Deposit;
	}

	public WebElement get_Enter_Deposit_Amount_Screen_Min_Deposit(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return Enter_Deposit_Amount_Screen_Min_Deposit;
	}

	public WebElement get_Enter_Deposit_Amount_Screen_SUGG_DEPOSIT(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return Enter_Deposit_Amount_Screen_SUGG_DEPOSIT;
	}

	public WebElement get_Enter_Deposit_Amount_Screen_MIN_DEPOSIT(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return Enter_Deposit_Amount_Screen_MIN_DEPOSIT;
	}

	public WebElement get_Enter_Deposit_Amount_Screen_GET_DEPOSIT(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return Enter_Deposit_Amount_Screen_GET_DEPOSIT;
	}

	public void clickSuggestedDepositOrMinimumDeposit(){
		int i = 1;
		int rand = ThreadLocalRandom.current().nextInt(1,2);
		if(i == rand){
			get_Enter_Deposit_Amount_Screen_SUGG_DEPOSIT().click();
		}else{
			get_Enter_Deposit_Amount_Screen_MIN_DEPOSIT().click();
		}
	}

	public void verifyTheElementAvailabilityInEnterDepositAmountScreen(){
		try{
			if(get_Enter_Deposit_Amount_Screen_Due_Balance().isDisplayed() && get_Enter_Deposit_Amount_Screen_Suggested_Deposit().isDisplayed() && get_Enter_Deposit_Amount_Screen_Min_Deposit().isDisplayed() &&
				get_Enter_Deposit_Amount_Screen_SUGG_DEPOSIT().isDisplayed() && get_Enter_Deposit_Amount_Screen_MIN_DEPOSIT().isDisplayed() && get_Enter_Deposit_Amount_Screen_GET_DEPOSIT().isDisplayed()){
				test.log(LogStatus.PASS,"The required elements are available in the Enter Deposit Amount Screen");
			}
		}catch (Exception e){
			test.log(LogStatus.FAIL,"The required elements are not available in the Enter Deposit Amount Screen");
		}
	}

	@AndroidFindBy(xpath = "//android.view.View//*[contains(@text,'For Taxes')]")
	WebElement Order_Screen_Category_ForTaxes;

	@AndroidFindBy(xpath = "//*[contains(@text,'For_Inclusive_Tax')]")
	WebElement Order_Screen_Category_For_Inclusive_Tax;

	@AndroidFindBy(xpath = "//*[contains(@text,'Inclusive_Standard')]")
	WebElement Order_Screen_Category_Inclusive_Standard;

	@AndroidFindBy(xpath = "//*[contains(@text,'Inclusive_Variant')]")
	WebElement Order_Screen_Category_Inclusive_Variant;

	@AndroidFindBy(xpath = "//*[contains(@text,'Inclusive_KitAssembly')]")
	WebElement Order_Screen_Category_Inclusive_KitAssembly;

	@AndroidFindBy(xpath = "//*[contains(@text,'For_QuantityBasedTax')]")
	WebElement Order_Screen_Category_For_QuantityBasedTax;

	@AndroidFindBy(xpath = "//*[contains(@text,'For_CheckBasedTax')]")
	WebElement Order_Screen_Category_For_CheckBasedTax;

	@AndroidFindBy(xpath = "//*[contains(@text,'For_Tax_On_IBT')]")
	WebElement Order_Screen_Category_For_Tax_On_IBT;

	public void Single_Random_Menu_Selection_ForInclusiveTaxes() throws Throwable {
		cm = new Common_xpath();

		click_Ele(Order_Screen_Category_ForTaxes);
		Thread.sleep(1000);
		click_Ele(Order_Screen_Category_For_Inclusive_Tax);
		Thread.sleep(1000);
		Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
		Thread.sleep(2000);
		click_Ele(Menu_Screen_Category_Cancel_Btn);
		Thread.sleep(1000);
	}

	public void multipleMenu_Selection_Random_Inclusive_KitAssembly() throws Throwable {
		click_Ele(Order_Screen_Category_ForTaxes);
		Thread.sleep(1000);
		click_Ele(Order_Screen_Category_Inclusive_KitAssembly);
		Thread.sleep(1000);
		Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
		Thread.sleep(2000);
		Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
		Thread.sleep(2000);
		Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
		Thread.sleep(2000);
		click_Ele(Menu_Screen_Category_Cancel_Btn);
		Thread.sleep(1000);

	}

	public void multipleMenu_Selection_Random_Inclusive_Standard() throws Throwable {
		click_Ele(Order_Screen_Category_ForTaxes);
		Thread.sleep(1000);
		click_Ele(Order_Screen_Category_Inclusive_Standard);
		Thread.sleep(1000);
		Random_ForMultipule_Selection(driver, "//*[contains(@resource-id,'menu-item')]");
//		Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
//		Thread.sleep(2000);
//		Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
//		Thread.sleep(2000);
//		Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
		Thread.sleep(2000);
		click_Ele(Menu_Screen_Category_Cancel_Btn);
		Thread.sleep(1000);

	}

	public void multipleMenu_Selection_Random_Inclusive_Variant() throws Throwable {

		click_Ele(Order_Screen_Category_ForTaxes);
		Thread.sleep(1000);
		click_Ele(Order_Screen_Category_Inclusive_Variant);
		Thread.sleep(1000);
		Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
		Thread.sleep(1000);
		Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
		Thread.sleep(1000);
		Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
		Thread.sleep(1000);
		click_Ele(Menu_Screen_Category_Cancel_Btn);
		Thread.sleep(1000);

	}

	public void Single_Random_Menu_Selection_ForInclusiveTaxes_Variant() throws Throwable {
		cm = new Common_xpath();

		click_Ele(Order_Screen_Category_ForTaxes);
		Thread.sleep(1000);
		click_Ele(Order_Screen_Category_Inclusive_Variant);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(@text,'InclusiveTax_Variant')]")).click();
		Thread.sleep(1000);
		selectOptions();
		Thread.sleep(2000);
		click_Ele(Menu_Screen_Category_Cancel_Btn);
		Thread.sleep(1000);
	}

	public void Single_Random_Menu_Selection_ForInclusiveTaxes_KitAssembly() throws Throwable {
		cm = new Common_xpath();

		click_Ele(Order_Screen_Category_ForTaxes);
		Thread.sleep(1000);
		click_Ele(Order_Screen_Category_Inclusive_KitAssembly);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(@text,'InclusiveTax_KitAssembly')]")).click();
		Thread.sleep(1000);
		selectOptions();
		Thread.sleep(2000);
		click_Ele(Menu_Screen_Category_Cancel_Btn);
		Thread.sleep(1000);
	}

	public void Single_Random_Menu_Selection_ForInclusiveTaxes_Standard() throws Throwable {
		cm = new Common_xpath();

		click_Ele(Order_Screen_Category_ForTaxes);
		Thread.sleep(1000);
		click_Ele(Order_Screen_Category_Inclusive_Standard);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(@text,'InclusiveTax_Standard')]")).click();
		Thread.sleep(2000);
		click_Ele(Menu_Screen_Category_Cancel_Btn);
		Thread.sleep(1000);
	}

	public void Single_Random_Menu_Selection_ForQBTaxes() throws Throwable {
		cm = new Common_xpath();

		click_Ele(Order_Screen_Category_ForTaxes);
		Thread.sleep(1000);
		click_Ele(Order_Screen_Category_For_QuantityBasedTax);
		Thread.sleep(1000);
		Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
		Thread.sleep(2000);
		click_Ele(Menu_Screen_Category_Cancel_Btn);
		Thread.sleep(1000);
	}

	public void Single_Random_Menu_Selection_ForCBTaxes() throws Throwable {
		cm = new Common_xpath();

		click_Ele(Order_Screen_Category_ForTaxes);
		Thread.sleep(1000);
		click_Ele(Order_Screen_Category_For_CheckBasedTax);
		Thread.sleep(1000);
		Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
		Thread.sleep(2000);
		click_Ele(Menu_Screen_Category_Cancel_Btn);
		Thread.sleep(1000);
	}

	public void Single_Random_Menu_Selection_ForCBTaxes_Variant() throws Throwable {
		cm = new Common_xpath();

		click_Ele(Order_Screen_Category_ForTaxes);
		Thread.sleep(1000);
		click_Ele(Order_Screen_Category_For_CheckBasedTax);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(@text,'Variant_CBT')]")).click();
		Thread.sleep(1000);
		selectOptions();
		Thread.sleep(2000);
		click_Ele(Menu_Screen_Category_Cancel_Btn);
		Thread.sleep(1000);
	}

	public void Single_Random_Menu_Selection_ForTaxOnItemBasedTax() throws Throwable {
		cm = new Common_xpath();

		click_Ele(Order_Screen_Category_ForTaxes);
		Thread.sleep(1000);
		click_Ele(Order_Screen_Category_For_Tax_On_IBT);
		Thread.sleep(1000);
		Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
		Thread.sleep(2000);
		click_Ele(Menu_Screen_Category_Cancel_Btn);
		Thread.sleep(1000);
	}

	public void Inclusive_Tax_Calculation() throws Throwable {
		cm = new Common_xpath();

		//Actual sub taotal value in order screen
		String actualText1 = getOrder_Screen_SubTotal_Value().getText();

		double Calculated_Tax = Inclusive_Tax(actualText1);

		Calculated_Tax = Math.round(Calculated_Tax*100.00)/100.00;
		test.log(LogStatus.INFO,"Actual Total Tax Value(Calculated) : "+Calculated_Tax);

		String actualTextvalue = getOrder_Screen_Tax_Value().getText();
		String Report_Taxes = actualTextvalue.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);

		double actual_Tax = Float.parseFloat(Report_Taxes);

		actual_Tax = Math.round(actual_Tax*100.00)/100.00;

		System.out.println("Actual Total Tax Value : " + actual_Tax);
		test.log(LogStatus.INFO,"Actual Total Tax Value : "+actual_Tax);

		// Check weather the Calculated Total amount and Actual Total Tax amount is same or not
		if (Calculated_Tax == actual_Tax) {
			test.log(LogStatus.PASS, "Actual and Expected Total Tax amount are same");

			// Print the actual value
			System.out.println("The Actual Total Tax Value is : " + actual_Tax);

			test.log(LogStatus.PASS, "The Actual Total Tax Value is : " + actual_Tax);
		}

		else if (actual_Tax == unknownValue) {
			test.log(LogStatus.PASS, "Here we don't have the exact expected value");

			System.out.println("The Actual Total Tax value is : " + actual_Tax);

			test.log(LogStatus.INFO, "The Actual Total Tax value is : " + actual_Tax);
		}

		else {
			test.log(LogStatus.FAIL, "Actual and Expected Total Tax values are different");

			// Get the different
			double different = Calculated_Tax - actual_Tax;

			// Print the different value
			System.out.println("Total Tax Value different is : " + different);

			test.log(LogStatus.FAIL, "Total Tax Value different is : " + different);
		}

	}
	
	public void Exclusive_Tax_Calculation() throws Throwable {
		cm = new Common_xpath();

		//Actual sub taotal value in order screen
		String actualText1 = getOrder_Screen_SubTotal_Value().getText();
		System.out.println("Actual Subtotal Value : "+actualText1);
		test.log(LogStatus.INFO,"Actual Subtotal Value : "+actualText1);

		double Calculated_Tax_Value = Exclusive_Tax(actualText1);
		
		String actualTextValue = getOrder_Screen_Tax_Value().getText();
		String Report_Taxes = actualTextValue.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
		//		System.out.println("Actual Total Tax Value :" + actual_Tax_Value);

		double actual_Tax = Float.parseFloat(Report_Taxes);

		actual_Tax = Math.round(actual_Tax*100.00)/100.00;

		System.out.println("Actual Total Tax Value : " + actual_Tax);
		test.log(LogStatus.INFO,"Actual Total Tax Value : "+actual_Tax);

		// Check weather the Calculated Total amount and Actual Total Tax amount is same or not
		if (Calculated_Tax_Value == actual_Tax) {
			test.log(LogStatus.PASS, "Actual and Expected Total Tax amount are same");

			// Print the actual value
			System.out.println("The Actual Total Tax Value is : " + actual_Tax);

			test.log(LogStatus.PASS, "The Actual Total Tax Value is : " + actual_Tax);
		}

		else if (actual_Tax == unknownValue) {
			test.log(LogStatus.PASS, "Here we don't have the exact expected value");

			System.out.println("The Actual Total Tax value is : " + actual_Tax);

			test.log(LogStatus.INFO, "The Actual Total Tax value is : " + actual_Tax);
		}

		else {
			test.log(LogStatus.FAIL, "Actual and Expected Total Tax values are different");

			// Get the different
			double different = Calculated_Tax_Value - actual_Tax;

			// Print the different value
			System.out.println("Total Tax Value different is : " + different);

			test.log(LogStatus.FAIL, "Total Tax Value different is : " + different);
		}
		
	}

	public void Tax_On_Item_Tax_Calculation() throws Throwable {
		cm = new Common_xpath();


		//Actual sub taotal value in order screen
		String actualText1 = getOrder_Screen_SubTotal_Value().getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);;
		System.out.println("Actual Subtotal Value : "+actualText1);
		test.log(LogStatus.INFO,"Actual Subtotal Value : "+actualText1);

		//parse the subtotal - string value to the double value
		double st = Double.parseDouble(actualText1);

		//get the tax value from the common data property file
		String s1 = Utility.getProperty("Item_Tax");

		//get the tax value from the common data property file
		String s2 = Utility.getProperty("Tax_On_Item_Tax");

		//parse the string value to the double value
		double t1 = Double.parseDouble(s1);

		//parse the string value to the double value
		double t2 = Double.parseDouble(s2);

		//Calculate the tax value
		double tax1 = ((st * t1)/100);

		//round-off the tax1 value
		tax1 = Math.round(tax1 * 100.00)/100.00;

		System.out.println("Tax for the added menu item : "+tax1);
		test.log(LogStatus.INFO,"Tax for the added menu item : "+tax1);

		//Calculate the tax for the calculated tax value
		double tax2 = ((tax1 * t2)/100);

		//round-off the tax1 value
		tax2 = Math.round(tax2 * 100.00)/100.00;

		System.out.println("Tax on the calculated tax : "+tax2);
		test.log(LogStatus.INFO,"Tax on the calculated tax : "+tax2);

		double Calculated_Tax_Value = tax2 + tax1;
				Calculated_Tax_Value =  Math.round(Calculated_Tax_Value*100.00)/100.00;

		String actualTextvalue = getOrder_Screen_Tax_Value().getText();
		String Report_Taxes = actualTextvalue.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
		//		System.out.println("Actual Total Tax Value :" + actual_Tax_Value);

		double actual_Tax = Float.parseFloat(Report_Taxes);

		actual_Tax = Math.round(actual_Tax*100.00)/100.00;

		System.out.println("Actual Total Tax Value :" + actual_Tax);

		// Check weather the Calculated Total amount and Actual Total Tax amount is same or not
		if (Calculated_Tax_Value == actual_Tax) {
			test.log(LogStatus.PASS, "Actual and Expected Total Tax amount are same");

			// Print the actual value
			System.out.println("The Actual Total Tax Value is : " + actual_Tax);

			test.log(LogStatus.PASS, "The Actual Total Tax Value is : " + actual_Tax);
		}

		else if (actual_Tax == unknownValue) {
			test.log(LogStatus.PASS, "Here we don't have the exact expected value");

			System.out.println("The Actual Total Tax value is : " + actual_Tax);

			test.log(LogStatus.INFO, "The Actual Total Tax value is : " + actual_Tax);
		}

		else {
			test.log(LogStatus.FAIL, "Actual and Expected Total Tax values are different");

			// Get the different
			double different = Calculated_Tax_Value - actual_Tax;

			// Print the different value
			System.out.println("Total Tax Value different is : " + different);

			test.log(LogStatus.FAIL, "Total Tax Value different is : " + different);
		}

	}
	public void QB_Tax_Calculation() throws Throwable {

		double tax = 0;
		int rand = ThreadLocalRandom.current().nextInt(22,30);

		System.out.println("The Quantity is : "+rand);


		String ra = Integer.toString(rand);

		String ra1 = String.valueOf(ra.charAt(0));
//		System.out.println("The Quantity1 is : "+ra1);
		if(ra1.equals("2")){
			//Click the number from numpad
			getOrder_Screen_NumberPad_2().click();
		}else if(ra1.equals("3")) {
			//Click the number from numpad
			getOrder_Screen_NumberPad_3().click();
		}

		String ra2 = String.valueOf(ra.charAt(1));
//		System.out.println("The Quantity2 is : "+rand);
		if(ra2.equals("2")){
			//Click the number from numpad
			getOrder_Screen_NumberPad_2().click();
		}else if(ra2.equals("3")) {
			//Click the number from numpad
			getOrder_Screen_NumberPad_3().click();
		}else if(ra2.equals("4")) {
			//Click the number from numpad
			getOrder_Screen_NumberPad_4().click();
		}else if(ra2.equals("5")) {
			//Click the number from numpad
			getOrder_Screen_NumberPad_5().click();
		}else if(ra2.equals("6")) {
			//Click the number from numpad
			getOrder_Screen_NumberPad_6().click();
		}else if(ra2.equals("7")) {
			//Click the number from numpad
			getOrder_Screen_NumberPad_7().click();
		}else if(ra2.equals("8")) {
			//Click the number from numpad
			getOrder_Screen_NumberPad_8().click();
		}else if(ra2.equals("9")) {
			//Click the number from numpad
			getOrder_Screen_NumberPad_9().click();
		}else if(ra2.equals("0")) {
			//Click the number from numpad
			getOrder_Screen_NumberPad_0().click();
		}



			List<?> s = driver.findElements(By.xpath("(//*[@text='X'])"));

			int sa = s.size();

			int rs = 0;

			// for loop for clicking on every time in the list
			for (int i = 1; i <= sa; i++) {

				String qu = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[4]")).getText();
				int qa = Integer.parseInt(qu);
				rs = rs + qa;
			}
			rand = rs;

		if(rand == 22 || rand == 23 || rand == 24){
			tax = 5.55;
		} else if (rand == 25 || rand == 26 || rand == 27 || rand == 28 || rand == 29) {
			tax = 6.65;
		} else if (rand == 30 || rand > 30) {
			tax = 7.75;
		}


		cm = new Common_xpath();


		//Actual sub taotal value in order screen
		String actualText1 = getOrder_Screen_SubTotal_Value().getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
		System.out.println("Actual Subtotal Value : "+actualText1);
		test.log(LogStatus.INFO,"Actual Subtotal Value : "+actualText1);

		double sub = Double.parseDouble(actualText1);

		double Calculated_Tax_Value = (sub * tax)/100.00;

		Calculated_Tax_Value = (Math.round(Calculated_Tax_Value*100.00)/100.00);

		System.out.println("Total Calculated Tax Value : "+Calculated_Tax_Value);
		test.log(LogStatus.INFO,"Total Calculated Tax Value : "+Calculated_Tax_Value);

		String actualTextvalue = getOrder_Screen_Tax_Value().getText();
		String Report_Taxes = actualTextvalue.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
		//		System.out.println("Actual Total Tax Value :" + actual_Tax_Value);

		double actual_Tax = Float.parseFloat(Report_Taxes);

		actual_Tax = Math.round(actual_Tax*100.00)/100.00;

		System.out.println("Actual Total Tax Value : " + actual_Tax);
		test.log(LogStatus.INFO,"Actual Total Tax Value : "+actual_Tax);

		// Check weather the Calculated Total amount and Actual Total Tax amount is same or not
		if (Calculated_Tax_Value == actual_Tax) {
			test.log(LogStatus.PASS, "Actual and Expected Total Tax amount are same");

			// Print the actual value
			System.out.println("The Actual Total Tax Value is : " + actual_Tax);

			test.log(LogStatus.PASS, "The Actual Total Tax Value is : " + actual_Tax);
		}

		else if (actual_Tax == unknownValue) {
			test.log(LogStatus.PASS, "Here we don't have the exact expected value");

			System.out.println("The Actual Total Tax value is : " + actual_Tax);

			test.log(LogStatus.INFO, "The Actual Total Tax value is : " + actual_Tax);
		}

		else {
			test.log(LogStatus.FAIL, "Actual and Expected Total Tax values are different");

			// Get the different
			double different = Calculated_Tax_Value - actual_Tax;

			// Print the different value
			System.out.println("Total Tax Value different is : " + different);

			test.log(LogStatus.FAIL, "Total Tax Value different is : " + different);
		}

	}

	public void CB_Tax_Calculation() throws Throwable {

		//	double tax = 0;

		getOrder_Screen_NumberPad_3().click();
		getOrder_Screen_NumberPad_00().click();

		String ss = Utility.getProperty("CheckBased_Tax");

		double tax = Double.parseDouble(ss);

		cm = new Common_xpath();


		//Actual sub taotal value in order screen
		String actualText1 = getOrder_Screen_SubTotal_Value().getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
		System.out.println("Actual Subtotal Value : "+actualText1);
		test.log(LogStatus.INFO, "Actual Subtotal Value : " + actualText1);

		double sub = Double.parseDouble(actualText1);

		double Calculated_Tax_Value = (sub * tax)/100.00;

		Calculated_Tax_Value = (Math.round(Calculated_Tax_Value*100.00)/100.00);

		System.out.println("Total Calculated Tax Value : "+Calculated_Tax_Value);
		test.log(LogStatus.INFO, "Total Calculated Tax Value : " + Calculated_Tax_Value);

		String actualTextvalue = getOrder_Screen_Tax_Value().getText();
		String Report_Taxes = actualTextvalue.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
		//		System.out.println("Actual Total Tax Value :" + actual_Tax_Value);

		double actual_Tax = Float.parseFloat(Report_Taxes);

		actual_Tax = Math.round(actual_Tax*100.00)/100.00;

		System.out.println("Actual Total Tax Value : " + actual_Tax);
		test.log(LogStatus.INFO, "Actual Total Tax Value : " + actual_Tax);

		// Check weather the Calculated Total amount and Actual Total Tax amount is same or not
		if (Calculated_Tax_Value == actual_Tax) {
			test.log(LogStatus.PASS, "Actual and Expected Total Tax amount are same");

			// Print the actual value
			System.out.println("The Actual Total Tax Value is : " + actual_Tax);

			test.log(LogStatus.PASS, "The Actual Total Tax Value is : " + actual_Tax);
		}

		else if (actual_Tax == unknownValue) {
			test.log(LogStatus.PASS, "Here we don't have the exact expected value");

			System.out.println("The Actual Total Tax value is : " + actual_Tax);

			test.log(LogStatus.INFO, "The Actual Total Tax value is : " + actual_Tax);
		}

		else {
			test.log(LogStatus.FAIL, "Actual and Expected Total Tax values are different");

			// Get the different
			double different = Calculated_Tax_Value - actual_Tax;

			// Print the different value
			System.out.println("Total Tax Value different is : " + different);

			test.log(LogStatus.FAIL, "Total Tax Value different is : " + different);
		}

	}
	
	public WebElement getOrder_Screen_Serach_Box() {
		return Order_Screen_Serach_Box;
	}
	
	public WebElement getOrder_Screen_NumberPad_1() {
		return Order_Screen_NumberPad_1;
	}
	
	public WebElement getOrder_Screen_NumberPad_2() {
		return Order_Screen_NumberPad_2;
	}
	
	public WebElement getOrder_Screen_NumberPad_3() {
		return Order_Screen_NumberPad_3;
	}
	
	public WebElement getOrder_Screen_NumberPad_4() {
		return Order_Screen_NumberPad_4;
	}
	
	public WebElement getOrder_Screen_NumberPad_5() {
		return Order_Screen_NumberPad_5;
	}
	
	public WebElement getOrder_Screen_NumberPad_6() {
		return Order_Screen_NumberPad_6;
	}
	
	public WebElement getOrder_Screen_NumberPad_7() {
		return Order_Screen_NumberPad_7;
	}
	
	public WebElement getOrder_Screen_NumberPad_8() {
		return Order_Screen_NumberPad_8;
	}
	
	public WebElement getOrder_Screen_NumberPad_9() {
		return Order_Screen_NumberPad_9;
	}
	
	public WebElement getOrder_Screen_NumberPad_0() {
		return Order_Screen_NumberPad_0;
	}
	
	public WebElement getOrder_Screen_NumberPad_00() {
		return Order_Screen_NumberPad_00;
	}
	
	public WebElement getOrder_Screen_NumberPad_C() {
		return Order_Screen_NumberPad_Clear;
	}
	
	public WebElement getOrder_Screen_Category_Extent_Btn() {
		return Order_Screen_Category_Extent_Btn;
	}
	

	
	public WebElement getOrder_Screen_LogOffBtn() {
		return Order_Screen_LogOffBtn;
	}

	public void clickTheVoidBtn(){
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

			//click the void btn
			click_Ele(getOrder_Screen_VoidBtn());
	}
	
	public void Retail_OrderScreen_VoidBtn() throws Throwable {
		Thread.sleep(3000);
		text_Confirm_without_Screenshot(getOrder_Screen_VoidBtn(), Utility.getProperty("OrderScreen_Option_Void"));
	}

	public void Retail_OrderScreen_SaleHistoryBtn() throws Throwable {
		cm = new Common_xpath();
		text_Confirm_without_Screenshot(getOrder_Screen_Sale_HistoryBtn(), Utility.getProperty("OrderScreen_Option_SaleHistory"));
	}

	public void Retail_OrderScreen_ParkSaleBtn() throws Throwable {
		cm = new Common_xpath();
		text_Confirm_without_Screenshot(getOrder_Screen_Park_SaleBtn(), Utility.getProperty("OrderScreen_Option_ParkSale"));
	}

	public void Retail_OrderScreen_RetrieveSaleBtn() throws Throwable {
		cm = new Common_xpath();
		text_Confirm_without_Screenshot(getOrder_Screen_Retreive_SaleBtn(), Utility.getProperty("OrderScreen_Option_RetrieveSale"));
	}

	public void Retail_OrderScreen_OptionBtn() throws Throwable {
		cm = new Common_xpath();
		text_Confirm_without_Screenshot(getOrder_Screen_OptionBtn(), Utility.getProperty("OrderScreen_Option_Option"));
	}

	public void clickTheOption(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//click the option button
		click_Ele(getOrder_Screen_OptionBtn());
	}

	public void Retail_OrderScreen_PrintBtn() throws Throwable {
		cm = new Common_xpath();
		text_Confirm_without_Screenshot(getOrder_Screen_PrintBtn(), Utility.getProperty("OrderScreen_Option_Print"));
	}

	public void Retail_OrderScreen_LayawayBtn() throws Throwable {
		cm = new Common_xpath();
		text_Confirm_without_Screenshot(getOrder_Screen_layawayBtn(), Utility.getProperty("OrderScreen_Option_Layaway"));
	}

	public void Retail_OrderScreen_DiscountBtn() throws Throwable {
		cm = new Common_xpath();
		text_Confirm_without_Screenshot(getOrder_Screen_DiscountBtn(), Utility.getProperty("OrderScreen_Option_Discount"));
	}

	public void Retail_OrderScreen_CashBtn() throws Throwable {
		cm = new Common_xpath();
		text_Confirm_without_Screenshot(getOrder_Screen_CashBtn(), Utility.getProperty("OrderScreen_Option_Cash"));
	}

	public void Retail_OrderScreen_PaymentBtn() throws Throwable {
		cm = new Common_xpath();
		text_Confirm_without_Screenshot(getOrder_Screen_PaymentBtn(), Utility.getProperty("OrderScreen_Option_Payment"));
	}

	public void clickThePaymentBtn(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		click_Ele(getOrder_Screen_PaymentBtn());
	}

	public void Retail_OrderScreen_LogOffBtn() throws Throwable {
		cm = new Common_xpath();
		text_Confirm_without_Screenshot(getOrder_Screen_LogOffBtn(), Utility.getProperty("OrderScreen_Option_LogOff"));
	}

	public void Retail_OrderScreen_OperationBtn() throws Throwable {
		try {
			if(getOrder_Screen_OperationsBtn().isDisplayed()) {
				test.log(LogStatus.PASS, "Operation button is displayed in the Retail POS order screen");
			}

		}catch(Exception e) {
			test.log(LogStatus.FAIL, "Operation button is not displayed in the Retail POS order screen");
		}
	}

	public void clickTheOperationBtn(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//click the Operation button
		click_Ele(getOrder_Screen_OperationsBtn());
	}

	public void Retail_OrderScreen_CategoryExtensionBtn() throws Throwable {
		try {
			if(getOrder_Screen_Category_Extent_Btn().isDisplayed()) {
				test.log(LogStatus.PASS, "Category Extent button is displayed in the Retail POS order screen");
			}

		}catch(Exception e) {
			test.log(LogStatus.FAIL, "Category Extent is not displayed in the Retail POS order screen");
		}
	}

	public void Retail_OrderScreen_CheckNumber() throws Throwable {
		try {
			if(getOrder_Screen_Receipt_NoTxt().isDisplayed()) {
				test.log(LogStatus.PASS, "Receipt/Check No text is displayed in the Retail POS order screen");
			}

		}catch(Exception e) {
			test.log(LogStatus.FAIL, "Receipt/Check No text is not displayed in the Retail POS order screen");
		}
	}

	public void Retail_OrderScreen_SearchBtn() throws Throwable {
		try {
			if(getOrder_Screen_Serach_Box().isDisplayed()) {
				test.log(LogStatus.PASS, "Search box is displayed in the Retail POS order screen");
			}

		}catch(Exception e) {
			test.log(LogStatus.FAIL, "Search box is not displayed in the Retail POS order screen");
		}
	}

	public void Retail_OrderScreen_AddCustomer() throws Throwable {
		text_Confirm_without_Screenshot(getOrder_Screen_Add_CustomerBtn(), Utility.getProperty("OrderScreen_Value_AddCustomer"));
	}

	public void Retail_OrderScreen_SearchCustomer() throws Throwable {
		text_Confirm_without_Screenshot(getOrder_Screen_Search_CustomerBtn(), Utility.getProperty("OrderScreen_Value_SearchCustomer"));
	}

	public void Retail_OrderScreen_ValueField_Subtotal() throws Throwable {
		text_Confirm_without_Screenshot(getOrder_Screen_SubTotal(), Utility.getProperty("OrderScreen_Value_SubTotal"));
	}

	public void Retail_OrderScreen_ValueField_Tax() throws Throwable {
		text_Confirm_without_Screenshot(getOrder_Screen_Tax(), Utility.getProperty("OrderScreen_Value_Tax"));
	}

	public void Retail_OrderScreen_ValueField_Total() throws Throwable {
		text_Confirm_without_Screenshot(getOrder_Screen_Total(), Utility.getProperty("OrderScreen_Value_Total"));
	}

	public void Retail_OrderScreen_ValueField_PaidAmount() throws Throwable {
		text_Confirm_without_Screenshot(getOrder_Screen_Paid_Amount(), Utility.getProperty("OrderScreen_Value_PaidAmount"));
	}

	public void Retail_OrderScreen_ValueField_BalanceAmount() throws Throwable {
		text_Confirm_without_Screenshot(getOrder_Screen_Balance_Amount(), Utility.getProperty("OrderScreen_Value_BalanceAmount"));
	}

		public void Retail_OrderScreen_ValueField_Numpad() throws Throwable {

		try {
			if(getOrder_Screen_NumberPad_1().isDisplayed() && getOrder_Screen_NumberPad_2().isDisplayed() && getOrder_Screen_NumberPad_3().isDisplayed() && 
					getOrder_Screen_NumberPad_4().isDisplayed() && getOrder_Screen_NumberPad_5().isDisplayed() && getOrder_Screen_NumberPad_6().isDisplayed() && 
					getOrder_Screen_NumberPad_7().isDisplayed() && getOrder_Screen_NumberPad_8().isDisplayed() && getOrder_Screen_NumberPad_9().isDisplayed() && 
					getOrder_Screen_NumberPad_0().isDisplayed() && getOrder_Screen_NumberPad_00().isDisplayed() && getOrder_Screen_NumberPad_C().isDisplayed()) {
				test.log(LogStatus.PASS, "Numpad is displayed in the Retail POS order screen");
			}
			
		}catch(Exception e) {
			int i  = 1;
			test.log(LogStatus.FAIL, "Numpad is not displayed in the Retail POS order screen");
			//Assert.assertEquals(i,0);
			new SoftAssert().assertEquals(i,0);
		}
	}

	public void Select_Open_Item(String OpenItem,String price) throws Throwable {
		cm = new Common_xpath();

		click_Ele(Order_Screen_Category_OpenItem);

		Thread.sleep(2000);
		//click the child item
		click_Ele(driver.findElement(By.xpath("//*[contains(@text,'"+OpenItem+"')]")));
		Thread.sleep(2000);

		//Click the continue button
		click_Ele(cm.pin_popup_Continue_Btn);

		//click the cancel button
		click_Ele(Menu_Screen_Category_Cancel_Btn);
		Thread.sleep(1000);

		try {
			if(getFirstMenuItem_OrderScreen().getText().equals(OpenItem)) {
				test.log(LogStatus.PASS, "Open Item added successfully in Order Screen");
			}
		}catch(Exception c) {
			test.log(LogStatus.FAIL, "Open Item added fail in Order Screen");
		}

		try {
			if(getFirstMenuItemPrice_OrderScreen().getText().equals(price)) {
				test.log(LogStatus.PASS, "Open Item price displayed successfully in Order Screen");
			}
		}catch(Exception c) {
			test.log(LogStatus.FAIL, "Open Item price displayed wrongly in Order Screen");
		}

	}

	public void Select_Open_ItemWithPrice(String OpenItem,String price) throws Throwable {
		cm = new Common_xpath();

		click_Ele(Order_Screen_Category_OpenItem);

		Thread.sleep(2000);
		//click the child item
		click_Ele(driver.findElement(By.xpath("//*[contains(@text,'"+OpenItem+"')]")));
		Thread.sleep(2000);

		//click the number 8
		click_Ele(cm.pin_popup_NO_Eight);

		//click the number 0
		click_Ele(cm.pin_popup_NO_Zero);

		//click the number 0
		click_Ele(cm.pin_popup_NO_Zero);

		//Click the continue button
		click_Ele(cm.pin_popup_Continue_Btn);

		//click the cancel button
		click_Ele(Menu_Screen_Category_Cancel_Btn);
		Thread.sleep(1000);

		try {
			if(getFirstMenuItem_OrderScreen().getText().equals(OpenItem)) {
				test.log(LogStatus.PASS, "Open Item added successfully in Order Screen");
			}
		}catch(Exception c) {
			test.log(LogStatus.FAIL, "Open Item added fail in Order Screen");
		}

		try {
			if(getFirstMenuItemPrice_OrderScreen().getText().equals(price)) {
				test.log(LogStatus.PASS, "Open Item price displyed successfully in Order Screen");
			}
		}catch(Exception c) {
			test.log(LogStatus.FAIL, "Open Item price displayed wrongly in Order Screen");
		}

	}

	public void Check_Quantity_Validations() throws Throwable {
		cm = new Common_xpath();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Click the number from numpad
		getOrder_Screen_NumberPad_2().click();

		String upmenu1 = "2";

		String menu1 = FirstMenuItemQuantity_OrderScreen.getText();

		if(menu1.equals(upmenu1)) {
			test.log(LogStatus.PASS, "Standard menu item Quantity got updated, after user order the item when user update it from the order screen");
		}else
		{
			test.log(LogStatus.FAIL, "Standard menu item Quantity not updated, after user order the item when user update it from the order screen");
		}

		//Click the number from numpad
		getOrder_Screen_NumberPad_1().click();

		String upmenu2 = "21";

		String menu2 = FirstMenuItemQuantity_OrderScreen.getText();

		if(menu2.equals(upmenu2)) {
			test.log(LogStatus.PASS, "Standard menu item Quantity got updated, after user order the item when user update second time it from the order screen");
		}else
		{
			test.log(LogStatus.FAIL, "Standard menu item Quantity not updated, after user order the item when user update second time it from the order screen");
		}
	}

}
