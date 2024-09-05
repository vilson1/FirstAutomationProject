package tests.day_5_checkBoxes.HomeWorkRezi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.List;

public class TC3Rezi {

        //TC #3: Utility method task for (continuation of Task2)
           // 1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/radio_buttons
        //3. Click to “Hockey” radio button
        //4. Verify “Hockey” radio button is selected after clicking.
       // USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        //Create a utility method to handle above logic.
        //Method name: clickAndVerifyRadioButton
        //Return type: void or boolean
        //Method args:
        //1. WebDriver
        //2. Name attribute as String (for providing which group of radio buttons)
        //3. Id attribute as String (for providing which radio button to be clicked)
        //Method should loop through the given group of radio buttons. When it finds the
        //matching option, it should click and verify option is Selected.
                //Print out verification: true
        public static void main(String[] args) {

            WebDriver driver= WebDriverFactory.getDriver("chrome");
            driver.get("https://practice.cydeo.com/radio_buttons");
            clickAndVerifyRadioButton(driver,"sport","hockey");
            driver.quit();

        }

        public static void clickAndVerifyRadioButton(WebDriver driver,String attributeName, String idAttribute){
            // Find all radio buttons with the given name attribute
            List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='" + attributeName + "']"));
           // Loop through the radio buttons to find the one with the given id attribute
            for (WebElement radioButton : radioButtons) {
                if(radioButton.getAttribute("id").equals(idAttribute)){
                    radioButton.click();
                    boolean isSelected=radioButton.isSelected();
                        System.out.println("Verification " + isSelected);
                    }


            }
        }


    }

