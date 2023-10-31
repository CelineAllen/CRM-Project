package com.crm.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private Driver(){}

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver==null){
            switch (ConfigurationReader.getProperty("browser").toLowerCase()){
                case "chrome":
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    driver=new FirefoxDriver();
                    break;
            }
        }
        return driver;
    }

    public static void close(){
        if (driver!=null){
            driver.close();
            driver=null;
        }
    }
    public static void quit(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }

}
