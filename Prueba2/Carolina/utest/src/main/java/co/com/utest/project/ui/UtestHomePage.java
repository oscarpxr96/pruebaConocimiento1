package co.com.utest.project.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestHomePage extends PageObject {

    public static final Target COOKIES = Target.the("Boton Aceptar Cookies")
            .located(By.xpath("//*[@id='onetrust-accept-btn-handler']"));

    public static final Target JOIN_TODAY_BUTTON = Target.the("Join Now")
            .located(By.className("unauthenticated-nav-bar__sign-up"));

}
