package com.crm.step_definitions;

import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;



public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        //the method in the Hooks class
    }

    @When("user enters {string} {string} and {string} {string}")
    public void userEntersAnd(String status1, String username, String status2, String password) {
        loginPage.loginWithoutSubmit(username,password);
    }

    @When("user clicks on {string} button")
    public void user_clicks_on_button(String buttonName) {
        loginPage.clickButton(buttonName);
    }

    @Then("verify that right {string} is displayed on the profile")
    public void verify_that_right_is_displayed_on_the_profile(String username) {
        assertEquals(username,homePage.userProfileName.getText());
    }
    @Then("verify that {string} error message is displayed")
    public void verify_that_error_message_is_displayed(String errorMessage) {
        assertEquals(errorMessage,loginPage.errorMessage.getText());
    }



}
