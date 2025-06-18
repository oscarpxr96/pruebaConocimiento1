package co.com.utest.project.ui;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalInfoPage extends PageObject {

    public static final Target BIRTH_DAY = Target.the("Birth day dropdown")
            .located(By.id("birthDay"));

    public static final Target BIRTH_MONTH = Target.the("Birth Month dropdown")
            .located(By.id("birthMonth"));

    public static final Target BIRTH_YEAR = Target.the("Birth year dropdown")
            .located(By.id("birthYear"));

    public static final Target EMAIL = Target.the("Email field")
            .located(By.id("email"));

    public static final Target FIRST_NAME = Target.the("First name field")
            .located(By.id("firstName"));

    public static final Target LAST_NAME = Target.the("Last name field")
            .located(By.id("lastName"));

    public static final Target NEXT_LOCATION_BUTTON = Target.the("Next: Location button")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/button"));

}
