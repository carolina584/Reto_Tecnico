package sqa.com.co.questions;

import sqa.com.co.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.questions.Value;
import net.thucydides.core.annotations.Step;

public class TheSelectDate implements Question<String> {
    @Step("{0} the select date")
    @Override
    public String answeredBy(Actor actor) {

        String data = Value.of(HomePage.DATE_INPUT_FIELD).viewedBy(actor).asString();
        actor.attemptsTo(
                Switch.toDefaultContext()
        );
        return data;
    }

    public static Question<String> visualize(){
        return new TheSelectDate();
    }
}
