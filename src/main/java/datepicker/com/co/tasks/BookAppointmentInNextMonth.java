package datepicker.com.co.tasks;

import datepicker.com.co.userinterfaces.CalendarPage;
import datepicker.com.co.userinterfaces.HomePage;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import static datepicker.com.co.userinterfaces.CalendarPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BookAppointmentInNextMonth implements Task {

    private final String day;

    public BookAppointmentInNextMonth(String day) {
        this.day = day;
    }

    @Step("{0} book appointment in next month")
    @Override
    public <T extends Actor> void performAs(T actor) {

        WebElementState iframeElement = actor.asksFor(WebElementQuestion.valueOf(CalendarPage.IFRAME_DATEPICKER));
        actor.attemptsTo(
                Switch.toFrame((WebElement) iframeElement),
                Click.on(HomePage.DATE_INPUT_FIELD)
        );
        actor.attemptsTo(Click.on(NEXT_MONTH_BUTTON),
                Click.on(DAY_LOCATOR));
    }

    public static BookAppointmentInNextMonth inDate(String day) {
        return instrumented(BookAppointmentInNextMonth.class, day);
    }
}
