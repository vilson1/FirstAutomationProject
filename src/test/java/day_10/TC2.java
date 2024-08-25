package day_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.WebDriverFactory;
import utilities.WebTableUtils;

public class TC2 {
    @Test
    public void TC2(){
//        TC #1: Web table practice
        WebDriver driver= WebDriverFactory.getDriver("chrome");
//        1. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");
//        2. Verify Bob’s name is listed as expected.
//        Expected: “Bob Martin”
//        3. Verify Bob Martin’s order date is as expected
//        Expected: 12/31/2021
        WebTableUtils.orderVerify(driver,"Ned Stark","05/12/2021");
        driver.quit();
    }
}
