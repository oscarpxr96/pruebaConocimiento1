package org.example.stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class OpenWebStepDefinition {
    @Before
    public void setTheStage() {OnStage.setTheStage(new OnlineCast());}

    @And("desea validar la funcion de la carta de elementos")
    public void deseaValidarLaFuncionDeLaCartaDeElementos() {

    }

    @When("selecciona aleatoriamente alguna de las subfunciones")
    public void seleccionaAleatoriamenteAlgunaDeLasSubfunciones() {

    }
    @Then("visualiraza en la cabecera el nombre de la opcion elegida")
    public void visualirazaEnLaCabeceraElNombreDeLaOpcionElegida(String string) {

    }

}
