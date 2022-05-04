package choucair.tasks.tercerscenario;

import choucair.model.DataOpenCart;
import choucair.userinterface.primerscenario.BuscarOrdenVentaPage;
import choucair.userinterface.tercerscenario.EditarDivisaPage;
import choucair.util.Utilities;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class EditarDivisa implements Task {

    private DataOpenCart dataopencart;
    private Utilities utilities;
    public EditarDivisa(DataOpenCart dataopencart) {
        this.dataopencart = dataopencart;
        utilities = new Utilities(dataopencart);
    }


    public static EditarDivisa the(DataOpenCart dataOpenCart) {
        return Tasks.instrumented(EditarDivisa.class, dataOpenCart);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BuscarOrdenVentaPage.BTN_VIEW),
                Click.on(EditarDivisaPage.BTN_EDIT),
                Click.on(utilities.DIVISAS(dataopencart.getCurrency())),
                Click.on(EditarDivisaPage.BTN_CONTINUE)
                );
    }
}
