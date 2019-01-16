package com.methods;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Util {
    LoadProp loadProp=new LoadProp();

    By terms_and_conditions=By.xpath("//label[@for=\"termsofservice\"]");
    By checkout_button=By.xpath("//button[@id=\"checkout\"]");
    By accept_terms_and_condition=By.xpath("//div[@class=\"terms-of-service\"]//input[@type=\"checkbox\"]");

    public void accepttermsandcondition(){
        click_element(accept_terms_and_condition);
        //click on checkout button
        click_element(checkout_button);
    }
    public void not_accpect_terms_and_conditions(){

        //click on terms and condition
        // click_element(terms_and_conditions);
        //click on checkout button
        click_element(checkout_button);



    }

}
