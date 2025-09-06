package datepicker.com.co.tasks;

import datepicker.com.co.userinterfaces.CalendarPage;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IFrame implements Task {


    @Step("{0} i frame")
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElementState iframeElement = actor.asksFor(WebElementQuestion.valueOf(CalendarPage.IFRAME_DATEPICKER));
        actor.attemptsTo(
                Switch.toFrame((WebElement) iframeElement));
    }
    public static IFrame page() {
        return instrumented(IFrame.class);
    }
}
