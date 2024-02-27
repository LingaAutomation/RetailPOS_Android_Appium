package pages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Discount_Selection_Page extends Appium_Base_Class {
    RetailPOS_Order_Page rop;

    @AndroidFindBy(xpath = "//*[@text='Discount']")
    WebElement Order_Screen_DiscountBtn;

    @AndroidFindBy(xpath = "//*[@text='Cancel']")
    WebElement Order_Screen_CancelBtn;

    @AndroidFindBy(xpath = "//android.app.Dialog//android.widget.EditText")
    WebElement SearchBox_InDiscountScreen;

    @AndroidFindBy(xpath = "//*[@text='Subtotal']/../android.view.View/android.view.View/android.widget.TextView")
    WebElement Order_Screen_SubTotal_Value;

    @AndroidFindBy(xpath = "//*[@text='Discount']/../android.view.View/android.view.View/android.widget.TextView")
    WebElement Order_Screen_Discount_Value;

    @AndroidFindBy(xpath = "//*[@text='Tax']/../android.view.View/android.view.View/android.widget.TextView")
    WebElement Order_Screen_Tax_Value;

    @AndroidFindBy(xpath = "//*[@text='Total']/../android.view.View/android.view.View/android.widget.TextView")
    WebElement Order_Screen_Total_Value;

    public WebElement getOrder_Screen_DiscountBtn() {
        return Order_Screen_DiscountBtn;
    }

    public WebElement getOrder_Screen_Discount_Value() {
        return Order_Screen_Discount_Value;
    }

    public WebElement getOrder_Screen_SubTotal_Value() {
        return Order_Screen_SubTotal_Value;
    }

    public WebElement getOrder_Screen_Tax_Value() {
        return Order_Screen_Tax_Value;
    }

    public WebElement getOrder_Screen_CancelBtn() {
        return Order_Screen_CancelBtn;
    }

    public WebElement getSearchBox_InDiscountScreen() {
        return SearchBox_InDiscountScreen;
    }

    public WebElement getOrder_Screen_Total_Value() {
        return Order_Screen_Total_Value;
    }

    public void searchTheDiscount(String discount) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //enter the discount in the search box
        getSearchBox_InDiscountScreen().sendKeys(discount);
    }

    public void clickTheRequiredDiscount(String discount) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click the discount after the search
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@text='"+discount+"']")).click();
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(By.xpath("//android.widget.Button[@text='" + discount + "']"))).build().perform();


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //click the cancel button
        getOrder_Screen_CancelBtn().click();
    }

    public void clickTheRequiredDiscount1(String discount, String msg) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //click the discount after the search
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@text='"+discount+"']")).click();
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(By.xpath("//android.widget.Button[@text='" + discount + "']"))).build().perform();
        Thread.sleep(500);
        ut.PassedCaptureScreenshotAsBASE64(driver,test);
//        try {String d = driver.findElement(By.xpath("//*[contains(@text,'Paid amount exceeds the sale amount')]")).getText();
//            if (d.equals(msg)) {
//                test.log(LogStatus.PASS, "Paid amount exceeds the sale amount message is displayed, when user try to apply the discount for reopened check");
//            }
//        } catch (Exception e) {
//            test.log(LogStatus.FAIL, "Paid amount exceeds the sale amount message is not displayed, when user try to apply the discount for reopened check");
//            ut.FailedCaptureScreenshotAsBASE64(driver,test);
//        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //click the cancel button
        getOrder_Screen_CancelBtn().click();
    }

    public void ClickTheDiscount() {
        //click the discount button in the order screen
        getOrder_Screen_DiscountBtn().click();
    }

    public void Check_Values_Validations_With_Check_Based_Discount_After_Tax(String dis) throws Throwable {
        //Total price value calculated in float
        Float Calculated_Total_Price = Get_Price_Amount_For_Every_MenuItem(driver, "(//*[@text='X'])", "/../..//android.widget.TextView[5]");
        //Total total amount value calculated in float
        Float Calculated_Total_Amount = Get_Total_Amount_For_Every_MenuItem(driver, "(//*[@text='X'])", "/../..//android.widget.TextView[7]");
        //Total total amount value calculated in float
        double Calculated_Disc_Amount = Get_CheckBasedDisc_Amount_AfterTax_For_Every_MenuItem(driver, "(//*[@text='X'])", "/../..//android.widget.TextView[6]", dis);

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

            ut.PassedCaptureScreenshotAsBASE64(driver, test);

            // Print the actual value
            System.out.println("The Actual Sub-Total Value is : " + actual_SubTotal_Value);

            test.log(LogStatus.PASS, "The Actual Sub-Total Value is : " + actual_SubTotal_Value);
        } else {
            test.log(LogStatus.FAIL, "Actual and Expected Sub-Total values are different");
            ut.FailedCaptureScreenshotAsBASE64(driver, test);

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
        } else {
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
        } else {

            double diff = Calculated_Disc_Amount - disc1;

            test.log(LogStatus.FAIL, "Actual and Expected Discount values are different and the difference is : " + diff);

            // Print the different value
            System.out.println("Total Value different is : " + diff);
        }
    }

    public void Check_Values_Validations_With_MixAndMatch_Discount_After_Tax(String quantity, String dis) throws Throwable {
        //Total price value calculated in float
        Float Calculated_Total_Price = Get_Price_Amount_For_Every_MenuItem(driver, "(//*[@text='X'])", "/../..//android.widget.TextView[5]");
        //Total total amount value calculated in float
        Float Calculated_Total_Amount = Get_Total_Amount_For_Every_MenuItem(driver, "(//*[@text='X'])", "/../..//android.widget.TextView[7]");
        //Total total amount value calculated in float
        double Calculated_Disc_Amount = getTheDiscount_MixAndMatch(quantity, "(//*[@text='X'])", dis, "/../..//android.widget.TextView[6]");

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

            ut.PassedCaptureScreenshotAsBASE64(driver, test);

            // Print the actual value
            System.out.println("The Actual Sub-Total Value is : " + actual_SubTotal_Value);

            test.log(LogStatus.PASS, "The Actual Sub-Total Value is : " + actual_SubTotal_Value);
        } else {
            test.log(LogStatus.FAIL, "Actual and Expected Sub-Total values are different");
            ut.FailedCaptureScreenshotAsBASE64(driver, test);

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
        } else {
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

        Calculated_Disc_Amount = Math.round(Calculated_Disc_Amount * 100.00) / 100.00;

        // Check weather the Calculated Total amount and Actual Total amount is same or not
        if (Calculated_Disc_Amount == disc1) {
            test.log(LogStatus.PASS, "Actual and Expected Discount amount are same");

            // Print the actual value
            System.out.println("The Actual Discount Value is : " + disc1);

            test.log(LogStatus.PASS, "The Actual Discount Value is : " + disc1);
        } else {

            double diff = Calculated_Disc_Amount - disc1;

            test.log(LogStatus.INFO, "The Actual Discount Value is : " + disc1);
            test.log(LogStatus.INFO, "The Calculated Discount Value is : " + Calculated_Disc_Amount);
            test.log(LogStatus.FAIL, "Actual and Expected Discount values are different and the difference is : " + diff);

            // Print the different value
            System.out.println("Total Value different is : " + diff);
        }
    }

    public String getTheTotal(String tax) {

        double subtotal, subtotal1 = 0;
        double calculatedTax, calculatedTax1 = 0, total = 0;

        List<?> s = driver.findElements(By.xpath("(//*[@text='X'])"));

        int sa = s.size();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa; i++) {

            //get the item from the retail screen
            String item = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[1]")).getText();

            //get the quantity from the retail screen
            String qu = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[4]")).getText();
            int qa = Integer.parseInt(qu);

            //get the price from the retail screen
            String price = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[5]")).getText();
            double pri = Double.parseDouble(price);

            subtotal = qa * pri;

            subtotal = Math.round(subtotal * 100.00) / 100.00;

            System.out.println("Total for the Item(" + item + ") is : " + subtotal);

            subtotal1 += subtotal;

            System.out.println("Subtotal is : " + subtotal1);

            double ta = Double.parseDouble(tax);

            calculatedTax = subtotal * ta / 100;

            calculatedTax = Math.round(calculatedTax * 100.00) / 100.00;

            System.out.println("Tax for the Item(" + item + ") is : " + calculatedTax);

            calculatedTax1 += calculatedTax;

            System.out.println("Tax is : " + calculatedTax1);

            total = subtotal1 + calculatedTax1;

            total = Math.round(total * 100.00) / 100.00;

            System.out.println("Total value is : " + total);
        }

        try {
            String discountActual = new RetailPOS_Order_Page().get_DiscountAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
            double disc = Double.parseDouble(discountActual);

            total = total - disc;

        } catch (Exception e) {
            total = total + 0;
        }

        return String.valueOf(total);
    }

    public void verifyTheTotal(String tax) {
        String totalCalculated = getTheTotal(tax);
        double doubleValue = Double.parseDouble(totalCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        totalCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Total is : " + totalCalculated);

        String totalActual = new RetailPOS_Order_Page().get_TotalAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Total from the Retail Screen : " + totalActual);

        if (totalCalculated.equals(totalActual)) {
            test.log(LogStatus.PASS, "Calculated Total is correct and the total is : " + totalActual);
        } else {
            double cal = Double.parseDouble(totalCalculated);
            double act = Double.parseDouble(totalActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated total  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) total  is : " + act);
            test.log(LogStatus.FAIL, "The difference in total  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver, test);
        }
    }

    public String theDiscount_AfterTax_Amount(String amount) {
        double discount, discount1 = 0;

        List<?> s = driver.findElements(By.xpath("(//*[@text='X'])"));

        int sa = s.size();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa; i++) {

            //get the item from the retail screen
            String item = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[1]")).getText();

            //get the quantity from the retail screen
            String qu = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[4]")).getText();
            int qa = Integer.parseInt(qu);

            double discAmt = Double.parseDouble(amount);

            discount = qa * discAmt;

            discount = Math.round(discount * 100.00) / 100.00;

            System.out.println("Discount for the Item(" + item + ") is : " + discount);

            discount1 += discount;

            System.out.println("Discount(After Tax) is : " + discount1);

        }
        return String.valueOf(discount1);
    }

    public void verifyTheDiscount_AfterTax_Amount(String amount) {
        String discountCalculated = theDiscount_AfterTax_Amount(amount);
        double doubleValue = Double.parseDouble(discountCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        discountCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Discount is : " + discountCalculated);

        String discountActual = new RetailPOS_Order_Page().get_DiscountAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Discount from the Retail Screen : " + discountActual);

        if (discountCalculated.equals(discountActual)) {
            test.log(LogStatus.PASS, "Calculated Discount is correct and the Discount is : " + discountActual);
        } else {
            double cal = Double.parseDouble(discountCalculated);
            double act = Double.parseDouble(discountActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated Discount  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) Discount  is : " + act);
            test.log(LogStatus.FAIL, "The difference in Discount  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver,test);
        }
    }

    public String getTheSubTotal() {

        double subtotal, subtotal1 = 0;

        List<?> s = driver.findElements(By.xpath("(//*[@text='X'])"));

        int sa = s.size();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa; i++) {
            //get the quantity from the retail screen
            String qu = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[4]")).getText();
            int qa = Integer.parseInt(qu);

            //get the price from the retail screen
            String price = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[5]")).getText();
            double pri = Double.parseDouble(price);

            subtotal = qa * pri;

            subtotal = Math.round(subtotal * 100.00) / 100.00;

            subtotal1 += subtotal;
        }        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        return decimalFormat.format(subtotal1);
    }

    public void verifyTheSubTotal() {
        String subTotalCalculated = getTheSubTotal();
        double doubleValue = Double.parseDouble(subTotalCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        subTotalCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated SubTotal is : " + subTotalCalculated);

        String subTotalActual = new RetailPOS_Order_Page().get_SubtotalAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("SubTotal from the Retail Screen : " + subTotalActual);

        if (subTotalCalculated.equals(subTotalActual)) {
            test.log(LogStatus.PASS, "Calculated SubTotal is correct and the SubTotal is : " + subTotalActual);
        } else {
            double cal = Double.parseDouble(subTotalCalculated);
            double act = Double.parseDouble(subTotalActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated SubTotal  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) SubTotal  is : " + act);
            test.log(LogStatus.FAIL, "The difference in SubTotal  is : " + diff);
        }
    }

    public String getTheTax(String tax) {

        double subtotal;
        double calculatedTax, calculatedTax1 = 0;

        List<?> s = driver.findElements(By.xpath("(//*[@text='X'])"));

        int sa = s.size();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa; i++) {

            //get the quantity from the retail screen
            String qu = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[4]")).getText();
            int qa = Integer.parseInt(qu);

            //get the price from the retail screen
            String price = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[5]")).getText();
            double pri = Double.parseDouble(price);

            subtotal = qa * pri;

            subtotal = Math.round(subtotal * 100.00) / 100.00;

            double ta = Double.parseDouble(tax);

            calculatedTax = subtotal * ta / 100;

            calculatedTax = Math.round(calculatedTax * 100.00) / 100.00;

            calculatedTax1 += calculatedTax;

        }        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        return decimalFormat.format(calculatedTax1);
    }

    public void verifyTheTax(String tax) {
        String taxCalculated = getTheTax(tax);
        double doubleValue = Double.parseDouble(taxCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        taxCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Tax is : " + taxCalculated);

        String taxActual = new RetailPOS_Order_Page().get_TaxAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Tax from the Retail Screen : " + taxActual);

        if (taxCalculated.equals(taxActual)) {
            test.log(LogStatus.PASS, "Calculated Tax is correct and the Tax is : " + taxActual);
        } else {
            double cal = Double.parseDouble(taxCalculated);
            double act = Double.parseDouble(taxActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated Tax  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) Tax  is : " + act);
            test.log(LogStatus.FAIL, "The difference in Tax  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver, test);
        }
    }

    public String theDiscount_AfterTax_SetPercentage(String percentage) {
        double discount, discount1 = 0, total;

        List<?> s = driver.findElements(By.xpath("(//*[@text='X'])"));

        int sa = s.size();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa; i++) {
            String item = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[1]")).getText();

            //get the quantity from the retail screen
            String qu = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[4]")).getText();
            double qa = Double.parseDouble(qu);

            String pri = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[5]")).getText();
            double price = Double.parseDouble(pri);

            total = qa * price;

            total = Math.round(total * 100.00) / 100.00;

            double discAmt = Double.parseDouble(percentage);

            discAmt = discAmt / 100.00;

            discAmt = Math.round(discAmt * 100.00) / 100.00;

            discount = total * discAmt;

            discount = Math.round(discount * 100.00) / 100.00;

            System.out.println("Discount for the Item(" + item + ") is : " + discount);

            discount1 += discount;

            System.out.println("Discount(After Tax) is : " + discount1);

        }
        return String.valueOf(discount1);
    }

    public void verifyTheDiscount_AfterTax_SetPercentage(String percentage) {
        String discountCalculated = theDiscount_AfterTax_SetPercentage(percentage);
        double doubleValue = Double.parseDouble(discountCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        discountCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Discount is : " + discountCalculated);

        String discountActual = new RetailPOS_Order_Page().get_DiscountAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Discount from the Retail Screen : " + discountActual);

        if (discountCalculated.equals(discountActual)) {
            test.log(LogStatus.PASS, "Calculated Discount is correct and the Discount is : " + discountActual);
        } else {
            double cal = Double.parseDouble(discountCalculated);
            double act = Double.parseDouble(discountActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated Discount  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) Discount  is : " + act);
            test.log(LogStatus.FAIL, "The difference in Discount  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver,test);
        }
    }

    public String theDiscount_AfterTax_SetPrice(String setPrice) {
        double discount, discount1 = 0, total;

        List<?> s = driver.findElements(By.xpath("(//*[@text='X'])"));

        int sa = s.size();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa; i++) {
            String item = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[1]")).getText();

            //get the quantity from the retail screen
            String qu = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[4]")).getText();
            double qa = Double.parseDouble(qu);

            String pri = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[5]")).getText();
            double price = Double.parseDouble(pri);

            total = qa * price;

            total = Math.round(total * 100.00) / 100.00;

            double discAmt = Double.parseDouble(setPrice);

            discAmt = Math.round(discAmt * 100.00) / 100.00;

            discount = total - discAmt;

            discount = Math.round(discount * 100.00) / 100.00;

            System.out.println("Discount for the Item(" + item + ") is : " + discount);

            discount1 += discount;

            System.out.println("Discount(After Tax) is : " + discount1);

        }
        return String.valueOf(discount1);
    }

    public void verifyTheDiscount_AfterTax_SetPrice(String percentage) {
        String discountCalculated = theDiscount_AfterTax_SetPrice(percentage);
        double doubleValue = Double.parseDouble(discountCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        discountCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Discount is : " + discountCalculated);

        String discountActual = new RetailPOS_Order_Page().get_DiscountAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Discount from the Retail Screen : " + discountActual);

        if (discountCalculated.equals(discountActual)) {
            test.log(LogStatus.PASS, "Calculated Discount is correct and the Discount is : " + discountActual);
        } else {
            double cal = Double.parseDouble(discountCalculated);
            double act = Double.parseDouble(discountActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated Discount  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) Discount  is : " + act);
            test.log(LogStatus.FAIL, "The difference in Discount  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver,test);
        }
    }

    public void verifyTheDiscount_AfterTax_FreeItem() {

        List<?> s = driver.findElements(By.xpath("(//*[@text='X'])"));

        int sa = s.size();

        int rs = 0;

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa; i++) {

            String qu = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[4]")).getText();
            int qa = Integer.parseInt(qu);
            rs = rs + qa;
        }
        sa = rs;

        //list for all free item(Each item contains 7 attributes suppose we have 2 free item then it show 14 attributes)
        List<?> s1 = driver.findElements(By.xpath("//*[@text='X']/../../../android.widget.TextView"));

        double sa1 = s1.size();

        sa1 = sa1 / 7;

        if (sa == sa1) {
            test.log(LogStatus.PASS, "Free Item Added successfully in the retail screen");
        } else {
            test.log(LogStatus.FAIL, "Free Item not Added properly in the retail screen");
        }

        try {
            if (new RetailPOS_Order_Page().getOrder_Screen_Discount_Value().isDisplayed()) {
                test.log(LogStatus.FAIL, "Discount field is displayed in the subtotal calculation section, when user apply the free item");
            }
        } catch (Exception e) {
            test.log(LogStatus.PASS, "Discount field is not displayed in the subtotal calculation section, when user apply the free item");
        }
    }

    public String getTheTax_BeforeTaxDiscount(String tax, String discountAmount) {

        double subtotal, tax1;
        double calculatedTax, calculatedTax1 = 0;

        List<?> s = driver.findElements(By.xpath("(//*[@text='X'])"));

        int sa = s.size();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa; i++) {

            //get the quantity from the retail screen
            String qu = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[4]")).getText();
            int qa = Integer.parseInt(qu);

            //get the price from the retail screen
            String price = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[5]")).getText();
            double pri = Double.parseDouble(price);

            subtotal = qa * pri;

            subtotal = Math.round(subtotal * 100.00) / 100.00;

            double price1 = Double.parseDouble(discountAmount);

            tax1 = subtotal - price1;

            tax1 = Math.round(tax1 * 100.00) / 100.00;

            double ta = Double.parseDouble(tax);

            calculatedTax = tax1 * ta / 100;

//            calculatedTax =  Math.round(calculatedTax*100.00)/100.00;

            calculatedTax1 += calculatedTax;

        }        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        return decimalFormat.format(calculatedTax1);
    }

    public void verifyTheTax_BeforeTaxDiscount(String tax, String discountAmount) {
        String taxCalculated = getTheTax_BeforeTaxDiscount(tax, discountAmount);
        double doubleValue = Double.parseDouble(taxCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        taxCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Tax is : " + taxCalculated);

        String taxActual = new RetailPOS_Order_Page().get_TaxAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Tax from the Retail Screen : " + taxActual);

        if (taxCalculated.equals(taxActual)) {
            test.log(LogStatus.PASS, "Calculated Tax is correct and the Tax is : " + taxActual);
        } else {
            double cal = Double.parseDouble(taxCalculated);
            double act = Double.parseDouble(taxActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated Tax  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) Tax  is : " + act);
            test.log(LogStatus.FAIL, "The difference in Tax  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver, test);
        }
    }

    public void verifyTheTotal_BeforeTaxDiscount(String tax, String disc) {
        double tot;

        String taxCalculated = getTheTax_BeforeTaxDiscount(tax, disc);
        double doubleValue = Double.parseDouble(taxCalculated);

        String subTotalCalculated = getTheSubTotal();
        double doubleValue1 = Double.parseDouble(subTotalCalculated);

        String discountCalculated = theDiscount_AfterTax_Amount(disc);
        double doubleValue2 = Double.parseDouble(discountCalculated);

        tot = doubleValue + doubleValue1 - doubleValue2;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        String totalCalculated;
        totalCalculated = decimalFormat.format(tot);

        System.out.println(" Calculated Total is : " + totalCalculated);

        String totalActual = new RetailPOS_Order_Page().get_TotalAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Total from the Retail Screen : " + totalActual);

        if (totalCalculated.equals(totalActual)) {
            test.log(LogStatus.PASS, "Calculated Total is correct and the total is : " + totalActual);
        } else {
            double cal = Double.parseDouble(totalCalculated);
            double act = Double.parseDouble(totalActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated total  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) total  is : " + act);
            test.log(LogStatus.FAIL, "The difference in total  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver, test);
        }
    }

    public String getTheTax_BeforeTaxDiscount_Percentage(String tax, String disc) {

        double subtotal, tax1;
        double calculatedTax, calculatedTax1 = 0;

        List<?> s = driver.findElements(By.xpath("(//*[@text='X'])"));

        int sa = s.size();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa; i++) {

            //get the quantity from the retail screen
            String qu = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[4]")).getText();
            int qa = Integer.parseInt(qu);

            //get the price from the retail screen
            String price = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[5]")).getText();
            double pri = Double.parseDouble(price);

            subtotal = qa * pri;

            subtotal = Math.round(subtotal * 100.00) / 100.00;

            double price11 = Double.parseDouble(disc);

            double price1 = price11 / 100;

            price1 = Math.round(price1 * 100.00) / 100.00;

            tax1 = subtotal * price1;

            tax1 = Math.round(tax1 * 100.00) / 100.00;

            tax1 = subtotal - tax1;

            double ta = Double.parseDouble(tax);

            calculatedTax = tax1 * ta / 100;

//            calculatedTax =  Math.round(calculatedTax*100.00)/100.00;

            calculatedTax1 += calculatedTax;

        }        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        return decimalFormat.format(calculatedTax1);
    }

    public void verifyTheTax_BeforeTaxDiscount_Percentage(String tax, String disc) {
        String taxCalculated = getTheTax_BeforeTaxDiscount_Percentage(tax, disc);
        double doubleValue = Double.parseDouble(taxCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        taxCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Tax is : " + taxCalculated);

        String taxActual = new RetailPOS_Order_Page().get_TaxAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Tax from the Retail Screen : " + taxActual);

        if (taxCalculated.equals(taxActual)) {
            test.log(LogStatus.PASS, "Calculated Tax is correct and the Tax is : " + taxActual);
        } else {
            double cal = Double.parseDouble(taxCalculated);
            double act = Double.parseDouble(taxActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated Tax  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) Tax  is : " + act);
            test.log(LogStatus.FAIL, "The difference in Tax  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver, test);
        }
    }

    public void verifyTheTotal_BeforeTaxDiscount_Percentage(String tax, String disc) {
        double tot;

        String taxCalculated = getTheTax_BeforeTaxDiscount_Percentage(tax, disc);
        double doubleValue = Double.parseDouble(taxCalculated);

        String subTotalCalculated = getTheSubTotal();
        double doubleValue1 = Double.parseDouble(subTotalCalculated);

        String discountCalculated = theDiscount_AfterTax_SetPercentage(disc);
        double doubleValue2 = Double.parseDouble(discountCalculated);

        tot = doubleValue + doubleValue1 - doubleValue2;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        String totalCalculated;
        totalCalculated = decimalFormat.format(tot);

        System.out.println(" Calculated Total is : " + totalCalculated);

        String totalActual = new RetailPOS_Order_Page().get_TotalAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Total from the Retail Screen : " + totalActual);

        if (totalCalculated.equals(totalActual)) {
            test.log(LogStatus.PASS, "Calculated Total is correct and the total is : " + totalActual);
        } else {
            double cal = Double.parseDouble(totalCalculated);
            double act = Double.parseDouble(totalActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated total  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) total  is : " + act);
            test.log(LogStatus.FAIL, "The difference in total  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver, test);
        }
    }

    public String getTheTax_BeforeTaxDiscount_SetPrice(String tax, String discountAmount) {

        double tax1;
        double calculatedTax, calculatedTax1 = 0;

        List<?> s = driver.findElements(By.xpath("(//*[@text='X'])"));

        int sa = s.size();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa; i++) {


            tax1 = Double.parseDouble(discountAmount);

            tax1 = Math.round(tax1 * 100.00) / 100.00;

            double ta = Double.parseDouble(tax);

            calculatedTax = tax1 * ta / 100;

//            calculatedTax =  Math.round(calculatedTax*100.00)/100.00;

            calculatedTax1 += calculatedTax;

        }        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        return decimalFormat.format(calculatedTax1);
    }

    public void verifyTheTax_BeforeTaxDiscount_SetPrice(String tax, String discountAmount) {
        String taxCalculated = getTheTax_BeforeTaxDiscount_SetPrice(tax, discountAmount);
        double doubleValue = Double.parseDouble(taxCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        taxCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Tax is : " + taxCalculated);

        String taxActual = new RetailPOS_Order_Page().get_TaxAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Tax from the Retail Screen : " + taxActual);

        if (taxCalculated.equals(taxActual)) {
            test.log(LogStatus.PASS, "Calculated Tax is correct and the Tax is : " + taxActual);
        } else {
            double cal = Double.parseDouble(taxCalculated);
            double act = Double.parseDouble(taxActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated Tax  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) Tax  is : " + act);
            test.log(LogStatus.FAIL, "The difference in Tax  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver, test);
        }
    }

    public void verifyTheTotal_BeforeTaxDiscount_SetPrice(String tax, String disc) {
        double tot;

        String taxCalculated = getTheTax_BeforeTaxDiscount_SetPrice(tax, disc);
        double doubleValue = Double.parseDouble(taxCalculated);

        String subTotalCalculated = getTheSubTotal();
        double doubleValue1 = Double.parseDouble(subTotalCalculated);

        String discountCalculated = theDiscount_AfterTax_SetPrice(disc);
        double doubleValue2 = Double.parseDouble(discountCalculated);

        tot = doubleValue + doubleValue1 - doubleValue2;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        String totalCalculated;
        totalCalculated = decimalFormat.format(tot);

        System.out.println(" Calculated Total is : " + totalCalculated);

        String totalActual = new RetailPOS_Order_Page().get_TotalAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Total from the Retail Screen : " + totalActual);

        if (totalCalculated.equals(totalActual)) {
            test.log(LogStatus.PASS, "Calculated Total is correct and the total is : " + totalActual);
        } else {
            double cal = Double.parseDouble(totalCalculated);
            double act = Double.parseDouble(totalActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated total  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) total  is : " + act);
            test.log(LogStatus.FAIL, "The difference in total  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver, test);
        }
    }

    public void verifyTheCheckBasedDiscount_AfterTax_Amount(String tax, String disc) {

        double tot;

        String taxCalculated = getTheTax(tax);
        double doubleValue = Double.parseDouble(taxCalculated);

        String subTotalCalculated = getTheSubTotal();
        double doubleValue1 = Double.parseDouble(subTotalCalculated);

        String totalCalculated = getTheTotal(tax);
        double doubleValue2 = Double.parseDouble(totalCalculated);

        tot = doubleValue + doubleValue1 - doubleValue2;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        String discountCalculated;
        discountCalculated = decimalFormat.format(tot);

        System.out.println(" Calculated Discount is : " + discountCalculated);

        String discountActual = new RetailPOS_Order_Page().get_DiscountAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Discount from the Retail Screen : " + discountActual);

        if (discountCalculated.equals(discountActual) && discountCalculated.equals(disc)) {
            test.log(LogStatus.PASS, "Calculated Discount is correct and the Discount is : " + discountActual);
        } else {
            double cal = Double.parseDouble(discountCalculated);
            double act = Double.parseDouble(discountActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated Discount  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) Discount  is : " + act);
            test.log(LogStatus.FAIL, "The difference in Discount  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver,test);
        }
    }

    public void verifyTheCheckBasedDiscount_AfterTax_Percentage(String disc) {

        String subTotalCalculated = getTheSubTotal();
        double doubleValue1 = Double.parseDouble(subTotalCalculated);

        double dis = Double.parseDouble(disc);

        double dis1 = dis / 100;

        dis1 = Math.round(dis1 * 100.00) / 100.00;

        double discountCalculated1 = doubleValue1 * dis1;
        discountCalculated1 = Math.round(discountCalculated1 * 100.00) / 100.00;

        String discountCalculated;

        DecimalFormat decimalFormat1 = new DecimalFormat("0.00");
        discountCalculated = decimalFormat1.format(discountCalculated1);
        System.out.println(" Calculated Discount is : " + discountCalculated);

        String discountActual = new RetailPOS_Order_Page().get_DiscountAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Discount from the Retail Screen : " + discountActual);

        if (discountCalculated.equals(discountActual)) {
            test.log(LogStatus.PASS, "Calculated Discount is correct and the Discount is : " + discountActual);
        } else {
            double cal = Double.parseDouble(discountCalculated);
            double act = Double.parseDouble(discountActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated Discount  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) Discount  is : " + act);
            test.log(LogStatus.FAIL, "The difference in Discount  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver,test);
        }
    }

    public void verifyTheCheckBasedDiscount_AfterTax_SetPrice(String disc) {

        double tot;
        String subTotalCalculated = getTheSubTotal();
        double doubleValue1 = Double.parseDouble(subTotalCalculated);

        double doubleValue2 = Double.parseDouble(disc);

        tot = doubleValue1 - doubleValue2;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        String discountCalculated;
        discountCalculated = decimalFormat.format(tot);
        System.out.println(" Calculated Discount is : " + discountCalculated);

        String discountActual = new RetailPOS_Order_Page().get_DiscountAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Discount from the Retail Screen : " + discountActual);

        if (discountCalculated.equals(discountActual)) {
            test.log(LogStatus.PASS, "Calculated Discount is correct and the Discount is : " + discountActual);
        } else {
            double cal = Double.parseDouble(discountCalculated);
            double act = Double.parseDouble(discountActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated Discount  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) Discount  is : " + act);
            test.log(LogStatus.FAIL, "The difference in Discount  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver,test);
        }
    }

    public void verifyTheCheckBasedDiscount_AfterTax_FreeItem() {

        //list for all free item(Each item contains 7 attributes suppose we have 2 free item then it show 14 attributes)
        List<?> s1 = driver.findElements(By.xpath("//*[@text='X']/../../../android.widget.TextView"));

        double sa1 = s1.size();

        sa1 = sa1 / 7;

        if (1 == sa1) {
            test.log(LogStatus.PASS, "Free Item Added successfully in the retail screen");
        } else {
            test.log(LogStatus.FAIL, "Free Item not Added properly in the retail screen");
        }

        try {
            if (new RetailPOS_Order_Page().getOrder_Screen_Discount_Value().isDisplayed()) {
                test.log(LogStatus.FAIL, "Discount field is displayed in the subtotal calculation section, when user apply the free item");
            }
        } catch (Exception e) {
            test.log(LogStatus.PASS, "Discount field is not displayed in the subtotal calculation section, when user apply the free item");
        }
    }


    public String getTheTax_BeforeTaxDiscount_CheckBased_Amount(String tax, String discountAmount) {

        double subtotal;
        double calculatedTax1 = 0;

        List<?> s = driver.findElements(By.xpath("(//*[@text='X'])"));

        int sa = s.size();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa; i++) {

            //get the quantity from the retail screen
            String qu = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[4]")).getText();
            int qa = Integer.parseInt(qu);

            //get the price from the retail screen
            String price = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[5]")).getText();
            double pri = Double.parseDouble(price);

            subtotal = qa * pri;

            subtotal = Math.round(subtotal * 100.00) / 100.00;

            double a = Double.parseDouble(tax);

            a = a / 100;

            double price1 = Double.parseDouble(discountAmount);

            double sub = Double.parseDouble(getTheSubTotal());

            double menuDisc = (subtotal / sub) * price1;

            double totTax = (subtotal - menuDisc) / a;

            totTax = totTax / 100;

            calculatedTax1 += totTax;

        }        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        return decimalFormat.format(calculatedTax1);
    }

    public void verifyTheTax_BeforeTaxDiscount_CheckBased_Amount(String tax, String discountAmount) {
        String taxCalculated = getTheTax_BeforeTaxDiscount_CheckBased_Amount(tax, discountAmount);
        double doubleValue = Double.parseDouble(taxCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        taxCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Tax is : " + taxCalculated);

        String taxActual = new RetailPOS_Order_Page().get_TaxAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Tax from the Retail Screen : " + taxActual);

        if (taxCalculated.equals(taxActual)) {
            test.log(LogStatus.PASS, "Calculated Tax is correct and the Tax is : " + taxActual);
        } else {
            double cal = Double.parseDouble(taxCalculated);
            double act = Double.parseDouble(taxActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated Tax  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) Tax  is : " + act);
            test.log(LogStatus.FAIL, "The difference in Tax  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver, test);
        }
    }

    public String getTheTotal_BeforeTaxDiscount_CheckBased_Amount(String tax, String discountAmount) {

//        double subtotal;
        double calculatedTot1;

        double sub = Double.parseDouble(getTheSubTotal());

        double disc = Double.parseDouble(discountAmount);

        double tax1 = Double.parseDouble(getTheTax_BeforeTaxDiscount_CheckBased_Amount(tax, discountAmount));

//        calculatedTot1 = sub - disc + tax1;

        calculatedTot1 = sub - disc + tax1;

        return String.valueOf(calculatedTot1);
    }

    public void verifyTheTotal_BeforeTaxDiscount_CheckBased_Amount(String tax, String disc) {
        String totalCalculated = getTheTotal_BeforeTaxDiscount_CheckBased_Amount(tax, disc);
        double doubleValue = Double.parseDouble(totalCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        totalCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Total is : " + totalCalculated);

        String totalActual = new RetailPOS_Order_Page().get_TotalAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Total from the Retail Screen : " + totalActual);

        if (totalCalculated.equals(totalActual)) {
            test.log(LogStatus.PASS, "Calculated Total is correct and the total is : " + totalActual);
        } else {
            double cal = Double.parseDouble(totalCalculated);
            double act = Double.parseDouble(totalActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated total  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) total  is : " + act);
            test.log(LogStatus.FAIL, "The difference in total  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver, test);
        }
    }

    public String getTheTax_BeforeTaxDiscount_CheckBased_Percentage(String tax, String discPer) {

        double subtotal;
        double calculatedTax1 = 0;

        List<?> s = driver.findElements(By.xpath("(//*[@text='X'])"));

        int sa = s.size();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa; i++) {

            //get the quantity from the retail screen
            String qu = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[4]")).getText();
            int qa = Integer.parseInt(qu);

            //get the price from the retail screen
            String price = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[5]")).getText();
            double pri = Double.parseDouble(price);

            subtotal = qa * pri;

            subtotal = Math.round(subtotal * 100.00) / 100.00;

            double sub = Double.parseDouble(getTheSubTotal());

            double a = Double.parseDouble(tax);
            a = a / 100;

            double disc = Double.parseDouble(discPer);

            disc = disc / 100;

            double totDiscAmt = sub * disc;

            double menuDisc = (subtotal / sub) * totDiscAmt;

            double totTax = (subtotal - menuDisc) / a;

            totTax = totTax / 100;

            calculatedTax1 += totTax;

        }        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        return decimalFormat.format(calculatedTax1);
    }

    public void verifyTheTax_BeforeTaxDiscount_CheckBased_Percentage(String tax, String discountAmount) {
        String taxCalculated = getTheTax_BeforeTaxDiscount_CheckBased_Percentage(tax, discountAmount);
        double doubleValue = Double.parseDouble(taxCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        taxCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Tax is : " + taxCalculated);

        String taxActual = new RetailPOS_Order_Page().get_TaxAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Tax from the Retail Screen : " + taxActual);

        if (taxCalculated.equals(taxActual)) {
            test.log(LogStatus.PASS, "Calculated Tax is correct and the Tax is : " + taxActual);
        } else {
            double cal = Double.parseDouble(taxCalculated);
            double act = Double.parseDouble(taxActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated Tax  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) Tax  is : " + act);
            test.log(LogStatus.FAIL, "The difference in Tax  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver, test);
        }
    }

    public String getTheTotal_BeforeTaxDiscount_CheckBased_Percentage(String tax, String discountAmount) {

        double calculatedTot1;

        double sub = Double.parseDouble(getTheSubTotal());
        test.log(LogStatus.INFO,"Subtotal is : "+sub);
        double disc = Double.parseDouble(discountAmount);
        test.log(LogStatus.INFO,"Discount is : "+disc);
        double tax1 = Double.parseDouble(getTheTax_BeforeTaxDiscount_CheckBased_Percentage(tax, discountAmount));
        test.log(LogStatus.INFO,"Tax is : "+tax1);
//        calculatedTot1 = sub - disc + tax1;

        calculatedTot1 = sub - disc + tax1;

        return String.valueOf(calculatedTot1);
    }

    public void verifyTheTotal_BeforeTaxDiscount_CheckBased_Percentage(String tax, String disc) {
        String totalCalculated = getTheTotal_BeforeTaxDiscount_CheckBased_Percentage(tax, disc);
        double doubleValue = Double.parseDouble(totalCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        totalCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Total is : " + totalCalculated);

        String totalActual = new RetailPOS_Order_Page().get_TotalAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Total from the Retail Screen : " + totalActual);

        if (totalCalculated.equals(totalActual)) {
            test.log(LogStatus.PASS, "Calculated Total is correct and the total is : " + totalActual);
        } else {
            double cal = Double.parseDouble(totalCalculated);
            double act = Double.parseDouble(totalActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated total  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) total  is : " + act);
            test.log(LogStatus.FAIL, "The difference in total  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver, test);
        }
    }

    public String getTheTax_BeforeTaxDiscount_CheckBased_SetPrice(String tax, String discount) {

        double subtotal;
        double calculatedTax1 = 0;

        List<?> s = driver.findElements(By.xpath("(//*[@text='X'])"));

        int sa = s.size();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa; i++) {

            //get the quantity from the retail screen
            String qu = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[4]")).getText();
            int qa = Integer.parseInt(qu);

            //get the price from the retail screen
            String price = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[5]")).getText();
            double pri = Double.parseDouble(price);

            subtotal = qa * pri;

            subtotal = Math.round(subtotal * 100.00) / 100.00;

            double a = Double.parseDouble(tax);

            a = a / 100;

            double sub = Double.parseDouble(getTheSubTotal());

            double price1 = Double.parseDouble(discount);

            double discAmt = sub - price1;

            double menuDisc = (subtotal / sub) * discAmt;

            double totTax = (subtotal - menuDisc) / a;

            totTax = totTax / 100;

            calculatedTax1 += totTax;

        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        return decimalFormat.format(calculatedTax1);
    }

    public void verifyTheTax_BeforeTaxDiscount_CheckBased_SetPrice(String tax, String discountAmount) {
        String taxCalculated = getTheTax_BeforeTaxDiscount_CheckBased_SetPrice(tax, discountAmount);
        double doubleValue = Double.parseDouble(taxCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        taxCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Tax is : " + taxCalculated);

        String taxActual = new RetailPOS_Order_Page().get_TaxAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Tax from the Retail Screen : " + taxActual);

        if (taxCalculated.equals(taxActual)) {
            test.log(LogStatus.PASS, "Calculated Tax is correct and the Tax is : " + taxActual);
        } else {
            double cal = Double.parseDouble(taxCalculated);
            double act = Double.parseDouble(taxActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated Tax  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) Tax  is : " + act);
            test.log(LogStatus.FAIL, "The difference in Tax  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver, test);
        }
    }

    public String getTheTotal_BeforeTaxDiscount_CheckBased_SetPrice(String tax, String discountAmount) {
        double sub = Double.parseDouble(getTheSubTotal());
        test.log(LogStatus.INFO,"Subtotal is : "+sub);
        double disc = Double.parseDouble(discountAmount);
        test.log(LogStatus.INFO,"Discount is : "+disc);
        double tax1 = Double.parseDouble(getTheTax_BeforeTaxDiscount_CheckBased_SetPrice(tax, discountAmount));
        test.log(LogStatus.INFO,"Tax is : "+tax1);
//        double calculatedTot1 = sub - disc + tax1;

        double calculatedTot1 = sub - disc + tax1;

        return String.valueOf(calculatedTot1);

    }

    public void verifyTheTotal_BeforeTaxDiscount_CheckBased_SetPrice(String tax, String disc) {
        String totalCalculated = getTheTotal_BeforeTaxDiscount_CheckBased_SetPrice(tax, disc);
        double doubleValue = Double.parseDouble(totalCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        totalCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Total is : " + totalCalculated);

        String totalActual = new RetailPOS_Order_Page().get_TotalAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Total from the Retail Screen : " + totalActual);

        if (totalCalculated.equals(totalActual)) {
            test.log(LogStatus.PASS, "Calculated Total is correct and the total is : " + totalActual);
        } else {
            double cal = Double.parseDouble(totalCalculated);
            double act = Double.parseDouble(totalActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated total  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) total  is : " + act);
            test.log(LogStatus.FAIL, "The difference in total  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver, test);
        }
    }

    public String getTheDiscount_MixAndMatch_AfterTax_SetPercentage_MostExpensive(String disc,String qty) throws Exception {
        double discount1 = 0;

        List<?> s = driver.findElements(By.xpath("(//*[@text='X'])"));

        int sa = s.size();

        List<String> quan = new ArrayList<String>();
        List<String> price = new ArrayList<String>();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa; i++) {

            String qu = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[4]")).getText();
            String pri = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[5]")).getText();
            quan.add(qu);
            price.add(pri);
        }

        ArrayList<Integer> intArrayList = new ArrayList<>();
        for (String s1 : quan) {
            intArrayList.add(Integer.parseInt(s1));
        }

        ArrayList<Double> doubleArr = new ArrayList<>();
        for (String s1 : price) {
            doubleArr.add(Double.parseDouble(s1));
        }

        doubleArr.sort(Collections.reverseOrder());

        // Initialize a variable to hold the sum
        int sum = 0;

        for (Integer integer : intArrayList) {
            sum += integer;
        }

        int quu = Integer.parseInt(qty);

        int mod = sum / quu;

        for(int i = 0; i < mod;i++){
            double disc1 = Double.parseDouble(disc);

            disc1 = disc1/100;

            double d = doubleArr.get(i);

            double discountA = d * disc1;

            discount1 += discountA;
        }

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        return decimalFormat.format(discount1);
    }

    public void verifyThe_MixAndMatch_Discount_AfterTax_SetPercentage_MostExpensive(String percentage,String qty) throws Exception {
        String discountCalculated = getTheDiscount_MixAndMatch_AfterTax_SetPercentage_MostExpensive(percentage,qty);
        double doubleValue = Double.parseDouble(discountCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        discountCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Discount is : " + discountCalculated);

        String discountActual = new RetailPOS_Order_Page().get_DiscountAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Discount from the Retail Screen : " + discountActual);

        if (discountCalculated.equals(discountActual)) {
            test.log(LogStatus.PASS, "Calculated Discount is correct and the Discount is : " + discountActual);
        } else {
            double cal = Double.parseDouble(discountCalculated);
            double act = Double.parseDouble(discountActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated Discount  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) Discount  is : " + act);
            test.log(LogStatus.FAIL, "The difference in Discount  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver,test);
        }
    }

    public String getTheDiscount_MixAndMatch_AfterTax_SetPercentage_LeastExpensive(String disc,String qty) throws Exception {
        double discount1 = 0;

        List<?> s = driver.findElements(By.xpath("(//*[@text='X'])"));

        int sa = s.size();

        List<String> quan = new ArrayList<String>();
        List<String> price = new ArrayList<String>();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa; i++) {

            String qu = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[4]")).getText();
            String pri = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[5]")).getText();
            quan.add(qu);
            price.add(pri);
        }

        ArrayList<Integer> intArrayList = new ArrayList<>();
        for (String s1 : quan) {
            intArrayList.add(Integer.parseInt(s1));
        }
//        System.out.println("------------------- Quantity array is : "+intArrayList);
        ArrayList<Double> doubleArr = new ArrayList<>();
        for (String s1 : price) {
            doubleArr.add(Double.parseDouble(s1));
        }

        Collections.sort(doubleArr);
//        System.out.println("------------------- Sorted array is : "+doubleArr);
        // Initialize a variable to hold the sum
        int sum = 0;

        // Iterate through the array and add each element to the sum
//        for (int i = 0; i < intArrayList.size(); i++) {
//            sum += intArrayList.get(i);
//        }

        for (Integer integer : intArrayList) {
            sum += integer;
        }
//        System.out.println("------------------- Sum of quantity is : "+sum);
        int quu = Integer.parseInt(qty);
//        System.out.println("------------------- Quantity is : "+quu);
        int mod = sum / quu;
//        System.out.println("------------------- Modular is : "+mod);
        for(int i = 0; i < mod;i++){
            double disc1 = Double.parseDouble(disc);

            disc1 = disc1/100;

            double d = doubleArr.get(i);

            double discountA = d * disc1;

            discount1 += discountA;
//            System.out.println("------------------- Discount of "+doubleArr.get(i)+" is : "+discount1);
        }
//        System.out.println("------------------- Discount is : "+discount1);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        return decimalFormat.format(discount1);
    }

    public void verifyThe_MixAndMatch_Discount_AfterTax_SetPercentage_LeastExpensive(String percentage,String qty) throws Exception {
        String discountCalculated = getTheDiscount_MixAndMatch_AfterTax_SetPercentage_LeastExpensive(percentage, qty);
        double doubleValue = Double.parseDouble(discountCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        discountCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Discount is : " + discountCalculated);

        String discountActual = new RetailPOS_Order_Page().get_DiscountAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Discount from the Retail Screen : " + discountActual);

        if (discountCalculated.equals(discountActual)) {
            test.log(LogStatus.PASS, "Calculated Discount is correct and the Discount is : " + discountActual);
        } else {
            double cal = Double.parseDouble(discountCalculated);
            double act = Double.parseDouble(discountActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated Discount  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) Discount  is : " + act);
            test.log(LogStatus.FAIL, "The difference in Discount  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver,test);
        }
    }


    public String theDiscount_AfterTax_SetPrice_MixAndMatch(String setPrice,String qty) {

        List<?> s = driver.findElements(By.xpath("(//*[@text='X'])"));

        int sa = s.size();

        List<String> quan = new ArrayList<String>();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa; i++) {

            String qu = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[4]")).getText();

            quan.add(qu);
        }

        ArrayList<Integer> intArrayList = new ArrayList<>();
        for (String s1 : quan) {
            intArrayList.add(Integer.parseInt(s1));
        }

        // Initialize a variable to hold the sum
        int sum = 0;


        for (Integer integer : intArrayList) {
            sum += integer;
        }

        double quu = Double.parseDouble(qty);

        double mod = sum % quu;

        double discount, discount1 = 0, total;


        if(mod !=  0){
            sa = (int) (sa - mod);
        }

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa; i++) {
            String item = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[1]")).getText();

            //get the quantity from the retail screen
            String qu = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[4]")).getText();
            double qa = Double.parseDouble(qu);

            String pri = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[5]")).getText();
            double price = Double.parseDouble(pri);

            total = qa * price;

            total = Math.round(total * 100.00) / 100.00;

            double discAmt = Double.parseDouble(setPrice);

            discAmt = Math.round(discAmt * 100.00) / 100.00;

            discount = total - discAmt;

            discount = Math.round(discount * 100.00) / 100.00;

            System.out.println("Discount for the Item(" + item + ") is : " + discount);

            discount1 += discount;

            System.out.println("Discount(After Tax) is : " + discount1);

        }
        return String.valueOf(discount1);
    }

    public void verifyTheDiscount_AfterTax_SetPrice_MixAndMatch(String percentage,String qty) {
        String discountCalculated = theDiscount_AfterTax_SetPrice_MixAndMatch(percentage,qty);
        double doubleValue = Double.parseDouble(discountCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        discountCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Discount is : " + discountCalculated);

        String discountActual = new RetailPOS_Order_Page().get_DiscountAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Discount from the Retail Screen : " + discountActual);

        if (discountCalculated.equals(discountActual)) {
            test.log(LogStatus.PASS, "Calculated Discount is correct and the Discount is : " + discountActual);
        } else {
            double cal = Double.parseDouble(discountCalculated);
            double act = Double.parseDouble(discountActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated Discount  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) Discount  is : " + act);
            test.log(LogStatus.FAIL, "The difference in Discount  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver,test);
        }
    }

    public String theDiscount_AfterTax_SetEachItemPrice_MixAndMatch(String setPrice,String qty) {

        List<?> s = driver.findElements(By.xpath("(//*[@text='X'])"));

        int sa = s.size();

        List<String> quan = new ArrayList<String>();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa; i++) {

            String qu = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[4]")).getText();

            quan.add(qu);
        }

        ArrayList<Integer> intArrayList = new ArrayList<>();
        for (String s1 : quan) {
            intArrayList.add(Integer.parseInt(s1));
        }

        // Initialize a variable to hold the sum
        int sum = 0;


        for (Integer integer : intArrayList) {
            sum += integer;
        }

        double quu = Double.parseDouble(qty);


        double discount, discount1 = 0, total;


        if(sum > quu){
            sa = sum;
        }

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa; i++) {
            String item = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[1]")).getText();

            //get the quantity from the retail screen
            String qu = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[4]")).getText();
            double qa = Double.parseDouble(qu);

            String pri = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[5]")).getText();
            double price = Double.parseDouble(pri);

            total = qa * price;

            total = Math.round(total * 100.00) / 100.00;

            double discAmt = Double.parseDouble(setPrice);

            discAmt = Math.round(discAmt * 100.00) / 100.00;

            discount = total - discAmt;

            discount = Math.round(discount * 100.00) / 100.00;

            System.out.println("Discount for the Item(" + item + ") is : " + discount);

            discount1 += discount;

            System.out.println("Discount(After Tax) is : " + discount1);

        }
        return String.valueOf(discount1);
    }

    public void verifyTheDiscount_AfterTax_SetEachItemPrice_MixAndMatch(String percentage,String qty) {
        String discountCalculated = theDiscount_AfterTax_SetEachItemPrice_MixAndMatch(percentage,qty);
        double doubleValue = Double.parseDouble(discountCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        discountCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Discount is : " + discountCalculated);

        String discountActual = new RetailPOS_Order_Page().get_DiscountAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Discount from the Retail Screen : " + discountActual);

        if (discountCalculated.equals(discountActual)) {
            test.log(LogStatus.PASS, "Calculated Discount is correct and the Discount is : " + discountActual);
        } else {
            double cal = Double.parseDouble(discountCalculated);
            double act = Double.parseDouble(discountActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated Discount  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) Discount  is : " + act);
            test.log(LogStatus.FAIL, "The difference in Discount  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver,test);
        }
    }















    public String getTheTax_MixAndMatch_BeforeTax_SetPercentage_MostExpensive(String tax, String disc,String qty) throws Exception {

        double tax2,tax3,tax4=0;
        List<?> s = driver.findElements(By.xpath("(//*[@text='X'])"));

        int sa = s.size();

        List<String> quan = new ArrayList<String>();
        List<String> price = new ArrayList<String>();
//        List<Double> doubleArr1 = new ArrayList<Double>();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa; i++) {

            String qu = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[4]")).getText();
            int qu1 = Integer.parseInt(qu);
            String pri = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[5]")).getText();
            double pri1 = Double.parseDouble(pri);
            double pri2 = qu1 * pri1;
            pri2 = Math.round(pri2)*100.00/100.00;
            quan.add(qu);
            price.add(pri);
//            doubleArr1.add(pri2);
        }

        ArrayList<Integer> intArrayList = new ArrayList<>();
        for (String s1 : quan) {
            intArrayList.add(Integer.parseInt(s1));
        }

        ArrayList<Double> doubleArr = new ArrayList<>();
        for (String s1 : price) {
            doubleArr.add(Double.parseDouble(s1));
        }

        doubleArr.sort(Collections.reverseOrder());

        // Initialize a variable to hold the sum
        int sum = 0;


        for (Integer integer : intArrayList) {
            sum += integer;
        }

        int quu = Integer.parseInt(qty);

        int mod = sum / quu;

        for(int i = 0; i < sa;i++){
            if(i < mod){
                double disc1 = Double.parseDouble(disc);

                disc1 = disc1/100;

                double d = doubleArr.get(i);

                double discountA = d * disc1;

                d = d - discountA;

                double tax1 = Double.parseDouble(tax);

                tax1 = tax1 /100;

                tax2 = d * tax1;
                tax4 += tax2;
            }else{

                double d = doubleArr.get(i);
                double tax1 = Double.parseDouble(tax);

                tax1 = tax1 /100;

                tax3 = d * tax1;
                tax4 += tax3;
            }
        }

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        return decimalFormat.format(tax4);
    }

    public void verifyThe_MixAndMatch_Tax_BeforeTax_SetPercentage_MostExpensive(String tax,String percentage,String qty) throws Exception {
        String discountCalculated = getTheTax_MixAndMatch_BeforeTax_SetPercentage_MostExpensive(tax,percentage,qty);
        double doubleValue = Double.parseDouble(discountCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        discountCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Tax is : " + discountCalculated);

        String discountActual = new RetailPOS_Order_Page().get_TaxAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Tax from the Retail Screen : " + discountActual);

        if (discountCalculated.equals(discountActual)) {
            test.log(LogStatus.PASS, "Calculated Tax is correct and the Tax is : " + discountActual);
        } else {
            double cal = Double.parseDouble(discountCalculated);
            double act = Double.parseDouble(discountActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated Tax  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) Tax  is : " + act);
            test.log(LogStatus.FAIL, "The difference in Tax  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver,test);
        }
    }

    public String getTheTotal_MixAndMatch_BeforeTax_SetPercentage_MostExpensive(String tax, String disc,String qty) throws Exception {

        double sub = Double.parseDouble(getTheSubTotal());

        double disc1 = Double.parseDouble(getTheDiscount_MixAndMatch_AfterTax_SetPercentage_MostExpensive(disc, qty));

        double tax1 = Double.parseDouble(getTheTax_MixAndMatch_BeforeTax_SetPercentage_MostExpensive(tax, disc, qty));

        double tot = sub - disc1 + tax1;

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        return decimalFormat.format(tot);
    }

    public void verifyThe_MixAndMatch_Total_BeforeTax_SetPercentage_MostExpensive(String tax,String percentage,String qty) throws Exception {
        String discountCalculated = getTheTotal_MixAndMatch_BeforeTax_SetPercentage_MostExpensive(tax,percentage,qty);
        double doubleValue = Double.parseDouble(discountCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        discountCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Total is : " + discountCalculated);

        String discountActual = new RetailPOS_Order_Page().get_TotalAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Total from the Retail Screen : " + discountActual);

        if (discountCalculated.equals(discountActual)) {
            test.log(LogStatus.PASS, "Calculated Total is correct and the Total is : " + discountActual);
        } else {
            double cal = Double.parseDouble(discountCalculated);
            double act = Double.parseDouble(discountActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated Total  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) Total  is : " + act);
            test.log(LogStatus.FAIL, "The difference in Total  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver,test);
        }
    }

    public String getTheTax_MixAndMatch_BeforeTax_SetPercentage_LeastExpensive(String tax, String disc,String qty) throws Exception {

        double tax2,tax3,tax4=0;
        List<?> s = driver.findElements(By.xpath("(//*[@text='X'])"));

        int sa = s.size();

        List<String> quan = new ArrayList<String>();
        List<String> price = new ArrayList<String>();
//        List<Double> doubleArr1 = new ArrayList<Double>();

        // for loop for clicking on every time in the list
        for (int i = 1; i <= sa; i++) {

            String qu = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[4]")).getText();
            int qu1 = Integer.parseInt(qu);
            String pri = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]" + "/../..//android.widget.TextView[5]")).getText();
            double pri1 = Double.parseDouble(pri);
            double pri2 = qu1 * pri1;
            pri2 = Math.round(pri2)*100.00/100.00;
            quan.add(qu);
            price.add(pri);
//            doubleArr1.add(pri2);
        }

        ArrayList<Integer> intArrayList = new ArrayList<>();
        for (String s1 : quan) {
            intArrayList.add(Integer.parseInt(s1));
        }

        ArrayList<Double> doubleArr = new ArrayList<>();
        for (String s1 : price) {
            doubleArr.add(Double.parseDouble(s1));
        }
        System.out.println("--------------- price array : "+doubleArr);
        Collections.sort(doubleArr);
        System.out.println("--------------- Quantity array : "+intArrayList);
        System.out.println("--------------- price array - sorted : "+doubleArr);
        // Initialize a variable to hold the sum
        int sum = 0;



        for (Integer integer : intArrayList) {
            sum += integer;
        }

        int quu = Integer.parseInt(qty);
        System.out.println("--------------- Quantity : "+quu);
        int mod = sum / quu;
        System.out.println("--------------- Modular : "+mod);
        for(int i = 0; i < sa;i++){
            if(i < mod){
                double disc1 = Double.parseDouble(disc);

                disc1 = disc1/100;

                double d = doubleArr.get(i);

                double discountA = d * disc1;

                d = d - discountA;

                double tax1 = Double.parseDouble(tax);

                tax1 = tax1 /100;

                tax2 = d * tax1;
                tax4 += tax2;
                System.out.println("--------------- Tax1 : "+tax4);
            }else{

                double d = doubleArr.get(i);
                double tax1 = Double.parseDouble(tax);

                tax1 = tax1 /100;

                tax3 = d * tax1;
                tax4 += tax3;
                System.out.println("--------------- Tax2 : "+tax4);
            }
        }

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        return decimalFormat.format(tax4);
    }

    public void verifyThe_MixAndMatch_Tax_BeforeTax_SetPercentage_LeastExpensive(String tax,String percentage,String qty) throws Exception {
        String discountCalculated = getTheTax_MixAndMatch_BeforeTax_SetPercentage_LeastExpensive(tax,percentage,qty);
        double doubleValue = Double.parseDouble(discountCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        discountCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Tax is : " + discountCalculated);

        String discountActual = new RetailPOS_Order_Page().get_TaxAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Tax from the Retail Screen : " + discountActual);

        if (discountCalculated.equals(discountActual)) {
            test.log(LogStatus.PASS, "Calculated Tax is correct and the Discount is : " + discountActual);
        } else {
            double cal = Double.parseDouble(discountCalculated);
            double act = Double.parseDouble(discountActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated Tax  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) Tax  is : " + act);
            test.log(LogStatus.FAIL, "The difference in Tax  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver,test);
        }
    }

    public String getTheTotal_MixAndMatch_BeforeTax_SetPercentage_LeastExpensive(String tax, String disc,String qty) throws Exception {

        double sub = Double.parseDouble(getTheSubTotal());

        double disc1 = Double.parseDouble(getTheDiscount_MixAndMatch_AfterTax_SetPercentage_LeastExpensive(disc, qty));

        double tax1 = Double.parseDouble(getTheTax_MixAndMatch_BeforeTax_SetPercentage_LeastExpensive(tax, disc, qty));

        double tot = sub - disc1 + tax1;

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        return decimalFormat.format(tot);
    }

    public void verifyThe_MixAndMatch_Total_BeforeTax_SetPercentage_LeastExpensive(String tax,String percentage,String qty) throws Exception {
        String discountCalculated = getTheTotal_MixAndMatch_BeforeTax_SetPercentage_LeastExpensive(tax,percentage,qty);
        double doubleValue = Double.parseDouble(discountCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        discountCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Total is : " + discountCalculated);

        String discountActual = new RetailPOS_Order_Page().get_TotalAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Total from the Retail Screen : " + discountActual);

        if (discountCalculated.equals(discountActual)) {
            test.log(LogStatus.PASS, "Calculated Total is correct and the Total is : " + discountActual);
        } else {
            double cal = Double.parseDouble(discountCalculated);
            double act = Double.parseDouble(discountActual);
            double diff = act - cal;
            test.log(LogStatus.INFO, "The calculated Total  is : " + cal);
            test.log(LogStatus.INFO, "The actual(displayed) Total  is : " + act);
            test.log(LogStatus.FAIL, "The difference in Total  is : " + diff);
            ut.FailedCaptureScreenshotAsBASE64(driver,test);
        }
    }

}
