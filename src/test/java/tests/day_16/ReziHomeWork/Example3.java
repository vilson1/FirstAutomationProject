package tests.day_16.ReziHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class Example3 {
    //TC #1: Double Click Test


    @Test
    public void doubleClick() {
        //1. Go to
        //https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        WebDriverFactory.getDriver("chrome");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        //2. Switch to iframe.
        driver.switchTo().frame("iframeResult");
        WebElement clickText = driver.findElement(By.xpath("//p[.='Double-click me to change my text color.']"));
        //3. Double click on the text “Double-click me to change my text color.”
        Actions actions = new Actions(driver);
        actions.doubleClick(clickText).perform();
        //4. Assert: Text’s “style” attribute value contains “red”.
        Assert.assertTrue(clickText.getAttribute("style").contains("red"), "Style does not contain red");
        driver.quit();
    }


}
