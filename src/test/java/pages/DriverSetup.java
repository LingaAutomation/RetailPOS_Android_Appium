package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.URL;

public class DriverSetup {

    public AppiumDriver driver;
    public void initializeSetup() throws Exception {
//        UiAutomator2Options cap = new UiAutomator2Options();

		UiAutomator2Options cap = new UiAutomator2Options();
//////		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setDeviceName("Linga's Tab A");
		cap.setUdid("R52M80B1BTH");
		cap.setAppPackage("com.benseron.cloudretail");
		cap.setAppActivity("com.benseron.cloudretail.MainActivity");
		driver = new AppiumDriver(new URL("http://0.0.0.0:4723/"),cap);

//		DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability("platformName", Utility.getProperty("platformName1"));
//		cap.setCapability("platformVersion", Utility.getProperty("platformVersion1"));
//		cap.setCapability("automationName", "UiAutomator2");
//		cap.setCapability("udid", Utility.getProperty("udid1"));
//		cap.setCapability("deviceName", Utility.getProperty("deviceName1"));
//		System.out.println(Utility.getProperty("Cloud_packageName1"));
//		cap.setCapability("packageName", Utility.getProperty("Cloud_packageName1"));
//		cap.setCapability("appActivity", Utility.getProperty("Cloud_appActivity1"));
////        cap.setUdid("R52M80B1BTH");
////        cap.setAppPackage("com.benseron.cloudretail");
////        cap.setAppActivity("com.benseron.cloudretail.MainActivity");
//        driver = new AppiumDriver(new URL("http://0.0.0.0:4723/"),cap);
//		cap.setCapability("appPackage",Utility.getProperty("Cloud_packageName1"));
//		Thread.sleep(5000);


//		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability("platformName", Utility.getProperty("platformName"));
//		cap.setCapability("platformVersion", Utility.getProperty("platformVersion"));
//		cap.setCapability("automationName", "UiAutomator2");
//		cap.setCapability("udid", Utility.getProperty("udid"));
//		cap.setCapability("deviceName", Utility.getProperty("deviceName"));
//		cap.setCapability("packageName", Utility.getProperty("Cloud_packageName1"));
//		cap.setCapability("appActivity", Utility.getProperty("Cloud_appActivity1"));
//		driver = new AppiumDriver(new URL(Utility.getProperty("Appium_URL")), cap);
//		// Open the Application
//		cap.setCapability("appPackage",Utility.getProperty("Cloud_packageName1"));
//		Thread.sleep(5000);
    }
}
