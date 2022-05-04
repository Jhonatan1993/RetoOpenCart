package choucair.questions;

import choucair.model.DataOpenCart;
import choucair.util.Utilities;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarOrdenId implements Question {

private Utilities utilities;
private DataOpenCart dataOpenCart;

    public VerificarOrdenId(DataOpenCart dataOpenCart) {
        this.dataOpenCart = dataOpenCart;
        utilities = new Utilities(dataOpenCart);
    }

    public static VerificarOrdenId toThe(DataOpenCart dataOpenCart) {return new VerificarOrdenId(dataOpenCart);}

    @Override
    public Object answeredBy(Actor actor) {
        boolean resultado ;
        String verificarTexto = Text.of(utilities.verifytext(actor)).viewedBy(actor).asString().trim();
        if (dataOpenCart.getVerifyOderId().equals(verificarTexto)){
            resultado = true;
        }else {
            resultado = false;
        }
        return resultado;
    }
}
