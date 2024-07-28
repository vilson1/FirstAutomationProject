package day_3_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.WebDriverFactory;

public class Task_1 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //futemi te webi "https://login1.nextbasecrm.com/"
        driver.get("https://login1.nextbasecrm.com/");
        // shkruajme kredencialet
        WebElement inputUserName=driver.findElement(By.cssSelector("input[placeholder='Username or Email']"));
        WebElement inputPass=driver.findElement(By.cssSelector("input[type='password']"));
        WebElement loginButton=driver.findElement(By.cssSelector("input[type='submit']"));
        inputUserName.sendKeys("name");
        inputPass.sendKeys("password");
        loginButton.click();
        //verifikojme mesazhin per kredenciale te gabuara "Incorrect login or password"
        WebElement wrongCredentioalsErrorText=driver.findElement(By.cssSelector("div[class='errortext']"));

        String expectedResult="Incorrect login or password";
        String actualResult=wrongCredentioalsErrorText.getText();
        if (expectedResult.equals(actualResult)){
            System.out.println("Test passed");
        }else {
            System.out.println("test failed");
        }
        driver.quit();
    }
}
