package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Item_Selection_Page extends Appium_Base_Class{

    Common_xpath cm = new Common_xpath();

    @AndroidFindBy(xpath = "//*[contains(@text,'CANCEL')]")
    WebElement Menu_Screen_Category_Cancel_Btn;

    @AndroidFindBy(xpath = "//android.view.View//*[contains(@text,'For Taxes')]")
    WebElement Order_Screen_Category_ForTaxes;

    @AndroidFindBy(xpath = "//android.view.View//*[contains(@text,'Upcharge_Category')]")
    WebElement Order_Screen_Category_Upcharge;

    @AndroidFindBy(xpath = "//android.view.View//*[contains(@text,'TOIT_Standard')]")
    WebElement Order_Screen_Category_TOIT_Standard;

    @AndroidFindBy(xpath = "//android.view.View//*[contains(@text,'TOIT_Variant')]")
    WebElement Order_Screen_Category_TOIT_Variant;

    @AndroidFindBy(xpath = "//android.view.View//*[contains(@text,'TOIT_KitAssembly')]")
    WebElement Order_Screen_Category_TOIT_KitAssembly;

    @AndroidFindBy(xpath = "//android.view.View//*[contains(@text,'CBT_Standard')]")
    WebElement Order_Screen_Category_CBT_Standard;

    @AndroidFindBy(xpath = "//android.view.View//*[contains(@text,'CBT_Variant')]")
    WebElement Order_Screen_Category_CBT_Variant;

    @AndroidFindBy(xpath = "//android.view.View//*[contains(@text,'CBT_KitAssembly')]")
    WebElement Order_Screen_Category_CBT_KitAssembly;

    @AndroidFindBy(xpath = "//*[contains(@text,'QBT_Standard')]")
    WebElement Order_Screen_Category_QBT_Standard;

    @AndroidFindBy(xpath = "//*[contains(@text,'QBT_Variant')]")
    WebElement Order_Screen_Category_QBT_Variant;

    @AndroidFindBy(xpath = "//*[contains(@text,'QBT_KitAssembly')]")
    WebElement Order_Screen_Category_QBT_KitAssembly;

    @AndroidFindBy(xpath = "//*[contains(@text,'ITS_Standard')]")
    WebElement Order_Screen_Category_ITS_Standard;

    @AndroidFindBy(xpath = "//*[contains(@text,'ITS_Variant')]")
    WebElement Order_Screen_Category_ITS_Variant;

    @AndroidFindBy(xpath = "//*[contains(@text,'ITS_KitAssembly')]")
    WebElement Order_Screen_Category_ITS_KitAssembly;

    @AndroidFindBy(xpath = "//*[contains(@text,'Exclusive_Inclusive_Stand')]")
    WebElement Order_Screen_Category_Exclusive_Inclusive_Standard;

    @AndroidFindBy(xpath = "//*[contains(@text,'Exclusive_Inclusive_Varia')]")
    WebElement Order_Screen_Category_Exclusive_Inclusive_Variant;

    @AndroidFindBy(xpath = "//*[contains(@text,'Exclusive_Inclusive_KitAs')]")
    WebElement Order_Screen_Category_Exclusive_Inclusive_KitAssembly;

    @AndroidFindBy(xpath = "//*[contains(@text,'Standard Item')]")//android.view.View//*[contains(@text,'Standard Item')]
    WebElement Order_Screen_Category_StandardItem;

    @AndroidFindBy(xpath = "//android.view.View//*[contains(@text,'ITS_Category')]")
    WebElement Order_Screen_Category_ITS_Category;

    @AndroidFindBy(xpath = "//android.view.View//*[contains(@text,'Variant Item')]")//android.view.View//*[contains(@text,'Variant Item')]
    WebElement Order_Screen_Category_VariantItem;

    @AndroidFindBy(xpath = "//android.view.View//*[contains(@text,'Kit Accessible Item Cat')]")
    WebElement Order_Screen_Category_Kit_Accessible_Item_Cat;

    @AndroidFindBy(xpath = "//*[@resource-id='react-ordder-list-render']/android.view.View/android.widget.TextView[4]")
    WebElement Order_Screen_MenuItem_Count_Btn;

    @AndroidFindBy(xpath = "//*[@text='Cash']")
    WebElement Order_Screen_CashBtn;

    @AndroidFindBy(xpath = "//*[@text='Exact']")
    WebElement Cash_Screen_ExactBtn;

    @AndroidFindBy(xpath = "//*[@text='Enter']")
    WebElement Cash_Screen_EnterBtn;

    @AndroidFindBy(xpath = "//*[contains(@text,'Search Customer')]/../../android.view.View/android.widget.Button[@text='1']")
    WebElement Order_Screen_NumberPad_1;

    @AndroidFindBy(xpath = "//*[contains(@text,'Search Customer')]/../../android.view.View/android.widget.Button[@text='2']")
    WebElement Order_Screen_NumberPad_2;

    @AndroidFindBy(xpath = "//*[contains(@text,'Search Customer')]/../../android.view.View/android.widget.Button[@text='3']")
    WebElement Order_Screen_NumberPad_3;

    @AndroidFindBy(xpath = "//*[contains(@text,'Search Customer')]/../../android.view.View/android.widget.Button[@text='C']")
    WebElement Order_Screen_NumberPad_Clear;

    @AndroidFindBy(xpath = "//android.view.View//*[contains(@text,'Up_Standard')]")
    WebElement Order_Screen_Category_Upcharge_Standard;

    @AndroidFindBy(xpath = "//android.view.View//*[contains(@text,'Up_Variant')]")
    WebElement Order_Screen_Category_Upcharge_Variant;

    @AndroidFindBy(xpath = "//android.view.View//*[contains(@text,'Up_KitAssembly')]")
    WebElement Order_Screen_Category_Upcharge_KitAssembly;

    @AndroidFindBy(xpath = "//android.view.View//*[contains(@text,'Up_OpenItem')]")
    WebElement Order_Screen_Category_Upcharge_OpenItem;

    public void making_more_Items_Standard(String numbers) throws Throwable {

        int number = Integer.parseInt(numbers);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_StandardItem);
        Thread.sleep(2000);
        for(int i = 1; i <= number; i++) {
            Single_Random_Menu_Selection_Standard();
        }
        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
    }

    public void making_more_Items_Variant(String numbers) throws Throwable {

        int number = Integer.parseInt(numbers);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_VariantItem);
        Thread.sleep(2000);
        for(int i = 1; i <= number; i++) {
            Single_Random_Menu_Selection_Variant1();
        }

        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
    }

    public void making_more_Items_KitAssembly(String numbers) throws Throwable {

        int number = Integer.parseInt(numbers);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_Kit_Accessible_Item_Cat);
        Thread.sleep(2000);
        for(int i = 1; i <= number; i++) {
            Single_Random_Menu_SelectionFor_KitAssembly1();
        }

        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
    }

    public void Single_Random_Menu_Selection(String item) throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_StandardItem);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='"+item+"']")).click();
        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void Single_Random_Menu_Selection() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_StandardItem);
        Thread.sleep(2000);
        Random_Selection(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void multipleMenu_Selection_Random() throws Throwable {
        Thread.sleep(4000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_StandardItem);
        Thread.sleep(2000);
        Random_ForMultipule_Selection(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(1000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);

    }

    public void multipleMenu_Selection_Random_Variant() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_VariantItem);
        Thread.sleep(2000);
        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(2000);
        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(2000);
        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void Single_Random_Menu_Selection_Standard() throws Throwable {

        Random_Selection1(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(1000);
    }

    public void Single_Random_Menu_Selection_Variant1() throws Throwable {
        Random_Selection(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(1000);
    }
    public void Single_Random_Menu_Selection_Variant() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_VariantItem);
        Thread.sleep(2000);
        Random_Selection(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void Single_Random_Menu_SelectionFor_VariantItem() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_VariantItem);
        Thread.sleep(2000);
        Random_Selection(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(1000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void Single_Random_Menu_SelectionFor_KitAssembly1() throws Throwable {
        Random_Selection(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(1000);
    }

    public void Single_Random_Menu_SelectionFor_KitAssembly() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_Kit_Accessible_Item_Cat);
        Thread.sleep(2000);
        Random_Selection(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(1000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void multipleMenu_Selection_Random_Kit_Accessible() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_Kit_Accessible_Item_Cat);
        Thread.sleep(2000);
        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(1000);
        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(1000);
        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(1000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void Single_Random_Menu_Selection_TOIT_Standard() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ForTaxes);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_TOIT_Standard);
        Thread.sleep(1000);
        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void Single_Random_Menu_Selection_TOIT_Variant() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ForTaxes);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_TOIT_Variant);
        Thread.sleep(1000);
        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(1000);
        selectOptions();
        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void Single_Random_Menu_Selection_TOIT_KitAssembly() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ForTaxes);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_TOIT_KitAssembly);
        Thread.sleep(1000);
        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(1000);
        selectOptions();
        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void Multiple_Random_Menu_Selection_TOIT_Standard() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ForTaxes);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_TOIT_Standard);
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

    public void Multiple_Random_Menu_Selection_TOIT_Variant() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ForTaxes);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_TOIT_Variant);
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

    public void Multiple_Random_Menu_Selection_TOIT_KitAssembly() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ForTaxes);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_TOIT_KitAssembly);
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

    public void Single_Random_Menu_Selection_ForQBTaxes_Standard() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ForTaxes);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_QBT_Standard);
        Thread.sleep(2000);
        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void Single_Random_Menu_Selection_ForQBTaxes_Variant() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ForTaxes);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_QBT_Variant);
        Thread.sleep(1000);
        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(1000);
        selectOptions();
        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void Single_Random_Menu_Selection_ForQBTaxes_KitAssembly() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ForTaxes);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_QBT_KitAssembly);
        Thread.sleep(1000);
        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(1000);
        selectOptions();
        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void Multiple_Random_Menu_Selection_ForQBTaxes_Standard() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ForTaxes);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_QBT_Standard);
        Thread.sleep(2000);
        Random_ForMultipule_Selection(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(1000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
//        Thread.sleep(1000);
//        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
//        Thread.sleep(2000);
//        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
//        Thread.sleep(2000);
//        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
//        Thread.sleep(2000);
//        click_Ele(Menu_Screen_Category_Cancel_Btn);
//        Thread.sleep(1000);
    }

    public void Multiple_Random_Menu_Selection_ForQBTaxes_Variant() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ForTaxes);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_QBT_Variant);
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

    public void Multiple_Random_Menu_Selection_ForQBTaxes_KitAssembly() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ForTaxes);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_QBT_KitAssembly);
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

    public void Single_Random_Menu_Selection_ForExclusive_InclusiveTaxes_Standard() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ForTaxes);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_Exclusive_Inclusive_Standard);
        Thread.sleep(1000);
        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void Single_Random_Menu_Selection_ForExclusive_InclusiveTaxes_Variant() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ForTaxes);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_Exclusive_Inclusive_Variant);
        Thread.sleep(1000);
        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(1000);
        selectOptions();
        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void Single_Random_Menu_Selection_ForExclusive_InclusiveTaxes_KitAssembly() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ForTaxes);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_Exclusive_Inclusive_KitAssembly);
        Thread.sleep(1000);
        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(1000);
        selectOptions();
        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void multipleMenu_Selection_Random_Exclusive_Inclusive_Standard() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ForTaxes);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_Exclusive_Inclusive_Standard);
        Thread.sleep(1000);
        Random_ForMultipule_Selection(driver, "//*[contains(@resource-id,'menu-item')]");
//        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");ds
//        Thread.sleep(2000);
//        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
//        Thread.sleep(2000);
//        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void multipleMenu_Selection_Random_Exclusive_Inclusive_Variant() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ForTaxes);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_Exclusive_Inclusive_Variant);
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

    public void multipleMenu_Selection_Random_Exclusive_Inclusive_KitAssembly() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ForTaxes);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_Exclusive_Inclusive_KitAssembly);
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

    public void OrderScreen_NumberPad() throws Throwable {
        Common_xpath cm = new Common_xpath();

        multipleMenu_Selection_Random();
        Random_Selection(driver, "//*[@resource-id='react-ordder-list-render']/android.view.View/android.widget.TextView[1]");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_NumberPad_1);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_NumberPad_2);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_NumberPad_3);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_NumberPad_Clear);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_MenuItem_Count_Btn);
        Thread.sleep(2000);
        click_Ele(cm.pin_popup_Clear_Btn);
        click_Ele(cm.pin_popup_NO_One);
        click_Ele(cm.pin_popup_NO_Two);
        click_Ele(cm.pin_popup_Delete_Btn);
        click_Ele(cm.pin_popup_NO_One);
        click_Ele(cm.pin_popup_NO_Two);
        click_Ele(cm.pin_popup_Continue_Btn);
        Thread.sleep(2000);
        text_Confirm_without_Screenshot((WebElement) driver.findElement(By.xpath("//*[@resource-id='react-ordder-list-render']/android.view.View/android.widget.TextView[1]")), "12");
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_MenuItem_Count_Btn);
        Thread.sleep(2000);
        click_Ele(cm.pin_popup_Clear_Btn);
        click_Ele(cm.pin_popup_NO_One);
        click_Ele(cm.pin_popup_Continue_Btn);
        Thread.sleep(2000);
        text_Confirm_without_Screenshot((WebElement) driver.findElement(By.xpath("//*[@resource-id='react-ordder-list-render']/android.view.View/android.widget.TextView[1]")), "1");

    }

    public void Single_Random_Menu_Selection_CBT_Standard() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ForTaxes);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_CBT_Standard);
        Thread.sleep(1000);
        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void Single_Random_Menu_Selection_CBT_Variant() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ForTaxes);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_CBT_Variant);
        Thread.sleep(1000);
        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(1000);
        selectOptions();
        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void Single_Random_Menu_Selection_CBT_KitAssembly() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ForTaxes);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_CBT_KitAssembly);
        Thread.sleep(1000);
        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(1000);
        selectOptions();
        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void Multiple_Random_Menu_Selection_CBT_Standard() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ForTaxes);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_CBT_Standard);
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

    public void Multiple_Random_Menu_Selection_CBT_Variant() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ForTaxes);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_CBT_Variant);
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

    public void Multiple_Random_Menu_Selection_CBT_KitAssembly() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ForTaxes);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_CBT_KitAssembly);
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

    public void Single_Random_Menu_Selection_Upcharge_Standard() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_Upcharge);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_Upcharge_Standard);
        Thread.sleep(2000);
        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void Single_Random_Menu_Selection_Upcharge_Variant() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_Upcharge);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_Upcharge_Variant);
        Thread.sleep(1000);
        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(1000);
        selectOptions();
        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void Single_Random_Menu_Selection_Upcharge_KitAssembly() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_Upcharge);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_Upcharge_KitAssembly);
        Thread.sleep(1000);
        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(1000);
        selectOptions();
        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void Single_Random_Menu_Selection_Upcharge_OpenItem(String OpenItem) throws Throwable {
        cm = new Common_xpath();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_Upcharge);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_Upcharge_OpenItem);
        Thread.sleep(2000);
        //click the child item
        click_Ele(driver.findElement(By.xpath("//*[contains(@text,'Up_"+OpenItem+"1')]")));
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
    }

    public void Multiple_Random_Menu_Selection_Upcharge_Standard() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_Upcharge);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_Upcharge_Standard);
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

    public void Multiple_Random_Menu_Selection_Upcharge_Variant() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_Upcharge);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_Upcharge_Variant);
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

    public void Multiple_Random_Menu_Selection_Upcharge_KitAssembly() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_Upcharge);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_Upcharge_KitAssembly);
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

    public void Multiple_Random_Menu_Selection_Upcharge_OpenItem() throws Throwable {
        cm = new Common_xpath();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_Upcharge);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_Upcharge_OpenItem);
        Thread.sleep(3000);


        for(int i = 1; i <= 4; i++){
            //click the child item
            click_Ele(driver.findElement(By.xpath("//*[contains(@text,'Up_OpenItem"+i+"')]")));
            Thread.sleep(2000);

            //click the number 8
            click_Ele(cm.pin_popup_NO_Eight);

            //click the number 0
            click_Ele(cm.pin_popup_NO_Zero);

            //click the number 0
            click_Ele(cm.pin_popup_NO_Zero);

            //Click the continue button
            click_Ele(cm.pin_popup_Continue_Btn);
        }

        //click the cancel button
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void Single_Random_Menu_Selection_ITS_Standard() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ITS_Category);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ITS_Standard);
        Thread.sleep(1000);
        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void Single_Random_Menu_Selection_ITS_Variant() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ITS_Category);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ITS_Variant);
        Thread.sleep(1000);
        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(1000);
        selectOptions();
        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void Single_Random_Menu_Selection_ITS_KitAssembly() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ITS_Category);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ITS_KitAssembly);
        Thread.sleep(1000);
        Random_Selection_KitAssembly(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(1000);
        selectOptions();
        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void Multiple_Random_Menu_Selection_ITS_Standard() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ITS_Category);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ITS_Standard);
        Thread.sleep(2000);
        Random_ForMultipule_Selection(driver, "//*[contains(@resource-id,'menu-item')]");
        Thread.sleep(2000);
        click_Ele(Menu_Screen_Category_Cancel_Btn);
        Thread.sleep(1000);
    }

    public void Multiple_Random_Menu_Selection_ITS_Variant() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ITS_Category);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_TOIT_Variant);
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

    public void Multiple_Random_Menu_Selection_ITS_KitAssembly() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ITS_Category);
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);click_Ele(Order_Screen_Category_ITS_KitAssembly);
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

}
