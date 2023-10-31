package com.crm.step_definitions;

import com.crm.pages.EmployeesPage;
import com.crm.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.AssertionFailedError;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US11_EmployeesPage_StepDefs {
EmployeesPage employeesPage= new EmployeesPage();

    @When("the user clicks on {string} module on the left hand side")
    public void the_user_clicks_on_module_on_the_left_hand_side(String string) {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
       employeesPage.navigateToModule("Employees");
    }
    @Then("the user sees modules below on the page")
    public void the_user_sees_modules_below_on_the_page(List<String> expectedModules) {
List<String> actualModules= new ArrayList<>();
List<WebElement> allModulesOnPage= employeesPage.employeesPageModules;
        for (WebElement each: allModulesOnPage) {
            actualModules.add(each.getText().trim());

        }
        Assert.assertEquals(expectedModules,actualModules);

    }

}
