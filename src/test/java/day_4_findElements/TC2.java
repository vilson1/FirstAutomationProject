package day_4_findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class TC2 {
    public static void main(String[] args) {
        //TC #6: XPATH LOCATOR practice
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");
       // 3. Click on Button 1
        WebElement button1=driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();
        //4. Verify text displayed is as expected:
        String expextedTetx="Clicked on button one!";
        WebElement text=driver.findElement(By.id("result"));
        String actualResult=text.getText();
        if (expextedTetx.equals(actualResult)){
            System.out.println("Test poassed");
        }else {
            System.out.println("test failed");
        }
        String attribute=text.getAttribute("style");
        System.out.println(attribute);
        driver.quit();
        //Expected: “Clicked on button one!”
    }
}
