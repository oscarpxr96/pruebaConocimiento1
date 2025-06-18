package co.com.utest.project.tasks;

import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static co.com.utest.project.ui.UtestWelcomePage.WELCOME_TITTLE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@Slf4j
public class VerifyHomePage implements Task {

    @Override
    @Step("{0} verify if the registration completes on Welcome Page")
    public <T extends Actor> void performAs(T actor) {
        WebDriverWait wait = new WebDriverWait(Serenity.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(text(), 'Welcome to the world')]")));
        wait.until(ExpectedConditions.visibilityOf(WELCOME_TITTLE.resolveFor(actor)));

        String actualTitleText = WELCOME_TITTLE.resolveFor(actor).getText();
        if (actualTitleText.equals("Welcome to the world's largest community of freelance software testers!")) {
            log.info("El registro ha sido exitoso porque está en el home" + actualTitleText);
        } else {
            log.warn("El registro ha fallado no se encuentra en el home porque aparece el título:" + actualTitleText);
        }
    }

    public static VerifyHomePage with() {
        return instrumented(VerifyHomePage.class);
    }
}
