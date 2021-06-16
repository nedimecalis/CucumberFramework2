package com.usa.stepdefinitions;

import com.usa.pages.AmazonAccount;
import com.usa.utilities.ConfigurationReader;
import com.usa.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class AmazonCreateAccount {

    AmazonAccount accountPage = new AmazonAccount();

    @Given("User sign in to Amazon webpage")
    public void user_sign_in_to_amazon_webpage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("signIn_url"));

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(accountPage.signInButton);

    }

    @When("User enters the credentials")
    public void user_enters_the_credentials() {

        accountPage.startHere.click();

        accountPage.yourName.sendKeys("Selim Calis");

        accountPage.email.sendKeys("selimcalis@mail.com");

        accountPage.password.sendKeys("Selim1");

        accountPage.passwordCheck.sendKeys("Selim1");

    }

    @When("User clicks to create account button")
    public void user_clicks_to_create_account_button() {

        accountPage.createYourAccount.click();

    }

    @Then("Action requires page will open")
    public void action_requires_page_will_open() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Authentication required";

        Assert.assertEquals(actualTitle,expectedTitle);

    }

}
