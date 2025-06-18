package org.example.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static org.example.ui.HomeUI.BTN_ELEMENTS;
import static org.example.ui.HomeUI.BTN_LIST_ELEMENTS;
import static org.example.utils.Constans.REMEMBER_TEXT_BTN_SUB_ELEMENTS;
import static org.example.utils.DataFaker.fakerNumberOneAndNine;

@AllArgsConstructor
public class ChooseRandomTask implements Task {

    private String numberRandomBtn;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String number = numberRandomBtn;
        actor.attemptsTo(Scroll.to(BTN_ELEMENTS),
                Click.on(BTN_LIST_ELEMENTS.of(number))
        );

        String textBtn = BTN_LIST_ELEMENTS.of(number).resolveFor(actor).getText();
        actor.remember(REMEMBER_TEXT_BTN_SUB_ELEMENTS, textBtn);

    }

    public static ChooseRandomTask witchParams(String numberRandomBtn){
        return Tasks.instrumented(ChooseRandomTask.class,numberRandomBtn);

    }
}
