package day_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TC_1 {

    @Test
    public void  Tc1(){
//  TC #8: Selecting value from multiple select dropdown
//1. Open Chrome browser
        WebDriver driver=WebDriverFactory.getDriver("chrome");
//2. Go to https://practice.cydeo.com/dropdown
        driver.navigate().to("https://practice.cydeo.com/dropdown");
// 3. Select all the options from multiple select dropdown.
        WebElement programmingLanguagesDropdown=driver.findElement(By.name("Languages"));
        Select select=new Select(programmingLanguagesDropdown);
        for (WebElement eachOption : select.getOptions()) {
            eachOption.click();
        }
//4. Print out all selected values.
        for (WebElement eachOption : select.getOptions()) {
            if (eachOption.isSelected()) {
                System.out.println(eachOption.getText());
            }
        }
//5. Deselect all values.
        select.deselectAll();

    }
}
