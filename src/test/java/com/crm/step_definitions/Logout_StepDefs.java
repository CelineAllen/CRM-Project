package com.crm.step_definitions;

import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class Logout_StepDefs {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        loginPage.loginAsHr();
    }
    @When("user clicks on user profile")
    public void user_clicks_on_user_profile() {
        homePage.userProfile.click();
    }
    @Then("verify that log out option is displayed")
    public void verify_that_log_out_option_is_displayed() {
        assertTrue(homePage.logout.isDisplayed());
    }
    @Then("user clicks on log out option")
    public void user_clicks_on_log_out_option() {
        homePage.logout.click();
    }
    @Then("verify that user navigate back to login page")
    public void verify_that_user_navigate_back_to_login_page() {
        assertEquals("Authorization", Driver.getDriver().getTitle());
    }
}
