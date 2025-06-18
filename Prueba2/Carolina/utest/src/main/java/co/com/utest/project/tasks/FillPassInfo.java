package co.com.utest.project.tasks;

import co.com.utest.project.models.PassData;
import co.com.utest.project.ui.PassPage;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@Slf4j
public class FillPassInfo implements Task {
    private PassData info;

    public FillPassInfo(PassData info) {
        this.info = info;
    }

    @Override
    @Step("{0} completes the registration")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(info.getPassword()).into(PassPage.PASSWORD),
                Enter.theValue(info.getPassword()).into(PassPage.CONFIRM_PASSWORD),
                Click.on(PassPage.STAY_INFORMED_CHECKBOX),
                Click.on(PassPage.TERMS_CHECKBOX),
                Click.on(PassPage.PRIVACY_CHECKBOX),
                Click.on(PassPage.COMPLETE_SETUP_BUTTON)
        );
    }

    public static FillPassInfo with(PassData info) {
        return instrumented(FillPassInfo.class, info);
    }

}
