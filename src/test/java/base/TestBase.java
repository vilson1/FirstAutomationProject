package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.Driver;

public class TestBase {
    protected WebDriver driver;
    @BeforeClass
    public void driverInicialisation(){
        Driver.getDriver().get("http://practice.cydeo.com/javascript_alerts");
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
