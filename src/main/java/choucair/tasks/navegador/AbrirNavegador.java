package choucair.tasks.navegador;

import choucair.userinterface.navegador.AbrirPaginaOpencart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNavegador implements Task {

    private AbrirPaginaOpencart abrirPaginaOpencart;
    public static Performable pagina() {return Tasks.instrumented(AbrirNavegador.class);}
    @Override
    public <T extends Actor> void performAs(T actor) {actor.attemptsTo(Open.browserOn(abrirPaginaOpencart));}
}
