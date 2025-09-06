package datepicker.com.co.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CalendarPage {

    public static final By IFRAME_DATEPICKER_BY = By.className("demo-frame");

    public static final Target IFRAME_DATEPICKER = Target
            .the("iframe datepicker")
            .located(IFRAME_DATEPICKER_BY);
    public static final Target NEXT_MONTH_BUTTON = Target.the("Next month button").located(By.xpath("//span[text()='Next']"));

    public static final Target DAY_LOCATOR = Target.the("Day")
            .located(By.xpath("//a[text()='10']"));
}
