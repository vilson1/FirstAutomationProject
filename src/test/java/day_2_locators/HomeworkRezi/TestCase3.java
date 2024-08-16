package day_2_locators.HomeworkRezi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {
    public static void main(String[] args) {
 /*
1.open chrome browser
2. go to https://www.google.com/
3. click Gmail  button
4. verirfy title contains Gmail
5. go back to google
6. refresh the page
7. verify title equals Google
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebElement gmailButton = driver.findElement(By.className("gb_y"));
        gmailButton.click();
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("Gmail")) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test failed");
        }
        driver.navigate().back();
        driver.navigate().refresh();
        String titleGoogle = driver.getTitle();

        if (titleGoogle.equals("Google")) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test failed");
        }
        driver.quit();
    }
}
