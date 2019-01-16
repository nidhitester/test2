package com.methods;

import org.openqa.selenium.By;

public class JewelleryPage extends Util {
    LoadProp loadProp= new LoadProp();
    By jewelryButton=By.xpath("//div[@class=\"header-menu\"]//ul[@class=\"top-menu\"]/li[6]//a[@href=\"/jewelry\"]");
    By flower_girl_bracelet=By.xpath("//div[@class=\"details\"]//h2//a[@href=\"/flower-girl-bracelet\"]");
    By add_to_cart_button=By.xpath("//div[@data-productid=\"41\"]//input[@value=\"Add to cart\"]");
    By shopping_cart_button=By.xpath("//span[@class=\"cart-label\"]");
    public void select_jewelry_and_add_to_cart() {
        //click on jewelry
        click_element(jewelryButton);
        //click on flower girl bracelet
        click_element(flower_girl_bracelet);
        //click on add to cart button
        click_element(add_to_cart_button);
        //click on shopping cart
        click_element(shopping_cart_button);
       // driver.findElement(By.xpath("//div[@class=\"add-to-cart-panel\"]//input[@type=\"text\"]")).clear();
        //enter quantity


    }}