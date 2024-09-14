package tests.day_16;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoadingPage;
import utilities.Driver;

import java.time.Duration;

public class TC2 {
    @Test
    public void tc2(){
//        TC#5 : Dynamically Loaded Page Elements 1
//        1. Go to https://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");
        LoadingPage loadingPage=new LoadingPage();
//        2. Click to start
        loadingPage.startButton.click();
//        3. Wait until loading bar disappears
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOf(loadingPage.loadingBar));
//        4. Assert username inputbox is displayed
        Assert.assertTrue(loadingPage.userName.isDisplayed(),"UserName is not displayed!");
//        5. Enter username: tomsmith
        loadingPage.userName.sendKeys("tomsmith");
//        6. Enter password: incorrectpassword
        loadingPage.password.sendKeys("incorrectpassword");
//        7. Click to Submit button
        loadingPage.submitButton.click();
//        8. Assert “Your password is invalid!” text is displayed.
//                Note: Follow POM Design Pattern
        Assert.assertTrue(loadingPage.passwordInvalidError.isDisplayed(),"The error is not displayed!");
        Driver.closeDriver();

    }
}
