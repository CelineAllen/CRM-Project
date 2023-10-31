package com.crm.step_definitions;

import com.crm.pages.HomePage;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class ChatAndCalls_StepDefs {

    HomePage homePage = new HomePage();

    @Then("verify that below chat and calls module options are displayed")
    public void verify_that_below_chat_and_calls_module_options_are_displayed(List<String> options) {
        homePage.chatAndCalls.click();
        for (String option : options) {
            assertTrue(Driver.getDriver().findElement(By.cssSelector("div[title*='"+option+"']")).isDisplayed());
        }

    }
}
