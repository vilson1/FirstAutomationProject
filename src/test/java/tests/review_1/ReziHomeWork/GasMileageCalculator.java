package tests.review_1.ReziHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class GasMileageCalculator {
    //1. Add a new class GasMileageCalculatorTest
    //2. Go to https://www.calculator.net
    //3. Search for “gas mileage” using search box
    //4. Click on the “Gas Mileage Calculator” link
    WebDriver driver;
    @BeforeClass
    public void setUp(){

        driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.calculator.net");
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void gasCalculator(){
        WebElement searchBox= driver.findElement(By.xpath("//input[@id='calcSearchTerm']"));
        searchBox.sendKeys("gas mileage");

        WebElement gasLink= driver.findElement(By.xpath("//a[.='Gas Mileage Calculator']"));
        gasLink.click();

        //5. On Next page verify:
        //a. Title equals: “Gas Mileage Calculator”
        //b. “Gas Mileage Calculator” label is displayed
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,"Gas Mileage Calculator");

        WebElement label= driver.findElement(By.xpath("//h1[.='Gas Mileage Calculator']"));
        Assert.assertTrue(label.isDisplayed());

        //6. Locate, clear and type “7925” into “Current odometer” field

        WebElement currentOdometer= driver.findElement(By.xpath("//input[@id='uscodreading']"));
        currentOdometer.clear();
        currentOdometer.sendKeys("7925");
        //7. Locate, clear and type “7550” into “Previous odometer” field
        WebElement previousOdometer= driver.findElement(By.xpath("//input[@id='uspodreading']"));
        previousOdometer.clear();
        previousOdometer.sendKeys("7550");
        //8. Locate, clear and type “16” into “Gas added” field
        WebElement gasAdded= driver.findElement(By.xpath("//input[@id='usgasputin']"));
        gasAdded.clear();
        gasAdded.sendKeys("16");
        //9. Locate, clear and type “3.55” into “Gas price” field
        WebElement gasPrice= driver.findElement(By.xpath("//input[@id='usgasprice']"));
        gasPrice.clear();
        gasPrice.sendKeys("3.55");
//10. Click on Calculate button
        WebElement calculateButton= driver.findElement(By.xpath("(//input[@value='Calculate'])[1]"));
        //(//td/input[@type='submit' and @name='x'])[1]
        calculateButton.click();
//11. Verify mpg value is as expected:
        WebElement mpgValue= driver.findElement(By.xpath("//span[@class='bigtext']"));
        Assert.assertEquals(mpgValue.getText(),"23.44 mpg");
//Expected value: “23.44 mpg”

    }
}
