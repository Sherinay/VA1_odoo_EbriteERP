package com.odoo.pages;

import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (xpath="//a[@href='/web/login']")
    public WebElement signin;

    @FindBy(id="login")
    public WebElement userName;



    @FindBy(id="password")
    public WebElement password;

    @FindBy(css = "button[type='submit']")
    public WebElement submit;

    public void login(String userNameStr, String passwordStr) {
        BrowserUtils.waitFor(3);
        signin.click();
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }


}
