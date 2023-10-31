package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(id = "user-block")
    public WebElement userProfile;

    @FindBy(id = "user-name")
    public WebElement userProfileName;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logout;

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreTab;

    @FindBy(xpath = "//span[contains(text(),'Chat and Calls')]")
    public WebElement chatAndCalls;



    public static WebElement getOption(String optionName) {
        return Driver.getDriver().findElement(By.xpath("//span[.='"+optionName+"']"));
    }

}
