package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement  loginButton;

    @FindBy(id = "inputEmail-error")
    public WebElement fieldRequiredError;

    @FindBy(id ="inputEmail")
    public WebElement inputEmail;

    @FindBy(id = "inputEmail-error")
    public WebElement emailError;

    }
