package pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Park_Sale_And_Retrieve_Sale_Page extends Appium_Base_Class {
	
//	public AppiumDriver driver;
//	public ExtentTest test;
	Appium_Base_Class base;
	RetailPOS_Order_Page rop;
	Login_Page lp;
	
    Common_xpath cm;
    public Pin_Screen_Page psp;

	Item_Selection_Page isp;
    
	
//	public Park_Sale_Page(AppiumDriver driver,ExtentTest test)
//	{
//		this.driver= driver;
//		this.test= test;
//
//		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(30)), this);
//	}
	
	
	@AndroidFindBy(xpath = "//*[@class='android.app.Dialog']/android.view.View/android.widget.TextView")
	WebElement park_Sale_no_Menuitem_pop_up_msg;

	@AndroidFindBy(xpath = "//android.app.Dialog/android.view.View[2]/android.view.View/android.widget.TextView")
	WebElement ParkedChecksInParkedSalesPopup;

	@AndroidFindBy(xpath = "(//android.view.View/android.view.View[7]/android.widget.Button/../..)[1]")
	WebElement FirstCheck_InTheClosedTab;
	
	@AndroidFindBy(xpath = "//*[@text='Park Sale']")
	WebElement park_Sale_pop_up_headerName;

	@AndroidFindBy(xpath = "//*[@text='Sale is parked']")
	WebElement SaleIsParked_Message;

	@AndroidFindBy(xpath = "//*[@resource-id='alert-done-popup']/android.widget.TextView")
	WebElement Order_Screen_POP_up_Text;

	@AndroidFindBy(xpath = "//*[@text='Park Sale']/../../android.view.View/android.view.View/android.widget.TextView")
	WebElement park_Sale_pop_up_reason_Specify_text;
	
	@AndroidFindBy(xpath = "//*[@text='Park']")
	WebElement park_Sale_pop_up_Park_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='Park Sale']/../../android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
	WebElement park_Sale_pop_up_reason_inputBOX;
	
	@AndroidFindBy(xpath = "//*[@text='Reason']")
	WebElement park_Sale_pop_up_reason_text;

	@AndroidFindBy(xpath = "//*[@resource-id='alert-content']/android.view.View/android.widget.TextView")
	WebElement park_Sale_pop_up_Please_EnterReason_PopUP_Text;
	
	@AndroidFindBy(xpath = "//*[@resource-id='alert-content']")
	WebElement park_Sale_pop_up_Alert;

	@AndroidFindBy(xpath = "//*[@text='You can not enter more than 50 characters']")
	WebElement You_Cannot_Enter_More_Than_50_Char_text;


	@AndroidFindBy(xpath = "//*[contains(@text,'Reason')]")
	WebElement ReasonWaterMark;

	
	@AndroidFindBy(xpath = "//*[@resource-id='retrieve-sale']/android.view.View[1]/android.view.View[2]/android.widget.TextView")
	WebElement park_Sale_Retrieve_Sale_header_text;

	@AndroidFindBy(xpath = "//*[@resource-id='retrieve-sale']/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.widget.EditText")
	WebElement park_Sale_Retrieve_Sale_PopUp_Search_field;
	
	@AndroidFindBy(xpath = "//*[@text='Cancel']")
	WebElement park_Sale_Retrieve_Sale_PopUp_Cancel_Btn;

	@AndroidFindBy(xpath = "//*[contains(@text,'No Parked Receipts Found')]")
	WebElement NoParkedReceiptsFoundText;


	
//	@AndroidFindBy(xpath = "(//*[@text='X'])[2]")
//	WebElement Order_Screen_Menu_Cancel_Btn;

//	@AndroidFindBy(xpath = "(//*[@text='X'])[2]")
//	WebElement Order_Screen_Menu_Cancel_Btn;
	
//	@AndroidFindBy(xpath = "(//*[@text='X'])[2]")
//	WebElement Order_Screen_Menu_Cancel_Btn;
	
//	@AndroidFindBy(xpath = "(//*[@text='X'])[2]")
//	WebElement Order_Screen_Menu_Cancel_Btn;

//	@AndroidFindBy(xpath = "(//*[@text='X'])[2]")
//	WebElement Order_Screen_Menu_Cancel_Btn;
	
	
	public void No_Menu_Park_Sale_validation() {
		cm = new Common_xpath();
		base = new Appium_Base_Class();
		rop = new RetailPOS_Order_Page();
		lp = new Login_Page();
		
		base.click_Ele(rop.getOrder_Screen_Park_SaleBtn());
		base.text_Confirm(park_Sale_no_Menuitem_pop_up_msg, "You have to order before parking sale");
		base.click_Ele(rop.Order_Screen_Void_pop_up_Done_Btn);
		
	}
	
	public void ParkSale_screen_Validation() throws Throwable {
		cm = new Common_xpath();
		base = new Appium_Base_Class();
		rop = new RetailPOS_Order_Page();
		lp = new Login_Page();
		isp = new Item_Selection_Page();

		isp.multipleMenu_Selection_Random();
		base.click_Ele(rop.getOrder_Screen_Park_SaleBtn());
		base.text_Confirm(park_Sale_pop_up_headerName, "Park Sale");
		base.text_Confirm_without_Screenshot(park_Sale_pop_up_reason_Specify_text, "Please specify the reason to park sale");
		base.text_Confirm_without_Screenshot(park_Sale_pop_up_reason_text, "Reason");
		base.text_Confirm_without_Screenshot(cm.Select_Role_popup_Cancel_Btn, "Cancel");
		base.text_Confirm_without_Screenshot(park_Sale_pop_up_Park_Btn, "Park");
		base.click_Ele(cm.Select_Role_popup_Cancel_Btn);
		
	}
	
	public void ParkSale_Pop_up_No_reason() throws Throwable {
		cm = new Common_xpath();
		base = new Appium_Base_Class();
		rop = new RetailPOS_Order_Page();
		lp = new Login_Page();
		isp = new Item_Selection_Page();

		isp.multipleMenu_Selection_Random();
		base.click_Ele(rop.getOrder_Screen_Park_SaleBtn());
		base.click_Ele(park_Sale_pop_up_Park_Btn);
		base.text_Confirm(park_Sale_pop_up_Please_EnterReason_PopUP_Text, "Please enter reasons to proceed");
		base.click_Ele(rop.Order_Screen_Void_pop_up_Done_Btn);
		base.click_Ele(cm.Select_Role_popup_Cancel_Btn);
		
	}
	
	public void RetailPOS_ParkSale_Reason_Entering_Restriction() throws Throwable {
		cm = new Common_xpath();
		base = new Appium_Base_Class();
		rop = new RetailPOS_Order_Page();
		lp = new Login_Page();
		String Check_NO1;
		isp = new Item_Selection_Page();

		isp.multipleMenu_Selection_Random();
		Check_NO1 = rop.get_Check_NO();
		base.click_Ele(rop.getOrder_Screen_Park_SaleBtn());
//		driver.hideKeyboard();
		base.send_data(park_Sale_pop_up_reason_inputBOX, RandomStringUtils.randomAlphabetic(60));
		base.click_Ele(park_Sale_pop_up_Park_Btn);
		try {
			if (park_Sale_pop_up_Alert.isDisplayed()) {
				
				base.click_Ele(rop.Order_Screen_Void_pop_up_Done_Btn);
				test.log(LogStatus.PASS, "Park Reason Field restriction - Upto 50 character can be entered");
				base.click_Ele(cm.Select_Role_popup_Cancel_Btn);
				rop.Void_MenuItems();
			}
			
		}catch (Exception e) {
			test.log(LogStatus.FAIL, "Park Reason Field restriction - User can be enter above 50 characters in the Reason field");
		}
		
		isp.multipleMenu_Selection_Random();
		base.click_Ele(rop.getOrder_Screen_Park_SaleBtn());
//		driver.hideKeyboard();
		base.send_data(park_Sale_pop_up_reason_inputBOX, RandomStringUtils.randomAlphanumeric(15));
		base.click_Ele(park_Sale_pop_up_Park_Btn);
		
		isp.multipleMenu_Selection_Random();
		base.click_Ele(rop.getOrder_Screen_Park_SaleBtn());
//		driver.hideKeyboard();
		base.send_data(park_Sale_pop_up_reason_inputBOX, "  ");
		base.click_Ele(park_Sale_pop_up_Park_Btn);
		try {
			if (park_Sale_pop_up_Alert.isDisplayed()) {
				
				base.click_Ele(rop.Order_Screen_Void_pop_up_Done_Btn);
				test.log(LogStatus.PASS, "Entering Space in the reason input box, the application don't allow to park sale");
				base.click_Ele(cm.Select_Role_popup_Cancel_Btn);
				rop.Void_MenuItems();
				
			}
		}catch (Exception e) {
			test.log(LogStatus.FAIL, "Entering Space in the reason input box, the application do allow to park sale");
		}
		
	}
	
	public void RetailPOS_ParkSale_Retrive_Sale() throws Throwable {
		cm = new Common_xpath();
		base = new Appium_Base_Class();
		rop = new RetailPOS_Order_Page();
		lp = new Login_Page();
		String Check_NO1;
		
		Check_NO1 = rop.get_Check_NO();
		base.click_Ele(rop.Order_Screen_Retreive_SaleBtn);
		base.text_Confirm(park_Sale_Retrieve_Sale_header_text, "Parked Sales");
		base.isEleDisplayed(park_Sale_Retrieve_Sale_PopUp_Search_field, "Retrieve Sale Serach field");
		base.isEleDisplayed(park_Sale_Retrieve_Sale_PopUp_Cancel_Btn, "Retrieve Sale Cancel field");
		base.click_Ele(park_Sale_Retrieve_Sale_PopUp_Cancel_Btn);
		base.click_Ele(rop.Order_Screen_Retreive_SaleBtn);
		base.Click_and_close_ParkedSales(driver, "//*[@resource-id='retrieve-sale']/android.view.View[2]/android.view.View/android.widget.TextView");
		
		
	}

	public void clickTheParkSaleBtn(){
		rop = new RetailPOS_Order_Page();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//click the park sale button
		click_Ele(rop.getOrder_Screen_Park_SaleBtn());
	}

	public void verifyTheParkSalePopupHeading() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try{
			//verify the park sales popup heading
			text_Confirm(park_Sale_pop_up_headerName, "Park Sale");
		}
		catch (Exception e){
			test.log(LogStatus.FAIL,"Park Sale heading is not available in the Park Sale popup");
		}
	}

	public void verifyTheParkSalePopupContent(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		try{
			//verify the text
			text_Confirm_without_Screenshot(park_Sale_pop_up_reason_Specify_text, "Please specify the reason to park sale");

		}catch (Exception e){
		test.log(LogStatus.FAIL,"Please specify the reason to park sale text is not available in the Park Sale popup");
	}
	}

	public void verifyNoParkedReceiptsFoundText(String msg){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		try{
			//verify the text
			text_Confirm_without_Screenshot(NoParkedReceiptsFoundText, msg);
			test.log(LogStatus.PASS,"No Parked Receipts Found text found in the parked sales popup");
		}catch (Exception e){
			test.log(LogStatus.FAIL,"No Parked Receipts Found text not found in the parked sales popup");
		}
	}

	public void verifyPark_Sale_Retrieve_Sale_header_text(String msg){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		try{
			//verify the text
			text_Confirm(park_Sale_Retrieve_Sale_header_text, msg);
			test.log(LogStatus.PASS,"Parked Sales text found in the parked sales popup");
		}catch (Exception e){
			test.log(LogStatus.FAIL,"Parked Sales text not found in the parked sales popup");
		}
	}

	public void verifySearchFiledInSearchField(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		try{
			//verify the text
			isEleDisplayed(park_Sale_Retrieve_Sale_PopUp_Search_field, "Retrieve Sale Search field");
			test.log(LogStatus.PASS,"Retrieve Sale Search field found in the parked sales popup");
		}catch (Exception e){
			test.log(LogStatus.FAIL,"Retrieve Sale Search field not found in the parked sales popup");
		}
	}

	public void verifyRetrieveSaleCancelBtn(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		try{
			//verify the text
			isEleDisplayed(park_Sale_Retrieve_Sale_PopUp_Cancel_Btn, "Retrieve Sale Cancel field");
			test.log(LogStatus.PASS,"Retrieve Sale Cancel field found in the parked sales popup");
		}catch (Exception e){
			test.log(LogStatus.FAIL,"Retrieve Sale Cancel field not found in the parked sales popup");
		}
	}

	public void verifyCancelBtn(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		try{
			//verify the text
			isEleDisplayed(park_Sale_Retrieve_Sale_PopUp_Cancel_Btn, "Cancel field");
			test.log(LogStatus.PASS,"Cancel field found in the return screen");
		}catch (Exception e){
			test.log(LogStatus.FAIL,"Cancel field not found in the return screen");
		}
	}

	public void verifyTheCancelBtnInParkSalePopup(){
		cm = new Common_xpath();

		try{
			//verify the availability
			text_Confirm_without_Screenshot(cm.Select_Role_popup_Cancel_Btn, "Cancel");
		}catch (Exception e){
			test.log(LogStatus.FAIL,"Cancel button is not available in the Park Sale popup");
		}
	}

	public void verifyTheParkBtnInParkSalePopup(){
		try{
			//verify the availability
			text_Confirm_without_Screenshot(park_Sale_pop_up_Park_Btn, "Park");
		}catch (Exception e){
			test.log(LogStatus.FAIL,"Park button is not available in the Park Sale popup");
		}
	}

	public void enterTheParkSaleReasonAndClickTheParkButton() throws InterruptedException {
		//enter the text
		send_data(park_Sale_pop_up_reason_inputBOX, RandomStringUtils.randomAlphabetic(30));

		Thread.sleep(500);

		//click the park button
		click_Ele(park_Sale_pop_up_Park_Btn);
	}

	public void ClickTheParkButton() throws InterruptedException {
		Thread.sleep(500);

		//click the park button
		click_Ele(park_Sale_pop_up_Park_Btn);
	}

	public void enterTheParkSaleReasonMoreThanFiftyCharsAndClickTheParkButton() throws InterruptedException {
		//enter the text
		send_data(park_Sale_pop_up_reason_inputBOX, RandomStringUtils.randomAlphabetic(60));

		Thread.sleep(500);

		String s = park_Sale_pop_up_reason_inputBOX.getText();

		if(s.length() == 60){
			test.log(LogStatus.FAIL,"Park Sale reason text box accept more than 50 characters");
		}else if(s.length() == 50){
			test.log(LogStatus.PASS,"Park Sale reason text box accept only 50 characters");
		}

		//click the park button
		click_Ele(park_Sale_pop_up_Park_Btn);
	}

	public void verifyTheSaleIsParkedMessage(String msg) throws InterruptedException {
		try{
			Thread.sleep(500);
			text_Confirm_without_Screenshot(SaleIsParked_Message, msg);
			test.log(LogStatus.PASS,"Sale is Parked message is displayed after click the Park button");
		}catch (Exception e){
			test.log(LogStatus.FAIL,"Sale is Parked message is not displayed after click the Park button");
		}
	}

	public void verifyTheParkedSaleIsRetrievedMessage(String msg) throws InterruptedException {
		try{
			Thread.sleep(500);
			text_Confirm_without_Screenshot(SaleIsParked_Message, msg);
			test.log(LogStatus.PASS,"Parked sale is retrieved message is displayed when user select the check from the Parked Sales Popup");
		}catch (Exception e){
			test.log(LogStatus.FAIL,"Parked sale is retrieved message is not displayed when user select the check from the Parked Sales Popup");
		}
	}

	public void verifyTheReasonTextParkSalePopup(){
		try{
			//verify the availability
			text_Confirm_without_Screenshot(ReasonWaterMark, "Reason");
		}catch (Exception e){
			test.log(LogStatus.FAIL,"Reason text is not available in the Park Sale popup");
		}
	}

	public void verifyTheErrorMessageMoreThanFiftyChars(String msg){
		try {
			if (park_Sale_pop_up_Alert.isDisplayed()) {
					if(You_Cannot_Enter_More_Than_50_Char_text.getText().equals(msg)){
						base.click_Ele(rop.Order_Screen_Void_pop_up_Done_Btn);
						test.log(LogStatus.PASS, "Park Reason Field restriction - Upto 50 character can be entered");
					}

				rop.Void_MenuItems();
			}

		}catch (Exception e) {
			test.log(LogStatus.FAIL, "Park Reason Field restriction - User can be enter above 50 characters in the Reason field");
		}
	}

	public void clickTheCancelBtn(){
		cm = new Common_xpath();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//click the Cancel button
		click_Ele(cm.Select_Role_popup_Cancel_Btn);
	}

	public void clickTheRetrieveSaleButton() throws InterruptedException {
		rop = new RetailPOS_Order_Page();

		Thread.sleep(1000);
		click_Ele(rop.Order_Screen_Retreive_SaleBtn);

	}

	public void verifyTheParkedSalePopupAvailability(){
		try{
			text_Confirm(park_Sale_Retrieve_Sale_header_text, "Parked Sales");
		}catch (Exception e){
			test.log(LogStatus.FAIL,"Parked Sales popup is not displayed when user click the Retrieve Sale button from the Retail Screen");
		}
	}

	public void selectTheParkedSale(String checkNumber) throws InterruptedException {
		isEleDisplayed(park_Sale_Retrieve_Sale_PopUp_Search_field, "Retrieve Sale Search field");
		isEleDisplayed(park_Sale_Retrieve_Sale_PopUp_Cancel_Btn, "Retrieve Sale Cancel field");

		park_Sale_Retrieve_Sale_PopUp_Search_field.sendKeys(checkNumber);

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[contains(@text,'"+checkNumber+" -')]")).click();
	}

	public void retrieveSale_Popup(String msg) {
		rop = new RetailPOS_Order_Page();

		text_Confirm(Order_Screen_POP_up_Text, msg);
		click_Ele(rop.Order_Screen_Void_pop_up_Done_Btn);
	}

	public void closeAllTheParkedSaleUsingFastCash() throws Throwable {
		try{
			//Click the Retrieve Sale button
			clickTheRetrieveSaleButton();

			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

			Click_and_close_ParkedSales(driver, "//*[@resource-id='retrieve-sale']/android.view.View[2]/android.view.View/android.widget.TextView");
		}catch (Exception ignored){}

	}

	public void clearAllTheParkedSalesFromTheParkedTab(){
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

				new Sale_History_Page().clickTheParkedTab();
				new Sale_History_Page().verifyAll_Orders_Parked_Tab_Active();
			}
		}catch (Throwable ignored) {}
	}
}
