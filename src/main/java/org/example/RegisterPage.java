package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends Utils
{
    private By _maleRadioButton = By.id("gender-male");
    // created a specific radio button object with locator key so that if in the future,if changes come then the locator can be changed from here.
    private By _firstName = By.id("FirstName");
    // created a specific firstname text object with locator key so that if in the future,if changes come then the locator can be changed from here.
    private By _lastName = By.id("LastName");
    // created a specific last name text object with locator key so that if in the future,if changes come then the locator can be changed from here.
    private By _dobDate = By.name("DateOfBirthDay");
    // created a specific drop-down date of birthdate object with locator key so that if in the future,if changes come then the locator can be changed from here.
    private By _dobMonth = By.name("DateOfBirthMonth");
    // created a specific drop-down date of birth month object with locator key so that if in the future,if changes come then the locator can be changed from here.
    private By _dobYear = By.name("DateOfBirthYear");
    // created a specific drop-down date of birth year object with locator key so that if in the future,if changes come then the locator can be changed from here.
    private By _emailField = By.name("Email");
    // created a specific email text object with locator key so that if in the future,if changes come then the locator can be changed from here.
    private By _companyDetails = By.id("Company");
    // created a specific company detail text object with locator key so that if in the future,if changes come then the locator can be changed from here.
    private By _passwordField = By.id("Password");
    // created a specific password text object with locator key so that if in the future,if changes come then the locator can be changed from here.
    private By _confirmPasswordField = By.id("ConfirmPassword");
    // created a specific password confirmation text object with locator key so that if in the future,if changes come then the locator can be changed from here.
    private By _registrationSubmitButton = By.id("register-button");
    // created a specific register-submit button object with locator key so that if in the future,if changes come then the locator can be changed from here.

    public void registrationDetails()
    // this method will contain all the data and value that needs to be added.
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("register"),"You were redirected to the wrong Url");
        //assert function will show an error msg if you are redirected to the wrong url.

        //All these methods are recalled from Utils class.
        waitForUrlToBe("https://demo.nopcommerce.com/register?returnUrl=%2F",30);
        //waitForUrlToBe() will wait until "10" period ends.

        waitForElementToBeClickable(_registrationSubmitButton,10);
        // waitForElementToBeClickable() will wait until "10" period will end and then click the locator _registerButton.

        radioButtonSelect(_maleRadioButton);
        // this will select the male radiobutton with the use of locator.

        typeText(_firstName,LoadProp.getProperty("firstname"));
        // this will type the text "Naman" in the locator in _firstName.

        typeText(_lastName,LoadProp.getProperty("lastname"));
        // this will type the text "Upadhyay" in the locator in _lastName.

        selectFromDropDownByVisibleTText(_dobDate,LoadProp.getProperty("dOBDate"));

        selectFromDropDownByVisibleTText(_dobMonth,LoadProp.getProperty("dOBMonth"));

        selectFromDropDownByVisibleTText(_dobYear,LoadProp.getProperty("dOBYear"));

        typeText(_emailField,LoadProp.getProperty("email1")+getTimeStamp()+LoadProp.getProperty("email2"));

        typeText(_companyDetails,LoadProp.getProperty("companyDetails"));

        // this will type the text "Info Tech" in the locator in _companyDetails.
        typeText(_passwordField,LoadProp.getProperty("password"));

        // this will type the text "password123" in the locator in _passwordField.
        typeText(_confirmPasswordField,LoadProp.getProperty("confirmpassword"));

        // this will type the text "password123" in the locator in _confirmPasswordField.
        clickOnElement(_registrationSubmitButton);
        // this will click the element in _registrationSubmitButton.
    }
}
