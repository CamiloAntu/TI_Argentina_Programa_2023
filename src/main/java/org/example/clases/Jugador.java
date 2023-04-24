package org.example.clases;

import javax.swing.*;
import java.util.List;

public class Jugador {

    //ATRIBUTOS

    private Equipo equipoSeleccionado;
    private int puntaje;

    //CONSTRUCTORES

    public Jugador() {
    }

    public Jugador(Equipo equipoSeleccionado, int puntaje) {
        this.equipoSeleccionado = equipoSeleccionado;
        this.puntaje = puntaje;
    }

    //GETTERS

    public Equipo getEquipoSeleccionado() {
        return equipoSeleccionado;
    }

    public int getPuntaje() {
        return puntaje;
    }

    //SETTERS

    public void setEquipoSeleccionado(Equipo equipoSeleccionado) {
        this.equipoSeleccionado = equipoSeleccionado;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    //METODOS

    public void elegirEquipo(List<Equipo> listaEquipos) {
        JOptionPane.showMessageDialog(null,"Seleccione su equipo: ","Seleccion de equipo", JOptionPane.INFORMATION_MESSAGE);
        String listaDeLosEquiposEnMensaje = "Equipos: \n";
        for (int i = 0; i < listaEquipos.size(); i++) {
            listaDeLosEquiposEnMensaje+=(i+1)+". "+listaEquipos.get(i).getNombre()+"\n";

        }
        JOptionPane.showMessageDialog(null,listaDeLosEquiposEnMensaje,"Seleccion de equipo",JOptionPane.INFORMATION_MESSAGE);

        int indiceEquipo = 0;

        do {
            indiceEquipo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el indice del equipo que quiere seleccionar","Ingreso valor",JOptionPane.INFORMATION_MESSAGE))-1;
        }while(indiceEquipo<1||indiceEquipo>8);
        JOptionPane.showMessageDialog(null,"EL VALOR QUE ELEGISTE ES: " + listaEquipos.get(indiceEquipo).getNombre());
        this.equipoSeleccionado = listaEquipos.get(indiceEquipo);
    }

    public void sumarPuntos(){
        if (equipoSeleccionado.isAutorizacion()){
            puntaje++;
        }
    }
}
