package com.ejemplo.models.dto;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Compra {
    private String userName;
    private String valorCompra;
    private String fechaCompra;
    private String articuloComprado;
    private String id;

    public Compra() {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(String valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getArticuloComprado() {
        return articuloComprado;
    }

    public void setArticuloComprado(String articuloComprado) {
        this.articuloComprado = articuloComprado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Compra)) return false;

        Compra compra = (Compra) o;

        return new EqualsBuilder()
                .append(getUserName(), compra.getUserName())
                .append(getValorCompra(), compra.getValorCompra())
                .append(getFechaCompra(), compra.getFechaCompra())
                .append(getArticuloComprado(), compra.getArticuloComprado())
                .append(getId(), compra.getId())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getUserName())
                .append(getValorCompra())
                .append(getFechaCompra())
                .append(getArticuloComprado())
                .append(getId())
                .toHashCode();
    }

    @Override
    public String toString() {
             return String.format("Compra[userName=%s valorCompra=%s fechaCompra=%s articuloComprado=%s id=%s]",userName,valorCompra,fechaCompra,articuloComprado,id);
    }
}
