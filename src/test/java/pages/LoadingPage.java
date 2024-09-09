package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoadingPage {
    public LoadingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "//strong[contains(.,'Done')]")
    public WebElement doneText;

    @FindBy(xpath = "//img[@class='rounded mx-auto d-block']")
    public WebElement image;
}
