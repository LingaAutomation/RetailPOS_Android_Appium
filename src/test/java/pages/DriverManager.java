package pages;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import steps.Hooks;
import utility.ExtentManager;
import utility.Utility;

import java.io.IOException;
import java.net.URL;

public class DriverManager {

    Utility utils = new Utility();
    public static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
    public static ExtentReports rep= ExtentManager.getInstance();//=ExtentManager.getInstance();
    public static ExtentTest test=rep.startTest("Test Started...!"+ Hooks.FeatureNameText());//=rep.startTest("Test Started...!"+Hooks.FeatureName.toString());


    public AppiumDriver getDriver(){
        return driver.get();
    }

    public ExtentTest getTest()
    {
        return test;
    }

    public void setDriver(AppiumDriver driver2){
        driver.set(driver2);
    }

    public void initializeDriver() throws Exception {
        AppiumDriver driver = null;

        if(driver == null){
            try{
                System.out.println("Initializing The Driver");

                UiAutomator2Options cap = new UiAutomator2Options();
                ////		DesiredCapabilities cap = new DesiredCapabilities();
                cap.setDeviceName(Utility.getProperty("deviceName"));
                cap.setUdid(Utility.getProperty("udid"));
                cap.setAppPackage(Utility.getProperty("packageName"));
                cap.setAppActivity(Utility.getProperty("appActivity"));
                cap.autoGrantPermissions();
               // cap.setCapability(MobileCapabilityType.NO_RESET,false);
                driver = new AppiumDriver(new URL("http://0.0.0.0:4723/"),cap);


//                DesiredCapabilities cap = new DesiredCapabilities();
//                cap.setCapability("platformName", Utility.getProperty("platformName1"));
//                cap.setCapability("automationName", "UiAutomator2");
//                cap.setCapability("platformVersion", Utility.getProperty("platformVersion1"));
//                cap.setCapability("udid", Utility.getProperty("udid"));
//                cap.setCapability("deviceName", Utility.getProperty("deviceName"));
//                System.out.println(Utility.getProperty("packageName"));
//                cap.setCapability("packageName", Utility.getProperty("packageName"));
//                cap.setCapability("appActivity", Utility.getProperty("appActivity"));
//                driver = new AppiumDriver(new URL(Utility.getProperty("Appium_URL")), cap);
//                // Open the Application
//                cap.setCapability("appPackage",Utility.getProperty("packageName"));

                Thread.sleep(5000);

                if(driver == null){
                    throw new Exception("driver is null. ABORT!!!");
                }
                System.err.println("Driver is Initialized...!");
                DriverManager.driver.set(driver);

                Thread.sleep(10000);

//                Thread.sleep(10000);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Driver Initiazation Failed...!"+e.toString());
                throw e;
            }
        }

    }

    public ExtentTest Genarate_ExtentReport(String ReportDetails)
    {
        getRep();
        return test = rep.startTest(ReportDetails);
    }

    public ExtentReports getRep()
    {
        return rep=ExtentManager.getInstance();
    }

}
