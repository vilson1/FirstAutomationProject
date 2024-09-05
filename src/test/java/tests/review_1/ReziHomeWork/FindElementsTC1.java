package tests.review_1.ReziHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.List;

public class FindElementsTC1 {
    //TC #1: Checking the number of links on the page
    //1. Open Chrome browser
    //2. Go to https://www.openxcell.com
    //3. Count the number of the links on the page and verify
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.openxcell.com");
    }

    @Test
    public void TC1 (){
        List<WebElement> allLinks= driver.findElements(By.tagName("a"));

        int nrofLinks= allLinks.size();
        Assert.assertEquals(nrofLinks,332);

    }
    @Test
    public void TC2(){
        //TC #2: Printing out the texts of the links on the page
        //1. Open Chrome browser
        //2. Go to https://www.openxcell.com
        //3. Print out all of the texts of the links on the page
        List<WebElement> allLinks= driver.findElements(By.tagName("a"));
        for (WebElement eachLink : allLinks) {
            System.out.println(eachLink.getText());
        }

    }
    @Test
    public void TC3(){
        //TC #3: Counting the number of links that does not have text
        //1. Open Chrome browser
        //2. Go to https://www.openxcell.com
        //3. Count the number of links that does not have text and verify
        //Expected: 109
        List<WebElement> allLinks= driver.findElements(By.tagName("a"));
        int linksWithoutText=0;
        for (WebElement eachLink : allLinks) {
            if(eachLink.getText().isEmpty()){
                linksWithoutText++;
            }
            Assert.assertEquals(linksWithoutText,109);
        }
    }
    @AfterClass
    public void tearDown(){
    driver.quit();
    }

}
