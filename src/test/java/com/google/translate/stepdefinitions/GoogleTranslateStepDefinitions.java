package com.google.translate.stepdefinitions;

import com.google.translate.tasts.GoTo;
import com.google.translate.tasts.OpenTheBrowser;
import com.google.translate.tasts.Translate;
import com.google.translate.userinterfaces.GoogleAppsComponent;
import com.google.translate.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class GoogleTranslateStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver herBrowser;

    private Actor susan = Actor.named("Susan");

    private GoogleHomePage googleHomePage;
    private GoogleAppsComponent the = new GoogleAppsComponent();

    @Before
    public void setUp(){
        susan.can(BrowseTheWeb.with(herBrowser));
    }


    @Given("^that susan wants to translate a word$")
    public void thatSusanWantsToTranslateAWord() throws Exception {
        susan.wasAbleTo(OpenTheBrowser.on(googleHomePage),
                        GoTo.TheApp(the.GOOGLE_TRANSLATE));
    }

    @When("^she translates the word cheese from English to Spanish$")
    public void sheTranslatesTheWordCheeseFromEnglishToSpanish() throws Exception {
        susan.wasAbleTo(Translate.the());
    }

    @Then("^she should see the word queso in the screen$")
    public void sheShouldSeeTheWordQuesoInTheScreen() throws Exception {

    }
}
