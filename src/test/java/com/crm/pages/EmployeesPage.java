package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EmployeesPage extends BasePage{

    @FindBy(className = "structure-employee-title")
    public WebElement employeesTitle;

    @FindBy(xpath = "//div[contains(@class,'main-buttons-item')]")
    public List<WebElement> employeesPageModules;
}
