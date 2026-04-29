package poliRetos.SerieCaracteres;
import java.util.Scanner;

public class SerieAlfabeticaMatias  {
    
    public void generarAlfabeto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de terminos a generar: ");
        int num = sc.nextInt();
        
        System.out.println("Serie alfabetica: ");
        
        for (int i = 0; i < num; i++) {
            char letra = (char) ('a' + i);
            System.out.print(letra + " ");
        }
    }
}