package co.com.utest.project.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PassPage extends PageObject {

    public static final Target CONFIRM_PASSWORD = Target.the("Confirm password field")
            .located(By.id("confirmPassword"));

    public static final Target COMPLETE_SETUP_BUTTON = Target.the("Complete Setup button")
            .located(By.id("laddaBtn"));

    public static final Target PASSWORD = Target.the("Password field")
            .located(By.id("password"));

    public static final Target PRIVACY_CHECKBOX = Target.the("Privacy & Security Policy checkbox")
            .located(By.id("privacySetting"));

    public static final Target STAY_INFORMED_CHECKBOX = Target.the("Stay informed checkbox")
            .located(By.name("newsletterOptIn"));

    public static final Target TERMS_CHECKBOX = Target.the("Terms of Use checkbox")
            .located(By.id("termOfUse"));

}
