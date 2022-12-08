package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class MacBookPage extends Utils
{
    private By _emailAFriend = By.xpath("//button[@class='button-2 email-a-friend-button']");
    //given key and value of the locator at the top for ease at the time of code refinement.
    private By _friendsEmail = By.id("FriendEmail");
    //given key and value of the locator at the top for ease at the time of code refinement.

    private By _yourEmail = By.id("YourEmailAddress");
    //given key and value of the locator at the top for ease at the time of code refinement.
    private By _mailMessage = By.id("PersonalMessage");
    //given key and value of the locator at the top for ease at the time of code refinement.
    private By _sendButton = By.name("send-email");
    //given key and value of the locator at the top for ease at the time of code refinement.

    public void clickOnEmailAFriend()
    {
        waitForUrlToBe("https://demo.nopcommerce.com/apple-macbook-pro-13-inch",15);
        //waitForUrlToBe() will wait until "15" period ends.
        clickOnElement(_emailAFriend);
    }
    public void macbookDetails()
    {
        waitForElementToBeVisible(_friendsEmail,30);
        //to click the given locator
        typeText(_friendsEmail,LoadProp.getProperty("frndemail"));
        //to enter the data in the given locator.
        typeText(_mailMessage,LoadProp.getProperty("mailmsg"));
        //to enter the data in the given locator.

    }
    public void macbookDetailsSubmit()
    {
        waitForElementToBeClickable(_sendButton,30);
        clickOnElement(_sendButton);
        //to click the given locator.
    }
    public void macbookSuccessMessage()
    {
        String emailSuccessMSG = getText(By.xpath("//div[@class=\"result\"]"));
        //this will store the retrieved data via xpath in the string "emailSuccessMSG".
        Assert.assertEquals(emailSuccessMSG,"Your message has been sent.");
        //to compare expected and actual results.
    }
}
