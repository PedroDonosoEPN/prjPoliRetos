package CadenaCaracteres;

import java.util.Scanner;

public class CadenaCaracteresEidan {

    Scanner sc = new Scanner(System.in);
  //C07) Pedir una frase y presentarla en mayusculas y sin la J
 //Ejemplo, frase: mujeres
 //salida: MUERES 

    // Método con FOR
    public void fraseFor() {

        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        String nueva = "";

        for (int i = 0; i < frase.length(); i++) {

            char letra = Character.toUpperCase(frase.charAt(i));

            if (letra != 'J') {
                nueva += letra;
            }
        }

        System.out.println("Salida: " + nueva);
    }

    // Método con WHILE
    public void fraseWhile() {

        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        String nueva = "";
        int i = 0;

        while (i < frase.length()) {

            char letra = Character.toUpperCase(frase.charAt(i));

            if (letra != 'J') {
                nueva += letra;
            }

            i++;
        }

        System.out.println("Salida: " + nueva);
    }

    // Método con DO WHILE
    public void fraseDoWhile() {

        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        String nueva = "";
        int i = 0;

        if (frase.length() > 0) {

            do {

                char letra = Character.toUpperCase(frase.charAt(i));

                if (letra != 'J') {
                    nueva += letra;
                }

                i++;

            } while (i < frase.length());
        }

        System.out.println("Salida: " + nueva);
    }
}