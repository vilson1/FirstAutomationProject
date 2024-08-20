package day_7;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import utilities.WebDriverFactory;

public class TestNG_Intro {

    WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method annotation");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("after method annotation");
    }

    @Test
    public void TC1(){
        System.out.println("test 1");
        Assert.assertTrue("vilson".contains("v"),"fjala vilson nuk ka shkronjen a");
        Assert.assertEquals("vilson","vilson","keto fjale nuk jane njelloj");
        Assert.assertFalse(5>10);
        if (!"vilson".contains("v")) {
            Assert.fail("test is failed");
        }
    }

    @Test
    public void TC2(){
        System.out.println("test 2");
    }

    @Test
    public void TC3(){
        System.out.println("test 3");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("before class anotation");
        driver= WebDriverFactory.getDriver("chrome");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("after class anotation");
        driver.quit();
    }

}
