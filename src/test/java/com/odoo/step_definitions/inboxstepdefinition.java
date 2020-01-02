package com.odoo.step_definitions;

import com.odoo.pages.BasePage;
import com.odoo.pages.InboxPage;
import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class inboxstepdefinition {
    InboxPage inboxPage = new InboxPage();

    @Then("the Inbox page should have following modules displayed")
    public void the_Inbox_page_should_have_following_modules_displayed() {
        BrowserUtils.waitFor(2);
        System.out.println("Verify Inbox page should be displayed under module Discuss.");
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("#Inbox - Odoo", actualTitle);

//Discuss, Calendar, Notes, Contacts, CRM, Sales, Website, Point of Sale, Purchases, Inventory, Manufacturing,
        BrowserUtils.waitFor(3);
        for (int i = 1; i <= 11; i++) {
            BrowserUtils.waitFor(1);
            Driver.get().findElement(By.xpath("(//span[@class='oe_menu_text'])[" + i + "]")).click();
        }

// under the Dropdown (more options)  menu
        BrowserUtils.waitFor(3);
        WebElement dropdownlink = Driver.get().findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
        dropdownlink.click();

// ex: if you want click repairs menu you can write "12"
        BrowserUtils.waitFor(3);
        Driver.get().findElement(By.xpath("(//span[@class='oe_menu_text'])[22]")).click();
        BrowserUtils.waitFor(3);
        String actualTitle1 = Driver.get().getTitle();
        Assert.assertEquals("My Dashboard - Odoo", actualTitle1);


        System.out.println(actualTitle1.equals("My Dashboard - Odoo"));


    }

    @Then("Inside the Inbox column following options should also be displayed")
    public void insideTheInboxColumnFollowingOptionsShouldAlsoBeDisplayed() {
// Inside the Inbox column, following options should also be displayed: Inbox, Starred,
        for (int i = 1; i <= 2; i++) {
            BrowserUtils.waitFor(1);
            Driver.get().findElement(By.xpath("(//span[@class='o_channel_name'])[" + i + "]")).isDisplayed();
        }
        // Inside the Inbox column, following options should also be displayed: CHANNELS, DIRECT MESSAGES and PRIVATE CHANNLES CHANNLES.
        BrowserUtils.waitFor(1);
        for (int i = 1; i <= 3; i++) {
            BrowserUtils.waitFor(1);
            Driver.get().findElement(By.xpath("(//div[@class='o_mail_sidebar_title'])[" + i + "]")).isDisplayed();
        }

    }
}
