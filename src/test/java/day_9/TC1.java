package day_9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.WebDriverFactory;

public class TC1 {
    WebDriver driver;
    @BeforeClass
    public void setrup(){
        //1. Create a new class called: T5_WindowsPractice
//        2. Create new test and make set ups
//        3. Go to : https://practice.cydeo.com/windows
        driver= WebDriverFactory.getDriver("chrome");

    }

    @AfterClass
    public void tearDown(){
       driver.quit();
    }
    @Test
    public void TC1(){
//        TC #5: Window Handle practice
//
        driver.get("https://practice.cydeo.com/windows");
        String mainWindow=driver.getWindowHandle();
        System.out.println(mainWindow);
//        4. Assert: Title is “Windows”
        Assert.assertEquals(driver.getTitle(),"Windows");
//        5. Click to: “Click Here” link
        driver.findElement(By.xpath("//a[.='Click Here']")).click();
//        6. Switch to new Window.
        for (String eachWindowHandle : driver.getWindowHandles()) {
            System.out.println(eachWindowHandle);
            if (!eachWindowHandle.equals(mainWindow)) {
                driver.switchTo().window(eachWindowHandle);
                System.out.println(eachWindowHandle);
            }
        }
//        7. Assert: Title is “New Window”
        Assert.assertEquals(driver.getTitle(),"New Window");
        driver.switchTo().window(mainWindow);
    }

    @Test
    public void TC2(){
//        TC #1: Window Handle practice
//        1. Create new test and make set ups
//        2. Go to : https://www.amazon.com
        driver.get("https://www.amazon.com");
//        3. Copy paste the lines from below into your class
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
//        4. Create a logic to switch to the tab where Etsy.com is open

        for (String eachWindowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(eachWindowHandle);
            System.out.println(eachWindowHandle);
            if (driver.getTitle().contains("etsy")){
                break;
            }
        }
//        5. Assert: Title contains “Etsy”
        Assert.assertTrue(driver.getTitle().contains("etsy"));
    }

    @Test
    public void TC3(){
        BrowserUtilities.sleep(5);
//        TC #2: Create utility method
//        1. Create a new class called BrowserUtils
//        2. Create a method to make Task1 logic re-usable
//        3. When method is called, it should switch window and verify title.
//        Method info:
//• Name: switchWindowAndVerify
//• Return type: void
//• Arg1: WebDriver
//• Arg2: String expectedInUrl
//• Arg3: String expectedTitl
    }
}
