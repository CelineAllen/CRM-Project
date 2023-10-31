package com.crm.step_definitions;

import com.crm.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class LoginPage_StepDefs {

    LoginPage loginPage = new LoginPage();

    @When("user clicks on remember me on this computer checkbox")
    public void user_clicks_on_remember_me_on_this_computer_checkbox() {
        loginPage.rememberMeCheckbox.click();
    }
    @Then("verify that remember me on this computer checkbox is selected")
    public void verify_that_remember_me_on_this_computer_checkbox_is_selected() {
        assertTrue(loginPage.rememberMeCheckbox.isSelected());
    }

}
