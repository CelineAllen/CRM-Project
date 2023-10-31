package com.crm.step_definitions;

import com.crm.pages.HomePage;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.lv.Ja;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.management.DescriptorRead;
import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class MoreTab_StepDefs {

    HomePage homePage = new HomePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(5));

    @Then("verify that below more tab options are displayed")
    public void verify_that_below_more_tab_options_are_displayed(List<String> options){
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        homePage.moreTab.click();
        for (String option : options) {
            assertTrue(HomePage.getOption(option).isDisplayed());
        }
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ZERO);
    }
}
