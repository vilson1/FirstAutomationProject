package day_4_findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;

public class TC3 {
    public static void main(String[] args) {
        //TC #4: FindElements Task
       // 1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");
       // 3- Locate all the links in the page.
        List<WebElement> links=driver.findElements(By.tagName("a"));
       // 4- Print out the number of the links  page.
        System.out.println("================");
        System.out.println(links.size());
       // 5- Print out the texts of the links.
        System.out.println("==========");
        for (WebElement eachElement : links) {
            System.out.println(eachElement.getText());
        }
        System.out.println("==============");
       // 6- Print out the HREF attribute values of the links
        for (WebElement eachLink : links) {
            System.out.println(eachLink.getAttribute("href"));

        }
        driver.quit();
    }
}
