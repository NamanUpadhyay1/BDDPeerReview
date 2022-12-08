package org.example;

import org.openqa.selenium.By;

public class LogInPage extends Utils
{
    public void loginDetails()
    {
        typeText(By.id("Email"),LoadProp.getProperty("loggemail"));
        typeText(By.id("Password"),LoadProp.getProperty("loggpassword"));
        clickOnElement(By.xpath("//div[@class='buttons']//button[@type='submit']"));
    }
}
