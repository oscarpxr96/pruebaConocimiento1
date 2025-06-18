package org.example.stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.example.questions.ValidateElementsTestBtn;
import org.example.tasks.ChooseRandomTask;
import org.example.tasks.FuntionsElementsTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.example.utils.Constans.ACTOR;
import static org.example.utils.Constans.REMEMBER_TEXT_BTN_SUB_ELEMENTS;
import static org.example.utils.DataFaker.fakerNumberOneAndNine;
@Slf4j
public class OpenWebStepDefinition {
    @Before
    public void setTheStage() {OnStage.setTheStage(new OnlineCast());}

    @And("desea validar la funcion de la carta de elementos")
    public void deseaValidarLaFuncionDeLaCartaDeElementos() {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                FuntionsElementsTask.choose()
        );

    }

    @When("selecciona aleatoriamente alguna de las subfunciones")
    public void seleccionaAleatoriamenteAlgunaDeLasSubfunciones() {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                ChooseRandomTask.witchParams(fakerNumberOneAndNine())
        );

    }
    @Then("visualiraza en la cabecera el nombre de la opcion elegida")
    public void visualirazaEnLaCabeceraElNombreDeLaOpcionElegida() {
        String validateText = OnStage.theActor(ACTOR).recall(REMEMBER_TEXT_BTN_SUB_ELEMENTS);
        if (validateText != null){
            log.info(validateText);
        }
        theActorInTheSpotlight().should(seeThat(
                ValidateElementsTestBtn.withParams(validateText))
        );

    }

}
