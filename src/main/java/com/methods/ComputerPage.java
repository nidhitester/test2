package com.methods;

import org.openqa.selenium.By;

public class ComputerPage extends Util {
    public  void register_user_buy_and_email_to_friend(){
        click_element(By.linkText("Computers"));
        click_element(By.xpath("//div[@class=\"side-2\"]//ul/li[@class=\"active last\"]//a[@href=\"/desktops\"]"));
    }
}
