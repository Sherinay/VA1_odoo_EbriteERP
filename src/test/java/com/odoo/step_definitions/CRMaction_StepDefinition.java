package com.odoo.step_definitions;

import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CRMaction_StepDefinition {

    @Given("the user clicks on Add new Column tab")
    public void the_user_clicks_on_Add_new_Column_tab() {
        Driver.get().findElement(By.xpath("(//span[@class='oe_menu_text'])[5]")).click();
        BrowserUtils.waitFor(3);
        Driver.get().findElement(By.xpath("//span[@class='o_kanban_title']")).click();
    }

    @When("the user enters “Pending” column title name")
    public void the_user_enters_Pending_column_title_name() {
        BrowserUtils.waitFor(3);
        Driver.get().findElement(By.xpath("//input[@class='form-control o_input']")).sendKeys("Pending", Keys.ENTER);
        BrowserUtils.waitFor(3);

    }

    @Then("the user clicks on Kanban Config dropdown")
    public void the_user_clicks_on_Kanban_Config_dropdown() {
        Driver.get().findElement(By.xpath("//button[@aria-label='kanban']")).click();
        BrowserUtils.waitFor(7);

    }

    @Then("the following options should be available")
    public void the_following_options_should_be_available( List<String> list) {
        System.out.println("list.size() ="+list.size());
        System.out.println(list);





    }


}
