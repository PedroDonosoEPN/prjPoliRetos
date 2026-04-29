import java.util.Scanner;

public class SerieCaracteresEidan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        // Validación de entrada
        do {
            System.out.print("Ingrese un número (1 a 27): ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: debe ingresar un número entero.");
                sc.next();
            }
            n = sc.nextInt();

            if (n < 1 || n > 27) {
                System.out.println("Error: el número debe estar entre 1 y 27.");
            }
        } while (n < 1 || n > 27);

        // Generación de la serie
        char letra = 'a';
        int cantidad = 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < cantidad; j++) {
                System.out.print(letra);
            }
            System.out.print(" ");

            letra++;        // siguiente letra
            cantidad += 2;  // aumenta en 2 la cantidad
        }

        sc.close();
    }
}