package com.odoo.pages;

import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "a[class='navbar-brand']")
    public WebElement FirstMessage;  // Best ERP solution for startups

    @FindBy(css = "h2[class='text-center o_default_snippet_text']")
    public WebElement SecondMessage; // ERP Systems, Solutions and Services that add real value to your business.

    @FindBy(xpath = "//a[@href='/web/login']")
    public WebElement signin;

    @FindBy(xpath="(//span[@class='o_channel_name'])[1]")
    public WebElement inboxmessage;  // Inbox page should be displayed under module Discuss.

    @FindBy(id = "login")
    public WebElement userName;


    @FindBy(id = "password")
    public WebElement password;

    @FindBy(css = "button[type='submit']")
    public WebElement submit;

    @FindBy(css = "p[class='alert alert-danger']")
    public WebElement wrongmessage;

    public void login(String userNameStr, String passwordStr) {
        BrowserUtils.waitFor(2);
        signin.click();
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();


        // verification that we logged
    }


}
