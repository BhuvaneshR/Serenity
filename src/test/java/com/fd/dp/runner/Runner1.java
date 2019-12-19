package com.fd.dp.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(monochrome=true,
plugin ={"com.fd.dp.runner.SerenityCucumberForker"},
features="src/test/resources/features",
glue="com.fd.dp.stepdef",
strict=true,
tags="@Exports") 
public class Runner1 {

}

