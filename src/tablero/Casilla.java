/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.tablero;

/**
 *
 * @author blue
 */
public class Casilla {
    
    private String fGris = "\u001b[47;1m", fRojo = "\033[36m", negro = "\033[30m", reset = "\u001B[0m";
    private char caracter;
    private boolean oscuro, esEquis;

    public boolean isEsEquis() {
        return esEquis;
    }

    public void setEsEquis(boolean esEquis) {
        this.esEquis = esEquis;
    }

    public Casilla() {

    }

    public Casilla(boolean oscuro, char caracter) {
        this.oscuro = oscuro;
        this.caracter = caracter;
    }

    public String getCasilla() {
        if (oscuro) {
            return fRojo+negro+" "+caracter+" "+reset;
        } else {
            return fGris + negro+"   "+reset;
        }
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public boolean isOscuro() {
        return oscuro;
    }

    public void setOscuro(boolean oscuro) {
        this.oscuro = oscuro;
    }


}
