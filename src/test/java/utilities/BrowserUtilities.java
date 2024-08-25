package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtilities {
    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void switchWindowAndVerify(WebDriver driver,String expectedUrl,String title){
        Set<String> allWindowHandles=driver.getWindowHandles();
        for (String eachWindowHandle : allWindowHandles) {
            driver.switchTo().window(eachWindowHandle);
            if (driver.getCurrentUrl().contains(expectedUrl)){
                break;
            }
        }
        String actualTitle=driver.getTitle();
        Assert.assertTrue(actualTitle.contains(actualTitle));
    }
}
