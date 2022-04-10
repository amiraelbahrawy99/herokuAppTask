## Heroku App - Automation Task

#### Goal
Writing End-to-End automation test for HerokuApp login Page

### Prerequisites

* JDK 1.8 or later
* IDE (IntelliJ OR Eclipse)


## Built With
* [Java] 
* [Selenium WebDriver] 
* [Maven]
* [TestNG] 
* [Cucumber]
* [Extent Report]
* [Allure Report]

## Project Design:
* Page Object Model (POM) design pattern
* Behavior Driven Development framework
* Data Driven Development


### Running the tests

* ( testng.xml ) can be found in the root path of the project & pass the browserType parameter
* ( Command Line ):
     mvn clean test -Dbrowser={browserType}

### Report:
* You can check Extenet Report at: "test-output/SparkReport/Spark.html" in the root path of the project
* To generate Allure Report:
- Open cmd 
- Change Directory to be in the root folder of the project "cd path"
- Run this command:  allure serve allure-results

## Author
* **Amira El-Bahrawy** - (https://www.linkedin.com/in/amiraelbahrawy99/)

## Notes
* Import the project as Maven Project

