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
public class Jugador {
    
    private String nombre;
    private int partidasGanadas, partidasPerdidas, puntuacion, fichasTablero;
    private char simbolo;


    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String mostrarDatosJugador() {
        return " Nombre: " + nombre + ", Partidas ganadas: " + partidasGanadas + ", Partidas perdidas: " + partidasPerdidas + ", Puntuacion: " + puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getFichasTablero() {
        return fichasTablero;
    }

    public void setFichasTablero(int fichasTablero) {
        this.fichasTablero = fichasTablero;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    

}
