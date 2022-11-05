package co.com.choucair.prueba.tasks;

import co.com.choucair.prueba.userinterface.UTestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterData implements Task {
    public static EnterData inThePage() {
        return Tasks.instrumented(EnterData.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Danilo").into(UTestRegisterPage.INPUT_FIRST_NAME),
                         Enter.theValue("Quiroga").into(UTestRegisterPage.INPUT_LAST_NAME),
                         Enter.theValue("DANILO1@HOTMAIL.COM").into(UTestRegisterPage.INPUT_EMAIL),
                         Click.on(UTestRegisterPage.MONTH_BD),
                         Click.on(UTestRegisterPage.DAY_BD),
                         Click.on(UTestRegisterPage.YEAR_BD),
                         Click.on(UTestRegisterPage.NEXT_DATES1)

        );
    }
}
