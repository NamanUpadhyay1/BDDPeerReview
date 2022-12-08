package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterSuccess extends Utils
{
    public void verifyRegistrationCompletedSuccessfully()
    //reusable method verifyRegistrationCompletedSuccessfully(). will be used in TestSuit later.
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("registerresult"),"You have been redirected to the wrong url.");
        //assert function will show an error msg if you are redirected to the wrong url.
        waitForUrlToBe("https://demo.nopcommerce.com/registerresult/1?returnUrl=/",15);
        //waitForUrlToBe() will wait until "15" period ends.
        String successMsg = getText(By.xpath("//div//div[@class='result']"));
        //created an obj to store the value of getText(via locator).
        Assert.assertEquals(successMsg,"Your registration completed","Your Registration Failed");
        // Assert function to verify weather our actual results match the expected result.
    }
}
