package com.ejemplo.stepdefinition;

import com.ejemplo.models.dto.Compra;
import com.ejemplo.questions.MiraLaCompra;
import com.ejemplo.questions.MirarTodasLasCompras;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsEqual.equalTo;


public class ConsultarComprasStepDefinitions {
    @When("^consulto las compras del cliente$")
    public void consultoLasComprasDelCliente(List<Compra> compraList) {
        OnStage.theActorInTheSpotlight().should(seeThat(MiraLaCompra.conId("portatil"), is(equalTo(compraList.get(0)))));
        //  OnStage.theActorInTheSpotlight().asksFor(MirarTodasLasCompras.miraTodasLasCompras()).forEach(System.out::println);
    }

    @Then("^deberia mirar todas las compras$")
    public void deberiaMirarTodasLasCompras(List<Compra> compraList) {
        OnStage.theActorInTheSpotlight().should(seeThat(MirarTodasLasCompras.miraTodasLasCompras(), is(equalTo(compraList))));
    }
}
