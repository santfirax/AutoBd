package com.ejemplo.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@CucumberOptions(
        features = "src//test//resources//features//consultar_compras.feature",
        glue = {"com.ejemplo.stepdefinition", "com.ejemplo.utils"},
        snippets = CAMELCASE
)
@RunWith(CucumberWithSerenity.class)
public class ConsultarComprasRunner {
}
