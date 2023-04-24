package org.example.clases;

import javax.swing.*;
import java.util.List;

public class Ronda {

    //ATRIBUTOS

    private int numeroRonda;
    private int cantEquipoEnRonda;
    private int canEquipoEnLlave;

    //CONSTRUCTORES

    public Ronda() {
    }

    public Ronda(int numeroRonda, int cantEquipoEnRonda, int canEquipoEnLlave) {
        this.numeroRonda = numeroRonda;
        this.cantEquipoEnRonda = cantEquipoEnRonda;
        this.canEquipoEnLlave = canEquipoEnLlave;
    }

    //GETTERS Y SETTERS

    public int getNumeroRonda() {
        return numeroRonda;
    }

    public void setNumeroRonda(int numeroRonda) {
        this.numeroRonda = numeroRonda;
    }

    public int getCantEquipoEnRonda() {
        return cantEquipoEnRonda;
    }

    public void setCantEquipoEnRonda(int cantEquipoEnRonda) {
        this.cantEquipoEnRonda = cantEquipoEnRonda;
    }

    public int getCanEquipoEnLlave() {
        return canEquipoEnLlave;
    }

    public void setCanEquipoEnLlave(int canEquipoEnLlave) {
        this.canEquipoEnLlave = canEquipoEnLlave;
    }

    //METODOS

    public void cuartosDeFinal(Llave llaveIzquierda, Llave llaveDerecha){

        this.numeroRonda = 1;
        this.canEquipoEnLlave = 4;

        Partido partido = new Partido();

        JOptionPane.showMessageDialog(null, "Se jugaran los Cuartos de Final", "Cuartos", JOptionPane.INFORMATION_MESSAGE);

        for (int i = 0; i < canEquipoEnLlave; i+=2) {
            partido.simularPartido(llaveIzquierda.getEquiposDeLaLlave().get(i), llaveIzquierda.getEquiposDeLaLlave().get(i + 1));
            partido.simularPartido(llaveDerecha.getEquiposDeLaLlave().get(i), llaveDerecha.getEquiposDeLaLlave().get(i + 1));
        }

        //removemos a los perdedores
        removerEquipos(llaveIzquierda.getEquiposDeLaLlave());
        removerEquipos(llaveDerecha.getEquiposDeLaLlave());

        this.canEquipoEnLlave = 2;
    }


    public void removerEquipos(List<Equipo> equipos){
        int contadorDeEquiposPorLlave = canEquipoEnLlave;
        for (int i = 0; i < contadorDeEquiposPorLlave; i++) {
            Equipo auxiliar = equipos.get(i);
            if (!auxiliar.isAutorizacion()){
                equipos.remove(auxiliar);
                contadorDeEquiposPorLlave--;
            }
        }
    }

    public void semiFinal(Llave llaveIzquierda, Llave llaveDerecha){
        this.numeroRonda = 2;
        Partido partido = new Partido();

        JOptionPane.showMessageDialog(null, "Se jugaran las Semis", "Semis", JOptionPane.INFORMATION_MESSAGE);

        partido.simularPartido(llaveIzquierda.getEquiposDeLaLlave().get(0), llaveIzquierda.getEquiposDeLaLlave().get(1));
        partido.simularPartido(llaveDerecha.getEquiposDeLaLlave().get(0), llaveDerecha.getEquiposDeLaLlave().get(1));

        //removemos a los perdedores
        removerEquipos(llaveIzquierda.getEquiposDeLaLlave());
        removerEquipos(llaveDerecha.getEquiposDeLaLlave());
    }

    public void finalDelTorneo(Llave llaveIzquierda, Llave llaveDerecha){
        this.numeroRonda = 3;
        Partido partido = new Partido();

        JOptionPane.showMessageDialog(null, "Se jugara la final del torneo", "Final", JOptionPane.INFORMATION_MESSAGE);

        Equipo equipo = partido.simularPartido(llaveDerecha.getEquiposDeLaLlave().get(0),llaveIzquierda.getEquiposDeLaLlave().get(0));

        //muestro mensaje mostrando quien gano
        JOptionPane.showMessageDialog(null, "El ganador del torneo es: " + equipo.getNombre(), "Ganador del torneo", JOptionPane.INFORMATION_MESSAGE);
    }
}
