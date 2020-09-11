package com.eui.futbol.mvp.model;

/**
 * Created by lfmingo on 11/03/15.
 */
public class Equipo {
    private String nombre;
    private String id;

    public String getGoles() {
        return goles;
    }

    public void setGoles(String goles) {
        this.goles = goles;
    }

    private String goles;

    public Equipo(String s, String idEHome) {
        nombre = s;
        id = idEHome;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
