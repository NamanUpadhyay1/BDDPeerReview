package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DetailsCommentPage extends Utils
{
    private By _commentTitle = By.id("AddNewComment_CommentTitle");
    //given key of the locator at the top for ease at the time of code refinement.
    private By _mainComment = By.id("AddNewComment_CommentText");
    //given key of the locator at the top for ease at the time of code refinement.
    private By _submitComment = By.name("add-comment");
    //given key of the locator at the top for ease at the time of code refinement.

    public void newsCommentInformation()
    {
        waitForUrlToBe("https://demo.nopcommerce.com/nopcommerce-new-release",15);
        //waitForUrlToBe() will wait until "10" period ends.
        typeText(_commentTitle,LoadProp.getProperty("cmttitle"));
        //to add data as string in the given locator
        typeText(_mainComment,LoadProp.getProperty("maincmt"));
        //to add data as string in the given locator

    }

    public void newsCommentInfoSubmitButton()
    {
        clickOnElement(_submitComment);
        //to click the locator.
    }
    public void newsCommentSuccessMessage()
    {
        String successMSG = getText(By.xpath("//div[@class='result']"));
        //to store the message in the string via locator key and value.
        Assert.assertEquals(successMSG,"News comment is successfully added.","The Success Message of comment addition is incorrect.");
        //To compare the expected result and actual result.
    }
}
