package choucair.stepsDefinitions;
import choucair.model.DataOpenCart;
import choucair.questions.VerificarAlerta;
import choucair.questions.VerificarOrdenId;
import choucair.questions.VerificarTotal;
import choucair.tasks.login.Login;
import choucair.tasks.navegador.AbrirNavegador;
import choucair.tasks.primerscenario.BuscarOrden;
import choucair.tasks.primerscenario.IngresarOrden;
import choucair.tasks.primerscenario.IngresarOrdenId;
import choucair.tasks.tercerscenario.EditarDivisa;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class OpenCartStepsDefinitions {

    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    // CASE #1

    @Given("^que Jhonatan quiere ingresar a la pagina web opencart$")
    public void queJhonatanQuiereIngresarALaPaginaWebOpencart(List<DataOpenCart> dataopencart) {
        OnStage.theActorCalled("Jhonatan").wasAbleTo(AbrirNavegador.pagina(), Login.vuelo(dataopencart.get(0)));
    }

    @When("^el ingresa a la opcion ordenes de ventas$")
    public void elIngresaALaOpcionOrdenesDeVentas(List<DataOpenCart> dataopencart) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarOrden.the(dataopencart.get(0)));
    }

    @And("^realiza el filtro por el ID de la orden$")
    public void realizaElFiltroPorElIDDeLaOrden(List<DataOpenCart> dataopencart) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarOrden.the(dataopencart.get(0)));
    }

    @And("^selecciona la opcion ver orden$")
    public void seleccionaLaOpcionVerOrden() {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarOrdenId.the());
    }

    @Then("^el verifica el ID de la orden consultada$")
    public void elVerificaElIDDeLaOrdenConsultada(List<DataOpenCart> dataopencart) {
       // OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarOrdenId.toThe(dataopencart.get(0)), Matchers.equalTo(dataopencart.get(0).getVerifyOderId())));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarOrdenId.toThe(dataopencart.get(0))));
    }

   // CASE #2

    @Then("^el verifica el valor total del producto de la orden consultada$")
    public void elVerificaElValorTotalDelProductoDeLaOrdenConsultada(List<DataOpenCart> dataopencart) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarTotal.producto(dataopencart.get(0))));
    }


    // CASE #3

    @And("^selecciona la opcion ver ordenn$")
    public void seleccionaLaOpcionVerOrdenn(List<DataOpenCart> dataopencart) {
        OnStage.theActorInTheSpotlight().attemptsTo(EditarDivisa.the(dataopencart.get(0)));
    }

    @Then("^el verifica la alerta de error mostrada por el sistema$")
    public void elVerificaLaAlertaDeErrorMostradaPorElSistema(List<DataOpenCart> dataopencart) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarAlerta.error(dataopencart.get(0))));
    }



}
