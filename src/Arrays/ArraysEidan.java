package Arrays;
import java.util.Scanner;

public class ArraysEidan {
   // A02) crear una matriz solicitando el tamaño y caracter para almacenar la matriz
   // Ejemplo: Mi nombre es Eidan Clavijo => EC
   // Ingrese el tamaño: 5 Ingrese caracter : *
   // * * * * *   * * * * *
   // *           *
   // * * * * *   *
   // *           *
   // * * * * *   * * * * *
    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño: ");
        int n = sc.nextInt();

        System.out.print("Ingrese caracter: ");
        char c = sc.next().charAt(0);

        System.out.println();

        // Iniciales ejemplo: EC
        for (int i = 0; i < n; i++) {

            // LETRA E
            for (int j = 0; j < n; j++) {

                if (i == 0 || i == n / 2 || i == n - 1 || j == 0) {
                    System.out.print(c + " ");
                } else {
                    System.out.print("  ");
                }
            }

            // 2 espacios entre letras
            System.out.print("  ");

            // LETRA C
            for (int j = 0; j < n; j++) {

                if (i == 0 || i == n - 1 || j == 0) {
                    System.out.print(c + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
