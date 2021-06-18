package com.google.translate.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class GoogleAppsComponent {
    public static final Target GOOGLE_APPS = Target.the("Google apps Button").located(By.xpath("//div[@id =\"gbwa\"]"));
    //public static final Target GOOGLE_TRANSLATE = Target.the("Google translate").locatedBy("https://translate.google.com.co/?hl=es&tab=rT");
    public final String GOOGLE_TRANSLATE = "https://translate.google.com.co/?hl=es&tab=rT";

}
