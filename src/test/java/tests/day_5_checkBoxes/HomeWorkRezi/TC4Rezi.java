package tests.day_5_checkBoxes.HomeWorkRezi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utilities.WebDriverFactory;

public class TC4Rezi {
    public static void main(String[] args) {
        //TC#4: Verifying “Simple dropdown” and “State selection” dropdown
       // default values
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
       // 3. Verify “Simple dropdown” default selected value is correct
       // Expected: “Please select an option”
        Select simpleDropDown= new Select(driver.findElement(By.id("dropdown")));

        String expectedResult1="Please select an option";
        String actualResult1= simpleDropDown.getFirstSelectedOption().getText();
        boolean isCorrect1= expectedResult1.equals(actualResult1);
        if (isCorrect1){
            System.out.println("test1 passed");
        }else{
            System.out.println("test1 failed");
        }
        // 4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”
        Select stateSelection= new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String expectedResult2="Select a State";
        String actualResult2= stateSelection.getFirstSelectedOption().getText();
        boolean isCorrect2= expectedResult2.equals(actualResult2);
        if (isCorrect2){
            System.out.println("test2 passed");
        }else{
            System.out.println("test2 failed");
        }
        driver.quit();
    }
}
