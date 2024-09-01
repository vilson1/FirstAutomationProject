package review_1.ReziHomeWork;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TC2 {
    //TC#2: Smartbear software order placing
    //1. Open browser
    //2. Go to website:
    //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        //1. Open browser
        //2. Go to website:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }

   @Test
    public  void TC2(){
       //3. Enter username: “Tester”
       //4. Enter password: “test”
       //5. Click on Login button
       SmartBearUtils.loginToSmartBear(driver);
       //6. Click on Order
       WebElement order= driver.findElement(By.xpath("//a[@href='Process.aspx']"));
       order.click();
       //7. Select familyAlbum from product, set quantity to 2
       Select product = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
       product.selectByIndex(1);
       WebElement quantify= driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
       quantify.sendKeys("2");

       //8. Click to “Calculate” button
       WebElement calculateButton= driver.findElement(By.xpath("//input[@value='Calculate']"));
       calculateButton.click();
       //9. Fill address Info with JavaFaker
       //• Generate: name, street, city, state, zip code
       Faker faker= new Faker();
       WebElement customerName= driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
       customerName.sendKeys(faker.name().fullName());
       WebElement customerStreet= driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
       customerStreet.sendKeys(faker.address().streetName());
       WebElement customerCity= driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
       customerCity.sendKeys(faker.address().city());
       WebElement customerState= driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
       customerState.sendKeys(faker.address().state());
       WebElement zipCode= driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));
       zipCode.sendKeys(faker.address().zipCode().replaceAll("-", ""));

       //10.Click on “visa” radio button
       WebElement visaRadiobutton= driver.findElement(By.xpath("//input[@value='Visa']"));
       visaRadiobutton.click();
       //11.Generate card number using JavaFaker
       WebElement cardNumber= driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
       cardNumber.sendKeys(faker.finance().creditCard().replaceAll("-", ""));
       WebElement expireDate= driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
       expireDate.sendKeys("12/29");
       //12.Click on “Process”
       WebElement processButton= driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
       processButton.click();
       //13.Verify success message “New order has been successfully added.”
       WebElement successMessage= driver.findElement(By.xpath("//strong[contains(.,'New order has been successfully')]"));

       Assert.assertEquals(successMessage.getText().trim(),"New order has been successfully added.");
   }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
