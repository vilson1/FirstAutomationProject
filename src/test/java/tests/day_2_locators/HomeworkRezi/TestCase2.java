package tests.day_2_locators.HomeworkRezi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
    public static void main(String[] args) {
  /*
        1. open chrome browser
2. http://zero.webappsecurity.com/login.html
3. verify header text "Log in to ZeroBank"
NOTE: per te marre tekstin e nje elementi perdorim metoden getText()
Shembull:
WebElement header=driver.findElement(By.tagName("H1"));
element.getText() -> kthen nje string me tekstin qe ka elementi.
(nese nk e beni dot e shikojme heren tjeter)
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://zero.webappsecurity.com/login.html");
        WebElement header = driver.findElement(By.tagName("h3"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String actualHeaderText = driver.findElement(By.tagName("h3")).getText();
        String expectedResult = "Log in to ZeroBank";

        if (actualHeaderText.contains(expectedResult)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test failed");
        }

        driver.quit();
    }
}
