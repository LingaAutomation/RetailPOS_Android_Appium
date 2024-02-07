package pages;

import java.text.DecimalFormat;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utility.Utility;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Appium_Base_Class {

	public AppiumDriver driver;
	public ExtentTest test;
	Utility ut = new Utility();
	Float Total_Price_Amount = 0.0f;
	Float total_Total_Amount = 0.0f;
	
	double totAmount = 0.00;
	double discAmount = 0.00;

	public Appium_Base_Class() {

		if(driver==null) {
			this.driver = new DriverManager().getDriver();
		}
		if(test == null){
			this.test = new DriverManager().getTest();
		}
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
	}


	public void click_Ele(WebElement ele) {
		ele.click();
	}

	public void send_data(WebElement ele, String data) {
		ele.clear();
		ele.sendKeys(data);
	}
	
	public void ClearData_inputBOX(WebElement ele) {
		ele.clear();
	}

	public static void AssertMethod(WebElement ele) {
		try {
			Assert.assertFalse(ele.isDisplayed());
		}catch (Exception ignored) {}
	}

	public void Random_Selection1(AppiumDriver driver, String xpath) throws Throwable {

		// Getting list of options
		List<?> itemsInDropdown = driver.findElements(By.xpath("" + xpath + ""));

		// Getting size of options available
		int size = itemsInDropdown.size();

		// Generate a random number with in range
		int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

		// Selecting random value
		click_Ele((WebElement) itemsInDropdown.get(randnMumber));
	}

	public void Random_Selection(AppiumDriver driver, String xpath) throws Throwable {

		// Getting list of options
		List<?> itemsInDropdown = driver.findElements(By.xpath("" + xpath + ""));

		// Getting size of options available
		int size = itemsInDropdown.size();

		// Generate a random number with in range
		int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

		// Selecting random value
		click_Ele((WebElement) itemsInDropdown.get(randnMumber));

		Thread.sleep(1000);

		try {
			if (driver.findElement(By.xpath("(//android.view.View[2]/android.view.View/android.view.View/android.view.View)//android.widget.Button/..")).isDisplayed() && driver.findElement(By.xpath("//*[contains(@text,'SELECT OPTIONS')]")).isDisplayed()) {
//				System.out.println("sasasasawwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwsasasasasasasasasasasasasas");
				//get the number of rows available in the kit assembly page
				List<?> ListOfAttributes = driver.findElements(By.xpath("(//android.view.View[2]/android.view.View/android.view.View/android.view.View)//android.widget.Button/.."));

				System.out.println("Arributes List Size : " + ListOfAttributes.size());

				for (int i = 1; i <= ListOfAttributes.size(); i++) {

					List<?> ListOfAttributesmapped = driver.findElements(By.xpath("(//android.view.View[2]/android.view.View/android.view.View/android.view.View)[" + i + "]//android.widget.Button"));

					System.out.println("Lists of Mapped" + ListOfAttributesmapped.size());

					// Generate a random number with in range
					int randnMumber1 = ThreadLocalRandom.current().nextInt(0, ListOfAttributesmapped.size() - 1);
					//System.out.println("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu "+randnMumber1);
//					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", (WebElement) ListOfAttributesmapped.get(randnMumber1));
//					Thread.sleep(500);

//					scrollToElementPayments(String.valueOf((WebElement) ListOfAttributesmapped.get(randnMumber1)),"down");

//					TouchAction
					// Selecting random value
					click_Ele((WebElement) ListOfAttributesmapped.get(randnMumber1));

//						String selcted_Attribute = driver.findElement(By.xpath("//*[@focused='true']")).getText();

				}

				Thread.sleep(1000);
				click_Ele((WebElement) driver.findElement(By.xpath("//*[contains(@text,'DONE')]")));
			}
		} catch (Exception ignored) {
		}

	}

	public void selectOptions() throws InterruptedException {

		try{
			if (driver.findElement(By.xpath("(//android.view.View[2]/android.view.View/android.view.View/android.view.View)//android.widget.Button/..")).isDisplayed() && driver.findElement(By.xpath("//*[contains(@text,'SELECT OPTIONS')]")).isDisplayed()) {
//				System.out.println("sasasasawwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwsasasasasasasasasasasasasas");
				//get the number of rows available in the kit assembly page
				List<?> ListOfAttributes = driver.findElements(By.xpath("(//android.view.View[2]/android.view.View/android.view.View/android.view.View)//android.widget.Button/.."));

				System.out.println("Arributes List Size : " + ListOfAttributes.size());

				for (int i = 1; i <= ListOfAttributes.size(); i++) {

					List<?> ListOfAttributesmapped = driver.findElements(By.xpath("(//android.view.View[2]/android.view.View/android.view.View/android.view.View)[" + i + "]//android.widget.Button"));

					System.out.println("Lists of Mapped" + ListOfAttributesmapped.size());

					// Generate a random number with in range
					int randnMumber1 = ThreadLocalRandom.current().nextInt(0, ListOfAttributesmapped.size() - 1);
					//System.out.println("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu "+randnMumber1);
//					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", (WebElement) ListOfAttributesmapped.get(randnMumber1));
//					Thread.sleep(500);

//					scrollToElementPayments(String.valueOf((WebElement) ListOfAttributesmapped.get(randnMumber1)),"down");

//					TouchAction
					// Selecting random value
					click_Ele((WebElement) ListOfAttributesmapped.get(randnMumber1));

//						String selcted_Attribute = driver.findElement(By.xpath("//*[@focused='true']")).getText();

				}

				Thread.sleep(2000);
				click_Ele((WebElement) driver.findElement(By.xpath("//*[contains(@text,'DONE')]")));
			}
		}catch (Exception ignored){

		}


	}

	public void Random_Selection_KitAssembly(AppiumDriver driver, String xpath) throws Throwable {

		// Getting list of options
		List<?> itemsInDropdown = driver.findElements(By.xpath("" + xpath + ""));

		// Getting size of options available
		int size = itemsInDropdown.size();

		// Generate a random number with in range
		int randnMumber = ThreadLocalRandom.current().nextInt(1, size);

		// Selecting random value
		click_Ele((WebElement) itemsInDropdown.get(randnMumber));Thread.sleep(3000);
		System.out.println("Menu item clicked");

		try {
//			System.out.println("sasasasasasasasasasasasasasasasasas");
			if (driver.findElement(By.xpath("(//android.view.View[2]/android.view.View/android.view.View/android.view.View)//android.widget.Button/..")).isDisplayed() && driver.findElement(By.xpath("//*[contains(@text,'SELECT OPTIONS')]")).isDisplayed()) {
//				System.out.println("sasasasawwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwsasasasasasasasasasasasasas");
				//get the number of rows available in the kit assembly page
				List<?> ListOfAttributes = driver.findElements(By.xpath("(//android.view.View[2]/android.view.View/android.view.View/android.view.View)//android.widget.Button/.."));

				System.out.println("Arributes List Size : "+ListOfAttributes.size());

				for (int i = 1; i <= ListOfAttributes.size(); i++) {

					List<?> ListOfAttributesmapped = driver.findElements(By.xpath("(//android.view.View[2]/android.view.View/android.view.View/android.view.View)["+i+"]//android.widget.Button"));

					System.out.println("Lists of Mapped"+ListOfAttributesmapped.size());

					// Generate a random number with in range
					int randnMumber1 = ThreadLocalRandom.current().nextInt(0, ListOfAttributesmapped.size()-1);
					//System.out.println("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu "+randnMumber1);
//					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", (WebElement) ListOfAttributesmapped.get(randnMumber1));
//					Thread.sleep(500);

//					scrollToElementPayments(String.valueOf((WebElement) ListOfAttributesmapped.get(randnMumber1)),"down");

//					TouchAction
					// Selecting random value
					click_Ele((WebElement) ListOfAttributesmapped.get(randnMumber1));

//						String selcted_Attribute = driver.findElement(By.xpath("//*[@focused='true']")).getText();

				}

				Thread.sleep(2000);
				click_Ele((WebElement) driver.findElement(By.xpath("//*[contains(@text,'DONE')]")));
			} else {

				int i = 1/0;

			}

		} catch (Exception ignored) {
		}

//		click_Ele((WebElement) driver.findElement(By.xpath("//*[@text='CANCEL']")));
	}
	
	

	
	public void Random_ForMultipule_Selection(AppiumDriver driver, String xpath) throws Throwable {

		// Getting list of options
		List<?> itemsInDropdown = driver.findElements(By.xpath("" + xpath + ""));

		// Getting size of options available
		int size = itemsInDropdown.size();

		Thread.sleep(2000);

			// Generate a random number with in range
			int randnMumber = ThreadLocalRandom.current().nextInt(2, size);
			if(randnMumber<1){
				randnMumber = 2;
			}
			for(int i = 2; i <= randnMumber;i++){
				click_Ele((WebElement) itemsInDropdown.get(i));
			}

	}
	
	public void Click_and_close_ParkedSales(AppiumDriver driver, String xpath) throws Throwable {
		
		        // Getting list of options
				List<?> itemsInDropdown = driver.findElements(By.xpath("" + xpath + ""));

				// Getting size of options available
				int size = itemsInDropdown.size();

				System.out.println(size);

				// for loop for clicking on every time in the list
				for (int i = 1; i <= size; i++) {

					driver.findElement(By.xpath("" + xpath + "[" + 1 + "]")).click();Thread.sleep(1000);

					new Standard_Item_POS_Page().Cash_Payment_Selection_And_Completed();
					if(i != size) {
						click_Ele((WebElement) driver.findElement(By.xpath("//*[@text='Retrieve Sale']")));
					}
						Thread.sleep(1000);
				}

				Thread.sleep(2000);
		
		

	}

	public void click_On_EveryItem_INLIST(AppiumDriver driver, String xpath) throws Throwable {

		// Getting list of options
		List<?> itemsInDropdown = driver.findElements(By.xpath("" + xpath + ""));

		// Getting size of options available
		int size = itemsInDropdown.size();

		System.out.println(size);

		// for loop for clicking on every time in the list
		for (int i = 1; i <= size; i++) {

			driver.findElement(By.xpath("" + xpath + "[" + 1 + "]")).click();
			Thread.sleep(1000);
		}

		Thread.sleep(2000);

	}
	
	public void Removing_Sing_MenuItem() throws Throwable {

		Thread.sleep(1000);
			driver.findElement(By.xpath("(//*[@text='X'])[1]")).click();
		Thread.sleep(2000);

	}

	public Float Get_Price_Amount_For_Every_MenuItem(AppiumDriver driver, String xpath, String xpath2)
			throws Throwable {

		// Getting list of options
		//List<?> itemsInDropdown = driver.findElements(By.xpath("" + xpath + ""));
		List<Float> Price_Amount_List = new ArrayList<Float>();
		List<Float> Menu_Quntaity_List = new ArrayList<Float>();
		List<Float> Calculated_Price_Amount = new ArrayList<Float>();
		Float total_SubTotal_Value = 0.0f;
		
        //Removing Icon Count
		List<?> itemsInDropdownForRemovingMenu = driver.findElements(By.xpath("(//*[@text='X'])"));
		
		int CountForRemovingIcon = itemsInDropdownForRemovingMenu.size();

		// Getting size of options available
		//int size = itemsInDropdown.size() - CountForRemovingIcon;

		System.out.println(CountForRemovingIcon);
		
		//For Loop for getting the quantity for the Menu Items
		for (int i = 1; i <= CountForRemovingIcon; i++) {

			String Price_Amount = driver.findElement(By.xpath("" + xpath + "[" + i + "]" + "/../..//android.widget.TextView[4]")).getText();
			String Report_Taxes = Price_Amount.replaceAll("[a-zA-Z $₹£,:]", "");
			float gobal_actual = Float.parseFloat(Report_Taxes);
			Menu_Quntaity_List.add(gobal_actual);
			System.out.println("Quantity List " + gobal_actual);

			Thread.sleep(1000);
		}

		// for loop for clicking on every time in the list
		for (int i = 1; i <= CountForRemovingIcon; i++) {

			String Price_Amount = driver.findElement(By.xpath("" + xpath + "[" + i + "]" + xpath2)).getText();
			String Report_Taxes = Price_Amount.replaceAll("[a-zA-Z $₹£,:]", "");
			float gobal_actual = Float.parseFloat(Report_Taxes);
			Price_Amount_List.add(gobal_actual);
			System.out.println("sum 2 " + gobal_actual);

			Thread.sleep(1000);
		}
		
		for (int i = 0; i < CountForRemovingIcon; i++) {
			
			float value = Menu_Quntaity_List.get(i)*Price_Amount_List.get(i);
			Calculated_Price_Amount.add(value);
			System.out.println("Added value of Subtotal : "+Calculated_Price_Amount);
			Thread.sleep(1000);
		}

//		for(int i = 0; i < Calculated_Price_Amount.size(); i++) {
//			total_SubTotal_Value += Calculated_Price_Amount.get(i);
//		}

		for (Float aFloat : Calculated_Price_Amount) {
			total_SubTotal_Value += aFloat;

		}

		Thread.sleep(2000);
		
		System.out.println("**Calculated Total price Amount**: "+total_SubTotal_Value);
		
		//DecimalFormat df = new DecimalFormat("0.00");
		float Total_Calculated_Sub_Total_Value = (float) (Math.round(total_SubTotal_Value * 100.00)/100.00);
		
		 // DecimalFormat, default is RoundingMode.HALF_EVEN
//	      System.out.println("Total Calculated Sub Total Value: " + df.format(total_SubTotal_Value)); 
	      
	      this.Total_Price_Amount = Total_Calculated_Sub_Total_Value;
	      
	      System.out.println("**Calculated Total price Amount with tow decimal conversion**: "+Total_Calculated_Sub_Total_Value);

		  return Total_Calculated_Sub_Total_Value;

	}
	
	public Float Get_Total_Amount_For_Every_MenuItem(AppiumDriver driver, String xpath, String xpath2)
			throws Throwable {

		// Getting list of options
//		List<?> itemsInDropdown = driver.findElements(By.xpath("" + xpath + ""));
		List<Float> Total_Amount_List = new ArrayList<Float>();
		Float toatl_Amount_Value = 0.0f;

		// Getting size of options available
//		int size = itemsInDropdown.size() / 2;
		
		//Removing Icon Count
				List<?> itemsInDropdownForRemovingMenu = driver.findElements(By.xpath("(//*[@text='X'])"));
				
				int CountForRemovingIcon = itemsInDropdownForRemovingMenu.size();

		System.out.println(CountForRemovingIcon);
		
		

		// for loop for clicking on every time in the list
		for (int i = 1; i <= CountForRemovingIcon; i++) {

			String Total_Amount = driver.findElement(By.xpath("" + xpath + "[" + i + "]" + xpath2)).getText();
			String Report_Taxes = Total_Amount.replaceAll("[a-zA-Z $ ₹ £ , :]", "");
			float gobal_actual = Float.parseFloat(Report_Taxes);
			Total_Amount_List.add(gobal_actual);
			System.out.println("sum 2 " + gobal_actual);

			Thread.sleep(1000);
		}

		for (int i = 0; i < Total_Amount_List.size(); i++) {
			toatl_Amount_Value += Total_Amount_List.get(i);

		}

		System.out.println("**Calculated Total Amount**: "+toatl_Amount_Value);
		
//		DecimalFormat df = new DecimalFormat("0.00");
		
		float Total_Calculated_Total_Value = (float) (Math.round(toatl_Amount_Value * 100.00)/100.00);
		
		 // DecimalFormat, default is RoundingMode.HALF_EVEN
//	      System.out.println("Total Calculated Total Value: " + df.format(toatl_Amount_Value)); 
	      
	      this.total_Total_Amount = Total_Calculated_Total_Value;
	      
	      System.out.println("**Calculated Total Amount with two decimal conversion**: "+Total_Calculated_Total_Value);

		  return Total_Calculated_Total_Value;

	}
	
	public double Get_ItemBasedDisc_Amount_AfterTax_For_Every_MenuItem(AppiumDriver driver, String xpath, String xpath2, String disc)
			throws Throwable {

		// Getting list of options
		List<Double> Total_Amount_List = new ArrayList<Double>();
		List<Double> Total_Disc_List = new ArrayList<Double>();
		
		double toatl_Amount_Value = 0.00;
		double toatl_Disc_Value = 0.00;

		//Removing Icon Count
				List<?> itemsInDropdownForRemovingMenu = driver.findElements(By.xpath("(//*[@text='X'])"));
				
				int CountForRemovingIcon = itemsInDropdownForRemovingMenu.size();

		System.out.println(CountForRemovingIcon);
		
		
		// for loop for clicking on every time in the list
		for (int i = 1; i <= CountForRemovingIcon; i++) {
			
			String Qty = driver.findElement(By.xpath("" + xpath + "[" + i + "]/../..//android.widget.TextView[4]")).getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "");
			double AQty = Double.parseDouble(Qty);
			
			String subt = driver.findElement(By.xpath("" + xpath + "[" + i + "]/../..//android.widget.TextView[5]")).getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "");
			double Asubt = Double.parseDouble(subt);
			
			double price = AQty * Asubt;
			price = Math.round(price*100.00)/100.00;

			double AdiscPer = Double.parseDouble(disc);
			
			double Disc = price * (AdiscPer / 100);
			Disc = Math.round(Disc*100.00)/100.00;
			System.out.println("The Calculated Discount Value for the Item "+i+" is : "+Disc);
			
			String taxPer = Utility.getProperty("Exclusive_Tax_Percentage");
			double AtaxPer = Double.parseDouble(taxPer);
			
			double Tax = price * (AtaxPer / 100);
			Tax = Math.round(Tax*100.00)/100.00;
			System.out.println("The Calculated Tax Value for the Item "+i+" is : "+Tax);
			
			double Total = (price - Disc) + Tax;
			Total = Math.round(Total*100.00)/100.00;
			System.out.println("The Calculated Total Value for the Item "+i+" is : "+Total);
			
			
			String Disc_Amount = driver.findElement(By.xpath("" + xpath + "[" + i + "]"+xpath2)).getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "");
			double ActDisc = Double.parseDouble(Disc_Amount);
			
			String Total_Amount = driver.findElement(By.xpath("" + xpath + "[" + i + "]/../..//android.widget.TextView[7]")).getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "");
			double ActTot = Double.parseDouble(Total_Amount);

			
			if(Disc == ActDisc || Total == ActTot)
			{
				System.out.println("Discount and Total Values are calculated for the Item "+i+" and the values are : "+Disc+"(Discount) and "+Total+"(Total)");
				Total_Amount_List.add(Total);
				Total_Disc_List.add(Disc);
				
				System.out.println("The values are (Discount and Total) : " + Disc+ " "+Total);
			}

			Thread.sleep(1000);
		}

		for (int i = 0; i < Total_Amount_List.size(); i++) {
			
			toatl_Disc_Value += Total_Disc_List.get(i);
			toatl_Amount_Value += Total_Amount_List.get(i);

		}

		System.out.println("**Calculated Disc Amount**: "+toatl_Disc_Value);
		System.out.println("**Calculated Total Amount**: "+toatl_Amount_Value);
		
//		DecimalFormat df = new DecimalFormat("0.00");
		
		double Total_Calculated_Disc_Value = (double) (Math.round(toatl_Disc_Value * 100.00)/100.00);
		
		double Total_Calculated_Total_Value = (double) (Math.round(toatl_Amount_Value * 100.00)/100.00);
		 // DecimalFormat, default is RoundingMode.HALF_EVEN
//	      System.out.println("Total Calculated Total Value: " + df.format(toatl_Amount_Value)); 
	      
	      this.totAmount = Total_Calculated_Total_Value;
	      
	      this.discAmount = Total_Calculated_Disc_Value;
	      
	      System.out.println("**Calculated Discount Amount with two decimal conversion**: "+Total_Calculated_Disc_Value);

	      System.out.println("**Calculated Total Amount with two decimal conversion**: "+Total_Calculated_Total_Value);

		  return Total_Calculated_Disc_Value;

	}

	public String getTheRetailItems(){

		List<String> menus = new ArrayList<>();

		//Removing Icon Count
		List<?> itemsInDropdownForRemovingMenu = driver.findElements(By.xpath("(//*[@text='X'])"));

		int CountForRemovingIcon = itemsInDropdownForRemovingMenu.size();

		System.out.println(CountForRemovingIcon);

		// for loop for clicking on every time in the list
		for (int i = 1; i <= CountForRemovingIcon; i++) {

			String menu = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]/../..//android.widget.TextView[1]")).getText();

			menus.add(menu);
		}

		return menus.toString();
	}

	public String getTheQuantityOfRetailItems(){

		List<String> q = new ArrayList<>();

		//Removing Icon Count
		List<?> itemsInDropdownForRemovingMenu = driver.findElements(By.xpath("(//*[@text='X'])"));

		int CountForRemovingIcon = itemsInDropdownForRemovingMenu.size();

		System.out.println(CountForRemovingIcon);

		// for loop for clicking on every time in the list
		for (int i = 1; i <= CountForRemovingIcon; i++) {

			String qa = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]/../..//android.widget.TextView[4]")).getText();

			q.add(qa);
		}

		return q.toString();
	}

	public String getTheTotalOfRetailItems(){

		List<String> tot = new ArrayList<>();

		//Removing Icon Count
		List<?> itemsInDropdownForRemovingMenu = driver.findElements(By.xpath("(//*[@text='X'])"));

		int CountForRemovingIcon = itemsInDropdownForRemovingMenu.size();

		System.out.println(CountForRemovingIcon);

		// for loop for clicking on every time in the list
		for (int i = 1; i <= CountForRemovingIcon; i++) {

			String total = driver.findElement(By.xpath("(//*[@text='X'])[" + i + "]/../..//android.widget.TextView[7]")).getText();

			tot.add(total);
		}

		return tot.toString();
	}

	public double Get_CheckBasedDisc_Amount_AfterTax_For_Every_MenuItem(AppiumDriver driver, String xpath, String xpath2, String disc)
			throws Throwable {

		// Getting list of options
		List<Double> Total_Price_List = new ArrayList<Double>();
		List<Double> Total_Disc_List = new ArrayList<Double>();

		double toatl_Amount_Value = 0.00;
		double toatl_Disc_Value = 0.00;

		//Removing Icon Count
		List<?> itemsInDropdownForRemovingMenu = driver.findElements(By.xpath("(//*[@text='X'])"));

		int CountForRemovingIcon = itemsInDropdownForRemovingMenu.size();

		System.out.println(CountForRemovingIcon);


		// for loop for clicking on every time in the list
		for (int i = 1; i <= CountForRemovingIcon; i++) {

			String Qty = driver.findElement(By.xpath("" + xpath + "[" + i + "]/../..//android.widget.TextView[4]")).getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "");
			double AQty = Double.parseDouble(Qty);

			String subt = driver.findElement(By.xpath("" + xpath + "[" + i + "]/../..//android.widget.TextView[5]")).getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "");
			double Asubt = Double.parseDouble(subt);

			double price = AQty * Asubt;
			price = Math.round(price*100.00)/100.00;

			double AdiscPer = Double.parseDouble(disc);

			double Disc = price * (AdiscPer / 100);
			Disc = Math.round(Disc*100.00)/100.00;
			System.out.println("The Calculated Discount Value for the Item "+i+" is : "+Disc);




//			String taxPer = Utility.getProperty("Exclusive_Tax_Percentage");
//			double AtaxPer = Double.parseDouble(taxPer);
//
//			double Tax = price * (AtaxPer / 100);
//			Tax = Math.round(Tax*100.00)/100.00;
//			System.out.println("The Calculated Tax Value for the Item "+i+" is : "+Tax);
//
//			double Total = (price - Disc) + Tax;
//			Total = Math.round(Total*100.00)/100.00;
//			System.out.println("The Calculated Total Value for the Item "+i+" is : "+Total);


			String Disc_Amount = driver.findElement(By.xpath("" + xpath + "[" + i + "]"+xpath2)).getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "");
			double ActDisc = Double.parseDouble(Disc_Amount);

//			String Total_Amount = driver.findElement(By.xpath("" + xpath + "[" + i + "]/../..//android.widget.TextView[7]")).getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "");
//			double ActTot = Double.parseDouble(Total_Amount);

			System.out.println("Discount and Total Values are calculated for the Item "+i+" and the values are : "+Disc+"(Discount) and "+price+"(Subtotal)");

			System.out.println("The values are (Discount and Total) : " + Disc+ " "+price);
			if(Disc == ActDisc)
			{
				System.out.println("Discount and Total Values are calculated for the Item "+i+" and the values are : "+Disc+"(Discount) and "+price+"(Subtotal)");
				Total_Price_List.add(price);
				Total_Disc_List.add(Disc);

				System.out.println("The values are (Discount and Total) : " + Disc+ " "+price);
			}

//			Thread.sleep(1000);
		}

		for (int i = 0; i < Total_Price_List.size(); i++) {

			toatl_Disc_Value += Total_Disc_List.get(i);
			toatl_Amount_Value += Total_Price_List.get(i);

		}

		System.out.println("**Calculated Disc Amount**: "+toatl_Disc_Value);
		System.out.println("**Calculated Subtotal Amount**: "+toatl_Amount_Value);

//		DecimalFormat df = new DecimalFormat("0.00");

		double Total_Calculated_Disc_Value = (double) (Math.round(toatl_Disc_Value * 100.00)/100.00);

		double Total_Calculated_Total_Value = (double) (Math.round(toatl_Amount_Value * 100.00)/100.00);
		// DecimalFormat, default is RoundingMode.HALF_EVEN
//	      System.out.println("Total Calculated Total Value: " + df.format(toatl_Amount_Value));

		this.totAmount = Total_Calculated_Total_Value;

		this.discAmount = Total_Calculated_Disc_Value;

		System.out.println("**Calculated Discount Amount with two decimal conversion**: "+Total_Calculated_Disc_Value);

		System.out.println("**Calculated SubTotal Amount with two decimal conversion**: "+Total_Calculated_Total_Value);

		return Total_Calculated_Disc_Value;

	}

	public double getTheDiscount_MixAndMatch(String quantity, String xpath, String disc, String xpath2){

		// Getting list of options
		List<Double> Total_Price_List = new ArrayList<Double>();
		List<Double> Total_Disc_List = new ArrayList<Double>();
		List<Double> result = new ArrayList<>();
		List<Integer> qu = new ArrayList<Integer>();

		double toatl_Amount_Value = 0.00;
		double toatl_Disc_Value = 0.00;
		double calc_Disc = 0.00;
		int va = 0;

		//Removing Icon Count
		List<?> itemsInDropdownForRemovingMenu = driver.findElements(By.xpath("(//*[@text='X'])"));

		int CountForRemovingIcon = itemsInDropdownForRemovingMenu.size();

		System.out.println(CountForRemovingIcon);

		for(int i = 1; i <= CountForRemovingIcon;i++ ){
			String Qty = driver.findElement(By.xpath("" + xpath + "[" + i + "]/../..//android.widget.TextView[4]")).getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "");
			int AQty = Integer.parseInt(Qty);

			qu.add(AQty);
		}

		for (Integer integer : qu) {
			va += integer;
		}

		int quan = Integer.parseInt(quantity);

		int appliedDiscounts = va/quan;

		for (int i = 1; i <= CountForRemovingIcon;i++){
			String Qty = driver.findElement(By.xpath("" + xpath + "[" + i + "]/../..//android.widget.TextView[4]")).getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "");
			double AQty = Double.parseDouble(Qty);

			String subt = driver.findElement(By.xpath("" + xpath + "[" + i + "]/../..//android.widget.TextView[5]")).getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "");
			double Asubt = Double.parseDouble(subt);

			String Disc_Amount = driver.findElement(By.xpath("" + xpath + "[" + i + "]"+xpath2)).getText().replaceAll("[a-zA-Z $ ₹ £ , :]", "");
			double ActDisc = Double.parseDouble(Disc_Amount);

			double price = AQty * Asubt;
			price = Math.round(price*100.00)/100.00;

			Total_Price_List.add(price);

			Total_Disc_List.add(ActDisc);
			Collections.sort(Total_Price_List);



//			List<Double> subList = Total_Price_List.subList(1,appliedDiscounts);
//
//			// Multiply each element in the sublist by the multiplier
//
//			for (Double value : subList) {
//				result.add(value * AdiscPer);
//				System.out.println("ssssssss : "+result);
//			}
		}
		double AdiscPer = Double.parseDouble(disc);
		AdiscPer = AdiscPer/100.00;

		for(int i = 0; i < appliedDiscounts;i++){
			double result1 = Total_Price_List.get(i) * AdiscPer;
//			List<List<Double>> result1 = new ArrayList<>();
			result.add(result1);
		}

		for (int i = 0; i < Total_Price_List.size(); i++) {

			toatl_Disc_Value += Total_Disc_List.get(i);
			toatl_Amount_Value += Total_Price_List.get(i);
		}

		for(int i = 0; i < appliedDiscounts;i++){
				calc_Disc += result.get(i);
		}

		calc_Disc = Math.round(calc_Disc*100.00)/100.00;

		if(toatl_Disc_Value == calc_Disc){
			test.log(LogStatus.PASS,"The calculated discount value is correct and the value is : "+calc_Disc);
		}else {
			double  diff = calc_Disc - toatl_Disc_Value;
			test.log(LogStatus.INFO,"The displayed(In Retail Screen) discount is : "+toatl_Disc_Value);
			test.log(LogStatus.INFO,"The Calculated discount is : "+calc_Disc);
			test.log(LogStatus.FAIL,"The calculated discount value is wrong and the difference is : "+diff);
		}
		return calc_Disc;
	}



	public void text_Confirm(WebElement ele, String text) {

		if (ele.getText().equals(text)) {

			test.log(LogStatus.PASS, "The Text Message shown correctly : " + text + "");

			ut.PassedCaptureScreenshotAsBASE64(driver, test);
		} else {
			test.log(LogStatus.FAIL, "The Text Message not shown correctly : " + text + "");

			ut.FailedCaptureScreenshotAsBASE64(driver, test);
		}

	}
	
	public String Get_Text(WebElement ele) {
		
		String value = ele.getText();
		
		return value;

	}
	
	public double Exclusive_Tax(String value) throws Throwable {
		
		String Report_Taxes = value.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
		double actual_Tax_Value = Float.parseFloat(Report_Taxes);
		double Tax_Value_Conversion = Float.parseFloat(Utility.getProperty("Exclusive_Tax_Percentage"));
		double calculated_Tax_value = ((actual_Tax_Value * Tax_Value_Conversion )/100);
		//DecimalFormat df = new DecimalFormat("0.00");
		 // DecimalFormat, default is RoundingMode.HALF_EVEN
	   // System.out.println("Total Calculated Tax Value: " + df.format(caculated_Tax_value)); 
		calculated_Tax_value = Math.round(calculated_Tax_value * 100.00)/100.00;
		System.out.println("Total Calculated Tax Value: " + calculated_Tax_value);
		return calculated_Tax_value;
	}
	
    public float Inclusive_Tax(String value) throws Throwable {
		
		String Report_Taxes = value.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
		float actual_Tax_Value = Float.parseFloat(Report_Taxes);
		float Tax_Value_Conversion = Float.parseFloat(Utility.getProperty("Inclusive_Tax_Percentage"));
		//Menu Price – Menu price / (1+(tax %/100))
		float calculated_Tax_value = (actual_Tax_Value - actual_Tax_Value / (1+( Tax_Value_Conversion /100)));
		DecimalFormat df = new DecimalFormat("0.00");
		 // DecimalFormat, default is RoundingMode.HALF_EVEN
	    System.out.println("Total Calculated Total Value: " + df.format(calculated_Tax_value));
		return calculated_Tax_value;
		
	}

	public void text_Confirm_without_Screenshot(WebElement ele, String text) {

		if (ele.getText().equals(text)) {

			test.log(LogStatus.PASS, "The Text Message shown correctly : " + text + "");

		} else {
			test.log(LogStatus.FAIL, "The Text Message not shown correctly : " + text + "");

		}

	}

	public void isEleDisplayed(WebElement ele, String text) {

		if (ele.isDisplayed()) {

			test.log(LogStatus.PASS, "The" + text + "Element is displayed");

		} else {
			test.log(LogStatus.FAIL, "The" + text + "Element is not displayed");

		}
	}

	public void isEleEnabled(WebElement ele, String text) {

		if (ele.isDisplayed()) {

			test.log(LogStatus.PASS, "The" + text + "Element is Displayed and Enabled");

		} else {
			test.log(LogStatus.FAIL, "The" + text + "Element is not Displayed and Enabled");

		}

	}

	public void explicit_Wait(WebElement ele) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	public void waitForVisibility(WebElement e){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
		wait.until(ExpectedConditions.visibilityOf(e));
	}

	public void waitForVisibility(By e){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
		wait.until(ExpectedConditions.visibilityOfElementLocated(e));
	}

	public WebElement elements;

	public boolean find(final WebElement element, int timeout) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
			return wait.until(new ExpectedCondition<Boolean>() {
				@Override
				public Boolean apply(WebDriver driver) {
					if (element.isDisplayed()) {
						return true;
					}
					return false;
				}
			});
		} catch (Exception e) {
			return false;
		}
	}

	public void swipe(int startX, int startY, int endX, int endY, int millis) throws InterruptedException {
		Point t = new Point(startX,startY);
		PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH,"finger1");
		Sequence sequence=  new Sequence(finger1,1).
				addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(),startX,startY))
				.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
				.addAction(new Pause(finger1,Duration.ofMillis(millis)))
				.addAction(finger1.createPointerMove(Duration.ofMillis(millis),PointerInput.Origin.viewport(),endX,endY))
				.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Collections.singletonList(sequence));


//        t.press(point(startX, startY)).waitAction(waitOptions(ofMillis(millis))).moveTo(point(endX, endY)).release()
//                .perform();
	}

	public void scrollToElementPayments(String element, String direction) throws Exception {
		Dimension size = driver.manage().window().getSize();
		if(element.charAt(0) == '/') {
			elements = driver.findElement(AppiumBy.xpath(element));
		}else{
			elements = driver.findElement(AppiumBy.accessibilityId(element));
		}
		int startX = (int) (size.width * 0.5);
		int endX = (int) (size.width * 0.5);
		int startY = 0;
		int endY = 0;
		boolean isFound = false;

		switch (direction) {
			case "up":
				endY = (int) (size.height * 0.4);
				startY = (int) (size.height * 0.6);
				break;

			case "down":
				endY = (int) (size.height * 0.6);
				startY = (int) (size.height * 0.4);
				break;
		}

		for (int i = 0; i < 10; i++) {
			if (find(elements, 5)) {
				isFound = true;
				break;
			} else {
				swipe(startX, startY, endX, endY, 1000);
			}
		}
		if (!isFound) {
			throw new Exception("Element not found");
		}

	}

	private static int selectUniqueRandomNumbers(int upperBound, int numberOfSelections) {
		// Create a set to store selected numbers
		Set<Integer> selectedNumbers = new HashSet<>();

		// Create a random number generator
		Random random = new Random();

		// Perform random selections
		for (int i = 0; i < numberOfSelections; i++) {
			int randomNumber;

			do {
				// Generate a random number within the specified range
				randomNumber = random.nextInt(upperBound - 1 + 1) + 1;

				// Repeat until a unique number is generated
			} while (selectedNumbers.contains(randomNumber));

			// Add the selected number to the set
			selectedNumbers.add(randomNumber);

			// Use the selected number as needed (print it in this example)
			System.out.println("Randomly selected number #" + (i + 1) + ": " + randomNumber);
		}
		return numberOfSelections;
	}


}
