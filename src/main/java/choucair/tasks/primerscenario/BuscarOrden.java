package choucair.tasks.primerscenario;

import choucair.model.DataOpenCart;
import choucair.userinterface.primerscenario.BuscarOrdenVentaPage;
import choucair.util.Utilities;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class BuscarOrden implements Task {

    private DataOpenCart dataopencart;
    private Utilities utilities;

    public BuscarOrden(DataOpenCart dataopencart) {
        this.dataopencart = dataopencart;
        utilities = new Utilities(dataopencart);
    }
    public static BuscarOrden the(DataOpenCart dataopencart) {
        return Tasks.instrumented(BuscarOrden.class, dataopencart);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BuscarOrdenVentaPage.SALES));
        Utilities.salesOptions(actor);
    }
}
