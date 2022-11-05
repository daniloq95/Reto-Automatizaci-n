package co.com.choucair.prueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class UTestRegisterPage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("This button redirects to the registration page").
            located(By.xpath("//*[contains(text(),'Join Today')]"));
    public static final Target INPUT_FIRST_NAME = Target.the("Write the first name").
            located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Write the last name").
            located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("write the mail").
            located(By.id("email"));
    public static final Target MONTH_BD = Target.the("Choose month of birth").
            located(By.xpath("//div[@class='col-xs-5 col-md-5 col-lg-5 months']/select/option[9]"));
    public static final Target DAY_BD = Target.the("Choose day of birth").
            located(By.xpath("//div[@class='col-xs-3 col-md-3 col-lg-3 days']/select/option[20]"));
    public static final Target YEAR_BD = Target.the("Choose year of birth").
            located(By.xpath("//div[@class='col-xs-4 col-md-4 col-lg-4 years']/select/option[25]"));
    public static final Target NEXT_DATES1 = Target.the("Next data page").
            located(By.xpath("//*[contains(text(),'Next:')]"));

}
