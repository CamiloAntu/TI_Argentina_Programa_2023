package org.example.clases;

import java.util.ArrayList;
import java.util.List;

public class Llave {

    //ATRIBUTOS

    private List<Equipo> equiposDeLaLlave;
    private String nombreDeLaLlave;

    //CONSTRUCTORES

    public Llave() {
    }

    public Llave(String nombreDeLaLlave){
        this.nombreDeLaLlave = nombreDeLaLlave;
    }

    public Llave(List<Equipo> equiposDeLaLlave, String nombreDeLaLlave) {
        this.equiposDeLaLlave = equiposDeLaLlave;
        this.nombreDeLaLlave = nombreDeLaLlave;
    }

    //GETTERS

    public List<Equipo> getEquiposDeLaLlave() {
        return equiposDeLaLlave;
    }

    public String getNombreDeLaLlave() {
        return nombreDeLaLlave;
    }

    //SETTERS

    public void setEquiposDeLaLlave(List<Equipo> equiposDeLaLlave) {
        this.equiposDeLaLlave = equiposDeLaLlave;
    }

    public void setNombreDeLaLlave(String nombreDeLaLlave) {
        this.nombreDeLaLlave = nombreDeLaLlave;
    }

    //METODOS

    public void armarLlave(List<Equipo> listaGeneral, int indiceInicial){
        List<Equipo> equiposLlave = new ArrayList<>();
        for (int i = indiceInicial; i < indiceInicial+4 ; i++){
            equiposLlave.add(listaGeneral.get(i));
        }
        this.equiposDeLaLlave=equiposLlave;
    }
}
