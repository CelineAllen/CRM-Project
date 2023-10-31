package com.crm.pages;

import com.crm.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{

    @FindBy(css = "input[name='USER_LOGIN']")
    public WebElement username;

    @FindBy(css = "input[name='USER_PASSWORD']")
    public WebElement password;

    @FindBy(css = "input[value='Log In']")
    public WebElement logInButton;

    @FindBy(css = ".errortext")
    public WebElement errorMessage;

    @FindBy(id = "USER_REMEMBER")
    public WebElement rememberMeCheckbox;


    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        logInButton.click();}

    public void loginWithoutSubmit(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
    }
    public void loginAsHr(){
        this.username.sendKeys(ConfigurationReader.getProperty("hr.username"));
        this.password.sendKeys(ConfigurationReader.getProperty("password"));
        logInButton.click();}
    public void loginAsMarketing(){
        this.username.sendKeys(ConfigurationReader.getProperty("marketing.username"));
        this.password.sendKeys(ConfigurationReader.getProperty("password"));
        logInButton.click();}
    public void loginAsHelpdesk(){
        this.username.sendKeys(ConfigurationReader.getProperty("helpdesk.username"));
        this.password.sendKeys(ConfigurationReader.getProperty("password"));
        logInButton.click();}


}
