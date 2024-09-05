package tests.day_2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AdF4I74-DYC5YpKc6NbMnVF5188tC7AEkVzCHAPv7uJUnO-JervFVZDWBUNHehEzbaE_WywjDg6K&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1543586160%3A1721847546214654&ddm=0");
        WebElement inputEmail=driver.findElement(By.tagName("img"));
        inputEmail.sendKeys("vilson@gamail.com");

    }
}
