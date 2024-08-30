package day_11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.WebDriverFactory;

public class TC1 {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver= WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.get(ConfigurationReader.getProperty("url"));
    }
    @Test
    public void TC1(){
//        TC #4: Google search
//        1- Open a chrome browser
//        2- Go to: https://google.com
//        3- Write “apple” in search box
        WebElement searcBox=driver.findElement(By.id("APjFqb"));
        searcBox.sendKeys(ConfigurationReader.getProperty("searchKeyWord"), Keys.ENTER);
        BrowserUtilities.verifyTitle(driver,ConfigurationReader.getProperty("searchKeyWord")+" - Google Search");
//        4- Verify title:
//        Expected: apple - Google Search

//        Use `configuration.properties` for the following:
//        1. The browser type
//        2. The URL
//        3. The search keyword
//        4. Make title verification dynamic. If search value changes, title
//        assertion should not fail.
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
