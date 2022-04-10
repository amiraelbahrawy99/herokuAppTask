package pages;

import utilities.Assertions;
import utilities.actions.ElementActions;

public class SecurePage extends ElementActions {
    Assertions assertions = new Assertions();
    String secureAreaURL = "https://the-internet.herokuapp.com/secure";

    //---------------------------------Assertions-------------------------------------------------//
    public void assertURL() {
        assertions.assertURLText(secureAreaURL);
    }


}
