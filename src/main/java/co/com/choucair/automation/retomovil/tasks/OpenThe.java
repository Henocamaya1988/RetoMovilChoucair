package co.com.choucair.automation.retomovil.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.automation.retomovil.userinterface.AplicationHomePageUi.BUTTON_LOGIN;

public class OpenThe implements Task {
    public static OpenThe courseraApp() {
        return Tasks.instrumented(OpenThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_LOGIN));

    }
}
