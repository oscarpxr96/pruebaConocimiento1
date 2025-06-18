package co.com.utest.project.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LocationInfoPage extends PageObject {

    public static final Target CITY_INPUT_DYNAMIC = Target.the("")
            .located(By.xpath("//div[@class='wrapper']//input[@readonly]")
            );

    public static final Target CITY_INPUT = Target.the("City input field")
            .located(By.xpath("//*[@id='city']/ngf-single-select/ngf-autocomplete-input/ngf-input-container/div/div[2]/input")
            );

    public static final Target CITY_OPTION = Target.the("City selection option")
            .locatedBy("//*[@id='cdk-overlay-0']/ngf-options-container/ngf-option/div");


    public static final Target CLEAR_CITY_BUTTON = Target.the("Boton para deseleccionar la ciudad")
            .located(By.xpath("//*[@id='city']/ngf-single-select/ngf-autocomplete-input/ngf-input-container/div/div[2]/button/mat-icon"));


    public static final Target COUNTRY = Target.the("Country dropdown")
            .located(By.xpath("//select[@aria-label='Country']")
            );

    public static final Target COUNTRY_INPUT = Target.the("Country input field")
            .locatedBy("//*[@id='countryId']/option[contains(text(),'{0}')]"
            );

    public static final Target NEXT_DEVICES_BUTTON = Target.the("Next: Devices button")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/div/button")
            );

    public static final Target ZIP = Target.the("Field Zip")
            .located(By.xpath("//*[@id='zip']")
            );
}
