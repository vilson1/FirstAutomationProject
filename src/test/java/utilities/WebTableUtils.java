package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {
    public static String returnOrderDate (WebDriver driver,String customerName){
        String xPath="//td[preceding-sibling::td[.='"+customerName+"']][3]";

        WebElement orderDate=driver.findElement(By.xpath(xPath));
        return orderDate.getText();
    }

    public static void orderVerify (WebDriver driver,String customerName, String expectedOrderDate){
        Assert.assertEquals(returnOrderDate(driver,customerName),expectedOrderDate);
    }
}
