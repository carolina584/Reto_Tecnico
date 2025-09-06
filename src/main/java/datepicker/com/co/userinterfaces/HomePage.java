package datepicker.com.co.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://jqueryui.com/datepicker/")
public class HomePage extends PageObject {

    public static final Target DATE_INPUT_FIELD = Target
            .the("date input field")
            .located(By.xpath("//input[@id='datepicker']"));

    public static final Target DATE_INPUT_FIELD_VALIDATE = Target.the("date input field")
            .located(By.id("datepicker")); // o el selector correcto

    public static Target day(String day) {
        return Target
                .the("day " + day + " from the calendar")
                .located(By.xpath("//a[text()='" + day + "']"));
    }
}
