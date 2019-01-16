package com.methods;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static javafx.scene.input.KeyCode.T;

public class TestSuit extends BaseTest{
    RegistrationPage registrationPage=new RegistrationPage();
    HomePage homePage = new HomePage();
    LoginPage loginPage=new LoginPage();
    ApprealPage apprealPage=new ApprealPage();
    ShoesPage shoesPage=new ShoesPage();
    EmailAFriendPage emailAFriendPage=new EmailAFriendPage();
    JewelleryPage jewelleryPage=new JewelleryPage();
    ShoppingCartPage shoppingCartPage=new ShoppingCartPage();
    BooksPage booksPage=new BooksPage();
    CheckoutPage checkoutPage=new CheckoutPage();
    @Test

     public  void user_should_be_able_to_register_sucessfully(){
     registrationPage.user_input_valid_Register_data_Sprad_shhet();

     // expected registration sucessfull message confirmation displayed
     String expectedRegistrationSucessMessage = "Your registration completed";
    //actual sucessfull message confirmation displayed to be verified
    String actualRegistrationSucessMessage = get_text(By.xpath("//div[@class=\"result\"]")) ;
    //comparing actual and expected results
    assetequals(expectedRegistrationSucessMessage, actualRegistrationSucessMessage, "test case fail");

    }
    @Test
    public void register_user__able_to_send_email_with_product(){
        registrationPage.user_input_valid_Register_data_Sprad_shhet();
        loginPage.user_click_on_Logout();
        loginPage.user_login_with_valid_credentials();
        apprealPage.registered_user_email();
        shoesPage.user_select_shoe();
       emailAFriendPage.email_friend_product_sucessfully();
        // store expected result in string
        String expectedsucessmessage="Your message has been sent.";
        //store actual result in string
        String actualsucessmessage =get_text (By.xpath("//div[@class=\"result\"]"));
        //compare expected and actual result
        Assert.assertEquals(expectedsucessmessage,actualsucessmessage,"test case fail");
    }
    @Test
    public void user_should_be_able_to_login()throws Exception{
        //first user follow steps to register
        registrationPage.user_input_valid_Register_data_Sprad_shhet();
        //after registering sucessfully have to logout to log in as registered user
        loginPage.user_click_on_Logout();
        //login with valid details
        loginPage.user_login_with_valid_credentials();
        // store expected result in string
        String expectedverify="Log out";
        //store actual result in string
        String actualverify=get_text(By.xpath("//a[@href=\"/logout\"]"));
        //compare expected and actual result
        Assert.assertEquals(actualverify,expectedverify,"test case fail");

    }
    @Test
    public void unregistered_user_not_able_to_send_email_with_product() {
        //on home page click on appreal
        apprealPage.unregistered_user_cant_send_email();
        //click on shoes
        shoesPage.user_select_shoe();
        //click on email a friend link
        emailAFriendPage.unregistered_user_cannot_email_a_friend();
        // store expected result in string
        String expectedverify = "Only registered customers can use email a friend feature";
        //store actual result in string
        String actualverify = get_text(By.xpath("//div[@class=\"message-error validation-summary-errors\"]//li"));
        //compare expected and actual result
        Assert.assertEquals(actualverify, expectedverify, "test case fail");


    }
    @Test
    public void need_to_accept_terms_and_conditions(){
        //called jewelery page


        jewelleryPage.select_jewelry_and_add_to_cart();
        //called shoping cart page
        shoppingCartPage.not_accpect_terms_and_conditions();
        String expecteddisplaymessage="Please accept the terms of service before the next step.";
        //store actual result in string
        String actualdisplaymessage =driver.findElement(By.xpath("//div[@id=\"terms-of-service-warning-box\"]/p")).getText();
        //compare expected and actual result
        Assert.assertEquals(expecteddisplaymessage,actualdisplaymessage,"test case failed");
    }
    @Test
    public void buy_single_product_sucessfully(){

        registrationPage.user_input_valid_Register_data_Sprad_shhet();
        loginPage.user_click_on_Logout();
        loginPage.user_login_with_valid_credentials();
        homePage.books();
        booksPage.user_able_to_buy_books();
        shoppingCartPage.accepttermsandcondition();
        checkoutPage.registeredUserCheckoutSucessfully();
        String expected_result = "Your order has been successfully processed!";
        // actual results
        String actual_results = get_text(By.xpath("// div[@class=\"section order-completed\"] / div / strong"));
        // comparing the two results
        Assert.assertEquals(actual_results,expected_result,"Test case failed");
        // click continue to proceed for more shopping
        click_element(By.xpath("// input[@class=\"button-1 order-completed-continue-button\"]"));


    }







}
