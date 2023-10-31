package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyProfilePage extends BasePage{

    @FindBy(xpath = "//a[.='My Profile']")
    public WebElement myProfileLink;


    @FindBy(xpath ="//div[@id='profile-menu-filter']/a")
    public List<WebElement> myProfileOptionList;




}
