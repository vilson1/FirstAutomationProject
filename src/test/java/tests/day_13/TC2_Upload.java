package tests.day_13;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.Driver;

public class TC2_Upload {
    @Test
    public void uploadTest(){
//        TC #2 Upload Test
//        1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");
//        2. Find some small file from your computer, and get the path of it.
        Driver.getDriver().findElement(By.id("file-upload")).sendKeys("C:\\Users\\User\\Desktop\\tesla.jpeg");
//        3. Upload the file.
        Driver.getDriver().findElement(By.id("file-submit")).click();
//        4. Assert:
        BrowserUtilities.compareText(Driver.getDriver().findElement(By.xpath("//h3")).getText(),"File Uploaded!");
//        -File uploaded text is displayed on the page
    }
}
