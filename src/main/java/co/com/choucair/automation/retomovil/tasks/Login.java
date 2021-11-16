package co.com.choucair.automation.retomovil.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.automation.retomovil.userinterface.AplicationLoginPageUi.*;

public class Login implements Task {
    private String strUsuario;
    private String strPassword;

    public Login(String strUsuario, String strPassword) {
        this.strUsuario = strUsuario;
        this.strPassword = strPassword;
    }

    public static Login with(String strUsuario, String strPassword) {
        return Tasks.instrumented(Login.class,strUsuario,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strUsuario).into(INPUT_EMAIL),
                Enter.theValue(strPassword).into(INPUT_PASSWORD),
                Click.on(BUTTON_SING_IN));
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
