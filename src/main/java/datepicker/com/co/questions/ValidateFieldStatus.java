package datepicker.com.co.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import static datepicker.com.co.userinterfaces.HomePage.DATE_INPUT_FIELD_VALIDATE;

public class ValidateFieldStatus implements Question<Boolean> {

    @Step("{0} validate field status")
    @Override
    public Boolean answeredBy(Actor actor) {
        WebElement dateField = (WebElement) actor.asksFor(WebElementQuestion.valueOf(DATE_INPUT_FIELD_VALIDATE));
        boolean isDisabled = dateField.getAttribute("disabled") != "";
        boolean isReadOnly = dateField.getAttribute("readonly") != "";
        return isDisabled || isReadOnly;
    }

    public static ValidateFieldStatus isReadOnly() {
        return new ValidateFieldStatus();
    }
}
