package datepicker.com.co.tasks;

import datepicker.com.co.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Goto implements Task {

    @Step("{0} go to page")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(HomePage.class));
    }
    public static Goto page(){
        return instrumented(Goto.class);
    }
}
