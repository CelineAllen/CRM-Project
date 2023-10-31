package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DriverPage extends BasePage{

    @FindBy(xpath = "//a[@class='main-buttons-item-link']")
    public List<WebElement> allModulesOfDrivePage;

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[5]")
    public WebElement DriveButton;


    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[1]")
    public WebElement MyDriveButton;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[2]")
    public WebElement AllDocumentsButton;



    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[3]")
    public WebElement CompanyDriveButton;


    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[4]")
    public WebElement SalesAndMarketingButton;


    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[5]")
    public WebElement TopManagmentsDocumentsButton;


    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[6]")
    public WebElement DriveCleanUpButton;
}
