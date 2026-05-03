package poliRetos.controladorGlobal;

import java.util.Scanner;
import poliRetos.Arrays.*;
import poliRetos.CadenaCaracteres.*;
import poliRetos.Figuras.*;
import poliRetos.Loading.*;
import poliRetos.Recursion.*;
import poliRetos.SerieCaracteres.*;
import poliRetos.seriesNumericas.*;

public class controlador {  
    private Scanner sc = new Scanner(System.in);

    public void iniciarProyecto() {
        int opcion = -1;
        do {
            System.out.println("\n****************************************");
            System.out.println("*         POLIRETO - GRUPO #2          *");
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
                    case 4: menuCadenaCaracteres(); break;
                    case 5: menuArrays(); break;
                    case 6: menuRecursion(); break;
                    case 7: menuLoading(); break;
                    case 8: menuGrafos(); break;
                    case 0: System.out.println("Finalizando programa..."); break;
                    default: System.out.println("Opción no válida.");
                }
            } catch (Exception e) {
                System.out.println("Error: Ingrese solo números.");
            }
        } while (opcion != 0);
    }

    private void pausar() {
        System.out.println("\nPresione ENTER para continuar...");
        sc.nextLine();
    }

    private void menuSeriesNumericas() {
        System.out.println("\n--- [ SERIES NUMÉRICAS ] ---");
        System.out.println("1. Reto S3 (Fibonacci/Impares)");
        System.out.println("2. Reto S8 (3, 8, 13, ...)");
        System.out.print("Seleccione el reto: ");
        int opcion = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese el número de términos (n): ");
        int nTerminos = Integer.parseInt(sc.nextLine());

        SerieNumericaPedro seriePedro = new SerieNumericaPedro();

        switch (opcion) {
            case 1: seriePedro.generarSerieNum(nTerminos); break;
            default: System.out.println("Opción no válida."); break;
            case 2: new SerieNumericaMateo().generarSerie(nTerminos); break;
        }
        pausar();
    }

    private void menuSeriesCaracteres() {
        System.out.println("\n--- [ SERIES DE CARACTERES ] ---");
        System.out.println("1. Serie '+' (Números Primos)");
        System.out.println("0. Regresar");
        System.out.print("Seleccione una opción: ");
        int opcionSeleccionada = Integer.parseInt(sc.nextLine());

        if (opcionSeleccionada != 0) {
            System.out.print("Ingrese la cantidad de términos a generar: ");
            int cantidadTerminos = Integer.parseInt(sc.nextLine());

            switch (opcionSeleccionada) {
                case 1:
                    new serieCaracteresPedro().generarSeriePrimos(cantidadTerminos);
                    break;
                default:
                    System.out.println("Error: Opción no válida.");
                    break;
            }
            pausar();
        }
    }

    private void menuFiguras() {
        FigurasPedro gestionFiguras = new FigurasPedro();
        System.out.println("\n--- [ FIGURAS ] ---");
        System.out.println("1. Figura F3 (Triángulo de asteriscos)");
        System.out.println("0. Regresar");
        System.out.print("Seleccione una opción: ");
        
        int opcionSeleccionada = Integer.parseInt(sc.nextLine());

        if (opcionSeleccionada != 0) {
            System.out.print("Ingrese la cantidad de niveles: ");
            int nivelesFigura = Integer.parseInt(sc.nextLine());

            switch (opcionSeleccionada) {
                case 1:
                    gestionFiguras.generarFiguraF3(nivelesFigura);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            pausar();
        }
    }

    private void menuCadenaCaracteres() {
        CadenaCaracteresPedro gestionCadenas = new CadenaCaracteresPedro();
        System.out.println("\n--- [ CADENA DE CARACTERES ] ---");
        System.out.println("1. Eliminar una vocal de una frase");
        System.out.println("0. Regresar");
        System.out.print("Seleccione una opción: ");
        
        int opcionSeleccionada = Integer.parseInt(sc.nextLine());

        if (opcionSeleccionada != 0) {
            switch (opcionSeleccionada) {
                case 1:
                    System.out.print("Ingrese la frase: ");
                    String fraseUsuario = sc.nextLine(); 
                    System.out.print("Ingrese la vocal a eliminar: ");
                    String vocalAEliminar = sc.nextLine();
                    gestionCadenas.eliminarVocal(fraseUsuario, vocalAEliminar);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            pausar();
        }
    }

    private void menuArrays() {
        ArraysPedro gestionArrays = new ArraysPedro();
        System.out.println("\n--- [ ARRAYS / GRÁFICAS ] ---");
        System.out.println("1. Graficar f(x) = 2x con nombre");
        System.out.println("0. Regresar");
        System.out.print("Seleccione una opción: ");

        int opcionSeleccionada = Integer.parseInt(sc.nextLine()); 

        if (opcionSeleccionada != 0) {
            switch (opcionSeleccionada) {
                case 1:
                    System.out.print("Ingrese el nombre para graficar: ");
                    String nombreUsuario = sc.nextLine();
                    gestionArrays.graficarFuncionNombre(nombreUsuario);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            pausar();
        }
    }

    private void menuRecursion() {
        RecursionPedro gestionRecursion = new RecursionPedro();
        System.out.println("\n--- [ RECURSIÓN ] ---");
        System.out.println("1. Multiplicación recursiva (a * b)");
        System.out.println("0. Regresar");
        System.out.print("Seleccione una opción: ");

        int opcionSeleccionada = Integer.parseInt(sc.nextLine());

        if (opcionSeleccionada != 0) {
            switch (opcionSeleccionada) {
                case 1:
                    System.out.print("Ingrese el multiplicando (a): ");
                    int a = Integer.parseInt(sc.nextLine());
                    System.out.print("Ingrese el multiplicador (b): ");
                    int b = Integer.parseInt(sc.nextLine());
                    int resultado = gestionRecursion.obtenerMultiplicacion(a, b);
                    System.out.println("El resultado de " + a + " * " + b + " es: " + resultado);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            pausar();
        }
    }

    private void menuLoading() {
        LoadingPedro gestionLoading = new LoadingPedro();
        System.out.println("\n--- [ LOADING ] ---");
        System.out.println("1. Barra de desplazamiento (L03)");
        System.out.println("0. Regresar");
        System.out.print("Seleccione una opción: ");

        int opcionSeleccionada = Integer.parseInt(sc.nextLine());

        if (opcionSeleccionada != 0) {
            switch (opcionSeleccionada) {
                case 1:
                    System.out.print("Ingrese el carácter para la barra: ");
                    String entrada = sc.nextLine();
                    char caracterCarga = (entrada.length() > 0) ? entrada.charAt(0) : '-';
                    gestionLoading.barraDesplazamiento(caracterCarga);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            pausar();
        }
    }

    private void menuGrafos() {
        System.out.println("\n--- [ GRAFOS Y AUTÓMATAS ] ---");
    }
}