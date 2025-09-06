package datepicker.com.co.tasks;

import datepicker.com.co.userinterfaces.CalendarPage;
import datepicker.com.co.userinterfaces.HomePage;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

public class BookAppointment implements Task {

    private final String day;

    public BookAppointment(String day) {
        this.day = day;
    }

    @Step("{0} book appointment")
    @Override
    public <T extends Actor> void performAs(T actor) {

        WebElementState iframeElement = actor.asksFor(WebElementQuestion.valueOf(CalendarPage.IFRAME_DATEPICKER));
        actor.attemptsTo(
                Switch.toFrame((WebElement) iframeElement),
                Click.on(HomePage.DATE_INPUT_FIELD),
                Click.on(HomePage.day(day)));
    }

    public static BookAppointment inDate(String day) {
        return Tasks.instrumented(BookAppointment.class, day);
    }
}
