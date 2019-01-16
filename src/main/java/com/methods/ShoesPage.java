package com.methods;

import com.methods.LoadProp;
import com.methods.Util;
import org.openqa.selenium.By;

public class ShoesPage extends Util {

    LoadProp loadProp = new LoadProp();
    By shoes_link=By.xpath("//h2/a[@title=\"Show products in category Shoes\"]");
    By chooseshoe=By.xpath("//div[@class=\"details\"]/h2//a[@href=\"/nike-floral-roshe-customized-running-shoes\"]");
    By email_a_friend=By.xpath("//input[@value=\"Email a friend\"]");
    public void user_select_shoe(){
        //click on shoes
        click_element(shoes_link);
        // click on choosen shoe
        click_element(chooseshoe);
        //click on email a friend
        click_element(email_a_friend);
    }
}
