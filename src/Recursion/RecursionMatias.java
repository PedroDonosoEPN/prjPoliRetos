package Recursion;

public class RecursionMatias {
    
    public void conteoRegresivo(int numero) {
        /*
         * Reto: Realiza un conteo regresivo desde un número dado hasta cero utilizando recursión.
         * @param numero El número desde el cual iniciar el conteo regresivo.
        */
        if (numero < 0) {
            System.out.println("Número negativo no permitido.");
            return;
        }
        if (numero == 0) {
            System.out.println("¡Llegaste a cero!");
            return;
        }
        System.out.println(numero + "...");
        conteoRegresivo(numero - 1);
    }
}

