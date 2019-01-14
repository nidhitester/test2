package com.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistrationPage extends Util {

    public  void user_inputvalidRegisterdataSpradshhet(){

        click_element(By.linkText("Register"));
        // click on female gender
        click_element(By.id("gender-female"));
        //click on first name box and type first name
        enter_text(By.name("FirstName"), "ghghg");
        //click on last name box and type last name
        enter_text(By.id("LastName"), "hhfdjh");
        //choose date of birth day
        click_element(By.xpath("//select[@name=\"DateOfBirthDay\"] / option[7]"));
        //choose date of birth month
        click_element(By.xpath("//select[@name=\"DateOfBirthMonth\"]/option[6]"));
        //choose date of birth year
        click_element(By.xpath("//select[@name=\"DateOfBirthYear\"]/option[6]"));
        DateFormat dateFormat = new SimpleDateFormat("MMddyyyyHHmmss");
        //made objet for date
        Date date = new Date();
        String date1 = dateFormat.format(date);
        //click on email box and type email id
        enter_text(By.id("Email"), "nidhi_tondon" + date1 + "@yahoo.com");
        //click on company box and type company name
        enter_text(By.id("Company"), "1234");
        //click on newsletter box
        click_element(By.id("Newsletter"));
        //click on password box and type password
        enter_text(By.id("Password"), "vgy789");
        //click on confirm password box and type confirm password
        enter_text(By.id("ConfirmPassword"), "vgy789");
        //click on register button
        click_element(By.id("register-button"));
        // expected registration sucessfull message confirmation displayed

    }
    public void invalidcredetialns(){
        enter_text(By.id("fdfdd"),("ffff"));

    }
}
