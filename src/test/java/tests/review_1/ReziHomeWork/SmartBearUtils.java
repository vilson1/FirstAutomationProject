package tests.review_1.ReziHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SmartBearUtils {

    public static void loginToSmartBear(WebDriver driver){
        //username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
      //password
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        //loginbutton click
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
    }
}
