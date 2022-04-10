package utilities;

import org.openqa.selenium.By;
import utilities.actions.ElementActions;
import org.testng.Assert;

public class Assertions extends ElementActions {

    public void assertElementText(By locator, String text) {
        String elementText;
        elementText = getElement(locator).getText();
        Assert.assertEquals(elementText, text);
    }

    public void assertURLText(String expectedURL) {
        String actualURL;
        actualURL = getDriver().getCurrentUrl();
        Assert.assertTrue(actualURL.contains(expectedURL));
    }

}
