package org.example;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends BasePage
{
    DriverManager driverManager = new DriverManager();

    @Before
    public void setUp()
    {
        driverManager.openBrowser();
    }

    @After
    public void tearDown(Scenario scenario)
    {
        if (scenario.isFailed())

        {
            TakesScreenshot screenshot = (TakesScreenshot) driver;

            byte[] src = screenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src,"image/png","screenshot");
        }

        driverManager.closeBrowser();
    }
}
