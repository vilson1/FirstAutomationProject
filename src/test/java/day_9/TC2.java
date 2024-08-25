package day_9;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;
import utilities.WebDriverFactory;

public class TC2 {
    @Test
    public void TC1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://login1.nextbasecrm.com/");
//        TC #3: Login scenario
//        1. Create new test and make set ups
//        2. Go to : http://login1.nextbasecrm.com/
//        3. Enter valid username
//        4. Enter valid password
//        5. Click to `Log In` button
        BrowserUtilities.login(driver,"1@cybertekschool.com","UserUser","Authorisation");
//        6. Verify title is as expected:
//        Expected: Portal
    }
}
