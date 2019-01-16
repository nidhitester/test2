package com.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Util{

    LoadProp loadProp=new LoadProp();
    By book_button=By.xpath("//div[@class=\"header-menu\"]/ul[@class=\"top-menu\"]//a[@href=\"/books\"]");

    public void books(){

       //click on books
        click_element(book_button);
    }


}
