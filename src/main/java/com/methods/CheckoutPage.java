package com.methods;

import org.openqa.selenium.By;

public class CheckoutPage extends Util {

    LoadProp loadProp=new LoadProp();
     By labelShipToSameAddress=By.xpath("//div[@class=\"section ship-to-same-address\"]//input[@type=\"checkbox\"]");
   // By newaddressbox=By.xpath("//div[@class=\"section select-billing-address\"]//select[@id=\"billing-address-select\"]");
     By inputfirstname=By.name("BillingNewAddress.FirstName");
     By inputlastname=By.id("BillingNewAddress_LastName");
     By inputemail=By.id("BillingNewAddress_Email");
     By inputcompanyname=By.id("BillingNewAddress_Company");
     By countryfield=By.xpath("//select[@id=\"BillingNewAddress_CountryId\"]/option[@value=\"233\"]");
     By inputcityname=By.id("BillingNewAddress_City");
     By inputaddress=By.id("BillingNewAddress_Address1");
     By inputpostcode=By.id("BillingNewAddress_ZipPostalCode");
     By inputphonenumber=By.id("BillingNewAddress_PhoneNumber");
     By continuebutton=By.xpath("// div[@id=\"billing-buttons-container\"]  / input");
     By shippingoption=By.id("shippingoption_1");
     By buttoncontinue=By.xpath("//input[@class=\"button-1 shipping-method-next-step-button\"]");
     By creditcardlink=By.id("paymentmethod_1");
     By linkcontinue=By.xpath("// input[@class=\"button-1 payment-method-next-step-button\"]");
     By inputcardholdername=By.id("CardholderName");
     By inputcardnumber=By.id("CardNumber");
     By expirymonth=By.xpath("// select[@id=\"ExpireMonth\"] / option[@value=\"2\"]");
     By expiryyear= By.xpath("// select [@id=\"ExpireYear\"] / option[@value=\"2021\"]");
     By inputcardcode=By.id("CardCode");
     By continuel=By.xpath("// input[@class=\"button-1 payment-info-next-step-button\"]");
     By continueconfirmorder=By.xpath("// input[@class=\"button-1 confirm-order-next-step-button\"]");


    public void registeredUserCheckoutSucessfully(){
        click_element(labelShipToSameAddress);

        clear_element(inputfirstname);
        enter_text(inputfirstname,loadProp.getProperty("FirstName"));
        clear_element(inputlastname);
        enter_text(inputlastname,loadProp.getProperty("LastName"));
        clear_element(inputemail);
        enter_text(inputemail,loadProp.getProperty("email")+date1+loadProp.getProperty("email1"));
        clear_element(inputcompanyname);
        enter_text(inputcompanyname,loadProp.getProperty("Company"));

        click_element(countryfield);
        enter_text(inputcityname,loadProp.getProperty("CityName"));
        enter_text(inputaddress,loadProp.getProperty("Address"));
        enter_text(inputpostcode,loadProp.getProperty("PostCode"));
        enter_text(inputphonenumber,loadProp.getProperty("PhoneNumber"));
        click_element(continuebutton);
        // click on continue button
        click_element(continuebutton);
        // click on Next Day air delivery
        //click_element(shippingoption);
        // click on continue
        click_element(buttoncontinue);
        // Select Credit Card
        click_element(creditcardlink);
        // Click on Continue
        click_element(linkcontinue);
        // Cardholders Name
        enter_text(inputcardholdername,loadProp.getProperty("Cardholdername"));
        // Input Card Number
        enter_text(inputcardnumber,loadProp.getProperty("CardNumber"));
        // select Februry
        click_element(expirymonth);
        // select year 2021
        click_element(expiryyear);
        // Input card code
        enter_text(inputcardcode,loadProp.getProperty("CardCode"));
        // Click on continue
        click_element(continuel);
        // click on continue to confirm the order
        click_element(continueconfirmorder);



    }
}
