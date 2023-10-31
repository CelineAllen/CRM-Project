package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EventPage extends BasePage{

    @FindBy(xpath = "//input[@name='EVENT_NAME']")
    public WebElement EventNameBox;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement EventDescriptionFrame;          //iframe


    @FindBy(xpath = "//input[@name='DATE_FROM']")
    public WebElement EventStartingDate;


    @FindBy(xpath = "//input[@name='TIME_FROM_']")
    public WebElement EventStartingTime;


    @FindBy(xpath = "(//td[@title='Increase (Up)'])[1]")
    public WebElement EventStartingHourUp;

    @FindBy(xpath = "(//td[@title='Increase (Up)'])[2]")
    public WebElement EventStartingMinutesUp;

    @FindBy(xpath = "(//td[@title='Decrease (Down)'])[1]")
    public WebElement EventStartingHourDown;

    @FindBy(xpath = " (//td[@title='Decrease (Down)'])[2]")
    public WebElement EventStartingMinutesDown;

    @FindBy(xpath = "//input[@value='Set Time']")
    public WebElement EventStartingSetTimeButton;

    @FindBy(xpath = "//input[@name='EVENT_FULL_DAY']")
    public WebElement EventStartingAllDayCheckbox;


    @FindBy(xpath = "//span[@class='feed-ev-tz-open']")
    public WebElement SpecifyTimeZone;

    @FindBy(xpath = "//span[@class='feed-ev-tz-close']")
    public WebElement HideTimeZone;


    @FindBy(xpath = "//select[@id='feed-cal-tz-fromcal_3Jcl']")
    public WebElement TimeZoneOptions;

    @FindBy(xpath = "//input[@id='event-remindercal_3Jcl']")
    public WebElement SetReminderCheckBox;


    @FindBy(xpath = "//input[@id='event-remind_countcal_3Jcl']")
    public WebElement SetReminderCount;


    @FindBy(xpath = "//select[@id='event-remind_typecal_3Jcl']")
    public WebElement SetReminderTimeType;

    @FindBy(xpath = "//div[@id='feed-event-dest-cont']")
    public WebElement MemberSelectionBox;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement SendEventButton;

    @FindBy(xpath = "//button[@id='blog-submit-button-cancel']")
    public WebElement CancelEventButton;



}
