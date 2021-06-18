package com.google.translate.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoogleTranslatePage {

    public static final Target SOURCE_LANGUAGE_OPTION = Target.the("Source language button").located(By.xpath("(//div[@class=\"akczyd\"]/button[@jscontroller=\"soHxf\"])[1]"));
    public static final Target TARGET_LANGUAGE_OPTION  = Target.the("Target language button").located(By.xpath("(//div[@class=\"akczyd\"]/button[@jscontroller=\"soHxf\"])[2]"));
    public static final Target SOURCE_LANGUAGE = Target.the("Source language").locatedBy("(//div[@data-language-code= \"en\"])[1]");
    public static final Target TARGET_LANGUAGE  = Target.the("Target language").locatedBy("(//div[@data-language-code= \"es\"])[2]");
    public static final Target SOURCE_LANGUAGE_TEXTAREA = Target.the("Source language textarea").located(By.tagName("textarea"));
    public static final Target TARGET_LANGUAGE_RESULT = Target.the("Target language result area").located(By.className("J0lOec"));
}
