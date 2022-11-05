package co.com.choucair.prueba.tasks;

import co.com.choucair.prueba.userinterface.UTestRegisterPage2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterData2 implements Task {

    public static EnterData2 inThePage2() {
        return Tasks.instrumented(EnterData2.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("110141").into(UTestRegisterPage2.INPUT_ZIP),
                         Click.on(UTestRegisterPage2.NEXT_DATES2));
    }
}
