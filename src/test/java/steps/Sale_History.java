package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

public class Sale_History {

    String menu,quantity,subtotal,firstRetailItem,SKU,variant;

    @And("Page will navigate to the retail order screen")
    public void pageWillNavigateToTheRetailOrderScreen() throws Exception {
        new Sale_History_Page().verifyTheUserNavigateToTheRetailScreeOrNot();
    }

    @Then("Screen will navigate to Receipt-Check Status screen below All Orders")
    public void screenWillNavigateToReceiptCheckStatusScreenBelowAllOrders() throws Exception {
        new Sale_History_Page().verifyAll_Orders_All_Orders_Text();
        new Sale_History_Page().verifyAll_Orders_Check_Status_Text();
        new Sale_History_Page().verifyAll_Orders_Closed_Text();
    }

    @Then("Screen will navigate to Receipt-Check Status screen")
    public void screenWillNavigateToReceiptCheckStatusScreen() throws Exception {
        new Sale_History_Page().verifyAll_Orders_All_Orders_Text();
    }

    @When("Closed tab is selected by default")
    public void closedTabIsSelectedByDefault() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Closed_Tab_Active();
    }

    @And("Fields such as Search Date and Receipt No is present parallel at the right end")
    public void fieldsSuchAsSearchDateAndReceiptNoIsPresentParallelAtTheRightEnd() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Search_Date_Text();
        new Sale_History_Page().verifyAll_Orders_Receipt_No_Text();
    }

    @And("Buttons such as Re-Open Receipt, Return, Re-Print Receipt and Operation is present at the bottom")
    public void buttonsSuchAsReOpenReceiptReturnRePrintReceiptAndOperationIsPresentAtTheBottom() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Reopen_Check_Button();
        new Sale_History_Page().verifyAll_Orders_Return_Button();
        new Sale_History_Page().verifyAll_Orders_RePrint_Check_Button();
        new Sale_History_Page().verifyAll_Orders_Operation_Button();
    }

    @And("Fields such as Receipt Total, Customer, Average Duration and Average Amount is present at the bottom")
    public void fieldsSuchAsReceiptTotalCustomerAverageDurationAndAverageAmountIsPresentAtTheBottom() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Check_Total_Text();
        new Sale_History_Page().verifyAll_Orders_Customer_Text();
        new Sale_History_Page().verifyAll_Orders_Average_Duration_Text();
        new Sale_History_Page().verifyAll_Orders_Average_Amount_Text();
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

    @When("Digital receipt with Store Details, Order summary, Tax Summary and Grand Total")
    public void digitalReceiptWithStoreDetailsOrderSummaryTaxSummaryAndGrandTotal() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Table_No();
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Order_Summary();
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Tax_Summary();
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Grand_Total();
    }

    @Then("Click the Back Arrow button from the receipt screen")
    public void clickTheBackArrowButtonFromTheReceiptScreen() throws Exception {
        new Sale_History_Page().clickTheBackButtonFromDigitalReceiptScreen();
    }

    @When("View the Store Details fields at the top such as back navigation symbol, Store Name and Customer at first row")
    public void viewTheStoreDetailsFieldsAtTheTopSuchAsBackNavigationSymbolStoreNameAndCustomerAtFirstRow() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Back_Button();
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Store_Name();
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_Customer_Name();
    }

    @Then("Get the menu items,total and quantity from the retail screen")
    public void getTheMenuItemsTotalAndQuantityFromTheRetailScreen() throws Exception {
        menu = new Sale_History_Page().getTheRetailItems_FromRetailScreen();
        quantity = new Sale_History_Page().getTheQuantityOfRetailItems_FromRetailScreen();
        subtotal = new Sale_History_Page().getTheTotalOfRetailItems_FromRetailScreen();
    }

    @Then("Get the menu items from the retail screen")
    public void getTheMenuItemsFromTheRetailScreen() throws Exception {
        menu = new Sale_History_Page().getTheRetailItems_FromRetailScreen();
    }

    @When("View the fields under Order Summary such as placed retail items with quantity and price value in vertical order")
    public void viewTheFieldsUnderOrderSummarySuchAsPlacedRetailItemsWithQuantityAndPriceValueInVerticalOrder() throws Exception {
        new Sale_History_Page().verifyTheRetailItemQuantityAndTotalInRetailScreenAndReceiptScreen(menu,quantity,subtotal);
    }

    @When("View the fields under Order Summary such as placed retail items with quantity and price value in vertical order in Void tab")
    public void viewTheFieldsUnderOrderSummarySuchAsPlacedRetailItemsWithQuantityAndPriceValueInVerticalOrderInVoidTab() throws Exception {
        new Sale_History_Page().verifyTheRetailItemQuantityAndTotalInRetailScreenAndReceiptScreen1(menu,quantity,subtotal);
    }

    @When("View the fields under Refund Summary such as placed retail items with quantity and price value in vertical order")
    public void viewTheFieldsUnderRefundSummarySuchAsPlacedRetailItemsWithQuantityAndPriceValueInVerticalOrder() throws Exception {
        new Sale_History_Page().verifyTheRetailItemQuantityAndTotalInRetailScreenAndReceiptScreen2(menu,quantity,subtotal);
    }

    @When("Retail order screen will get displayed with placed Standard retail item without any changes")
    public void retailOrderScreenWillGetDisplayedWithPlacedStandardRetailItemWithoutAnyChanges() throws Exception {
        new Sale_History_Page().verifyTheRetailItemQuantityAndTotalInRetailScreenAndAfterReopenRetailScreen(menu,quantity,subtotal);
    }

    @And("Order the Standard Item from the retail Screen - with service charge")
    public void orderTheStandardItemFromTheRetailScreenWithServiceCharge() throws Throwable {
        new Item_Selection_Page().Multiple_Random_Menu_Selection_ITS_Standard();
    }

    @Then("View the Notes displayed - Have a nice day, Visit us again")
    public void viewTheNotesDisplayedHaveANiceDayVisitUsAgain() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Digital_Receipt_VisitUsAgain();
    }


    @And("Select the Search Date in which Calendar symbol is shown")
    public void selectTheSearchDateInWhichCalendarSymbolIsShown() throws Exception {
        new Sale_History_Page().verifyTheCalendarIcon();
        new Sale_History_Page().clickTheCalendarIcon();
    }

    @When("Calendar is displayed with Month, Days and Date view")
    public void calendarIsDisplayedWithMonthDaysAndDateView() throws Exception {
        new Sale_History_Page().verifyTheDatePicker();
    }

    @When("User can view Month along with current year dropdown, Backward and Forward navigation arrow")
    public void userCanViewMonthAlongWithCurrentYearDropdownBackwardAndForwardNavigationArrow() throws Exception {
        new Sale_History_Page().verifyTheMonthYearPreviousAndNexMonthArrow();
    }

    @Then("Days of week should be displayed in next line of the Month and Year as S M T W T F S")
    public void daysOfWeekShouldBeDisplayedInNextLineOfTheMonthAndYearAsSMTWTFS() throws Exception {
        new Sale_History_Page().verifyTheSMTWTFS();
    }

    @And("View the current month with available number of days")
    public void viewTheCurrentMonthWithAvailableNumberOfDays() throws Exception {
        new Sale_History_Page().getTheNumberOfDaysDisplayedInTheCalendar();
    }

    @When("Dates are shown as enabled till current date")
    public void datesAreShownAsEnabledTillCurrentDate() throws Exception {
        new Sale_History_Page().verifyTheEnabledDaysTillTheCurrentDate();
    }

    @And("Remaining dates are shown disabled")
    public void remainingDatesAreShownDisabled() throws Exception {
        new Sale_History_Page().verifyTheDisabledDaysAfterTheCurrentDate();
    }

    @And("Select the Receipt No field")
    public void selectTheReceiptNoField() {
        new Standard_Item_POS_Page().clickTheReceiptNumberField();
    }

    @Then("Click the Reopen Check button")
    public void clickTheReopenCheckButton() throws Exception {
        new Sale_History_Page().clickTheReopenCheckBtn();
    }

    @And("Click the Payment option")
    public void clickThePaymentOption() {
        new Standard_Item_POS_Page().Click_PaymentOption();
    }

    @Then("Click on Submit button from payment method screen")
    public void clickOnSubmitButtonFromPaymentMethodScreen() throws InterruptedException {
        new Standard_Item_POS_Page().Submit_Option();
    }

    @When("Cancel, Refund Items, Refund All and Exchange button is shown at the bottom")
    public void cancelRefundItemsRefundAllAndExchangeButtonIsShownAtTheBottom() {
        new Standard_Item_POS_Page().getAllOrders_Refund_All_Btn().isDisplayed();
        new Standard_Item_POS_Page().getAllOrders_Refund_Items_Btn().isDisplayed();
        new Standard_Item_POS_Page().getAllOrders_Exchange_Btn().isDisplayed();
        new Park_Sale_And_Retrieve_Sale_Page().verifyCancelBtn();
    }

    @And("Select that closed receipt and view Re-Print Receipt button")
    public void selectThatClosedReceiptAndViewRePrintReceiptButton() throws Exception {
        new Sale_History_Page().clickTheReprintCheck();
    }

    @And("Click on Operation button")
    public void clickOnOperationButton() throws Exception {
        new Sale_History_Page().clickTheOperationBtn();
    }

    @When("Fields under operation will be displayed such as POS, Till Management, Print labels, Process Offline")
    public void fieldsUnderOperationWillBeDisplayedSuchAsPOSTillManagementPrintLabelsProcessOffline() {
        new Operation_Page().verifyTheOperationText();
        new Operation_Page().verifyThePOSText();
        new Operation_Page().verifyTheTillManagementText();
        new Operation_Page().verifyThePrintLabelsText();
        new Operation_Page().verifyTheProcessOfflineText();
    }

    @And("Continued with Hardware Settings, POS Settings, Close Day, Sync Back Office and Upgrade To New Version")
    public void continuedWithHardwareSettingsPOSSettingsCloseDaySyncBackOfficeAndUpgradeToNewVersion() {
        new Operation_Page().verifyTheHardwareSettingsText();
        new Operation_Page().verifyThePOSSettingsText();
        new Operation_Page().verifyTheCloseDayText();
        new Operation_Page().verifyTheSyncBackOfficeText();
        new Operation_Page().verifyTheUpgradeToNewVersionText();
    }

    @When("Closed tab is selected by default along with Void, Parked, Refunded, Exchanged and Layaways")
    public void closedTabIsSelectedByDefaultAlongWithVoidParkedRefundedExchangedAndLayaways() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Closed_Tab_Active();
        new Sale_History_Page().verifyAll_Orders_Void_Text();
        new Sale_History_Page().verifyAll_Orders_Parked_Text();
        new Sale_History_Page().verifyAll_Orders_Refunded_Text();
        new Sale_History_Page().verifyAll_Orders_Exchanged_Text();
        new Sale_History_Page().verifyAll_Orders_Layaways_Text();
    }

    @Then("View the Void tab in sale history screen")
    public void viewTheVoidTabInSaleHistoryScreen() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Void_Text();
    }

    @When("Select void tab from sale history screen")
    public void selectVoidTabFromSaleHistoryScreen() throws Exception {
        new Sale_History_Page().clickTheVoidTab();
        new Sale_History_Page().verifyAll_Orders_Void_Active();
    }

    @Then("Click the POS option")
    public void clickThePOSOption() {
        new Operation_Page().ClickThePOSOption();
    }

    @Then("View the buttons shown below such as Re-Print Receipt and Operation button")
    public void viewTheButtonsShownBelowSuchAsRePrintReceiptAndOperationButton() throws Exception {
        new Sale_History_Page().verifyAll_Orders_RePrint_Check_Button();
        new Sale_History_Page().verifyAll_Orders_Operation_Button();
    }

    @And("Fields such as Receipt Total, Customer, Average Duration and Average Amount is present at the bottom based on the receipts")
    public void fieldsSuchAsReceiptTotalCustomerAverageDurationAndAverageAmountIsPresentAtTheBottomBasedOnTheReceipts() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Check_Total_Text();
        new Sale_History_Page().verifyAll_Orders_Customer_Text();
        new Sale_History_Page().verifyAll_Orders_Average_Duration_Text();
        new Sale_History_Page().verifyAll_Orders_Average_Amount_Text();
    }


    @Then("Select the Paid amount from the Payment screen")
    public void selectThePaidAmountFromThePaymentScreen() {
        new RetailPOS_Order_Page().verifyThePaidAmount();
        new RetailPOS_Order_Page().ClickThePaidAmount();
    }

    @And("Click the Delete button from the Payment screen")
    public void clickTheDeleteButtonFromThePaymentScreen() {
        new RetailPOS_Order_Page().clickTheDeleteBtn();
    }

    @When("Void Sale Screen with Select or type your void reason, Free Text box and it should allow fifty characters")
    public void voidSaleScreenWithSelectOrTypeYourVoidReasonFreeTextBoxAndItShouldAllowFiftyCharacters() throws InterruptedException {
        new Standard_Item_POS_Page().enterTheVoidReasonTextBox();
    }

    @And("Cancel and Void button with close symbol at the top is shown")
    public void cancelAndVoidButtonWithCloseSymbolAtTheTopIsShown() {
        new Standard_Item_POS_Page().getCancelBtn().isDisplayed();
        new Standard_Item_POS_Page().getVoidBtn().isDisplayed();
        new Standard_Item_POS_Page().getCloseBtn().isDisplayed();
    }

    @Then("Click on void button by selecting or typing the void reason with the popup {} should display")
    public void clickOnVoidButtonBySelectingOrTypingTheVoidReasonWithThePopupShouldDisplay(String msg) {
        new Standard_Item_POS_Page().ClickTheVoidButtonWithTextConfirmation(msg);
    }

    @When("{} message should be displayed when there is no checks available in Void Tab")
    public void messageShouldBeDisplayedWhenThereIsNoChecksAvailableInVoidTab(String msg) {
        new Standard_Item_POS_Page().getTheEmptyVoidTab(msg);
    }

    @And("Click the receipt button displayed near Total Value")
    public void clickTheReceiptButtonDisplayedNearTotalValue() throws Exception {
        new Sale_History_Page().ClickTheDigitalReceiptBtn();
    }

    @And("View Re-Print Receipt button")
    public void viewRePrintReceiptButton() throws Exception {
        new Sale_History_Page().verifyAll_Orders_RePrint_Check_Button();
        new Sale_History_Page().clickTheReprintCheck();
    }

    @Then("View Parked tab")
    public void viewParkedTab() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Parked_Text();
    }

    @When("Select Parked tab from sale history screen")
    public void selectParkedTabFromSaleHistoryScreen() throws Exception {
        new Sale_History_Page().clickTheParkedTab();
        new Sale_History_Page().verifyAll_Orders_Parked_Tab_Active();
    }

    @Then("View the buttons shown below such as Pay Receipt and Open Receipt button")
    public void viewTheButtonsShownBelowSuchAsPayReceiptAndOpenReceiptButton() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Pay_Check_Button();
        new Sale_History_Page().verifyAll_Orders_Open_Check_Button();
    }

    @And("Fields such as Receipt Total and Average Amount is present at the bottom based on the receipts")
    public void fieldsSuchAsReceiptTotalAndAverageAmountIsPresentAtTheBottomBasedOnTheReceipts() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Check_Total_Text();
        new Sale_History_Page().verifyAll_Orders_Average_Amount_Text();
    }

    @Then("{} along with Done button will appear")
    public void alongWithDoneButtonWillAppear(String Msg) {
        new RetailPOS_Order_Page().verifyTheParkSaleClickWithoutRetailItem_ErrorMessage(Msg);
    }

    @When("Park button is clicked")
    public void parkButtonIsClicked() throws InterruptedException {
        new Park_Sale_And_Retrieve_Sale_Page().ClickTheParkButton();
    }

    @And("Click on Pay receipt button in Parked sale history screen")
    public void clickOnPayReceiptButtonInParkedSaleHistoryScreen() throws Exception {
        new Sale_History_Page().clickThePayCheckButton();
    }

    @When("Payment screen will get displayed with configured payment methods")
    public void paymentScreenWillGetDisplayedWithConfiguredPaymentMethods() {
        new Standard_Item_POS_Page().verifyThePaymentScreen();
    }

    @Then("Select any payment method to complete the payment")
    public void selectAnyPaymentMethodToCompleteThePayment() throws InterruptedException {
        new Standard_Item_POS_Page().Cash_Option();
    }

    @And("Click on Open Receipt button in Parked sale history screen")
    public void clickOnOpenReceiptButtonInParkedSaleHistoryScreen() throws Exception {
        new Sale_History_Page().clickTheOpenCheckButton();
    }

    @Then("Able to view Parked items in retail order screen")
    public void ableToViewParkedItemsInRetailOrderScreen() throws Exception {
        new Sale_History_Page().verifyTheRetailItemQuantityAndTotalInRetailScreenAndAfterReopenRetailScreen(menu,quantity,subtotal);
    }

    @When("{} message should be displayed when there is no checks available")
    public void messageShouldBeDisplayedWhenThereIsNoChecksAvailable(String msg) {
        new Park_Sale_And_Retrieve_Sale_Page().clearAllTheParkedSalesFromTheParkedTab();
        new Standard_Item_POS_Page().getTheEmptyParkedTab(msg);
    }

    @When("{} message should be displayed when there is no checks available in Closed Tab")
    public void messageShouldBeDisplayedWhenThereIsNoChecksAvailableInClosedTab(String msg) {
        new Standard_Item_POS_Page().getTheEmptyClosedTab(msg);
    }

    @Then("Click on all the close symbols near the total")
    public void clickOnAllTheCloseSymbolsNearTheTotal() {
        new Standard_Item_POS_Page().clickAllTheMenuItem();
    }

    @Then("View Refunded tab")
    public void viewRefundedTab() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Refunded_Text();
    }

    @When("Select Refunded tab from sale history screen")
    public void selectRefundedTabFromSaleHistoryScreen() throws Exception {
        new Sale_History_Page().clickTheRefundedTab();
        new Sale_History_Page().verifyAll_Orders_Refunded_Tab_Active();
    }

    @Then("View the buttons shown below such as Re-Open Check and Print Receipt button")
    public void viewTheButtonsShownBelowSuchAsReOpenCheckAndPrintReceiptButton() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Reopen_Check_Button();
        new Sale_History_Page().verifyAll_Orders_Print_Receipt_Button();
    }

    @And("Fields such as Check Total and Average Amount is present at the bottom based on the receipts which displays the values")
    public void fieldsSuchAsCheckTotalAndAverageAmountIsPresentAtTheBottomBasedOnTheReceiptsWhichDisplaysTheValues() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Check_Total_Text();
        new Sale_History_Page().verifyAll_Orders_Print_Receipt_Button();
    }

    @And("Columns such as Customer, Receipt No, Transaction Time, Reasons, Total, Refund Total, Refund Type, Cashier")
    public void columnsSuchAsCustomerReceiptNoTransactionTimeReasonsTotalRefundTotalRefundTypeCashier() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Customer_Column_Text();
        new Sale_History_Page().verifyAll_Orders_Receipt_No_Column_Text();
        new Sale_History_Page().verifyAll_Orders_Transaction_Time_Column_Text();
        new Sale_History_Page().verifyAll_Orders_Reasons_Column_Text();
        new Sale_History_Page().verifyAll_Orders_Total_Column_Text();
        new Sale_History_Page().verifyAll_Orders_Refund_Total_Column_Text();
        new Sale_History_Page().verifyAll_Orders_Refund_Type_Column_Text();
        new Sale_History_Page().verifyAll_Orders_Cashier_Column_Text();
    }

    @When("{} message should be displayed when there is no checks available in the Refunded tab")
    public void messageShouldBeDisplayedWhenThereIsNoChecksAvailableInTheRefundedTab(String msg) {
        new Standard_Item_POS_Page().getTheEmptyRefundedTab(msg);
    }

    @And("Verify the retail items in the retail screen while doing refund")
    public void verifyTheRetailItemsInTheRetailScreenWhileDoingRefund() throws Exception {
        new Sale_History_Page().verifyTheRetailItemQuantityAndTotalInRetailScreenAndAfterReopenRetailScreen(menu,quantity,subtotal);
    }

    @Then("Shows buttons such as Cancel, Refund Items, Refund All and Exchange")
    public void showsButtonsSuchAsCancelRefundItemsRefundAllAndExchange() {
        new Standard_Item_POS_Page().getAllOrders_Refund_All_Btn().isDisplayed();
        new Standard_Item_POS_Page().getAllOrders_Refund_Items_Btn().isDisplayed();
        new Standard_Item_POS_Page().getAllOrders_Exchange_Btn().isDisplayed();
        new Park_Sale_And_Retrieve_Sale_Page().verifyCancelBtn();
    }


    @When("Select that digital receipt near the Cashier column")
    public void selectThatDigitalReceiptNearTheCashierColumn() throws Exception {
        new Sale_History_Page().ClickTheDigitalReceiptBtn_Refund();
    }

    @Then("View Exchanged tab")
    public void viewExchangedTab() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Exchanged_Text();
    }

    @When("Select Exchanged tab from sale history screen")
    public void selectExchangedTabFromSaleHistoryScreen() throws Exception {
        new Sale_History_Page().clickTheExchangedTab();
        new Sale_History_Page().verifyAll_Orders_Exchanged_Tab_Active();
    }


    @And("Shows This Sale is refunded text below the refunded retail item")
    public void showsThisSaleIsRefundedTextBelowTheRefundedRetailItem() throws Exception {
        new Sale_History_Page().verifyThisSaleIsRefunded();
    }

    @When("Page will navigate to retail order screen which displays greyed out refunded retail item")
    public void pageWillNavigateToRetailOrderScreenWhichDisplaysGreyedOutRefundedRetailItem() throws Exception {
        new Sale_History_Page().verifyTheRetailItemEnableOrDisable();
    }

    @Then("View the buttons shown below such as Re-Open Check, Re-Print Receipt and Operation button")
    public void viewTheButtonsShownBelowSuchAsReOpenCheckRePrintReceiptAndOperationButton() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Reopen_Check_Button();
        new Sale_History_Page().verifyAll_Orders_RePrint_Check_Button();
        new Sale_History_Page().verifyAll_Orders_Operation_Button();
    }

    @And("Columns such as Customer, Receipt No, Transaction Time, Reasons, Server and Total")
    public void columnsSuchAsCustomerReceiptNoTransactionTimeReasonsServerAndTotal() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Customer_Column_Text();
        new Sale_History_Page().verifyAll_Orders_Receipt_No_Column_Text();
        new Sale_History_Page().verifyAll_Orders_Transaction_Time_Column_Text();
        new Sale_History_Page().verifyAll_Orders_Reasons_Column_Text();
        new Sale_History_Page().verifyAll_Orders_Server_Column_Text();
        new Sale_History_Page().verifyAll_Orders_Total_Column_Text();
    }

    @When("{} should be displayed in empty Exchanged tab")
    public void shouldBeDisplayedInEmptyExchangedTab(String msg) {
        new Standard_Item_POS_Page().getTheEmptyExchangedTab(msg);
    }

    @Then("View Layaways tab")
    public void viewLayawaysTab() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Layaways_Text();
    }

    @And("Placed retail items should be displayed without any changes")
    public void placedRetailItemsShouldBeDisplayedWithoutAnyChanges() throws Exception {
        new Sale_History_Page().verifyTheRetailItemQuantityAndTotalInRetailScreenAndReceiptScreen(menu,quantity,subtotal);
    }

    @When("Select any retail item and click on Exchange")
    public void selectAnyRetailItemAndClickOnExchange() throws InterruptedException {
        new RetailPOS_Order_Page().getFirstMenuItem_OrderScreen().click();
        new Standard_Item_POS_Page().Click_ExchangeBtn();
    }

    @And("Get the first menu item")
    public void getTheFirstMenuItem() {
        firstRetailItem = new RetailPOS_Order_Page().getFirstItem();
    }

    @When("Add any Standard or variant or Kit Assembly items to Exchange")
    public void addAnyStandardOrVariantOrKitAssemblyItemsToExchange() throws Throwable {
        new Item_Selection_Page().Single_Random_Menu_Selection_Variant();
    }

    @Then("Click on Exchange button")
    public void clickOnExchangeButton() throws InterruptedException {
        new Standard_Item_POS_Page().Click_ExchangeBtn();
    }

    @Then("Click on Layaway option present at the custom options in retail order screen")
    public void clickOnLayawayOptionPresentAtTheCustomOptionsInRetailOrderScreen() {
        new RetailPOS_Order_Page().getOrder_Screen_layawayBtn().click();
    }

    @When("Enter Deposit Amount Screen will appear")
    public void enterDepositAmountScreenWillAppear() {
        new RetailPOS_Order_Page().enterDepositAmountPopupDisplayed();
    }

    @Then("Select Suggested deposit button or Minimum deposit button")
    public void selectSuggestedDepositButtonOrMinimumDepositButton() {
        new RetailPOS_Order_Page().clickSuggestedDepositOrMinimumDeposit();
    }

    @And("Respective values will get populated in Enter Deposit Amount number pad")
    public void respectiveValuesWillGetPopulatedInEnterDepositAmountNumberPad() {
        new RetailPOS_Order_Page().verifyTheSuggestedOrMinimumAmountInEnterDepositAmountScreen();
    }

    @And("Placed with the selected retail item in the Retail Screen")
    public void placedWithTheSelectedRetailItemInTheRetailScreen() {
        new RetailPOS_Order_Page().verifyTheMenuItem(firstRetailItem);
    }

    @Then("Able to view Exchange Screen with Exchange Reasons, Exchange Amount, Customer and Pay By options")
    public void ableToViewExchangeScreenWithExchangeReasonsExchangeAmountCustomerAndPayByOptions() {
        new Standard_Item_POS_Page().verifyTheExchangeScreenValidations();
    }

    @And("Able to view Exchange screen with Exchange completed for receipt number, Refund Amount, Subtotal, Tax, Total Values with Print Receipt and Done button")
    public void ableToViewExchangeScreenWithExchangeCompletedForReceiptNumberRefundAmountSubtotalTaxTotalValuesWithPrintReceiptAndDoneButton() {
        new Standard_Item_POS_Page().verifyTheExchangeScreenValidations_AfterPaid();
    }

    @When("Select Layaways tab from sale history screen")
    public void selectLayawaysTabFromSaleHistoryScreen() throws Exception {
        new Sale_History_Page().clickLayAwaysTab();
        new Sale_History_Page().verifyAll_Orders_Layaways_Tab_Active();
    }

    @Then("View the buttons shown below such as Pay Check, Open Check and Operation button")
    public void viewTheButtonsShownBelowSuchAsPayCheckOpenCheckAndOperationButton() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Pay_Check_Button();
        new Sale_History_Page().verifyAll_Orders_Open_Check_Button();
        new Sale_History_Page().verifyAll_Orders_Operation_Button();
    }

    @And("Fields such as Check Total, Customer, Average Duration and Average Amount is present at the bottom based on the receipts which displays the values")
    public void fieldsSuchAsCheckTotalCustomerAverageDurationAndAverageAmountIsPresentAtTheBottomBasedOnTheReceiptsWhichDisplaysTheValues() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Check_Total_Text();
        new Sale_History_Page().verifyAll_Orders_Customer_Text();
        new Sale_History_Page().verifyAll_Orders_Average_Duration_Text();
        new Sale_History_Page().verifyAll_Orders_Average_Amount_Text();
    }

    @And("Columns such as Customer, Receipt No, Transaction Date, Time, Cashier and Receipt Total")
    public void columnsSuchAsCustomerReceiptNoTransactionDateTimeCashierAndReceiptTotal() throws Exception {
        new Sale_History_Page().verifyAll_Orders_Customer_Column_Text();
        new Sale_History_Page().verifyAll_Orders_Receipt_No_Column_Text();
        new Sale_History_Page().verifyAll_Orders_Time_Column_Text();
        new Sale_History_Page().verifyAll_Orders_Date_Column_Text();
        new Sale_History_Page().verifyAll_Orders_Cashier_Column_Text();
        new Sale_History_Page().verifyAll_Orders_Receipt_No_Column_Text();
    }


    @Then("Click on Open Check Button by selecting that Layaway receipt")
    public void clickOnOpenCheckButtonBySelectingThatLayawayReceipt() throws InterruptedException {
        new Standard_Item_POS_Page().Click_OpenCheckBtn();
    }

    @Then("Click on Pay Check Button without selecting that Layaway receipt")
    public void clickOnPayCheckButtonWithoutSelectingThatLayawayReceipt() throws InterruptedException {
        new Standard_Item_POS_Page().Click_PayCheckBtn();
    }

    @Then("Click on Open Check Button without selecting that Layaway receipt")
    public void clickOnOpenCheckButtonWithoutSelectingThatLayawayReceipt() {
        new Standard_Item_POS_Page().clickTheOpenCheckButton();
    }

    @Then("Page will navigate to retail order screen with placed retail items along with Finish button")
    public void pageWillNavigateToRetailOrderScreenWithPlacedRetailItemsAlongWithFinishButton() throws Exception {
        new Sale_History_Page().verifyTheRetailItemQuantityAndTotalInRetailScreenAndReceiptScreen(menu,quantity,subtotal);
        new RetailPOS_Order_Page().VerifyTheFinishBtn();
    }

    @Then("Click on Finish option in retail order screen")
    public void clickOnFinishOptionInRetailOrderScreen() {
        new RetailPOS_Order_Page().clickTheFinishBtn();
    }

    @Then("Click on Payment option in retail order screen")
    public void clickOnPaymentOptionInRetailOrderScreen() {
        new RetailPOS_Order_Page().clickThePaymentBtn();
    }

    @Then("Click on Pay Check Button by selecting that Layaway receipt")
    public void clickOnPayCheckButtonBySelectingThatLayawayReceipt() throws InterruptedException {
        new Standard_Item_POS_Page().Click_PayCheckBtn();
    }

    @Then("Able to view the Re-Print Receipt button from Exchanged sale history tab")
    public void ableToViewTheRePrintReceiptButtonFromExchangedSaleHistoryTab() throws Exception {
        new Sale_History_Page().verifyAll_Orders_RePrint_Check_Button();
        new Sale_History_Page().clickTheReprintCheck();
    }

    @When("Exchanged retail item will be displayed in retail order screen in greyed out manner")
    public void exchangedRetailItemWillBeDisplayedInRetailOrderScreenInGreyedOutManner() throws Exception {
        new Sale_History_Page().verifyTheRetailItemsInRetailScreenAndReceiptScreen(menu);
        new Sale_History_Page().verifyTheRetailItemEnableOrDisable();
    }

    @When("{} message should be displayed when there is no checks available in LayAways tab")
    public void messageShouldBeDisplayedWhenThereIsNoChecksAvailableInLayAwaysTab(String msg) throws Exception {
        new Sale_History_Page().clearAllTheLayAwaySalesFromTheLayAwayTab();
        new Standard_Item_POS_Page().getTheEmptyLayawaysTab(msg);
    }


    @And("select the required check from Refunded")
    public void selectTheRequiredCheckFromRefunded() throws Exception {
        new Sale_History_Page().clickTheFirstRefundedCheck();
    }

    @And("Verify the retail item, quantity and total changes in Retail POS screen")
    public void verifyTheRetailItemQuantityAndTotalChangesInRetailPOSScreen() throws Exception {
        new Sale_History_Page().verifyTheRetailItemQuantityAndTotalInRetailScreenAndAfterReopenRetailScreen1(menu,quantity,subtotal);
    }

    @Then("Verify the Previously ordered item")
    public void verifyThePreviouslyOrderedItem() throws Exception {
        new Sale_History_Page().verifyTheRetailItemQuantityAndTotalInRetailScreenAndAfterReopenRetailScreen(menu,quantity,subtotal);
    }

    @Then("Get the SKU code from the retail screen")
    public void getTheSKUCodeFromTheRetailScreen() throws Exception {
        SKU = new Sale_History_Page().getTheSKUCode_FromRetailScreen();
    }

    @And("Validate the SKU code")
    public void validateTheSKUCode() throws Exception {
        new Sale_History_Page().validateTheSKUCode(SKU);
    }

    @Then("Get the Variant code from the retail screen")
    public void getTheVariantCodeFromTheRetailScreen() throws Exception {
        variant = new Sale_History_Page().getTheVariantCode_FromRetailScreen();
    }

    @And("Validate the Variant code")
    public void validateTheVariantCode() throws Exception {
        new Sale_History_Page().validateTheVariantCode(variant);
    }

}
