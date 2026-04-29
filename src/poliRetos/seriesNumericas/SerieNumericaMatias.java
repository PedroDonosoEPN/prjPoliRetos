package poliRetos.seriesNumericas;
import java.util.Scanner;

public class SerieNumericaMatias {
   
    public void generarSerie(int nTerminos) {;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de terminos a generar: ");
        int num = sc.nextInt();
        
        System.out.println("Serie numerica: ");
        
        for (int i = 1; i <= num; i++) {
            System.out.print(i * i + " ");
        }
    System.out.println();
    }
} 
