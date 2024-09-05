package tests.day_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class Tests_2 {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/iframe");
    }

    @Test
    public void TC1(){
//        TC #4: Iframe practice
        driver.switchTo().frame("mce_0_ifr");
        WebElement textElement=driver.findElement(By.xpath("//p[.='Your content goes here.']"));
//        4. Assert: “Your content goes here.” Text is displayed.
        Assert.assertEquals(textElement.getText(),"Your content goes here.");
//        5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
        driver.switchTo().defaultContent();
        WebElement title=driver.findElement(By.xpath("//h3[.='An iFrame containing the TinyMCE WYSIWYG Editor']"));
    }
    /*
    * html{
    * webelement2
    * driver.switchTo().parentFrame();
    * switchto.iframe(1)
    * iframe1{
    * driver.switchTo().parentFrame();
    * switchto.iframe(2)
    *    iframe2{
    * driver.switchTo().parentFrame();
    * switchto.iframe(3)
    *      iframe3}
    *         webelement1
    *            }
    *        }*/
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
