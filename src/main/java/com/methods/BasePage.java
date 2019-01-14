package com.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import java.util.concurrent.TimeUnit;

public class BasePage {

    public static   WebDriver driver;

    public   void browserLaunch(String browser, String url){
        System.setProperty("webdriver.chrome.driver","src\\main\\java\\com\\methods\\Driver\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get("https://demo.nopcommerce.com/");





    }}





