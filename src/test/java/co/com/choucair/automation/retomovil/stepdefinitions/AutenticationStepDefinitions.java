package co.com.choucair.automation.retomovil.stepdefinitions;

import co.com.choucair.automation.retomovil.tasks.Login;
import co.com.choucair.automation.retomovil.tasks.OpenThe;
import co.com.choucair.automation.retomovil.tasks.SearchThe;
import co.com.choucair.automation.retomovil.tasks.VeryfyWhit;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class AutenticationStepDefinitions {
    @Given("^que (.*) quiere ingrear la aplicacion coursera$")
    public void queHenocQuiereIngrearLaAplicacionCoursera(String henoc) {
        OnStage.theActorCalled(henoc).wasAbleTo(OpenThe.courseraApp());
    }

    @When("^inicia sesion con las credencias \"([^\"]*)\" \"([^\"]*)\"$")
    public void iniciaSesionConLasCredencias(String strusuario, String strPassword) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.with(strusuario,strPassword));
    }

    @When("^busca  el  curso \"([^\"]*)\" para inscribirse$")
    public void buscaElCursoParaInscribirse(String strNombreCurso) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchThe.curso(strNombreCurso));
    }

    @Then("^debe valiar que se muestre el  \"([^\"]*)\" con el nombre del curso seleccionado$")
    public void debeValiarQueSeMuestreElConElNombreDelCursoSeleccionado(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VeryfyWhit.the(question)));
    }
}
