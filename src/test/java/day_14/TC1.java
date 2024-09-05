package day_14;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.Driver;

public class TC1 {
    @Test
    public void tc1(){
//        TC #6: Scroll using JavascriptExecutor
//        1- Open a chrome browser
//        2- Go to: https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");
//        3- Use below JavaScript method and scroll
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
//        a. 750 pixels down 10 times.
//                b. 750 pixels up 10 times
        BrowserUtilities.sleep(2);
        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0,750)");
        }
        BrowserUtilities.sleep(2);
//        JavaScript method to use : window.scrollBy(0,0)
        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0,-750)");
        }
    }
}
