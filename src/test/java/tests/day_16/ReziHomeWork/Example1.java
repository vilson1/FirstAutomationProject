package tests.day_16.ReziHomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;


import java.time.Duration;

import static utilities.Driver.*;
import static utilities.Driver.getDriver;

public class Example1 {

    @Test
    public void tcEx1(){
        //1- Open a chrome browser
        // 2- Go to: https://practice.cydeo.com/dynamic_controls
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://practice.cydeo.com/dynamic_controls");

        //3- Click to “Remove” button
        WebElement removeButton= driver.findElement(By.xpath("//button[.='Remove']"));
        removeButton.click();
        //4- Wait until “loading bar disappears”
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='loading']")));
        ///5- Verify:
        ////a. Checkbox is not displayed
        ////b. “It’s gone!” message is displayed.
        Assert.assertFalse(driver.findElement(By.xpath("//div[@id='checkbox']")).isDisplayed(),"Checkbox is displayed");
        Assert.assertTrue(driver.findElement(By.xpath("//p[@id='message']")).isDisplayed(),"“It’s gone!” message is not displayed.");
    }
}
