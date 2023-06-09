package org.example.clases;

import org.example.enumeraciones.Resultado;

public class Equipo {

    //ATRIBUTOS

    private String nombre;
    private boolean autorizacion = true;
    private Resultado resultadoEnElPartido;
    private int cantGolesEnElTorneo;

    //CONSTRUCTORES

    public Equipo() {
    }

    public Equipo(String nombre){
        this.nombre = nombre;
    }

    public Equipo(String nombre, boolean autorizacion, Resultado resultadoEnElPartido, int cantGolesEnElTorneo) {
        this.nombre = nombre;
        this.autorizacion = autorizacion;
        this.resultadoEnElPartido = resultadoEnElPartido;
        this.cantGolesEnElTorneo = cantGolesEnElTorneo;
    }

    //GETTERS

    public String getNombre() {
        return nombre;
    }

    public boolean isAutorizacion() {
        return autorizacion;
    }

    public Resultado getResultadoEnElPartido() {
        return resultadoEnElPartido;
    }

    public int getCantGolesEnElTorneo() {
        return cantGolesEnElTorneo;
    }

    //SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutorizacion(boolean autorizacion) {
        this.autorizacion = autorizacion;
    }

    public void setResultadoEnElPartido(Resultado resultadoEnElPartido) {
        this.resultadoEnElPartido = resultadoEnElPartido;
    }

    public void setCantGolesEnElTorneo(int cantGolesEnElTorneo) {
        this.cantGolesEnElTorneo = cantGolesEnElTorneo;
    }

    //METODOS

    public void sumarGolesNuevos(int nuevosGoles){
        this.cantGolesEnElTorneo+= nuevosGoles;
    }
}
