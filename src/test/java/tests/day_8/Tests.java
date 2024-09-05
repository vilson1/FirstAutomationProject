package tests.day_8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class Tests {
    WebDriver driver;
    @BeforeClass
    public void driverInicialisation(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void TC1(){
//        TC #1: Information alert practice
//
//        3. Click to “Click for JS Alert” button
        WebElement JSAlertButton=driver.findElement(By.xpath("//button[contains(.,'JS Alert')]"));
        JSAlertButton.click();
//        4. Click to OK button from the alert
        Alert alert=driver.switchTo().alert();
        alert.accept();
//        5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultAlert=driver.findElement(By.id("result"));
        String expecterResult="You successfully clicked an alert";
        String actualResult=resultAlert.getText();
        Assert.assertEquals(actualResult,expecterResult,"popup is not handled!");
    }

    @Test
    public void TC2(){
//        TC #2: Confirmation alert practice
//
//        3. Click to “Click for JS Confirm” button
        WebElement JSComfirmButton=driver.findElement(By.xpath("//button[contains(.,'JS Confirm')]"));
        JSComfirmButton.click();
//        4. Click to Cancel button from the alert
        Alert alert=driver.switchTo().alert();
        alert.dismiss();
//        5. Verify “You clicked: Ok” text is displayed.
        String expectedResult="You clicked: Cancel";
        String actualResult=driver.findElement(By.id("result")).getText();
        Assert.assertTrue(expectedResult.equals(actualResult),"expected result: "+expectedResult + "actual result: "+actualResult);

    }
}
