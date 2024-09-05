package tests.day_5_checkBoxes.HomeWorkRezi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class TC2Rezi {
    public static void main(String[] args) {
        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");
        //3. Click to “Hockey” radio button
        WebElement hockeyRadiobutt = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyRadiobutt.click();
        //4. Verify “Hockey” radio button is selected after clicking.
        boolean isSelected = hockeyRadiobutt.isSelected();
        if (isSelected) {
            System.out.println("Test passed");
        } else {
            System.out.println("test failed");
        }
        driver.quit();

        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }
}
