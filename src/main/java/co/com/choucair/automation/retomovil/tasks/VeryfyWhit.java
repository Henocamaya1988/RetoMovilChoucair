package co.com.choucair.automation.retomovil.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.automation.retomovil.userinterface.AplicationSearchCursoPageUi.MENSAJE;

public class VeryfyWhit implements Question<Boolean> {
    private String question;

    public VeryfyWhit(String question) {
        this.question = question;
    }

    public static VeryfyWhit the(String question) {
        return new VeryfyWhit(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String answer = Text.of(MENSAJE).viewedBy(actor).asString();
        return question.equals(answer);
    }
}
