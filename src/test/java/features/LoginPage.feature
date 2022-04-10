@login
Feature:Login Page
  As a user, I want guidance to fill the login form, so that I can enter valid data.

  Scenario: GC01|| Check text of elements that are displayed in login Page
    Given User navigates to herokuApp LoginPage
    Then  User should see loginPageTitle has the correct text
    And   User should see instructionsField has the correct text
    And   User should see username Label has the correct text
    And   User should see password Label has the correct text
    And   User should see login button has the correct text

  Scenario Outline: GC02|| Check that user will be redirected to Secure Area when he enters valid credentials
    Given User navigates to herokuApp LoginPage
    When  User login with valid "<username>" and "<password>"
    Then  User will be redirected to the secured area
    Examples:
      | username      | password      |
      | validUsername | validPassword |

  Scenario Outline: BC03|| Check that user will see an error message if he enters invalid username
    Given User navigates to herokuApp LoginPage
    When  User types invalid "<username>" in username textBox
    And   User types valid "<password>" in password textBox
    And   User clicks on Login button
    Then  Invalid username error message will appear
    Examples:
      | username        | password      |
      | invalidUsername | validPassword |

  Scenario Outline: BC04|| Check that user will see an error message if he enters invalid password
    Given User navigates to herokuApp LoginPage
    When  User types valid "<username>" in username textBox
    And   User types invalid "<password>" in password textBox
    And   User clicks on Login button
    Then  Invalid password error message will appear
    Examples:
      | username      | password        |
      | validUsername | invalidPassword |

  Scenario Outline: BC05|| Check that user will see an error message if he enters invalid username and password
    Given User navigates to herokuApp LoginPage
    When  User types invalid "<username>" in username textBox
    And   User types invalid "<password>" in password textBox
    And   User clicks on Login button
    Then  Invalid username error message will appear
    Examples:
      | username        | password        |
      | invalidUsername | invalidPassword |

  Scenario Outline: BC06|| Check that user will see an error message if he leaves username's field blank
    Given User navigates to herokuApp LoginPage
    When  User types valid "<password>" in password textBox
    And   User clicks on Login button
    Then  Invalid username error message will appear
    Examples:
      | password      |
      | validPassword |

  Scenario Outline: BC07|| Check that user will see an error message if he leaves password's field blank
    Given User navigates to herokuApp LoginPage
    When  User types valid "<username>" in username textBox
    And   User clicks on Login button
    Then  Invalid password error message will appear
    Examples:
      | username      |
      | validUsername |


  Scenario: BC08|| Check that user will see an error message if he leaves both username and password fields blank
    Given User navigates to herokuApp LoginPage
    When  User clicks on Login button
    Then  Invalid username error message will appear