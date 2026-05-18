package Recursion;

public class RecursionMatias {

    public void conteoRegresivoFor(int numero) {
        /*
         * Reto: Realiza un conteo regresivo desde un número dado hasta cero utilizando recursión.
         * @param numero El número desde el cual iniciar el conteo regresivo.
        */

        for (int i = numero; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }   

    public void conteoRegresivoWhile(int numero) {
        int i = numero;
        while (i >= 0) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();
    }

    public void conteoRegresivoDoWhile(int numero) {
        int i = numero;
        do {
            System.out.print(i + " ");
            i--;
        } while (i >= 0);
        System.out.println();
    }
}

