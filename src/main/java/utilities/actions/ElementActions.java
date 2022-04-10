package utilities.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class ElementActions extends TestBase {

    public WebElement getElement(By locator){
        WebElement element = getDriver().findElement(locator);
        return element;
    }

}
