package datepicker.com.co.stepsdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import datepicker.com.co.questions.TheSelectDate;
import datepicker.com.co.questions.ValidateFieldStatus;
import datepicker.com.co.tasks.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.equalTo;

public class DatepickerStepDefinition {


    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    private Actor user = Actor.named("Carolina");

    @Before
    public void setUp(){
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that user wants to book an appointment$")
    public void userIsOnTheJQueryDatepickerHomepage() {
        user.wasAbleTo(Goto.page());
    }
    @When("^he selects the (.*)th of the current month$")
    public void userSelectsDayFromTheCalendar(String day) {
        user.attemptsTo(BookAppointment.inDate(day));
    }
    @Then("^should see the selected date in the text field$")
    public void selectedDateShouldAppearInTheTextField() {
        user.should(
                seeThat(TheSelectDate.visualize(), equalTo("09/15/2025")));
    }
    @When("^user selects the date '10' of the next month(.*)$")
    public void userSelectsTheDate10OfTheNextMonth(String mount) {
        user.attemptsTo(BookAppointmentInNextMonth.inDate(mount));
    }
    @Then("^selected date should be displayed in the text field$")
    public void selectedDateShouldBeDisplayedInTheTextField() {
        user.should(
                seeThat(TheSelectDate.visualize(), equalTo("10/10/2025"))
        );
    }
    @When("^try entering a date manually in the text field$")
    public void tryEnteringADateManuallyInTheTextField() {
        user.attemptsTo(IFrame.page());
    }
    @Then("^the field should not allow manual input and be read-only$")
    public void theFieldShouldNotAllowManualInputAndBeReadOnly() {
        user.should(
                seeThat("the date field is read-only", ValidateFieldStatus.isReadOnly(), is(true))
        );
    }
}