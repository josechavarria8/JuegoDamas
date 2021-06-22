/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.jugadores;

/**
 *
 * @author blue
 */
import java.util.Scanner;

import src.principal.LecturaDatos;


public class TablaJugadores {
 
    private final int maximoJ = 10;
    private Jugador[] jugadores = new Jugador[maximoJ];
    Scanner scan = new Scanner(System.in);
    private int ultimoJugador=0;

    public TablaJugadores(){
    }

    public void ingresarJugador() {

        if (ultimoJugador < maximoJ) {
            
            jugadores[ultimoJugador] = new Jugador(LecturaDatos.leerTexto(" Escriba el nombre del jugador: "));
            ultimoJugador++;

        } else {
            System.out.println("No hay espacio para mas jugadores");
        }    

    }

    public void mostrarJugadores() {

        if (ultimoJugador == 0) {
            System.out.println("\n    No hay jugadores ingresados.");
        } else {
            System.out.println("");
            System.out.println("Lista de Jugadores");
            System.out.println("");
            for (int i = 0; i < ultimoJugador; i++) {
                System.out.println("  "+(i+1)+". "+jugadores[i].getNombre());
            }
        }

    }

    public void mostrarTablaPosiciones () {

        if (ultimoJugador == 0) {
            System.out.println(" No hay jugadores");
        } 
        else {
            ordenarTabla();
            System.out.println("         Tabla de Posiciones ");
            for (int i = 0; i < ultimoJugador; i++) {
                System.out.println("  "+(i+1)+". "+jugadores[i].mostrarDatosJugador());
            }
        }
    }

    public void ordenarTabla() {

        for (int i = 0; i < ultimoJugador; i++) {
            for (int j = 0; j < ultimoJugador-1; j++) {

                if (jugadores[j].getPuntuacion() < jugadores[j+1].getPuntuacion()) {
                    Jugador aux = jugadores[j];
                    jugadores[j] = jugadores[j+1];
                    jugadores[j+1] = aux;
                }
            }
        }

    }

    public Jugador seleccionarJugador() {

        mostrarJugadores();

        int num = LecturaDatos.leerEntero("\n  Escriba el numero del jugador: ");

        return jugadores[num-1];
    }

    public int getUltimoJugador() {
        return ultimoJugador;
    }

    public void setUltimoJugador(int ultimoJugador) {
        this.ultimoJugador = ultimoJugador;
    }

    

}
