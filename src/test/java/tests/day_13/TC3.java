package tests.day_13;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class TC3 {
    @Test
    public void tc3(){
//        TC #3: Hover Test
//        1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers");
        Actions actions=new Actions(Driver.getDriver());
//        2. Hover over to first image
        actions.moveToElement(Driver.getDriver().findElement(By.xpath("(//img)[1]"))).perform();
//        3. Assert:
//        a. “name: user1” is displayed
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']")).isDisplayed());
//        b. “view profile” is displayed
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//a[.='View profile'])[1]")).isDisplayed());
//        4. Hover over to second image
        actions.moveToElement(Driver.getDriver().findElement(By.xpath("(//img)[2]"))).perform();
//        5. Assert:
//        a. “name: user2” is displayed
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']")).isDisplayed());
//        b. “view profile” is displayed
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//a[.='View profile'])[2]")).isDisplayed());
//        6. Hover over to third image
//        7. Confirm:
//        a. “name: user3” is displayed
//        b. “view profile” is displayed
        actions.moveToElement(Driver.getDriver().findElement(By.xpath("(//img)[3]"))).perform();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']")).isDisplayed());
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//a[.='View profile'])[3]")).isDisplayed());
    }
}
