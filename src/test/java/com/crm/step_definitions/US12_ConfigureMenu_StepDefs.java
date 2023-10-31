package com.crm.step_definitions;

import com.crm.pages.BasePage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class US12_ConfigureMenu_StepDefs extends BasePage {


    @When("user clicks on configure menu button")
    public void user_clicks_on_configure_menu_button() {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        configureMenu.click();

    }
    @Then("user sees options displayed below")
    public void user_sees_options_displayed_below(List<String> expectedOptions) {
       // BrowserUtils.waitForVisibility(configureMenu, 5);
List<String> actualOptionsOfConfigMenu= new ArrayList<>();
List<WebElement> allOptions= configureMenuOptions;
        for (WebElement each: allOptions) {
           actualOptionsOfConfigMenu.add(each.getText());

        }
        Assert.assertEquals(expectedOptions,actualOptionsOfConfigMenu);
    }



}
