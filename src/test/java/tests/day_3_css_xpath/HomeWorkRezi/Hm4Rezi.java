package tests.day_3_css_xpath.HomeWorkRezi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class Hm4Rezi {
    public static void main(String[] args) {
        //TC #4: Library verifications
        //1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to http://library2.cybertekschool.com/login.html
        driver.get("http://library2.cybertekschool.com/login.html");
        //3. Enter username: “incorrect@email.com”
        WebElement inputEmail = driver.findElement(By.className("form-control"));
        inputEmail.sendKeys("incorrect@email.com");
        //4. Enter password: “incorrect password”
        WebElement inputPasswordbox = driver.findElement(By.id("inputPassword"));

        inputPasswordbox.sendKeys("incorrect password");
        //5. Verify: visually “Sorry, Wrong Email or Password”
        //displayed
        WebElement signin = driver.findElement(By.tagName("button"));

        signin.click();
        WebElement errordisplayed = driver.findElement(By.xpath("//div[contains(text(),'Sorry, Wrong Email or Password'"));
        if (errordisplayed.isDisplayed()) {
            System.out.println("Test passed, is displayed : " + errordisplayed.getText());
        } else {
            System.out.println("Test failed");
        }

        //PS: Locate username input box using “className” locator
        //Locate password input box using “id” locator
        //Locate Sign in button using “tagName” locator

        driver.quit();
    }
}
