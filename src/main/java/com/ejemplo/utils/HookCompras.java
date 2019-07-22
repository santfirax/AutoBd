package com.ejemplo.utils;

import com.ejemplo.abilities.ConsultarLaBaseDeDatos;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.ejemplo.utils.ConexionBd.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class HookCompras {
    @Before
    public void setup() {
        setTheStage(new OnlineCast());
        theActorCalled("Santiago").whoCan(ConsultarLaBaseDeDatos.conConfiguracion(URL, USERNAME, PASSWORD));
    }

    @After
    public void tearDown() {
        drawTheCurtain();
    }
}
