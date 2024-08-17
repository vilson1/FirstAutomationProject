package day_5_checkBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;

public class FindElements {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        WebElement element=driver.findElement(By.xpath("sdfghj"));
        List<WebElement> elements=driver.findElements(By.xpath("sdfghjkl"));
    }
}
