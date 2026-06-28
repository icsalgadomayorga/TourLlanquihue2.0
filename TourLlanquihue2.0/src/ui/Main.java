package ui;

import data.GestorServicios;

/**
 * Clase principal del programa.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("      TOUR LLANQUIHUE");
        System.out.println("Sistema de Servicios Turísticos");
        System.out.println("==================================\n");

        GestorServicios gestor = new GestorServicios();

        gestor.mostrarServicios();

        System.out.println("\n==================================");
        System.out.println("Fin del programa.");
        System.out.println("==================================");
    }
}
