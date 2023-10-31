package com.crm.step_definitions;

import com.crm.pages.HomePage;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

import java.util.List;

public class UserProfile_StepDefs {

    HomePage homePage = new HomePage();

    @Then("verify that below user profile options are displayed")
    public void verify_that_below_user_profile_options_are_displayed(List<String> options) {
        homePage.userProfile.click();
        for (String option : options) {
            assertTrue(HomePage.getOption(option).isDisplayed());
        }
    }

}
