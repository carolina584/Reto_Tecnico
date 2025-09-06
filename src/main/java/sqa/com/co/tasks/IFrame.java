package sqa.com.co.tasks;

import sqa.com.co.exceptions.ExceptionDate;
import sqa.com.co.userinterfaces.CalendarPage;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IFrame implements Task {

    @Step("{0} visualize iframe calendar")
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
        WebElementState iframeElement = actor.asksFor(WebElementQuestion.valueOf(CalendarPage.IFRAME_DATEPICKER));
        actor.attemptsTo(
                Switch.toFrame((WebElement) iframeElement));
    }catch (Exception e){
            throw new ExceptionDate(ExceptionDate.ELEMENT_MESSAGE, e);
        }
    }
    public static IFrame calendar() {
        return instrumented(IFrame.class);
    }
}