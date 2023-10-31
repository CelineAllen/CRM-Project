package com.crm.step_definitions;

import com.crm.pages.CompanyPage;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US14_CompanyPage_StepDefs {
    CompanyPage companyPage= new CompanyPage();
    @When("user goes to the company page")
    public void user_goes_to_the_company_page() {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        companyPage.navigateToModule("Company");
    }
    @Then("user sees the seven module in the page")
    public void user_sees_the_seven_module_in_the_page(List<String> expectedModules) {
        List<String> actualModules= new ArrayList<>();

        List<WebElement> allModules= companyPage.companyPageMenu;
        for (WebElement each: allModules) {
            actualModules.add(each.getText());

        }
        Assert.assertEquals(expectedModules,actualModules);
    }



}
