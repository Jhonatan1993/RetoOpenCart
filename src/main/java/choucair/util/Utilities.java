package choucair.util;

import choucair.model.DataOpenCart;
import choucair.userinterface.segundoscenario.ValorTotalPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Utilities extends PageObject {

    private static DataOpenCart dataopencart;
    public Utilities(DataOpenCart dataopencart) {
        this.dataopencart = dataopencart;
    }

    public static void salesOptions(Actor actor) {
        String orders = dataopencart.getSalesOptions();
        String xpath = "//a[contains(text(),'%s')]";
        Target select_order = Target.the("Seleccionar orden")
                .located(By.xpath(String.format(xpath, orders)));
        actor.attemptsTo(Click.on(select_order));
    }
    public Target verifytext(Actor actor) {
        String textId = dataopencart.getVerifyOderId();
        String xpath = "//h3[contains(text(),'%s')]";
        Target select_orderId = Target.the("Seleccionar orden")
                .located(By.xpath(String.format(xpath, textId)));

        return select_orderId;
    }
    public Object validarTotalProducto(Actor actor){

        String quantityXpath = Text.of(ValorTotalPage.QUANTITY).viewedBy(actor).asString().replaceAll("\\D+","");;
        String unitPriceXpath = Text.of(ValorTotalPage.UNIT_PRICE).viewedBy(actor).asString().replaceAll("\\D+","");

        int quantity = Integer.parseInt(quantityXpath);
        int unitPrice = Integer.parseInt(unitPriceXpath);
        int total = (quantity*unitPrice);

        return total;
    }

    public static Target DIVISAS(String valor){
        String valorA = "//option[text()='";
        String valorB = "']";
        String valorXpath = valorA + valor + valorB;
        return Target.the("Divisa").located(By.xpath(valorXpath));
    }



}
