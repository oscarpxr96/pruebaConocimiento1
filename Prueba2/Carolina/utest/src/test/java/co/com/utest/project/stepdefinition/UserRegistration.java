package co.com.utest.project.stepdefinition;

import co.com.utest.project.models.DeviceInfoData;
import co.com.utest.project.models.LocationInfoData;
import co.com.utest.project.models.PassData;
import co.com.utest.project.models.PersonalInfoData;
import co.com.utest.project.tasks.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;
import lombok.extern.slf4j.Slf4j;

import static co.com.utest.project.utils.Constants.ACTOR;

@Slf4j
public class UserRegistration {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    PersonalInfoData info = new PersonalInfoData(
            "Catalina", "Gonzalez", "cata.gonz@mailinator.com", "March", "10", "1990"
    );

    LocationInfoData location = new LocationInfoData(
            "Cali, Valle del Cauca, Colombia", "760013", "Colombia"
    );

    DeviceInfoData device = new DeviceInfoData(
            "Samsung", "Omnia 2", "Windows Phone 6.5"
    );

    PassData pass = new PassData(
            "Test1234@1234+"
    );

    @When("diligencia la informacion personal")
    public void fillOutPersonalInfo() {

        OnStage.theActorCalled(ACTOR).attemptsTo(
                ClickJoinToday.now(),
                FillPersonalInfo.with(info)
        );

    }

    @And("verifica si diligencia o no la informacion de ubicacion")
    public void verifyIfFillOutOrNotLocationInfo() {

        OnStage.theActorCalled(ACTOR).attemptsTo(
                FillLocationInfo.with(location)
        );

    }

    @And("diligencia la informacion de los dispositivos a usar")
    public void fillOutDeviceInfo() {

        OnStage.theActorCalled(ACTOR).attemptsTo(
                FillDeviceInfo.with(device)
        );

    }

    @And("crea la contraseña")
    public void createPassword() {

        OnStage.theActorCalled(ACTOR).attemptsTo(
                FillPassInfo.with(pass)
        );

    }

    @Then("se redirigira a la pagina de bienvenida")
    public void goToHomePage() {

        OnStage.theActorCalled(ACTOR).attemptsTo(
                VerifyHomePage.with()
        );

    }
}
