package co.com.choucair.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestRegisterPage4 extends PageObject {
    public static final Target PASSWORD = Target.the("Type a password").
            located(By.name("password"));
        public static final Target RE_PASSWORD = Target.the("Retype password").
            located(By.name("confirmPassword"));

    public static final Target TERMS = Target.the("Accept terms").
            located(By.xpath("//*[@ng-class = '{error: userForm.termOfUse.$error.required}']"));

    public static final Target PRIV = Target.the("Accept privacy").
            located(By.xpath("//*//*[@ng-class = '{error: userForm.privacySetting.$error.required}'] "));

    public static final Target NEXT_DATES_FINAL = Target.the("Complete the data form").
            located(By.xpath("//*[contains(text(),'Complete Setup')]"));
}

