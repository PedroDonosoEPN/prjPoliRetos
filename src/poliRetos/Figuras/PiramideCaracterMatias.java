package poliRetos.Figuras;
import java.util.Scanner;

public class PiramideCaracterMatias {
    public void generarPiramide() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de terminos a generar: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
