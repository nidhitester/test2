package com.methods;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;

public class BaseTest extends Util{

    @BeforeMethod
    public void setup(){
   // browserLaunch("chrome","https://demo.nopcommerce.com");
    browserLaunch("firefox","https://demo.nopcommerce.com");
    browserLaunch("ie","https://demo.nopcommerce.com");
    }
    @AfterMethod
    public void teardown()throws Exception{
        TakesScreenshot t=(TakesScreenshot) driver ;
        t.getScreenshotAs(OutputType.FILE);
        File source=t.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source,new File("./ScreenShots/demo.nopcommerce.png"));
        System.out.println("screenshot taken");

        driver.quit();


}
}
