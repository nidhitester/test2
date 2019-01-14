package com.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Util extends BasePage {
    public static void click_element(By by){
        driver.findElement(by).click();
    }
    public static void enter_text(By by ,String text ){
        driver.findElement(by).sendKeys(text);
    }
    public static void clear_element(By by){
        driver.findElement(by).clear();
    }
    public static String  get_text(By by){
        String text=driver.findElement(by).getText();
        return text;
    }
    public static String get_attributes(By by,String text){
        String textt =driver.findElement(by).getAttribute(text);
        return text;
    }
    public static void login(By by){
        driver.findElement(by).click();
    }
    public static void assetequals(Object o, Object o1,String text){
        Assert.assertEquals(o,o1,text);
    }
    public static void implict_wait(By by){

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public static void explict_eait(By by){
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(by));


    }
    SimpleDateFormat dateFormat=new SimpleDateFormat();
    Date date=new Date();
    String date1=dateFormat.format(date);
    String a=date1;


}

