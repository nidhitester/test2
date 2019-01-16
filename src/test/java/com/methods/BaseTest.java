package com.methods;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;

public class BaseTest extends Util{
 CrossBrowser crossBrowser=new CrossBrowser();
    @BeforeMethod
    public void setup(){
    crossBrowser.browser();
   // browserLaunch("chrome","https://demo.nopcommerce.com");
   // browserLaunch("firefox","https://demo.nopcommerce.com");
   // browserLaunch("ie","https://demo.nopcommerce.com");
    }
    @AfterMethod
    public void teardown(ITestResult result){

            if (ITestResult.FAILURE == result.getStatus()) {
                try {
                    TakesScreenshot ts = (TakesScreenshot) driver;
                    File source = ts.getScreenshotAs(OutputType.FILE);
                    FileUtils.copyFile(source, new File("src\\Screenshot\\" + result.getName() + ".png"));
                    System.out.println("Screenshot taken");
                } catch (Exception e) {
                    System.out.println("exception while taking Screenshot " + e.getMessage());
                }


                driver.quit();


}
}}
