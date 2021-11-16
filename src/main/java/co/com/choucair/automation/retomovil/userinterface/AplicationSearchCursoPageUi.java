package co.com.choucair.automation.retomovil.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AplicationSearchCursoPageUi extends PageObject {

    public static final Target CERRAR_ALERTA= Target.the("Cerrar ventana de alerta").located(By.xpath("//android.widget.ImageView[@content-desc='cerrar']"));
    public static final Target OPCION_BUSCAR= Target.the("Seleccionar opcion buscar").located(By.xpath("//android.widget.FrameLayout[@content-desc='Explorar']/android.widget.ImageView"));
    public static final Target CLICK_CAMPO_SEARCH= Target.the("sleccionar campo  buscar").located(By.id("org.coursera.android:id/search_src_text"));
    public static final Target INPUT_CURSO_SEARCH= Target.the("insertar curso a buscar").located(By.id("org.coursera.android:id/search_src_text"));
    public static final Target CLICK_BUTTON_SEARCH = Target.the("boton buscar curso ").located(By.id("org.coursera.android:id/popular_search"));
    public static final Target MENSAJE= Target.the(" seleccionar curso encontrado").located(By.id("org.coursera.android:id/searchFilter"));





}
