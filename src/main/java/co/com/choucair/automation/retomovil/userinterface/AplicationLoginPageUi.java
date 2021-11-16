package co.com.choucair.automation.retomovil.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AplicationLoginPageUi extends PageObject {

    public static final Target INPUT_EMAIL = Target.the("Insertar Email").located(By.id("org.coursera.android:id/email"));
    public static final Target INPUT_PASSWORD = Target.the("Insertar Password").located(By.id("org.coursera.android:id/password"));
    public static final Target BUTTON_SING_IN = Target.the("Boton sing in").located(By.id("org.coursera.android:id/create_account"));


}
