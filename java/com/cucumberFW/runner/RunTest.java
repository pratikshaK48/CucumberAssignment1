package com.cucumberFW.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "",
        plugin = {"pretty", // to generate reports
                "html:target/cucumber-report.html",
                "json:target/cucumber-json-report.json",}


)

public class RunTest {


}
