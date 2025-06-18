package co.com.utest.project.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DeviceInfoPage extends PageObject {

    public static final Target MODEL_DROPDOWN = Target.the("Model dropdown")
            .located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/div[1]/span"));

    public static final Target MODEL_INPUT = Target.the("Model input")
            .locatedBy("//*[@id='mobile-device']/div[2]/div[2]/div/input");

    public static final Target MODEL_OPTION = Target.the("Model option")
            .locatedBy("//*[@id='ui-select-choices-row-4-0']/span");

    public static final Target OS_DROPDOWN = Target.the("OS dropdown")
            .located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]/span"));

    public static final Target OS_INPUT = Target.the("OS input")
            .locatedBy("//*[@id='mobile-device']/div[3]/div[2]/div/input");

    public static final Target OS_OPTION = Target.the("OS option")
            .locatedBy("//*[@id='ui-select-choices-row-5-0']/span");

    public static final Target NEXT_LAST_STEP_BUTTON = Target.the("Next: Last Step button")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/button"));

    public static final Target YOUR_MOBILE_DEVICE_DROPDOWN = Target.the("Your Mobile Device dropdown")
            .located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/div[1]/span"));

    public static final Target YOUR_MOBILE_DEVICE_INPUT = Target.the("Mobile Device input")
            .locatedBy("//*[@id='mobile-device']/div[1]/div[2]/div/input");

    public static final Target YOUR_MOBILE_DEVICE_OPTION = Target.the("Mobile Device option")
            .locatedBy("//*[@id='ui-select-choices-row-3-0']/span");

}

