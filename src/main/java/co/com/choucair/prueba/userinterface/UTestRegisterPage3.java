package co.com.choucair.prueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestRegisterPage3 extends PageObject {

    public static final Target MOB_DEVICE = Target.the("Open a list with mobile brands").
            located(By.xpath("//*[contains(text(), 'Select Brand')]"));
    public static final Target MOB_DEVICE1 = Target.the("Select the mobile device").
            located(By.xpath("//div[contains(text(),'Apple')]"));
    public static final Target MOB_MODEL = Target.the("Open a list of mobile models").
            located(By.xpath("//*[contains(text(), 'Select a Model')]"));
    public static final Target MOB_MODEL1 = Target.the("Select the model of device").
            located(By.xpath("//div[contains(text(),'iPhone 13')]"));

    public static final Target SO = Target.the("Open a list of operating systems").
            located(By.xpath("//div[@class = 'ui-select-box']/div [@name = 'handsetOSId']"));

    public static final Target SO1 = Target.the("Select the operating system that use").
            located(By.xpath("//div[contains(text(),'iOS 15')]"));

    public static final Target NEXT_DATES3 = Target.the("Next data page").
            located(By.xpath("//*[contains(text(),'Next:')]"));
}
