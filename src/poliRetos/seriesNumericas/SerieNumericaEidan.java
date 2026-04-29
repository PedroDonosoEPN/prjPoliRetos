import java.util.Scanner;

public class SerieNumericaEidan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        // Validación de entrada
        while (true) {
            System.out.print("Ingrese la cantidad de numeros (1 a 100): ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n >= 1 && n <= 100) {
                    break;
                } else {
                    System.out.println("Error: el numero debe estar entre 1 y 100.");
                }
            } else {
                System.out.println("Error: debe ingresar un numero entero.");
                sc.next(); // limpiar entrada inválida
            }
        }

        // Generación de la serie
        int valor = 1;
        System.out.println("Serie:");
        for (int i = 0; i < n; i++) {
            System.out.print(valor);
            if (i < n - 1) System.out.print(", ");
            valor += 3;
        }

        sc.close();
    }
}