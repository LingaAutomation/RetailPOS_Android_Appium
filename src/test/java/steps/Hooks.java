package steps;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.*;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import pages.DriverManager;
import pages.Login_Page;
import pages.Pin_Screen_Page;

import java.util.List;

public class Hooks {

    public static AppiumDriver driver;
    public static String ScenarioName;
    public static String FeatureName;
    Pin_Screen_Page pin = new Pin_Screen_Page();


   @BeforeAll
    public static void beforeAll() throws Exception
    {

//        System.out.println("Before All Started...!");
//      //  Base_DriverManagerClass.setUpDriver();
//
//        new DriverManager().initializeDriver();
//
//        driver=new DriverManager().getDriver();
//        System.out.println("------------------------------------------------------------");
//        Thread.sleep(5000);
//
//        new Login_Page().Signin_Valid_Cred();
    }

    @Before
    public void Start_Scenario(Scenario scenario) throws Exception
    {
        pin = new Pin_Screen_Page();
        FeatureName= FilenameUtils.getBaseName(scenario.getUri().toString());

        DriverManager.test.log(LogStatus.INFO, FeatureName);


        System.out.println("Running Feature name : "+FeatureName);

        System.out.println("Before Hook Started...!");

        ScenarioName=scenario.getName();
        DriverManager.test.log(LogStatus.INFO, "    * * * * * * *    "+ScenarioName+"    * * * * * * *    ");


        if(driver==null)
        {
            new DriverManager().initializeDriver();
            driver=new DriverManager().getDriver();
            Thread.sleep(7000);
            new Login_Page().Signin_Valid_Cred();
        }
        try{
            Thread.sleep(4000);
            new Pin_Screen_Page().validateThePinScreenText();
       }catch (Exception e){
           // driver.quit();
            Thread.sleep(2000);
            new DriverManager().initializeDriver();
            driver=new DriverManager().getDriver();
            Thread.sleep(10000);

            new Login_Page().Signin_Valid_Cred();
        }



    }

    @After
    public void TestFail(Scenario scenario) throws Exception
    {
        System.out.println("After Started...!");

        if(scenario.isFailed())
        {
            Thread.sleep(2000);
            String scnsht=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);

            String s="data:image/png;base64,"+scnsht;

            DriverManager.test.log(LogStatus.FAIL, DriverManager.test.addScreenCapture(s));

            DriverManager.rep.endTest(DriverManager.test);
            DriverManager.rep.flush();
        }
    }

    @AfterAll
    public static void afterAll() throws Exception
    {
//	    	Feature feature = null;
//	    	String fullFeatureName = FilenameUtils.getName(scenario.getUri().toString());
//	    	String FeatureFileName=feature.getName();
        try
        {
            System.out.println("After All Started...!");
//	    	Base_DriverManagerClass.tearDown();

            Thread.sleep(10000);


            DriverManager.rep.endTest(DriverManager.test);
            DriverManager.rep.flush();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage()+"Report Generating...!");
            DriverManager.rep.endTest(DriverManager.test);
            DriverManager.rep.flush();
        }
    }







    public static String FeatureNameText()
    {
        return FeatureName;
    }
}
