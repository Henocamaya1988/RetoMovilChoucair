package co.com.choucair.automation.retomovil.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static co.com.choucair.automation.retomovil.userinterface.AplicationSearchCursoPageUi.*;

public class SearchThe implements Task {
    private String strCurso;

    public SearchThe(String strCurso) {
        this.strCurso = strCurso;
    }

    public static SearchThe curso(String strCurso) {
        return Tasks.instrumented(SearchThe.class,strCurso);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CERRAR_ALERTA),
                Click.on(OPCION_BUSCAR),
                Click.on(CLICK_CAMPO_SEARCH),
                Enter.theValue(strCurso).into(INPUT_CURSO_SEARCH),
                Click.on(CLICK_BUTTON_SEARCH)

        );






    }
}
