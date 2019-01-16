package com.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistrationPage extends Util {
    LoadProp loadProp=new LoadProp();

    By registerlink = By.linkText("Register");
    By genderfemale = By.id("gender-female");
    By inputfirstname = By.name("FirstName");
    By inputlastname = By.id("LastName");
    By dateOfBirthDay = By.xpath("//select[@name=\"DateOfBirthDay\"] / option[7]");
    By dateOfBirthMonth=By.xpath("//select[@name=\"DateOfBirthMonth\"]/option[6]");
    By dateOfBirthYear =By.xpath("//select[@name=\"DateOfBirthYear\"]/option[6]");
    By emailField =By.id("Email");
    By companyfield=By.id("Company");
    By newsletterlink=By.id("Newsletter");
    By Passwordfield=By.id("Password");
    By confirmpasswordinput=By.id("ConfirmPassword");
    By registercontinuebutton=By.id("register-button");


    public  void user_input_valid_Register_data_Sprad_shhet(){

        click_element(registerlink);
        // click on female gender
        click_element(genderfemale);
        //click on first name box and type first name
        enter_text(inputfirstname, loadProp.getProperty("FirstName"));
        //click on last name box and type last name
        enter_text(inputlastname,loadProp.getProperty("LastName"));
        //choose date of birth day
        click_element(dateOfBirthDay);
        //choose date of birth month
        click_element(dateOfBirthMonth);
        //choose date of birth year
        click_element(dateOfBirthYear);
        //click on email box and type email id
        enter_text(emailField,loadProp.getProperty("email")+date1+loadProp.getProperty("email1"));

        //click on company box and type company name
        enter_text(companyfield,loadProp.getProperty("Company"));
        //click on newsletter box
        click_element(newsletterlink);
        //click on password box and type password
        enter_text(Passwordfield,loadProp.getProperty("Password"));
        //click on confirm password box and type confirm password
        enter_text(confirmpasswordinput,loadProp.getProperty("ConfirmPassword"));
        //click on register button
        click_element(registercontinuebutton);
        // expected registration sucessfull message confirmation displayed

    }
    public void invalidcredetialns(){
        enter_text(By.id("fdfdd"),("ffff"));

    }
}
