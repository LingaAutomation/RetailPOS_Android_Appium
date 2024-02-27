package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utility.Utility;

public class Standard_Item_POS {
//   public AppiumDriver driver=new DriverManager().getDriver();
//    ExtentReports rep=new DriverManager().getRep();
//    ExtentTest test= DriverManager.test;

    String CheckNumber, CustomerName, time, date,total,subtotal,dateAndTime,reason,firstName;

    String totalTax, gratuity, discount, serviceCharge, paidAmount,balanceAmount,changeVariant;

    @Given("^Sign In with the valid credentials$")
    public void signInWithTheValidCredentials() throws Throwable {
        new Login_Page().Signin_Valid_Cred();
    }

    @And("^Login with the valid credentials$")
    public void loginWithTheValidCredentials() throws Throwable {
        new Login_Page().enterpin();
    }

    @Then("Check the Back Office button is available or not in the pin screen")
    public void checkTheBackOfficeButtonIsAvailableOrNotInThePinScreen() throws Throwable {
        new Pin_Screen_Page().Pin_Screen_Validations_BackOffice();
    }


    @Then("Check the Operation button is available or not in the pin screen")
    public void checkTheOperationButtonIsAvailableOrNotInThePinScreen() throws Throwable {
        new Pin_Screen_Page().Pin_Screen_Validations_Operation();
    }

    @Then("Check the Clock In button is available or not in the pin screen")
    public void checkTheClockInButtonIsAvailableOrNotInThePinScreen() throws Throwable {
        new Pin_Screen_Page().Pin_Screen_Validations_ClockIn();
    }

    @Then("Check the Clock Out button is available or not in the pin screen")
    public void checkTheClockOutButtonIsAvailableOrNotInThePinScreen() throws Throwable {
        new Pin_Screen_Page().Pin_Screen_Validations_ClockOut();
    }

    @Then("Check the Sync button is available or not in the pin screen")
    public void checkTheSyncButtonIsAvailableOrNotInThePinScreen() throws Throwable {
        new Pin_Screen_Page().Pin_Screen_Validations_Sync();
    }

    @Then("Check the Sync Receipts button is available or not in the pin screen")
    public void checkTheSyncReceiptsButtonIsAvailableOrNotInThePinScreen() throws Throwable {
        new Pin_Screen_Page().Pin_Screen_Validations_SyncReceipts();
    }

    @Then("Check the Devices button is available or not in the pin screen")
    public void checkTheDevicesButtonIsAvailableOrNotInThePinScreen() throws Throwable {
        new Pin_Screen_Page().Pin_Screen_Validations_Devices();

    }

    @Then("Check the Low Stock Items button is available or not in the pin screen")
    public void checkTheLowStockItemsButtonIsAvailableOrNotInThePinScreen() throws Throwable {
        new Pin_Screen_Page().Pin_Screen_Validations_LowStockItems();
    }

    @Then("Check the Sign Out button is available or not in the pin screen")
    public void checkTheLogOffButtonIsAvailableOrNotInThePinScreen() throws Throwable {
        new Pin_Screen_Page().Pin_Screen_Validations_SignOut();
    }

    @Given("Check the Void button is available or not in the Retail Screen")
    public void checkTheVoidButtonIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_VoidBtn();
    }

    @And("Check the Sale History button is available or not in the Retail Screen")
    public void checkTheSaleHistoryButtonIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_SaleHistoryBtn();
    }

    @And("Check the Park Sale button is available or not in the Retail Screen")
    public void checkTheParkSaleButtonIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_ParkSaleBtn();
    }

    @And("Check the Retrieve Sale button is available or not in the Retail Screen")
    public void checkTheRetrieveSaleButtonIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_RetrieveSaleBtn();
    }

    @And("Check the Option button is available or not in the Retail Screen")
    public void checkTheOptionButtonIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_OptionBtn();
    }

    @And("Check the Print button is available or not in the Retail Screen")
    public void checkThePrintButtonIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_PrintBtn();
    }

    @And("Check the Discount button is available or not in the Retail Screen")
    public void checkTheDiscountButtonIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_DiscountBtn();
    }

    @And("Check the Cash button is available or not in the Retail Screen")
    public void checkTheCashButtonIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_CashBtn();
    }

    @And("Check the Payment button is available or not in the Retail Screen")
    public void checkThePaymentButtonIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_PaymentBtn();
    }

    @And("Check the Log Off button is available or not in the Retail Screen")
    public void checkTheLogOffButtonIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_LogOffBtn();
    }

    @And("Check the Operation button is available or not in the Retail Screen")
    public void checkTheOperationButtonIsAvailableOrNotInTheRetailScreen() throws Throwable{
        new RetailPOS_Order_Page().Retail_OrderScreen_OperationBtn();
    }

    @And("Check the More Category button is available or not in the Retail Screen")
    public void checkTheMoreCategoryButtonIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_CategoryExtensionBtn();
    }

    @And("Check the Item Column is available or not in the Retail Screen")
    public void checkTheItemColumnIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_Columns_Item();
    }

    @And("Check the Variant Column is available or not in the Retail Screen")
    public void checkTheVariantColumnIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_Columns_Variant();
    }

    @And("Check the SKU Code Column is available or not in the Retail Screen")
    public void checkTheSKUCodeColumnIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_Columns_SKUCode();
    }

    @And("Check the Quantity Column is available or not in the Retail Screen")
    public void checkTheQuantityColumnIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_Columns_Qty();
    }

    @And("Check the Price Column is available or not in the Retail Screen")
    public void checkThePriceColumnIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_Columns_Price();
    }

    @And("Check the Discount Column is available or not in the Retail Screen")
    public void checkTheDiscountColumnIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_Columns_Discount();
    }

    @And("Check the Total Column is available or not in the Retail Screen")
    public void checkTheTotalColumnIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_Columns_Total();
    }

    @And("Check the Subtotal option is available or not in the Retail Screen")
    public void checkTheSubtotalOptionIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_ValueField_Subtotal();
    }

    @And("Check the Tax option is available or not in the Retail Screen")
    public void checkTheTaxOptionIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_ValueField_Tax();
    }

    @And("Check the Total option is available or not in the Retail Screen")
    public void checkTheTotalOptionIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_ValueField_Total();
    }

    @And("Check the Paid Amount option is available or not in the Retail Screen")
    public void checkThePaidAmountOptionIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_ValueField_PaidAmount();
    }

    @And("Check the Balance Amount option is available or not in the Retail Screen")
    public void checkTheBalanceAmountOptionIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_ValueField_BalanceAmount();
    }

    @And("Check the Add Customer button is available or not in the Retail Screen")
    public void checkTheAddCustomerButtonIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_AddCustomer();
    }

    @And("Check the Search Customer button is available or not in the Retail Screen")
    public void checkTheSearchCustomerButtonIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_SearchCustomer();
    }

    @And("Check the Search Option is available or not in the Retail Screen")
    public void checkTheSearchOptionIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_SearchBtn();
    }

    @And("Check the Check Number is available or not in the Retail Screen")
    public void checkTheCheckNumberIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_CheckNumber();
    }

    @And("Check the Numpad button is available or not in the Retail Screen")
    public void checkTheNumpadButtonIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_ValueField_Numpad();
    }

    @And("Click the Logoff button")
    public void clickTheLogoffButton() {
        new RetailPOS_Order_Page().Log_Off_to_Pinscreen();
    }

    @Then("Order the Standard Item from the retail Screen")
    public void orderTheStandardItemFromTheRetailScreen() throws Throwable {
        new Item_Selection_Page().multipleMenu_Selection_Random();
    }

    @And("Complete the payment using cash button")
    public void completeThePaymentUsingCashButton() throws Throwable {
        new Standard_Item_POS_Page().Cash_Payment_Selection_And_Completed_ViaPaymentScreen();
    }

    @And("Complete the payment using Side CC button")
    public void completeThePaymentUsingSideCCButton() throws Throwable {
        new Standard_Item_POS_Page().SideCC_Payment_Selection_And_Completed_ViaPaymentScreen();
    }

    @And("Complete the payment using Others button")
    public void completeThePaymentUsingOthersButton() throws Throwable {
        new Standard_Item_POS_Page().Others_Payment_Selection_And_Completed_ViaPaymentScreen();
    }

    @And("Complete the payment using fast cash button")
    public void completeThePaymentUsingFastCashButton() throws Throwable {
        new Standard_Item_POS_Page().Cash_Payment_Selection_And_Completed();
    }

    @Then("Click the sale history")
    public void clickTheSaleHistory() throws Throwable {
        new Standard_Item_POS_Page().Click_Sale_HistoryBtn();
    }

    @Then("Screen will navigate to Receipt-Check Status screen")
    public void screenWillNavigateToReceiptCheckStatusScreen() throws Exception {
        new Sale_History_Page().verifyAll_Orders_All_Orders_Text();
    }

    @And("Columns such as Customer, Receipt No, Date, Time, Cashier, Total")
    public void columnsSuchAsCustomerReceiptNoDateTimeCashierTotal() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Customer_Column_Text();
        new Sale_History_Page().verifyAll_Orders_Receipt_No_Column_Text();
        new Sale_History_Page().verifyAll_Orders_Date_Column_Text();
        new Sale_History_Page().verifyAll_Orders_Time_Column_Text();
        new Sale_History_Page().verifyAll_Orders_Cashier_Column_Text();
        new Sale_History_Page().verifyAll_Orders_Total_Column_Text();
    }

    @And("Complete the payment using gift card button and the card number is {}")
    public void completeThePaymentUsingGiftCardButtonAndTheCardNumberIs(String cardNum) throws Throwable {
        new Standard_Item_POS_Page().GiftCard_Payment_Selection_And_Completed_ViaPaymentScreen(cardNum);
    }

    @And("Complete the payment using HA Payment button and the card number is {}")
    public void completeThePaymentUsingHAPaymentButtonAndTheCardNumberIs(String cardNum) throws Throwable {
        new Standard_Item_POS_Page().HAPayment_Payment_Selection_And_Completed_ViaPaymentScreen(cardNum);
    }

    @Then("Order the Standard Item from the retail Screen Single item")
    public void orderTheStandardItemFromTheRetailScreenSingleItem() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection_Standard1();
    }

    @And("verify the quantity of the menu item")
    public void verifyTheQuantityOfTheMenuItem() throws Throwable {
        new RetailPOS_Order_Page().Check_Quantity_Validations();
    }

    @Then("Order the Open Item from the retail screen without price")
    public void orderTheOpenItemFromTheRetailScreenWithoutPrice() throws Throwable {
        new RetailPOS_Order_Page().Select_Open_Item(Utility.getProperty("Open_Item"),Utility.getProperty("Open_Item_Price"));
    }

    @Then("Order the Open Item from the retail screen with price")
    public void orderTheOpenItemFromTheRetailScreenWithPrice() throws Throwable {
        new RetailPOS_Order_Page().Select_Open_ItemWithPrice(Utility.getProperty("Open_Item"),Utility.getProperty("Open_Item_Price1"));
    }

    @And("Get the Check number from the retail screen")
    public void getTheCheckNumberFromTheRetailScreen()
    {
        CheckNumber = new RetailPOS_Order_Page().get_Check_NO();
    }

    @Then("Verify the Closed Check from the Sale history screen")
    public void verifyTheClosedCheckFromTheSaleHistoryScreen() throws Throwable {
        new Standard_Item_POS_Page().Verify_The_Closed_Check1(CheckNumber);
    }

    @And("Void the Ordered items from the Retail Screen")
    public void voidTheOrderedItemsFromTheRetailScreen() {
        new RetailPOS_Order_Page().Void_MenuItems();
    }

    @Then("Order the Variant from the retail Screen Single item")
    public void orderTheVariantFromTheRetailScreenSingleItem() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_SelectionFor_VariantItem();
    }

    @Then("Order the Kit Assembly from the retail Screen Single item")
    public void orderTheKitAssemblyFromTheRetailScreenSingleItem() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_SelectionFor_KitAssembly();
    }

    @Then("Click the retail button")
    public void clickTheRetailButton() throws InterruptedException {
        new Standard_Item_POS_Page().ClickTheRetailBtn();
    }

    @And("select the required check")
    public void selectTheRequiredCheck() throws InterruptedException {
        Thread.sleep(500);
        new Standard_Item_POS_Page().select_The_Closed_Check(CheckNumber);
    }

    @And("select the required check1")
    public void selectTheRequiredCheck1() throws InterruptedException {
        Thread.sleep(500);
        new Standard_Item_POS_Page().select_The_Parked_Check(CheckNumber);
    }

    @When("User verify the corresponding check in the refund tab")
    public void userVerifyTheCorrespondingCheckInTheRefundTab() throws InterruptedException {
        new Standard_Item_POS_Page().Verify_The_Refunded_Check(CheckNumber);
    }

    @When("User verify the corresponding check no in the refund tab")
    public void userVerifyTheCorrespondingCheckNoInTheRefundTab() throws InterruptedException {
        new Standard_Item_POS_Page().Verify_The_Refunded_Check1(CheckNumber);
        CheckNumber = new Standard_Item_POS_Page().Verify_The_Refunded_Check2(CheckNumber);
    }

    @When("User verify the corresponding check in the refund tabs")
    public void userVerifyTheCorrespondingCheckInTheRefundTabs() throws InterruptedException {
        new Standard_Item_POS_Page().Verify_The_Refunded_Check3(CheckNumber, CustomerName);
    }

    @Then("Gets the name from the First Name field")
    public void getsTheNameFromTheFirstNameField() {
        firstName = new Customer_Profile_Page().firstName_CustomerProfileScreen();
    }

    @When("User verify the corresponding check in the refunded tabs")
    public void userVerifyTheCorrespondingCheckInTheRefundedTabs() throws InterruptedException {
        CustomerName = firstName;
        new Standard_Item_POS_Page().Verify_The_Refunded_Check3(CheckNumber, CustomerName);
    }

    @Then("Verify the Customer name in the Refund screen")
    public void verifyTheCustomerNameInTheRefundScreen() {
        new Standard_Item_POS_Page().checkTheCustomerAvailability_Refund(CustomerName);
    }

    @When("Verify the check no is changed in the Refunded tab")
    public void verifyTheCheckNoIsChangedInTheRefundedTab() throws InterruptedException {
        new Standard_Item_POS_Page().Verify_The_Refunded_Check(CheckNumber);
    }

    @When("User verify the corresponding check in the refund tab with Customer")
    public void userVerifyTheCorrespondingCheckInTheRefundTabWithCustomer() throws InterruptedException {
        new Standard_Item_POS_Page().Verify_The_Refunded_Check_And_Customer(CheckNumber);
    }

    @And("Verify all the subtotal, tax and total in the retail screen")
    public void verifyAllTheSubtotalTaxAndTotalInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Check_Values_Validations1();
    }

    @Then("Order the standard item which have the markup percentage and the item is {}")
    public void orderTheStandardItemWhichHaveTheMarkupPercentageAndTheItemIs(String item) throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection(item);
    }

    @And("Verify the menu item price in the retail screen and actual price is {} and the markup percentage is {}")
    public void verifyTheMenuItemPriceInTheRetailScreenAndActualPriceIsAndTheMarkupPercentageIs(String menuItem, String price) throws Throwable {
        new RetailPOS_Order_Page().verifyTheMenuItemPriceForMarkupAddedMenuItem(menuItem, price);
    }

    @And("Check the Layaway button is available or not in the Retail Screen")
    public void checkTheLayawayButtonIsAvailableOrNotInTheRetailScreen() throws Throwable {
        new RetailPOS_Order_Page().Retail_OrderScreen_LayawayBtn();
    }

    @Then("Select that Layaway check and click on Open check")
    public void selectThatLayawayCheckAndClickOnOpenCheck() throws Throwable {
        new Standard_Item_POS_Page().Verify_The_LayAways_Check(CheckNumber);
        new Standard_Item_POS_Page().Click_OpenCheckBtn();
    }

    @And("Selected check will get displayed in retail Order screen")
    public void selectedCheckWillGetDisplayedInRetailOrderScreen() {
        new Standard_Item_POS_Page().verifyTheLayawayedCheckOpenedCorrectlyOrNot(CheckNumber);
    }

    @And("Check will get closed and able to view in closed sale history tab")
    public void checkWillGetClosedAndAbleToViewInClosedSaleHistoryTab() throws Throwable {
        new Standard_Item_POS_Page().Verify_The_Closed_Check1(CheckNumber);
    }

    @And("Select that Layaway check and Click on Pay Check button")
    public void selectThatLayawayCheckAndClickOnPayCheckButton() throws Throwable {
        new Standard_Item_POS_Page().Verify_The_LayAways_Check(CheckNumber);
        new Standard_Item_POS_Page().Click_PayCheckBtn();
    }


    @Then("Layaway receipt will be moved to Layaways tab in Sale History screen")
    public void layawayReceiptWillBeMovedToLayawaysTabInSaleHistoryScreen() throws InterruptedException {
        Thread.sleep(3000);
        new Standard_Item_POS_Page().layawaysTabAvailability1();
    }


    @Then("Select check in closed tab")
    public void selectCheckInClosedTab() throws InterruptedException {
        new Standard_Item_POS_Page().selectTheCheckFromClosedTab_WithCustomer(CheckNumber,CustomerName);
    }

    @And("Get the Customer Name from the retail screen")
    public void getTheCustomerNameFromTheRetailScreen() {
        CustomerName = new RetailPOS_Order_Page().getCustomerName();
    }

    @Then("Exchange popup is open with same customer name")
    public void exchangePopupIsOpenWithSameCustomerName() throws Exception {
        new Standard_Item_POS_Page().Select_The_Exchange_Reasons();
        new Standard_Item_POS_Page().checkTheCustomerAvailability(CustomerName);
    }

    @And("Click the retail item And Click the Exchange button")
    public void clickTheRetailItemAndClickTheExchangeButton() throws Throwable {
//        new Item_Selection_Page().Single_Random_Menu_Selection_Standard1();
        new Item_Selection_Page().multipleMenu_Selection_Random();
        Thread.sleep(500);
//        CheckNumber = new RetailPOS_Order_Page().get_Check_NO();
        new Standard_Item_POS_Page().Click_ExchangeBtn();
    }

    @And("verify the Exchange check is available in Exchange tab in sale history")
    public void verifyTheExchangeCheckIsAvailableInExchangeTabInSaleHistory() throws Throwable {
        Thread.sleep(2000);
//        new Standard_Item_POS_Page().Verify_The_Exchanged_Check(CheckNumber);
        new Standard_Item_POS_Page().Verify_The_Refunded_Check1(CheckNumber);
        CheckNumber = new Standard_Item_POS_Page().Verify_The_Refunded_Check2(CheckNumber);
    }

    @And("Exchanged records should be displayed for the current data default")
    public void exchangedRecordsShouldBeDisplayedForTheCurrentDataDefault() throws Throwable {
        new Standard_Item_POS_Page().Verify_The_Exchanged_Check_WithDate(CheckNumber);
    }

    @And("Click and view the digital print receipt in exchange tab")
    public void clickAndViewTheDigitalPrintReceiptInExchangeTab() throws Throwable {
        new Standard_Item_POS_Page().click_The_Digital_ReceiptScreen_Exchanged_Tab(CheckNumber);
    }

    @And("select the same check")
    public void selectTheSameCheck() throws InterruptedException {
        new Park_Sale_And_Retrieve_Sale_Page().selectTheParkedSale(CheckNumber,reason);
    }

    @Then("In that check will be reopen in ordering screen")
    public void inThatCheckWillBeReopenInOrderingScreen() {
        new RetailPOS_Order_Page().verifyTheCheckNumber(CheckNumber);
    }

    @Then("In that check will be reopen in ordering screen with the same Customer")
    public void inThatCheckWillBeReopenInOrderingScreenWithTheSameCustomer() {
        new RetailPOS_Order_Page().verifyTheCheckNumber(CheckNumber);
        new RetailPOS_Order_Page().verifyTheCustomerName(CustomerName);
    }

    @Then("View the Customer column in which customer name is displayed")
    public void viewTheCustomerColumnInWhichCustomerNameIsDisplayed() throws InterruptedException {
        new Standard_Item_POS_Page().selectTheCheckFromClosedTab_WithCustomer(CheckNumber,CustomerName);
    }

    @Then("View the Customer column for that closed Receipt in which customer is displayed as Walkin")
    public void viewTheCustomerColumnForThatClosedReceiptInWhichCustomerIsDisplayedAsWalkin() throws InterruptedException {
        new Standard_Item_POS_Page().selectTheCheckFromClosedTab_WithCustomer(CheckNumber,"Walkin");
    }

    @And("Get the current time")
    public void getTheCurrentTime() throws Exception {
        time = new Sale_History_Page().getTheCurrentTime();
    }

    @And("Get the current date")
    public void getTheCurrentDate() throws Exception {
        date = new Sale_History_Page().getTheCurrentDate();
    }

    @And("Date Column is displayed in which dd-MMM-yyyy format is shown")
    public void dateColumnIsDisplayedInWhichDdMMMYyyyFormatIsShown() throws InterruptedException {
        new Standard_Item_POS_Page().selectTheCheckFromClosedTab_WithCustomer(CheckNumber,date);
    }

    @And("Time Column is displayed in which twenty four HH:mm format is shown")
    public void timeColumnIsDisplayedInWhichTwentyFourHHMmFormatIsShown() throws InterruptedException {
        new Standard_Item_POS_Page().selectTheCheckFromClosedTab_WithCustomer(CheckNumber,time);
    }

    @And("Shows Date-Month-Year Hr:Min AM format in the Transaction Time Column")
    public void showsDateMonthYearHrMinAMFormatInTheTransactionTimeColumn() throws InterruptedException {
        new Standard_Item_POS_Page().selectTheCheckFromClosedTab_WithCustomer(CheckNumber,dateAndTime);
    }

    @And("Cashier Column is displayed in which user name is shown below")
    public void cashierColumnIsDisplayedInWhichUserNameIsShownBelow() throws Exception {
        new Standard_Item_POS_Page().selectTheCheckFromClosedTab_WithCustomer(CheckNumber,Utility.getProperty("Cashier"));
    }

    @And("Get the Total amount")
    public void getTheTotalAmount() {
        total = new RetailPOS_Order_Page().get_TotalAmount();
    }

    @And("Total Column is displayed in which total amount of that closed receipt is shown below")
    public void totalColumnIsDisplayedInWhichTotalAmountOfThatClosedReceiptIsShownBelow() throws InterruptedException {
        total = total.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
        new Standard_Item_POS_Page().selectTheCheckFromClosedTab_WithCustomer(CheckNumber,total);
    }

    @And("Total Column is displayed in which total amount of that void receipt is shown below")
    public void totalColumnIsDisplayedInWhichTotalAmountOfThatVoidReceiptIsShownBelow() throws InterruptedException {
        total = total.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
        new Standard_Item_POS_Page().selectTheCheckFromClosedTab_WithCustomer(CheckNumber,total);
    }

    @And("Total Column is displayed in which total amount of that Parked receipt is shown below")
    public void totalColumnIsDisplayedInWhichTotalAmountOfThatParkedReceiptIsShownBelow() throws InterruptedException {
        total = total.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
        new Standard_Item_POS_Page().selectTheCheckFromClosedTab_WithCustomer(CheckNumber,total);
    }

    @And("Select the closed receipt and click the receipt button displayed near Total Value")
    public void selectTheClosedReceiptAndClickTheReceiptButtonDisplayedNearTotalValue() throws Throwable {
        new Standard_Item_POS_Page().Verify_The_Closed_Check2(CheckNumber);
        new Sale_History_Page().ClickTheDigitalReceiptBtn();
    }

    @And("Displays Table-No, Receipt No, Server and Date with Time")
    public void displaysTableNoReceiptNoServerAndDateWithTime() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Table_No();
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Server();
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Date_And_Time1(dateAndTime);
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Receipt_No(CheckNumber);
    }

    @And("Get the Subtotal amount")
    public void getTheSubtotalAmount() {
        subtotal = new RetailPOS_Order_Page().get_SubtotalAmount();
    }

    @Then("Shows Subtotal with value and Total with value below the retail items in order summary")
    public void showsSubtotalWithValueAndTotalWithValueBelowTheRetailItemsInOrderSummary() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Subtotal(subtotal);
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Total(total);
    }

    @And("Get the Tax, Discount,Gratuity and service charge")
    public void getTheTaxDiscountGratuityAndServiceCharge() {
        totalTax = new RetailPOS_Order_Page().get_TaxAmount();
        gratuity = new RetailPOS_Order_Page().get_GratuityAmount();
        serviceCharge = new RetailPOS_Order_Page().get_ServiceChargeAmount();
        discount = new RetailPOS_Order_Page().get_DiscountAmount();
    }

    @When("View the fields under Tax Summary such as Total Tax, Gratuity, Discount, Service Charge with Values for all fields in vertical order")
    public void viewTheFieldsUnderTaxSummarySuchAsTotalTaxGratuityDiscountServiceChargeWithValuesForAllFieldsInVerticalOrder() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Total_Tax();
        new Sale_History_Page().verifyTheTotalTaxValue(totalTax);
        new Sale_History_Page().verifyTheGratuityText();
        new Sale_History_Page().verifyTheGratuityValue(gratuity);
        new Sale_History_Page().verifyTheDiscountText();
        new Sale_History_Page().verifyTheDiscountValue(discount);
        new Sale_History_Page().verifyTheServiceChargeText();
        new Sale_History_Page().verifyTheServiceChargeValue(serviceCharge);
    }

    @Then("Shows Grand Total with value and Total with value below the Tax summary at the bottom")
    public void showsGrandTotalWithValueAndTotalWithValueBelowTheTaxSummaryAtTheBottom() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_GrandTotal(total);
    }

    @When("View the barcode symbol at the bottom if Receipt with Node number, hifen symbol,ddmmyy and ReceiptNumber")
    public void viewTheBarcodeSymbolAtTheBottomIfReceiptWithNodeNumberHifenSymbolDdmmyyAndReceiptNumber() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_BarCode(CheckNumber);
    }

    @When("Enter single digit numerical value")
    public void enterSingleDigitNumericalValue() throws InterruptedException {
        new Standard_Item_POS_Page().enterTheSingleCharInReceiptNo(CheckNumber);
    }

    @Then("Displays result based on the search in Receipt No")
    public void displaysResultBasedOnTheSearchInReceiptNo() throws Throwable {
        new Standard_Item_POS_Page().Verify_The_Closed_Check_SingleChar(CheckNumber);
    }

    @When("Enter the alphabetic values in Receipt No field")
    public void enterTheAlphabeticValuesInReceiptNoField() throws InterruptedException {
        new Standard_Item_POS_Page().enterTheSingleCharInReceiptNo("test");
    }

    @Then("But no result will be displayed")
    public void butNoResultWillBeDisplayed() throws Throwable {
        new Standard_Item_POS_Page().Verify_The_Closed_Check_SingleChar(CheckNumber);
    }

    @Then("Get the Paid amount")
    public void getThePaidAmount() {
        paidAmount = new RetailPOS_Order_Page().get_PaidAmount();
    }

    @And("Get the Balance amount")
    public void getTheBalanceAmount() {
        balanceAmount = new RetailPOS_Order_Page().get_BalanceAmount();
    }

    @Then("Payment screen with paid amount and balance due will appear")
    public void paymentScreenWithPaidAmountAndBalanceDueWillAppear() throws Throwable {
        new Standard_Item_POS_Page().Verify_The_BalanceAmountAndPaymentsScreen(balanceAmount);
    }

    @Then("Displays the Receipt No, Search Box, Total Amount Value, Subtotal, Tax, Total, Paid Amount and Balance Amount at the right")
    public void displaysTheReceiptNoSearchBoxTotalAmountValueSubtotalTaxTotalPaidAmountAndBalanceAmountAtTheRight() throws Throwable {
      //  new RetailPOS_Order_Page().verifyTheReopenCheck_CheckNo(CheckNumber);
        new RetailPOS_Order_Page().verifyTheCheckNumber_Refund(CheckNumber);
        new RetailPOS_Order_Page().Retail_OrderScreen_SearchBtn();
        new RetailPOS_Order_Page().verifyTheReopenCheck_Total(total);
        new RetailPOS_Order_Page().verifyTheReopenCheck_SubTotal(subtotal);
        new RetailPOS_Order_Page().verifyTheReopenCheck_Tax(totalTax);
        new RetailPOS_Order_Page().verifyTheReopenCheck_Paid(balanceAmount);
        new RetailPOS_Order_Page().verifyTheReopenCheck_BalanceAmount(paidAmount);
    }


    @Then("View the Customer column for that Void Receipt in which customer is displayed as Walkin")
    public void viewTheCustomerColumnForThatVoidReceiptInWhichCustomerIsDisplayedAsWalkin() throws InterruptedException {
        new Standard_Item_POS_Page().Verify_The_Check_And_Customer(CheckNumber);
    }

    @And("Enter the reason and click the park button")
    public void enterTheReasonAndClickTheParkButton() throws InterruptedException {
        reason = new Park_Sale_And_Retrieve_Sale_Page().enterTheParkSaleReasonAndClickTheParkButton();
    }

    @Then("Verify the void check in the void tab")
    public void verifyTheVoidCheckInTheVoidTab() throws Throwable {
        new Standard_Item_POS_Page().Verify_The_Void_Check(CheckNumber);
    }

    @Then("Verify the Parked check in the parked tab")
    public void verifyTheParkedCheckInTheParkedTab() throws Throwable {
        new Standard_Item_POS_Page().Verify_The_Parked_Check(CheckNumber);
    }


    @When("View the customer column which displays Customer as Walkin")
    public void viewTheCustomerColumnWhichDisplaysCustomerAsWalkin() throws InterruptedException {
        new Standard_Item_POS_Page().Verify_The_Check_And_Customer(CheckNumber);
    }

    @And("Able to view the Receipt No under Receipt No column in Parked sale history tab")
    public void ableToViewTheReceiptNoUnderReceiptNoColumnInParkedSaleHistoryTab() throws Throwable {
        new Standard_Item_POS_Page().Verify_The_Parked_Check(CheckNumber);
    }

    @And("The same receipt should be displayed")
    public void theSameReceiptShouldBeDisplayed() {
        new RetailPOS_Order_Page().verifyTheCheckNumber(CheckNumber);
    }

    @Then("Verify the check number in the retail screen while doing refund")
    public void verifyTheCheckNumberInTheRetailScreenWhileDoingRefund() throws InterruptedException {
        new RetailPOS_Order_Page().verifyTheCheckNumber_RetailScreenWhenDoingRefund(CheckNumber);
        //CheckNumber = new Standard_Item_POS_Page().Verify_The_Refunded_Check2(CheckNumber);
    }

    @And("Get the current date and time")
    public void getTheCurrentDateAndTime() throws Exception {
        dateAndTime = new Sale_History_Page().getCurrentDateAndTime();
    }

    @Then("Get the reason from the refund reason text box")
    public void getTheReasonFromTheRefundReasonTextBox() {
        reason = new Standard_Item_POS_Page().getTheReason();
    }

    @When("Select that receipt and view the Reasons column in which Reason selected in Refund screen will appear")
    public void selectThatReceiptAndViewTheReasonsColumnInWhichReasonSelectedInRefundScreenWillAppear() throws InterruptedException {
        new Standard_Item_POS_Page().selectTheCheckFromClosedTab_WithCustomer(CheckNumber,reason);
    }

    @When("Select that receipt and view the Total column in which Total amount of refunded items in Refund screen will appear")
    public void selectThatReceiptAndViewTheTotalColumnInWhichTotalAmountOfRefundedItemsInRefundScreenWillAppear() throws InterruptedException {
        total = total.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
        new Standard_Item_POS_Page().selectTheCheckFromClosedTab_WithCustomer(CheckNumber,total);
    }

    @When("Select that receipt and view the Refund Type column in which Full Refund is shown")
    public void selectThatReceiptAndViewTheRefundTypeColumnInWhichFullRefundIsShown() throws InterruptedException {
        new Standard_Item_POS_Page().selectTheCheckFromClosedTab_WithCustomer(CheckNumber,"Full Refund");
    }

    @And("Displays Status, Receipt No, Server and Date with Time")
    public void displaysStatusReceiptNoServerAndDateWithTime() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Status();
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Server();
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Date_And_Time1(dateAndTime);
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Receipt_No(CheckNumber);
    }

    @When("Select that receipt and view the Refund Total column in which Total amount refunded in Refund screen will appear")
    public void selectThatReceiptAndViewTheRefundTotalColumnInWhichTotalAmountRefundedInRefundScreenWillAppear() throws InterruptedException {
        total = total.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
        new Standard_Item_POS_Page().selectTheCheckFromClosedTab_WithCustomer(CheckNumber,total);
    }


    @Then("Get the Tax amount")
    public void getTheTaxAmount() {
        totalTax = new RetailPOS_Order_Page().get_TaxAmount();
    }

    @Then("Shows Subtotal with value and Tax with value below the retail items in Refund summary")
    public void showsSubtotalWithValueAndTaxWithValueBelowTheRetailItemsInRefundSummary() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Subtotal_Refund(subtotal);
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Tax_Refund(totalTax);
    }

    @Then("Shows Subtotal with value and Tax with value below the retail items in Refund summary with minus symbol inFront of mentioned fields")
    public void showsSubtotalWithValueAndTaxWithValueBelowTheRetailItemsInRefundSummaryWithMinusSymbolInFrontOfMentionedFields() throws Exception{
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Subtotal_Refund(subtotal);
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Tax_Refund(totalTax);
    }

    @When("Digital receipt with Store Details, Refund summary and Grand Total")
    public void digitalReceiptWithStoreDetailsRefundSummaryAndGrandTotal() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Refund_Summary();
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Status();
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_GrandTotal_Refund(total);
    }


    @When("Digital receipt with Store Details, Refund summary and Grand Total with minus symbol in front of total value")
    public void digitalReceiptWithStoreDetailsRefundSummaryAndGrandTotalWithMinusSymbolInFrontOfTotalValue() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Refund_Summary();
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Status();
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_GrandTotal_Refund(total);
    }

    @Then("New Receipt number in Retail order screen will get displayed")
    public void newReceiptNumberInRetailOrderScreenWillGetDisplayed() throws InterruptedException {
        new RetailPOS_Order_Page().verifyTheCheckNumber_Refund(CheckNumber);
        new Standard_Item_POS_Page().Click_ExchangeBtn();
    }

    @And("New Receipt number in Retail order screen will get displayed after Click the Exchange button")
    public void newReceiptNumberInRetailOrderScreenWillGetDisplayedAfterClickTheExchangeButton() {
        new RetailPOS_Order_Page().verifyTheCheckNumber_Exchange(CheckNumber);
    }

    @And("Subtotal, Tax, Total and Balance Amount will get changed based on the added retail item")
    public void subtotalTaxTotalAndBalanceAmountWillGetChangedBasedOnTheAddedRetailItem() {
        new RetailPOS_Order_Page().VerifyTheSubtotalTaxTotal_Exchange(subtotal,totalTax,total);
    }

    @And("Able to view the receipts in Layaways sale history tab")
    public void ableToViewTheReceiptsInLayawaysSaleHistoryTab() throws Throwable {
        new Standard_Item_POS_Page().Verify_The_LayAways_Check(CheckNumber);
    }

    @Then("View the Receipt Total column in which Total of the Layaway Receipt is displayed in Layaway sale history tab")
    public void viewTheReceiptTotalColumnInWhichTotalOfTheLayawayReceiptIsDisplayedInLayawaySaleHistoryTab() throws InterruptedException {
        total = total.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
        new Standard_Item_POS_Page().selectTheCheckFromClosedTab_WithCustomer(CheckNumber,total);
    }

    @And("Able to view the receipts in Layaways tab")
    public void ableToViewTheReceiptsInLayawaysTab() throws Throwable {
        new Standard_Item_POS_Page().Verify_The_LayAways_Check1(CheckNumber);
    }

    @Then("Receipt will be displayed in Layaway sale history tab")
    public void receiptWillBeDisplayedInLayawaySaleHistoryTab() throws Throwable {
        new Standard_Item_POS_Page().Verify_The_LayAways_Check1(CheckNumber);
    }

    @Then("Select the payment method to pay the full balance due")
    public void selectThePaymentMethodToPayTheFullBalanceDue() throws InterruptedException {
        new Standard_Item_POS_Page().Cash_Option();
    }

    @Then("Receipt will get displayed in closed sale history tab")
    public void receiptWillGetDisplayedInClosedSaleHistoryTab() throws Throwable {
        new Standard_Item_POS_Page().Verify_The_Closed_Check(CheckNumber);
    }

    @Then("View the Server column in which name of the server or user is displayed in Exchanged sale history tab")
    public void viewTheServerColumnInWhichNameOfTheServerOrUserIsDisplayedInExchangedSaleHistoryTab() throws Exception {
        new Standard_Item_POS_Page().selectTheCheckFromClosedTab_WithCustomer(CheckNumber,Utility.getProperty("Cashier"));
    }

    @Then("Get the reason from the Exchange Reason Text box")
    public void getTheReasonFromTheExchangeReasonTextBox() {
        reason = new Standard_Item_POS_Page().getTheReason();
    }

    @Then("View the Reasons is displayed in Exchanged sale history tab")
    public void viewTheReasonsIsDisplayedInExchangedSaleHistoryTab() throws InterruptedException {
        new Standard_Item_POS_Page().selectTheCheckFromClosedTab_WithCustomer(CheckNumber,reason);
    }

    @Then("View the Receipt Total column in which Total of the Exchanged Receipt is displayed in Exchanged sale history tab")
    public void viewTheReceiptTotalColumnInWhichTotalOfTheExchangedReceiptIsDisplayedInExchangedSaleHistoryTab() throws InterruptedException {
        total = total.replaceAll("[a-zA-Z $ ₹ £ , :]", "").substring(1);
        new Standard_Item_POS_Page().selectTheCheckFromClosedTab_WithCustomer(CheckNumber,total);
    }

    @Then("Delete first item from the ordered list")
    public void deleteFirstItemFromTheOrderedList() throws Exception {
        new Sale_History_Page().clickTheCloseButtonOfMenuItem();
    }

    @Then("Verify the check number in the retail screen while doing Exchange")
    public void verifyTheCheckNumberInTheRetailScreenWhileDoingExchange() {
        new RetailPOS_Order_Page().verifyTheCheckNumber_RetailScreenWhenDoingRefund(CheckNumber);
    }

    @When("verify the required check")
    public void verifyTheRequiredCheck() throws InterruptedException {
        new Standard_Item_POS_Page().check_The_Closed_Check(CheckNumber);
    }

    @When("verify the required checks")
    public void verifyTheRequiredChecks() throws InterruptedException {
        new Standard_Item_POS_Page().check_The_Closed_Check1(CheckNumber);
    }

    @And("select the same checks")
    public void selectTheSameChecks() throws InterruptedException {
        new Park_Sale_And_Retrieve_Sale_Page().selectTheParkedSale1(CheckNumber,reason);
    }

    @Then("Get the Customer Name from the refund screen")
    public void getTheCustomerNameFromTheRefundScreen() {
        CustomerName = new RetailPOS_Order_Page().getCustomerName_Refund();
    }

    @And("Click the Change Variant option")
    public void clickTheChangeVariantOption() throws Throwable {
        new RetailPOS_Order_Page().clickTheChangeVariantOption();
    }

    @Then("Change the required Variants option")
    public void changeTheRequiredVariantsOption() throws Throwable {
        new Appium_Base_Class().changeVariant();
    }

    @Then("Order the given retail item {} from the Kit Assembly")
    public void orderTheGivenRetailItemFromTheKitAssembly(String item) throws Throwable {
        new Item_Selection_Page().particular_Kit_Accessible(item);
    }

    @And("Get the Change Variant option from the retail screen")
    public void getTheChangeVariantOptionFromTheRetailScreen() {
        changeVariant = new RetailPOS_Order_Page().getTheSizeOfChangeVariant();
    }

    @Then("Click all the Change Variant options and click done")
    public void clickAllTheChangeVariantOptionsAndClickDone() throws InterruptedException {
        new RetailPOS_Order_Page().clickTheChangeVariantAndDone(changeVariant);
    }


    @And("Verify all the Change variant options are available or not in the retail screen")
    public void verifyAllTheChangeVariantOptionsAreAvailableOrNotInTheRetailScreen() {
        new RetailPOS_Order_Page().verifyTheChangeVariantCount(changeVariant);
    }

    @And("Click the number from retail screen")
    public void clickTheNumberFromRetailScreen() throws InterruptedException {
        new RetailPOS_Order_Page().clickTheNumber();
    }

    @And("Verify the SKU Code for all the listed item")
    public void verifyTheSKUCodeForAllTheListedItem() throws Exception {
        new Sale_History_Page().verifyTheSKUCode();
    }

    @And("verify the quantity of the menu items")
    public void verifyTheQuantityOfTheMenuItems() throws Throwable {
        new RetailPOS_Order_Page().Check_Quantity_Validations1();
    }

    @And("Click the Back button from the Payment Screen")
    public void clickTheBackButtonFromThePaymentScreen() throws InterruptedException {
        new Standard_Item_POS_Page().Back_Option();
    }

    @Then("Click the {string} discount and warning {string} should be displayed")
    public void clickTheDiscountAndWarningShouldBeDisplayed(String discount, String msg) throws InterruptedException {
        new Discount_Selection_Page().clickTheRequiredDiscount1(discount, msg);
    }

    @Then("Check the Till Management screen is displayed or not")
    public void checkTheTillManagementScreenIsDisplayedOrNot() {
        new Operation_Page().verifyTheTillManagementText();
    }

    @And("Check the Till option is displayed or not and it should selected by default")
    public void checkTheTillOptionIsDisplayedOrNotAndItShouldSelectedByDefault() {
        new Operation_Page().verifyTheTillOptionWithEnabled();
    }

    @And("Check the Set Till option is displayed or not and it should selected by default")
    public void checkTheSetTillOptionIsDisplayedOrNotAndItShouldSelectedByDefault() {
        new Operation_Page().verifyTheSetTillOptionWithEnabled();
    }

    @Then("Check the Active Till option is displayed or not")
    public void checkTheActiveTillOptionIsDisplayedOrNot() {
        new Operation_Page().verifyTheActiveTillOption();
    }

    @And("Check the Held Till option is displayed or not")
    public void checkTheHeldTillOptionIsDisplayedOrNot() {
        new Operation_Page().verifyTheHeldTillOption();
    }

    @Then("Check the Closed Till option is displayed or not")
    public void checkTheClosedTillOptionIsDisplayedOrNot() {
        new Operation_Page().verifyTheClosedTillOption();
    }

    @Then("Check the Cash Drop option is displayed or not")
    public void checkTheCashDropOptionIsDisplayedOrNot() {
        new Operation_Page().verifyTheCashDropOption();
    }

    @And("Click the Reports option and it should be selected")
    public void clickTheReportsOptionAndItShouldBeSelected() {
        new Operation_Page().clickTheReportsOption();
        new Operation_Page().verifyTheReportsOptionWithEnabled();
    }
}





