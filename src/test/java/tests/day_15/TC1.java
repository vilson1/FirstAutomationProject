package tests.day_15;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.Driver;

public class TC1 {
    LoginPage loginPage=new LoginPage();
    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get("https://library1.cydeo.com");
    }
    @Test
    public void tc1(){
//        TC #1: Required field error message test
//        1- Open a chrome browser
//        2- Go to: https://library1.cydeo.com
//        3- Do not enter any information
//        4- Click to “Sign in” button
        loginPage.loginButton.click();
//        5- Verify expected error is displayed:
        Assert.assertEquals(loginPage.fieldRequiredError.getText(),"This field is required.");
//        Expected: This field is required.
//        NOTE: FOLLOW POM DESIGN PATTERN
    }

    @Test
    public void TC2(){
//        TC #2: Invalid email format error message test
//        1- Open a chrome browser
//        2- Go to: https://library1.cydeo.com
//        3- Enter invalid email format
        loginPage.inputEmail.sendKeys("abc");
//        4- Verify expected error is displayed:
        Assert.assertEquals(loginPage.emailError.getText(),"Please enter a valid email address.");
//        Expected: Please enter a valid email address.
//        NOTE: FOLLOW POM DESIGN PATTERN
    }

}
