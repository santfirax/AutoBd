package com.ejemplo.questions;

import com.ejemplo.abilities.ConsultarLaBaseDeDatos;
import com.ejemplo.models.dao.CompraDao;
import com.ejemplo.models.dto.Compra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

public class MirarTodasLasCompras implements Question<List<Compra>> {
    private MirarTodasLasCompras() {

    }

    @Override
    public List<Compra> answeredBy(Actor actor) {
        return ConsultarLaBaseDeDatos.como(actor).conectar().withExtension(CompraDao.class, CompraDao::findAllCompras);
    }

    public static Question<List<Compra>> miraTodasLasCompras() {
        return new MirarTodasLasCompras();
    }
}
