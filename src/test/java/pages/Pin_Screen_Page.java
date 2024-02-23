package pages;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebElement;
import utility.Utility;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Pin_Screen_Page extends Appium_Base_Class {
	
	
//	public AppiumDriver driver;
//	public ExtentTest test;
//	Appium_Base_Class base;
	public Login_Page lp;
	public String Node_NO;
	public Common_xpath cm;
    Utility ut = new Utility();
	
//	public Pin_Screen_Page(AppiumDriver driver)
//	{
//		this.driver= driver;
//
//
//		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(30)), this);
//	}
	
	@AndroidFindBy(xpath = "//*[@text='Sign Out']")
	WebElement Pin_Screen_SignOut_Btn;
	
	@AndroidFindBy(xpath = "//android.view.View/android.view.View/android.view.View[2]/android.widget.TextView[1]")
	WebElement Pin_Screen_Store_Name;
	
	@AndroidFindBy(xpath = "//*[@text='Sync Checks']")
	WebElement Pin_Screen_Sync_Checks;

	@AndroidFindBy(xpath = "//*[@text='Sync']")
	WebElement Pin_Screen_Sync;

	@AndroidFindBy(xpath = "//*[@text='Sync Receipts']")
	WebElement Pin_Screen_Sync_Receipts;
	
	@AndroidFindBy(xpath = "//android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.TextView")
	WebElement Node_Text;
	
	public String getNode_Text() {
		this.Node_NO = Node_Text.getText().substring(0, 3);
		return Node_Text.getText().substring(0, 3);
	}

	@AndroidFindBy(xpath = "//*[@text='Linga']/../android.widget.TextView[2]")
	public WebElement Pin_Screen_pinentry_text;
	//*[contains(@text,'Enter PIN, Swipe Card or Use Face ID')]//*[contains(@text,'To login enter your ID')]
	public WebElement Pin_Screen_pinEntry_text() {
		return Pin_Screen_pinentry_text;
	}

	public void validateThePinScreenText(){
		try{
			if(Pin_Screen_pinEntry_text().getText().equals("Enter PIN, Swipe Card or Use Face ID")){
				test.log(LogStatus.PASS,"Enter PIN, Swipe Card or Use Face ID text is displayed correctly in the Login pin screen");
			}
		}catch (Exception s){
			if(!Pin_Screen_pinEntry_text().getText().equals("Enter PIN, Swipe Card or Use Face ID")){
				test.log(LogStatus.FAIL,"Enter PIN, Swipe Card or Use Face ID text is not displayed correctly in the Login pin screen");
			}
		}
	}

	public WebElement Pin_Screen_SignOut_Btn() {
		return Pin_Screen_SignOut_Btn;
	}

	public WebElement Pin_Screen_Store_Name() {
		return Pin_Screen_Store_Name;
	}

	public WebElement Pin_Screen_Sync_Checks() {
		return Pin_Screen_Sync_Checks;
	}

	public WebElement Pin_Screen_Sync() {
		return Pin_Screen_Sync;
	}

	public WebElement Pin_Screen_Clock_IN() {
		return Pin_Screen_Clock_IN;
	}

	public WebElement Pin_Screen_Clock_Out() {
		return Pin_Screen_Clock_Out;
	}

	public WebElement Pin_Screen_BackOffice() {
		return Pin_Screen_BackOffice;
	}

	public WebElement Pin_Screen_Operations() {
		return Pin_Screen_Operations;
	}

	public WebElement Pin_Screen_Devices() {
		return Pin_Screen_Devices;
	}

	public WebElement Pin_Screen_Business_Date() {
		return Pin_Screen_Business_Date;
	}

	public WebElement Pin_Screen_Version() {
		return Pin_Screen_Version;
	}

	public WebElement Pin_Screen_Sync_SuccessMsg() {
		return Pin_Screen_Sync_SuccessMsg;
	}

	@AndroidFindBy(xpath = "//*[@text='Clock In']")
	WebElement Pin_Screen_Clock_IN;
	
	@AndroidFindBy(xpath = "//*[@text='Clock Out']")
	WebElement Pin_Screen_Clock_Out;
	
	@AndroidFindBy(xpath = "//*[@text='Back Office']")
	WebElement Pin_Screen_BackOffice;
	
	@AndroidFindBy(xpath = "//*[@text='Operation']")
	WebElement Pin_Screen_Operations;
	
	@AndroidFindBy(xpath = "//*[@text='Devices']")
	WebElement Pin_Screen_Devices;

	@AndroidFindBy(xpath = "//*[@text='Low Stock Items']")
	WebElement Pin_Screen_LowStockItems;

	@AndroidFindBy(xpath = "//*[@text='Sign Out']")
	WebElement Pin_Screen_SignOut;

	@AndroidFindBy(xpath = "//*[@text='Connected Devices']")
	WebElement Pin_Screen_Connected_Devices;
	
	@AndroidFindBy(xpath = "//*[@text='Business Date']/../android.widget.TextView[4]")
	WebElement Pin_Screen_Business_Date;
	
	@AndroidFindBy(xpath = "//android.view.View[1]/android.view.View[5]/android.widget.TextView[1]")
	WebElement Pin_Screen_Current_Date;
	
	@AndroidFindBy(xpath = "//android.view.View[1]/android.view.View[5]/android.widget.TextView[2]")
	WebElement Pin_Screen_Version;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.widget.TextView")
	WebElement Pin_Screen_Sync_SuccessMsg;
	
	
	public String current_Date() {
		
		String current_Date = Pin_Screen_Current_Date.getText().substring(11);
		
		return current_Date;
	}

	public WebElement Logout_Confirmation_Mgs() {
		return Logout_Confirmation_Mgs;
	}

	public WebElement Logout_Yes_Btn() {
		return Logout_Yes_Btn;
	}

	public WebElement Logout_No_Btn() {
		return Logout_No_Btn;
	}

	@AndroidFindBy(xpath = "//*[@text='Do you want to Logout?']")
	WebElement Logout_Confirmation_Mgs;
	
	@AndroidFindBy(xpath = "//*[@text='Yes']")
	WebElement Logout_Yes_Btn;



	@AndroidFindBy(xpath = "//*[@text='No']")
	WebElement Logout_No_Btn;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]")
	WebElement Navigation_Confirm_No_Btn;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
	WebElement Navigation_Confirm_Yes_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='Log Off']")
	public
	WebElement LogOff_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='POS']")
	WebElement Operation_POS_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='Close']")
	WebElement deviecs_Close_Btn;


	
	public void sync_Checks() throws Throwable {
		lp = new Login_Page();
		cm = new Common_xpath();
		
		isEleEnabled(Pin_Screen_Sync_Checks(), "Sync Checks");
		click_Ele(Pin_Screen_Sync_Checks());
		Thread.sleep(2000);
	}
	
	public void Sync() throws Throwable {
		lp = new Login_Page();
		cm = new Common_xpath();
		
		isEleEnabled(Pin_Screen_Sync(), "Sync");
		click_Ele(Pin_Screen_Sync());
		Thread.sleep(2000);
	}
	
	public void clock_In() throws Throwable {
		lp = new Login_Page();
		cm = new Common_xpath();
		
		isEleEnabled(Pin_Screen_Clock_IN(), "Clock In");
		click_Ele(Pin_Screen_Clock_IN());
		lp.EnterPin_Popup(Pin_Screen_Clock_IN(),"ClockIn");
		lp.EnterPin_Again(Pin_Screen_Clock_IN());
		lp.message_Confirmation("Clocked In Successfully");

	}
	
	public void clock_Out() throws Throwable {
		lp = new Login_Page();
		cm = new Common_xpath();
		
		isEleEnabled(Pin_Screen_Clock_Out(), "Clock Out");
		click_Ele(Pin_Screen_Clock_Out());
		lp.EnterPin_Popup(Pin_Screen_Clock_Out(),"Clock Out");
		lp.EnterPin_Again(Pin_Screen_Clock_Out());
		lp.message_Confirmation("Clocked Out Successfully");

	}
	
	public void backOffice() {
		lp = new Login_Page();
		cm = new Common_xpath();
		
//		click_Ele(Pin_Screen_BackOffice());
//		click_Ele(Navigation_Confirm_No_Btn);

	}
	
	public void operation() throws Throwable {
		lp = new Login_Page();
		cm = new Common_xpath();
		
		isEleEnabled(Pin_Screen_Operations(), "Operation");
		click_Ele(Pin_Screen_Operations());
		lp.EnterPin_Popup(Pin_Screen_Operations(),"Operation");
		click_Ele(Operation_POS_Btn);
		click_Ele(LogOff_Btn);

	}
	
	public void devices() throws Throwable {
		lp = new Login_Page();
		cm = new Common_xpath();
		
		isEleEnabled(Pin_Screen_Devices(), "Devices");
		click_Ele(Pin_Screen_Devices());
		text_Confirm(Pin_Screen_Connected_Devices, "Connected Devices");
		click_Ele(deviecs_Close_Btn);
		Thread.sleep(1000);

	}
	
	
	public void Pin_Screen_Validations() throws Throwable {
		lp = new Login_Page();
		cm = new Common_xpath();
		
		Thread.sleep(2000);
		text_Confirm(Pin_Screen_Store_Name(), Utility.getProperty("Store_Name"));
		text_Confirm_without_Screenshot(Pin_Screen_pinEntry_text(), "To login enter your ID number");
		sync_Checks();
		Sync();
		clock_In();
		clock_Out();
		backOffice();
		operation();
		devices();
		
	}

	public void Pin_Screen_Validations_BackOffice() throws Throwable {
		lp = new Login_Page();
		cm = new Common_xpath();
		ut = new Utility();

		text_Confirm(Pin_Screen_Store_Name(), Utility.getProperty("Store_Name"));
		text_Confirm_without_Screenshot(Pin_Screen_pinEntry_text(), "Enter PIN, Swipe Card Or Use Face ID");//To login enter your ID number or swipe the card
		try {
			if(Pin_Screen_BackOffice().isDisplayed()) {
				test.log(LogStatus.PASS, "Back Office button is displayed");

				ut.PassedCaptureScreenshotAsBASE64(driver, test);
			}

		}catch(Exception e) {
			test.log(LogStatus.PASS, "Back Office button is not displayed");
			ut.FailedCaptureScreenshotAsBASE64(driver, test);
		}
	}

	public void Pin_Screen_Validations_Operation() throws Throwable {
		lp = new Login_Page();
		cm = new Common_xpath();
		ut = new Utility();

		try {
			if(Pin_Screen_Operations.isDisplayed()) {
				test.log(LogStatus.PASS, "Operation button is displayed");

			}

		}catch(Exception e) {
			test.log(LogStatus.PASS, "Operation button is not displayed");
			ut.FailedCaptureScreenshotAsBASE64(driver, test);
		}
	}

	public void Pin_Screen_Validations_ClockIn() throws Throwable {
		lp = new Login_Page();
		cm = new Common_xpath();
		ut = new Utility();

		try {
			if(Pin_Screen_Clock_IN.isDisplayed()) {
				test.log(LogStatus.PASS, "Clock In button is displayed");

			}

		}catch(Exception e) {
			test.log(LogStatus.PASS, "Clock In is not displayed");
			ut.FailedCaptureScreenshotAsBASE64(driver, test);
		}
	}

	public void Pin_Screen_Validations_ClockOut() throws Throwable {
		lp = new Login_Page();
		cm = new Common_xpath();
		ut = new Utility();

		try {
			if(Pin_Screen_Clock_Out.isDisplayed()) {
				test.log(LogStatus.PASS, "Clock Out button is displayed");

			}

		}catch(Exception e) {
			test.log(LogStatus.PASS, "Clock Out is not displayed");
			ut.FailedCaptureScreenshotAsBASE64(driver, test);
		}
	}

	public void Pin_Screen_Validations_Sync() throws Throwable {
		lp = new Login_Page();
		cm = new Common_xpath();
		ut = new Utility();

		try {
			if(Pin_Screen_Sync.isDisplayed()) {
				test.log(LogStatus.PASS, "Sync button is displayed");

			}

		}catch(Exception e) {
			test.log(LogStatus.PASS, "Sync button is not displayed");
			ut.FailedCaptureScreenshotAsBASE64(driver, test);
		}
	}

	public void Pin_Screen_Validations_SyncReceipts() throws Throwable {
		lp = new Login_Page();
		cm = new Common_xpath();
		ut = new Utility();

		try {
			if(Pin_Screen_Sync_Receipts.isDisplayed()) {
				test.log(LogStatus.PASS, "Sync Receipts button is displayed");

			}

		}catch(Exception e) {
			test.log(LogStatus.PASS, "Sync Receipts button is not displayed");
			ut.FailedCaptureScreenshotAsBASE64(driver, test);
		}
	}

	public void Pin_Screen_Validations_Devices() throws Throwable {
		lp = new Login_Page();
		cm = new Common_xpath();
		ut = new Utility();

		try {
			if(Pin_Screen_Devices.isDisplayed()) {
				test.log(LogStatus.PASS, "Devices button is displayed");

			}

		}catch(Exception e) {
			test.log(LogStatus.PASS, "Devices button is not displayed");
			ut.FailedCaptureScreenshotAsBASE64(driver, test);
		}
	}

	public void Pin_Screen_Validations_LowStockItems() throws Throwable {
		lp = new Login_Page();
		cm = new Common_xpath();
		ut = new Utility();

		try {
			if(Pin_Screen_LowStockItems.isDisplayed()) {
				test.log(LogStatus.PASS, "Low Stocks Items button is displayed");

			}

		}catch(Exception e) {
			test.log(LogStatus.PASS, "Low Stocks Items button is not displayed");
			ut.FailedCaptureScreenshotAsBASE64(driver, test);
		}
	}

	public void Pin_Screen_Validations_SignOut() throws Throwable {
		lp = new Login_Page();
		cm = new Common_xpath();
		ut = new Utility();

		try {
			if(Pin_Screen_SignOut.isDisplayed()) {
				test.log(LogStatus.PASS, "Sign Out button is displayed");
			}

		}catch(Exception e) {
			test.log(LogStatus.PASS, "Sign Out button is not displayed");
			ut.FailedCaptureScreenshotAsBASE64(driver, test);
		}
	}


	public WebElement Pin_SCreen_SignOut_Btn() {
		return Pin_Screen_SignOut_Btn;
	}
}
