package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Customer_Profile_Page;
import pages.RetailPOS_Order_Page;

public class Add_Customer {

    String mobNo,firstName,customerName,lastName,credit;

    @Then("Click the Add customer button in ordering screen")
    public void clickTheAddCustomerButtonInOrderingScreen() throws InterruptedException {
        new Customer_Profile_Page().clickTheAddCustomerBtn();
    }

    @Then("Add customer popup is open")
    public void addCustomerPopupIsOpen() {
        new Customer_Profile_Page().verifyTheAddCustomerPopup();
    }

    @And("Verify the Add customer title is available in popup")
    public void verifyTheAddCustomerTitleIsAvailableInPopup() {
        new Customer_Profile_Page().verifyTheAddCustomerPopup();
    }

    @And("verify By Name or Email search bar available in popup")
    public void verifyByNameEmailSearchBarAvailableInPopup() {
        new Customer_Profile_Page().verifyTheByNameOrEmailInSearchScreen();
    }

    @And("verify By Mobile search available in popup")
    public void verifyByMobileSearchAvailableInPopup() {
        new Customer_Profile_Page().verifyTheByPhoneInSearchScreen();
    }

    @Then("Click the close button")
    public void clickTheCloseButton() throws InterruptedException {
        new Customer_Profile_Page().clickTheCloseBtn();
    }

    @And("Add the customer Mobile number")
    public void addTheCustomerMobileNumber() {
        new Customer_Profile_Page().enterTheRandomMobileNumber();
    }

    @And("click the Add customer")
    public void clickTheAddCustomer() {
        new Customer_Profile_Page().clickTheAddCustomer_SearchScreen();
    }

    @Then("Customer Profile screen is open to add the new customer details")
    public void customerProfileScreenIsOpenToAddTheNewCustomerDetails() {
        new Customer_Profile_Page().verifyTheCustomerProfileTitle();
    }

    @And("verify the Search bar is available")
    public void verifyTheSearchBarIsAvailable() {
        new Customer_Profile_Page().verifyTheSearchBarInCustomerProfileScreen();
    }

    @And("Verify the First Name field")
    public void verifyTheFirstNameField() {
        new Customer_Profile_Page().verifyTheFirstNameInCustomerProfileScreen();
    }

    @And("Verify the Last Name field")
    public void verifyTheLastNameField() {
        new Customer_Profile_Page().verifyTheSecondNameInCustomerProfileScreen();
    }

    @And("Verify the Cancel button")
    public void verifyTheCancelButton() {
        new Customer_Profile_Page().verifyTheCloseBtnInCustomerProfileScreen();
    }

    @And("Verify the Save button")
    public void verifyTheSaveButton() {
        new Customer_Profile_Page().verifyTheSaveBtnInCustomerProfileScreen();
    }

    @And("Verify Repeat Order button")
    public void repeatOrderButton() {
        new Customer_Profile_Page().verifyTheRepeatOrderInCustomerProfileScreen();
    }

    @And("Verify Display Order Button")
    public void verifyDisplayOrderButton() {
        new Customer_Profile_Page().verifyTheDisplayOrderInCustomerProfileScreen();
    }

    @And("Verify Customer plan button")
    public void verifyCustomerPlanButton() {
        new Customer_Profile_Page().verifyTheCustomerPlanInCustomerProfileScreen();
    }

    @And("Verify the Previous Orders")
    public void verifyThePreviousOrders() {
        new Customer_Profile_Page().verifyThePreviousOrdersInCustomerProfileScreen();
        new Customer_Profile_Page().verifyTheNoPreviousOrdersInCustomerProfileScreen();
    }

    @And("Verify the Google Map")
    public void verifyTheGoogleMap() {
        new Customer_Profile_Page().verifyTheMapInCustomerProfileScreen();
    }

    @And("Verify the Add credit button")
    public void verifyTheAddCreditButton() {
        new Customer_Profile_Page().verifyTheAddCreditInCustomerProfileScreen();
    }

    @And("Verify the Profile picture")
    public void verifyTheProfilePicture() {
        new Customer_Profile_Page().verifyTheProfileImageInCustomerProfileScreen();
    }

    @And("Verify the Tax Exempt toggle")
    public void verifyTheTaxExemptToggle() {
        new Customer_Profile_Page().verifyTheTaxExemptInCustomerProfileScreen();
    }

    @And("Verify the Note field")
    public void verifyTheNoteField() {
        new Customer_Profile_Page().verifyTheNotesInCustomerProfileScreen();
    }

    @And("Verify the Address field")
    public void verifyTheAddressField() {
        new Customer_Profile_Page().verifyTheAddressInCustomerProfileScreen();
    }

    @And("Verify the Nationality field")
    public void verifyTheNationalityField() {
        new Customer_Profile_Page().verifyTheNationalityInCustomerProfileScreen();
    }

    @And("Verify the Mobile numbers field")
    public void verifyTheMobileNumbersField() {
        new Customer_Profile_Page().verifyTheMobileInCustomerProfileScreen();
    }

    @And("Verify the Birthday field")
    public void verifyTheBirthdayField() {
        new Customer_Profile_Page().verifyTheBirthDayInCustomerProfileScreen();
    }

    @And("Validate the Email id field")
    public void validateTheEmailIdField() {
        new Customer_Profile_Page().verifyTheEmailIDInCustomerProfileScreen();
    }

    @And("Verify the Customer identification number field")
    public void verifyTheCustomerIdentificationNumberField() {
        new Customer_Profile_Page().verifyTheCustomerIDInCustomerProfileScreen();
    }

    @And("Enter the First Name")
    public void enterTheFirstName() {
        new Customer_Profile_Page().enterTheFirstName();
    }

    @And("Click the save button in customer profile window")
    public void clickTheSaveButtonInCustomerProfileWindow() {
        new Customer_Profile_Page().clickTheSaveBtn();
    }

    @Then("Alert message popup is fire {}")
    public void alertMessagePopupIsFire(String msg) {
        new Customer_Profile_Page().verifyTheAlertMessage(msg);
    }

    @And("Click the Done button in popup")
    public void clickTheDoneButtonInPopup() {
        new Customer_Profile_Page().clickTheDoneButton();
    }

    @And("Enter the Last Name")
    public void enterTheLastName() {
        new Customer_Profile_Page().enterTheLastName();
    }

    @And("Enter the Customer identification number")
    public void enterTheCustomerIdentificationNumber() {
        new Customer_Profile_Page().enterCustomerIdentificationNumber();
    }

    @And("Enter the Email id")
    public void enterTheEmailId() {
        new Customer_Profile_Page().enterTheMailId();
    }

    @And("verify the Numpad is available or not")
    public void verifyTheNumpadIsAvailableOrNot() {
        new Customer_Profile_Page().verifyTheNumpad();
    }

    @Then("verify the add customer is present or not with out enter any number or name")
    public void verifyTheAddCustomerIsPresentOrNotWithOutEnterAnyNumberOrName() {
        new Customer_Profile_Page().verifyTheAddCustomerPopup1();
    }

    @And("Enter the number less than six digits")
    public void enterTheNumberLessThanDigits() {
        new Customer_Profile_Page().enterTheRandomMobileNumber_LessThanSixCharacters_AndVerifyError();
    }

    @And("Get the mobile number")
    public void getTheMobileNumber() {
       mobNo = new Customer_Profile_Page().getTheMobileNumberFromTheAddCustomer_SearchField();
    }

    @And("Verify the added mobile number is available or not in the Customer profile screen")
    public void verifyTheAddedMobileNumberIsAvailableOrNotInTheCustomerProfileScreen() {
        new Customer_Profile_Page().verifyTheAddedMobileNumberInCustomerProfileScreen(mobNo);
    }

    @Then("Click the Edit button of existing mobile number")
    public void clickTheEditButtonOfExistingMobileNumber() {
        new Customer_Profile_Page().clickTheEditButtonOfMobileNumber();
    }

    @And("Update the mobile number")
    public void updateTheMobileNumber() throws InterruptedException {
        new Customer_Profile_Page().updateTheMobileNumber_CustomerProfileScreen();
    }

    @And("Updates the mobile number")
    public void updatesTheMobileNumber() {
        new Customer_Profile_Page().updateTheMobileNumber_CustomerProfileScreen1();
    }

    @Then("Get the name from the First Name field")
    public void getTheNameFromTheFirstNameField() {
        firstName = new Customer_Profile_Page().firstName_CustomerProfileScreen();
    }

    @Then("Get the name from the First and Last Name field")
    public void getTheNameFromTheFirstNameField1() {
        firstName = new Customer_Profile_Page().firstName_CustomerProfileScreen();
        lastName = new Customer_Profile_Page().lastName_CustomerProfileScreen();
        new Customer_Profile_Page().verifyTheCustomerName1(firstName,lastName);
    }

    @Then("Verify the added customer is displayed in ordering screen")
    public void verifyTheAddedCustomerIsDisplayedInOrderingScreen() {
        new Customer_Profile_Page().verifyTheAddedCustomerInRetailScreen(firstName);
    }

    @And("Verify the remove customer button in the retail screen")
    public void verifyTheRemoveCustomerButtonInTheRetailScreen() {
        new Customer_Profile_Page().verifyTheCloseButtonAvailableOrNotFor_AttachedCustomer(firstName);
    }

    @Then("Click the remove customer button")
    public void clickTheRemoveCustomerButton() {
        new Customer_Profile_Page().clickTheCloseButtonOfAttachedCustomer(firstName);
    }

    @Then("Enter the customer number {string}")
    public void enterTheCustomerNumber(String num) throws InterruptedException {
        customerName = new RetailPOS_Order_Page().enterTheGivenMobileNumber_GetTheCustomerName(num);
    }

    @Then("Verify the added customer is displayed in ordering screen of existing customer")
    public void verifyTheAddedCustomerIsDisplayedInOrderingScreenOfExistingCustomer() {
        new Customer_Profile_Page().verifyTheCustomerName(customerName);
    }

    @And("Click the By Name or Email option")
    public void clickTheByNameOrEmailOption() {
        new Customer_Profile_Page().clickTheByNameOption();
    }

    @Then("Enter the single character and verify the error message")
    public void enterTheSingleCharacterAndVerifyTheErrorMessage() {
        new Customer_Profile_Page().enterTheSingleCharacter_ByNameOption();
    }

    @And("Click the Add customer button")
    public void clickTheAddCustomerButton() {
        new Customer_Profile_Page().clickTheAddCustomer_SearchScreen();
    }

    @Then("Search the existing customer name {string}")
    public void searchTheExistingCustomerName(String customer) {
        new Customer_Profile_Page().verifyTheCustomerProfileScreenSearch(customer);
    }

    @Then("Enter the name")
    public void enterTheName() {
        new Customer_Profile_Page().enterTheSingleCharacter_ByNameOption_RandomName();
    }

    @Then("Click the add button of mobile number")
    public void clickTheAddButtonOfMobileNumber() {
        new Customer_Profile_Page().clickTheAddMobileNumber();
    }

    @And("Enter the Required number less than four digits error message should be displayed")
    public void enterTheRequiredNumberLessThanDigitsErrorMessageShouldBeDisplayed() {
        new Customer_Profile_Page().updateTheMobileNumber_CustomerProfileScreen_lessThan5Chars();
    }

    @Then("Search the existing customer mobile number {string}")
    public void searchTheExistingCustomerMobileNumber(String st) {
        new Customer_Profile_Page().verifyTheCustomerProfileScreenSearch(st);
    }

    @Then("Enter and select the previous customer name {string}")
    public void enterAndSelectThePreviousCustomerName(String CustNum) throws InterruptedException {
        new RetailPOS_Order_Page().AddTheCustomer(CustNum);
    }

    @Then("Enter and select the previous customer email {string}")
    public void enterAndSelectThePreviousCustomerEmail(String CustNum) throws InterruptedException {
        new RetailPOS_Order_Page().AddTheCustomer(CustNum);
    }

    @Then("Enter the Required number")
    public void enterTheRequiredNumber() {
        new Customer_Profile_Page().updateTheMobileNumber_CustomerProfileScreen1();
    }

    @And("Edit the First name")
    public void editTheFirstName() {
        new Customer_Profile_Page().enterTheFirstName();
    }

    @Then("No Results search result should be found")
    public void noResultsSearchResultShouldBeFound() {
        new Customer_Profile_Page().verifyTheNoResultsInAddCustomerPopup();
    }

    @And("Select the birth day")
    public void selectTheBirthDay() {
        new Customer_Profile_Page().selectTheBirthDate();
    }

    @And("Add another one mobile number")
    public void addAnotherOneMobileNumber() throws InterruptedException {
        new Customer_Profile_Page().clickTheAddMobileNumber();
        new Customer_Profile_Page().updateTheMobileNumber_CustomerProfileScreen();
    }

    @And("Click the Delete button of existing mobile number")
    public void clickTheDeleteButtonOfExistingMobileNumber() {
        new Customer_Profile_Page().clickTheDeleteButton();
    }

    @And("Enter the Notes")
    public void enterTheNotes() {
        new Customer_Profile_Page().enterTheNotes();
    }

    @And("Click the add button under the address field")
    public void clickTheAddButtonUnderTheAddressField() {
        new Customer_Profile_Page().clickTheAddButtonOfAddress();
    }

    @Then("Click the Enter Address button")
    public void clickTheEnterAddressButton() {
        new Customer_Profile_Page().ClickTheEnterAddressButton();
    }

    @And("Enter Add Address details")
    public void enterAddAddressDetails() {
        new Customer_Profile_Page().enterTheAddress();
    }

    @Then("Click the save button in Add Address")
    public void clickTheSaveButtonInAddAddress() {
        new Customer_Profile_Page().clickTheSaveButton_Of_Add_Address();
    }

    @And("Enable the Tax Exempt")
    public void enableTheTaxExempt() {
        new Customer_Profile_Page().enableTheTaxExemptCustomer();
    }

    @And("Check the Tax option is available or not in the Retail Screen after enabling the Tax Exempt")
    public void checkTheTaxOptionIsAvailableOrNotInTheRetailScreenAfterEnablingTheTaxExempt() {
        new Customer_Profile_Page().verifyTheTax_AfterEnablingFromTheCustomerProfileScreen();
    }

    @And("Select the any one previous order")
    public void selectTheAnyOnePreviousOrder() {
        new Customer_Profile_Page().clickTheFirstOrderOfPreviousOrders();
    }

    @Then("Click the Repeat Order button")
    public void clickTheRepeatOrderButton() {
        new Customer_Profile_Page().clickTheRepeatOrder();
    }

    @Then("Click the Display Order button")
    public void clickTheDisplayOrderButton() {
        new Customer_Profile_Page().clickTheDisplayOrderButton();
    }

    @And("Click the Back Arrow button from the display order receipt screen")
    public void clickTheBackArrowButtonFromTheDisplayOrderReceiptScreen() throws Exception {
        new Customer_Profile_Page().clickTheBackOrderButtonOfDisplayOrder();
    }

    @Then("Enter the Required amount in Add Credit popup and get the amount")
    public void enterTheRequiredAmountInAddCreditPopupAndGetTheAmount() {
        credit = new Customer_Profile_Page().updateAddCredit_CustomerProfileScreen();
    }

    @And("Click the Add Credit button")
    public void clickTheAddCreditButton() {
        new Customer_Profile_Page().clickTheAddCreditButton();
    }


    @And("Click the Edit button of Credit option in customer profile screen")
    public void clickTheEditButtonOfCreditOptionInCustomerProfileScreen() {
        new Customer_Profile_Page().clickTheEditButtonOfAddCreditPopup();
    }

    @Then("Enter the Required amount in Add Credit popup and get the amount of edit")
    public void enterTheRequiredAmountInAddCreditPopupAndGetTheAmountOfEdit() {
        credit = new Customer_Profile_Page().updateAddCredit_CustomerProfileScreen1();
    }

    @Then("Clear the Add Credit value")
    public void clearTheAddCreditValue() {
        new Customer_Profile_Page().clear_TheAddCredit_CustomerProfileScreen1();
    }

    @And("Verify the entered credit amount")
    public void verifyTheEnteredCreditAmount() {
        new Customer_Profile_Page().verifyTheAddCreditAmount(credit);
    }

    @And("Verify the cleared value of Add credit")
    public void verifyTheClearedValueOfAddCredit() {
        new Customer_Profile_Page().verifyTheAddCreditAmount1();
    }

    @Then("Enter the amount in Add Credit popup and get the amount")
    public void enterTheAmountInAddCreditPopupAndGetTheAmount() {
        credit = new Customer_Profile_Page().updateAddCredit_CustomerProfileScreen2();
    }

    @And("Verify the remaining value of Add credit")
    public void verifyTheRemainingValueOfAddCredit() {
        new Customer_Profile_Page().verifyTheAddCreditAmount2();
    }

    @Then("Click the Customer Plan button")
    public void clickTheCustomerPlanButton() {
        new Customer_Profile_Page().clickTheCustomerPlan();
    }

    @Then("Click the save button of customer plan")
    public void clickTheSaveButtonOfCustomerPlan() {
        new Customer_Profile_Page().clickTheSaveButtonOfCustomerPlan();
    }

    @And("Enter the wrong Card number")
    public void enterTheWrongCardNumber() {
        new Customer_Profile_Page().enterWrongTheCustomerPlanCardNumber();
    }

    @Then("Enter the Card number")
    public void enterTheCardNumber() {
        new Customer_Profile_Page().enterTheCustomerPlanCardNumber();
    }

    @Then("Enter the Required amount in Recharge")
    public void enterTheRequiredAmountInRecharge() {
        new Customer_Profile_Page().clickTheRechargeAmount();
        new Customer_Profile_Page().updateAddCredit_CustomerProfileScreen1();
    }

    @And("Click the Amount box of Limit")
    public void clickTheAmountBoxOfLimit() {
        new Customer_Profile_Page().clickTheLimitAmountBox();
    }

    @Then("Click the Amount box of Max Limit")
    public void clickTheAmountBoxOfMaxLimit() {
        new Customer_Profile_Page().clickTheMaxLimitAmountBox();
    }

    @And("Enable the Limit Toggle")
    public void enableTheLimitToggle() {
        new Customer_Profile_Page().clickTheLimitToggle();
    }

    @Then("Enter the Required amount in Limit")
    public void enterTheRequiredAmountInLimit() {
        new Customer_Profile_Page().clickTheLimitAmountBox();
        new Customer_Profile_Page().updateAddCredit_CustomerProfileScreen1();
    }

    @And("Enable the Maximum Limit Toggle")
    public void enableTheMaximumLimitToggle() {
        new Customer_Profile_Page().clickTheMaxLimitToggle();
    }

    @And("Enter the Required amount in Max Limit")
    public void enterTheRequiredAmountInMaxLimit() {
        new Customer_Profile_Page().clickTheMaxLimitAmountBox();
        new Customer_Profile_Page().updateAddCredit_CustomerProfileScreen3();
    }

    @Then("Select the Limited Period")
    public void selectTheLimitedPeriod() {
        new Customer_Profile_Page().clickTheLimitPeriod();
        new Customer_Profile_Page().clickTheLimitPeriodOption();
    }

    @And("Enable the Allow Credit")
    public void enableTheAllowCredit() {
        new Customer_Profile_Page().clickTheAllowCreditToggle();
    }

    @Then("Click the close button of customer profile")
    public void clickTheCloseButtonOfCustomerProfile() {
        new Customer_Profile_Page().clickTheCloseButton();
    }
}
