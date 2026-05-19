package Recursion;

public class RecursionMatias {

    public void conteoRegresivoFor(int numero) {
        /*
         * Reto: Realiza un conteo regresivo desde un número dado hasta cero utilizando recursión.
         * @param numero El número desde el cual iniciar el conteo regresivo.
        */

        if (numero < 0) {
            return; 
        }
        System.out.print(numero + " ");

        for (int i = 0; i < 1; i++) {
            conteoRegresivoFor(numero - 1);
        }
        System.out.println("");
    }  

    public void conteoRegresivoWhile(int numero) {
        while (numero >= 0) {
            System.out.print(numero + " ");
            conteoRegresivoWhile(numero - 1);
            return;
        }
        System.out.println("");
    }

    public void conteoRegresivoDoWhile(int numero) {
        if (numero < 0) {
            return;
        }

        do {
            System.out.print(numero + " ");
            conteoRegresivoDoWhile(numero - 1);
        } while (false);
        System.out.println("");
    }      
}
