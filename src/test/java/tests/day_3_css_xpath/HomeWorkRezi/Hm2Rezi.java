package tests.day_3_css_xpath.HomeWorkRezi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class Hm2Rezi {
    public static void main(String[] args) {
       // C #2: NextBaseCRM, locators, getText(), getAttribute() practice
       // 1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

       // 2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
       // 3- Verify “Reset password” button text is as expected:
       // Expected: Reset password
        WebElement resetpassbutton= driver.findElement(By.xpath("//button[.='Reset password']"));
        String expectedresult= "Reset password";
        String actualresult= resetpassbutton.getText();

        if(actualresult.equals(expectedresult)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
        driver.quit();

    }
}
