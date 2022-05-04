package choucair.userinterface.segundoscenario;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValorTotalPage extends PageObject {

    public static final Target QUANTITY = Target.the("Cantidad de un producto")
            .located(By.xpath("//table[2]/tbody/tr[1]/td[3]"));
    public static final Target UNIT_PRICE = Target.the("Precio por unidad")
            .located(By.xpath("//table[2]/tbody/tr[1]/td[4]"));
    public static final Target TOTAL = Target.the("Precio total")
            .located(By.xpath("//table[2]/tbody/tr[1]/td[5]"));

}
