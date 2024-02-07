package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Customer_Profile_Page;

public class Add_Customer {

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

    @And("verify ByMobile search available in popup")
    public void verifyByMobileSearchAvailableInPopup() {
        new Customer_Profile_Page().verifyTheByPhoneInSearchScreen();
    }

    @Then("Click the close button")
    public void clickTheCloseButton() {
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
}
