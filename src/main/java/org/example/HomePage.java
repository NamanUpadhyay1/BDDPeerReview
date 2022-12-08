package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utils
{
    public By _registerButton = By.xpath("//li//a[@class=\"ico-register\"]");
    // created a specific register button object so that if in the future,if changes come then the locator can be changed from here.
    private By _electronicsButton = By.linkText("Electronics");
    //given key of the locator at the top for ease at the time of code refinement.

    private By _computersButton = By.linkText("Computers");
    private By _voteButton = By.id("vote-poll-1");
    //given key of the locator at the top for ease at the time of code refinement.
    private By _newsDetailsButtton = By.xpath("//div[@class=\"buttons\"]//a[@href=\"/nopcommerce-new-release\"]");
    //given key of the locator at the top for ease at the time of code refinement.
    private By _facebookButton = By.linkText("Facebook");
    //given key of the locator at the top for ease at the time of code refinement.
    private By _appleMacBookPro = By.linkText("Apple MacBook Pro 13-inch");
    //given key of the locator at the top for ease at the time of code refinement.
    private By _logInButton = By.linkText("Log in");
    //given key of the locator at the top for ease at the time of code refinement.
    private By _enterEmail = By.id("Email");
    //given key of the locator at the top for ease at the time of code refinement.
    private By _enterPassword = By.id("Password");
    //given key of the locator at the top for ease at the time of code refinement.
    private By _returningLogInButton = By.xpath("//div[@class='buttons']//button[@type='submit']");
    //given key of the locator at the top for ease at the time of code refinement.

    private By _searchBar = By.id("small-searchterms");

    private By _searchSubmit = By.xpath("//button[@type=\"submit\"]");

    private By _currencyOption = By.id("customerCurrency");


    public void homePageOfNop()
    {
        waitForUrlToBe("https://demo.nopcommerce.com/",30);
        //waitForUrlToBe() will wait until "10" period ends.
    }
    public void logInNopCommerce()
    {
        waitForUrlToBe("https://demo.nopcommerce.com/",30);
        //waitForUrlToBe() will wait until "10" period ends.
        clickOnElement(_logInButton);
    }
    public void clickOnRegisterButton()
    // created a method with actions in it to call it in TestSuit later.
    {
        waitForUrlToBe("https://demo.nopcommerce.com/",30);
        //waitForUrlToBe() will wait until "10" period ends.
        waitForElementToBeClickable(_registerButton,30);
        // waitForElementToBeClickable() will wait until "5" period will end and then click the locator _registerButton.
        clickOnElement(_registerButton);
        //it will click the locator stored in _registerButton.
    }


    public void newReleaseDetailsButton()
    // created a method with actions in it to call it in TestSuit later.
    {
        waitForUrlToBe("https://demo.nopcommerce.com/",10);
        //waitForUrlToBe() will wait until "10" period ends.
        clickOnElement(_newsDetailsButtton);
        //to click the given locator
    }
    public void clickOnCategoryPage(String category_button)
    {
        waitForUrlToBe("https://demo.nopcommerce.com/",30);
        clickOnElement(By.linkText(category_button));
    }

    public void clickOnMacBook()
    // created a method with actions in it to call it in TestSuit later.
    {
        waitForUrlToBe("https://demo.nopcommerce.com/",10);
        //waitForUrlToBe() will wait until "10" period ends.
        clickOnElement(_appleMacBookPro);
        //to click the given locator
    }

    public void currencySortOnHomePage()
    {
        waitForUrlToBe("https://demo.nopcommerce.com/", 10);
        //waitForUrlToBe() will wait until "10" period ends.

        selectFromDropDownByVisibleTText(_currencyOption,LoadProp.getProperty("dropdowndollar"));
        //This will select the drop-down value by the index number.(Dollar)

        List<WebElement> dollarProductPrices = driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
        //This will create a List of elements on web via xpath given above and store them in the variable dollarProductPrices.

        for (WebElement dollarPrices : dollarProductPrices)
        //for loop for test case checking result.
        {
            Assert.assertTrue(dollarPrices.getText().contains("$"), "Prices sorted to dollar are incorrect.");
            //Assert is an import class from testng and this is used to compare expected and actual results with specific message which is showed when the test case fails.
        }
        selectFromDropDownByVisibleTText(_currencyOption,LoadProp.getProperty("dropdowneuro"));
        //This will select the drop-down value by the index number.(Euro)

        List<WebElement> euroProductPrices = driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
        //This will create a List of elements on web via xpath given above and store them in the variable euroProductPrices.

        for (WebElement euroPrices : euroProductPrices)
        //for loop for test case checking result.
        {
            Assert.assertTrue(euroPrices.getText().contains("€"), "Prices sorted to Euro are incorrect.");
            //Assert is an import class from testng and this is used to compare expected and actual results with specific message which is showed when the test case fails.
        }

    }
}
