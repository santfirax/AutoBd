package com.ejemplo.abilities;

import com.ejemplo.exceptions.ActorNoPuedeConsultarLaBaseDeDatos;
import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.exceptions.ActorCannotBrowseTheWebException;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;

public class ConsultarLaBaseDeDatos implements Ability {
    private final String urlDb;
    private final String username;
    private final String password;

    private ConsultarLaBaseDeDatos(String urlDb, String username, String password) {
        this.urlDb = urlDb;
        this.username = username;
        this.password = password;
    }

    public static ConsultarLaBaseDeDatos conConfiguracion(String urlDb, String username, String password) {
        return new ConsultarLaBaseDeDatos(urlDb, username, password);
    }

    public static ConsultarLaBaseDeDatos como(Actor actor) {
        if (actor.abilityTo(ConsultarLaBaseDeDatos.class) == null) {
            throw new ActorNoPuedeConsultarLaBaseDeDatos(actor.getName());
        }
        return actor.abilityTo(ConsultarLaBaseDeDatos.class);
    }

    public Jdbi conectar() {
        return Jdbi.create(urlDb, username, password).installPlugin(new SqlObjectPlugin());
    }
}
