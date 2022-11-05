package co.com.choucair.prueba.tasks;

import co.com.choucair.prueba.userinterface.UTestRegisterPage4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterData4 implements Task {
    public static EnterData4 inThePage4() {
        return Tasks.instrumented(EnterData4.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Choucair2022*").into(UTestRegisterPage4.PASSWORD),
                         Enter.theValue("Choucair2022*").into(UTestRegisterPage4.RE_PASSWORD),
                         Click.on(UTestRegisterPage4.TERMS),
                         Click.on(UTestRegisterPage4.PRIV),
                         Click.on(UTestRegisterPage4.NEXT_DATES_FINAL)
        );

    }
}
