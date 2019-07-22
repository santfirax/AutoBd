package com.ejemplo.questions;

import com.ejemplo.abilities.ConsultarLaBaseDeDatos;
import com.ejemplo.models.dao.CompraDao;
import com.ejemplo.models.dto.Compra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MiraLaCompra implements Question<Compra> {
    private final String idCompra;

    private MiraLaCompra(String idCompra) {
        this.idCompra = idCompra;
    }

    public static MiraLaCompra conId(String idCompra) {
        return new MiraLaCompra(idCompra);
    }

    @Override
    public Compra answeredBy(Actor actor) {
        return ConsultarLaBaseDeDatos.como(actor).conectar().withExtension(CompraDao.class, compra -> compra.findCompra(idCompra));
    }
}
