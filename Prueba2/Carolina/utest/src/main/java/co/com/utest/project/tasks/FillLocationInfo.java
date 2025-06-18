package co.com.utest.project.tasks;

import co.com.utest.project.models.LocationInfoData;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

import static co.com.utest.project.ui.LocationInfoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@Slf4j
public class FillLocationInfo implements Task {
    private final LocationInfoData info;


    public FillLocationInfo(LocationInfoData info) {
        this.info = info;
    }
    @Override
    @Step("{0} fills in location information")
    public <T extends Actor> void performAs(T actor) {
        String countryName = info.getCountry();
        WebDriverWait wait = new WebDriverWait(Serenity.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(CITY_INPUT_DYNAMIC.resolveFor(actor)));
        wait.until(ExpectedConditions.attributeToBeNotEmpty(CITY_INPUT_DYNAMIC.resolveFor(actor), "value"));

        actor.attemptsTo(
                Click.on(CLEAR_CITY_BUTTON),
                Enter.theValue(info.getCity()).into(CITY_INPUT),
                WaitUntil.the(CITY_OPTION.of(info.getCity()), isVisible()).forNoMoreThan(5).seconds(),
                Click.on(CITY_OPTION.of(info.getCity())),
                Enter.theValue(info.getZip()).into(ZIP),
                Click.on(COUNTRY),
                Click.on(COUNTRY_INPUT.of(countryName)),
                WaitUntil.the(NEXT_DEVICES_BUTTON, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(NEXT_DEVICES_BUTTON)
        );

    }

    public static FillLocationInfo with(LocationInfoData info) {
        return instrumented(FillLocationInfo.class, info);
    }
}
