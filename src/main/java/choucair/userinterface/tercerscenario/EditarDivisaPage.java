package choucair.userinterface.tercerscenario;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EditarDivisaPage extends PageObject {

    public static final Target BTN_EDIT = Target.the("Seleccionar boton editar")
            .located(By.xpath("//a[@data-original-title='Edit']"));
    public static final Target BTN_CONTINUE = Target.the("Seleccionar boton continuar")
            .located(By.id("button-customer"));
    public static final Target ERROR_MESSAGE = Target.the("Seleccionar boton continuar")
            .located(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));



}
