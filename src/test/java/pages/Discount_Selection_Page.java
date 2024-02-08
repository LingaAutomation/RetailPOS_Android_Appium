package pages;

import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.text.DecimalFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Discount_Selection_Page extends Appium_Base_Class{
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

    public WebElement getOrder_Screen_DiscountBtn() {return Order_Screen_DiscountBtn;}

    public WebElement getOrder_Screen_Discount_Value() {
        return Order_Screen_Discount_Value;
    }

    public WebElement getOrder_Screen_SubTotal_Value() {return Order_Screen_SubTotal_Value;}

    public WebElement getOrder_Screen_Tax_Value() {
        return Order_Screen_Tax_Value;
    }

    public WebElement getOrder_Screen_CancelBtn() {return Order_Screen_CancelBtn;}

    public WebElement getSearchBox_InDiscountScreen() {return SearchBox_InDiscountScreen;}

    public WebElement getOrder_Screen_Total_Value() {
        return Order_Screen_Total_Value;
    }

    public void searchTheDiscount(String discount){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //enter the discount in the search box
        getSearchBox_InDiscountScreen().sendKeys(discount);
    }

    public void clickTheRequiredDiscount(String discount) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //click the discount after the search
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@text='"+discount+"']")).click();
        Actions actions = new Actions(driver);
        actions.click(driver.findElement(By.xpath("//android.widget.Button[@text='"+discount+"']"))).build().perform();


        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //click the cancel button
        getOrder_Screen_CancelBtn().click();
    }

    public void ClickTheDiscount(){
        //click the discount button in the order screen
        getOrder_Screen_DiscountBtn().click();
    }

    public void Check_Values_Validations_With_Check_Based_Discount_After_Tax(String dis) throws Throwable {
        //Total price value calculated in float
        Float Calculated_Total_Price = Get_Price_Amount_For_Every_MenuItem(driver, "(//*[@text='X'])", "/../..//android.widget.TextView[5]");
        //Total total amount value calculated in float
        Float Calculated_Total_Amount = Get_Total_Amount_For_Every_MenuItem(driver, "(//*[@text='X'])", "/../..//android.widget.TextView[7]");
        //Total total amount value calculated in float
        double Calculated_Disc_Amount = Get_CheckBasedDisc_Amount_AfterTax_For_Every_MenuItem(driver, "(//*[@text='X'])", "/../..//android.widget.TextView[6]",dis);

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

            ut.PassedCaptureScreenshotAsBASE64(driver,test);

            // Print the actual value
            System.out.println("The Actual Sub-Total Value is : " + actual_SubTotal_Value);

            test.log(LogStatus.PASS, "The Actual Sub-Total Value is : " + actual_SubTotal_Value);
        }
        else {
            test.log(LogStatus.FAIL, "Actual and Expected Sub-Total values are different");
            ut.FailedCaptureScreenshotAsBASE64(driver,test);

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
        }
        else {
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
        }
        else {

            double diff = Calculated_Disc_Amount - disc1;

            test.log(LogStatus.FAIL, "Actual and Expected Discount values are different and the difference is : "+diff);

            // Print the different value
            System.out.println("Total Value different is : " + diff);
        }
    }

    public void Check_Values_Validations_With_MixAndMatch_Discount_After_Tax(String quantity,String dis) throws Throwable {
        //Total price value calculated in float
        Float Calculated_Total_Price = Get_Price_Amount_For_Every_MenuItem(driver, "(//*[@text='X'])", "/../..//android.widget.TextView[5]");
        //Total total amount value calculated in float
        Float Calculated_Total_Amount = Get_Total_Amount_For_Every_MenuItem(driver, "(//*[@text='X'])", "/../..//android.widget.TextView[7]");
        //Total total amount value calculated in float
        double Calculated_Disc_Amount = getTheDiscount_MixAndMatch( quantity,"(//*[@text='X'])",dis,"/../..//android.widget.TextView[6]");

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

            ut.PassedCaptureScreenshotAsBASE64(driver,test);

            // Print the actual value
            System.out.println("The Actual Sub-Total Value is : " + actual_SubTotal_Value);

            test.log(LogStatus.PASS, "The Actual Sub-Total Value is : " + actual_SubTotal_Value);
        }
        else {
            test.log(LogStatus.FAIL, "Actual and Expected Sub-Total values are different");
            ut.FailedCaptureScreenshotAsBASE64(driver,test);

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
        }
        else {
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

        Calculated_Disc_Amount = Math.round(Calculated_Disc_Amount*100.00)/100.00;

        // Check weather the Calculated Total amount and Actual Total amount is same or not
        if (Calculated_Disc_Amount == disc1) {
            test.log(LogStatus.PASS, "Actual and Expected Discount amount are same");

            // Print the actual value
            System.out.println("The Actual Discount Value is : " + disc1);

            test.log(LogStatus.PASS, "The Actual Discount Value is : " + disc1);
        }
        else {

            double diff = Calculated_Disc_Amount - disc1;

            test.log(LogStatus.INFO, "The Actual Discount Value is : " + disc1);
            test.log(LogStatus.INFO, "The Calculated Discount Value is : " + Calculated_Disc_Amount);
            test.log(LogStatus.FAIL, "Actual and Expected Discount values are different and the difference is : "+diff);

            // Print the different value
            System.out.println("Total Value different is : " + diff);
        }
    }

    public String getTheTotal(String tax){

        double subtotal,subtotal1=0;
        double calculatedTax,calculatedTax1=0,total = 0;

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

            subtotal = Math.round(subtotal*100.00)/100.00;

            System.out.println("Total for the Item("+item+") is : "+subtotal);

            subtotal1 += subtotal;

            System.out.println("Subtotal is : "+subtotal1);

            double ta = Double.parseDouble(tax);

            calculatedTax = subtotal * ta/100;

            calculatedTax =  Math.round(calculatedTax*100.00)/100.00;

            System.out.println("Tax for the Item("+item+") is : "+calculatedTax);

            calculatedTax1 += calculatedTax;

            System.out.println("Tax is : "+calculatedTax1);

            total = subtotal1 + calculatedTax1;

            total = Math.round(total*100.00)/100.00;

            System.out.println("Total value is : "+total);
        }

        try{
            String discountActual =  new RetailPOS_Order_Page().get_DiscountAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
            double disc = Double.parseDouble(discountActual);

            total = total - disc;

        }catch (Exception e){
            total = total+0;
        }

        return String.valueOf(total);
    }

    public void verifyTheTotal(String tax){
        String totalCalculated = getTheTotal(tax);
        double doubleValue = Double.parseDouble(totalCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        totalCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Total is : "+totalCalculated);

        String totalActual =  new RetailPOS_Order_Page().get_TotalAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Total from the Retail Screen : "+totalActual);

        if(totalCalculated.equals(totalActual)){
            test.log(LogStatus.PASS,"Calculated Total is correct and the total is : "+totalActual);
        }else{
            double cal = Double.parseDouble(totalCalculated);
            double act = Double.parseDouble(totalActual);
            double diff = act - cal;
            test.log(LogStatus.INFO,"The calculated total  is : "+cal);
            test.log(LogStatus.INFO,"The actual(displayed) total  is : "+act);
            test.log(LogStatus.FAIL,"The difference in total  is : "+diff);
        }
    }

    public String theDiscount_AfterTax_Amount(String amount){
        double discount,discount1 = 0;

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

            discount = Math.round(discount*100.00)/100.00;

            System.out.println("Discount for the Item("+item+") is : "+discount);

            discount1 += discount;

            System.out.println("Discount(After Tax) is : "+discount1);

        }
        return String.valueOf(discount1);
    }

    public void verifyTheDiscount_AfterTax_Amount(String amount){
        String discountCalculated = theDiscount_AfterTax_Amount(amount);
        double doubleValue = Double.parseDouble(discountCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        discountCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Discount is : "+discountCalculated);

        String discountActual =  new RetailPOS_Order_Page().get_DiscountAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Discount from the Retail Screen : "+discountActual);

        if(discountCalculated.equals(discountActual)){
            test.log(LogStatus.PASS,"Calculated Discount is correct and the Discount is : "+discountActual);
        }else{
            double cal = Double.parseDouble(discountCalculated);
            double act = Double.parseDouble(discountActual);
            double diff = act - cal;
            test.log(LogStatus.INFO,"The calculated Discount  is : "+cal);
            test.log(LogStatus.INFO,"The actual(displayed) Discount  is : "+act);
            test.log(LogStatus.FAIL,"The difference in Discount  is : "+diff);
        }
    }

    public String getTheSubTotal(){

        double subtotal,subtotal1=0;

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

            subtotal = Math.round(subtotal*100.00)/100.00;

            subtotal1 += subtotal;
            subtotal1 = Math.round(subtotal1*100.00)/100.00;
        }
        return String.valueOf(subtotal1);
    }

    public void verifyTheSubTotal(){
        String subTotalCalculated = getTheSubTotal();
        double doubleValue = Double.parseDouble(subTotalCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        subTotalCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated SubTotal is : "+subTotalCalculated);

        String subTotalActual =  new RetailPOS_Order_Page().get_SubtotalAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("SubTotal from the Retail Screen : "+subTotalActual);

        if(subTotalCalculated.equals(subTotalActual)){
            test.log(LogStatus.PASS,"Calculated SubTotal is correct and the SubTotal is : "+subTotalActual);
        }else{
            double cal = Double.parseDouble(subTotalCalculated);
            double act = Double.parseDouble(subTotalActual);
            double diff = act - cal;
            test.log(LogStatus.INFO,"The calculated SubTotal  is : "+cal);
            test.log(LogStatus.INFO,"The actual(displayed) SubTotal  is : "+act);
            test.log(LogStatus.FAIL,"The difference in SubTotal  is : "+diff);
        }
    }

    public String getTheTax(String tax){

        double subtotal;
        double calculatedTax,calculatedTax1=0;

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

            subtotal = Math.round(subtotal*100.00)/100.00;

            double ta = Double.parseDouble(tax);

            calculatedTax = subtotal * ta/100;

            calculatedTax =  Math.round(calculatedTax*100.00)/100.00;

            calculatedTax1 += calculatedTax;
            calculatedTax1 =  Math.round(calculatedTax1*100.00)/100.00;
        }
        return String.valueOf(calculatedTax1);
    }

    public void verifyTheTax(String tax){
        String taxCalculated = getTheTax(tax);
        double doubleValue = Double.parseDouble(taxCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        taxCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Tax is : "+taxCalculated);

        String taxActual =  new RetailPOS_Order_Page().get_TaxAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Tax from the Retail Screen : "+taxActual);

        if(taxCalculated.equals(taxActual)){
            test.log(LogStatus.PASS,"Calculated Tax is correct and the Tax is : "+taxActual);
        }else{
            double cal = Double.parseDouble(taxCalculated);
            double act = Double.parseDouble(taxActual);
            double diff = act - cal;
            test.log(LogStatus.INFO,"The calculated Tax  is : "+cal);
            test.log(LogStatus.INFO,"The actual(displayed) Tax  is : "+act);
            test.log(LogStatus.FAIL,"The difference in Tax  is : "+diff);
        }
    }

    public String theDiscount_AfterTax_SetPercentage(String percentage){
        double discount,discount1 = 0,total;

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

            total = Math.round(total*100.00)/100.00;

            double discAmt = Double.parseDouble(percentage);

            discAmt = discAmt/100.00;

            discAmt = Math.round(discAmt*100.00)/100.00;

            discount = total * discAmt;

            discount = Math.round(discount*100.00)/100.00;

            System.out.println("Discount for the Item("+item+") is : "+discount);

            discount1 += discount;

            System.out.println("Discount(After Tax) is : "+discount1);

        }
        return String.valueOf(discount1);
    }

    public void verifyTheDiscount_AfterTax_SetPercentage(String percentage){
        String discountCalculated = theDiscount_AfterTax_SetPercentage(percentage);
        double doubleValue = Double.parseDouble(discountCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        discountCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Discount is : "+discountCalculated);

        String discountActual =  new RetailPOS_Order_Page().get_DiscountAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Discount from the Retail Screen : "+discountActual);

        if(discountCalculated.equals(discountActual)){
            test.log(LogStatus.PASS,"Calculated Discount is correct and the Discount is : "+discountActual);
        }else{
            double cal = Double.parseDouble(discountCalculated);
            double act = Double.parseDouble(discountActual);
            double diff = act - cal;
            test.log(LogStatus.INFO,"The calculated Discount  is : "+cal);
            test.log(LogStatus.INFO,"The actual(displayed) Discount  is : "+act);
            test.log(LogStatus.FAIL,"The difference in Discount  is : "+diff);
        }
    }

    public String theDiscount_AfterTax_SetPrice(String setPrice){
        double discount,discount1 = 0,total;

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

            total = Math.round(total*100.00)/100.00;

            double discAmt = Double.parseDouble(setPrice);

            discAmt = Math.round(discAmt*100.00)/100.00;

            discount = total - discAmt;

            discount = Math.round(discount*100.00)/100.00;

            System.out.println("Discount for the Item("+item+") is : "+discount);

            discount1 += discount;

            System.out.println("Discount(After Tax) is : "+discount1);

        }
        return String.valueOf(discount1);
    }

    public void verifyTheDiscount_AfterTax_SetPrice(String percentage){
        String discountCalculated = theDiscount_AfterTax_SetPrice(percentage);
        double doubleValue = Double.parseDouble(discountCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        discountCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Discount is : "+discountCalculated);

        String discountActual =  new RetailPOS_Order_Page().get_DiscountAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Discount from the Retail Screen : "+discountActual);

        if(discountCalculated.equals(discountActual)){
            test.log(LogStatus.PASS,"Calculated Discount is correct and the Discount is : "+discountActual);
        }else{
            double cal = Double.parseDouble(discountCalculated);
            double act = Double.parseDouble(discountActual);
            double diff = act - cal;
            test.log(LogStatus.INFO,"The calculated Discount  is : "+cal);
            test.log(LogStatus.INFO,"The actual(displayed) Discount  is : "+act);
            test.log(LogStatus.FAIL,"The difference in Discount  is : "+diff);
        }
    }

    public void verifyTheDiscount_AfterTax_FreeItem(){

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

        sa1 = sa1/7;

        if(sa == sa1){
            test.log(LogStatus.PASS,"Free Item Added successfully in the retail screen");
        }else{
            test.log(LogStatus.FAIL,"Free Item not Added properly in the retail screen");
        }

        try {
            if(new RetailPOS_Order_Page().getOrder_Screen_Discount_Value().isDisplayed()){
                test.log(LogStatus.FAIL,"Discount field is displayed in the subtotal calculation section, when user apply the free item");
            }
        }catch (Exception e){
            test.log(LogStatus.PASS,"Discount field is not displayed in the subtotal calculation section, when user apply the free item");
        }
    }

    public String getTheTax_BeforeTaxDiscount(String tax, String discountAmount){

        double subtotal, tax1;
        double calculatedTax,calculatedTax1=0;

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

            subtotal = Math.round(subtotal*100.00)/100.00;

            double price1 = Double.parseDouble(discountAmount);

            tax1 = subtotal - price1;

            tax1 = Math.round(tax1*100.00)/100.00;

            double ta = Double.parseDouble(tax);

            calculatedTax = tax1 * ta/100;

            calculatedTax =  Math.round(calculatedTax*100.00)/100.00;

            calculatedTax1 += calculatedTax;
            calculatedTax1 =  Math.round(calculatedTax1*100.00)/100.00;
        }
        return String.valueOf(calculatedTax1);
    }

    public void verifyTheTax_BeforeTaxDiscount(String tax, String discountAmount){
        String taxCalculated = getTheTax_BeforeTaxDiscount(tax,discountAmount);
        double doubleValue = Double.parseDouble(taxCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        taxCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Tax is : "+taxCalculated);

        String taxActual =  new RetailPOS_Order_Page().get_TaxAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Tax from the Retail Screen : "+taxActual);

        if(taxCalculated.equals(taxActual)){
            test.log(LogStatus.PASS,"Calculated Tax is correct and the Tax is : "+taxActual);
        }else{
            double cal = Double.parseDouble(taxCalculated);
            double act = Double.parseDouble(taxActual);
            double diff = act - cal;
            test.log(LogStatus.INFO,"The calculated Tax  is : "+cal);
            test.log(LogStatus.INFO,"The actual(displayed) Tax  is : "+act);
            test.log(LogStatus.FAIL,"The difference in Tax  is : "+diff);
        }
    }

    public void verifyTheTotal_BeforeTaxDiscount(String tax,String disc){
        double tot;

        String taxCalculated = getTheTax_BeforeTaxDiscount(tax, disc);
        double doubleValue = Double.parseDouble(taxCalculated);
//
//        DecimalFormat decimalFormat = new DecimalFormat("0.00");
//        taxCalculated = decimalFormat.format(doubleValue);

        String subTotalCalculated = getTheSubTotal();
        double doubleValue1 = Double.parseDouble(subTotalCalculated);
//
//        DecimalFormat decimalFormat = new DecimalFormat("0.00");
//        subTotalCalculated = decimalFormat.format(doubleValue1);

        String discountCalculated = theDiscount_AfterTax_Amount(disc);
        double doubleValue2 = Double.parseDouble(discountCalculated);

        tot = doubleValue + doubleValue1 - doubleValue2;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        String totalCalculated;
        totalCalculated = decimalFormat.format(tot);

        System.out.println(" Calculated Total is : "+totalCalculated);

        String totalActual =  new RetailPOS_Order_Page().get_TotalAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Total from the Retail Screen : "+totalActual);

        if(totalCalculated.equals(totalActual)){
            test.log(LogStatus.PASS,"Calculated Total is correct and the total is : "+totalActual);
        }else{
            double cal = Double.parseDouble(totalCalculated);
            double act = Double.parseDouble(totalActual);
            double diff = act - cal;
            test.log(LogStatus.INFO,"The calculated total  is : "+cal);
            test.log(LogStatus.INFO,"The actual(displayed) total  is : "+act);
            test.log(LogStatus.FAIL,"The difference in total  is : "+diff);
        }
    }

    public String getTheTax_BeforeTaxDiscount_Percentage(String tax, String disc){

        double subtotal, tax1;
        double calculatedTax,calculatedTax1=0;

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

            subtotal = Math.round(subtotal*100.00)/100.00;

            double price1 = Double.parseDouble(disc);

            price1 = price1/100;

            price1 = Math.round(price1*100.00)/100.00;

            tax1 = subtotal - price1;

            tax1 = Math.round(tax1*100.00)/100.00;

            double ta = Double.parseDouble(tax);

            calculatedTax = tax1 * ta/100;

            calculatedTax =  Math.round(calculatedTax*100.00)/100.00;

            calculatedTax1 += calculatedTax;
            calculatedTax1 =  Math.round(calculatedTax1*100.00)/100.00;
        }
        return String.valueOf(calculatedTax1);
    }

    public void verifyTheTax_BeforeTaxDiscount_Percentage(String tax, String disc){
        String taxCalculated = getTheTax_BeforeTaxDiscount_Percentage(tax,disc);
        double doubleValue = Double.parseDouble(taxCalculated);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        taxCalculated = decimalFormat.format(doubleValue);
        System.out.println(" Calculated Tax is : "+taxCalculated);

        String taxActual =  new RetailPOS_Order_Page().get_TaxAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Tax from the Retail Screen : "+taxActual);

        if(taxCalculated.equals(taxActual)){
            test.log(LogStatus.PASS,"Calculated Tax is correct and the Tax is : "+taxActual);
        }else{
            double cal = Double.parseDouble(taxCalculated);
            double act = Double.parseDouble(taxActual);
            double diff = act - cal;
            test.log(LogStatus.INFO,"The calculated Tax  is : "+cal);
            test.log(LogStatus.INFO,"The actual(displayed) Tax  is : "+act);
            test.log(LogStatus.FAIL,"The difference in Tax  is : "+diff);
        }
    }

    public void verifyTheTotal_BeforeTaxDiscount_Percentage(String tax,String disc){
        double tot;

        String taxCalculated = getTheTax_BeforeTaxDiscount_Percentage(tax, disc);
        double doubleValue = Double.parseDouble(taxCalculated);
//
//        DecimalFormat decimalFormat = new DecimalFormat("0.00");
//        taxCalculated = decimalFormat.format(doubleValue);

        String subTotalCalculated = getTheSubTotal();
        double doubleValue1 = Double.parseDouble(subTotalCalculated);
//
//        DecimalFormat decimalFormat = new DecimalFormat("0.00");
//        subTotalCalculated = decimalFormat.format(doubleValue1);

        String discountCalculated = theDiscount_AfterTax_Amount(disc);
        double doubleValue2 = Double.parseDouble(discountCalculated);

        tot = doubleValue + doubleValue1 - doubleValue2;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        String totalCalculated;
        totalCalculated = decimalFormat.format(tot);

        System.out.println(" Calculated Total is : "+totalCalculated);

        String totalActual =  new RetailPOS_Order_Page().get_TotalAmount().replaceAll("[a-zA-Z $₹£,:]", "").substring(1);
        System.out.println("Total from the Retail Screen : "+totalActual);

        if(totalCalculated.equals(totalActual)){
            test.log(LogStatus.PASS,"Calculated Total is correct and the total is : "+totalActual);
        }else{
            double cal = Double.parseDouble(totalCalculated);
            double act = Double.parseDouble(totalActual);
            double diff = act - cal;
            test.log(LogStatus.INFO,"The calculated total  is : "+cal);
            test.log(LogStatus.INFO,"The actual(displayed) total  is : "+act);
            test.log(LogStatus.FAIL,"The difference in total  is : "+diff);
        }
    }
}
