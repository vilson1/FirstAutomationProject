package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    public static void verifyTitle(WebDriver driver,String expectedTitle){
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Expected Page is not open");
    }

    public static void login(WebDriver driver,String username,String password,String title){
        verifyTitle(driver,title);

        WebElement userName=driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        WebElement loginPassword=driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        WebElement submitButton=driver.findElement(By.xpath("//input[@class='login-btn']"));
        userName.clear();
        loginPassword.clear();
        userName.sendKeys(username);
        loginPassword.sendKeys(password);
        submitButton.click();

    }

    public static void compareText(String actualResult,String expectedResuld){
        Assert.assertEquals(actualResult,expectedResuld, "actual resul: "+actualResult+" is not the same as expected result: "+expectedResuld);
    }

}
