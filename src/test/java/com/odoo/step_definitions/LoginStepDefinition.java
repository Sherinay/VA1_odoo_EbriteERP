package com.odoo.step_definitions;

import com.odoo.pages.LoginPage;
import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.ConfigurationReader;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginStepDefinition {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Opening the login page");
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);


    }

    @Given("first and second messages is displayed")
    public void first_and_second_messages_is_displayed() {
        LoginPage loginPage = new LoginPage();
        loginPage.FirstMessage.isDisplayed();
        loginPage.SecondMessage.isDisplayed();
    }

    @When("the users enters the login information")
    public void the_users_enters_the_login_information() {
        System.out.println("Entering login information");
        String Username = ConfigurationReader.get("event_user1");
        String Password = ConfigurationReader.get("event_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(Username, Password);

        BrowserUtils.waitFor(3);
        loginPage.inboxmessage.isDisplayed();
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {

        BrowserUtils.waitFor(2);

        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("#Inbox - Odoo", actualTitle);
    }

    @Then("the user should not be able to login")
    public void the_user_should_not_be_able_to_login() {
        LoginPage loginPage = new LoginPage();
        loginPage.wrongmessage.isDisplayed();


    }
}
