package co.com.utest.project.tasks;

import co.com.utest.project.models.DeviceInfoData;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static co.com.utest.project.ui.DeviceInfoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@Slf4j
public class FillDeviceInfo implements Task {
    private final DeviceInfoData info;

    public FillDeviceInfo(DeviceInfoData info) {
        this.info = info;
    }

    @Override
    @Step("{0} fills in device information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(YOUR_MOBILE_DEVICE_DROPDOWN),
                Enter.theValue(info.getMobileDevice()).into(YOUR_MOBILE_DEVICE_INPUT),
                WaitUntil.the(YOUR_MOBILE_DEVICE_OPTION.of(info.getMobileDevice()), isVisible()).forNoMoreThan(5).seconds(),
                Click.on(YOUR_MOBILE_DEVICE_OPTION.of(info.getMobileDevice())),
                Click.on(MODEL_DROPDOWN),
                Enter.theValue(info.getModel()).into(MODEL_INPUT),
                Click.on(MODEL_OPTION),
                Click.on(OS_DROPDOWN),
                Enter.theValue(info.getOperatingSystem()).into(OS_INPUT),
                WaitUntil.the(OS_OPTION.of(info.getOperatingSystem()), isVisible()).forNoMoreThan(5).seconds(),
                Click.on(OS_OPTION.of(info.getOperatingSystem())),
                Click.on(NEXT_LAST_STEP_BUTTON)
        );
    }

    public static FillDeviceInfo with(DeviceInfoData info) {
        return instrumented(FillDeviceInfo.class, info);
    }
}
