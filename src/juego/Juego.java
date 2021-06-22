/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.juego;

/**
 *
 * @author blue
 */
import java.util.Scanner;
import src.jugadores.TablaJugadores;
import src.principal.LecturaDatos;

public class Juego {

    Scanner scanner = new Scanner(System.in);
    TablaJugadores tJugadores = new TablaJugadores();
    Partida partida;


    public Juego() {

        int opcion = 0;

        do {
            System.out.println("            Damas");
            System.out.println("");
            System.out.println("  Menu:");
            System.out.println("   1. Iniciar Partida.");
            System.out.println("   2. Ingresar un Jugador.");
            System.out.println("   3. Mostrar Jugadores.");
            System.out.println("   4. Tabla de Posiciones.");
            System.out.println("   5. Salir");
            System.out.println("");
            System.out.print(" Elija una opcion : ");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    partida = new Partida(tJugadores);
                    break;
                case 2:
                    tJugadores.ingresarJugador();
                    break;
                case 3:
                    tJugadores.mostrarJugadores();
                    break;
                case 4:
                    tJugadores.mostrarTablaPosiciones();
                    break;
                case 5:
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opcion != 5);

    }

    
}
