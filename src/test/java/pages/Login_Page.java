package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class Login_Page extends Appium_Base_Class {
	
//	public AppiumDriver driver;
//	public ExtentTest test;
//	Appium_Base_Class base;
	RetailPOS_Order_Page Rop;
    
    Common_xpath cm;
    public Pin_Screen_Page psp;
    
	
//	public Login_Page(AppiumDriver driver)
//	{
//		this.driver= driver;
//		PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
//	}
	
	
	@AndroidFindBy(xpath = "//*[@text='steps.Login']")
	WebElement pinscreen_Login_Btn;
	
	@AndroidFindBy(id = "pin-display")
	WebElement pinscreen_PinDisplay;
	
	@AndroidFindBy(xpath = "//*[@text='Store Login']")
	WebElement Signin_StoreLogin_text;
	
	@AndroidFindBy(xpath = "//android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
	WebElement Signin_Page_Username;

	public WebElement Signin_Page_Username() {
		return Signin_Page_Username;
	}

	public WebElement Signin_Page_Password() {
		return Signin_Page_Password;
	}

	public WebElement Signin_Page_Login_Btn() {
		return Signin_Page_Login_Btn;
	}

	@AndroidFindBy(xpath = "//android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
	WebElement Signin_Page_Password;
	
	@AndroidFindBy(xpath = "//*[@text='Login']")
	WebElement Signin_Page_Login_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='Forgot Password']")
	WebElement Signin_Page_forgotpws;
	
	@AndroidFindBy(xpath = "//*[@text='Forgot Password']")
	WebElement Signin_Page_forgotpws_Btn;

	@AndroidFindBy(xpath = "//*[@text='Signed In Successfully']")
	WebElement Signin_Successfully;

	public void Signin_Valid_Cred() throws Exception {
		
		cm = new Common_xpath();
		Thread.sleep(4000);

		try {
			if (driver.findElement(By.xpath("//*[@text,'While using the app']")).isDisplayed()){
				driver.findElement(By.xpath("//*[@text,'While using the app']")).click();
			}
		}catch (Exception ignored){
		}

		text_Confirm(Signin_StoreLogin_text, "Store Login");
		try {
		text_Confirm_without_Screenshot(Signin_Page_forgotpws, "Forget Password");
		}catch (Exception ignored) {
		}
		send_data(Signin_Page_Username(), Utility.getProperty("Username"));
//		driver.hideKeyboard();
		send_data(Signin_Page_Password(), Utility.getProperty("Password"));
//		driver.hideKeyboard();
		click_Ele(Signin_Page_Login_Btn());
//		explicit_Wait(cm.Pin_SCreen_Msg_popup);
//		Thread.sleep(4000);
//		text_Confirm(Signin_Successfully, "Signed In Successfully");
		Thread.sleep(20000);
		System.err.println("User Signed In Successfully");
	}
	
	public void enterpin() throws Throwable {
		
		Rop = new RetailPOS_Order_Page();
		cm = new Common_xpath();
		click_Ele(cm.pin_popup_Clear_Btn2);
		click_Ele(cm.pin_popup_NO_One);
		click_Ele(cm.pin_popup_NO_Two);
		click_Ele(cm.pin_popup_NO_Three);
		click_Ele(cm.pin_popup_NO_Four);
		click_Ele(Signin_Page_Login_Btn());
		Thread.sleep(2000);
		try {
			if (cm.Select_Role_popup.isDisplayed()) {
				
				click_Ele(cm.Select_Role_popup_Admin());
				Thread.sleep(1000);
				click_Ele(cm.Select_Role_popup_Ok_Btn);
				Thread.sleep(2000);
				
			} 
			}catch (Exception e) {
			}
		Thread.sleep(2000);
		//click_Ele(Rop.Order_Screen_LogOff);

	}
	
	
	public void PinEntery_Login() throws Throwable {
		
		Rop = new RetailPOS_Order_Page();
		cm = new Common_xpath();
		
		click_Ele(cm.pin_popup_Clear_Btn2);
		click_Ele(cm.pin_popup_NO_One);
		click_Ele(cm.pin_popup_NO_Two);
		click_Ele(cm.pin_popup_NO_Three);
		click_Ele(cm.pin_popup_NO_Four);
		click_Ele(Signin_Page_Login_Btn());
		
		Thread.sleep(2000);
		try {
			if (cm.Select_Role_popup.isDisplayed()) {
				
				click_Ele(cm.Select_Role_popup_Admin());
				Thread.sleep(1000);
				click_Ele(cm.Select_Role_popup_Ok_Btn);
				Thread.sleep(2000);
				
			} 
			}catch (Exception e) {
			}
		Thread.sleep(5000);
		
		try {
			if(Rop.getOrder_Screen_OperationsBtn().isDisplayed()) {
				test.log(LogStatus.PASS, "User Logged in Successfully");
			}
			
		}catch(Exception e) {
			test.log(LogStatus.FAIL, "User Logged in Fail");
		}
	}
	
	
	public void SignOut() throws Throwable {
		
		
		psp = new Pin_Screen_Page();
		cm = new Common_xpath();
		click_Ele(psp.Pin_SCreen_SignOut_Btn());
		Thread.sleep(1000);
		text_Confirm(psp.Logout_Confirmation_Mgs(), "Do you want to Logout?");
		Thread.sleep(1000);
		click_Ele(psp.Logout_No_Btn());
		Thread.sleep(1000);
		click_Ele(psp.Pin_SCreen_SignOut_Btn());
		Thread.sleep(1000);
		click_Ele(psp.Logout_Yes_Btn());
		Thread.sleep(1000);
		EnterPin_Popup(psp.Pin_SCreen_SignOut_Btn(),"Sign Out");
		
	}
	
	public void EnterPin_Again(WebElement ele) throws Throwable {
		
		psp = new Pin_Screen_Page();
		cm = new Common_xpath();
		Thread.sleep(1000);
		click_Ele(ele);
		Thread.sleep(1000);
		click_Ele(cm.pin_popup_NO_One);
		click_Ele(cm.pin_popup_NO_Two);
		click_Ele(cm.pin_popup_NO_Three);
		click_Ele(cm.pin_popup_NO_Four);
		click_Ele(cm.pin_popup_Continue_Btn);

	}
	
	public void EnterPin_Popup(WebElement ele, String text) throws Throwable {
		
		psp = new Pin_Screen_Page();
		cm = new Common_xpath();
		
		Thread.sleep(2000);
		text_Confirm(cm.pin_popup_Header_Text, "text");
		Thread.sleep(1000);
		click_Ele(cm.pin_popup_NO_One);
		click_Ele(cm.pin_popup_NO_Two);
		click_Ele(cm.pin_popup_NO_Three);
		click_Ele(cm.pin_popup_NO_Four);
		click_Ele(cm.pin_popup_Clear_Btn);
		send_data(cm.pin_popup_enterpin_inoutbox, Utility.getProperty("UserPin"));
		for (int i = 0; i < 4; i++) {
			click_Ele(cm.pin_popup_Delete_Btn);
		}
		Thread.sleep(1000);
		click_Ele(cm.pin_popup_Close_Btn);
		Thread.sleep(1000);
		click_Ele(ele);
		Thread.sleep(1000);
		click_Ele(cm.pin_popup_NO_One);
		click_Ele(cm.pin_popup_NO_Two);
		click_Ele(cm.pin_popup_NO_Three);
		click_Ele(cm.pin_popup_NO_Four);
		click_Ele(cm.pin_popup_Continue_Btn);
		Thread.sleep(2000);
		try {
		if (((WebElement) cm.Select_Role_popup).isDisplayed()) {
			
			click_Ele(cm.Select_Firstrole_IN_Role_popup);
			Thread.sleep(1000);
			click_Ele(cm.Select_Role_popup_Ok_Btn);
			Thread.sleep(2000);
			
		} 
		}catch (Exception e) {
		}
	}
	
	public void message_Confirmation(String text) {
		
		psp = new Pin_Screen_Page();
		cm = new Common_xpath();
		
//		explicit_Wait(driver, cm.Pin_SCreen_Msg_popup);
		text_Confirm(cm.Pin_SCreen_Msg_popup, text);

	}
	

}
