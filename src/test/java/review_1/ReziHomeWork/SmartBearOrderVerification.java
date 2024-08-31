package review_1.ReziHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class SmartBearOrderVerification {
    //TC#3: Smartbear software order verification
    //1. Open browser and login to Smartbear software
    //2. Click on View all orders
    //3. Verify Susan McLaren has order on date “01/05/2010”
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }

    @Test
    public void orderVerification(){
        SmartBearUtils.loginToSmartBear(driver);
        WebElement viewAllOrder= driver.findElement(By.xpath("//a[.='View all orders']"));
        viewAllOrder.click();

        WebElement susanMcLarenorder= driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[preceding-sibling::td[.='Susan McLaren']][3]"));
        String actualResult= susanMcLarenorder.getText();

        Assert.assertEquals(actualResult,"01/05/2010");


    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
