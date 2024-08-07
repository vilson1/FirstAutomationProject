package day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;

public class TC_1 {
    public static void main(String[] args) throws InterruptedException {
       // Practice: Checkboxes
        WebDriver driver=WebDriverFactory.getDriver("chrome");
       // 1. Go to http://practice.cydeo.com/checkboxes
        driver.get("http://practice.cydeo.com/checkboxes");
        //2. Confirm checkbox #1 is NOT selected by default
       List<WebElement> checkBoxElements= driver.findElements(By.xpath("//input[@type='checkbox']"));
       Thread.sleep(3000);
       if (checkBoxElements.get(0).isSelected()==false){
           System.out.println("step passed");
       }else {
           System.out.println("step failed");
       }
        //3. Confirm checkbox #2 is SELECTED by default.
       if (checkBoxElements.get(1).isSelected()==true){
           System.out.println("step passed");
       }else {
           System.out.println("step failed");
       }
        //4. Click checkbox #1 to select it.
        Thread.sleep(3000);
        System.out.println(checkBoxElements.get(0).isEnabled());
        checkBoxElements.get(0).click();
        //5. Click checkbox #2 to deselect it.
        checkBoxElements.get(1).click();
        //6. Confirm checkbox #1 is SELECTED.
        Thread.sleep(3000);
        if (checkBoxElements.get(0).isSelected()==true){
            System.out.println("step passed");
        }else {
            System.out.println("step failed");
        }
        //7. Confirm checkbox #2 is NOT selected.
        if (checkBoxElements.get(1).isSelected()==false){
            System.out.println("step passed");
        }else {
            System.out.println("step failed");
        }
        driver.quit();
    }
}
