package co.com.choucair.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestRegisterPage2 extends PageObject {
    public static final Target INPUT_ZIP = Target.the("Write zip code").
            located(By.id("zip"));

    public static final Target NEXT_DATES2 = Target.the("Next data page").
            located(By.xpath("//*[contains(text(),'Next:')]"));
}
