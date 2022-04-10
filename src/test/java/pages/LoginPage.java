package pages;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import readers.JsonTestDataReader;
import utilities.Assertions;
import utilities.Paths;
import utilities.actions.ElementActions;

public class LoginPage extends ElementActions {
    JSONObject usersData = (JSONObject) JsonTestDataReader.parseJson(Paths.userCredentialsPath);
    Assertions assertions = new Assertions();
    String herokuAppURL = "https://the-internet.herokuapp.com/login";
    //---------------------------------Locators-------------------------------------------------//
    By loginPageTitle = By.xpath("//h2[normalize-space()='Login Page']");
    By loginPageInstructionsField = By.className("subheader");
    By usernameLabel = By.xpath("//label[normalize-space()='Username']");
    By usernameTextBox = By.id("username");
    By passwordLabel = By.xpath("//label[normalize-space()='Password']");
    By passwordTextBox = By.id("password");
    By loginButton = By.className("radius");
    By flashErrorMessage = By.id("flash");

    //---------------------------------Strings-------------------------------------------------//
    String loginPageTitleText = "Login Page";
    String loginPageInstructionsText = "This is where you can log into the secure area." +
            " Enter tomsmith for the username and SuperSecretPassword! for the password. " +
            "If the information is wrong you should see error messages.";
    String usernameText = "Username";
    String passwordText = "Password";
    String loginButtonText = "Login";
    String invalidUsernameErrorMessageText = "Your username is invalid!\n" +
            "×";
    String invalidPasswordErrorMessageText = "Your password is invalid!\n" +
            "×";

    //---------------------------------Actions-------------------------------------------------//
    public void openHerokuAppLoginPage() {
        getDriver().navigate().to(herokuAppURL);
    }

    public void enterUsername(String username) {
        String usernameValue = usersData.get(username).toString();
        getElement(usernameTextBox).sendKeys(usernameValue);
    }

    public void enterPassword(String password) {
        String passwordValue = usersData.get(password).toString();
        getElement(passwordTextBox).sendKeys(passwordValue);
    }

    public void clickOnLogin() {
        getElement(loginButton).click();
    }

    public void userLoginWithValidData(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickOnLogin();
    }

    //---------------------------------Assertions-------------------------------------------------//
    public void assertLoginPageTitleText() {
        assertions.assertElementText(loginPageTitle, loginPageTitleText);
    }

    public void assertInstructionsText() {
        assertions.assertElementText(loginPageInstructionsField, loginPageInstructionsText);
    }


    public void assertUsernameLabelText() {
        assertions.assertElementText(usernameLabel, usernameText);
    }


    public void assertPasswordLabelText() {
        assertions.assertElementText(passwordLabel, passwordText);
    }

    public void assertLoginButtonText() {
        assertions.assertElementText(loginButton, loginButtonText);
    }

    public void assertInvalidUsernameErrorMessage() {
        assertions.assertElementText(flashErrorMessage, invalidUsernameErrorMessageText);
    }


    public void assertInvalidPasswordErrorMessage() {
        assertions.assertElementText(flashErrorMessage, invalidPasswordErrorMessageText);
    }


}
