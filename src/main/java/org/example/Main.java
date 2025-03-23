package org.example;

import org.example.ejercicio2.ValidadorParentesis;
import org.example.ejercicio3.BuscadorBinario;
import org.example.ejercio1.GestorDeTurnos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorDeTurnos gestor = new GestorDeTurnos();
        ValidadorParentesis validador = new ValidadorParentesis();
        BuscadorBinario buscador = new BuscadorBinario();

        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Sistema de turnos (cola)");
            System.out.println("2. Validación de paréntesis (pila)");
            System.out.println("3. Búsqueda binaria");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    menuTurnos(gestor, scanner);
                    break;
                case 2:
                    System.out.print("Ingresa una cadena de paréntesis: ");
                    String cadena = scanner.nextLine();
                    boolean balanceado = validador.estaBalanceado(cadena);
                    System.out.println("¿Está balanceado? -> " + balanceado);
                    break;
                case 3:
                    int[] lista = {1, 3, 5, 7, 9, 11, 15};
                    System.out.print("Ingresa un número a buscar: ");
                    int objetivo = scanner.nextInt();
                    int resultado = buscador.buscar(lista, objetivo);
                    System.out.println("Resultado de la búsqueda: " + resultado);
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    public static void menuTurnos(GestorDeTurnos gestor, Scanner scanner) {
        int opcion;
        do {
            System.out.println("\n--- GESTIÓN DE TURNOS ---");
            System.out.println("1. Agregar turno");
            System.out.println("2. Atender turno");
            System.out.println("3. Mostrar turnos en espera");
            System.out.println("0. Volver al menú principal");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    gestor.agregarTurno();
                    break;
                case 2:
                    gestor.atenderTurno();
                    break;
                case 3:
                    gestor.mostrarTurnosEnEspera();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}
