package tests.day_3_css_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class task_2 {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("firefox");
        //shkojme te faqja https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //shkruajme kredencialet
        WebElement inputUserName=driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        WebElement inputPass=driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        WebElement loginButton=driver.findElement(By.xpath("//input[@value='Log In']"));
        inputUserName.sendKeys("name");
        inputPass.sendKeys("password");
        loginButton.click();
        //verifikojme prezencen e forget password
        WebElement forgetPssword=driver.findElement(By.xpath("//a[.='Forgot your password?']"));
        boolean actualResult=forgetPssword.isDisplayed();
        if (actualResult){
            System.out.println("element is visible");
        }else {
            System.out.println("element not present");
        }
        //pasi e klikojme verifikojme reset password edhe titullin get password
        forgetPssword.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement getPassTitle=driver.findElement(By.xpath("//div[@class='log-popup-header']"));
        WebElement resetPassButton=driver.findElement(By.xpath("//button[text()='Reset password']"));
        if (getPassTitle.isDisplayed() && resetPassButton.isDisplayed()){
            System.out.println("Test passed");
        }else {
            System.out.println("Test Failed");
        }

    }
}
