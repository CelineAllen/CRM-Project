package com.crm.step_definitions;

import com.crm.pages.TimeAndReportsPage;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US10_TimeAndReportsPage_StepDefs {

TimeAndReportsPage timeAndReportsPage = new TimeAndReportsPage();


    @When("the user clicks on the Time and Reports module")
    public void the_user_clicks_on_the_time_and_reports_module() {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        timeAndReportsPage.navigateToModule("Time and Reports");

    }
    @Then("the users see sub-modules below")
    public void the_users_see_sub_modules_below(List<String> expectedSubModules) {
List<String> actualSubmodules= new ArrayList<>();
List<WebElement> allSubModules= timeAndReportsPage.subModules;

        for (WebElement each:allSubModules) {
            actualSubmodules.add(each.getText());

        }

        Assert.assertEquals(expectedSubModules,actualSubmodules);
    }

}
