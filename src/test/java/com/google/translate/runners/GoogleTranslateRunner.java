package com.google.translate.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/google_translate.feature",
        glue = "com.google.translate.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class GoogleTranslateRunner {
}
