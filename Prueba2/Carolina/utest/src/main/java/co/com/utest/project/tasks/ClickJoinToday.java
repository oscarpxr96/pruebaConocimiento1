package co.com.utest.project.tasks;

import co.com.utest.project.ui.UtestHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickJoinToday implements Task {

    @Override
    @Step("{0} clicks on the Join Today button")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestHomePage.COOKIES),
                Click.on(UtestHomePage.JOIN_TODAY_BUTTON)
        );
    }

    public static ClickJoinToday now() {
        return instrumented(ClickJoinToday.class);
    }
}
