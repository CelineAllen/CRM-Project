package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TimeAndReportsPage extends BasePage{



    @FindBy(xpath = "//span[contains(text(),'Time and Reports')]")
    public WebElement timeAndReportsModule;

    /*
    @FindBy(xpath = "//span[contains(text(),'Absence Chart')]")
    public WebElement absentModule;

    @FindBy(xpath = "//span[contains(text(),'Worktime')]")
    public WebElement worktimeModule;

    @FindBy(xpath = "//span[contains(text(),'Bitrix24.Time')]")
    public WebElement Bitrix24Module;

    @FindBy(xpath = "//span[contains(text(),'Work Reports')]")
    public WebElement workReportsModule;

    @FindBy(xpath = "//span[contains(text(),'Meetings and Briefings')]")
    public WebElement meetingsModule;
 */

    @FindBy(xpath = "//div[contains(@id,'top_menu_id_timeman_menu')]//span[@class='main-buttons-item-text-title']")
    public List<WebElement> subModules;


}
