package tests.day_16;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoadingPage;
import utilities.Driver;

import java.time.Duration;

public class TC1 {
    @Test
    public void tc1(){
//        TC#4 : Dynamically Loaded Page Elements 7
//        1. Go to https://practice.cydeo.com/dynamic_loading/7
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");
//        2. Wait until title is “Dynamic title”
//        3. Assert: Message “Done” is displayed.
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        LoadingPage loadingPage=new LoadingPage();
        Assert.assertTrue(loadingPage.doneText.isDisplayed(),"Done text is not displayed!");
        Assert.assertTrue(loadingPage.image.isDisplayed(),"image is not displayed!");

        Driver.closeDriver();
//        4. Assert: Image is displayed.
//                Note: Follow POM
    }
}
