package org.example.questions;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.example.ui.HomeUI.TXT_RANDOM_NAME_BTN;

@AllArgsConstructor
@Slf4j
public class ValidateElementsTestBtn implements Question<Boolean> {
    private String validateTextSubElementBtn;

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String validTextBtnHeader = TXT_RANDOM_NAME_BTN.resolveFor(actor).getText();
        if (validTextBtnHeader != null && validateTextSubElementBtn.equals(validTextBtnHeader)){
            log.info(validTextBtnHeader);
            result = true;
        } else {
            result = false;
        }
        return result;
    }
    public static ValidateElementsTestBtn withParams(String validateTextSubElementBtn){
        return new ValidateElementsTestBtn(validateTextSubElementBtn);
    }
}
