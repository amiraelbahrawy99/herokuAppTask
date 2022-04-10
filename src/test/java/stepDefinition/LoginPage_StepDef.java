package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.SecurePage;

public class LoginPage_StepDef extends LoginPage {

    SecurePage securePage = new SecurePage();

    @Given("User navigates to herokuApp LoginPage")
    public void user_navigates_to_heroku_app_login_page() {
        openHerokuAppLoginPage();
    }

    @Then("User should see loginPageTitle has the correct text")
    public void user_should_see_login_page_title_has_the_correct_text() {
        assertLoginPageTitleText();
    }

    @Then("User should see instructionsField has the correct text")
    public void user_should_see_instructions_field_has_the_correct_text() {
        assertInstructionsText();
    }

    @Then("User should see username Label has the correct text")
    public void user_should_see_username_label_has_the_correct_text() {
        assertUsernameLabelText();
    }

    @Then("User should see password Label has the correct text")
    public void user_should_see_password_label_has_the_correct_text() {
        assertPasswordLabelText();
    }

    @Then("User should see login button has the correct text")
    public void user_should_see_login_button_has_the_correct_text() {
        assertLoginButtonText();
    }

    @When("User login with valid {string} and {string}")
    public void user_login_with_valid_and(String username, String password) {
        userLoginWithValidData(username, password);
    }

    @Then("User will be redirected to the secured area")
    public void user_will_be_redirected_to_the_secured_area() {
        securePage.assertURL();
    }


    @When("User types invalid {string} in username textBox")
    public void user_types_invalid_in_username_text_box(String invalidUsername) {
        enterUsername(invalidUsername);
    }

    @When("User types valid {string} in password textBox")
    public void user_types_valid_in_password_text_box(String validPassword) {
        enterPassword(validPassword);
    }

    @When("User clicks on Login button")
    public void user_clicks_on_login_button() {
        clickOnLogin();
    }

    @Then("Invalid username error message will appear")
    public void invalid_username_error_message_will_appear() {
        assertInvalidUsernameErrorMessage();
    }


    @When("User types valid {string} in username textBox")
    public void user_types_valid_in_username_text_box(String validUsername) {
        enterUsername(validUsername);
    }

    @When("User types invalid {string} in password textBox")
    public void user_types_invalid_in_password_text_box(String invalidPassword) {
        enterPassword(invalidPassword);
    }

    @Then("Invalid password error message will appear")
    public void invalid_password_error_message_will_appear() {
        assertInvalidPasswordErrorMessage();
    }


}
