package com.crm.step_definitions;

import com.crm.pages.HomePage;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DesktopOptions_StepDefs {

    Actions actions = new Actions(Driver.getDriver());

    @Then("verify that below desktop options are displayed")
    public void verify_that_below_desktop_options_are_displayed(List<String> options) {
        for (String option : options) {
            actions.scrollToElement(HomePage.getOption(option));
            assertTrue(HomePage.getOption(option).isDisplayed());
        }
    }

}
