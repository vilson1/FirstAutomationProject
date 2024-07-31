package review_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.WebDriverFactory;

public class Exercise_1 {
    public static void main(String[] args) {
        //hapim chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //shkojme ne https://mail.google.com/mail/u/0/?ogbl#inbox
        driver.get("https://mail.google.com/mail/u/0/?ogbl#inbox");
        //shkruajme email dhe klikojme next
        WebElement emailInput=driver.findElement(By.cssSelector("input[type='email']"));
        WebElement nextButton=driver.findElement(By.xpath("//button[.='Next']"));
        WebElement toContinueGmail=driver.findElement(By.xpath("//span[.='to continue to Gmail']"));
        System.out.println(toContinueGmail.getText());
        System.out.println(emailInput.getAttribute("autocomplete"));
        emailInput.sendKeys("vilson@gmail.com");
        nextButton.click();
        String expectedResult="Try using a different browser. If you’re already using a supported browser, you can try again to sign in.";

    }
}
