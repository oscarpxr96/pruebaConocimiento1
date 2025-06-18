package co.com.utest.project.tasks;

import co.com.utest.project.models.PersonalInfoData;
import co.com.utest.project.ui.PersonalInfoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillPersonalInfo implements Task {

    private final PersonalInfoData info;

    public FillPersonalInfo(PersonalInfoData info) {
        this.info = info;
    }

    @Override
    @Step("{0} fills in personal information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(info.getFirstName()).into(PersonalInfoPage.FIRST_NAME),
                Enter.theValue(info.getLastName()).into(PersonalInfoPage.LAST_NAME),
                Enter.theValue(info.getEmail()).into(PersonalInfoPage.EMAIL),
                SelectFromOptions.byVisibleText(info.getBirthMonth()).from(PersonalInfoPage.BIRTH_MONTH),
                SelectFromOptions.byVisibleText(info.getBirthDay()).from(PersonalInfoPage.BIRTH_DAY),
                SelectFromOptions.byVisibleText(info.getBirthYear()).from(PersonalInfoPage.BIRTH_YEAR),
                Click.on(PersonalInfoPage.NEXT_LOCATION_BUTTON)
        );
    }

    public static FillPersonalInfo with(PersonalInfoData info) {
        return instrumented(FillPersonalInfo.class, info);
    }

}
