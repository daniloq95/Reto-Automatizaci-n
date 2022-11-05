package co.com.choucair.prueba.tasks;

import co.com.choucair.prueba.userinterface.UTestRegisterPage3;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class EnterData3 implements Task {
    public static EnterData3 inThePage3() {
        return Tasks.instrumented(EnterData3.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestRegisterPage3.MOB_DEVICE),
                         Click.on(UTestRegisterPage3.MOB_DEVICE1),
                         Click.on(UTestRegisterPage3.MOB_MODEL),
                         Click.on(UTestRegisterPage3.MOB_MODEL1),
                         Click.on(UTestRegisterPage3.SO),
                         Click.on(UTestRegisterPage3.SO1),
                         Click.on(UTestRegisterPage3.NEXT_DATES3));
    }
}
