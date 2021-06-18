package com.google.translate.tasts;

import com.google.translate.userinterfaces.GoogleAppsComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoTo implements Task {

    private String UrlGoogleApp;

    public GoTo(String UrlGoogleApp){
        this.UrlGoogleApp=UrlGoogleApp;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_APPS),
                         Open.url(UrlGoogleApp));
    }

    public static GoTo TheApp(String UrlGoogleApp) {
        return instrumented(GoTo.class, UrlGoogleApp);
    }

}
