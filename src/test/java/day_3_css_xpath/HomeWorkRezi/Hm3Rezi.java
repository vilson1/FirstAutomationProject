package day_3_css_xpath.HomeWorkRezi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class Hm3Rezi {
    public static void main(String[] args) {
        //TC #3: getText() and getAttribute() method practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");
        //3- Verify header text is as expected:
        //Expected: Registration form

        WebElement headertext= driver.findElement(By.xpath("//h2[.='Registration form']"));
        String expectedtext= "Registration form";
        String actualtext= headertext.getText();
        WebElement inputbox= driver.findElement(By.xpath("//input[@name='firstname']"));
        //4- Locate “First name” input box
        //5- Verify placeholder attribute’s value is as expected:
        //Expected: first name
        //PS: getAttribute("ATTRIBUTE NAME") te kthen nje string me vleren e attributit
        String expectedattributevalue= "first name";
        String actualattributevalue= inputbox.getAttribute("placeholder");

if(actualattributevalue.equals(expectedattributevalue)){
    System.out.println("test passed attributte value: " + actualattributevalue);
}else{
    System.out.println("test failed");
}
driver.quit();

    }
}
