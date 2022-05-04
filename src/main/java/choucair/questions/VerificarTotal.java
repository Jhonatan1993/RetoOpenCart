package choucair.questions;

import choucair.model.DataOpenCart;
import choucair.userinterface.segundoscenario.ValorTotalPage;
import choucair.util.Utilities;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarTotal implements Question {

    private DataOpenCart dataOpenCart;
    private  Utilities utilities;

    public VerificarTotal(DataOpenCart dataOpenCart) {
        this.dataOpenCart = dataOpenCart;
        utilities = new Utilities(dataOpenCart);
    }

    public static VerificarTotal producto(DataOpenCart dataOpenCart) {return new VerificarTotal(dataOpenCart);}

    @Override
    public Object answeredBy(Actor actor) {
        boolean resultado ;
        String totalXpath = Text.of(ValorTotalPage.TOTAL).viewedBy(actor).asString().replaceAll("\\D+","");
        int totalInt = Integer.parseInt(totalXpath);

        if (utilities.validarTotalProducto(actor).equals(totalInt)){
            resultado = true;
        }else {
            resultado = false;
        }
        return resultado;
    }
}

