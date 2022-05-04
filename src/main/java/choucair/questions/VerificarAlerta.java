package choucair.questions;

import choucair.model.DataOpenCart;
import choucair.userinterface.tercerscenario.EditarDivisaPage;
import choucair.util.Utilities;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarAlerta implements Question<Boolean> {

    private DataOpenCart dataopencart;
    private Utilities utilities;

    public VerificarAlerta(DataOpenCart dataopencart) {
        this.dataopencart = dataopencart;
        utilities = new Utilities(dataopencart);
    }

    public static VerificarAlerta error(DataOpenCart dataOpenCart) {
        return new VerificarAlerta(dataOpenCart);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado ;
        String verificarTexto = Text.of(EditarDivisaPage.ERROR_MESSAGE).viewedBy(actor).asString();
        if (dataopencart.getErrorMssage().equals(verificarTexto)){
            resultado = true;
        }else {
            resultado = false;
        }
        return resultado;
    }
}
