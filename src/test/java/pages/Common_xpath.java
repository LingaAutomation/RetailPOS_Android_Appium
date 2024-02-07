package pages;

import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Common_xpath extends Appium_Base_Class {
	
	
//	public AppiumDriver driver;
//	public ExtentTest test;
	
//	public Common_xpath(AppiumDriver driver)
//	{
//		this.driver= driver;
//
//		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(30)), this);
//	}

	
	@AndroidFindBy(xpath = "//android.app.Dialog/android.view.View[1]/android.widget.TextView")
	WebElement pin_popup_Header_Text;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.widget.TextView")
	WebElement AlertPopUpMsg;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.widget.TextView")
	WebElement Pin_SCreen_Msg_popup;

	@AndroidFindBy(className = "android.widget.Image")
	WebElement pin_popup_Close_Btn;
	
//	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.app.Dialog/android.view.View[1]/android.view.View/android.view.View/android.widget.Image")
//	WebElement pin_popup_Close_Btn;
	
	@AndroidFindBy(xpath = "//android.view.View/android.view.View/android.app.Dialog/android.widget.EditText")
	WebElement pin_popup_enterpin_inoutbox;
	
	@AndroidFindBy(xpath = "//*[@text='1']")
	WebElement pin_popup_NO_One;
	
	@AndroidFindBy(xpath = "//*[@text='2']")
	WebElement pin_popup_NO_Two;
	
	@AndroidFindBy(xpath = "//*[@text='3']")
	WebElement pin_popup_NO_Three;
	
	@AndroidFindBy(xpath = "//*[@text='4']")
	WebElement pin_popup_NO_Four;
	
	@AndroidFindBy(xpath = "//*[@text='5']")
	WebElement pin_popup_NO_Five;
	
	@AndroidFindBy(xpath = "//*[@text='6']")
	WebElement pin_popup_NO_Six;
	
	@AndroidFindBy(xpath = "//*[@text='7']")
	WebElement pin_popup_NO_Seven;
	
	@AndroidFindBy(xpath = "//*[@text='8']")
	WebElement pin_popup_NO_Eight;
	
	@AndroidFindBy(xpath = "//*[@text='9']")
	WebElement pin_popup_NO_Nine;
	
	@AndroidFindBy(xpath = "//*[@text='C']")
	WebElement pin_popup_Clear_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='Clear']")
	WebElement pin_popup_Clear_Btn2;
	
	@AndroidFindBy(xpath = "//*[@text='0']")
	WebElement pin_popup_NO_Zero;
	
	@AndroidFindBy(xpath = "//android.app.Dialog/android.view.View[13]/android.widget.Button")
	WebElement pin_popup_Delete_Btn;
	
	@AndroidFindBy(xpath = "//android.view.View[2]/android.view.View[12]/android.widget.Button")
	WebElement Login_Screen_Delete_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='Continue']")
	WebElement pin_popup_Continue_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='Select Role']")
	WebElement Select_Role_popup;
	
	public WebElement Select_Role_popup() {
		return Select_Role_popup;
	}
	
	@AndroidFindBy(xpath = "//*[@text='Admin']")
	WebElement Select_Role_popup_Admin;
	
	public WebElement Select_Role_popup_Admin() {
		return Select_Role_popup_Admin;
	}


	@AndroidFindBy(xpath = "//*[@text='Admin']")
	WebElement Select_Firstrole_IN_Role_popup;
	
	@AndroidFindBy(xpath = "//*[@text='OK']")
	WebElement Select_Role_popup_Ok_Btn;
	
	@AndroidFindBy(xpath = "//*[@text='Cancel']")
	WebElement Select_Role_popup_Cancel_Btn;
	
	
	
}
