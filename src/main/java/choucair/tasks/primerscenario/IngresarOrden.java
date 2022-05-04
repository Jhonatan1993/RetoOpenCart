package choucair.tasks.primerscenario;

import choucair.model.DataOpenCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import choucair.userinterface.primerscenario.BuscarOrdenVentaPage;

public class IngresarOrden implements Task {

    private DataOpenCart dataOpenCart;
    public IngresarOrden(DataOpenCart dataOpenCart) {
        this.dataOpenCart = dataOpenCart;
    }

    public static IngresarOrden the(DataOpenCart dataOpenCart) {
        return Tasks.instrumented(IngresarOrden.class, dataOpenCart);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataOpenCart.getOrderId()).into(BuscarOrdenVentaPage.ORDEN_ID),
                Click.on(BuscarOrdenVentaPage.BTN_FILTER)
        );
    }
}
