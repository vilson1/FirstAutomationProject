package tests.day_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;

public class TC3 {
    @Test
    public void tc3(){
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler")).click();
        WebElement smallCircle=Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle=Driver.getDriver().findElement(By.id("droptarget"));
        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(smallCircle,bigCircle).perform();
    }
}
