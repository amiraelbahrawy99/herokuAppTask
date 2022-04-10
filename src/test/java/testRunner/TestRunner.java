package testRunner;

import io.cucumber.testng.CucumberOptions;
import utilities.TestBase;

@CucumberOptions(features = "src/test/java/features/LoginPage.feature"
        , glue = {"stepDefinition"}
        , tags = ("@login")
        , plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        ,monochrome = false)

public class TestRunner extends TestBase {


}
