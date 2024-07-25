package day_2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://mvnrepository.com/");

        driver.navigate().forward();
        driver.navigate().back();
        driver.navigate().refresh();
        driver.getTitle();

        driver.close();
        driver.quit();


    }

}
