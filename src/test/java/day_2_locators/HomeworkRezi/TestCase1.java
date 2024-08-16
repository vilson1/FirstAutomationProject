package day_2_locators.HomeworkRezi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
    public static void main(String[] args) {
  /*
        Test case 1.
1. open chrome browser
2. go to https://www.etsy.com/
3. search for Iphone
4. verify that title is Iphone - EtsyAlbania
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com/");
        WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys("Iphone" + Keys.ENTER);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String actualTitle = driver.getTitle();
        String expectedResult = "Iphone - EtsyAlbania";

        if (actualTitle.contains(expectedResult)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test failed");
        }

        driver.quit();
    }
}
