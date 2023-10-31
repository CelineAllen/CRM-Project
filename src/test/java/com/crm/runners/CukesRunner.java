package com.crm.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "pretty",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"},

        features = "src/test/resources/features/",
        glue = "com/crm/step_definitions",
        dryRun = false,
        tags = ""
        //publish = true
)
public class CukesRunner {}
