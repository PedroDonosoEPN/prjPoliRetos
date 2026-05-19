package GrafosYAutomatas;

import java.util.Scanner;

public class GrafosYAutomatasPedro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Validador de Autómatas (a+ / b+ / c+) ---");
        System.out.print("Ingrese la cadena a evaluar: ");
        String cadena = scanner.nextLine();
        
        if (validarAutomata(cadena)) {
            System.out.println("Resultado: CADENA ACEPTADA");
        } else {
            System.out.println("Resultado: CADENA RECHAZADA");
        }
        
       /*  scanner.close(); */
    }

    public static boolean validarAutomata(String cadena) {
        // Si la cadena está vacía, no cumple con el '+' (al menos uno)
        if (cadena == null || cadena.isEmpty()) {
            return false;
        }

        String estado = "q0";

        for (int i = 0; i < cadena.length(); i++) {
            char caracterActual = cadena.charAt(i);

            switch (estado) {
                case "q0":
                    if (caracterActual == 'a') {
                        estado = "q1";
                    } else if (caracterActual == 'b') {
                        estado = "q2";
                    } else if (caracterActual == 'c') {
                        estado = "q3";
                    } else {
                        estado = "qe";
                    }
                    break;

                case "q1":
                    if (caracterActual != 'a') {
                        estado = "qe";
                    }
                    break;

                case "q2":
                    if (caracterActual != 'b') {
                        estado = "qe";
                    }
                    break;

                case "q3":
                    if (caracterActual != 'c') {
                        estado = "qe";
                    }
                    break;

                case "qe":
                    // Estado de error: se mantiene aquí sin importar qué llegue
                    estado = "qe";
                    break;
            }
            
            // Optimización: si ya estamos en error, no hace falta seguir leyendo
            if (estado.equals("qe")) {
                break;
            }
        }

        // Retorna verdadero si el estado final es uno de los de aceptación
        return estado.equals("q1") || estado.equals("q2") || estado.equals("q3");
    }
}
