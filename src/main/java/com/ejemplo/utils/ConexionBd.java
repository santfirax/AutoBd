package com.ejemplo.utils;

import static com.ejemplo.utils.PropertiesManager.CONEXION_BD;

public class ConexionBd {
    public static final String USERNAME = CONEXION_BD.getString("username");
    public static final String PASSWORD = CONEXION_BD.getString("password");
    public static final String URL = CONEXION_BD.getString("url");
}
