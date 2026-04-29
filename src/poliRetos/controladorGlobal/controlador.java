package poliRetos.controladorGlobal;

import java.util.Scanner;
// Importamos las clases de tus carpetas de lógica
import  poliRetos.seriesNumericas.*;
import poliRetos.Figuras.*;
import poliRetos.Arrays.*;
import poliRetos.Recursion.*;
import poliRetos.SerieCaracteres.*;
import poliRetos.Loading.*;
import poliRetos.seriesCaracteres.*;
import poliRetos.GrafosYAutomatas.*;

public class controlador {  
    private Scanner sc = new Scanner(System.in);

    public void iniciarProyecto() {
        int opcion = -1;
        do {
            System.out.println("\n****************************************");
            System.out.println("* POLIRETO - GRUPO #2         *");
            System.out.println("****************************************");
            System.out.println("1.  Series Numéricas");
            System.out.println("2.  Series de Caracteres");
            System.out.println("3.  Figuras");
            System.out.println("4.  Cadena de Caracteres");
            System.out.println("5.  Arrays");
            System.out.println("6.  Recursión");
            System.out.println("7.  Loading");
            System.out.println("8.  Grafos y Autómatas");
            System.out.println("0.  Salir");
            System.out.print("Seleccione una categoría: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1: menuSeriesNumericas(); break;
                    case 2: menuSeriesCaracteres(); break;
                    case 3: menuFiguras(); break;
                    case 4: menuCadenas(); break;
                    case 5: menuArrays(); break;
                    case 6: menuRecursion(); break;
                    case 7: menuLoading(); break;
                    case 8: menuGrafos(); break;
                    case 0: System.out.println("Finalizando programa..."); break;
                    default: System.out.println("Opción no válida, intente de nuevo.");
                }
            } catch (Exception e) {
                System.out.println("Error: Por favor, ingrese solo números.");
            }
        } while (opcion != 0);
    }

    // --- MÉTODOS DE SOPORTE (SUBMENÚS) ---

    private void menuSeriesNumericas() {
        System.out.println("\n--- [ SERIES NUMÉRICAS ] ---");
        System.out.println("1. Reto S3 (Fibonacci/Impares)");
        System.out.print("Seleccione el reto: ");
        int opcion= Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese el número de términos (n): ");
        int nTerminos= Integer.parseInt(sc.nextLine());

        SerieNumericaPedro seriePedro = new SerieNumericaPedro();

        switch (opcion) {
            case  1:
                    seriePedro.generarSerieNum(nTerminos); 
                break;
            default:
                throw new AssertionError();
        }
        
    }

    private void menuSeriesCaracteres() {
        System.out.println("\n--- [ SERIES DE CARACTERES ] ---");
        // Aquí llamarás a tus métodos de seriesDeCaracteres
    }

    private void menuFiguras() {
        System.out.println("\n--- [ FIGURAS ] ---");
        // Aquí llamarás a tus métodos de Figuras
    }

    private void menuCadenas() {
        System.out.println("\n--- [ CADENA DE CARACTERES ] ---");
    }

    private void menuArrays() {
        System.out.println("\n--- [ ARRAYS ] ---");
    }

    private void menuRecursion() {
        System.out.println("\n--- [ RECURSIÓN ] ---");
    }

    private void menuLoading() {
        System.out.println("\n--- [ LOADING ] ---");
    }

    private void menuGrafos() {
        System.out.println("\n--- [ GRAFOS Y AUTÓMATAS ] ---");
    }
}