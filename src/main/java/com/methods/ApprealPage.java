package com.methods;

import com.methods.Util;
import org.openqa.selenium.By;

public class ApprealPage extends Util {
    LoadProp loadProp=new LoadProp();

    By apparell_link=By.xpath("//div[@class=\"master-wrapper-page\"]//ul[@class=\"top-menu\"]/li[3]//a[@href=\"/apparel\"]");
    By shoes_link=By.xpath("//h2/a[@title=\"Show products in category Shoes\"]");

    public void unregistered_user_cant_send_email(){
        click_element(apparell_link);
    }
    public void registered_user_email(){


         //click on apparel
         click_element(apparell_link);



}}
