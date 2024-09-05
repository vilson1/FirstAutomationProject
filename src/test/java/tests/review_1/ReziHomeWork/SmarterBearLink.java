package tests.review_1.ReziHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.List;

public class SmarterBearLink {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        //1. Open browser
        //2. Go to website:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @Test
    public void smarterBearLinks(){
        //3. Enter username: “Tester”
        //4. Enter password: “test”
        //5. Click to Login button
        WebElement userName= driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");
        WebElement passWord= driver.findElement(By.id("ctl00_MainContent_password"));
        passWord.sendKeys("test");
        WebElement loginButton= driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();
       //Print out count of all the links on landing page
        List<WebElement> links = driver.findElements(By.tagName("a"));
        //Print out each link text on this page
        for(WebElement eachLinktxt: links){
            System.out.println("eachLinktxt.getText() = " + eachLinktxt.getText());
        }

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
