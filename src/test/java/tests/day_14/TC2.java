package tests.day_14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.Driver;

public class TC2 {
    @Test
    public void tc2(){
//        TC #7: Scroll using JavascriptExecutor
//        1- Open a chrome browser
//        2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");
//        3- Scroll down to “Cydeo” link
        WebElement cydeoLink=Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink=Driver.getDriver().findElement(By.linkText("Home"));
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        BrowserUtilities.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)",cydeoLink);
        BrowserUtilities.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)",homeLink);
//        4- Scroll up to “Home” link
//        5- Use below provided JS method only
//        JavaScript method to use : arguments[0].scrollIntoView(true)
//        Note: You need to locate the links as web elements and pass them as
//        arguments into executeScript() method
    }
}
