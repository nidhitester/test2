package com.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Util{
    public void user_see_thepricendollars(){
        //click on us dollar box
       click_element(By.id("customerCurrency"));
       //click on computers
click_element(By.xpath("//div[@class=\"header-menu\"]//ul[@class=\"top-menu\"]//li/a[@href=\"/computers\"]"));

    }


}
