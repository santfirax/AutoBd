package com.ejemplo.models.dao;

import com.ejemplo.models.dto.Compra;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

public interface CompraDao {
    @SqlQuery("select * from compras")
    @RegisterBeanMapper(Compra.class)
    List<Compra> findAllCompras();

    @SqlQuery("select * from compras where articulo_comprado=?")
    @RegisterBeanMapper(Compra.class)
    Compra findCompra(@Bind String articuloComprado);
}
