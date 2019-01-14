package com.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Util {
    public static void user_register_with_valid_credentials(){
        click_element(By.linkText("Log in"));
        enter_text(By.id("Email"),"nidhi_tondon@yahoo.com");
        enter_text(By.name("Password"),"daksh078");
        click_element(By.xpath("//input[@value=\"Log in\"]"));
    }
}
