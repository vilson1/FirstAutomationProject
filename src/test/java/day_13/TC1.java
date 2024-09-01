package day_13;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.Driver;

import java.util.Locale;

public class TC1 {
    @Test
    public void TC1(){
//        TC#1: Registration form confirmation
//        Note: Use JavaFaker OR read from configuration.properties file when possible.
//        1. Open browser
//        2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get("https://practice.cydeo.com/registration_form");
//        3. Enter first name
        Faker faker=new Faker();
        String firstName=faker.name().firstName();
        Driver.getDriver().findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstName);
//        4. Enter last name
        String lastName=faker.name().lastName();
        Driver.getDriver().findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastName);
//        5. Enter username
        String userName=firstName+lastName;
        Driver.getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
//        6. Enter email address
        String email=userName+"@gmail.com";
        email=email.toLowerCase();
        Driver.getDriver().findElement(By.xpath("//input[@name='email']")).sendKeys(email);
//        7. Enter password
        String password=userName;
        Driver.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys(password);
//        8. Enter phone number
        String phoneNumber="571-123-4567";
        Driver.getDriver().findElement(By.xpath("//input[@name='phone']")).sendKeys(phoneNumber);
//        9. Select a gender from radio buttons
        Driver.getDriver().findElement(By.xpath("//input[@value='female']")).click();
//        10.Enter date of birth
        String birthday="12/12/1900";
        Driver.getDriver().findElement(By.xpath("//input[@name='birthday']")).sendKeys(birthday);
//        11.Select Department/Office
        Select selectdDepartment=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        selectdDepartment.selectByValue("DE");
//        12.Select Job Title
        Select selectdJobTitle=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        selectdJobTitle.selectByIndex(4);
//        13.Select programming language from checkboxes
        BrowserUtilities.click("//input[following-sibling::label[.='Java']]");
//        14.Click to sign up button
        Driver.getDriver().findElement(By.id("wooden_spoon")).click();
//        15.Verify success message “You’ve successfully completed registration.” is
//        displayed.
       String text= Driver.getDriver().findElement(By.xpath("//p[contains(.,'registration')]")).getText();
       BrowserUtilities.compareText(text,"You've successfully completed registration!");
//                Note:
//        1. Use new Driver utility class and method
//        2. User JavaFaker when possible
//        3. User ConfigurationReader when it makes sense
        Driver.closeDriver();
    }
}
