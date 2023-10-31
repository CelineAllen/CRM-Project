package com.crm.step_definitions;

import com.crm.pages.BasePage;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class US13_MobileApp_StepDefs extends BasePage {
    Actions actions = new Actions(Driver.getDriver());

    @When("user scrolls down to Mobile Applications")
    public void user_scrolls_down_to_mobile_applications() {
        actions.moveToElement(mobileApplication);
    }
    @Then("user sees mobile app options displayed below")
    public void user_sees_mobile_app_options_displayed_below(List<String> expectedOptions) {
        List<String> actualOptions = new ArrayList<>();
        actualOptions.add(appleStore.getText().trim());
        actualOptions.add(googlePlay.getText().trim());
        Assert.assertEquals(expectedOptions,actualOptions);
    }



}
