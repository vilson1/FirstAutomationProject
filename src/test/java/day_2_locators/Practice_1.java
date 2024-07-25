package day_2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        WebElement searchBox=driver.findElement(By.className("gLFyf"));

        searchBox.sendKeys("apple"+ Keys.ENTER);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String actualTitle=driver.getTitle();
        String  expectedTitle="apple";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }

    /*to shkolme ne goole
    * do shkruajme apple
    shtypim enter
    kontrollojme emrin e faqes */
    }
}
