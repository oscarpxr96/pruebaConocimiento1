package co.com.screenplay.project.hook;


import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;

import static co.com.screenplay.project.utils.Constants.WEB_URL;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class OpenWeb implements Task {

    private EnvironmentVariables environmentVariables;

    private String webUrl;

    public OpenWeb(String webUrl) {
        this.webUrl = webUrl;
    }

    @Override
    @Step("{0} abre el navegador")
    public <T extends Actor> void performAs(T actor) {
        String pathWebUrl = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(WEB_URL);
        actor.attemptsTo(Open.url(pathWebUrl));
    }

    public static Performable browserURL(String webURL) {
        return instrumented(OpenWeb.class,webURL);
    }
}
