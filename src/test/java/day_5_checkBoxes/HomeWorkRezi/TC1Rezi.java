package day_5_checkBoxes.HomeWorkRezi;

import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;

public class TC1Rezi {

    public static void main(String[] args) throws InterruptedException {
        //TC #1: StaleElementReferenceException handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");
        //3. Click to “Add Element” button
        WebElement addElementbutton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        Thread.sleep(3000);
        addElementbutton.click();
        //4. Verify “Delete” button is displayed after clicking.
        List<WebElement> deleteButton = driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
        Thread.sleep(3000);
        if (deleteButton.size()!=0) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        //5. Click to “Delete” button.
        deleteButton.get(0).click();
        //6. Verify “Delete” button is NOT displayed after clicking.
        deleteButton = driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
        if (deleteButton.size()==0) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        driver.quit();
    }
}
