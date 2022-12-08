package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs
{
    HomePage homePage =new HomePage();
    RegisterPage registerPage =new RegisterPage();
    RegisterSuccess registerSuccess =new RegisterSuccess();

    DetailsCommentPage detailsCommentPage =new DetailsCommentPage();

    MacBookPage macBookPage = new MacBookPage();

    LogInPage logInPage = new LogInPage();
    @Given("I am on registrationpage")
    public void i_am_on_registrationpage()
    {
        homePage.clickOnRegisterButton();
    }
    @When("I enter account details")
    public void i_enter_account_details()
    {
        registerPage.registrationDetails();
    }
    @Then("I should be able to register an account successfully")
    public void i_should_be_able_to_register_an_account_successfully()
    {
        registerSuccess.verifyRegistrationCompletedSuccessfully();
    }

    @Given("I am on the HomePage")
    public void i_am_on_the_home_page()
    {
        homePage.homePageOfNop();
    }

    @When("I click on the details button")
    public void i_click_on_the_details_button()
    {
        homePage.newReleaseDetailsButton();
    }

    @Then("I should be able to enter title and comment")
    public void i_should_be_able_to_enter_title_and_comment()
    {
        detailsCommentPage.newsCommentInformation();
    }

    @Then("I should be able to submit it successfully")
    public void i_should_be_able_to_submit_it_successfully()
    {
        detailsCommentPage.newsCommentInfoSubmitButton();
    }

    @And("I should be able to see the success Message")
    public void iShouldBeAbleToSeeTheSuccessMessage()
    {
        detailsCommentPage.newsCommentSuccessMessage();
    }
    @When("I click on {string} link")
    public void iClickOnLink(String categoryLink)
    {
        homePage.clickOnCategoryPage(categoryLink);
    }

    @Then("I should be directed to {string} page successfully")
    public void iShouldBeDirectedToPageSuccessfully(String categoryName)
    {
        Utils.assertURL(categoryName);
    }



    @Given("I am a registered user of NopCommerce")
    public void iAmARegisteredUserOfNopCommerce()
    {
        homePage.logInNopCommerce();
        logInPage.loginDetails();
    }
    @When("I click on MacBookPage")
    public void iAmOnTheAppleMacBookProPage()
    {
        homePage.clickOnMacBook();
    }

    @Then("I click on email a friend button")
    public void iClickOnEmailAFriendButton()
    {
        macBookPage.clickOnEmailAFriend();
    }

    @Then("I should be able to enter mail details")
    public void iShouldBeAbleToEnterMailDetails()
    {
        macBookPage.macbookDetails();
    }

    @And("click on the submit button")
    public void clickOnTheSubmitButton()
    {
        macBookPage.macbookDetailsSubmit();
    }

    @Then("I should be able to see the success message of email sent")
    public void iShouldBeAbleToSeeTheSuccessMessageOfEmailSent()
    {
        macBookPage.macbookSuccessMessage();
    }


}
