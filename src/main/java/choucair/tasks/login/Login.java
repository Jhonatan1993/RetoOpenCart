package choucair.tasks.login;

import choucair.model.DataOpenCart;
import choucair.userinterface.login.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    private DataOpenCart dataopencart;
    public Login(DataOpenCart dataLatam) {this.dataopencart = dataLatam;}

    public static Login vuelo(DataOpenCart dataLatam) {
        return Tasks.instrumented(Login.class, dataLatam);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataopencart.getUsername()).into(LoginPage.USERNAME),
                Enter.theValue(dataopencart.getPassword()).into(LoginPage.PASSWORD),
                Click.on(LoginPage.BTN_LOGIN)

        );
    }
}
