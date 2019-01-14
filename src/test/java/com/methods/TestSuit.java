package com.methods;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest{
    RegistrationPage registrationPage=new RegistrationPage();
    HomePage homePage = new HomePage();
    LoginPage loginPage=new LoginPage();
    @Test

     public  void user_should_be_able_to_register_sucessfully(){
     registrationPage.user_inputvalidRegisterdataSpradshhet();
     homePage.user_see_thepricendollars();
     // expected registration sucessfull message confirmation displayed
     String expectedRegistrationSucessMessage = "Your registration completed";
    //actual sucessfull message confirmation displayed to be verified
    String actualRegistrationSucessMessage = get_text(By.xpath("//div[@class=\"result\"]"));
    //comparing actual and expected results
    assetequals(expectedRegistrationSucessMessage, actualRegistrationSucessMessage, "test case fail");

    }
    @Test
    public  void user_should_be_able_to_login_sucessfully_with_valid_credentials(){

     loginPage.user_register_with_valid_credentials();
    }


}
