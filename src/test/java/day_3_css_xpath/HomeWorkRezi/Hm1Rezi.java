package day_3_css_xpath.HomeWorkRezi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class Hm1Rezi {
    public static void main(String[] args) {
       // 1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");

       // 2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
       // 3- Enter incorrect username into login box:
        WebElement loginBox= driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        loginBox.sendKeys("incorrect");
       // 4- Click to `Reset password` button
        WebElement ressetpassbutton= driver.findElement(By.xpath("//button[@class='login-btn']"));
        ressetpassbutton.click();
       // 5- Verify “error” label is as expected
        String expectedLabel="Login or E-mail not found";
        WebElement errolLabel = driver.findElement(By.xpath("//div[@class='errortext']"));
        String actualerrorLabel= errolLabel.getText();
       //Expected: Login or E-mail not found
       // PS: Inspect and decide which locator you should be using to locate web
        //elements.
           //     PS2: Pay attention to where to get the text of this button from
        if (expectedLabel.equals(actualerrorLabel)){
           System.out.println(" test passed: “error” label is as expected  " + " " + actualerrorLabel + " " );

        }else{
            System.out.println("error label not as expected");
        }
        driver.quit();
    }
}
