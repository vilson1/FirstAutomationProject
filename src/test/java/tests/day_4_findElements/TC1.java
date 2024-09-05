package tests.day_4_findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class TC1 {
    public static void main(String[] args) {

        //TC #1: XPATH Practices
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");
        //3. Locate all the WebElements on the page using XPATH
        WebElement homeButton=driver.findElement(By.xpath("//a[@class='nav-link']"));
        WebElement forgotPasswordTitle=driver.findElement(By.xpath("//h2[contains(text(),'Password')]"));
        WebElement emailText=driver.findElement(By.xpath("//label[@for='email']"));
        WebElement inputBox=driver.findElement(By.xpath("//input[contains(@pattern,'[a-z0-9._%+-]+@[a-z0-9.-]')]"));
        WebElement submitButton=driver.findElement(By.xpath("//button[@id='form_submit']"));
        WebElement powerdByElement=driver.findElement(By.xpath("//div[text()='Powered by ']"));
        //locator only (total of 6)

        // a. “Home” link
        //b. “Forgot password” header
        //c. “E-mail” text
        // d. E-mail input box
        // e. “Retrieve password” button
        //f. “Powered by Cydeo text
        //4. Verify all web elements are displayed.

        if (homeButton.isDisplayed() && forgotPasswordTitle.isDisplayed() &&
        emailText.isDisplayed() &&inputBox.isDisplayed()
        &&submitButton.isDisplayed() && powerdByElement.isDisplayed()){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }
        driver.quit();

    }
}
