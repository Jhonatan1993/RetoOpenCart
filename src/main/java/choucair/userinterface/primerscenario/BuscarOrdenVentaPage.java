package choucair.userinterface.primerscenario;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuscarOrdenVentaPage {

    public static final Target SALES = Target.the("Seleccionar ventas")
            .located(By.xpath("//a[@href='#collapse26']"));
    public static final Target ORDEN_ID = Target.the("Ingresar el Id de la orden")
            .located(By.id("input-order-id"));
    public static final Target BTN_FILTER = Target.the("Ingresar el Id de la orden")
            .located(By.id("button-filter"));
    public static final Target BTN_VIEW = Target.the("Seleccionar ver orden")
            .located(By.xpath("//a[@data-original-title='View']"));


}
