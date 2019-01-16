package com.methods;

import org.openqa.selenium.By;

public class BooksPage extends Util {
    LoadProp loadProp=new LoadProp();
    By chooose_book= By.xpath("//div[@class=\"item-grid\"]/div[3]//div[@data-productid=\"39\"]/div[@class=\"details\"]/h2//a[@href=\"/pride-and-prejudice\"]");
    By add_to_cart_button=By.xpath("//div[@data-productid=\"39\"]//input[@value=\"Add to cart\"]");
    By shopping_cart_button=By.xpath("//span[@class=\"cart-label\"]");
    public void user_able_to_buy_books(){

        click_element(chooose_book);
        //click on add to cart button
        click_element(add_to_cart_button);
        //click on shopping cart
        click_element(shopping_cart_button);

    }
}
