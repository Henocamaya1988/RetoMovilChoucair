package co.com.choucair.automation.retomovil.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AplicationHomePageUi extends PageObject {
    public static final Target BUTTON_LOGIN = Target.the("Boton iniciar sesion con correo electronico").located(By.id("org.coursera.android:id/login"));
}
