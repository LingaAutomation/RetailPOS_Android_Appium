package pages;

import lombok.ToString;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utility.Utility;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Standard_Item_POS_Page extends Appium_Base_Class{
	
	
//	public AppiumDriver driver;
//	public ExtentTest test;
//	Appium_Base_Class base;
	RetailPOS_Order_Page rop;
	Login_Page lp;
	Appium_Base_Class base;
	
    Common_xpath cm;
    public Standard_Item_POS_Page sip;
    RetailPOS_Order_Page ro;
    
//	public Standard_Item_POS_Page(AppiumDriver driver,ExtentTest test)
//	{
//		this.driver= driver;
//		this.test= test;
//
//		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(30)), this);
//	}
    
	@AndroidFindBy(xpath = "//*[@text='Cash']")
	WebElement Order_Screen_CashBtn;

	@AndroidFindBy(xpath = "//*[@text='Exact']")
	WebElement Cash_Screen_ExactBtn;

	@AndroidFindBy(xpath = "//*[@text='Enter']")
	WebElement Cash_Screen_EnterBtn;

	@AndroidFindBy(xpath = "//*[contains(@text,'Cash')]")
	WebElement Payment_Screen_Cash_Btn;

	@AndroidFindBy(xpath = "//*[contains(@text,'Submit')]")
	WebElement Payment_Screen_Submit_Btn;

	@AndroidFindBy(xpath = "//*[@text='Check got closed successfully']")
	WebElement SaleIsCompleted_Message;

	@AndroidFindBy(xpath = "//android.app.Dialog/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.Button")
	WebElement Digital_Receipt_Back_Btn;

	@AndroidFindBy(xpath = "//*[contains(@text,'Back')]")
	WebElement Payment_Screen_Back_Btn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Refund']")
	WebElement Refund_Refund_Head;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Refund Reasons']")
	WebElement Refund_Refund_Reasons;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Refund Amount']")
	WebElement Refund_Refund_Amount;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Customer']")
	WebElement Refund_Refund_Customer;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Return By']")
	WebElement Refund_Refund_ReturnBy;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Free text']")
	WebElement Refund_Refund_FreeText;

	@AndroidFindBy(xpath = "//android.app.Dialog[@resource-id='refund-retail']/android.view.View[2]/android.view.View[12]/android.view.View[2]/android.widget.EditText[@text]")
	WebElement Refund_Refund_Amount1;

	@AndroidFindBy(xpath = "//*[contains(@text,'Remove')]")
	WebElement Refund_Refund_Remove;

	@AndroidFindBy(xpath = "//*[contains(@text,'REFUND COMPLETED FOR:')]")
	WebElement Refund_Refund_Completed_For;

	@AndroidFindBy(xpath = "//*[contains(@text,'REFUNDED')]")
	WebElement Refund_Refunded;

	@AndroidFindBy(xpath = "//*[contains(@text,'Subtotal')]")
	WebElement Refund_Subtotal;

	@AndroidFindBy(xpath = "//*[contains(@text,'Tax')]")
	WebElement Refund_Tax;

	@AndroidFindBy(xpath = "//*[contains(@text,'Total')]")
	WebElement Refund_Total;

	@AndroidFindBy(xpath = "//*[contains(@text,'Print Receipt')]")
	WebElement Refund_Print_Receipt;

	public WebElement getRefund_Refund_Remove(){
		return Refund_Refund_Remove;
	}

	public WebElement getPayment_Screen_CashBtn() {
		return Payment_Screen_Cash_Btn;
	}

	public WebElement getPayment_Screen_SubmitBtn() {
		return Payment_Screen_Submit_Btn;
	}
	public WebElement getPayment_Screen_Back_Btn() {
		return Payment_Screen_Back_Btn;
	}

	public WebElement getOrder_Screen_CashBtn() {return Order_Screen_CashBtn;}

	public WebElement getCash_Screen_ExactBtn() {
		return Cash_Screen_ExactBtn;
	}

	public WebElement getCash_Screen_EnterBtn() {
		return Cash_Screen_EnterBtn;
	}


	public void Cash_Payment_Selection_And_Completed() throws Throwable {
		cm = new Common_xpath();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//Click the cash option from the order screen
		click_Ele(getOrder_Screen_CashBtn());

		Thread.sleep(1000);
		//click the exact button from the cash payment screen
		click_Ele(getCash_Screen_ExactBtn());

		Thread.sleep(1000);
		//Click the enter button from the cash payment screen
		click_Ele(Cash_Screen_EnterBtn);


		Thread.sleep(1000);
	}

	public void Cash_Payment_Selection_And_Completed_ViaPaymentScreens() throws Throwable {
		cm = new Common_xpath();

		ro = new RetailPOS_Order_Page();

		//Click the cash option from the order screen
		click_Ele(ro.getOrder_Screen_PaymentBtn());

		Thread.sleep(1000);
		//click the cash button from the payment screen
		click_Ele(getPayment_Screen_CashBtn());

		Thread.sleep(1000);
		//Click the Submit button from the payment screen
		click_Ele(getPayment_Screen_SubmitBtn());

		test.log(LogStatus.PASS, "Payment Completed using the Cash Payment Option");

		Thread.sleep(1000);
	}

	@AndroidFindBy(xpath = "//*[@text='Sale History']")
	WebElement Order_Screen_Sale_HistoryBtn;

	@AndroidFindBy(xpath = "//*[@text='Exchanged']")
	WebElement Order_Screen_Exchanged_tab;

	public WebElement getOrder_Screen_Sale_HistoryBtn() {
		return Order_Screen_Sale_HistoryBtn;
	}

	public WebElement getOrder_Screen_Exchanged_tab() {
		return Order_Screen_Exchanged_tab;
	}



	@AndroidFindBy(xpath = "//*[@text='Check No']/../android.widget.EditText")
	WebElement AllOrders_Search_Fld;

	public WebElement getAllOrders_Search_Fld() {
		return AllOrders_Search_Fld;
	}

	@AndroidFindBy(xpath = "//*[@text='Retail']")
	WebElement AllOrders_Retail_Btn;

	@AndroidFindBy(xpath = "//*[@text='Return']")
	WebElement AllOrders_Return_Btn;

	@AndroidFindBy(xpath = "//*[@text='Pay Check']")
	WebElement AllOrders_PayCheck_Btn;

	@AndroidFindBy(xpath = "//*[@text='Open Check']")
	WebElement AllOrders_OpenCheck_Btn;

	@AndroidFindBy(xpath = "//*[@text='Refund All']")
	WebElement AllOrders_Refund_All_Btn;

	@AndroidFindBy(xpath = "//*[contains(@text,'Refund Items') and @enabled='true']")
	WebElement AllOrders_Refund_Items_Btn;

	@AndroidFindBy(xpath = "//*[contains(@text,'Refund Items') and @enabled='false']")
	WebElement AllOrders_Refund_Items_Btn_Disabled;

	public void verifyTheRetailItemDisabled(){
		if(AllOrders_Refund_Items_Btn_Disabled.isDisplayed()){
			test.log(LogStatus.PASS,"Refund Items displayed and it is disabled");
		}else{
			test.log(LogStatus.FAIL,"Refund Items displayed and it is enabled");
			ut.FailedCaptureScreenshotAsBASE64(driver,test);
		}
	}

	public void verifyTheRetailItemEnabled(){
		if(AllOrders_Refund_Items_Btn.isDisplayed()){
			test.log(LogStatus.PASS,"Refund Items displayed and it is enabled after the retail item selected");
		}else{
			test.log(LogStatus.FAIL,"Refund Items displayed and it is disabled after the retail item selected");
			ut.FailedCaptureScreenshotAsBASE64(driver,test);
		}
	}

	@AndroidFindBy(xpath = "//*[@text='Exchange']")
	WebElement AllOrders_Exchange_Btn;

	@AndroidFindBy(xpath = "//*[contains(@text,'Customer')]/../android.widget.Button")
	WebElement AllOrders_CustomerName_InExchange_Refund_Popup;



	@AndroidFindBy(xpath = "//android.widget.GridView[@resource-id='checkTables']/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]")
	WebElement FirstCheck_InTheClosedTab;

	@AndroidFindBy(xpath = "(//android.widget.GridView/android.view.View[2]//android.view.View[6]/..)[1]")
	WebElement FirstCheck_InTheParkedTab;

	@AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
	WebElement ReasonTextBox;

	@AndroidFindBy(xpath = "//*[contains(@text,'Walkin')]")
	WebElement Walkin;

	public void typeTheReasonTextBox(){
		ReasonTextBox.sendKeys("Refund reason : automation testing");
	}

	public void enterTheRefundReasonTextBox_withAlphabetic() throws InterruptedException {
		//enter the text
		ReasonTextBox.clear();
		send_data(ReasonTextBox, RandomStringUtils.randomAlphabetic(60));

		Thread.sleep(500);
		Refund_Refund_Reasons.click();
		Thread.sleep(500);

		String s = ReasonTextBox.getText();

		if(s.length() == 60){
			test.log(LogStatus.FAIL,"Refund reason text box accept more than 50 characters");
			ut.FailedCaptureScreenshotAsBASE64(driver,test);
		}else if(s.length() == 50){
			test.log(LogStatus.PASS,"Refund reason text box accept only 50 characters");
		}
	}

	public void enterTheRefundReasonTextBox_withAlphaNumeric() throws InterruptedException {
		//enter the text
		ReasonTextBox.clear();
		send_data(ReasonTextBox, RandomStringUtils.randomAlphanumeric(60));

		Thread.sleep(500);
		Refund_Refund_Reasons.click();
		Thread.sleep(500);

		String s = ReasonTextBox.getText();

		if(s.length() == 60){
			test.log(LogStatus.FAIL,"Refund reason text box accept more than 50 characters");
			ut.FailedCaptureScreenshotAsBASE64(driver,test);
		}else if(s.length() == 50){
			test.log(LogStatus.PASS,"Refund reason text box accept only 50 characters");
		}
	}

	public void enterTheRefundReasonTextBox_withNumeric() throws InterruptedException {
		//enter the text
		ReasonTextBox.clear();
		send_data(ReasonTextBox, RandomStringUtils.randomNumeric(60));

		Thread.sleep(500);
		Refund_Refund_Reasons.click();
		Thread.sleep(500);

		String s = ReasonTextBox.getText();

		if(s.length() == 60){
			test.log(LogStatus.FAIL,"Refund reason text box accept more than 50 characters");
			ut.FailedCaptureScreenshotAsBASE64(driver,test);
		}else if(s.length() == 50){
			test.log(LogStatus.PASS,"Refund reason text box accept only 50 characters");
		}
	}

	public void enterTheVoidReasonTextBox() throws InterruptedException {
		//enter the text
		send_data(ReasonTextBox, RandomStringUtils.randomAlphabetic(60));

		String s = ReasonTextBox.getText();

		if(s.length() == 60){
			test.log(LogStatus.FAIL,"Reason text box accept more than 50 characters");
			ut.FailedCaptureScreenshotAsBASE64(driver,test);
		}else if(s.length() == 50){
			test.log(LogStatus.PASS,"Reason text box accept only 50 characters");
			ut.PassedCaptureScreenshotAsBASE64(driver,test);
		}

		Thread.sleep(500);
	}

	@AndroidFindBy(xpath = "//*[@text='Cancel']")
	WebElement CancelBtn;

	@AndroidFindBy(xpath = "//*[@text='Void']")
	WebElement VoidBtn;

	@AndroidFindBy(xpath = "//*[@text='X']")
	WebElement CloseBtn;

	public WebElement getCancelBtn(){return CancelBtn;}

	public WebElement getVoidBtn(){return VoidBtn;}

	public WebElement getCloseBtn(){return CloseBtn;}

	public void ClickTheVoidButtonWithTextConfirmation(String msg){
		//click the void button
		getVoidBtn().click();

		text_Confirm_without_Screenshot(driver.findElement(By.xpath("//*[contains(@text,'Sale is voided')]")),msg);
	}

	public void clickAllTheMenuItem(){
		try{
			for(int i = 1; i <= 1000; i++){

				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

				click_Ele(getCloseBtn());
			}
		}catch (Throwable ignored) {}
	}

	public void getTheEmptyVoidTab(String msg){
		try{
		 	text_Confirm(driver.findElement(By.xpath("//*[contains(@text,'No Void Receipts')]")),msg);
		}catch (Exception d){
			test.log(LogStatus.INFO,"No Void Receipts text is not found");
		}
	}

	public void getTheEmptyClosedTab(String msg){
		try{
			text_Confirm(driver.findElement(By.xpath("//*[contains(@text,'No Closed Receipts')]")),msg);
		}catch (Exception d){
			test.log(LogStatus.INFO,"No Closed Receipts text is not found");
		}
	}

	public void getTheEmptyParkedTab(String msg){
		try{
			text_Confirm(driver.findElement(By.xpath("//*[contains(@text,'No Parked Receipts')]")),msg);
		}catch (Exception d){
			test.log(LogStatus.INFO,"No Parked Receipts text is not found");
		}
	}

	public void getTheEmptyRefundedTab(String msg){
		try{
		 	text_Confirm(driver.findElement(By.xpath("//*[contains(@text,'No Refunded Receipts')]")),msg);
		}catch (Exception d){
			test.log(LogStatus.INFO,"No Refunded Receipts text is not found");
		}
	}

	public void getTheEmptyExchangedTab(String msg){
		try{
			text_Confirm(driver.findElement(By.xpath("//*[contains(@text,'No Exchanged Receipts')]")),msg);
		}catch (Exception d){
			test.log(LogStatus.INFO,"No Exchanged Receipts text is not found");
		}
	}

	public void getTheEmptyLayawaysTab(String msg){
		try{
			text_Confirm(driver.findElement(By.xpath("//*[contains(@text,'No Layaways Receipts')]")),msg);
		}catch (Exception d){
			test.log(LogStatus.INFO,"No Layaways Receipts text is not found");
		}
	}

	public WebElement getAllOrders_Retail_Btn() {
		return AllOrders_Retail_Btn;
	}

	public WebElement getAllOrders_Return_Btn() {
		return AllOrders_Return_Btn;
	}

	public WebElement getAllOrders_PayCheck_Btn() {
		return AllOrders_PayCheck_Btn;
	}

	public WebElement getAllOrders_OpenCheck_Btn() {
		return AllOrders_OpenCheck_Btn;
	}

	public void clickTheOpenCheckButton(){
		//click the open check button
		click_Ele(getAllOrders_OpenCheck_Btn());
	}

	public WebElement getAllOrders_Refund_All_Btn() {
		return AllOrders_Refund_All_Btn;
	}

	public WebElement getAllOrders_Refund_Items_Btn() {
		return AllOrders_Refund_Items_Btn;
	}

	public WebElement getAllOrders_Exchange_Btn() {
		return AllOrders_Exchange_Btn;
	}

	public WebElement getAllOrders_CustomerName_InExchange_Refund_Popup() {
		return AllOrders_CustomerName_InExchange_Refund_Popup;
	}

	public void Click_Sale_HistoryBtn() throws InterruptedException {
		Thread.sleep(500);
		//click the sale history button
		click_Ele(getOrder_Screen_Sale_HistoryBtn());
	}

	public void Click_ReturnBtn() throws InterruptedException {
		Thread.sleep(2000);
		//click the return button
		click_Ele(getAllOrders_Return_Btn());
	}

	public void Click_OpenCheckBtn() throws InterruptedException {
		Thread.sleep(2000);
		//click the return button
		click_Ele(getAllOrders_Return_Btn());
	}

	public void Click_PayCheckBtn() throws InterruptedException {
		Thread.sleep(2000);
		//click the return button
		click_Ele(getAllOrders_PayCheck_Btn());
	}

	public void Click_RefundAllBtn() throws InterruptedException {
		Thread.sleep(2000);
		//click the refund all button
		click_Ele(getAllOrders_Refund_All_Btn());
	}

	public void Click_RefundItemsBtn() throws InterruptedException {
		Thread.sleep(2000);
		//click the refund all button
		click_Ele(getAllOrders_Refund_Items_Btn());
	}

	public void Click_ExchangeBtn() throws InterruptedException {
		Thread.sleep(2000);
		//click the exchange all button
		click_Ele(getAllOrders_Exchange_Btn());
	}

	public void check_The_Closed_Check(String CheckNo) throws InterruptedException {
		Thread.sleep(2000);
		//clear the search field
		ClearData_inputBOX(getAllOrders_Search_Fld());

		Thread.sleep(500);

		//enter the check number
		send_data(getAllOrders_Search_Fld(), CheckNo);

		Thread.sleep(2000);
		//Check whether the check number is available or not
		try {
			if(driver.findElement(By.xpath("//android.widget.GridView[@resource-id='checkTables']//android.view.View[contains(@text,'"+CheckNo+"')]")).isDisplayed()) {
				test.log(LogStatus.PASS, "The required check number is available");
			}
		}catch(Exception ds) {
			test.log(LogStatus.FAIL, "The required check number is not available");
		}
	}

	public void check_The_Closed_Check1(String CheckNo) throws InterruptedException {
		Thread.sleep(2000);
		//clear the search field
		ClearData_inputBOX(getAllOrders_Search_Fld());

		Thread.sleep(500);

		//enter the check number
		send_data(getAllOrders_Search_Fld(), CheckNo);

		Thread.sleep(5000);
		//Check whether the check number is available or not
		try {
			if(driver.findElement(By.xpath("//android.widget.GridView[@resource-id='checkTables']//android.view.View[contains(@text,'"+CheckNo+"')]")).isDisplayed()) {
				test.log(LogStatus.FAIL, "The required check number is available");
				ut.FailedCaptureScreenshotAsBASE64(driver,test);
			}
		}catch(Exception ds) {
			test.log(LogStatus.PASS, "The required check number is not available");
			ut.PassedCaptureScreenshotAsBASE64(driver,test);
		}
	}

	public void select_The_Closed_Check(String CheckNo) throws InterruptedException {
//		Thread.sleep(5000);
		//clear the search field
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ClearData_inputBOX(getAllOrders_Search_Fld());

		Thread.sleep(500);

		//enter the check number
		send_data(getAllOrders_Search_Fld(), CheckNo);

		Thread.sleep(2000);
		//Click the check number is available or not
		click_Ele(FirstCheck_InTheClosedTab);
	}

	public void select_The_Parked_Check(String CheckNo) throws InterruptedException {
//		Thread.sleep(5000);
		//clear the search field
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		ClearData_inputBOX(getAllOrders_Search_Fld());

		Thread.sleep(500);

		//enter the check number
		send_data(getAllOrders_Search_Fld(), CheckNo);

		Thread.sleep(2000);
		//Click the check number is available or not
		click_Ele(FirstCheck_InTheParkedTab);
	}

	public void Verify_The_Refunded_Check(String CheckNo) throws InterruptedException {

		String CheckNo1 = CheckNo.substring(CheckNo.indexOf("-")+1).trim();

		//parse the check number
		int cknum = Integer.parseInt(CheckNo1);

		cknum = cknum + 1;
		String cn;

		if(cknum<10){
			cn = String.valueOf(cknum);
			cn = "00".concat(cn);
		}
		else{
			cn = String.valueOf(cknum);
			cn = "0".concat(cn);
		}

		String[] s = CheckNo.split("-");

		String s1 = s[0];

		//	String s2 = s[1];

		CheckNo = s1.concat("-").concat(cn);

		Thread.sleep(2000);
		//clear the search field
		ClearData_inputBOX(getAllOrders_Search_Fld());

		Thread.sleep(500);

		//enter the check number
		send_data(getAllOrders_Search_Fld(), CheckNo);

		Thread.sleep(2000);
		//Check whether the check number is available or not
		try {
			if(driver.findElement(By.xpath("//*[contains(@text,'"+CheckNo+"')]")).isDisplayed()) {
				test.log(LogStatus.PASS, "The required(Refunded) check number is available in the Refund tab after completing the Refund");
			}
		}catch(Exception ds) {
			test.log(LogStatus.FAIL, "The required(Refunded) check number is not available in the Refund tab after completing the Refund");
		}

		Thread.sleep(1000);
		//click the retail button from the All orders page
		click_Ele(AllOrders_Retail_Btn);

		Thread.sleep(2000);
	}

	public void Verify_The_Refunded_Check3(String CheckNo,String CustomerName) throws InterruptedException {

		String CheckNo1 = CheckNo.substring(CheckNo.indexOf("-")+1).trim();

		//parse the check number
		int cknum = Integer.parseInt(CheckNo1);

		cknum = cknum + 1;
		String cn;

		if(cknum<10){
			cn = String.valueOf(cknum);
			cn = "00".concat(cn);
		}
		else{
			cn = String.valueOf(cknum);
			cn = "0".concat(cn);
		}

		String[] s = CheckNo.split("-");

		String s1 = s[0];

		//	String s2 = s[1];

		CheckNo = s1.concat("-").concat(cn);

		Thread.sleep(2000);
		//clear the search field
		ClearData_inputBOX(getAllOrders_Search_Fld());

		Thread.sleep(500);

		//enter the check number
		send_data(getAllOrders_Search_Fld(), CheckNo);

		Thread.sleep(2000);
		//Check whether the check number is available or not
		try {
			if(driver.findElement(By.xpath("//*[contains(@text,'"+CheckNo+"')]")).isDisplayed()) {
				test.log(LogStatus.PASS, "The required(Refunded) check number is available in the Refund tab after completing the Refund");
			}
		}catch(Exception ds) {
			test.log(LogStatus.FAIL, "The required(Refunded) check number is not available in the Refund tab after completing the Refund");
		}

		checkTheCustomerAvailability1(CustomerName);

		Thread.sleep(1000);
		//click the retail button from the All orders page
		click_Ele(AllOrders_Retail_Btn);

		Thread.sleep(2000);
	}

	public void Verify_The_Refunded_Check1(String CheckNo) throws InterruptedException {

		String CheckNo1 = CheckNo.substring(CheckNo.indexOf("-")+1).trim();

		//parse the check number
		int cknum = Integer.parseInt(CheckNo1);

		cknum = cknum + 1;

		String cn;

		if(cknum<10){
			cn = String.valueOf(cknum);
			cn = "00".concat(cn);
		}
		else{
			cn = String.valueOf(cknum);
			cn = "0".concat(cn);
		}

		String[] s = CheckNo.split("-");

		String s1 = s[0];

		//	String s2 = s[1];

		CheckNo = s1.concat("-").concat(cn);

		Thread.sleep(2000);
		//clear the search field
		getAllOrders_Search_Fld().clear();

		Thread.sleep(500);

		//enter the check number
		send_data(getAllOrders_Search_Fld(), CheckNo);

		Thread.sleep(2000);
		//Check whether the check number is available or not
		try {
			if(driver.findElement(By.xpath("//*[contains(@text,'"+CheckNo+"')]")).isDisplayed()) {
				test.log(LogStatus.PASS, "The required(Refunded) check number is available in the Refund tab after completing the Refund");
			}
		}catch(Exception ds) {
			test.log(LogStatus.FAIL, "The required(Refunded) check number is not available in the Refund tab after completing the Refund");
		}

		Thread.sleep(1000);
	}

	public String Verify_The_Refunded_Check2(String CheckNo) throws InterruptedException {

		String CheckNo1 = CheckNo.substring(CheckNo.indexOf("-")+1).trim();

		//parse the check number
		int cknum = Integer.parseInt(CheckNo1);

		cknum = cknum + 1;

		String cn;

		if(cknum<10){
			cn = String.valueOf(cknum);
			cn = "00".concat(cn);
		}
		else{
			cn = String.valueOf(cknum);
			cn = "0".concat(cn);
		}

		String[] s = CheckNo.split("-");

		String s1 = s[0];

		//	String s2 = s[1];

		CheckNo = s1.concat("-").concat(cn);

		return CheckNo;
	}



	public void Verify_The_Refunded_Check_And_Customer(String CheckNo) throws InterruptedException {

		String CheckNo1 = CheckNo.substring(CheckNo.indexOf("-")+1).trim();

		//parse the check number
		int cknum = Integer.parseInt(CheckNo1);

		cknum = cknum + 1;

		String cn;

		if(cknum<10){
			cn = String.valueOf(cknum);
			cn = "00".concat(cn);
		}
		else{
			cn = String.valueOf(cknum);
			cn = "0".concat(cn);
		}

		String[] s = CheckNo.split("-");

		String s1 = s[0];

		//	String s2 = s[1];

		CheckNo = s1.concat("-").concat(cn);

		Thread.sleep(2000);
		//clear the search field
		ClearData_inputBOX(getAllOrders_Search_Fld());

		Thread.sleep(500);

		//enter the check number
		send_data(getAllOrders_Search_Fld(), CheckNo);

		Thread.sleep(2000);
		//Check whether the check number is available or not
		try {
			if(Walkin.isDisplayed()) {
				test.log(LogStatus.FAIL, "The required(Refunded) check number is available in the Refund tab after completing the Refund but customer name is missing");
				//int i = 1;
//				AssertMethod(Walkin);
				new SoftAssert().assertEquals(false,Walkin.isDisplayed(),"Walkin button is displayed instead of the Customer Name");
			}
		}catch(Exception ds) {
			test.log(LogStatus.PASS, "The required(Refunded) check number is not available in the Refund tab after completing the Refund and customer name is available");
//			Assert.assertTrue(Walkin.isDisplayed());
			new SoftAssert().assertEquals(true,Walkin.isDisplayed(),"Walkin button is not displayed instead of the Customer Name");
		}

		Thread.sleep(1000);
		//click the retail button from the All orders page
		click_Ele(AllOrders_Retail_Btn);

		Thread.sleep(2000);
	}




	public void Verify_The_Check_And_Customer(String CheckNo) throws InterruptedException {

		Thread.sleep(2000);
		//clear the search field
		ClearData_inputBOX(getAllOrders_Search_Fld());

		Thread.sleep(500);

		//enter the check number
		send_data(getAllOrders_Search_Fld(), CheckNo);

		Thread.sleep(2000);
		//Check whether the check number is available or not
		try {
			if(Walkin.isDisplayed()) {
				test.log(LogStatus.PASS, "The required check number is available but customer name is missing");
			}
		}catch(Exception ds) {
			test.log(LogStatus.FAIL, "The required check number is not available and customer name is available");
		}
		Thread.sleep(2000);
	}

	public void Verify_The_TotalInEnterDepositAmountButton(String total) throws Throwable {
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Check whether the check number is available or not
		try {
			if(driver.findElement(By.xpath("//*[contains(@text,'Due Balance')]/../android.widget.TextView[2]")).getText().equals(total)) {
				test.log(LogStatus.PASS, "The required total is correctly displayed in the Enter Deposit Amount popup");
			}
		}catch(Exception ds) {
			test.log(LogStatus.FAIL, "The required total is wrongly displayed in the Enter Deposit Amount popup");
		}
	}

	public void Verify_The_TotalInEnterDepositAmountAndPaymentsScreen(String total) throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Check whether the check number is available or not
		try {
			if(driver.findElement(By.xpath("//*[contains(@text,'Balance Due')]/../android.view.View[2]")).getText().equals(total)) {
				test.log(LogStatus.PASS, "The required total is correctly displayed in the Payment Screen compared with the Enter Deposit Amount popup");
			}
		}catch(Exception ds) {
			test.log(LogStatus.FAIL, "The required total is wrongly displayed in the Payment Screen compared with the Enter Deposit Amount popup");
		}
	}

	public void Verify_The_BalanceAmountAndPaymentsScreen(String balanceAmount) throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Check whether the check number is available or not
		try {
			if(driver.findElement(By.xpath("//*[contains(@text,'Balance Due')]/../android.view.View[2]")).getText().equals(balanceAmount)) {
				test.log(LogStatus.PASS, "The required balance amount is correctly displayed in the Payment Screen");
			}
		}catch(Exception ds) {
			test.log(LogStatus.FAIL, "The required balance amount is wrongly displayed in the Payment Screen");
		}
	}

	public void clickTheSaleHistoryTab() throws InterruptedException {
		Thread.sleep(2000);
		//click the sale history button
		click_Ele(getOrder_Screen_Sale_HistoryBtn());
	}

	public void clickTheExchangedTab() throws InterruptedException {
		Thread.sleep(2000);
		//click the sale history button
		click_Ele(getOrder_Screen_Exchanged_tab());
	}

	public void selectTheCheckFromClosedTab_WithCustomer(String CheckNo,String CustomerName) throws InterruptedException {
		cm = new Common_xpath();

		Thread.sleep(2000);
		getAllOrders_Search_Fld().clear();Thread.sleep(500);
		//enter the check number
		send_data(getAllOrders_Search_Fld(), CheckNo);

		Thread.sleep(2000);
		//Check whether the check number is available or not
		try {//System.out.println(driver.findElement(By.xpath("//*[@text='"+CheckNo+"']/../android.view.View[2]")).getText());
			//System.out.println(driver.findElement(By.xpath("//*[@text='"+CustomerName+"']/../android.view.View[2]")).getText());
			if(driver.findElement(By.xpath("//*[@text='"+CheckNo+"']/../android.view.View[2]")).isDisplayed() && driver.findElement(By.xpath("//*[@text='"+CustomerName+"']/../android.view.View[2]")).isDisplayed()) {
				test.log(LogStatus.PASS, "The required(Closed) check number with customer is available in the Closed tab after completing the check");
			}
		}catch(Exception ds) {
			test.log(LogStatus.FAIL, "The required(Closed) check number with customer is not available in the Closed tab after completing the check");
		}
		Thread.sleep(2000);
		//Click the check
		driver.findElement(By.xpath("//*[@text='"+CheckNo+"']/../android.view.View[2]")).click();

	}

	public void clickTheReceiptNumberField(){
		//clear the search field
		ClearData_inputBOX(getAllOrders_Search_Fld());

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		click_Ele(getAllOrders_Search_Fld());
	}

	public void enterTheSingleCharInReceiptNo(String CheckNo) throws InterruptedException {
		String s = String.valueOf(CheckNo.charAt(CheckNo.length()-1));

		Thread.sleep(500);

		//enter the check number
		send_data(getAllOrders_Search_Fld(), s);
	}

	public void Verify_The_Closed_Check_SingleChar(String CheckNo) throws Throwable {

		Thread.sleep(2000);
		//Check whether the check number is available or not
		try {
			if(driver.findElement(By.xpath("//*[@text='"+CheckNo+"']/../android.view.View[2]")).isDisplayed()) {
				test.log(LogStatus.PASS, "The required(Closed) check number is available in the Closed tab after completing the check");
			}
		}catch(Exception ds) {
			test.log(LogStatus.FAIL, "The required(Closed) check number is not available in the Closed tab after completing the check");
		}

		Thread.sleep(1000);
		//click the retail button from the All orders page
		click_Ele(AllOrders_Retail_Btn);

		Thread.sleep(2000);
	}


	public void Verify_The_Closed_Check(String CheckNo) throws Throwable {
		cm = new Common_xpath();


		Thread.sleep(2000);
		//click the sale history button
		click_Ele(getOrder_Screen_Sale_HistoryBtn());

		Thread.sleep(2000);
		//clear the search field
		ClearData_inputBOX(getAllOrders_Search_Fld());

		Thread.sleep(500);

		//enter the check number
		send_data(getAllOrders_Search_Fld(), CheckNo);

		Thread.sleep(2000);
		//Check whether the check number is available or not
		try {
			if(driver.findElement(By.xpath("//*[@text='"+CheckNo+"']/../android.view.View[2]")).isDisplayed()) {
				test.log(LogStatus.PASS, "The required(Closed) check number is available in the Closed tab after completing the check");
			}
		}catch(Exception ds) {
			test.log(LogStatus.FAIL, "The required(Closed) check number is not available in the Closed tab after completing the check");
		}

		Thread.sleep(1000);
		//click the retail button from the All orders page
		click_Ele(AllOrders_Retail_Btn);

		Thread.sleep(2000);
	}



	public void Verify_The_Exchanged_Check(String CheckNo) throws Throwable {

		Thread.sleep(2000);
		//clear the search field
		ClearData_inputBOX(getAllOrders_Search_Fld());

		Thread.sleep(500);

		//enter the check number
		send_data(getAllOrders_Search_Fld(), CheckNo);

		Thread.sleep(2000);
		//Check whether the check number is available or not
		try {
			if(driver.findElement(By.xpath("//*[@text='"+CheckNo+"']/../android.view.View[2]")).isDisplayed()) {
				test.log(LogStatus.PASS, "The required(Closed) check number is available in the Exchanged tab after completing the check");
			}
		}catch(Exception ds) {
			test.log(LogStatus.FAIL, "The required(Closed) check number is not available in the Exchanged tab after completing the check");
		}
	}

	public void Verify_The_Void_Check(String CheckNo) throws Throwable {

		Thread.sleep(2000);
		//Check whether the check number is available or not
		try {
			if(driver.findElement(By.xpath("//*[@text='"+CheckNo+"']/../android.view.View[2]")).isDisplayed()) {
				test.log(LogStatus.PASS, "The required check number is available in the Void tab after void the check");
			}
		}catch(Exception ds) {
			test.log(LogStatus.FAIL, "The required check number is not available in the Void tab after void the check");
		}
	}

	public void Verify_The_Parked_Check(String CheckNo) throws Throwable {

		Thread.sleep(2000);
		//Check whether the check number is available or not
		try {
			if(driver.findElement(By.xpath("//*[@text='"+CheckNo+"']/../android.view.View[2]")).isDisplayed()) {
				test.log(LogStatus.PASS, "The required check number is available in the Parked tab after park the check");
			}
		}catch(Exception ds) {
			test.log(LogStatus.FAIL, "The required check number is not available in the Parked tab after park the check");
		}
	}

	public void Verify_The_Exchanged_Check_WithDate(String CheckNo) throws Throwable {

		Thread.sleep(2000);
		//clear the search field
		ClearData_inputBOX(getAllOrders_Search_Fld());

		Thread.sleep(500);

		//enter the check number
		send_data(getAllOrders_Search_Fld(), CheckNo);

		Thread.sleep(2000);

			// Get the current date
			LocalDate currentDate = LocalDate.now();
			// If you want to format the date, you can use a DateTimeFormatter
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
			String formattedDate = currentDate.format(formatter);

		//Check whether the check number is available or not
		try {
			if(driver.findElement(By.xpath("//*[@text='"+CheckNo+"']/../android.view.View[2]")).isDisplayed() && driver.findElement(By.xpath("//*[@text='"+formattedDate+"']/../android.view.View[2]")).isDisplayed()) {
				test.log(LogStatus.PASS, "The required(Closed) check number is available in the Exchanged tab after completing the check in the current date");
			}
		}catch(Exception ds) {
			test.log(LogStatus.FAIL, "The required(Closed) check number is not available in the Exchanged tab after completing the check check in the current date");
		}
	}

	public void click_The_Digital_ReceiptScreen_Exchanged_Tab(String CheckNo) throws Throwable {
		Thread.sleep(500);
		try{
			if(driver.findElement(By.xpath("//*[contains(@text,'"+CheckNo+"')]/..//android.widget.Button")).isDisplayed()){
				//click the digital receipt screen
				driver.findElement(By.xpath("//*[contains(@text,'"+CheckNo+"')]/..//android.widget.Button")).click();

				Thread.sleep(500);
				//click the back button
				Digital_Receipt_Back_Btn.click();
			}
		}catch (Exception d){
			test.log(LogStatus.FAIL,"Digital Receipt Screen is not displayed");
		}
	}

	public void ClickTheRetailBtn() throws InterruptedException {
		Thread.sleep(1000);
		//click the retail button from All orders page
		click_Ele(AllOrders_Retail_Btn);

		Thread.sleep(2000);
	}

	public void Verify_The_Closed_Check1(String CheckNo) throws Throwable {
		cm = new Common_xpath();

		Thread.sleep(2000);
		//clear the search field
		ClearData_inputBOX(getAllOrders_Search_Fld());

		Thread.sleep(500);

		//enter the check number
		send_data(getAllOrders_Search_Fld(), CheckNo);

		Thread.sleep(2000);
		//Check whether the check number is available or not
		try {
			if(driver.findElement(By.xpath("//*[@text='"+CheckNo+"']/../android.view.View[2]")).isDisplayed()) {
				test.log(LogStatus.PASS, "The required(Closed) check number is available in the Closed tab after completing the check");
			}
		}catch(Exception ds) {
			test.log(LogStatus.FAIL, "The required(Closed) check number is not available in the Closed tab after completing the check");
		}

		Thread.sleep(1000);
		//click the retail button from the All orders page
		click_Ele(AllOrders_Retail_Btn);

		Thread.sleep(2000);
	}

	public void Verify_The_Closed_Check2(String CheckNo) throws Throwable {
		cm = new Common_xpath();

		Thread.sleep(2000);
		//clear the search field
		ClearData_inputBOX(getAllOrders_Search_Fld());

		Thread.sleep(500);

		//enter the check number
		send_data(getAllOrders_Search_Fld(), CheckNo);

		Thread.sleep(2000);
		//Check whether the check number is available or not
		try {
			if(driver.findElement(By.xpath("//*[@text='"+CheckNo+"']/../android.view.View[2]")).isDisplayed()) {
				test.log(LogStatus.PASS, "The required(Closed) check number is available in the Closed tab after completing the check");
			}
		}catch(Exception ds) {
			test.log(LogStatus.FAIL, "The required(Closed) check number is not available in the Closed tab after completing the check");
		}

		Thread.sleep(1000);
	}

	public void verifyTheLayawayedCheckOpenedCorrectlyOrNot(String CheckNumber){
		String Che = new RetailPOS_Order_Page().get_Check_NO();
		if(Che.equals(CheckNumber)){
			test.log(LogStatus.PASS,"Correct check placed in the Retail Screen when user click the check from the Layaways tab");
		}else{
			test.log(LogStatus.FAIL,"Correct check not placed in the Retail Screen when user click the check from the Layaways tab");
		}
	}
	public void Verify_The_LayAways_Check(String CheckNo) throws Throwable {
//		System.out.println("sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
//		driver.findElement(By.xpath("//*[contains(@text,'All Orders')]")).click();
//		System.out.println("sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement ele = wait.until(ExpectedConditions.visibilityOf(getAllOrders_Search_Fld()));
//		click_Ele(ele);
		click_Ele(getAllOrders_Search_Fld());
//		System.out.println("sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");


		Thread.sleep(1000);
		//clear the search field
		ClearData_inputBOX(getAllOrders_Search_Fld());

		Thread.sleep(500);

		//enter the check number
		send_data(getAllOrders_Search_Fld(), CheckNo);

		Thread.sleep(2000);
		//Check whether the check number is available or not
		try {
			if(driver.findElement(By.xpath("//*[@text='"+CheckNo+"']/../android.view.View[2]")).isDisplayed()) {
				test.log(LogStatus.PASS, "The required(Layaway) check number is available in the Layaways tab after send the check to Layaway");
			}
		}catch(Exception ds) {
			test.log(LogStatus.FAIL, "The required(Layaway) check number is not available in the Layaways tab after send the check to Layaway");
		}

		Thread.sleep(2000);
		//Click the check number is available or not
		click_Ele(FirstCheck_InTheClosedTab);

	}

	public void Verify_The_LayAways_Check1(String CheckNo) throws Throwable {

		click_Ele(getAllOrders_Search_Fld());

		Thread.sleep(1000);
		//clear the search field
		ClearData_inputBOX(getAllOrders_Search_Fld());

		Thread.sleep(500);

		//enter the check number
		send_data(getAllOrders_Search_Fld(), CheckNo);

		Thread.sleep(2000);
		//Check whether the check number is available or not
		try {
			if(driver.findElement(By.xpath("//*[@text='"+CheckNo+"']/../android.view.View[2]")).isDisplayed()) {
				test.log(LogStatus.PASS, "The required(Layaway) check number is available in the Layaways tab after send the check to Layaway");
			}
		}catch(Exception ds) {
			test.log(LogStatus.FAIL, "The required(Layaway) check number is not available in the Layaways tab after send the check to Layaway");
		}

		Thread.sleep(2000);
	}

	@AndroidFindBy(xpath = "//*[contains(@text,'All Orders')]")
	WebElement allOrders;

	public WebElement getAllOrders() {
		return allOrders;
	}

	@AndroidFindBy(xpath = "//*[contains(@text,'Layaways')]")
	WebElement Layaways_tab;

	public WebElement getLayawaysTab() {
		return Layaways_tab;
	}
	public void layawaysTabAvailability1() throws InterruptedException {
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		String s1 = getLayawaysTab().getText();
		System.out.println("Layaways tab is still displayed : ");
		try{
			if (s1.contains("Layaways")){
				test.log(LogStatus.PASS,"Layaways Tab is displayed");
			}
		}catch(Exception e){
			test.log(LogStatus.FAIL,"Layaways Tab is not displayed");
		}
	}

	@AndroidFindBy(xpath = "//*[contains(@text,'Gift Card')]")
	WebElement Payment_Screen_GiftCard_Btn;

	@AndroidFindBy(xpath = "//*[contains(@text,'Side CC')]")
	WebElement Payment_Screen_SideCC_Btn;

	@AndroidFindBy(xpath = "//*[contains(@text,'Others')]")
	WebElement Payment_Screen_Others_Btn;

	@AndroidFindBy(xpath = "//*[contains(@text,'HAPayment')]")
	WebElement Payment_Screen_HAPayment_Btn;

	@AndroidFindBy(xpath = "//*[contains(@text,'Tender Amount')]/../android.view.View[10]")
	WebElement Payment_Screen_Number_8;

	@AndroidFindBy(xpath = "//*[contains(@text,'Manual')]")
	WebElement CardReader_Screen_Manual_Btn;

	@AndroidFindBy(xpath = "//*[contains(@text,'Process')]")
	WebElement CardReader_Screen_Process_Btn;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'cardInput')]")
	WebElement CardReader_Screen_Card_Input;

	@AndroidFindBy(xpath = "//*[contains(@text,'Card Number')]")
	WebElement CardReader_Screen_CardNumber_Txt;

	@AndroidFindBy(xpath = "//*[contains(@text,'Refund Reasons')]/../android.view.View/android.widget.Button")
	WebElement RefundReasons;

	@AndroidFindBy(xpath = "//*[contains(@text,'Exchange Reasons')]")
	WebElement Exchange_ExchangeReasons;

	@AndroidFindBy(xpath = "//*[contains(@text,'Exchange Amount')]")
	WebElement Exchange_ExchangeAmount;

	@AndroidFindBy(xpath = "//*[contains(@text,'Customer')]")
	WebElement Exchange_Customer;

	@AndroidFindBy(xpath = "//*[contains(@text,'Pay By')]")
	WebElement Exchange_PayBy;

	@AndroidFindBy(xpath = "//*[contains(@text,'EXCHANGE COMPLETED FOR: ')]")
	WebElement Exchange_EXCHANGE_COMPLETED_FOR ;

	@AndroidFindBy(xpath = "//*[contains(@text,'PAID')]")
	WebElement Exchange_Paid;

	@AndroidFindBy(xpath = "//*[contains(@text,'Subtotal')]")
	WebElement Exchange_Subtotal;

	@AndroidFindBy(xpath = "//*[contains(@text,'Tax')]")
	WebElement Exchange_Tax;

	@AndroidFindBy(xpath = "//*[contains(@text,'Total')]")
	WebElement Exchange_Total;

	@AndroidFindBy(xpath = "//*[contains(@text,'Print Receipt')]")
	WebElement Exchange_PrintReceipt;

	@AndroidFindBy(xpath = "//*[contains(@text,'Send to Layaway')]")
	WebElement Layaway_Payment_Screen_SendToLayaway_Btn;

	public WebElement getPayment_Screen_Number8_Btn() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return Payment_Screen_Number_8;
	}

	public WebElement getExchange_ExchangeReasons(){return Exchange_ExchangeReasons;}

	public WebElement getExchange_ExchangeAmount(){return Exchange_ExchangeAmount;}

	public WebElement getExchange_Customer(){return Exchange_Customer;}

	public WebElement getExchange_PayBy(){return Exchange_PayBy;}

	public WebElement getExchange_EXCHANGE_COMPLETED_FOR(){return Exchange_EXCHANGE_COMPLETED_FOR;}

	public  WebElement getExchange_Paid(){return Exchange_Paid;}

	public WebElement getExchange_Subtotal(){return Exchange_Subtotal;}

	public WebElement getExchange_Tax(){return Exchange_Tax;}

	public WebElement getExchange_Total(){return Exchange_Total;}

	public WebElement getExchange_PrintReceipt(){return Exchange_PrintReceipt;}

	public WebElement CardReader_Screen_Manual_Btn() {
		return CardReader_Screen_Manual_Btn;
	}

	public WebElement CardReader_Screen_Process_Btn() {
		return CardReader_Screen_Process_Btn;
	}

	public WebElement CardReader_Screen_Card_Input() {
		return CardReader_Screen_Card_Input;
	}

	public WebElement CardReader_Screen_CardNumber_Txt() {
		return CardReader_Screen_CardNumber_Txt;
	}

	public WebElement getLayaway_Payment_Screen_SendToLayaway_Btn() {
		return Layaway_Payment_Screen_SendToLayaway_Btn;
	}

	public WebElement getPayment_Screen_GiftCardBtn() {
		return Payment_Screen_GiftCard_Btn;
	}

	public WebElement getPayment_Screen_SideCCBtn() {
		return Payment_Screen_SideCC_Btn;
	}

	public WebElement getPayment_Screen_OthersBtn() {
		return Payment_Screen_Others_Btn;
	}

	public WebElement getPayment_Screen_HAPaymentBtn() {
		return Payment_Screen_HAPayment_Btn;
	}

	public void verifyTheExchangeScreenValidations(){
		if(getExchange_ExchangeReasons().isDisplayed()){
			test.log(LogStatus.PASS,"Exchange Reasons is available in the Exchange screen, after clicking the Exchange button");
		}else{
			test.log(LogStatus.FAIL,"Exchange Reasons is not available in the Exchange screen, after clicking the Exchange button");
		}

		if(getExchange_ExchangeAmount().isDisplayed()){
			test.log(LogStatus.PASS,"Exchange Amount is available in the Exchange screen, after clicking the Exchange button");
		}else{
			test.log(LogStatus.FAIL,"Exchange Amount is not available in the Exchange screen, after clicking the Exchange button");
		}

		if(getExchange_Customer().isDisplayed()){
			test.log(LogStatus.PASS,"Customer is available in the Exchange screen, after clicking the Exchange button");
		}else{
			test.log(LogStatus.FAIL,"Customer is not available in the Exchange screen, after clicking the Exchange button");
		}

		if(getExchange_PayBy().isDisplayed()){
			test.log(LogStatus.PASS,"Pay By is available in the Exchange screen, after clicking the Exchange button");
		}else{
			test.log(LogStatus.FAIL,"Pay By is not available in the Exchange screen, after clicking the Exchange button");
		}
	}

	public void verifyTheExchangeScreenValidations_AfterPaid() {
		if (getExchange_EXCHANGE_COMPLETED_FOR().isDisplayed()) {
			test.log(LogStatus.PASS, "Exchange Completed For Receipt is available in the Exchange screen, after complete the payment in Exchange button");
		} else {
			test.log(LogStatus.FAIL, "Exchange Completed For Receipt is not available in the Exchange screen, after complete the payment in Exchange button");
		}

		if (getExchange_Paid().isDisplayed()) {
			test.log(LogStatus.PASS, "Paid amount is available in the Exchange screen, after complete the payment in Exchange button");
		} else {
			test.log(LogStatus.FAIL, "Paid amount is not available in the Exchange screen, after complete the payment in Exchange button");
		}

		if (getExchange_Subtotal().isDisplayed()) {
			test.log(LogStatus.PASS, "Subtotal is available in the Exchange screen, after complete the payment in Exchange button");
		} else {
			test.log(LogStatus.FAIL, "Subtotal is not available in the Exchange screen, after complete the payment in Exchange button");
		}

		if (getExchange_Tax().isDisplayed()) {
			test.log(LogStatus.PASS, "Tax is available in the Exchange screen, after complete the payment in Exchange button");
		} else {
			test.log(LogStatus.FAIL, "Tax is not available in the Exchange screen, after complete the payment in Exchange button");
		}

		if (getExchange_Total().isDisplayed()) {
			test.log(LogStatus.PASS, "Total is available in the Exchange screen, after complete the payment in Exchange button");
		} else {
			test.log(LogStatus.FAIL, "Total is not available in the Exchange screen, after complete the payment in Exchange button");
		}

		if (getExchange_PrintReceipt().isDisplayed()) {
			test.log(LogStatus.PASS, "Print Receipt is available in the Exchange screen, after complete the payment in Exchange button");
		} else {
			test.log(LogStatus.FAIL, "Print Receipt is not available in the Exchange screen, after complete the payment in Exchange button");
		}
	}

	public void Cash_Option() throws InterruptedException {
		Thread.sleep(1000);
		//click the cash button from the payment screen
		click_Ele(getPayment_Screen_CashBtn());
	}

	public void clickRemoveBtn(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//click the remove button
		click_Ele(getRefund_Refund_Remove());
	}

	public void clickSendToLayawayBtn() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		click_Ele(getLayaway_Payment_Screen_SendToLayaway_Btn());

		Thread.sleep(3000);
	}

	public void Others_Option() throws InterruptedException {
		Thread.sleep(1000);
		//click the Others button from the payment screen
		click_Ele(getPayment_Screen_OthersBtn());
	}

	public void SideCC_Option() throws InterruptedException {
		Thread.sleep(1000);
		//click the cash button from the payment screen
		click_Ele(getPayment_Screen_SideCCBtn());
	}

	public void Submit_Option() throws InterruptedException {
		Thread.sleep(1000);
		//click the cash button from the payment screen
		click_Ele(getPayment_Screen_SubmitBtn());
	}

	public void Back_Option() throws InterruptedException {
		Thread.sleep(1000);
		//click the cash button from the payment screen
		click_Ele(getPayment_Screen_Back_Btn());
	}

	public void refundScreenVisibility(){
		try{
			if(Refund_Refund_Head.isDisplayed()){
				test.log(LogStatus.PASS,"Refund Screen is displayed after clicking the Refund Items/Refund All button");
			}
		}catch (Exception e){
			test.log(LogStatus.FAIL,"Refund Screen is not displayed after clicking the Refund Items/Refund All button");
		}

		try{
			if(Refund_Refund_Reasons.isDisplayed() && Refund_Refund_Amount.isDisplayed() && Refund_Refund_Customer.isDisplayed() && Refund_Refund_ReturnBy.isDisplayed() && Refund_Refund_FreeText.isDisplayed() && Refund_Refund_Amount1.isDisplayed()){
				test.log(LogStatus.PASS,"Refund Reasons, Refund Amount, Refund Amount Value, Free Text, Customer and Return By fields are displayed in the Refund Screen");
			}
		}catch (Exception e){
			test.log(LogStatus.FAIL,"Refund Reasons, Refund Amount, Refund Amount Value, Free Text, Customer and Return By fields are not displayed in the Refund Screen");
			ut.FailedCaptureScreenshotAsBASE64(driver,test);
		}
	}

	public void refundScreenVisibility1(){
		try{
			if(Refund_Refund_Reasons.isDisplayed() && Refund_Refund_Amount.isDisplayed() && Refund_Refund_Customer.isDisplayed() && Refund_Refund_ReturnBy.isDisplayed() && Refund_Refund_FreeText.isDisplayed() && Refund_Refund_Amount1.isDisplayed()){
				test.log(LogStatus.FAIL,"Refund Reasons, Refund Amount, Refund Amount Value, Free Text, Customer and Return By fields are displayed in the Refund Screen");
			}
		}catch (Exception e){
			test.log(LogStatus.PASS,"Refund Reasons, Refund Amount, Refund Amount Value, Free Text, Customer and Return By fields are not displayed in the Refund Screen");
			ut.PassedCaptureScreenshotAsBASE64(driver,test);
		}
	}

	public void refundScreenVisibility2(){
		try{
			if(Refund_Refund_Head.isDisplayed()){
				test.log(LogStatus.PASS,"Refund Screen is displayed after done the Refund");
			}
		}catch (Exception e){
			test.log(LogStatus.FAIL,"Refund Screen is not displayed after done the Refund");
		}

		try{
			if(Refund_Refund_Completed_For.isDisplayed() && Refund_Refunded.isDisplayed() && Refund_Subtotal.isDisplayed() && Refund_Tax.isDisplayed() && Refund_Total.isDisplayed() && Refund_Print_Receipt.isDisplayed()){
				test.log(LogStatus.PASS,"Refunded Completed For, Refunded Amount, Subtotal, Tax, Total and Print Receipt fields are displayed in the Refunded Screen");
			}
		}catch (Exception e){
			test.log(LogStatus.FAIL,"Refunded Completed For, Refunded Amount, Subtotal, Tax, Total and Print Receipt fields are not displayed in the Refunded Screen");
			ut.FailedCaptureScreenshotAsBASE64(driver,test);
		}
	}

	public void  Select_The_Refund_Reasons() throws InterruptedException {
		// Getting list of options
		List<?> itemsInDropdown = driver.findElements(By.xpath("//*[contains(@text,'Refund Reasons')]/../android.view.View/android.widget.Button"));

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

	public String getTheReason(){
		String reason;

		reason = ReasonTextBox.getText();

		return reason;
	}

	public void Select_The_Void_Reasons() throws InterruptedException {
		// Getting list of options
		List<?> itemsInDropdown = driver.findElements(By.xpath("//*[contains(@text,'Select or type your void reason')]/../android.view.View[1]/android.view.View/android.widget.Button"));

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

	public void checkTheCustomerAvailability(String CustomerName) throws Exception {
		String s = Utility.getProperty("CustomerName");
//		String s = getAllOrders_CustomerName_InExchange_Refund_Popup().getText();
		if(s.contains(CustomerName)){
			test.log(LogStatus.PASS,"The customer is attached with the Exchange Screen");
		}else{
			test.log(LogStatus.FAIL,"The customer is not attached with the Exchange Screen");
		}
	}

	public void checkTheCustomerAvailability1(String CustomerName){
		try{
			String s =  new RetailPOS_Order_Page().getCustomerName_RefundScreen();
			if(s.contains(CustomerName)){
				test.log(LogStatus.PASS,"The customer is attached with the Refund Screen");
			}
		}
		catch (Exception s){
			test.log(LogStatus.FAIL,"The customer is not attached with the Refund Screen");
		}
	}

	public void checkTheCustomerAvailability_Refund(String CustomerName){

		try{String s =  new RetailPOS_Order_Page().getCustomerName_Refund();
			if(s.contains(CustomerName)){
				test.log(LogStatus.PASS,"The customer is attached with the Refund");
			}
		}catch (Exception e){
			test.log(LogStatus.FAIL,"The customer is not attached with the Refund");
		}
	}

	public void Select_The_Exchange_Reasons() throws InterruptedException {
		// Getting list of options
		List<?> itemsInDropdown = driver.findElements(By.xpath("//*[contains(@text,'Exchange Reasons')]/../android.view.View/android.widget.Button"));

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



	public void GiftCard_Option(String cardNumber) throws InterruptedException {
		Thread.sleep(1000);
		//click the gift card button from the payment screen
		click_Ele(getPayment_Screen_GiftCardBtn());

		Thread.sleep(1000);
		//Click the manual button from the card reader screen
		click_Ele(CardReader_Screen_Manual_Btn());Thread.sleep(1000);

		CardReader_Screen_Card_Input().sendKeys(cardNumber);Thread.sleep(1000);

		//Click the card number button from the card reader screen
		click_Ele(CardReader_Screen_CardNumber_Txt());Thread.sleep(1000);

		//Click the process button from the card reader screen
		click_Ele(CardReader_Screen_Process_Btn());
	}

	public void HAPayment_Option(String cardNumber) throws InterruptedException {
		Thread.sleep(1000);
		//click the cash button from the payment screen
		click_Ele(getPayment_Screen_HAPaymentBtn());

		Thread.sleep(1000);
		//Click the manual button from the card reader screen
		click_Ele(CardReader_Screen_Manual_Btn());Thread.sleep(1000);

		CardReader_Screen_Card_Input().sendKeys(cardNumber);Thread.sleep(1000);

		//Click the card number button from the card reader screen
		click_Ele(CardReader_Screen_CardNumber_Txt());Thread.sleep(1000);

		//Click the process button from the card reader screen
		click_Ele(CardReader_Screen_Process_Btn());
	}

	public void Click_PaymentOption(){
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		click_Ele(new RetailPOS_Order_Page().getOrder_Screen_PaymentBtn());
	}

	public void verifyThePaymentScreen(){
		text_Confirm(driver.findElement(By.xpath("//*[contains(@text,'PAYMENTS')]")),"PAYMENTS" );
	}

	public void Cash_Payment_Selection_And_Completed_ViaPaymentScreen1(String msg) throws Throwable {
		cm = new Common_xpath();
		base = new Appium_Base_Class();
		ro = new RetailPOS_Order_Page();

		//Click the cash option from the order screen
		click_Ele(ro.getOrder_Screen_PaymentBtn());

		Thread.sleep(1000);
		//click the cash button from the payment screen
		click_Ele(getPayment_Screen_CashBtn());

		Thread.sleep(1000);
		//Click the Submit button from the payment screen
		click_Ele(getPayment_Screen_SubmitBtn());

		Thread.sleep(500);

		text_Confirm_without_Screenshot(SaleIsCompleted_Message, msg);

		test.log(LogStatus.PASS, "Payment Completed using the Cash Payment Option");

		// Set up WebDriverWait with a timeout
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.wait(10);Thread.sleep(1500);
	}

	public void Cash_Payment_Selection_And_Completed_ViaPaymentScreen() throws Throwable {
		cm = new Common_xpath();
		base = new Appium_Base_Class();
		ro = new RetailPOS_Order_Page();

		//Click the cash option from the order screen
		click_Ele(ro.getOrder_Screen_PaymentBtn());

		Thread.sleep(1000);
		//click the cash button from the payment screen
		click_Ele(getPayment_Screen_CashBtn());

		Thread.sleep(1000);
		//Click the Submit button from the payment screen
		click_Ele(getPayment_Screen_SubmitBtn());

		Thread.sleep(500);

		test.log(LogStatus.PASS, "Payment Completed using the Cash Payment Option");

		Thread.sleep(5000);
	}

	public void SideCC_Payment_Selection_And_Completed_ViaPaymentScreen() throws Throwable {
		cm = new Common_xpath();
		base = new Appium_Base_Class();
		ro = new RetailPOS_Order_Page();

		//Click the cash option from the order screen
		click_Ele(ro.getOrder_Screen_PaymentBtn());

		Thread.sleep(1000);
		//click the side cc button from the payment screen
		click_Ele(getPayment_Screen_SideCCBtn());

		Thread.sleep(1000);
		//Click the Submit button from the payment screen
		click_Ele(getPayment_Screen_SubmitBtn());

		test.log(LogStatus.PASS, "Payment Completed using the Side CC Payment Option");

		Thread.sleep(1000);
	}

	public void Others_Payment_Selection_And_Completed_ViaPaymentScreen() throws Throwable {
		cm = new Common_xpath();
		base = new Appium_Base_Class();
		ro = new RetailPOS_Order_Page();

		//Click the cash option from the order screen
		click_Ele(ro.getOrder_Screen_PaymentBtn());

		Thread.sleep(1000);
		//click the others button from the payment screen
		click_Ele(getPayment_Screen_OthersBtn());

		Thread.sleep(1000);
		//Click the Submit button from the payment screen
		click_Ele(getPayment_Screen_SubmitBtn());

		test.log(LogStatus.PASS, "Payment Completed using the Others Payment Option");

		Thread.sleep(1000);
	}

	public void GiftCard_Payment_Selection_And_Completed_ViaPaymentScreen(String cardNumber) throws Throwable {
		cm = new Common_xpath();
		base = new Appium_Base_Class();
		ro = new RetailPOS_Order_Page();

		//Click the cash option from the order screen
		click_Ele(ro.getOrder_Screen_PaymentBtn());

		Thread.sleep(1000);
		//click the gift card button from the payment screen
		click_Ele(getPayment_Screen_GiftCardBtn());

		Thread.sleep(1000);
		//Click the manual button from the card reader screen
		click_Ele(CardReader_Screen_Manual_Btn());Thread.sleep(1000);

		CardReader_Screen_Card_Input().sendKeys(cardNumber);Thread.sleep(1000);

		//Click the card number button from the card reader screen
		click_Ele(CardReader_Screen_CardNumber_Txt());Thread.sleep(1000);

		//Click the process button from the card reader screen
		click_Ele(CardReader_Screen_Process_Btn());

		test.log(LogStatus.PASS, "Payment Completed using the Gift Card Payment Option");

		Thread.sleep(6000);
	}

	public void HAPayment_Payment_Selection_And_Completed_ViaPaymentScreen(String cardNumber) throws Throwable {
		cm = new Common_xpath();
		base = new Appium_Base_Class();
		ro = new RetailPOS_Order_Page();

		//Click the cash option from the order screen
		click_Ele(ro.getOrder_Screen_PaymentBtn());

		Thread.sleep(1000);
		//click the cash button from the payment screen
		click_Ele(getPayment_Screen_HAPaymentBtn());

		Thread.sleep(1000);
		//Click the manual button from the card reader screen
		click_Ele(CardReader_Screen_Manual_Btn());Thread.sleep(1000);

		CardReader_Screen_Card_Input().sendKeys(cardNumber);Thread.sleep(1000);

		//Click the card number button from the card reader screen
		click_Ele(CardReader_Screen_CardNumber_Txt());Thread.sleep(1000);

		//Click the process button from the card reader screen
		click_Ele(CardReader_Screen_Process_Btn());

		test.log(LogStatus.PASS, "Payment Completed using the HA Payment Option");

		Thread.sleep(6000);
	}



}
