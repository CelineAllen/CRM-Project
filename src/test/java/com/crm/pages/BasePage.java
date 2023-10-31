package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void clickButton(String buttonName){
        Driver.getDriver().findElement(By.cssSelector("input[value='"+buttonName+"']")).click();
    }


    @FindBy(css = "#user-block")
    public WebElement userProfileDropdown;

    @FindBy(xpath = "//span[@class='menu-popup-item-text'][normalize-space()]")
    public List<WebElement> userProfileDropdownOptions;


    @FindBy(id = "left-menu-settings")
    public WebElement configureMenu;


    @FindBy(xpath = "//span[starts-with(@class,'menu-popup-item menu')]")
    public List<WebElement> configureMenuOptions;

    @FindBy(xpath = "//div[.='Mobile application']")
    public WebElement mobileApplication;

    @FindBy(xpath = "//span[.='App Store']")
    public WebElement appleStore;

    @FindBy(xpath = "//span[.='Google Play']")
    public WebElement googlePlay;


    public void navigateToModule(String module){

        String moduleLocator="//a[@title='"+module+"']";

        Driver.getDriver().findElement(By.xpath(moduleLocator)).click();

    }
}

