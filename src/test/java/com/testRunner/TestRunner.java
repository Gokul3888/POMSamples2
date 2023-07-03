package com.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="orangelogin",glue={"StepDefinition"},monochrome = false,tags="")
public class TestRunner {

}
