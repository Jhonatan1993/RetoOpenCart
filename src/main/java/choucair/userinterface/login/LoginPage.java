package choucair.userinterface.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    public static final Target USERNAME = Target.the("Ingresar nombre de usuario")
            .located(By.id("input-username"));
    public static final Target PASSWORD = Target.the("Ingresar contraseña")
            .located(By.id("input-password"));
    public static final Target BTN_LOGIN = Target.the("Seleccionar boton login")
            .located(By.xpath("//button[contains(text(),'Login')]"));


}
