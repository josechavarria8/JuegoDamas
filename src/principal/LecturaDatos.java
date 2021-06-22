/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.principal;

/**
 *
 * @author blue
 */
import java.util.Scanner;

public class LecturaDatos {
    
    static Scanner scanner = new Scanner(System.in);

    private static void imprimir(String mensaje) {

        System.out.print(mensaje);

    }

    public static String leerTexto(String mensaje) {

        imprimir(mensaje);
        String txt = scanner.nextLine();
        return txt;

    }

    public static int leerEntero(String mensaje) {

        imprimir(mensaje);
        int ent = Integer.parseInt(scanner.nextLine());
        return ent;

    }


    
}
