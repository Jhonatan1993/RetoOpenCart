package choucair.tasks.primerscenario;

import choucair.userinterface.primerscenario.BuscarOrdenVentaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarOrdenId implements Task {

    public static IngresarOrdenId the() {
        return Tasks.instrumented(IngresarOrdenId.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BuscarOrdenVentaPage.BTN_VIEW));
    }
}
