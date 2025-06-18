package co.com.utest.project.hook;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;

import static co.com.utest.project.utils.Constants.WEB_URL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenUtest implements Task {

    private EnvironmentVariables environmentVariables;

    @Override
    @Step("{0} opens the browser")
    public <T extends Actor> void performAs(T actor) {
        String pathWebUrl = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(WEB_URL);
        actor.attemptsTo(Open.url(pathWebUrl));
    }

    public static Performable browserURL(String webURL) {
        return instrumented(OpenUtest.class, webURL);
    }

}
