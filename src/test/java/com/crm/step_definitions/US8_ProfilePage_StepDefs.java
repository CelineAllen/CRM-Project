package com.crm.step_definitions;

import com.crm.pages.BasePage;
import com.crm.pages.LoginPage;
import com.crm.pages.MyProfilePage;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US8_ProfilePage_StepDefs extends BasePage {

MyProfilePage myProfilePage= new MyProfilePage();


    @Given("user clicks on the profile module on the right side of page")
    public void user_clicks_on_the_profile_module_on_the_right_side_of_page() {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
      myProfilePage.userProfileDropdown.click();
    }
    @Given("user click the my profile option")
    public void user_click_the_my_profile_option() {
      myProfilePage.myProfileLink.click();
    }
    @Then("user can see options displayed on the my profile page")
    public void user_can_see_options_displayed_on_the_my_profile_page(List<String> expectedOptionsList) {
      List<String> myProfileOptions= new ArrayList<>();
      List<WebElement> allOptions= myProfilePage.myProfileOptionList;
        for (WebElement eachElement: allOptions) {
           myProfileOptions.add(eachElement.getText());
        }
      Assert.assertEquals(expectedOptionsList, myProfileOptions);
    }



}










