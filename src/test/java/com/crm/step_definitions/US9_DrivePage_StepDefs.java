package com.crm.step_definitions;

import com.crm.pages.BasePage;
import com.crm.pages.DriverPage;
import com.crm.pages.LoginPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US9_DrivePage_StepDefs {
LoginPage loginPage= new LoginPage();
    DriverPage driverPage=new DriverPage();
    @Then("the user logged in with username as {string} and password as {string}")
    public void theUserLoggedInWithUsernameAsAndPasswordAs(String username, String password) {
        loginPage.login(username, password);

    }


    @When("User clicks on the drive")
    public void user_clicks_on_the_drive() {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driverPage.navigateToModule("Drive");

    }
    @Then("user can see all buttons on the drive page")
    public void user_can_see_all_buttons_on_the_drive_page(List<String>expectedButtons) {
        List<String> actualButtons = new ArrayList<>();
        List<WebElement> allButtons= driverPage.allModulesOfDrivePage;


        for (WebElement eachElement: allButtons) {
            BrowserUtils.waitForVisibility(eachElement,2);
            actualButtons.add(eachElement.getText());
        }
        Assert.assertEquals(expectedButtons,actualButtons);

    }



}
