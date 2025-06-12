package org.example.stepdefinition.hook;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.example.hook.OpenWeb;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.example.utils.Constans.TIME_SHORT;
import static org.example.utils.Constans.TITLE;
import static org.example.utils.Time.waiting;

public class Hook {
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} abre el sitio web de pruebas")
    public void abreElSitioWebDePruebas(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
                OpenWeb.browserURL()
        );
        waiting(TIME_SHORT);
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                TheWebPage.title(),
                Matchers.containsString(TITLE)
        ));
    }
}
