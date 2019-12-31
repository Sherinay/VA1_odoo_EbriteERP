package com.odoo.step_definitions;

import com.odoo.pages.LoginPage;
import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.ConfigurationReader;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Opening the login page");
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the users enters the login information")
    public void the_users_enters_the_login_information() {
        System.out.println("Entering login information");
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("Verifying that user is logged in");
        BrowserUtils.waitFor(2);

        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("#Inbox - Odoo", actualTitle);
    }
}
