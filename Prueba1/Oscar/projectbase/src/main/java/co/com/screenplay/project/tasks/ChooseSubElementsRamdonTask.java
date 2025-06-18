package co.com.screenplay.project.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Step;

import static co.com.screenplay.project.ui.Home.BTN_ELEMENTS;
import static co.com.screenplay.project.ui.Home.BTN_LIST_ELEMENTS;
import static co.com.screenplay.project.utils.Constants.REMEMBER_TEXT_BTN_SUB_ELEMENTS;

@AllArgsConstructor

public class ChooseSubElementsRamdonTask implements Task {

    private String numberRamdonBtn;

    @Override
    @Step("{0} Selecciona aleatoriamente la posicion #numberRandomBtn de la sub funcion de elementos")
    public <T extends Actor> void performAs(T actor) {
        String number = numberRamdonBtn;
        actor.attemptsTo(Scroll.to(BTN_ELEMENTS),
                Click.on(BTN_LIST_ELEMENTS.of(number))
        );

        String textBtn = BTN_LIST_ELEMENTS.of(
                number).resolveFor(actor).getText();

        actor.remember(REMEMBER_TEXT_BTN_SUB_ELEMENTS, textBtn);
    }

    public static ChooseSubElementsRamdonTask witchParams(String numberRamdonBtn) {
        return Tasks.instrumented(ChooseSubElementsRamdonTask.class, numberRamdonBtn);
    }
}
