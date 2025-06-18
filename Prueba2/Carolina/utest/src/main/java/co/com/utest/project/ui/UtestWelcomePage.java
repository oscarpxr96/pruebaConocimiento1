package co.com.utest.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestWelcomePage extends PageObject {
    public static final Target WELCOME_TITTLE = Target.the("Welcome tittle")
            .locatedBy("//h1[contains(text(), 'Welcome to the world')]");
}
