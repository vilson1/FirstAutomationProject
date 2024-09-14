package tests.day_16.ReziHomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Example2 {

    @Test
    public void tcEx2(){
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //2- Go to: https://practice.cydeo.com/dynamic_controls
        driver.get("https://practice.cydeo.com/dynamic_controls");
        //3- Click to “Enable” button
        driver.findElement(By.xpath("//button[.='Enable']")).click();
        //4- Wait until “loading bar disappears”
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='loading']")));
        //5- Verify:
        //a. Input box is enabled.
        //b. “It’s enabled!” message is displayed.
        Assert.assertTrue(driver.findElement(By.xpath("//input[@type='text']")).isEnabled(),"Inputbox is not enabled");
        Assert.assertTrue(driver.findElement(By.xpath("//p[@id='message']")).isDisplayed(),"It's enabled message is not displayed");

    }
}
