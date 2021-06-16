package com.usa.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/generated-test-sources.html",
        features = "src/test/resources/features",
        glue = "com/usa/stepdefinitions",
        dryRun = false,
        tags = "@AmazonCreateAccount"
)
public class Runner {

// Esmira Alperen
// Esra
    //Sibel 10:53
	//Emine :)
   //Emine :))))
    //Sibel 10:58
}
