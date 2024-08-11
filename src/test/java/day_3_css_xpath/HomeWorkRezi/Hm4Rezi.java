package day_3_css_xpath.HomeWorkRezi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Hm4Rezi {
    public static void main(String[] args) {
        //TC #4: Library verifications
        //1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to http://library2.cybertekschool.com/login.html
        driver.get("http://library2.cybertekschool.com/login.html");
        //3. Enter username: “incorrect@email.com”
        WebElement inputEmail = driver.findElement(By.xpath("//label[@for='inputEmail']"));
        ////div[@class='form-label-group'][1]
        inputEmail.sendKeys("incorrect@email.com");
        //4. Enter password: “incorrect password”
        WebElement inputPasswordbox = driver.findElement(By.id("inputPassword"));

        inputPasswordbox.sendKeys("incorrect password");
        //5. Verify: visually “Sorry, Wrong Email or Password”
        //displayed
        WebElement signin = driver.findElement(By.tagName("button"));

        signin.click();
        WebElement textdisplayed = driver.findElement(By.xpath("//div[@style='display: block;']"));
        if (textdisplayed.isDisplayed()) {
            System.out.println("Test passed, is displayed : " + textdisplayed.getText());
        } else {
            System.out.println("Test failed");
        }

        //PS: Locate username input box using “className” locator
        //Locate password input box using “id” locator
        //Locate Sign in button using “tagName” locator

        driver.quit();
    }
}
